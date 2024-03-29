package fr.diginamic.banque;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ASSURANCE_VIE")
public class AssuranceVie extends Compte{
	@Column( name="date_fin")
	private LocalDate dateFin ;

	private double taux;

	public AssuranceVie() {
		
	}
	
	public AssuranceVie( String numCompte, double soldeInitial, Client client, double taux) {
		super( numCompte,  soldeInitial,  client );
		this.taux = taux;
		
	}

	/** Getter
	 * @return the dateFin
	 */
	public LocalDate getDateFin() {
		return dateFin;
	}

	/** Setter
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
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
