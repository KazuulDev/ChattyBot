import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int o = n*m - k;
        if (k>n*m){
            System.out.println("NO");
        }
        else if ((o%n==0)||(o%m==0)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}