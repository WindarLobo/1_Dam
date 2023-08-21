package arrayUtiles;
import javax.swing.JOptionPane;
public class Aplicacion {

    public static void main(String[] args) {
        //  apliacion1();
        // aplicacion2();
        aplicacion3();

    }

    private static void apliacion1() {
        System.out.println("Aplicacion 1");

        int crear[] = new int[6];
        for (int i = 0; i < crear.length; i++) {
            crear[i] = i;
        }
        for (int i = 0; i < crear.length; i++) {
            System.out.println(i);
        }
    }

    private static void aplicacion2() {
        System.out.println("Aplicacion 2");
        int pedirDatos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del array: "));
        int[] crear = new int[pedirDatos];
        int datos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los datos del array: "));
        for (int i = 0; i < pedirDatos; i++) {
            crear[i] = datos;
        }

        ArrayUtiles ver = new ArrayUtiles();
        ver.visualizar(crear);
    }

    private static void aplicacion3() {
        int cantidad = 12;
        int nuemeroConsulta = 5;
        int numero[] = new int[cantidad];
        for (int i = 0; i < numero.length; i++) {
            int numeroAleatorio = (int) (Math.random() * 30 + 1);
            numero[i] = numeroAleatorio;
        }

        ArrayUtiles ver = new ArrayUtiles();
        System.out.println(ver.visualizar(numero));

        ArrayUtiles contar = new ArrayUtiles();
        System.out.println("\n Se encontro " + contar.contar(numero) + " veces el nuemro 3 ");

        ArrayUtiles order = new ArrayUtiles();
        System.out.println("\n Arrays ordenado : \n " + order.Ordenar(numero));
        
        ArrayUtiles consulta= new ArrayUtiles();
        System.out.println("\n Se encontro " + consulta.contarNumero(numero) +" veces el nuemro 5");

    }

}
