// default package
// Generated Dec 21, 2018 3:25:04 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NotificationUserId generated by hbm2java
 */
@Embeddable
public class NotificationUserId implements java.io.Serializable {

	private int idNotification;
	private int idUser;

	public NotificationUserId() {
	}

	public NotificationUserId(int idNotification, int idUser) {
		this.idNotification = idNotification;
		this.idUser = idUser;
	}

	@Column(name = "id_Notification", nullable = false)
	public int getIdNotification() {
		return this.idNotification;
	}

	public void setIdNotification(int idNotification) {
		this.idNotification = idNotification;
	}

	@Column(name = "id_User", nullable = false)
	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NotificationUserId))
			return false;
		NotificationUserId castOther = (NotificationUserId) other;

		return (this.getIdNotification() == castOther.getIdNotification())
				&& (this.getIdUser() == castOther.getIdUser());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdNotification();
		result = 37 * result + this.getIdUser();
		return result;
	}

}
