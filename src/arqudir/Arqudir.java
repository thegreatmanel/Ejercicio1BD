package arqudir;

import java.io.File;
import java.io.IOException;

public class Arqudir {

    //Ej1
    public static void main(String[] args) throws IOException {

        File f1 = new File("/home/oracle/NetBeansProjects/arquivos");
        File f2 = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir");
        File f3 = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir/Products1.txt");
        File f4 = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir/Subdir");
        File f5 = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir/Subdir/Products2.txt");
        if (!f2.exists()) {
            f2.mkdir();
            System.out.println("Creado directorio arquivosdir");
        } else {
            System.out.println("Ya existe arquivosdir");
        }

        //Ej2
        if (f2.exists()) {
            if (!f3.exists()) {
                f3.createNewFile();
                System.out.println("Creado txt");
            } else {
                System.out.println("ya existe el txt");
            }
        } else {
            System.out.println("no existe arquivosdir por lo que no se crea el txt");
        }

        //Ej4
        if (!f4.exists()) {
            f4.mkdir();
            System.out.println("creado subdir");
            if (!f5.exists()) {
                f5.createNewFile();
                System.out.println("txt 2 creado");
            } else {
                System.out.println("ya existe txt2 ");
            }
        } else {
            System.out.println("ya existe subdir y txt2");
        }

        //Ej5
        String[] lista = f2.list();
        System.out.println("carpetas que conten:");
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
        //Ej6
        String ruta = f2.getAbsolutePath();
        System.out.println("La ruta de " + f2.getName() + " es " + ruta);
        //Ej7  
        String nometxt = f3.getName();
        String rutatxt = f3.getPath();
        boolean escribible = f3.canWrite();
        boolean legible = f3.canRead();
        long tamaño = f3.length();
        System.out.println(nometxt + "\n" + rutatxt + "\n" + "se puede escribir:" + escribible + "\n" + "se puede leer:" + legible + "\n" + "tamaño de archivo:" + tamaño);

        //Ej8
        f3.setReadOnly();
        
        //Ej9
        

    }
}
