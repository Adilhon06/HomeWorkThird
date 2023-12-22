public class Main {
    public static void main(String[] args) {
        double[] arrayDouble = {23.3, 18.2, -2.3, 9.4, 8.3, -6.3, 6.7, 9.2, 7.7, -4.2, -5.6, 4.5, -6.9, 8.7, -2.5};
        double sum = 0;

        for (double number : arrayDouble){
            if (number == 23.3 || number == 18.2 || number <= 0) {
                continue;
            }

            sum += number;
        }
        sum = sum / 7;
        System.out.println(sum);
    }
}