/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LanguageProcessing;

import DataCenter.Verbs;
import dino.ai.LanguageProcessingManager;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Matheus Markies
 */
public class VerbDetector extends Thread{

    String Text;
    String[] TextParts;
    
    List<String> SimilarVerbs = new ArrayList<String>();
    List<String> TextVerbs = new ArrayList<String>();
    
    List<Integer> VerbsPositions = new ArrayList<Integer>();
    int TempPosition;
    
    boolean Analyze;
    
    int TempPoints;
    int Points;
    
    int b;
    
    String Word;
    String BaseWord;
    int Proof;
    
    public void run(){
       
        while (true){          
        if(Analyze){
     
    Verbs vl = new Verbs();
    Text = Text.toLowerCase();
    TextParts = Text.split(" ");
    
    for(int g=0;g<vl.VerbsList.length;g++){
        BaseWord = "";
        if(vl.VerbsList[g].length() > 4){
       for(int i = 0;i<vl.VerbsList[g].length();i++){
                if(i<(vl.VerbsList[g].length()-2)){
                    BaseWord = BaseWord + vl.VerbsList[g].charAt(i);
                }
            }
        }else{
            //BaseWord = vl.VerbsList[g];
        }
        
        for(int h=0;h<TextParts.length;h++){
            
            //if(TextParts[h].length()>vl.VerbsList[g].length()){
                for(int j =0;j<BaseWord.length();j++){
 
                  try{
                  if(BaseWord.charAt(j) == TextParts[h].charAt(j)){
                      //System.out.println("BaseWord "+BaseWord);
                      //System.out.println("TextParts "+TextParts[h]);
                      //System.out.println("Tamanho TextParts: " + TextParts.length);
                      //System.out.println("Tamanho VerbsList: "+vl.VerbsList.length);
                      
                      //System.out.println("h "+h);
                       TempPoints += 1;
                  }else{

                  }
                  }catch(Exception e){
                      TempPoints = 0;
                      j++;
                  }

                }
                
            //}else{
             //   for(int j =0;j<TextParts[h].length();j++){
               //   try{
                //    if(TextParts[h].charAt(j) == vl.VerbsList[g].charAt(j)){
                //       TempPoints += 1; 
                 // }
                 // }catch(Exception e){
                   //   TempPoints = 0;
                  //    j++;
                  //}
                //}
            //}
            //Ciclo Text Parts
            
            if(TempPoints > Points){
            Word = TextParts[h];
            TempPosition = h;
            Points = TempPoints;
            TempPoints = 0;
            //BaseWord = "";
            }else{
            TempPoints = 0;
            //BaseWord = "";
            }
             //System.out.println("h "+h);
 
            
       }
  
        //Ciclo de Verbal List
        if(vl.VerbsList[g].length() > 2){
        Proof = (100*Points)/(vl.VerbsList[g].length() - 2);
        
        //System.out.println("Word "+Word);
        if(Word != null){
        int a = (vl.VerbsList[g].length() - 2)+8;
        if(a < Word.length()){
            Proof = 0;
        }
        }
        }else{
        Proof = (100*Points)/(vl.VerbsList[g].length());
        }
        
        if(Proof >= 100){
            //System.out.println("Proof: "+Proof);
            for(int i = 0;i<SimilarVerbs.size();i++){
                if(SimilarVerbs.get(i) == vl.VerbsList[g]){
                    b +=1;
                }
            }
            if(b == 0){
            SimilarVerbs.add(vl.VerbsList[g]);
            TextVerbs.add(Word);
            VerbsPositions.add(TempPosition);
            
            System.out.println("[VerbDetector] "+SimilarVerbs);
            
            }else{
             b = 0;
            }
            Points = 0;
        }else{
            Points = 0;
        }
        
    }
    
    //for(int i=0;i<SimilarVerbs.size();i++){
    //ConjugationAnalysis CA = new ConjugationAnalysis();
    LanguageProcessingManager.CA.SetSimilarWord(SimilarVerbs);
    LanguageProcessingManager.CA.SetVerb(TextVerbs);
    //}
    
    LanguageProcessingManager.GOSI.SetText(Text);
    int size = VerbsPositions.size();
    int[] result = new int[size];
    Integer[] temp = VerbsPositions.toArray(new Integer[size]);
    for (int n = 0; n < size; ++n) {
    result[n] = temp[n];
    }
    LanguageProcessingManager.GOSI.SetVerbsPositions(result);
   
    
        Analyze = false;    
        }//Analyze 
        
                    try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(VerbDetector.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
    
    }

    public void SetTextAnalyze(String SetValue){
        Text = SetValue;

        int f=0;
        if(f == 0){
        for(int i=0;i<TextVerbs.size();i++){
            TextVerbs.remove(i);
        }
        for(int i=0;i<SimilarVerbs.size();i++){
            SimilarVerbs.remove(i);
        }
        f = 1;
        }
        
        Analyze = true;
    }
    public List<String> GetSimilarVerbs(){
    return SimilarVerbs;
    }
    public List<String> GetVerbs(){
    return TextVerbs;
    }
    public int[] GetVerbsPosition(){
        
    int size = VerbsPositions.size();
    int[] result = new int[size];
    Integer[] temp = VerbsPositions.toArray(new Integer[size]);
    for (int n = 0; n < size; ++n) {
    result[n] = temp[n];
    }
        
    return result;
    }
    
}
