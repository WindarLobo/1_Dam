package ejemploarrays;

import javax.swing.JOptionPane;

public class EjemploArrays {

    public static void main(String[] args) {
        MetodosArrays metodo = new MetodosArrays();
        float[] aux = null;
        int opcion;
        do {
            //aux = metodo
            //crearArraysFloat();
            //metodo.mostrarArrayz(aux);
            //metodo.mostrarArrayzPorPosicion(aux, 0);
            //metodo.mostrarArrayForech(aux);
            opcion = Integer.parseInt(JOptionPane.showInputDialog("***** MENU *****\n1--> Crear ARRAY \n2 ---> "
                    + "MOSTRAR\n3 ---> BUSQUEDA \n4 ----> ORDENAR \n5 ----> INSETAR \n6 ---> BORRAR "));

            switch (opcion) {
                case 1:
                    aux = metodo.crearArraysFloat();
                    break;
                case 2:
                    metodo.mostrarArrayForech(aux);
                    break;
                case 3: metodo.pedirTemperatura(aux);
                break;
                
                case 4: metodo.ordenarTemperatura(aux);
                break;
                
                case 5 :
                    break;
                    
                    case 6 :
                    break;
            }
            }while (opcion <= 4);
        
    }

}
