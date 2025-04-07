import java.io.*;
import java.util.*;
public class Main3
{
 public static void main(String[] args)
 { 
  try{
       File f=new File("varshi.txt");
       Scanner s=new Scanner(f);
       while(s.hasNextLine())
      {
       String data=s.nextLine();
       System.out.println(data);}
       s.close();
      
     }
  catch(Exception e)
  {
   System.out.println("Bye"+e);
  } 
 }
}