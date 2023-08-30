import java.util.Scanner;

public class MultiplicacionRecursiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();

        int resultado = multiplicarRecursivo(num1, num2);
        System.out.println("El resultado de la multiplicación es: " + resultado);

        scanner.close();
    }

    public static int multiplicarRecursivo(int a, int b) {
        if (b == 0) {
            return 0;
        } else if (b > 0) {
            return a + multiplicarRecursivo(a, b - 1);
        } else {
            return -multiplicarRecursivo(a, -b);
        }
    }
}