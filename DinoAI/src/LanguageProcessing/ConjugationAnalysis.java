/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LanguageProcessing;

import DataCenter.ConjugationDataCenter;
import static DataCenter.ConjugationDataCenter.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Matheus Markies
 */
public class ConjugationAnalysis extends Thread{
    
    static List<String> VerbsConjugate = new ArrayList<String>();
    static List<String> SimilarWords = new ArrayList<String>();
    String BaseWord = "";
    
    static boolean Analyze;
    
    String Verbo;
    String Conjugacao;
    String[] R;
    
    public List<String> HistoricVerbs = new ArrayList<String>();
    public List<String> HistoricSemanticInformation = new ArrayList<String>();
    
    int Index = 1;
    boolean FoundWord;
    int t;
    int b;
    
    //Historic:
    
    
    public void run(){
        
        while(true){
            
           if(SimilarWords != null && VerbsConjugate != null){
               Analyze = true;
           }else{
               if(SimilarWords != null || VerbsConjugate != null){
                   System.out.println("Set More Parameters!");
               }
           }
            
        if(Analyze == true){
            //System.out.println("tt");
            if(SimilarWords.size() > 0){
            if(t >= SimilarWords.size()){
                VerbsConjugate = null;
                SimilarWords = null;
                t = 0;
                Analyze = false;
            }
            }
            try{
            for(int e = 0;e<VerbsConjugate.size();e++){
            
            BaseWord = "";
            ConjugationDataCenter CDC = new ConjugationDataCenter();
            
        if(SimilarWords.get(e).length() > 4){
            
            for(int i = 0;i<SimilarWords.get(e).length();i++){
                if(i<(SimilarWords.get(e).length()-Index)){
                    BaseWord = BaseWord + SimilarWords.get(e).charAt(i);
                }
            }
            
            //INDICATIVO
            for(int i=0;i<Presente_EU.length;i++){
            if(VerbsConjugate.get(e).equals(BaseWord+CDC.Presente_EU[i])){
               Verbo =  BaseWord+CDC.Presente_EU[i];
               Conjugacao = "Indicativo*Presente*EU"; 
               FoundWord = true;
                
            }
            }
            for(int i=0;i<Presente_TU.length;i++){
            if(VerbsConjugate.get(e).equals(BaseWord+CDC.Presente_TU[i])){
                Verbo =  BaseWord+CDC.Presente_TU[i];
                Conjugacao = "Indicativo*Presente*TU";
                FoundWord = true;
                 
            }
            }
            for(int i=0;i<Presente_ELE.length;i++){
            if(VerbsConjugate.get(e).equals(BaseWord+CDC.Presente_ELE[i])){
                Verbo =  BaseWord+CDC.Presente_ELE[i];
                Conjugacao = "Indicativo*Presente*ELE";
                FoundWord = true;
                 
            }
            }
            for(int i=0;i<Presente_NOS.length;i++){
            if(VerbsConjugate.get(e).equals(BaseWord+CDC.Presente_NOS[i])){
                Verbo =  BaseWord+CDC.Presente_NOS[i];
                Conjugacao = "Indicativo*Presente*NOS";
                FoundWord = true;
                 
            }
            }
            for(int i=0;i<Presente_VOS.length;i++){
            if(VerbsConjugate.get(e).equals(BaseWord+CDC.Presente_VOS[i])){
                Verbo =  BaseWord+CDC.Presente_VOS[i];
                Conjugacao = "Indicativo*Presente*VOS";
                FoundWord = true;
                 
            }
            }
            for(int i=0;i<Presente_ELES.length;i++){
            if(VerbsConjugate.get(e).equals(BaseWord+CDC.Presente_ELES[i])){
                Verbo =  BaseWord+CDC.Presente_ELES[i];
                Conjugacao = "Indicativo*Presente*ELES";
                FoundWord = true;
                 
            }
            }
            for(int i=0;i<Preterito_Imperfeito_EU.length;i++){
            if(VerbsConjugate.get(e).equals(BaseWord+CDC.Preterito_Imperfeito_EU[i])){
                Verbo =  BaseWord+CDC.Preterito_Imperfeito_EU[i];
                Conjugacao = "Indicativo*Preterito_Imperfeito*EU";
                FoundWord = true;
                 
            }
            }
            for(int i=0;i<Preterito_Imperfeito_TU.length;i++){
            if(VerbsConjugate.get(e).equals(BaseWord+CDC.Preterito_Imperfeito_TU[i])){
                Verbo =  BaseWord+CDC.Preterito_Imperfeito_TU[i];
                Conjugacao = "Indicativo*Preterito_Imperfeito*TU";
                FoundWord = true; 
                
            }
            }
            for(int i=0;i<Preterito_Imperfeito_ELE.length;i++){
            if(VerbsConjugate.get(e).equals(BaseWord+CDC.Preterito_Imperfeito_ELE[i])){
                Verbo =  BaseWord+CDC.Preterito_Imperfeito_ELE[i];
                Conjugacao = "Indicativo*Preterito_Imperfeito*ELE";
                FoundWord = true;
                 
            }
            }
            for(int i=0;i<Preterito_Imperfeito_NOS.length;i++){
            if(VerbsConjugate.get(e).equals(BaseWord+CDC.Preterito_Imperfeito_NOS[i])){
                Verbo =  BaseWord+CDC.Preterito_Imperfeito_NOS[i];
                Conjugacao = "Indicativo*Preterito_Imperfeito*NOS";
                FoundWord = true;
                 
            }
            }
            for(int i=0;i<Preterito_Imperfeito_VOS.length;i++){
            if(VerbsConjugate.get(e).equals(BaseWord+CDC.Preterito_Imperfeito_VOS[i])){
                Verbo =  BaseWord+CDC.Preterito_Imperfeito_VOS[i];
                Conjugacao = "Indicativo*Preterito_Imperfeito*VOS";
                FoundWord = true;
                 
            }
            }
            for(int i=0;i<Preterito_Imperfeito_ELES.length;i++){
            if(VerbsConjugate.get(e).equals(BaseWord+CDC.Preterito_Imperfeito_ELES[i])){
                Verbo =  BaseWord+CDC.Preterito_Imperfeito_ELES[i];
                Conjugacao = "Indicativo*Preterito_Imperfeito*ELES";
                FoundWord = true;
                 
            }
            }
            for(int i=0;i<Preterito_Perfeito_EU.length;i++){
            if(VerbsConjugate.get(e).equals(BaseWord+CDC.Preterito_Perfeito_EU[i])){
                Verbo =  BaseWord+CDC.Preterito_Perfeito_EU[i];
                Conjugacao = "Indicativo*Preterito_Perfeito*EU";
                FoundWord = true;
                 
            }
            }
            for(int i=0;i<Preterito_Perfeito_TU.length;i++){
            if(VerbsConjugate.get(e).equals(BaseWord+CDC.Preterito_Perfeito_TU[i])){
                Verbo =  BaseWord+CDC.Preterito_Perfeito_TU[i];
                Conjugacao = "Indicativo*Preterito_Perfeito*TU";
                FoundWord = true;
                 
            }
            }
            for(int i=0;i<Preterito_Perfeito_ELE.length;i++){
            if(VerbsConjugate.get(e).equals(BaseWord+CDC.Preterito_Perfeito_ELE[i])){
                Verbo =  BaseWord+CDC.Preterito_Perfeito_ELE[i];
                Conjugacao = "Indicativo*Preterito_Perfeito*ELE";
                FoundWord = true;
                 
            }
            }
            for(int i=0;i<Preterito_Perfeito_NOS.length;i++){
            if(VerbsConjugate.get(e).equals(BaseWord+CDC.Preterito_Perfeito_NOS[i])){
                Verbo =  BaseWord+CDC.Preterito_Perfeito_NOS[i];
                Conjugacao = "Indicativo*Preterito_Perfeito*NOS";
                FoundWord = true;
                 
            }
            }
            for(int i=0;i<Preterito_Perfeito_VOS.length;i++){
            if(VerbsConjugate.get(e).equals(BaseWord+CDC.Preterito_Perfeito_VOS[i])){
                Verbo =  BaseWord+CDC.Preterito_Perfeito_VOS[i];
                Conjugacao = "Indicativo*Preterito_Perfeito*VOS";
                FoundWord = true;
                 
            }
            }
            for(int i=0;i<Preterito_Perfeito_ELES.length;i++){
            if(VerbsConjugate.get(e).equals(BaseWord+CDC.Preterito_Perfeito_ELES[i])){
                Verbo =  BaseWord+CDC.Preterito_Perfeito_ELES[i];
                Conjugacao = "Indicativo*Preterito_Perfeito*ELES";
                FoundWord = true;
                 
            }
            }
            for(int i=0;i<Preterito_Mais_perfeito_EU.length;i++){
            if(VerbsConjugate.get(e).equals(BaseWord+CDC.Preterito_Mais_perfeito_EU[i])){
                Verbo =  BaseWord+CDC.Preterito_Mais_perfeito_EU[i];
                Conjugacao = "Indicativo*Preterito_Mais_perfeito*EU";
                FoundWord = true;
                 
            }
            }
            for(int i=0;i<Preterito_Mais_perfeito_TU.length;i++){
            if(VerbsConjugate.get(e).equals(BaseWord+CDC.Preterito_Mais_perfeito_TU[i])){
               Verbo =  BaseWord+CDC.Preterito_Mais_perfeito_TU[i]; 
               Conjugacao = "Indicativo*Preterito_Mais_perfeit*TU";
               FoundWord = true;
                
            }
            }
            for(int i=0;i<Preterito_Mais_perfeito_ELE.length;i++){
            if(VerbsConjugate.get(e).equals(BaseWord+CDC.Preterito_Mais_perfeito_ELE[i])){
               Verbo =  BaseWord+CDC.Preterito_Mais_perfeito_ELE[i]; 
               Conjugacao = "Indicativo*Preterito_Mais_perfeito*ELE";
               FoundWord = true;
                
            }
            }
            for(int i=0;i<Preterito_Mais_perfeito_NOS.length;i++){
            if(VerbsConjugate.get(e).equals(BaseWord+CDC.Preterito_Mais_perfeito_NOS[i])){
                Verbo =  BaseWord+CDC.Preterito_Mais_perfeito_NOS[i];
                Conjugacao = "Indicativo*Preterito_Mais_perfeito*NOS";
                FoundWord = true;
                 
            }
            }
            for(int i=0;i<Preterito_Mais_perfeito_VOS.length;i++){
            if(VerbsConjugate.get(e).equals(BaseWord+CDC.Preterito_Mais_perfeito_VOS[i])){
                Verbo =  BaseWord+CDC.Preterito_Mais_perfeito_VOS[i];
                Conjugacao = "Indicativo*Preterito_Mais_perfeito*VOS";
                FoundWord = true;
                 
            }
            }
            for(int i=0;i<Preterito_Mais_perfeito_ELES.length;i++){
            if(VerbsConjugate.get(e).equals(BaseWord+CDC.Preterito_Mais_perfeito_ELES[i])){
                Verbo =  BaseWord+CDC.Preterito_Mais_perfeito_ELES[i];
                Conjugacao = "Indicativo*Preterito_Mais_perfeito*ELES";
                FoundWord = true;
                 
            }
            }
            for(int i=0;i<Futuro_Presente_EU.length;i++){
            if(VerbsConjugate.get(e).equals(BaseWord+CDC.Futuro_Presente_EU[i])){
                Verbo =  BaseWord+CDC.Futuro_Presente_EU[i];
                Conjugacao = "Indicativo*Futuro_Presente_EU";
                FoundWord = true; 
                
            }
            }
            for(int i=0;i<Futuro_Presente_TU.length;i++){
            if(VerbsConjugate.get(e).equals(BaseWord+CDC.Futuro_Presente_TU[i])){
               Verbo =  BaseWord+CDC.Futuro_Presente_TU[i]; 
               Conjugacao = "Indicativo*Futuro_Presente*TU";
               FoundWord = true;
                
            }
            }
            for(int i=0;i<Futuro_Presente_ELE.length;i++){
            if(VerbsConjugate.get(e).equals(BaseWord+CDC.Futuro_Presente_ELE[i])){
               Verbo =  BaseWord+CDC.Futuro_Presente_ELE[i]; 
               Conjugacao = "Indicativo*Futuro_Presente*ELE";
               FoundWord = true;
                
            }
            }
            for(int i=0;i<Futuro_Presente_NOS.length;i++){
            if(VerbsConjugate.get(e).equals(BaseWord+CDC.Futuro_Presente_NOS[i])){
                Verbo =  BaseWord+CDC.Futuro_Presente_NOS[i];
                Conjugacao = "Indicativo*Futuro_Presente*NOS";
                FoundWord = true;
                 
            }
            }
            for(int i=0;i<Futuro_Presente_VOS.length;i++){
            if(VerbsConjugate.get(e).equals(BaseWord+CDC.Futuro_Presente_VOS[i])){
               Verbo =  BaseWord+CDC.Futuro_Presente_VOS[i]; 
               Conjugacao = "Indicativo*Futuro_Presente*VOS";
               FoundWord = true;
                
            }
            }
            for(int i=0;i<Futuro_Presente_ELES.length;i++){
            if(VerbsConjugate.get(e).equals(BaseWord+CDC.Futuro_Presente_ELES[i])){
                Verbo =  BaseWord+CDC.Futuro_Presente_ELES[i];
                Conjugacao = "Indicativo*Futuro_Presente*ELES";
                FoundWord = true;
                 
            }
            }
            for(int i=0;i<Futuro_Preterito_EU.length;i++){
            if(VerbsConjugate.get(e).equals(BaseWord+CDC.Futuro_Preterito_EU[i])){
                Verbo =  BaseWord+CDC.Futuro_Preterito_EU[i];
                Conjugacao = "Indicativo*Futuro_Preterito*EU";
                FoundWord = true;
                 
            }
            }
            for(int i=0;i<Futuro_Preterito_TU.length;i++){
            if(VerbsConjugate.get(e).equals(BaseWord+CDC.Futuro_Preterito_TU[i])){
                Verbo =  BaseWord+CDC.Futuro_Preterito_TU[i];
                Conjugacao = "Indicativo*Futuro_Preterito*TU";
                FoundWord = true;
                 
            }
            }
            for(int i=0;i<Futuro_Preterito_ELE.length;i++){
            if(VerbsConjugate.get(e).equals(BaseWord+CDC.Futuro_Preterito_ELE[i])){
                Verbo =  BaseWord+CDC.Futuro_Preterito_ELE[i];
                Conjugacao = "Indicativo*Futuro_Preterito*ELE";
                FoundWord = true;
                 
            }
            }
            for(int i=0;i<Futuro_Preterito_NOS.length;i++){
            if(VerbsConjugate.get(e).equals(BaseWord+CDC.Futuro_Preterito_NOS[i])){
                Verbo =  BaseWord+CDC.Futuro_Preterito_NOS[i];
                Conjugacao = "Indicativo*Futuro_Preterito*NOS";
                FoundWord = true;
                 
            }
            }
            for(int i=0;i<Futuro_Preterito_VOS.length;i++){
            if(VerbsConjugate.get(e).equals(BaseWord+CDC.Futuro_Preterito_VOS[i])){
                Verbo =  BaseWord+CDC.Futuro_Preterito_VOS[i];
                Conjugacao = "Indicativo*Futuro_Preterito*VOS";
                FoundWord = true;
                 
            }
            }
            for(int i=0;i<Futuro_Preterito_ELES.length;i++){
            if(VerbsConjugate.get(e).equals(BaseWord+CDC.Futuro_Preterito_ELES[i])){
                Verbo =  BaseWord+CDC.Futuro_Preterito_ELES[i];
                Conjugacao = "Indicativo*Futuro_Preterito*ELES";
                FoundWord = true;
                 
            }
            }
           
            if(Verbo == null){
                //System.out.println("-----------------------------------------");
                //System.out.println("Error");
                //System.out.println("Verbo: "+Verbo);
                //System.out.println("");
                //System.out.println("VerbsConjugate.get(e): "+VerbsConjugate.get(e));
                //System.out.println("-----------------------------------------");
                Index += 1;
            }else{
          if(FoundWord == true){
          System.out.println("");
          System.out.println("Verbo: "+Verbo);
          R = Conjugacao.split("\\"+"*");
          System.out.println("Modo: "+R[0]);
          System.out.println("Tempo: "+R[1]);
          System.out.println("Pessoa: "+R[2]);
          
          HistoricVerbs.add(Verbo);
          for(int g=0;g<R.length;g++){
          HistoricSemanticInformation.add(R[g]);
          }
          
          t++;
          BaseWord = "";
          Verbo = null;
          //VerbsConjugate.remove(e);
          //SimilarWords = null;
          FoundWord = false;
            }
           }
          
        }
                if(FoundWord == false && SimilarWords != null){
                if((SimilarWords.get(e).length() - Index)<=0){
                    t++;
                System.out.println("");
                System.out.println("[ConjugationAnalysis] "+"'"+SimilarWords.get(e)+"'"+" Word not found");
                BaseWord = "";
                Verbo = null;
                //VerbsConjugate.remove(e);
                //SimilarWords = null;
                FoundWord = false;
                Index = 1;
                }
                }
          
        }//FOR
            }catch(Exception e){
                
            }
            
        }else{
        Index = 1;
        }
        
            try {
                //Analyze = false;

                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(ConjugationAnalysis.class.getName()).log(Level.SEVERE, null, ex);
            }
    
        }
        
    }
    
    public void SetVerb(List<String> SetValue){
        VerbsConjugate = SetValue;
       //FoundWord = false;
    }
    public void SetSimilarWord(List<String> SetValue){
        SimilarWords = SetValue;
    }
    
   public String GetVerb(){
    return Verbo;
    }
   public String GetVerbalModes(){
   return R[0];
   }
   public String VerbTense(){
   return R[1];
   }
   public String GetPerson(){
   return R[2];
   } 
   
}
