package fr.diginamic.banque;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;



@Entity
@Table(name="Client")
public class Client {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="nom", length=50, nullable=false)
	private String nom;
	
	@Column(name="prenom", length=50, nullable=false)
	private String prenom;
	
	@Column(name="date_Naissance", nullable=false)
	private LocalDate dateNaissance;

	@Embedded
	private Adresse    adresse;
	
	@ManyToOne 
	@JoinColumn(name="id_banque")
	private Banque banque;
	
	@ManyToMany
	@JoinTable(	name="compo", 
				joinColumns = @JoinColumn(name="id_cli", referencedColumnName="id"),
				inverseJoinColumns= @JoinColumn(name="num_compte_cli", referencedColumnName="num_compte"))	
	private List<Compte> lstComptes;
	
	public Client( 	String nom, 		String prenom, 		LocalDate dateNaissance, 
					Banque banque, 		Adresse adresse) {
		this.nom = nom ;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.banque  = banque;
		this.adresse = adresse;
		
	}
	
	public Client( ) {
		
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
	 * @return the dateNaissance
	 */
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	/** Setter
	 * @param dateNaissance the dateNaissance to set
	 */
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
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

}
