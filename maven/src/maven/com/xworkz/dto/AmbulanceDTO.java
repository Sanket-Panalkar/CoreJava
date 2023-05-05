package maven.com.xworkz.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

import maven.com.xworkz.constant.Cells;

public class AmbulanceDTO implements Serializable, Comparable<AmbulanceDTO> {

	@Override
	public int hashCode() {
		return Objects.hash(chasisNo, driverName, id, insurenceExpired, ownerName, regNo, taxStartDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AmbulanceDTO other = (AmbulanceDTO) obj;
		return chasisNo == other.chasisNo && Objects.equals(driverName, other.driverName) && id == other.id
				&& Objects.equals(insurenceExpired, other.insurenceExpired)
				&& Objects.equals(ownerName, other.ownerName) && regNo == other.regNo
				&& Objects.equals(taxStartDate, other.taxStartDate);
	}

	public AmbulanceDTO(int id, int regNo, int chasisNo, String ownerName, LocalDate localDate, String driverName,
			LocalDate taxStartDate) {
		super();
		this.id = id;
		this.regNo = regNo;
		this.chasisNo = chasisNo;
		this.ownerName = ownerName;
		this.insurenceExpired = localDate;
		this.driverName = driverName;
		this.taxStartDate = taxStartDate;
	}

	@Override
	public String toString() {
		return "AmbulanceDTO [id=" + id + ", regNo=" + regNo + ", chasisNo=" + chasisNo + ", ownerName=" + ownerName
				+ ", insurenceExpired=" + insurenceExpired + ", driverName=" + driverName + ", taxStartDate="
				+ taxStartDate + "]";
	}

	private int id;
	private int regNo;
	private int chasisNo;
	private String ownerName;
	private LocalDate insurenceExpired;
	private String driverName;
	private LocalDate taxStartDate;

	@Override
	public int compareTo(AmbulanceDTO o) {

		return this.ownerName.compareTo(o.driverName);
	}

}
