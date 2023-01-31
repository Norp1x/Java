public class Testing {
    public static void main(String[] args) {
        int [] numbers;
        numbers = new int[10];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        numbers[5] = 60;
        numbers[6] = 70;
        numbers[7] = 80;
        numbers[8] = 90;
        numbers[9] = 100;

            int i = 0;
            while (i < numbers.length) {
                System.out.println(numbers[i]);
                i++;
            }
       // for (int tableNumbers : numbers) System.out.println(tableNumbers);

    }
}