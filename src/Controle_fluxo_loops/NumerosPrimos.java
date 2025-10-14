package Controle_fluxo_loops;

import java.util.Scanner;

public class NumerosPrimos {
    static void main(String[] args) {
        //Números primos: Verifique se um número é primo.
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        boolean primo = true;

        if (numero <= 1) {
            primo = false;
        } else {
            // só precisa testar até a raiz quadrada do número
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }
        }
        if (primo) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }
        scanner.close();
    }
}
