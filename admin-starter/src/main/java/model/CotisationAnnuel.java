package model;
// Generated Dec 29, 2018 5:07:18 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * CotisationAnnuel generated by hbm2java
 */
@Entity
@Table(name = "cotisation_annuel")
public class CotisationAnnuel implements java.io.Serializable {

	private int idCotisation;
	private Cotisation cotisation;

	public CotisationAnnuel() {
	}

	public CotisationAnnuel(Cotisation cotisation) {
		this.cotisation = cotisation;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "cotisation"))
	@Id
	@GeneratedValue(generator = "generator")

	@Column(name = "id_Cotisation", unique = true, nullable = false)
	public int getIdCotisation() {
		return this.idCotisation;
	}

	public void setIdCotisation(int idCotisation) {
		this.idCotisation = idCotisation;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Cotisation getCotisation() {
		return this.cotisation;
	}

	public void setCotisation(Cotisation cotisation) {
		this.cotisation = cotisation;
	}

}
