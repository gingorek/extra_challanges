package Kata13December;

import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Kata13December {
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers)
    {
        for (int i = 0; i < listOfNumbers.size(); i++)
        {
            if (listOfNumbers.get(i)%2 == 0)
            {
                listOfNumbers.remove(i);
            }
        }
        return listOfNumbers;
    }

    public static void main(String[] args) {
        List<Integer> listOfNumbers = new LinkedList<>(Arrays.asList(1, 2, 2, 2, 4, 3, 4, 5, 6, 7));

        filterOddNumber(listOfNumbers);
//        System.out.println(listOfNumbers.get(6));
        System.out.println(listOfNumbers);
    }
}
