import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hava sıcaklığını giriniz");
        int sicaklik = scanner.nextInt();

        int durum = (sicaklik < 5) ? 1 : (sicaklik < 15) ? 2 : (sicaklik < 25) ? 3 : 4;

        switch (durum) {
            case 1:
                System.out.println("Kayak yapabilirsiniz");
                break;
            case 2:
                System.out.println("Sinemaya gidebilirsiniz");
                break;
            case 3:
                System.out.println("Piknik yapabilirsiniz");
                break;
            default:
                System.out.println("Yüzmeye gidebilirsiniz");
                break;
        }
    }
}
