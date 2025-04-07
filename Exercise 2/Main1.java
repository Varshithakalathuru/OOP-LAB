import java.io.*;
import java.util.*;

public class Main1
{
 public static void main(String[] args)
 {
  try
   {
     File f=new File("varshi.txt");
     if(f.exists())
     {
      System.out.println("File name:"+f.getName());
      System.out.println("path:"+f.getAbsolutePath());
      System.out.println("size:"+f.length());
     }
   }
  catch(Exception e)
  {
    System.out.println("File name:");

  }
 }
}