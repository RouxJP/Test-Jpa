package fr.diginamic.banque;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Compte")
public class Compte {
	@Id
	@Column(name="num_compte", length=50, nullable=false)
	private	String			numCompte ;
	
	@Column(name="soldeInitial", nullable=false)
	private	double			soldeInitial ;
	
	@ManyToMany
	@JoinTable(	name="compo", 
				joinColumns= @JoinColumn(name="num_compte_cli", referencedColumnName="num_compte"),	
				inverseJoinColumns = @JoinColumn(name="id_cli", referencedColumnName="id"))
	private List<Client> lstClients = new ArrayList<>();
	
	@OneToMany( mappedBy = "compte")
	private List<Operation> lstOperations;
	
	public Compte( String numCompte, double soldeInitial, Client client) {
		this.numCompte 		= numCompte;
		this.soldeInitial 	= soldeInitial ;
		this.lstClients.add( client);
	}

	public Compte( String numCompte, double soldeInitial) {
		this.numCompte 		= numCompte;
		this.soldeInitial 	= soldeInitial ;
	}


	public Compte( ) {
		
	}
	
	/** Getter
	 * @return the numCompte
	 */
	public String getNumCompte() {
		return numCompte;
	}

	/** Setter
	 * @param numCompte the numCompte to set
	 */
	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}

	/** Getter
	 * @return the soldeInitial
	 */
	public double getSoldeInitial() {
		return soldeInitial;
	}

	/** Setter
	 * @param soldeInitial the soldeInitial to set
	 */
	public void setSoldeInitial(double soldeInitial) {
		this.soldeInitial = soldeInitial;
	}

	/** Getter
	 * @return the lstClients
	 */
	public List<Client> getLstClients() {
		return lstClients;
	}

	/** Setter
	 * @param lstClients the lstClients to set
	 */
	public void setLstClients(List<Client> lstClients) {
		this.lstClients = lstClients;
	}

	/** Getter
	 * @return the lstOperations
	 */
	public List<Operation> getLstOperations() {
		return lstOperations;
	}

	/** Setter
	 * @param lstOperations the lstOperations to set
	 */
	public void setLstOperations(List<Operation> lstOperations) {
		this.lstOperations = lstOperations;
	}
	

}
