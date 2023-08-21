package boletin21;

public class Boletin21_1 {

    public void arraysNumero() {

        int numeros[] = new int[6];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) Math.round(Math.random() * 50 + 1);
        }
               System.out.print("\n El  array : ");
        for (int leatorio : numeros) {
            System.out.print(leatorio + "  ");
        }
        System.out.print("\n Array alreves : ");
        for (int i = 5; i >= 0; i--) {
            System.out.print(" " + numeros[i] + " ");
        }
    }
}

   