package fr.diginamic.banque;

import java.time.LocalDate;

import javax.persistence.AttributeOverride;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "VIREMENT")
public class Virement extends Operation {
	
	private String beneficiare;

	public Virement() {

	}

	public Virement(	int id, 				LocalDate dateOperation, 
						double mntOperation, 	
						Compte compte, 			String  	beneficiare) {
		super( id, dateOperation, mntOperation, "Virement", compte);
		this.beneficiare = beneficiare;
	}

	/**
	 * Getter
	 * 
	 * @return the beneficiare
	 */
	public String getBeneficiare() {
		return beneficiare;
	}

	/**
	 * Setter
	 * 
	 * @param beneficiare the beneficiare to set
	 */
	public void setBeneficiare(String beneficiare) {
		this.beneficiare = beneficiare;
	}

}
