package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shipmenttab")
public class ShipmentType {
	@Id
	@GeneratedValue
	@Column(name="sId")
	private Integer shipId;
	private String shipMode;
	private String shipCode;
	private String enbShip;
	private String shipGrade;
	private String shipdesc;
	
	
	public ShipmentType() {
		
	}
	public ShipmentType(Integer id) {
		// TODO Auto-generated constructor stub
	}
	public Integer getShipId() {
		return shipId;
	}
	public void setShipId(Integer shipId) {
		this.shipId = shipId;
	}
	public String getShipMode() {
		return shipMode;
	}
	public void setShipMode(String shipMode) {
		this.shipMode = shipMode;
	}
	public String getShipCode() {
		return shipCode;
	}
	public void setShipCode(String shipCode) {
		this.shipCode = shipCode;
	}
	public String getEnbShip() {
		return enbShip;
	}
	public void setEnbShip(String enbShip) {
		this.enbShip = enbShip;
	}
	public String getShipGrade() {
		return shipGrade;
	}
	public void setShipGrade(String shipGrade) {
		this.shipGrade = shipGrade;
	}
	public String getShipdesc() {
		return shipdesc;
	}
	public void setShipdesc(String shipdesc) {
		this.shipdesc = shipdesc;
	}
	@Override
	public String toString() {
		return "ShipmentType [shipId=" + shipId + ", shipMode=" + shipMode + ", shipCode=" + shipCode + ", enbShip="
				+ enbShip + ", shipGrade=" + shipGrade + ", shipdesc=" + shipdesc + "]";
	}


}
