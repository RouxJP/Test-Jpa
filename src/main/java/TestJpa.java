import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import fr.diginamic.entities.Fournisseur;

public class TestJpa {

	public static void main(String[] args) {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("pu_essai");
		EntityManager		 em = emf.createEntityManager();
		EntityTransaction	 et = em.getTransaction();
		
		
		et.begin();
		
		// Créer un nouveau fournisseur
		Fournisseur fou  = new Fournisseur();
		fou.setId_fournisseur( 5);
		fou.setNom( "FourJpa5");
		em.persist(fou);
		
		et.commit();
		
		// Visualiser les fournisseurs
		TypedQuery<Fournisseur> query = em.createQuery("select f from Fournisseur f ", Fournisseur.class);
		ArrayList<Fournisseur> lstFou = (ArrayList<Fournisseur>) query.getResultList( );
		for( Fournisseur fournisseur : lstFou) {
			System.out.println( fournisseur.getId_fournisseur() + " " + fournisseur.getNom());
		}
		
		em.close();
		
		
		
		em.close();
		
	}

}
