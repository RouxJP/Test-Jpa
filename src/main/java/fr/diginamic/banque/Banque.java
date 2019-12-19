package fr.diginamic.banque;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Banque")
public class Banque {
	@Id
	@Column(name="id", nullable=false)
	private int id ;
	
	@Column(name="nom", length=50, nullable=false)
	private String nom;
	
	@OneToMany( mappedBy="banque")
	private List<Client> lstClient;
	
	public Banque() {
		
	}
	
	public Banque( int id, String nom) {
		this.id = id;
		this.nom = nom;
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
	 * @return the lstClient
	 */
	public List<Client> getLstClient() {
		return lstClient;
	}

	/** Setter
	 * @param lstClient the lstClient to set
	 */
	public void setLstClient(List<Client> lstClient) {
		this.lstClient = lstClient;
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
	
}
