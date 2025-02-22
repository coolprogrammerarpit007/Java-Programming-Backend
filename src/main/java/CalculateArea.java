import java.util.Scanner;
public class CalculateArea {

    public static void main(String[] args) {
        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        width = scanner.nextDouble();
        System.out.println("Enter height: ");
        height = scanner.nextDouble();
        area = 0.5 * width * height;
        System.out.println("Area of triangle is: " + area);
        scanner.close();
    }
}
