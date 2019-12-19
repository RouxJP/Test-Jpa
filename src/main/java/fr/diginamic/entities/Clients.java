package fr.diginamic.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="client")
public class Clients {
	
	@Id
	private int	id;
	
	@Column(name="NOM")
	private String	nom;
	
	@Column(name="PRENOM")
	private String	prenom;
	
	@OneToMany( mappedBy="client")
	private Set<Emprunt> lstEmprunts;

	public Clients() {
		
	}
	

	/** Getter
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/** Setter
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/** Setter
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	/** Getter
	 * @return the lstEmprunts
	 */
	public Set<Emprunt> getLstEmprunts() {
		return lstEmprunts;
	}


	/** Setter
	 * @param lstEmprunts the lstEmprunts to set
	 */
	public void setLstEmprunts(Set<Emprunt> lstEmprunts) {
		this.lstEmprunts = lstEmprunts;
	}
	
}
