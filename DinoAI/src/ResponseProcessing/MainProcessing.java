/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResponseProcessing;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author Matheus Markies
 */
public class MainProcessing extends Thread{
    
    String DictionaryLink = "https://www.dicio.com.br/";
    String Doubt;
    boolean Analyze;
    
    boolean isDoubtful;
    
    Document doc;
    
    List<String> Texts = new ArrayList<String>();
    
    public void run(){
        
        while (true) {            
         
            //if(Analyze){
                
                if(isDoubtful){
                String url = DictionaryLink + Doubt+"/";
                try {
                    doc = Jsoup.connect(url).get();
                } catch (IOException ex) {
                    Logger.getLogger(MainProcessing.class.getName()).log(Level.SEVERE, null, ex);
                }
               Elements paragraphs = doc.select("p");
               Element firstParagraph = paragraphs.first();
               
               Elements text = firstParagraph.select("span");
               Texts.add(text.toString());
                        
               dino.ai.LanguageProcessingManager.FRT.SetText(Texts);
               
                try {
                    Thread.sleep(1);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MainProcessing.class.getName()).log(Level.SEVERE, null, ex);
                }
               
                System.out.println(dino.ai.LanguageProcessingManager.FRT.GetTextFormatted());
                
                
                
               isDoubtful = false;  
            }
            
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(MainProcessing.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
    
    public void SetDoubt(String setDoubt){
        
        Doubt = setDoubt;
        isDoubtful = true;
    }
    public List<String> GetTextAnswer(){
        
    return Texts;
    }
    
}
