
package primos;

import java.util.Scanner;

public class Primos {
    public static void main(String[] args) {
         int cont = 0;
        Scanner ent = new Scanner(System.in);
        System.out.println("Introdusca un numero");
        int a = ent.nextInt();

        for (int i = 1; i <= a; i++){
            if (a%i==0)
                cont ++;
        }

        if (cont >2)
            System.out.printf("el numero %d es compuesto\n",a);
        else
            System.out.printf("El numero %d es primo\n",a);
    }
    
}
