import java.io.*;
import java.util.*;
public class practice
{
public static void main(String[] args){
 try
 {
  File f=new File("oops.txt");
  f.createNewFile();
  FileWriter w=new FileWriter("oops.txt");  
  w.write("Hi");
  w.close();
  Scanner s=new Scanner(f);
  while(s.hasNextLine())
  {
   String d=s.nextLine();
   System.out.println(d);
  }
  s.close();
 }
 catch(Exception e)
 {
  System.out.println("Something went wrong");
 }
}
}