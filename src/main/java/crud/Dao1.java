package crud;
import java.sql.*;
import java.util.*;
import dbinteraction.Db_inter;

public class Dao1 {

	public int inscription(int id,String nom,String prenom, String log, String pass)
	{
		Db_inter.connect();
		String sql="insert into adminis values("+id+",'"+nom+"','"+prenom+"','"+log+"','"+pass+"')";
		int nb = Db_inter.Maj(sql);
		Db_inter.disconnect();
		return nb;
	}
	
	public Admin_user authentification(String log, String pass)
	{
		Admin_user u=null;
		Db_inter.connect();
		String sql="select * from  adminis where log='"+log+"' and pass='"+pass+"'";
		ResultSet rs = Db_inter.select(sql);
		try {
			if(rs.next())
			{
				u=new Admin_user(rs.getString("nom"),rs.getString("prenom"),rs.getString("log"), rs.getString("pass"));
				u.setId(rs.getInt("id"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Db_inter.disconnect();
		return u;
	}
	public int ajout_etud(int id,String cne,String nom,String prenom,String date,String filiere,String parcours,String semestre) {
		Db_inter.connect();
		int nb=0; String sql="insert into student values ("+id+",'"+cne+"','"+nom+"','"+prenom+"','"+date+"','"+filiere+"','"+parcours+"','"+semestre+"')"; 
		nb =Db_inter.Maj(sql);
		return nb;
	}
	public int ajout_etud(User e)
	{
		Db_inter.connect();
		String sql="insert into student values ("+e.getId()+",'"+e.getCNE()+"','"+e.getNom() +"','"+e.getPrenom()+"','"+e.getDateDeNaissaance()+"','"+e.getFiliere()+"','"+e.getParcours()+"','"+e.getSemestre()+"',)";
		int nb=Db_inter.Maj(sql);
		return nb;
		
	}
	public List <User> afficher_all_etud(){
		List <User> list=new ArrayList<User>();
		Db_inter.connect();
		String sql ="select * from student ";
		ResultSet rs=Db_inter.select(sql);
		try {
			while(rs.next()) {
				User e=new User(rs.getInt(1),rs.getString("cne"),rs.getString("nom"),rs.getString("prenom"),rs.getString("DateDeNaissance"),rs.getString("filiere"),rs.getString("parcours"),rs.getString("semestre"));
			
			list.add(e);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return list;	
	}

public User findById(int id) {
Db_inter.connect();
User c=null;
String sql="select * from student where id="+id;
ResultSet rs=Db_inter.select(sql);
try {
	while (rs.next()) {
		
		c=new User(rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
		c.setId(id);
	}
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
return c;
}
public int delete_etud(int id)
{
	Db_inter.connect();
	int nb=0;
	String sql="delete from student where id="+id;
	nb=Db_inter.Maj(sql);
	return nb;

}
public void modifier_etud(User e) throws SQLException
{
	
    PreparedStatement ps = null;
try {
        Db_inter.connect();
        ps = Db_inter.con.prepareStatement("UPDATE student SET cne=?,nom =?, prenom =?, DateDeNaissaance=?,Filiere=?,Parcours=?,semestre=? WHERE id =?");        		
        ps.setInt(1, e.getId());
        ps.setString(2, e.getCNE());
        ps.setString(3, e.getNom());
        ps.setString(4, e.getPrenom());
        ps.setString(5, e.getDateDeNaissaance());
        ps.setString(6, e.getFiliere());
        ps.setString(7, e.getParcours());
        ps.setString(8, e.getSemestre());
		

        ps.executeUpdate();
}catch (SQLException a) {a.printStackTrace();
	
}
	Db_inter.disconnect();


	
	

}
public int ajout_Resp(String cni,String nom,String prenom,String email,String pass)
{
	Db_inter.connect();
	int nb=0;
	String Sql="insert into RespTab values('"+cni+"','"+nom+"','"+prenom+"','"+email+"','"+pass+"')";
	nb=Db_inter.Maj(Sql);
	Db_inter.disconnect();
	return nb;
}

int ajout_Resp(Resp_u r)
{
	
	Db_inter.connect();
	int nb=0;
	String Sql="insert into RespTab values('"+r.getCni()+"','"+r.getNom()+"','"+r.getPrenom()+"','"+r.getLogin()+"','"+r.getPassword()+"')";
	nb=Db_inter.Maj(Sql);
	Db_inter.disconnect();
	return nb;
}
public List <Resp_u> afficher_all_resp(){
	List <Resp_u> list=new ArrayList<Resp_u>();
	Db_inter.connect();
	String sql ="select * from RespTab ";
	ResultSet rs=Db_inter.select(sql);
	try {
		while(rs.next()) {
			Resp_u e=new Resp_u(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
		
		list.add(e);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
return list;


}
public Resp_u findByCNI(String cni) {
	Db_inter.connect();
	 Resp_u c=null;
	String sql="select * from RespTab where cni='"+cni+"'";
	ResultSet rs=Db_inter.select(sql);
	try {
		while (rs.next()) {
			
			c=new Resp_u(rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5) );
			c.setCni(cni);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return c;
	}
	public int delete_Resp(String cni)
	{
		Db_inter.connect();
		int nb=0;
		String sql="delete from RespTab where cni='"+cni+"'";
		nb=Db_inter.Maj(sql);
		return nb;

	}
	public void modifier_Resp(Resp_u e) throws SQLException
	{
		
	    PreparedStatement ps = null;
	try {
	        Db_inter.connect();
	        ps = Db_inter.con.prepareStatement("UPDATE RespTab SET nom =?, prenom =?, email =? ,password =? WHERE id =?");        		
	        ps.setString(1, e.getCni());
	        ps.setString(2, e.getNom());
	        ps.setString(3, e.getPrenom());
	        ps.setString(4, e.getLogin());
	        ps.setString(4, e.getPassword());

	        ps.executeUpdate();
	}catch (SQLException a) {a.printStackTrace();
		
	}
		Db_inter.disconnect();



	}











}

