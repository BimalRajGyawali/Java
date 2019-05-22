package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest
{
    public static void main(String[] args)
    {
       // Map<String,String> map = new HashMap();
       // Map<String,String> map = new TreeMap<>();//key is sorted
        Map<String,String> map = new LinkedHashMap<>(); // insertion order




        map.put("Kathmandu","014");
        map.put("Lalitpur","015");
        map.put("Bhaktapur","016");
        map.put("Nawalparasi","078");


        //Read on the basis of key

        for(String key : map.keySet())
        {
            System.out.println(key +" "+ map.get(key));
        }


    }
}
