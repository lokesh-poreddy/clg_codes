class subarraySumEqual {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> h = new HashMap<>();

        int preSum = 0;

        h.put(0, 1);

        int noOfSubArrayPossible = 0;

        for (int i = 0; i < nums.length; i++) {
            preSum += nums[i];

            int remove = preSum - k;

            if (h.containsKey(remove)) {
                noOfSubArrayPossible += h.get(remove);
            }
            h.put(preSum, h.getOrDefault(preSum, 0) + 1);
        }
        return noOfSubArrayPossible;
    }
}