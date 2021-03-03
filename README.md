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
Write a function maxOutput (data) which takes a list of integers and finds the max product of some non-empty subset of those numbers
The function will return a string representation of the computed max product number
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
