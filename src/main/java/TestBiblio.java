import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import fr.diginamic.entities.Livre;

public class TestBiblio {
	public static void main(String[] args) {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("bibliotheque");
		EntityManager		 em = emf.createEntityManager();
		EntityTransaction	 et = em.getTransaction();
		
		
		et.begin();
		
		// Créer un livre
		
		et.commit();
		
		// Visualiser un livre
		Livre livre = em.find( Livre.class, 1);
		System.out.println( livre.getId() + " " + livre.getTitre() + " " + livre.getAuteur());
		
		// Visualiser les livres
		TypedQuery<Livre> query = em.createQuery("select f from Livre f ", Livre.class);
		ArrayList<Livre> lstFou = (ArrayList<Livre>) query.getResultList( );
		for( Livre livres : lstFou) {
			System.out.println( livres.getId() + " " + livres.getTitre() + " " + livres.getAuteur());
		}
		
		em.close();
	}
		
	
}
