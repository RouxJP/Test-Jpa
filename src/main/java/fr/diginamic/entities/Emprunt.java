package fr.diginamic.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="emprunt")
public class Emprunt {
	@Id
	@Column(name="ID")
	private int id;
	
	@Column(name="DATE_DEBUT")
	private LocalDate 	dateDebut;

	@Column(name="DATE_FIN")
	private LocalDate 	dateFin;
	
	@Column(name="DELAI")
	private int	  		delai;
	
	@ManyToOne
	@JoinColumn( name="ID_CLIENT")
	private Client	client;
	
	
	@ManyToMany
	@JoinTable(	name="compo", 
				joinColumns = @JoinColumn(name="ID_EMP", referencedColumnName="ID"),
				inverseJoinColumns= @JoinColumn(name="ID_LIV", referencedColumnName="ID"))
	
	private List<Livre> lstLivres;
	

	public Emprunt() {
		
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
	 * @return the dateDebut
	 */
	public LocalDate getDateDebut() {
		return dateDebut;
	}

	/** Setter
	 * @param dateDebut the dateDebut to set
	 */
	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
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
	 * @return the delay
	 */
	public int getDelai() {
		return delai;
	}

	/** Setter
	 * @param delay the delay to set
	 */
	public void setDelai(int delay) {
		this.delai = delay;
	}


	/** Getter
	 * @return the lstLivres
	 */
	public List<Livre> getLstLivres() {
		return lstLivres;
	}

	/** Setter
	 * @param lstLivres the lstLivres to set
	 */
	public void setLstLivres(List<Livre> lstLivres) {
		this.lstLivres = lstLivres;
	}

	/** Getter
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/** Setter
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}
}
