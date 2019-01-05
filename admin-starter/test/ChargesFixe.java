// default package
// Generated Dec 21, 2018 3:25:04 PM by Hibernate Tools 4.3.5.Final

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
 * ChargesFixe generated by hbm2java
 */
@Entity
@Table(name = "charges_fixe", catalog = "copropriete")
public class ChargesFixe implements java.io.Serializable {

	private int idCharges;
	private Charges charges;

	public ChargesFixe() {
	}

	public ChargesFixe(Charges charges) {
		this.charges = charges;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "charges"))
	@Id
	@GeneratedValue(generator = "generator")

	@Column(name = "id_Charges", unique = true, nullable = false)
	public int getIdCharges() {
		return this.idCharges;
	}

	public void setIdCharges(int idCharges) {
		this.idCharges = idCharges;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Charges getCharges() {
		return this.charges;
	}

	public void setCharges(Charges charges) {
		this.charges = charges;
	}

}
