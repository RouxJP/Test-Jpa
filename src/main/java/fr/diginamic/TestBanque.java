package fr.diginamic;


import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import fr.diginamic.banque.Adresse;
import fr.diginamic.banque.Banque;
import fr.diginamic.banque.Client;
import fr.diginamic.banque.Compte;
import fr.diginamic.banque.Operation;




public class TestBanque {

	public static void main(String[] args) {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("banque");
		EntityManager		 em = emf.createEntityManager();
		EntityTransaction	 et = em.getTransaction();
		
		
		et.begin();
		
		// Creer des banques
		Banque banque1  = new Banque( 1, "Banque-Route");
		Banque banque2  = new Banque( 2, "Banque-Cac40");
		Banque banque3  = new Banque( 3, "Banque-Europe");
		em.persist(banque1);
		em.persist(banque2);
		em.persist(banque3);
		
		// Créer des Adresse, Compte, Client
		Adresse adresse1  = new Adresse( 61, "rue Vatel", 34070, "Montpellier");
		Adresse adresse2  = new Adresse( 62, "rue Vatel", 34070, "Montpellier");
		Adresse adresse3  = new Adresse( 63, "rue Vatel", 34070, "Montpellier");
		
        Compte compte1 = new Compte( "123456789A", 1000.0D) ;
        Compte compte2 = new Compte( "123456789B", 2000.0D) ;
        Compte compte3 = new Compte( "123456789C", 3000.0D) ;
		
        Client client1 = new Client( 1, "Dupont", "Jean", LocalDate.parse( "1978-12-14"), 
        								banque1, adresse1, compte1);
        Client client2 = new Client( 2, "Durant", "Paul", LocalDate.parse( "1979-12-14"), 
        								banque2, adresse2, compte2);
        Client client3 = new Client( 3, "Dark", "Vador",  LocalDate.parse( "1980-12-14"), 
        								banque3, adresse3, compte3);	
        
        em.persist( client1);
        em.persist( client2);
        em.persist( client3);
        
		// Créer des Comptes
        em.persist( compte1);
        em.persist( compte2);
        em.persist( compte3);
        
        // Créer des opérations
        Operation operation1 = new Operation( 1, LocalDate.parse( "2019-12-12"), 100.0D, "Débit", compte1 );
        Operation operation2 = new Operation( 2, LocalDate.parse( "2019-12-13"), 200.0D, "Crébit", compte1  );
        Operation operation3 = new Operation( 3, LocalDate.parse( "2019-12-14"), 300.0D, "Débit", compte1  );
        em.persist(  operation1);
        em.persist(  operation2);
        em.persist(  operation3);
        
		et.commit();
		

	}

}
