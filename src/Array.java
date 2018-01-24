import java.util.Locale;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        int[][] numbers = new int[3][3];
        int liczby;
        int i = 0;

        System.out.println("Podaj 9 liczby:");

        while(i<numbers.length){
            int y = 0;
                while(y < 3){
                    liczby = input.nextInt();
                    numbers[i][y] = liczby;
                    y++;
                }
            i++;
        }

        i = 0;

        int sum = 0, sum1 = 0, sum2 = 0;

        while(i < numbers.length){
            sum += numbers[0][i];
            sum1 += numbers[1][i];
            sum2 += numbers[2][i];
            i++;
        }

        if(sum > sum1 && sum > sum2){
            System.out.println("Najwieksza suma liczb jest w wierszu 1 i wynosi : " + sum);
        }else if(sum1 > sum && sum1 > sum2){
            System.out.println("Najwieksza suma liczb jest w wierszu 2 i wynosi : " + sum1);
        }else if(sum2 > sum && sum2 > sum1){
            System.out.println("Najwieksza suma liczb jest w wierszu 3 i wynosi : " + sum2);
        }else {
            System.out.println("Prawdopodobnie najwieksza suma wystepuje przynajmniej w dwóch wierszach");
        }
    }
}
