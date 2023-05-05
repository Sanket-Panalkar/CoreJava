package maven.com.xworkz.dto;

import java.io.Serializable;


import java.time.LocalDate;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import maven.com.xworkz.constant.Locations;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor

public class ShowroomDTO implements Serializable,Comparable<ShowroomDTO>{
	
	@Min(value = 1)
	@Max(value = 100)
	private int id;
	
	@NotNull
	@NotEmpty
	private	String name;
	private	Locations location;
	@Min(value = 1)
	@Max(value = 100)
	private int number;
	private LocalDate openDate;
	private	boolean closed;
	
	@Override
	public int compareTo(ShowroomDTO o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	
	
}
