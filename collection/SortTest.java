package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortTest
{
    public static void main(String[] args)
    {

        List<Integer> list = Arrays.asList(40,33,53,89,34,76);

       // Collections.sort(list,Collections.reverseOrder());

        Collections.sort(list);
        System.out.println(list);



    }
}
