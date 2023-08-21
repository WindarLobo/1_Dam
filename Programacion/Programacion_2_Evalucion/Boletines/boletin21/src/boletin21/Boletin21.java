package boletin21;

public class Boletin21 {

    public static void main(String[] args) {
        // Boletin21_1 boletin = new Boletin21_1();
        //boletin.arraysNumero();
        try {

            Boletin21_2 boletin2 = new Boletin21_2();
            boletin2.arraysModuloProgramacion();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
    //Boletin21_4 boletin4 = new Boletin21_4();
    // boletin4.arraysCalculoNif();
}
