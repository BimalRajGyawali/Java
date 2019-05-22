package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest
{

    public static void main(String[] args)
    {

        //Set<String> hset = new HashSet<>();(Unique Random)
        // Set<String> hset = new TreeSet<>();(Unique Sorted)
          Set<String> hset = new LinkedHashSet<>();// Unique and inserted order

        hset.add("Php");
        hset.add("SQL");
        hset.add("Java");
        hset.add("Java");

        for (String s: hset)
        {
            System.out.println(s);
        }


    }
}
