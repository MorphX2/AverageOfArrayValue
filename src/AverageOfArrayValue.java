public class AverageOfArrayValue {
    public static void main(String[] args) {
        int[] integerArray = { 34, 22, 56, 77, 23, 79, 44, 89 };
        int sum = 0;
        int elementCounter = 0;
        int average = 0;
        
        // Print all the array elements
        for (int index = 0; index < integerArray.length; index++) {
            System.out.println(integerArray[index]);
            sum = sum + integerArray[index];
            
            elementCounter = elementCounter + 1;
        }
        average = sum / elementCounter;
        System.out.println("The average of all " + elementCounter +  
                " elements in the array is: " + average );
      
        
    }
    
}
