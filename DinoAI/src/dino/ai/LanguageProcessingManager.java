/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dino.ai;

import LanguageProcessing.GetOthersSyntacticInformation;
import LanguageProcessing.VerbDetector;
import LanguageProcessing.ConjugationAnalysis;
import ResponseProcessing.FormatResponseText;
import ResponseProcessing.MainProcessing;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Matheus Markies | matheus.markies@gmail.com
 */
public class LanguageProcessingManager extends Thread {

    public static String UserText;
    public static boolean Go;

    public static ConjugationAnalysis CA;
    public static VerbDetector VerbDrive;
    public static GetOthersSyntacticInformation GOSI;
    public static MainProcessing MP;
    public static FormatResponseText FRT;

    public static boolean HumanTesting;

    public void run() {

        new GUI().setVisible(true);

        VerbDrive = new VerbDetector();
        Thread threadVerbDrive = new Thread((Runnable) VerbDrive);
        threadVerbDrive.start();

        System.out.println("Dino Artificial Intelligence");
        System.out.println("Language Processing Manager");

        CA = new ConjugationAnalysis();
        Thread threadDrive = new Thread((Runnable) CA);
        threadDrive.start();

        GOSI = new GetOthersSyntacticInformation();
        Thread threadGOSIDrive = new Thread((Runnable) GOSI);
        threadGOSIDrive.start();

        MP = new MainProcessing();
        Thread threadMPDrive = new Thread((Runnable) MP);
        threadMPDrive.start();

        while (true) {

            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(LanguageProcessingManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
