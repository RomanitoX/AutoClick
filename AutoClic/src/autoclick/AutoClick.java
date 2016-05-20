/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoclick;

import autoclick.Boucle.Boucle;
import autoclick.KeyListener.ClavierListener;
import autoclick.Robot.Robot;
import autoclick.View.Fenetre;
import java.awt.AWTException;
import java.awt.event.InputEvent;

/**
 *
 * @author RomanitoX
 */
public class AutoClick {

    public static Fenetre fen;
    public static Robot r;

    public static void main(String[] args) throws InterruptedException, AWTException {
        fen = new Fenetre();
        fen.setVisible(true);
        fen.setFocusable(true);
        fen.setAlwaysOnTop(true);
        init();
        fen.addKeyListener(new ClavierListener());
        fen.jTextField1.addKeyListener(new ClavierListener());
        Boucle.goTour();
        }

    public static void goRobot() throws InterruptedException {
        try {
            java.awt.Robot robot = new java.awt.Robot();
            while (r.actif) {
                Thread.sleep(r.vitesse);
                robot.mousePress(InputEvent.BUTTON1_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_MASK);
            }
        } catch (AWTException e) {
        }
    }
    

    public static void init() {
        r = new Robot();
        r.setVitesse(Integer.parseInt(fen.jTextField1.getText()));
    }
}
