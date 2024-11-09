class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> diff1 = findDiffHelper(nums1, nums2);
        res.add(diff1);

        List<Integer> diff2 = findDiffHelper(nums2, nums1);
        res.add(diff2);

        return res;
    }
    
    private List<Integer> findDiffHelper(int[] nums1, int[] nums2) {
        Set<Integer> numsSet = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        for (int num : nums2) {
            if (numsSet.contains(num)) {
                numsSet.remove(num);
            }
        }

        List<Integer> res = new ArrayList<>();
        res.addAll(numsSet);
        return res;
    }
}