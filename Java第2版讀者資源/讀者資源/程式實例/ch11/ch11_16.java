import java.time.*;
public class ch11_16 {
	public static void main(String[] args) {
		Period period = Period.between( LocalDate.of(2020, 5, 1),
										LocalDate.of(2022, 6, 5));
		System.out.println("¦~ : " + period.getYears());
		System.out.println("¤ë : " + period.getMonths());
		System.out.println("¤é : " + period.getDays());
	}
}

