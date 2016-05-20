/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoclick.KeyListener;

import autoclick.AutoClick;
import static autoclick.AutoClick.fen;
import static autoclick.AutoClick.r;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author RomanitoX
 */
public class ClavierListener implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
//        System.out.println("keyPressed=" + KeyEvent.getKeyText(e.getKeyCode()));
        switch (e.getKeyCode()) {
            case KeyEvent.VK_F2:
                System.out.println(r.actif);
                r.actif = !r.actif;
                break;
            case KeyEvent.VK_ENTER:
                AutoClick.r.setVitesse(Integer.parseInt(fen.jTextField1.getText()));
                System.out.println("Vitesse (ms) = " + AutoClick.r.getVitesse());
                break;
            default:
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
//        System.out.println("keyReleased=" + KeyEvent.getKeyText(e.getKeyCode()));
    }
}
