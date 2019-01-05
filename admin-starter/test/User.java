// default package
// Generated Dec 21, 2018 3:25:04 PM by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user", catalog = "copropriete")
public class User implements java.io.Serializable {

	private Integer idUser;
	private String nomUser;
	private String prenomUser;
	private String loginUser;
	private String mdpUser;
	private String typeUser;
	private UserAdmin userAdmin;
	private UserCoproprietaire userCoproprietaire;
	private UserSyndic userSyndic;
	private Set<NotificationUser> notificationUsers = new HashSet<NotificationUser>(0);

	public User() {
	}

	public User(String typeUser) {
		this.typeUser = typeUser;
	}

	public User(String nomUser, String prenomUser, String loginUser, String mdpUser, String typeUser,
			UserAdmin userAdmin, UserCoproprietaire userCoproprietaire, UserSyndic userSyndic,
			Set<NotificationUser> notificationUsers) {
		this.nomUser = nomUser;
		this.prenomUser = prenomUser;
		this.loginUser = loginUser;
		this.mdpUser = mdpUser;
		this.typeUser = typeUser;
		this.userAdmin = userAdmin;
		this.userCoproprietaire = userCoproprietaire;
		this.userSyndic = userSyndic;
		this.notificationUsers = notificationUsers;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_User", unique = true, nullable = false)
	public Integer getIdUser() {
		return this.idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

	@Column(name = "nom_User", length = 254)
	public String getNomUser() {
		return this.nomUser;
	}

	public void setNomUser(String nomUser) {
		this.nomUser = nomUser;
	}

	@Column(name = "prenom_User", length = 254)
	public String getPrenomUser() {
		return this.prenomUser;
	}

	public void setPrenomUser(String prenomUser) {
		this.prenomUser = prenomUser;
	}

	@Column(name = "login_User", length = 254)
	public String getLoginUser() {
		return this.loginUser;
	}

	public void setLoginUser(String loginUser) {
		this.loginUser = loginUser;
	}

	@Column(name = "mdp_User", length = 254)
	public String getMdpUser() {
		return this.mdpUser;
	}

	public void setMdpUser(String mdpUser) {
		this.mdpUser = mdpUser;
	}

	@Column(name = "type_User", nullable = false, length = 245)
	public String getTypeUser() {
		return this.typeUser;
	}

	public void setTypeUser(String typeUser) {
		this.typeUser = typeUser;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "user")
	public UserAdmin getUserAdmin() {
		return this.userAdmin;
	}

	public void setUserAdmin(UserAdmin userAdmin) {
		this.userAdmin = userAdmin;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "user")
	public UserCoproprietaire getUserCoproprietaire() {
		return this.userCoproprietaire;
	}

	public void setUserCoproprietaire(UserCoproprietaire userCoproprietaire) {
		this.userCoproprietaire = userCoproprietaire;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "user")
	public UserSyndic getUserSyndic() {
		return this.userSyndic;
	}

	public void setUserSyndic(UserSyndic userSyndic) {
		this.userSyndic = userSyndic;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<NotificationUser> getNotificationUsers() {
		return this.notificationUsers;
	}

	public void setNotificationUsers(Set<NotificationUser> notificationUsers) {
		this.notificationUsers = notificationUsers;
	}

}