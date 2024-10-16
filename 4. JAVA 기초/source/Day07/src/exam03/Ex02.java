package exam03;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ex02 implements MouseListener{
    @Override
    public void mouseClicked(MouseEvent e) {
        int xPoint = e.getX();
        int yPoint = e.getY();
        System.out.println(xPoint + ", " + yPoint);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
