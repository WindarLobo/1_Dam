package boletin20;

public class Guacamayo extends Aves implements IPodeCaminar, IPodeVolar {

    @Override
    public void Caminar() {
        System.out.println("Camina");
    }

    @Override
    public void volar() {
        System.out.println("Puede volar");

}
}
