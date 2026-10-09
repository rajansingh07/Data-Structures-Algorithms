# DSA Patterns

A structured collection of **Data Structures & Algorithms problems organized by problem-solving patterns**.

The goal of this repository is not just to memorize solutions, but to understand how to **identify the underlying pattern**, choose the right data structure, and build a reusable approach for similar problems.

## 📚 Learning Resource

This repository follows the **DSA Patterns** learning series by Pratyush Narain.

**YouTube Playlist:**  
https://youtube.com/playlist?list=PLbJhGqY-mq47k_WLUtzVjmarUm1EuXPj2

---

# 🧠 Patterns Covered

## 1. Two Pointers

Used when working with arrays or strings where two indices can move through the data efficiently.

### Common Problems

- Move Zeroes
- Remove Duplicates
- Two Sum
- Three Sum / Triplet Sum
- Dutch National Flag
- Reverse String
- Palindrome Check

### Key Idea

Instead of using nested loops, maintain two pointers and move them according to the problem conditions.

**Typical Complexity:** `O(n)`

---

## 2. Sliding Window

Used for problems involving **subarrays or substrings** where we need to find a continuous range satisfying some condition.

### Types

- Fixed-size window
- Variable-size window
- Minimum/maximum window
- String window problems

### Common Problems

- Maximum sum subarray of size `k`
- Longest substring without repeating characters
- Minimum window substring
- Longest subarray satisfying a condition

### Key Idea

Maintain a window using two pointers:

```text
left → [ current window ] ← right
```

Expand the window when possible and shrink it when the condition is violated.

**Typical Complexity:** `O(n)`

---

# 3. Strings

Important basic string problems that frequently appear in coding tests and interviews.

### Problems

- Reverse a string
- Check palindrome
- Count vowels/consonants
- Character frequency
- Anagram
- Substring problems

### Useful Techniques

- Two pointers
- Frequency arrays
- Hash maps
- Sliding window

---

# 4. Number Theory

Basic mathematical problems useful for coding rounds.

### Problems

- Prime number
- Sieve of Eratosthenes
- Armstrong number
- Perfect number
- Factorial
- Fibonacci
- GCD
- LCM

---

# 5. Sorting

Understanding basic sorting algorithms is important for DSA fundamentals.

### Algorithms

| Algorithm | Average Time | Space |
|---|---:|---:|
| Bubble Sort | `O(n²)` | `O(1)` |
| Selection Sort | `O(n²)` | `O(1)` |
| Insertion Sort | `O(n²)` | `O(1)` |

### Focus

Don't just memorize the implementation.

Understand:

- When the algorithm is useful
- How elements move
- Number of comparisons
- Best/worst cases
- Space complexity

---

# 6. Binary Search

Binary search is used when the search space can be divided repeatedly.

### Basic Structure

```text
left →        mid        ← right

Search left  ← or →  Search right
```

### Common Problems

- Basic binary search
- First/last occurrence
- Search in sorted arrays
- Binary search on answer
- Story-based binary search problems

**Typical Complexity:** `O(log n)`

---

# 7. Stack

A stack follows:

```text
LIFO
Last In → First Out
```

### Common Problems

- Stack implementation
- Valid/balanced parentheses
- Next Greater Element
- Expression problems
- Monotonic stack problems

### Important Pattern

For many array problems involving:

- Next greater
- Next smaller
- Previous greater
- Previous smaller

think about a **monotonic stack**.

---

# 8. Heap

A heap is useful when we repeatedly need the minimum or maximum element.

### Types

- Min Heap
- Max Heap

### Common Problems

- Kth largest/smallest
- Top K elements
- Priority-based problems
- Heap on pairs
- Merge multiple sorted structures

### Key Idea

Use a heap when the problem repeatedly asks:

> "Give me the smallest/largest element currently available."

---

# 9. Recursion

Recursion means solving a problem by breaking it into smaller versions of the same problem.

### Basic Structure

```text
function solve(problem):

    if base_condition:
        return

    solve(smaller_problem)
```

### Important Concepts

- Base condition
- Recursive call
- Call stack
- Recursion tree
- Tail recursion

### Common Problems

- Fibonacci
- Factorial
- String palindrome
- Binary search
- Array problems
- Tree problems

