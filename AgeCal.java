import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter your birth date : ");
        String birthDateInput = scanner.nextLine();
        LocalDate birthDate = LocalDate.parse(birthDateInput);


        System.out.println("Enter the date to calculate age on : ");
        String givenDateInput = scanner.nextLine();
        LocalDate givenDate = LocalDate.parse(givenDateInput);


        Period age = Period.between(birthDate, givenDate);


        System.out.println("You are " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days old as of " + givenDate + ".");
    }
}
