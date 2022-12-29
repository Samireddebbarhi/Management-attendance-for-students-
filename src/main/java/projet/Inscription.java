package projet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import crud.Dao1;
import crud.Resp_u;
import crud.User;
import crud.Admin_user;
 



public class Inscription extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	Dao1 udao;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Inscription() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		udao=new Dao1();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String act = request.getParameter("act");
			if(act.equals("connect"))
			{ 
				String failed= "";
				String log=request.getParameter("log");
				String pass=request.getParameter("pass");
				Admin_user u = udao.authentification(log, pass);
				HttpSession ss =request.getSession();
				
				if(u!=null)
				{
					failed="false";
					
					ss.setAttribute("u", u.getNom());
					ss.setAttribute("m",u.getPrenom());
					response.sendRedirect("index.jsp");
				}else
				{
					//boolean error=true;
				    failed="true";
				  ss.setAttribute("failed", failed);
					response.sendRedirect("login.jsp");

				}}
				else if(act.equals("inscrire"))
				{
		 
			String nom=request.getParameter("nom");
			int id =Integer.parseInt(request.getParameter("id"));
			String prenom=request.getParameter("pren");
			String log=request.getParameter("log");
			String pass=request.getParameter("pass");
			int nb = udao.inscription(id,nom,prenom, log, pass);
			
			if(nb==1)
			{
				HttpSession ses = request.getSession();
				ses.setAttribute("u", nom);
				ses.setAttribute("A", prenom);
				response.sendRedirect("login.jsp");
			 
				
			}
		
	
	}
				else if (act.equals("Add")){
					String msg="";
					int apoge=Integer.parseInt(request.getParameter("id"));
					String cne=request.getParameter("cne");
					String nom=request.getParameter("lname");
					String prenom=request.getParameter("fname");
					String date=request.getParameter("ddn");
					String filiere=request.getParameter("fil");
					String parcour=request.getParameter("Parc");
					String semest=request.getParameter("semest");
					int nb=udao.ajout_etud(apoge,cne, nom, prenom, date,filiere,parcour,semest);
					HttpSession ss =request.getSession();
					if (nb==1)
					{
						msg="actif";
						
						ss.setAttribute("l", nom);
						ss.setAttribute("f",prenom);
						ss.setAttribute("m", msg);
						response.sendRedirect("addStudent.jsp");
						
					}
					else {
						msg="inactif";
						ss.setAttribute("m", msg);
						response.sendRedirect("add.jsp");
					}
				}
				else if(act.equals("del")) {
					
					int id=Integer.parseInt(request.getParameter("id"));
					int nb=udao.delete_etud(id);
					
					if (nb==1)
					{   
					
						response.sendRedirect("addStudent.jsp");
					}
				

}
				else if(act.equals("update"))
				{
					User e=new User();
					
					int apoge=Integer.parseInt(request.getParameter("id"));
					e.setId(apoge);
					String cne=request.getParameter("cne");
                    e.setCNE(cne);
					String nom=request.getParameter("lname");
					e.setNom(nom);
					String prenom=request.getParameter("fname");
					e.setPrenom(prenom);
					String date=request.getParameter("ddn");
					e.setDateDeNaissaance(date);
					String filiere=request.getParameter("fil");
					e.setFiliere(filiere);
					String parcour=request.getParameter("Parc");
					e.setParcours(parcour);
					String semest=request.getParameter("semest");
					e.setSemestre(semest);
					
	                try {
						udao.modifier_etud(e);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}			
					response.sendRedirect("addStudent.jsp");	
					
				}	
				else if(act.equals("search"))
				{
					int id=Integer.parseInt(request.getParameter("id_search"));
					HttpSession o=request.getSession();
					o.setAttribute("y", id);
					response.sendRedirect("search.jsp");
					}
				
				else if (act.equals("valider")){
					String msg="";
					
					String cni=request.getParameter("cni");
					String nom=request.getParameter("lname");
					String prenom=request.getParameter("fname");
			
					String email=request.getParameter("log");
					String pass=request.getParameter("pass");
					int nb=udao.ajout_Resp(cni, nom, prenom, email,pass);
					HttpSession ss =request.getSession();
					if (nb==1)
					{
						msg="actif";
						
						ss.setAttribute("l", nom);
						ss.setAttribute("f",prenom);
						ss.setAttribute("m", msg);
						response.sendRedirect("Acceuil_resp.jsp");
						
					}
					else {
						msg="inactif";
						ss.setAttribute("m", msg);
						response.sendRedirect("ajout_resp.jsp");
					}
				}
				else if(act.equals("supprimer")) {
					
					String cni=request.getParameter("cni");
					int nb=udao.delete_Resp(cni);
					
					if (nb==1)
					{   
					
						response.sendRedirect("Acceuil_resp.jsp");
					}
				

		}
				else if(act.equals("modifier"))
				{
					Resp_u e=new Resp_u();
					
					String cni=request.getParameter("id");
					e.setCni(cni);
					String nom=request.getParameter("lname");
					e.setNom(nom);
					String prenom=request.getParameter("fname");
					e.setPrenom(prenom);
					String email=request.getParameter("log");
					e.setLogin(email);
					String pass=request.getParameter("pass");
					e.setPassword(pass);
					
		            try {
						udao.modifier_Resp(e);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}			
					response.sendRedirect("Acceuil_resp.jsp");	
					
				}	
				else if(act.equals("Rechercher"))
				{
					String cni=request.getParameter("cni_search");
					HttpSession o=request.getSession();
					o.setAttribute("y", cni);
					response.sendRedirect("rechercher_resp.jsp");
					}
				


			
	
	
	
	
	
	
	
	}
	}

