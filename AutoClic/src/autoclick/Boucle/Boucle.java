/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoclick.Boucle;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RomanitoX
 */
public class Boucle {

    public Boucle() {

    }

    public static void goTour() {
        new Thread(new Runnable() {

            @Override
            public void run() {

                while (true) {
                    try {
                        Thread.sleep(16);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Boucle.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if (autoclick.AutoClick.r.actif) {
                        try {
                            autoclick.AutoClick.goRobot();
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Boucle.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }
        }).start();
    }
}
