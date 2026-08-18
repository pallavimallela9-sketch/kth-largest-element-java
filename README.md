# Kth Largest Element in an Array

## LeetCode Problem

**Problem Number:** 215

**Problem Name:** Kth Largest Element in an Array

## Problem Description

Given an integer array `nums` and an integer `k`, find the `k`th largest element in the array.

The program uses a **PriorityQueue (Min Heap)** to efficiently find the kth largest element.

## Example

### Input

```text
nums = [3, 2, 1, 5, 6, 4]
k = 2
```

### Output

```text
5
```

### Explanation

The elements in descending order are:

```text
6, 5, 4, 3, 2, 1
```

The 2nd largest element is:

```text
5
```

## Approach

A **Min Heap** of size `k` is used.

1. Add each element to the PriorityQueue.
2. If the heap size becomes greater than `k`, remove the smallest element.
3. After processing all elements, the smallest element remaining in the heap is the `k`th largest element.
4. Return the element at the top of the heap.

## Concepts Used

* Arrays
* PriorityQueue
* Min Heap
* Heap Operations
* Sorting Concepts

## Time Complexity

`O(n log k)`

Where `n` is the number of elements in the array.

## Space Complexity

`O(k)`

The PriorityQueue stores at most `k` elements.

## Language

Java

## File Name

`KthLargestElement.java`

## Repository Name

`kth-largest-element-java`

## Author

**M. Pallavi**
