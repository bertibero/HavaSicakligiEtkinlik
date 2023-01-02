import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int heat;

        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklık Giriniz :");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.print("You can ski.");

        } else if (heat >= 5 && heat <= 15) {
            System.out.print("You can go to cinema.");
        } else if (heat > 15 && heat <= 25) {
            System.out.print("You can go to picnic.");
        } else if (heat > 25) {
            System.out.print("You can swim.");
        }
    }
}