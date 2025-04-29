package CodingChallenge;

//using scanner
import java.util.Scanner;

public class ScannerChallenge {
    Scanner scanner = new Scanner(System.in);

    public void readNameAndAge() {
        String name;
        int age; // in years
        System.out.println("Name? ");
        name = scanner.nextInt();

        System.out.println("Hello " + name + ", you are " + age + " springs young");
    }

    public static void main(Strings[] args) {
        (new ScannerChallenge()).readNameAndAge();
    }
}
