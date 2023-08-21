package graficos;

import javax.swing.*;
import java.awt.*;

public class CreandoMarcoCentrado extends JFrame {
    public CreandoMarcoCentrado(){
        Toolkit miPantalla=Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla= miPantalla.getScreenSize();// almacenamos tamaño pantalla
        int alturaPantalla=tamanoPantalla.height;//Alto
        int anchoPantalla=tamanoPantalla.width;//Ancho
        setSize(anchoPantalla/2,alturaPantalla/2);//altura  entre 2 y ancho entre 2
        setLocation(anchoPantalla/4,alturaPantalla/4);//centrado
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);//Que sea visible
        setTitle("Marco centrado");
       Image miIcono=miPantalla.getImage("src/graficos/icono.jpg");
       setIconImage(miIcono);


    }

}
