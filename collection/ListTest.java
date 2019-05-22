package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest
{

    public static void main(String[] args)
    {

        //List<String> clist = new ArrayList<>(); // For storage
         List<String> clist = new LinkedList<>(); // For processing


        clist.add("Nepal");
        clist.add("India");
        clist.add("Bangladesh");
        clist.add("Japan");


        for(String s: clist)
        {
            System.out.println(s);
        }

    }

}
