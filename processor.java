package OOP;
import java.util.Scanner;
public class processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter model for car: ");
        String model = sc.nextLine();
        car myCar1 = new car(model, 2020);
        car myCar2 = new car("Lexus", 2023);
        car myCar3 = new car("VF3", 2024);
        myCar1.displayDetail();
        myCar2.displayDetail();
        myCar3.displayDetail();
    }

}
