package features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;
import java.util.Set;

public class TimeAPI {
public static void main(String[] args) {
	

	Date d=new Date();
	System.out.println(d);
	
	LocalDate ld=LocalDate.now();
	System.out.println(ld);
	
	LocalDateTime ldt=LocalDateTime.now();
	System.out.println(ldt);
	
//	LocalDate ldy=LocalDate.of(2022, Month.FEBRUARY, 29);
//	System.out.println(ldy);

	
//	Set<String>zones=ZoneId.getAvailableZoneIds();
//	zones.stream().forEach(System.out::println);

	LocalDateTime ldtZone=LocalDateTime.now(ZoneId.of("Canada/Eastern"));
	System.out.println(ldtZone);
}
}