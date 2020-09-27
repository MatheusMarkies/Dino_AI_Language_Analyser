/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dino.ai;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import static java.lang.System.out;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.IOUtils;

/**
 *
 * @author Matheus Markies
 */
public class DinoAI {

    static String test = "Save our friends take'em back to space";

    public static void main(String[] args) throws IOException {

        LanguageProcessingManager Drive = new LanguageProcessingManager();
        Thread threadDrive = new Thread((Runnable) Drive);
        threadDrive.start();

    }

}
