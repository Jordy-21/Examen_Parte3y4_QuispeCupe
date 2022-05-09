import java.util.Scanner;
public class NumeroPerfecto {
    public static void main(String[] args) {
        int i, suma = 0, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        n = sc.nextInt();
        for (i = 1; i < n; i++) {  
            if (n % i == 0) {
                suma = suma + i;
            }
        }
        if (suma == n) {  
            System.out.println("Perfecto");
        } else {
            System.out.println("No es perfecto");

        }
    }
}