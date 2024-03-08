/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Q2 {
    //Change the name of input and output file based on practical paper
    String inputFile = "input.txt";
    String outputFile = "output.txt";

    //--VARIABLES - @STUDENT: DECLARE YOUR VARIABLES HERE:
	int n;
        ArrayList<String> testCaseList;
       ArrayList<String> S = new ArrayList<>();
       ArrayList<Word> w =new ArrayList<>();
       ArrayList<WordClass> wc= new ArrayList<>();



	//--FIXED PART - DO NOT EDIT ANY THINGS HERE--
	//--START FIXED PART--------------------------    
    String fi, fo;
    
    /**
     * Set input and output file for automatic rating
     * @param args path of input file and path of output file
     */
    public void setFile (String[] args){
        fi = args.length>=2? args[0]: inputFile;
        fo = args.length>=2? args[1]: outputFile;
    }
    
    /**
     * Reads data from input file
     */
    public void read(){
        try (Scanner sc  = new Scanner(new File(fi))){
    //--END FIXED PART----------------------------

            //INPUT - @STUDENT: ADD YOUR CODE FOR INPUT HERE:
            n = Integer.parseInt(sc.nextLine());
            
            testCaseList = new ArrayList<>();
            String testCase = "";
            for(int i = 0; i < n; i++ ){
                testCase = sc.nextLine();
                testCaseList.add(testCase);
            }


	//--FIXED PART - DO NOT EDIT ANY THINGS HERE--
	//--START FIXED PART--------------------------    
            sc.close();
        }catch(FileNotFoundException ex){
            System.out.println("Input Exception # " + ex);
        }
    }
    //--END FIXED PART----------------------------
    
    //ALGORITHM - @STUDENT: ADD YOUROWN METHODS HERE (IF NEED):
    

    
	//--FIXED PART - DO NOT EDIT ANY THINGS HERE--
	//--START FIXED PART--------------------------    
    /**
     * Main algorithm
     */
    public void solve(){
    //--END FIXED PART----------------------------

        //ALGORITHM - @STUDENT: ADD YOUR CODE HERE:
        
        String[] testCasePart;
        String commandType;
        Word nw = null;
        WordClass nwc;
        
        for(String testCase : testCaseList){
           testCasePart = testCase.split(";");
           commandType = testCasePart[0];
           switch (commandType){
               
               case "AddWordClass": {
                   nwc  = new WordClass(testCasePart[1], testCasePart[2]);
                   wc.add(nwc);
                   S.add(nwc.entry());
                   break;
               }
               case "PrintWordClass": {
                   S.add("---WordClasses---\n");
                   for (WordClass S2 : wc){
                       S.add(S2.print());
                   }
                   S.add("---\n");
                   break;
               }
               case "AddWord" : {
                   for (int i = 0 ; i < wc.size(); i++){
                       if (wc.get(i).getId().equals(testCasePart[3])){
                           
                           nw = new Word(testCasePart[1], testCasePart[2],wc.get(i));
                           w.add(nw);
                           S.add(nw.entry());
                       }
                   }
                   
                   break;
               }
               case "PrintWord" : {
                   S.add("---Words---\n");
                  for (Word S1 : w){
                      S.add(S1.print());
                  }
                  S.add("---");
                  break;
               }
               case "SearchWord": {
                   int a = 0;
                   S.add("---Search Result---\n");
                  for (Word S1 : w){
                      if(testCasePart[1].equals(S1.getWord())){
                          S.add(S1.print());
                          a = 1;
                          break;
                      }else {
                          a = 0;
                      }
                    }
                  if(a==0){
                      S.add("Not found\n");
                  }
                       }
               break;
           }
           }
       
        


	//--FIXED PART - DO NOT EDIT ANY THINGS HERE--
	//--START FIXED PART-------------------------- 
    }
    
    /**
     * Write result into output file
     */
    public void printResult(){
	    try{
            FileWriter fw = new FileWriter(fo);
	//--END FIXED PART----------------------------
                
        	//OUTPUT - @STUDENT: ADD YOUR CODE FOR OUTPUT HERE:
                for (String S1 : S){
                    fw.write(S1);
                }
           
                


	//--FIXED PART - DO NOT EDIT ANY THINGS HERE--
	//--START FIXED PART-------------------------- 
            fw.flush();
            fw.close();
        }catch (IOException ex){
            System.out.println("Output Exception # " + ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Q2 q = new Q2();
        q.setFile(args);
        q.read();
        q.solve();
        q.printResult();
    }
	//--END FIXED PART----------------------------    
}
