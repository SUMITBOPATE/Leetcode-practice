class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n = arr.length;
        int left = 0, right = n - k, startIdx = 0;
        while (left <= right) {
            int mid = (left + right) >> 1;
            if (mid + k == n || x - arr[mid] <= arr[mid+k] - x) {
                startIdx = mid; // Found a valid answer -> Update
                right = mid - 1; // Try to find the left most answer in the left side
            } else {
                left = mid + 1; // Find in the right side
            }
        }
        return Arrays.stream(arr, startIdx, startIdx + k).boxed().collect(Collectors.toList());
    }
}