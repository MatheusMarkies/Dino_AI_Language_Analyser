/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LanguageProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Matheus Markies
 */
public class GetOthersSyntacticInformation extends Thread{
    
    String Text;
    String[] TextParts;
    
    int[] VerbsPositions = null;
    boolean Analyze;
    List<String> TextSubjects = new ArrayList<String>();
    
    public void run(){
        while (true) {       
          if(Analyze == true){
          
          
        
          Analyze = false;
          }
        
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(GetOthersSyntacticInformation.class.getName()).log(Level.SEVERE, null, ex);
            }
          
        }
        
    }
    
    public void SetText(String SetValue){
    Text = SetValue;
    Analyze = true;
    }
    public void SetVerbsPositions(int[] SetValue){
    VerbsPositions = SetValue;
    }
    
}
