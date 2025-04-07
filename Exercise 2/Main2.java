import java.io.*;
import java.util.*;
public class Main2
{
 public static void main(String[] args)
 { 
  try{
  File a=new File("uma.txt");
  a.createNewFile();
  FileWriter f=new FileWriter("uma.txt");
  f.write("We have written this file");
  f.close();
  }
  catch(Exception e)
  {
   System.out.println("Bye");
  } 
 }
}