package fr.diginamic.banque;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Inheritance( strategy = InheritanceType.JOINED)
@Table(name="OPERATION")
public  class Operation {
	@Id
	@Column(name="id", nullable=false)
	private int		id;
	
	@Column(name="date_ope", nullable=false)
	private LocalDate	dateOperation;
	
	@Column(name="mnt_operation", nullable=false)
	private double		mntOperation;
	
	@Column(name="motif", nullable=false)
	private String	motif;
	
	@ManyToOne
	@JoinColumn( name="ope_num_compte")
	Compte compte;
	
	public Operation(  ) {
	}

	public Operation( 	int id, 					LocalDate	dateOperation, 
						double		mntOperation, 	String	motif,
						Compte		compte){
		this.id 			= id ;
		this.dateOperation 	= dateOperation ;
		this.mntOperation 	= mntOperation ;
		this.motif 			= motif ;
		this.compte			= compte ;
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
	 * @return the dateOperation
	 */
	public LocalDate getDateOperation() {
		return dateOperation;
	}

	/** Setter
	 * @param dateOperation the dateOperation to set
	 */
	public void setDateOperation(LocalDate dateOperation) {
		this.dateOperation = dateOperation;
	}

	/** Getter
	 * @return the mntOperation
	 */
	public double getMntOperation() {
		return mntOperation;
	}

	/** Setter
	 * @param mntOperation the mntOperation to set
	 */
	public void setMntOperation(double mntOperation) {
		this.mntOperation = mntOperation;
	}

	/** Getter
	 * @return the motif
	 */
	public String getMotif() {
		return motif;
	}

	/** Setter
	 * @param motif the motif to set
	 */
	public void setMotif(String motif) {
		this.motif = motif;
	}

	/** Getter
	 * @return the compte
	 */
	public Compte getCompte() {
		return compte;
	}

	/** Setter
	 * @param compte the compte to set
	 */
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	
	


}
