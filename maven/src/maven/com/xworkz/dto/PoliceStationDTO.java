package maven.com.xworkz.dto;

import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

import maven.com.xworkz.constant.Cells;

public class PoliceStationDTO implements Serializable, Comparable<PoliceStationDTO> {

	@Null
	@Min(1)
	@Max(100)
	private int id;
	@NotNull
	private String name;
	@NotNull
	private String inspectorName;
	@Min(1)
	@Max(100)
	private String area;
	@NotNull
	@Min(0)
	private Cells noOfCells;

	public PoliceStationDTO(int id, String name, String inspectorName, String area, Cells noOfCells) {
		super();
		this.id = id;
		this.name = name;
		this.inspectorName = inspectorName;
		this.area = area;
		this.noOfCells = noOfCells;
	}

	@Override
	public int hashCode() {
		return Objects.hash(area, id, inspectorName, name, noOfCells);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PoliceStationDTO other = (PoliceStationDTO) obj;
		return Objects.equals(area, other.area) && id == other.id && Objects.equals(inspectorName, other.inspectorName)
				&& Objects.equals(name, other.name) && noOfCells == other.noOfCells;
	}

	@Override
	public String toString() {
		return "PoliceStationDTO [id=" + id + ", name=" + name + ", inspectorName=" + inspectorName + ", area=" + area
				+ ", noOfCells=" + noOfCells + "]";
	}

	@Override
	public int compareTo(PoliceStationDTO o) {

		return this.name.compareTo(o.name);
	}

}