---

# 10. Backtracking

Backtracking is useful when we need to explore multiple possible choices.

### General Template

```text
function backtrack(state):

    if solution_found:
        save_solution
        return

    for choice in choices:

        make_choice()

        backtrack(new_state)

        undo_choice()
```

### Common Problems

- Subsets
- Permutations
- Combinations
- N-Queens
- Maze problems
- Constraint-based problems

### Key Idea

**Choose → Explore → Undo**

---

# 📊 Complexity Cheat Sheet

| Complexity | Example |
|---|---|
| `O(1)` | Array access |
| `O(log n)` | Binary Search |
| `O(n)` | Two Pointers |
| `O(n)` | Sliding Window |
| `O(n log n)` | Efficient Sorting |
| `O(n²)` | Nested loops |
| `O(2ⁿ)` | Many Backtracking problems |
| `O(n!)` | Permutations |

---

# 🎯 How to Identify a Pattern

When you see a new problem, don't immediately start coding.

Ask:

### Step 1: What is the input?

```text
Array?
String?
Tree?
Graph?
Number?
```

### Step 2: What is the problem asking?

```text
Search?
Count?
Maximum?
Minimum?
Subarray?
Substring?
All possible combinations?
```

### Step 3: Look for clues

| Problem Clue | Possible Pattern |
|---|---|
| Sorted array | Binary Search / Two Pointers |
| Pair/triplet | Two Pointers |
| Continuous subarray | Sliding Window |
| Continuous substring | Sliding Window |
| Next greater/smaller | Stack |
| Kth largest/smallest | Heap |
| All possible combinations | Backtracking |
| Repeated smaller problem | Recursion |
| Minimum/maximum repeatedly | Heap |
| Search space can be divided | Binary Search |

---

# 📝 Problem-Solving Process

For every problem, follow this process:

```text
1. Understand the problem
        ↓
2. Write examples
        ↓
3. Identify the pattern
        ↓
4. Think of brute force
        ↓
5. Find the optimized approach
        ↓
6. Write pseudocode
        ↓
7. Implement
        ↓
8. Test edge cases
        ↓
9. Analyze Time Complexity
        ↓
10. Analyze Space Complexity
```

---

# 📂 Repository Structure

```text
DSA-Patterns/
│
├── 01-two-pointers/
│   ├── move-zeroes
│   ├── remove-duplicates
│   ├── triplet-sum
│   └── dutch-national-flag
│
├── 02-sliding-window/
│   ├── fixed-window
│   ├── variable-window
│   ├── string-window
│   └── minimum-window
│
├── 03-strings/
│
├── 04-number-theory/
│
├── 05-sorting/
│   ├── bubble-sort
│   ├── selection-sort
│   └── insertion-sort
│
├── 06-binary-search/
│
├── 07-stack/
│   ├── stack-basics
│   ├── next-greater-element
│   └── balanced-parentheses
│
├── 08-heap/
│
├── 09-recursion/
│
├── 10-backtracking/
│
└── README.md
```

---

# ✅ Progress Tracker

- [ ] Two Pointers
- [ ] Sliding Window
- [ ] Strings
- [ ] Number Theory
- [ ] Sorting
- [ ] Binary Search
- [ ] Stack
- [ ] Heap
- [ ] Recursion
- [ ] Backtracking

---

# 💡 Important Rule

Don't measure progress by the number of problems solved.

Measure progress by whether you can look at a **new problem and recognize the pattern**.

The ultimate goal is:

```text
Problem
   ↓
Recognize Pattern
   ↓
Choose Technique
   ↓
Implement
   ↓
Optimize
```

---

## 🔗 Resources

- [DSA Patterns Playlist](https://youtube.com/playlist?list=PLbJhGqY-mq47k_WLUtzVjmarUm1EuXPj2)
- [Pattern Sheet](https://docs.google.com/spreadsheets/d/1T5-nGsJ9WNwna44e9WWRD0jlZIT5KxVOGvylcvvVrY8/edit?usp=sharing)

---

## ⭐ Goal

Build strong DSA fundamentals by learning **patterns instead of memorizing solutions**.

> **Learn the pattern. Solve the problem. Recognize it again.**