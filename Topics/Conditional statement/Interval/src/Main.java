import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if ((-15 < a && a <= 12)||(a > 14 && a < 17)||(a >=19 )) {
            System.out.print("True");
        }
        else {
            System.out.print("False");
        }
    }
}