package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="uomtab123")

 public class Uom {
	@Id
	@GeneratedValue
	//@GenericGenerator(name="uom", strategy = "increment")
	@Column(name="uomId12")
	private Integer uomId;

	@Column(name="utype1")
	private String uomType;
	
	@Column(name="umodel1")
	private String uomModel;
	
	@Column(name="desc1")
	private String description;
	
	public Uom() {
	}

	public Integer getUomId() {
		return uomId;
	}

	public void setUomId(Integer uomId) {
		this.uomId = uomId;
	}

	public String getUomType() {
		return uomType;
	}

	public void setUomType(String uomType) {
		this.uomType = uomType;
	}

	public String getUomModel() {
		return uomModel;
	}

	public void setUomModel(String uomModel) {
		this.uomModel = uomModel;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	

	


	
	
	
	
	

}
