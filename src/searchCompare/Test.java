package searchCompare;

import java.time.Instant;
import java.time.LocalTime;

import static java.lang.System.currentTimeMillis;
import static java.time.LocalTime.now;

public class Test {
    public static void main(String[] args){
        int[] arr={1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3,5,9,12,23,45,56,67,78,89,99,111,123,232};
        //long a=currentTimeMillis();

        System.out.println(Instant.now());
        searchCompare.search01(arr,133);
        System.out.println(Instant.now());
        //long b=currentTimeMillis();

        searchCompare.search02(arr,133);
        System.out.println(Instant.now());
        //long c=currentTimeMillis();
        //System.out.println(a);
        //System.out.println(b);
        //System.out.println(c);
    }
}
