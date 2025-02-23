import java.util.Random;
public class RandomNumber {

    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(1,101);
        double number1 = random.nextDouble(0,5);
        boolean bool = random.nextBoolean(); // will generate a random boolean value b/w true or false
        System.out.println(number);
        System.out.println(number1);
    }
}
