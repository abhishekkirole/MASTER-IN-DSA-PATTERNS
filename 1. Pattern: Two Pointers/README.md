# Two Pointer Approach

The Two Pointer technique is an efficient problem-solving method used mainly with arrays and strings.  
It helps reduce time complexity by avoiding nested loops in many cases.

---

## 📌 Concept

The main idea of the Two Pointer approach is to use two indices (pointers) 
to iterate through the data structure in a controlled way.

These pointers usually:

- Start from opposite ends of a sorted array  
OR  
- Move at different speeds (slow and fast pointer)

By adjusting the pointers based on a condition, 
we can solve problems more efficiently than using brute force.

---

## 🧠 When to Use Two Pointers

Use this approach when:

- The array is sorted (or can be sorted)
- You need to find a pair or triplet with a specific condition (sum, difference, etc.)
- You need to remove duplicates in-place
- You need to reverse an array or string
- You are working with subarrays or sliding window problems
- You need to compare elements from both ends

---

## 🚀 General Template (Algorithm)

Step 1: If required, sort the array.

Step 2: Initialize two pointers.
        left = 0
        right = n - 1

Step 3: While left < right:

        - Evaluate the required condition.
        - If condition is satisfied → return or store result.
        - If the current value is too small → move left pointer forward.
        - If the current value is too large → move right pointer backward.

Step 4: Continue until pointers meet.

---

## 🔄 Types of Two Pointer Patterns

1. Opposite Direction Pointers
   - One pointer at start
   - One pointer at end
   - Move inward based on condition

2. Same Direction (Fast & Slow Pointer)
   - Both pointers start at beginning
   - Fast moves ahead
   - Slow follows conditionally
   - Used in removing duplicates or cycle detection

3. Sliding Window
   - Maintain a window using two pointers
   - Expand or shrink window based on condition

---

## ⏱ Time Complexity

Usually O(n)

Because each element is visited at most once.

If sorting is required:
O(n log n)

---

## 📦 Space Complexity

O(1) in most in-place problems.

---

## 🎯 Why It Is Efficient

- Eliminates nested loops in many problems
- Reduces brute force O(n²) solutions to O(n)
- Easy to implement once the pattern is understood

---

## 👨‍💻 Author
Abhishek Kirole
