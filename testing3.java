import java.util.Scanner;
public class testing3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of items: ");
        int a = input.nextInt();
        System.out.println();
        int arr[] = new int[a];
        System.out.print("Enter your numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
            System.out.print(" ");
        }
        System.out.println();
        System.out.print("Your array: ");
        for (int n: arr) {
            System.out.print(n + " ");
        }
        System.out.println();
        int sum = 0;
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            num++;
        }
        int avr1 = sum/num;
        System.out.println("Your avr: " + avr1); 
    }
}
