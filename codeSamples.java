import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class codeSamples {

    public static void main(String args[]){
        //Solution 1, 3 tests
        System.out.println("Code Sample 1");
        System.out.println("--------------");
        testResult(1, printArray(removeDuplicates (new int[]{1,2,2,3,3,3,4,5,5}, 1)), "[1,4]");
        testResult(2, printArray(removeDuplicates (new int[]{2,2,1,3,9,3,4,5,8}, 2)), "[2,2,1,3,9,3,4,5,8]");
        testResult(3, printArray(removeDuplicates (new int[]{2}, 4)), "[2]");
                
        //Solution 2, 4 tests
        System.out.println();
        System.out.println("Code Sample 2");
        System.out.println("--------------");
        testResult(1, maxOutput (new int[]{0,-1}), "0");
        testResult(2, maxOutput (new int[]{2,2,1,3}), "12");
        testResult(3, maxOutput (new int[]{-2,2,0,1}), "2");
        testResult(4, maxOutput (new int[]{2,-2,-4,-3}), "24");
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

    //Code Sample 2
    public static String maxOutput (int [] data){
		BigInteger total = BigInteger.ZERO;
		int oddNegatives = 0; //value will change to 1 if odd # of negative integers
		int min = -1001;
		ArrayList<Integer> negativeNumbers = new ArrayList<Integer>();

		for(int i=0; i< data.length; i++){
			int temp = data[i];
			if(temp < 0){
				//add to sorted negative integers
				if(temp > min){
					min = temp;
				}
				sort(negativeNumbers, data[i], min);
			}else{ 
				if(temp > 0){
					if(total == BigInteger.ZERO){
						total = BigInteger.ONE;
					}
					total = total.multiply(BigInteger.valueOf(temp));
				}
			}
		}

		//check if odd number of negative integers
		if(negativeNumbers.size() % 2 != 0){ 
			oddNegatives = 1;
		}

		//take product of negative integers
		for(int i = 0; i < negativeNumbers.size() - oddNegatives; i++){
			total = total.multiply(BigInteger.valueOf(negativeNumbers.get(i)));
		}

		//special cases
		if(data.length == 1){
			total = BigInteger.valueOf(data[0]);
		}
		
		return total + "";
	}
	
	private static void sort(ArrayList<Integer> negativeNumbers, int newInt, int min) {
		
		if(newInt >= min){
			negativeNumbers.add(newInt);
		}else{
			for(int i =0; i < negativeNumbers.size(); i++){
				if(newInt < negativeNumbers.get(i)){
					negativeNumbers.add(i, newInt);
					break;
				}
			}
		}		
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
    private static void testResult(int testNumber,String output, String expectedResult) {
        System.out.println(((output.equals(expectedResult)) ? "Test " + testNumber + ": PASS" : "Test " + testNumber + ": FAIL"));
	}

}