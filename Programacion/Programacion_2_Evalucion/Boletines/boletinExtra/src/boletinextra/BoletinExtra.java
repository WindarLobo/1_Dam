package boletinextra;

import com.windar.datos.PedirDatos;



public class BoletinExtra {

    public static void main(String[] args) {

        int opcion = 0;
      
        Impresora impresoras = new Impresora();
          String datos="" ;
         

        do {
            try {

                opcion = PedirDatos.pedirInt("***** MENU *****\n1--> Introducir \n2 ---> "
                        + " Imprimir \n3 ---> Mostrar \n4 ----> Ordenar \n5---> "
                        + "Salir ");

                switch (opcion) {
                    case 1: 
                       
                       impresoras.encolar(datos);
                    
                    break;

                    case 2:
                        impresoras.desenColar();
                        break;
                    case 3:
                        impresoras.mostrar(impresoras.Cola);
                        break;

                    case 4:

                        impresoras.ordenar(impresoras.Cola);
                        break;

                    default:

                        System.out.println("Salir");

                        break;

                }
            } catch (Exception ex) {
                System.out.println("Error impresora vacia ");
            }

        } while (opcion < 5);
    }
}
