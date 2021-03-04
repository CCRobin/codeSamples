# codeSamples
This is a repository that contains a collection of java code samples.

CODE SAMPLE 1
----------------
PROBLEM:
Given a data list of less than 100 integers and a number 'n'.
Where 'n' represents a max duplicate amount.
Find a solution (ex: removeDuplicates (int [] data, int n)) which returns the data list with all numbers that occur more than 'n' times in the data list removed.
Data list will contain atleast 1 number and n will be greater than or equal to 1.

Tests 1:

INPUT: removeDuplicates (new int[]{1,2,2,3,3,3,4,5,5}, 1)

OUTPUT: [1,4]

Test 2:

INPUT: removeDuplicates (new int[]{2,2,1,3,9,3,4,5,8}, 2)

OUTPUT: [2,2,1,3,9,3,4,5,8]

Test 3: 

INPUT: removeDuplicates (new int[]{2}, 4)

OUTPUT: [2]


CODE SAMPLE 2
----------------
PROBLEM:
Given a function maxOutput (data) which takes a list of integers 
When the max product of some non-empty subset of those numbers is calculated
Then the function will return a string representation of the computed max product number
Note that 1 and 0 are special cases.
    
Tests 1:

INPUT: maxOutput (new int[]{0,-1})

OUTPUT: "0"

Test 2:

INPUT: maxOutput (new int[]{2,2,1,3})

OUTPUT: "12"

Test 3: 

INPUT: maxOutput (new int[]{-2,2,0,1})

OUTPUT: "2"

Test 4: 

INPUT: maxOutput (new int[]{2,-2,-4,-3})

OUTPUT: "24"


CODE SAMPLE 3
----------------
Given a function minimumOperations (String x) which accepts a positive integer as a string
When the integer representation of the string is processed then the following actions can be performed: add 1, subtract 1 or divide the integer by 2 (if it is an even number)
Then the function will return an integer that shows the minimum number of operations needed to end up at the value of 1 
    
Tests 1:

INPUT: minimumOperations ("3")

OUTPUT: 2

Tests 2:

INPUT: minimumOperations ("9")

OUTPUT: 4

Test 3:

INPUT: minimumOperations ("20")

OUTPUT: 5

Test 4: 

INPUT: minimumOperations ("1000")

OUTPUT: 12


CODE SAMPLE 4
----------------
Given a function fewestGenerations (String xMax, String yMax) which accepts two positive numbers as strings that are no larger than 10^50
And given two starting numbers x= 1, y = 1
When x and y are processed only two outcomes can occur: for every 'x' a 'y' is made and for every 'y' a 'x' is made
Then the function will return the string representation of the number of generations it will take for x = xMax and y = yMax
And if both x = xMax  and y = yMax can not be achieved the function will return "impossible"

    
Tests 1:

INPUT: fewestGenerations ("1", "1")

OUTPUT: "0"

Tests 2:

INPUT: fewestGenerations ("1", "1000")

OUTPUT: "999"

Test 3:

INPUT: fewestGenerations ("2", "3")

OUTPUT: "2"

Test 4: 

INPUT: fewestGenerations ("2", "12")

OUTPUT: "impossible"

Test 5: 

INPUT: fewestGenerations ("123000499999","8980800898")

OUTPUT: "196"