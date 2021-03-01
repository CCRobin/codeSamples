import java.util.ArrayList;

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
        
    }

    //Code Sample 1
    public static int[] removeDuplicates (int [] data, int n){
		int start = 0;
		int count = 1;
		int removalTotal = 0;
		ArrayList<Integer> numberRemoval = new ArrayList<Integer>();
		
		for (int i = 0; i < data.length; i++){
			start = data[i];
			for(int j=i+1; j < data.length; j++){
				if (start == data[j]){
					count ++;
				}
			}

			if(count > n & !numberRemoval.contains(start)){
				//mark element for removal
				numberRemoval.add(start);
				removalTotal += count;
			}
			
			//reset
			count = 1;
		}
		
		//remove duplicates
		int[] result = new int[data.length - removalTotal];
		int index = 0;
		for(int i = 0; i< data.length; i++){
			if(!numberRemoval.contains(data[i])){
				result[index] = data[i];
				index++;
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
        result += array[array.length-1] + "]";
        //DEBUG
        //System.out.println(result);
		return result;
	}

    /*Helper method to determine if test is passing or failing*/
    private static String testResult(String output, String expectedResult) {
        return ((output.equals(expectedResult)) ? "PASS" : "FAIL");
	}

}