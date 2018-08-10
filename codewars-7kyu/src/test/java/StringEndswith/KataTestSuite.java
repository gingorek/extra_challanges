package StringEndswith;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class KataTestSuite {

    @Test
    public void kataTest(){
        //Given
        String start = "abcd";
        String end = "cd";

        //When
        boolean result = Kata.solution(start,end);

        //Then
        Assert.assertTrue(result);
    }

}