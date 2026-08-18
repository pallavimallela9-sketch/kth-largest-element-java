import java.util.Arrays;
import java.util.PriorityQueue;

class KthLargestElement {

    public static int findKthLargest(int[] nums, int k) {

        // Min Heap stores the k largest elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {

            minHeap.add(num);

            // Keep only k elements in the heap
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // Root of Min Heap is the kth largest element
        return minHeap.peek();
    }

    public static void main(String[] args) {

        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;

        System.out.println("Input Array: "
                + Arrays.toString(nums));

        System.out.println("K = " + k);

        int result = findKthLargest(nums, k);

        System.out.println(
                "Kth Largest Element = " + result
        );
    }
}
