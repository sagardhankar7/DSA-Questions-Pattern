package MapFilterReduce;

import java.util.Arrays;
import java.util.List;

public class LongestWordinList {
//    given list of strings
//    filter the longest word among all using stream api
static void main() {
    String [] list = {"ABC", "CDE", "GEFH", "XY"};

    String ans =  Arrays.stream(list).reduce((s1,s2)->s1.length()>s2.length()?s1:s2).orElse(null);
    System.out.println(ans);
}
}

// Reduce to computer from two item
// filter to choose an item on our one condition
// map to modify the one item