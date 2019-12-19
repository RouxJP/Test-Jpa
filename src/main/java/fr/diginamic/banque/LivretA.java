package fr.diginamic.banque;


import javax.persistence.Entity;


import javax.persistence.Table;

@Entity
@Table(name="LIVRET_A")
public class LivretA extends Compte{
	private double taux;

	public LivretA() {
		
	}
	
	public LivretA( String numCompte, double soldeInitial, Client client, double taux) {
		super( numCompte,  soldeInitial,  client );
		this.taux = taux;
		
	}
	
	/** Getter
	 * @return the taux
	 */
	public double getTaux() {
		return taux;
	}

	/** Setter
	 * @param taux the taux to set
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}
	
}
