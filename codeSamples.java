import java.util.HashMap;
import java.util.Map;

public class codeSamples {

    public static void main(String args[]){
        System.out.println("Code Sample 1");
        System.out.println("--------------");
        //Test 1
        System.out.println("Test 1: " + testResult(printArray(removeDuplicates (new int[]{1,2,2,3,3,3,4,5,5}, 1)), "[1,4]"));
        //Test 2
        System.out.println("Test 2: " + testResult(printArray(removeDuplicates (new int[]{2,2,1,3,9,3,4,5,8}, 2)), "[2,2,1,3,9,3,4,5,8]"));
        //Test 3
        System.out.println("Test 3: " + testResult(printArray(removeDuplicates (new int[]{2}, 4)), "[2]"));
        System.out.println();        
    }

    //Code Sample 1
    public static int[] removeDuplicates (int [] data, int n){
        Map<Integer, Integer> duplicates = new HashMap<>(data.length); //keep track of duplicate count for each number
        int removalTotal = 0; //keep track of how many numbers to remove
		int currentNumber = 0;

        for(int i = 0; i < data.length; i++){
            currentNumber = data[i];
            duplicates.put(currentNumber,duplicates.getOrDefault(currentNumber,0) + 1);

            if(duplicates.get(currentNumber) > n + 1){ //only add the current element for removal
                removalTotal++; 
            }else if (duplicates.get(currentNumber) > n){  //add all missed removals
                removalTotal +=duplicates.get(currentNumber);
            }
        }

        //remove duplicates that are greater than n
        int[] result = new int[data.length - removalTotal];
        int resultIndex = 0;

        for(int i =0; i < data.length; i++){
            currentNumber = data[i];
            if(duplicates.get(currentNumber) <= n){
                result[resultIndex] = currentNumber;
                resultIndex++;
            }
        }
        
		return result;
	}

    /*Helper method to print resulting int[] array*/
    private static String printArray(int[] array) {
        String result = "[";
		for(int i = 0; i < array.length-1; i++) {
			result += array[i]+",";
		}

        if (array.length > 0){
          result += array[array.length-1] + "]"; 
        }else{
           result += "]";
        }

        //DEBUG
        //System.out.println(result);
		return result;
	}

    /*Helper method to determine if test is passing or failing*/
    private static String testResult(String output, String expectedResult) {
        return ((output.equals(expectedResult)) ? "PASS" : "FAIL");
	}

}