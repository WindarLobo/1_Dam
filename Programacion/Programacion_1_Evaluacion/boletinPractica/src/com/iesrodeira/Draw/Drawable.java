package com.iesrodeira.Draw;

public class Drawable {

    public enum Direction {
        
        LEFTRIGHT, RIGHTLEFT, UPDOWN, DOWNUP
    };

    public void Point(Point p, int y, int x, int cor) {
        System.out.println("Dibujando en un punto " + p + y + x + cor );
    }

   public void   point(Point p, int cor) {
       
    }

   

    public void drawText(int y, int x, String text, Direction direction) {
        System.out.print("Debuxando '" + text + " dende " + new Point(y, x) + " na dirección " + direction);
    }

    public void drawText(Point p, String text, Direction direction) {
        drawText(p.y, p.x, text, direction);
    }

    public void drawText(int y, int x, String text) {
        drawText(y, x, text, Direction.LEFTRIGHT);
    }

    public void drawText(Point p, String text) {
        drawText(p.y, p.x, text);
    }

    public void drawLine(int y, int x, int y1, int x1, int cor) {
        if (y == y1) {
            if (x <= x1) {
                drawLineHorizontal(y, x, x1, cor);
            } else {
                drawLineHorizontal(y, x1, x, cor);
            }
        } else if (x == x1) {
            if (y <= y1) {
                drawLineVertical(y, x, y1, cor);
            } else {
                drawLineVertical(y1, x, y, cor);
            }
        } else {
            System.out.println("Debuxando unha liña de cor " + cor + " dende " + new Point(y, x) + " a " + new Point(y1, x1));
        }
    }

    public void drawLine(Point origin, Point dest, int cor) {
        drawLine(origin.y, origin.x, dest.y dest.x,  cor);
    }

   

    protected void drawLineHorizontal(int y, int x, int x1, int cor) {
        throw new UnsupportedOperationException("Non implementada");
    }

    protected void drawLineVertical(int y, int x, int y1, int cor) {
        throw new UnsupportedOperationException("Non implementada");
    }

    public void clear() {
        throw new UnsupportedOperationException("Non implementada");
    }

    public void show() {
        throw new UnsupportedOperationException("Non implementada");
    }
}
