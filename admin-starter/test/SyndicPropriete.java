// default package
// Generated Dec 21, 2018 3:25:04 PM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SyndicPropriete generated by hbm2java
 */
@Entity
@Table(name = "syndic_propriete", catalog = "copropriete")
public class SyndicPropriete implements java.io.Serializable {

	private SyndicProprieteId id;
	private Propriete propriete;
	private UserSyndic userSyndic;
	private Date dateDSyndProp;
	private Date dateFSyndProp;

	public SyndicPropriete() {
	}

	public SyndicPropriete(SyndicProprieteId id, Propriete propriete, UserSyndic userSyndic) {
		this.id = id;
		this.propriete = propriete;
		this.userSyndic = userSyndic;
	}

	public SyndicPropriete(SyndicProprieteId id, Propriete propriete, UserSyndic userSyndic, Date dateDSyndProp,
			Date dateFSyndProp) {
		this.id = id;
		this.propriete = propriete;
		this.userSyndic = userSyndic;
		this.dateDSyndProp = dateDSyndProp;
		this.dateFSyndProp = dateFSyndProp;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "idUser", column = @Column(name = "id_User", nullable = false)),
			@AttributeOverride(name = "idPropriete", column = @Column(name = "id_Propriete", nullable = false)) })
	public SyndicProprieteId getId() {
		return this.id;
	}

	public void setId(SyndicProprieteId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_Propriete", nullable = false, insertable = false, updatable = false)
	public Propriete getPropriete() {
		return this.propriete;
	}

	public void setPropriete(Propriete propriete) {
		this.propriete = propriete;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_User", nullable = false, insertable = false, updatable = false)
	public UserSyndic getUserSyndic() {
		return this.userSyndic;
	}

	public void setUserSyndic(UserSyndic userSyndic) {
		this.userSyndic = userSyndic;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dateD_Synd_Prop", length = 19)
	public Date getDateDSyndProp() {
		return this.dateDSyndProp;
	}

	public void setDateDSyndProp(Date dateDSyndProp) {
		this.dateDSyndProp = dateDSyndProp;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dateF_Synd_Prop", length = 19)
	public Date getDateFSyndProp() {
		return this.dateFSyndProp;
	}

	public void setDateFSyndProp(Date dateFSyndProp) {
		this.dateFSyndProp = dateFSyndProp;
	}

}