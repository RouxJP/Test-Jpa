package fr.diginamic.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Fournisseur {
	@Id
	private int 	id_fournisseur;
	private String 	nom;
	
	public Fournisseur() {
		
	}
	

	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}


	/** Getter
	 * @return the id_fournisseur
	 */
	public int getId_fournisseur() {
		return id_fournisseur;
	}


	/** Setter
	 * @param id_fournisseur the id_fournisseur to set
	 */
	public void setId_fournisseur(int id_fournisseur) {
		this.id_fournisseur = id_fournisseur;
	}
}
