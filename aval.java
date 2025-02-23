import java.util.ArrayList;
import java.util.Arrays;

public class aval {
    public static void main(String[] args) {
        // Using an Array (Fixed Size)
        int[] numArray = new int[5]; // Array of fixed size 5
        numArray[0] = 10;
        numArray[1] = 20;
        numArray[2] = 30;
        numArray[3] = 40;
        numArray[4] = 50;

        System.out.println("Array elements: " + Arrays.toString(numArray));

        // Using an ArrayList (Dynamic)
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(10);
        numList.add(20);
        numList.add(30);
        numList.add(40);
        numList.add(50);

        System.out.println("ArrayList elements: " + numList);

        // Demonstrating Resizing (ArrayList grows dynamically)
        numList.add(60);
        numList.add(70);
        System.out.println("ArrayList after adding more elements: " + numList);

        // Accessing elements
        System.out.println("Accessing 3rd element in Array: " + numArray[2]);
        System.out.println("Accessing 3rd element in ArrayList: " + numList.get(2));

        // Finding size
        System.out.println("Size of Array: " + numArray.length);
        System.out.println("Size of ArrayList: " + numList.size());
    }
}
