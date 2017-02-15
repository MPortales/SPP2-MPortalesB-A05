/*Maythé Portales Barrios
A01411461
Ingenieria Industrial y de Sistemas
Actividad 05
 */
package spp2.mportalesb.a05;
import java.util.Scanner;

/**
 *
 * @author may37
 */
public class SPP2MPortalesBA05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        solicitaInt();
        solicitaDouble();
        solicitaLong();
        solicitaString();

    }

    public static int solicitaInt() {
        Scanner teclado = new Scanner(System.in);
        int var = 0;
        boolean flag;

        do {
            System.out.println("Introduce un valor tipo entero");
            try {
                var = teclado.nextInt();
                flag = false;
            } catch (Exception ex) {
                System.out.println("NO ES UN VALOR ENTERO");
                flag = true;
                teclado.nextLine();
            }
        } while (flag);
        return var;
    }

    public static double solicitaDouble() {
        Scanner teclado = new Scanner(System.in);
        double var = 0;
        boolean flag;
        do {
            System.out.println("Introduce un valor de tipo double");
            try {
                var = teclado.nextDouble();
                flag = false;
            } catch (Exception ex) {
                System.out.println("NO ES UN VALOR DOUBLE");
                flag = true;
                teclado.next();
            }
        } while (flag);
        return var;
    }

    public static long solicitaLong() {
        Scanner teclado = new Scanner(System.in);
        long var = 0;
        boolean flag;
        do {
            System.out.println("Introduce un valor de tipo Long");
            try {
                var = teclado.nextLong();
                flag = false;
            } catch (Exception ex) {
                System.out.println("NO ES UN VALOR DE TIPO LONG");
                flag = true;
                teclado.next();
            }
        } while (flag);
        return var;
    }

    public static String solicitaString() {
        Scanner teclado = new Scanner(System.in);
        String var="";
        boolean flag;
        do {
            System.out.println("Introdyce un valor de tipo String");
            try {
                var = teclado.nextLine();
                flag = false;
            } catch (Exception ex){
                System.out.println("NO ES UN VALOR DE TIPO STRING");
                flag = true;
                teclado.next();
            }
        } while (flag);
        return var;
    }
}
