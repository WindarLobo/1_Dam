package boletin20;

public class Boletin20 {

    public static void main(String[] args) {
        System.out.println("El gato:");
        Gato gat = new Gato();
        gat.Caminar();
        gat.nadar();

        System.out.println(" \nEl guacamayo :");

        Guacamayo gua = new Guacamayo();
        gua.Caminar();
        gua.volar();
        

        System.out.println(" \n El mamifero");
        Mamiferos mami = new Mamiferos();
        mami.Caminar();

      

        System.out.println("\nEl Avestrus:");
        Avestruz aves = new Avestruz();
        aves.Caminar();
        
      

        System.out.println("\nEl Murcielago:");
        Murcielago mur = new Murcielago();
        mur.Caminar();
        mur.volar();

        System.out.println("\nEl felino: ");
        Felino fel = new Felino();
        fel.Caminar();
        fel.nadar();

        System.out.println("\nEl tigre: ");
        Tigre tig = new Tigre();
        tig.Caminar();
        tig.nadar();

    }

}
