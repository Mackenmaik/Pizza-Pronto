import java.time.LocalDate;

public class TestDriver {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		
		LocalDate dob = LocalDate.of(1990, 5, 24);
		
		System.out.println(today);
		System.out.println(dob);
		
	}

}
