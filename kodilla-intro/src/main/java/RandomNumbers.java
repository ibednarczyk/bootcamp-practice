import java.util.Random;
public class RandomNumbers {
    int number = 5000;
    int min;
    int max;
    int b;

    public int getMaxOfRandomNumber(int number) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        int max = 30;
        while (sum < 5000) {
            int b = random.nextInt(31);
            sum = sum + b;
            result++;
            if (b >= max) {
            }
        }
        return b;
    }
    public int getMinOfRandomNumber(int number) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        int min = 0;
        while (sum < 5000) {
            int b = random.nextInt(31);
            sum = sum + b;
            result++;
            if (b <= min) {
            }
        }
        return b;

    }

}





