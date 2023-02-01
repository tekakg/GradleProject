package hello;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Greeter {
    private static Greeter instance;
    private Greeter(){}
    public static synchronized  Greeter getInstance() {
            if(instance==null)
            {instance=new Greeter();}
            return instance;
    }
  public ArrayList<Integer> createAndReverseList() {
      ArrayList<Integer>list=new ArrayList<>();
      list.add(2);
      list.add(3);
      list.add(1);
      list.add(8);
      list.add(9);
      // Taking 5 integers as input.
      //After formatting
      System.out.println(list);
      for(int i=0;i<list.size()/2;i++)
      {
          int startElement=list.get(i);
          int lastElement=list.get(list.size()-i-1);
          list.set(list.size()-i-1,startElement);
          list.set(i,lastElement);
      }
      return list;
  }
}