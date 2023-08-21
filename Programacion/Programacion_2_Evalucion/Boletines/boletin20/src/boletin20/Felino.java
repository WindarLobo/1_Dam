package boletin20;

public class Felino  extends Mamiferos implements IPodeCaminar,IPodeNadar{

    @Override
    public void nadar() {
        System.out.println("Puede nadar");
    }
    
    
}
