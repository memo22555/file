/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author memo
 */
public class JavaApplication14 {
    public static void main(String[] args) {
        String employee ;
        int choose;
        Scanner scan=new Scanner(System.in);
        Scanner scan1=new Scanner(System.in);
        
                                                System.out.println("(1) new entry");
                                                System.out.println("(2) add to an existing entry");
       
        try{
            choose=scan.nextInt();
            
        }catch(Exception e){
            System.out.println("please enter 1 or 2");
            choose=scan.nextInt();
        }
        boolean append;
        if (choose==1)
        {
            append=false;
        }else
            append=true;
        
        

   {
        try (FileWriter fw = new FileWriter("src/javaApplication14/text.txt",append)) {
            System.out.println("enter some words");
            employee=scan1.nextLine();
           fw.write("\n"+employee);
           
                       

           fw.close();
        
        System.out.println("sucess");
        }catch(Exception e){
            System.out.println(e);
        }
        
        
    


    }
    
}
}
