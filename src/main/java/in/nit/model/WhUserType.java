package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="whtab22")
public class WhUserType {
	//public String userType;
	@Id
	@GeneratedValue(generator = "whidgen")
	@GenericGenerator(name="whidgen", strategy = "increment")
	@Column(name="usid")
	private Integer userId;
	public String userType;

	@Column(name="code")
	private String userCode;
	private   String userFor="purchase";
	private String userMail;
	private String contact;
	private String idType;
	private String other;
	private String idNo;
	public WhUserType() {
		super();
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserFor() {
		return userFor;
	}
	public void setUserFor(String userFor) {
		this.userFor = userFor;
	}
	public String getUserMail() {
		return userMail;
	}
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getIdType() {
		return idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}
	public String getOther() {
		return other;
	}
	public void setOther(String other) {
		this.other = other;
	}
	public String getIdNo() {
		return idNo;
	}
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}
	@Override
	public String toString() {
		return "WhUserType [userType=" + userType + ", userId=" + userId + ", userCode=" + userCode + ", userFor="
				+ userFor + ", userMail=" + userMail + ", contact=" + contact + ", idType=" + idType + ", other="
				+ other + ", idNo=" + idNo + "]";
	}
	
	

}
