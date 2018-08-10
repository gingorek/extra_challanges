package SortMyTextBook;

import java.util.Collections;
import java.util.List;

public class Sorter {
    public static List<String> sort(List<String> textbooks) {
        //Cramming right before a test can't be that bad?

        Collections.sort(textbooks,String.CASE_INSENSITIVE_ORDER);
        return textbooks;
    }
}
