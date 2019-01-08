package model;
// Generated Dec 29, 2018 5:07:18 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Charges generated by hbm2java
 */
@Entity
@Table(name = "charges")
public class Charges implements java.io.Serializable {

	private Integer idCharges;
	private Propriete propriete;
	private String nomCharges;
	private Integer montantCharge;
	private ChargesTemporaire chargesTemporaire;
	private ChargesFixe chargesFixe;

	public Charges() {
	}

	public Charges(Propriete propriete) {
		this.propriete = propriete;
	}

	public Charges(Propriete propriete, String denominationCharge, Integer montantCharge,
			ChargesTemporaire chargesTemporaire, ChargesFixe chargesFixe) {
		this.propriete = propriete;
		this.nomCharges = denominationCharge;
		this.montantCharge = montantCharge;
		this.chargesTemporaire = chargesTemporaire;
		this.chargesFixe = chargesFixe;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_Charges", unique = true, nullable = false)
	public Integer getIdCharges() {
		return this.idCharges;
	}

	public void setIdCharges(Integer idCharges) {
		this.idCharges = idCharges;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_Propriete", nullable = false)
	public Propriete getPropriete() {
		return this.propriete;
	}

	public void setPropriete(Propriete propriete) {
		this.propriete = propriete;
	}

	@Column(name = "montant_Charge", precision = 8, scale = 0)
	public Integer getMontantCharge() {
		return this.montantCharge;
	}

	public void setMontantCharge(Integer montantCharge) {
		this.montantCharge = montantCharge;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "charges")
	public ChargesTemporaire getChargesTemporaire() {
		return this.chargesTemporaire;
	}

	public void setChargesTemporaire(ChargesTemporaire chargesTemporaire) {
		this.chargesTemporaire = chargesTemporaire;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "charges")
	public ChargesFixe getChargesFixe() {
		return this.chargesFixe;
	}

	public void setChargesFixe(ChargesFixe chargesFixe) {
		this.chargesFixe = chargesFixe;
	}

	@Column(name = "nom_Charges", length = 254)
	public String getNomCharges() {
		return nomCharges;
	}

	public void setNomCharges(String nomCharges) {
		this.nomCharges = nomCharges;
	}

}
