import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*5-	 Fai o algoritmo e programa  que calcule o soldo bruto e
        líquido, a percibir, por unha persoa .Sabendo que o soldo total inclue os seguintes conceptos :
        Soldo base, Comisión : 5% sobre importe total de vendas Quilometraxe : 2 € por km
	Dietas : 30 € por día de desprazamento ,Para calcular o soldo
	líquido debemos descontarlle ao soldo bruto Para calcular o soldo líquido
	debemos descontarlle ao soldo bruto I.R.P.F. = 18 % do soldo total .
	Retención a seguridade social : 36 € .*/

        double porcComision = 0.05, precioKilometro = 2, precioDiaDieta = 30, porcIrpf = 0.18, seguridaSocial = 36;

        System.out.println("***** GesWindar Gestoria *****");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el salario base:");
        double salarioBase = scanner.nextDouble();

        System.out.println("Introduce el importe de ventas:");
        double importeDeVentas = scanner.nextDouble();

        System.out.println("Introduce los kilometraje realizados:");
        double kilometraje = scanner.nextDouble();

        System.out.println("Introduce los dias de desplazamiento:");
        int diasDeDesplazamiento = scanner.nextInt();

        double comisionVentas = (porcComision * importeDeVentas);
        double kilometrajeTotal = (kilometraje * precioKilometro);
        double desplazamientoTotal = (diasDeDesplazamiento * precioDiaDieta);

        double sueldoBruto = salarioBase + comisionVentas + kilometrajeTotal + desplazamientoTotal;
        double retencion = (sueldoBruto * porcIrpf) - seguridaSocial;
        double sueldoNeto = sueldoBruto - retencion;

        System.out.println("Importe de comision de ventas : " + comisionVentas + " Euros");
        System.out.println("Importe de kilometraje : " + kilometrajeTotal + " Euros");
        System.out.println("Importe de desplazamiento : " + desplazamientoTotal + " Euros");

        System.out.println("Salario bruto : " + sueldoBruto + " Euros");
        System.out.println("Importe de retencion : " + retencion + " Euros");
        System.out.println("Salario liquido : " + sueldoNeto + " Euros");
    }
}