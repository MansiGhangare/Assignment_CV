//Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};
        
        // Convert the array to a List
        List<Integer> list = new ArrayList<>();
        for (int value : originalArray) {
            list.add(value);
        }
        
        // Shuffle the List
        Collections.shuffle(list);
        
        // Convert the List back to an array if needed
        Integer[] shuffledArray = list.toArray(new Integer[0]);
        
        // Print the shuffled array
        System.out.println(Arrays.toString(shuffledArray));
    }
}
