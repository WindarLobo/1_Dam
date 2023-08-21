package repaso1;

import javax.swing.JOptionPane;

public class Repaso1 {

    public static void main(String[] args) {
        // bucle1();
        //bucle2();
        // bucle3();
        //bucle4();
        //bucle5();
        //bucle6();
        // bucle7();
        //bucle8();
        // bucle9();
        //bucle10();
        bucle11();
        // bucle12();

    }

    private static void bucle1() {
        int numero = 5;
        for (int i = 0; i < numero; i++) {
            JOptionPane.showMessageDialog(null, "Esto es un bucles");
            System.out.println(i);
        }
    }

    private static void bucle2() {
        int i = 0;
        int numero;
        do {

            numero = Integer.parseInt(JOptionPane.showInputDialog(" Introduce un nuemro "));
            System.out.println(numero);
            i++;
        } while (i < 5);

    }

    private static void bucle3() {

        int i = 0;
        int numero;
        do {

            numero = Integer.parseInt(JOptionPane.showInputDialog(" Introduce un nuemro "));
            System.out.println(numero);
            i++;
        } while (numero != 0);

    }

    private static void bucle4() {

        int numero = 4;
        int usuario;

        for (int i = 0; i < numero; i++) {
            usuario = Integer.parseInt(JOptionPane.showInputDialog(" Introduce un nuemro "));
            if (usuario > 0) {
                System.out.println(usuario);
            }

        }

    }

    private static void bucle5() {
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog(" Introduce un nuemro "));
            sum += numero;
            System.out.println(sum);

        }

    }

    private static void bucle6() {

        double ladoCuadrado = Double.parseDouble(JOptionPane.showInputDialog(" Introduce el lado de un cuadrado "));
        double area = ladoCuadrado * ladoCuadrado;
        System.out.println("EL area d e un cuadrado es : " + area);

    }

    private static void bucle7() {

        double ladoCuadrado;
        do {
            ladoCuadrado = Double.parseDouble(JOptionPane.showInputDialog(" Introduce el lado de un cuadrado "));
            if (ladoCuadrado > 0) {
                double area = ladoCuadrado * ladoCuadrado;
                System.out.println("EL area d e un cuadrado es : " + area);
                break;
            } else {
                System.out.println("Introduce el lado del cuadrado que sea  positivo ");
            }

        } while (ladoCuadrado < 0);

    }

    private static void bucle8() {
        double ladoCuadrado;

        do {

            ladoCuadrado = Double.parseDouble(JOptionPane.showInputDialog(" Introduce el lado de un cuadrado "));
            if (ladoCuadrado > 0) {
                double area = ladoCuadrado * ladoCuadrado;
                System.out.println("EL area d e un cuadrado es : " + area);
            }

        } while (ladoCuadrado > 0);
    }

    private static void bucle9() {
        int i = 0;
        int numero;
        int sum = 0;
        do {

            numero = Integer.parseInt(JOptionPane.showInputDialog(" Introduce un nuemero "));

            sum += numero;

        } while (sum < 100);
        System.out.println(sum);
    }

    private static void bucle10() {
        int modulo = 6;
        double notaTota;
        double nota = 0;

        String sistema;

        do {
            sistema = JOptionPane.showInputDialog(null, " Quieres calcular una  nota ?(si/no) ");
            if (sistema.toUpperCase().equals("SI")) {
                for (int i = 0; i < 6; i++) {

                    nota += Double.parseDouble(JOptionPane.showInputDialog(" Introduce una nota "));

                }
                notaTota = (nota) / modulo;
                if (notaTota > 5) {

                    System.out.println("La nota es : " + notaTota + "Has aprobado");

                } else {
                    System.out.println(" No has aprobado ");
                }

            }
        } while (sistema.toUpperCase().equals("SI"));

    }

    private static void bucle11() {
        int media = 6;
        double notaTotal;
        double nota = 0;

        int alumno = 0;
        JOptionPane.showMessageDialog(null, " ****** Programa para calcular la nota ****** ");

        for (int i = 1; i <= 3; i++) {
            nota=0;
            for (int x = 0; x < 6; x++) {

                nota += Double.parseDouble(JOptionPane.showInputDialog(" Introduce una nota del  alumno " +  i  ));
            }
            notaTotal = (nota) / media;
            if (notaTotal >= 5) {

                System.out.println("El alumno " + i + " Nota media es " + notaTotal + "  Has aprobado");

            } else {
                System.out.println("El alumno " + i + " Nota media es " + notaTotal + " no has aprobado");
            }

        }
    }
}

    





/* 1)Sacar por consola 5 veces a frase “ isto e un bucle 
2) visualizar   5 números  que pides por teclado 
3) visualiza varios números que pides por teclado , remata cando premes o cero 
4) visualiza 4 numeros   que entren por teclado . Os números non poden ser negativos 
5)completa o exercicio anterior visualizando ademáis a suma dos 4 números
6) Calcula o área dun cadrado . O valor do lado o pides por teclado
7) Codifica o programa anterior tendo en conta que o lado non pode ser negativo .
8) Completa o programa anterior para que calcule o área de varios cadrados .
Remata o programa cando o valor do lado sexa 0 ( condición de fin ).
9)Sumar unha serie de números que pedimos por teclado . Cando a suma sexa 100 ou superior visualizamos o resultado 

10) Calcula a nota media  de un alumno que ten 6 módulos 

11) Supon que nunha clase están 3 alumnos . Calcula a nota media para cada un dos alumnos .

12)- Queremos codificar un programa que calcule a nota media de unha serie de
alumnos. Como en cada unha das clases ,o nº de alumnos é distinto .
Cando rematemos de visualizar unha media  preguntamos se queremos repetir o proceso . 
se  a resposta e “si” volvemos a empezar co 2º …. E así con todos ata que a resposta
sexa distinta de “si”.*/
