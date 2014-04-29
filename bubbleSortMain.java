///////////////////////////////////////////////////////////////////
//Main method will generate an array with random numbers
//bubbleSort will be instantiated then sort through the
//array passed as a parameter
//John
///////////////////////////////////////////////////////////////////

import java.util.Random;
import java.util.Arrays;

public class bubbleSortMain {
    public static void main(String[] args) {
        Random ran = new Random();
        int[] randNums = new int[5*1];
        
        //fill up the array with random numbers
        for(int i=0; i<randNums.length; i++)
            randNums[i] = ran.nextInt(1000);
        
        bubbleSort bubble = new bubbleSort(randNums);
        
        //print array
        System.out.println(Arrays.toString(bubble.getArray()));
        
        //sort array
        bubble.sort();
        
        //print sorted array
        System.out.println(Arrays.toString(bubble.getArray()));
        
    }
}
