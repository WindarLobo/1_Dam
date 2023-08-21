package graficos;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;


public class PruebaImagenes extends JFrame {
    public PruebaImagenes() {
        setTitle("Marcocon iamgenes");
        setBounds(700, 300, 600, 400);
        LaminaImagenes milamina = new LaminaImagenes();
        add(milamina);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}

class LaminaImagenes extends JPanel {
    private Image imagen,imagen2;
    public LaminaImagenes(){
        try {
            //  imagen = ImageIO.read(new File("src/graficos/m.jpg"));
            imagen2 = ImageIO.read(new File("src/graficos/a.jpg"));
        } catch (IOException e) {
            System.out.println("La imagen no se encuentra");
        }

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //File miImagen = new File("src/graficos/m.jpg");

       // g.drawImage(imagen, 80, 70, null);
        int anchuraImagen= imagen2.getWidth(this);// para cualquier imagen
        int alturaImagen= imagen2.getHeight(this);// para cualquier imagen
        g.drawImage(imagen2, 0, 0, null);
        for(int i=0;i<300;i++){
            for(int j=0;j<200;j++){
                if(i+j>0) {
                    g.copyArea(0, 0, anchuraImagen, alturaImagen, anchuraImagen * i, alturaImagen * j);
                }
            }
        }
    }


}
