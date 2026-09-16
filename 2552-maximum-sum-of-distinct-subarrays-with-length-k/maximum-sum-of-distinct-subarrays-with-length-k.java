import java.util.HashSet;

class Solution {
    public long maximumSubarraySum(int[] arr, int k) {

        int n = arr.length;
        long sum = 0;
        long maxsum = 0;

        HashSet<Integer> h = new HashSet<>();

        int left = 0;

        for(int j = 0; j < n; j++) {

            while(h.contains(arr[j])) {
                h.remove(arr[left]);
                sum -= arr[left];
                left++;
            }

            h.add(arr[j]);
            sum += arr[j];

            if(j - left + 1 == k) {

                maxsum = Math.max(maxsum, sum);

                h.remove(arr[left]);
                sum -= arr[left];
                left++;
            }
        }

        return maxsum;
    }
}