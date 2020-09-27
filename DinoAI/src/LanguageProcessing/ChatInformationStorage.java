/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LanguageProcessing;

import static dino.ai.LanguageProcessingManager.HumanTesting;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Matheus Markies
 */
public class ChatInformationStorage extends Thread {

    String Name;
    String[] Creator;

    //personal informations
    public void run() {
        while (true) {

            if (HumanTesting) {

                Name = null;
                Creator = null;

            } else {
                Name = "Dino";
                Creator[0] = "Matheus Markies";
            }

            if (Creator == null) {

            }

            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(ChatInformationStorage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
