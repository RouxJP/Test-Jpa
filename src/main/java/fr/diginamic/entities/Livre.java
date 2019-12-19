package fr.diginamic.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="livre")
public class Livre {
	@Id
	private int		id;
	
	@Column(name="TITRE")
	private String	titre;
	
	@Column(name="AUTEUR")
	private String  auteur;
	
	@ManyToMany
	@JoinTable(	name="compo", 
				joinColumns = @JoinColumn(name="ID_LIV", referencedColumnName="ID"),
				inverseJoinColumns= @JoinColumn(name="ID_EMP", referencedColumnName="ID"))
	
	private List<Emprunt> lstEmprunts;
	
	
	
	public Livre() {
		
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
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}

	/** Setter
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	/** Getter
	 * @return the auteur
	 */
	public String getAuteur() {
		return auteur;
	}

	/** Setter
	 * @param auteur the auteur to set
	 */
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	/** Getter
	 * @return the lstEmprunts
	 */
	public List<Emprunt> getLstEmprunts() {
		return lstEmprunts;
	}

	/** Setter
	 * @param lstEmprunts the lstEmprunts to set
	 */
	public void setLstEmprunts(List<Emprunt> lstEmprunts) {
		this.lstEmprunts = lstEmprunts;
	}

}
