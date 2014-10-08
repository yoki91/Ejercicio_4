package edu.upc.eetac.dsa.yifeige.Ejercicio_4;
//import java.util.*;
import java.text.*;
import java.util.Date;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class Ejercicio_4 
{

    public static void main( String[] args )throws IOException
    {
    	Date fecha=new Date();
    	SimpleDateFormat formato =new SimpleDateFormat("dd/MM/yyyy kk:mm:ss");
    	Path p1=Paths.get("/home/yifeige/dsa-projects/ejercicio_4/prueba");
    	
        Scanner s=null;
        PrintWriter out=null;
        int sum =0;
        
        try
        {
        	s=new Scanner(new BufferedReader(new FileReader("prueba")));
        	while(s.hasNext())
        	{   
        		String l = s.next();
        		sum = sum + l.length();
        		
        	}
        	System.out.printf("El fichero contiene %d caracteres",sum);
        }

        finally
        {
        	if(s!=null)
            s.close();
        }   
        try
        {
        out=new PrintWriter(new BufferedWriter(new FileWriter("registro.txt")));
        out.printf("El fichiero tiene %d caracteres\n", sum);
        out.println(formato.format(fecha));
        out.println(p1.getFileName());
        }
        finally
        {
        	if(out !=null)
        	out.close();
        }
        
        
        
        
        
    }
    
    
}
