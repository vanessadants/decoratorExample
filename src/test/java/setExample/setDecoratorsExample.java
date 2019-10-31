package setExample;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class setDecoratorsExample {

    @Test
    public void test_shouldAddEvenStringNumber() {
        Set<String> expected = new HashSet<String>();
        expected.addAll(Arrays.asList("10","8"));

        Set<String> myGrades = new EvenSet<String>(new HashSet<String>());
        myGrades.add("10");
        myGrades.add("8");

        assertThat(myGrades, is(expected));

    }
    @Test
    public void test_shouldAddEvenNumber() {
        Set<Integer> expected = new HashSet<Integer>();
        expected.addAll(Arrays.asList(10,8));

        Set<Integer> myGrades = new EvenSet<Integer>(new HashSet<Integer>());
        myGrades.add(10);
        myGrades.add(8);

        assertThat(myGrades, is(expected));

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_shouldThrowExceptionWhenOdd() {
        Set<Integer> myGrades = new EvenSet<Integer>(new HashSet<Integer>());
        myGrades.add(5);
    }

    @Test(expected = NullPointerException.class)
    public void test_shouldThrowExceptionWhenNull() {
        Set<Integer> myGrades = new EvenSet<Integer>(new HashSet<Integer>());
        myGrades.add(null);
    }


}
