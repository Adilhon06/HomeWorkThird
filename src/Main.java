public class Main {
    public static void main(String[] args) {
        double[] arrayDouble = {23.3, 18.2, -2.3, 9.4, 8.3, -6.3, 6.7, 9.2, 7.7, -4.2, -5.6, 4.5, -6.9, 8.7, -2.5};
        int count = 0;
        double sum = 0;

        boolean negative = false;

        for (double number : arrayDouble){
            if (number <= 0) {
                negative = true;
            }
            if (negative && number >= 0){
                count ++;
            }
            sum += number;
        }
        System.out.println(sum / count);
    }
}