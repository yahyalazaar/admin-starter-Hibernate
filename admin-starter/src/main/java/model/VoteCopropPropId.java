package model;
// Generated Dec 29, 2018 5:07:18 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VoteCopropPropId generated by hbm2java
 */
@Embeddable
public class VoteCopropPropId implements java.io.Serializable {

	private int idUser;
	private int idAssemble;

	public VoteCopropPropId() {
	}

	public VoteCopropPropId(int idUser, int idAssemble) {
		this.idUser = idUser;
		this.idAssemble = idAssemble;
	}

	@Column(name = "id_User", nullable = false)
	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	@Column(name = "id_Assemble", nullable = false)
	public int getIdAssemble() {
		return this.idAssemble;
	}

	public void setIdAssemble(int idAssemble) {
		this.idAssemble = idAssemble;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VoteCopropPropId))
			return false;
		VoteCopropPropId castOther = (VoteCopropPropId) other;

		return (this.getIdUser() == castOther.getIdUser()) && (this.getIdAssemble() == castOther.getIdAssemble());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdUser();
		result = 37 * result + this.getIdAssemble();
		return result;
	}

}
