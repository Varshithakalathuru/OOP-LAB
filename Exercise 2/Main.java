import java.io.*;
import java.util.*;
public class Main{
  public static void main(String[] args){
   try{
      File f=new File("varshi.txt");
      f.createNewFile();
      }catch(Exception e)
          {System.out.println("Somthing went wrong"+e);
    }
  }
}