package boletin13;

import com.windar.otropaquete.Personal;
import javax.swing.JOptionPane;

public class Academia {

    //ARIBUTO
    public static int numReferencia = 2018;
    private String nome;
    private int nota;
    private Personal alumno;

    public Academia() {
        numReferencia++;

    }

    public Academia(String nome, int nota, Personal alumno) {
        Academia.numReferencia++;
        this.nome = nome;
        this.nota = nota;
        this.alumno = alumno;

    }

    @Override
    public String toString() {

        return "nome = " + nome + "nota = " + nota + alumno;

    }

    public void darValorNome(String nome) {
        this.nome = nome;
    }

    public String devolverValorNome() {
        return nome;

  
    }

    public void darValorAlumno(Personal alumno) {
        this.alumno = alumno;
    }

    public Personal devolverValorAlumno() {
        return alumno;

    }
       public int devolverValorNota() {
        do{
        nota=Integer.parseInt(JOptionPane.showInputDialog("tecle la nota"));
        }while(nota<0 || nota>10);
        return nota;
    }

}
