
package arqudir;

import java.io.File;
import java.io.IOException;


public class Arqudir {

  
    public static void main(String[] args) throws IOException{

     File f1=new File ("/home/oracle/NetBeansProjects/arquivos");
     File f2=new File ("/home/oracle/NetBeansProjects/arquivos/arquivosdir");
     File f3=new File ("/home/oracle/NetBeansProjects/arquivos/arquivosdir/Products1.txt");       
   if(!f2.exists()){
       f2.mkdir(); 
       System.out.println("Creado directorio f2");
       
    }
   if(f2.exists()){
       f3.createNewFile();
       System.out.println("Creado txt");
       
       
   }
    }}
      
   
        
    
    

