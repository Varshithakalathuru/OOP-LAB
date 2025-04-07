import java.util.*;
import java.io.*;

public class list
{
 public static void main(String[] args)
 {
   ArrayList<String> varshi=new ArrayList<String>();
   varshi.add("nanna");
   varshi.add("amma");
   varshi.add("anna");
   varshi.add("nenu");
   varshi.set(3,"nanna");
   for(int i=0;i<=varshi.size();i++)
   {
    System.out.println(i);
   }
 }
}