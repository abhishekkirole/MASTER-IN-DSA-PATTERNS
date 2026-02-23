# Pair With Target Sum

## Problem
Given an array of integers and a target value, 
find two numbers in the array whose sum equals the target.

If such a pair exists, return the pair.
If not, return [-1, -1].

---
## 👨‍💻 Author
Abhishek Kirole 

## Approach Used

I used the Two Pointer technique.

Step 1:
Sort the array.

Step 2:
Initialize two pointers.
Left pointer starts at index 0.
Right pointer starts at the last index of the array.

Step 3:
Calculate the sum of the elements at left and right.

Step 4:
If the sum is equal to the target,
return the pair.

Step 5:
If the sum is less than the target,
move the left pointer one step forward
because we need a larger value.

Step 6:
If the sum is greater than the target,
move the right pointer one step backward
because we need a smaller value.

Step 7:
Repeat the process while left pointer is less than right pointer.

This approach works because after sorting,
moving the left pointer increases the sum,
and moving the right pointer decreases the sum.

---

## Dry Run

Example:

nums = [1, 4, 6, 8, 10]
target = 14

Array is already sorted.

left = 0 (1)
right = 4 (10)

1 + 10 = 11  
11 < 14  
Move left pointer.

left = 1 (4)
right = 4 (10)

4 + 10 = 14  
14 == 14  

Answer = [4, 10]

---

## Time Complexity
Sorting: O(n log n)
Two pointer scan: O(n)
Overall: O(n log n)

## Space Complexity
O(1)
