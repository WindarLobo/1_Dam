
package ejemploeherdanza;


public class Ejemploeherdanza {

   
    public static void main(String[] args) {
       
       
     Profesor profesor= new Profesor("Ciencias","Windar", "carregal");
        //System.out.println(profesor.toString());
       // profesor.setNome("Maria");
        //System.out.println(profesor.getNome());
        //Estudiante estu= new Estudiante("Windar","Vigo","DanielCastelao","8");
        //System.out.println(estu.toString());
        EstudianteInternacional Ei= new EstudianteInternacional("Adrian","Pontevedra","Eu","3","España");
        System.out.println(Ei.toString());
     
        
       
    }
    
}
