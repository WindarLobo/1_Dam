package boletin3;

import java.util.Scanner;

public class Boletin3 {

    public static void main(String[] args) {
         boletinExtra3_1();
         esFechaValida();
    }

    private static void boletinExtra3_1() {
        System.out.println(" ******* Bienvenido al club del padel ******** ");
        final int CUOTA = 800;
        final int PORCENTAJE_MAYORES = 40;
        final int PORCENTAJE_JOVEN_SOCIO = 45;
        final int PORCENTAJE_JOVEN_NO_SOCIO = 25;

        int edad, cuotaI;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la edad del nuevo socio");

        edad = teclado.nextInt();

        cuotaI = CUOTA;

        if (edad >= 65) {
            cuotaI -= CUOTA * PORCENTAJE_MAYORES / 100;

        } else if (edad < 21) {
            System.out.println("¿El padre es socio(si/no)?: ");
            String respuesta = teclado.next();
            if (respuesta.equalsIgnoreCase("si")) {
                cuotaI -= CUOTA * PORCENTAJE_JOVEN_SOCIO / 100;
            } else {
                cuotaI -= CUOTA * PORCENTAJE_JOVEN_NO_SOCIO / 100;
            }

        }
        System.out.println("Debe pagar: " + cuotaI);
    }

    private static void esFechaValida() {
       
        int dia, mes, año;
        Scanner scanner = new Scanner(System.in);
         System.out.println(" ******* Validador de fechas ******** ");

        System.out.println("Introduzca el dia");
        dia = scanner.nextInt();
        System.out.println("Introduzca el mes");
        mes = scanner.nextInt();
        System.out.println("Introduzca el año ");
        año = scanner.nextInt();

        if (esFechaValida(dia, mes, año)) {
            System.out.println("La fecha es valida");
        } else {
            System.out.println("La fecha NO es valida");
        }
    }

    private static boolean esFechaValida(int dia, int mes, int año) {
        int diasMes;
        boolean resultado;

        if (mes < 1 || mes > 12) {
           return false;
        }

        if (año < 1600 || año > 3000) {
                      return false;

        }

        switch (mes) {
            case 4:diasMes = 30;
                break;
            case 6:diasMes = 30;
                break;
            case 9:diasMes = 30;
                break;
            case 11:
                diasMes = 30;
                break;

            case 2:
                if ((año % 4 == 0) && (año % 100 != 0) || (año % 400 == 0)) {
                    diasMes = 29;
                } else {
                    diasMes = 28;
                }
                break;

            default:
                diasMes = 31;

        }
        
        resultado = dia >= 1 && dia <= diasMes;

        return resultado;

    }

}

/*1- Escribir un programa, llamado Extras3_1, que calcule la cuota que se debe
pagar en un club de pádel. La tarifa es de 800 euros.
Los mayores de 65 años tendrán un 40% de descuento y los menores de 21 años un
25% de descuento si sus padres no son socios, y un 45% si sus padres son socios*/

 /*2- Escribir un método, llamado esFechaValida, que reciba como parámetros tres
valores enteros con el día, mes y año de una fecha y devuelva un
valor booleano indicando si estos son valores válidos para una fecha.
Los valores válidos para meses son exclusivamente valores entre 1 y 12.

 Valores entre 1600 y 3000 (por calcular) serán considerados como valores válidos para los años.
 En cuanto a los valores válidos para los días dependen del valor del mes 
de la fecha. Para comprobar si es un día válido se utilizará una

variable auxiliar en la que se asigna el valor máximo del día del mes para el mes de la fecha.
Mediante una estructura switch se le asigna a esta variable el valor 31 si es uno de los meses 
1,3,5,7,8,10 o 12. El valor 30 si es uno de los meses 4,6,9 o 11
 En el caso de que el año sea bisiesto, el mes de febrero, o el 2, le
asignamos 29 días; pero 28. Recuerda que un año es bisiesto si es múltiplo de cuatro, 
y no es múltiplo de cien, a menos que sea múltiplo de 400.

 */
