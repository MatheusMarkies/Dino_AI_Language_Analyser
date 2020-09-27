/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResponseProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Matheus Markies
 */
public class FormatResponseText extends Thread {

    public List<String> FormatText(List<String> text) {

        int Index = 0;
        List<String> TextFormatted = new ArrayList<String>();
        
        boolean Format = false;
        String TempText = "";

        for (int i = 0; i < text.size(); i++) {

            for (int e = 0; e < text.get(i).length(); e++) {

                char a = '<';
                char b = '>';

                if (text.get(i).charAt(e) == a) {
                    Format = true;
                }
                if (text.get(i).charAt(e) == b) {
                    Format = false;
                }
                if (Format == false) {
                    if (Index > 0) {
                        TempText = TempText + text.get(i).charAt(e);
                    }
                    Index++;
                } else {
                    Index = 0;
                }

            }

            String toLowerCase = TempText.toLowerCase();
            toLowerCase = toLowerCase.replaceAll("brasil", "");
            TempText = "";
            String Stext = toLowerCase;

                    char a = '[';
                    char b = ']';
                    
                    for(int u =0;u<Stext.length();u++)
                    if(Stext.charAt(u) == a || Stext.charAt(u) == b)
                    TempText = TempText;
                    else
                    TempText = TempText + Stext.charAt(u);
                    List<String> split = new ArrayList<String>();
                    String[] Split = TempText.split("\\r?\\n");
                    for(String y : Split)
                    split.add(y);
                    
                    for(int o =0;o<split.size();o++)
                    if(o == 0 || o > 1)
                    TextFormatted.add(split.get(o).replace('.', ' '));
                    else
                    TextFormatted.add(split.get(o));
                    
        }

        return TextFormatted;
    }

}
