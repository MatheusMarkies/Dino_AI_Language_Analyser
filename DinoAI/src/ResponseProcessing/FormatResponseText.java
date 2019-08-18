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
public class FormatResponseText extends Thread{
    
    List<String> Text = new ArrayList<String>();
    boolean Analyze;
    boolean Format;
    String TempText = "";
    
    int Index;
    
    List<String> TextFormatted = new ArrayList<String>();
    
    public void run(){
    
        while (true) {            
            
            if(Analyze){
                
                for(int i =0;i<Text.size();i++){
                    
                    for(int e=0;e<Text.get(i).length();e++){
                        
                        char a = '<';
                        char b = '>';
                        
                        if(Text.get(i).charAt(e) == a){
                            Format = true;
                        }
                        if(Text.get(i).charAt(e) == b){
                            Format = false;
                        }
                        if(Format == false){
                            if(Index > 0){
                           TempText = TempText + Text.get(i).charAt(e);
                            }
                            Index ++;
                        }else{
                        Index = 0;
                        }
                        
                    }

                    TextFormatted.add(TempText);
                    TempText = "";
                }

                Analyze = false;
            }
            
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(FormatResponseText.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    public void SetText(List<String> text){
        Text = text;
        
        int f=0;
        if(f == 0){
        for(int i=0;i<TextFormatted.size();i++){
            TextFormatted.remove(i);
        }
        f = 1;
        
        Analyze = true;
    }
    }
   public List<String> GetTextFormatted(){
        
    return TextFormatted;
    }
}
