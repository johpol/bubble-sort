///////////////////////////////////////////////////////////
//Bubble sort algorithm
//John
///////////////////////////////////////////////////////////
import java.util.Arrays;

public class bubbleSort {
    
    private int[] arrayOfElements;
    
    //constructor
    public bubbleSort(int[] arrayOfElements) {
        this.arrayOfElements = arrayOfElements;
    }
    
    void sort() {
        //int[] sortedArray = arrayOfElements;
        
        for(int i=0; i<arrayOfElements.length; i++){
            for(int j=1; j<arrayOfElements.length; j++) {
                if(arrayOfElements[j-1] > arrayOfElements[j]) {
                    int temp = arrayOfElements[j-1];
                    arrayOfElements[j-1] = arrayOfElements[j];
                    arrayOfElements[j] = temp;
                }
                //System.out.println("*"+Arrays.toString(arrayOfElements));
            }
            //System.out.println(Arrays.toString(arrayOfElements));
        }
    }
    
    int[] getArray() {
        return arrayOfElements;
    }
    
}
