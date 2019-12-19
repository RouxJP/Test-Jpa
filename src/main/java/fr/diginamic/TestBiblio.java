package fr.diginamic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import fr.diginamic.entities.Clients;
import fr.diginamic.entities.Emprunt;
import fr.diginamic.entities.Livre;

public class TestBiblio {
	public static void main(String[] args) {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("bibliotheque");
		EntityManager		 em = emf.createEntityManager();
		
/**		
		// Visualiser un livre
		Livre livre = em.find( Livre.class, 1);
		System.out.println( livre.getId() + " " + livre.getTitre() + " " + livre.getAuteur());
		
		String sqlReq = "select f from Livre f where titre = 'Germinal' ";
		TypedQuery<Livre> query1 = em.createQuery( sqlReq, Livre.class);
		ArrayList<Livre> lstLivre1 = (ArrayList<Livre>) query1.getResultList( );
		for( Livre livres : lstLivre1) {
			System.out.println( livres.getId() + " " + livres.getTitre() + " " + livres.getAuteur());
		}

		// Visualiser tous les livres
		TypedQuery<Livre> query2 = em.createQuery("select f from Livre f ", Livre.class);
		ArrayList<Livre> lstLivre2 = (ArrayList<Livre>) query2.getResultList( );
		for( Livre livres : lstLivre2) {
			System.out.println( livres.getId() + " " + livres.getTitre() + " " + livres.getAuteur());
			for( Emprunt emprunt : livres.getLstEmprunts()) {
				System.out.println(" - " + emprunt.getId());
			}
		}
**/		
		
	
		// Visualiser tous livres pour pour un emprunt donné
		TypedQuery<Emprunt> query3 = em.createQuery("select e from Emprunt e where id = 1", Emprunt.class);
		Emprunt emprunt = query3.getResultList( ).get(0);
		System.out.println( "La liste de tous les livres associé à l'emprunt " + emprunt.getId() );
		for( Livre livres : emprunt.getLstLivres()) {
			System.out.println(" - " + livres.getTitre());
		}
		
		// Visualiser tous les emprunts pour unb client donné
		TypedQuery<Clients> query4 = em.createQuery("select c from Clients c where id = 1 ", Clients.class);
		Clients client = query4.getResultList( ).get(0);
		System.out.println( "Les emprunts du client " + client.getNom() + " sont : " );
		for( Emprunt emprunts : client.getLstEmprunts()) {
			System.out.println( " - " + emprunts.getId() );
		}	

		em.close();
	}
		
	
}
