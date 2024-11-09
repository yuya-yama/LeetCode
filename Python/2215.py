class Solution:
    def findDifference(self, nums1: List[int], nums2: List[int]) -> List[List[int]]:
        res = []

        diff1 = self.find_diff_helper(nums1, nums2)
        res.append(diff1)

        diff2 = self.find_diff_helper(nums2, nums1)
        res.append(diff2)

        return res

    def find_diff_helper(self, nums1, nums2):
        vals_set = set(nums1)
        for num in nums2:
            if num in vals_set:
                vals_set.remove(num)

        return list(vals_set)
