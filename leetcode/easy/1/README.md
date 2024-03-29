# [1] Two Sum 两数之和

### [Page Address]
	https://leetcode.com/problems/two-sum/description/

	 algorithms
	 Easy (44.38%)
	 Total Accepted:    2M
	 Total Submissions: 4.5M

### [Problem Description]
	 Given an array of integers, return indices of the two numbers such that they add up to a specific target.
	 
	 You may assume that each input would have exactly one solution, and you may not use the same element twice.
	 Example: 

	 Given nums = [2, 7, 11, 15], target = 9,
	 
	 Because nums[0] + nums[1] = 2 + 7 = 9,
	 return [0, 1].

	 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。

	你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。

	示例:

	给定 nums = [2, 7, 11, 15], target = 9

	因为 nums[0] + nums[1] = 2 + 7 = 9
	所以返回 [0, 1]

### [Difficulty: EASY]	

### [Design]
	1. 复制出一个新的inputArray;
	2. 对新的inputArray进行排序； 左小右大；
	3. 设置两个指针，分别在左端点和右端点，即最小点和最大点；
	4. 两指针对应值相加，判断sum值和target关系；
		5-1. 如果sum < target 则意味sum值需要增大，所以将左指针向右移动一位；
		5-2. 如果sum > target 则意味sum值需要减小，所以将右指针向左移动一位；
		5-3. 如果sum == target 则意味已找到匹配组；将index记录下，跳出循环；

### [CodeWar]

```java

	class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int[] copyNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            copyNums[i] = nums[i];
        }
        Arrays.sort(copyNums);
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        while (leftIndex < rightIndex) {
            int sum = copyNums[leftIndex] + copyNums[rightIndex];
            if (sum < target) {
                leftIndex++;
            } else if (sum > target) {
                rightIndex--;
            } else {
                break;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == copyNums[leftIndex]) {
                result[0] = i;
                break;
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == copyNums[rightIndex]) {
                result[1] = i;
                break;
            }
        }
        return result;
    }
}

```

### [Testing]

	Input data:
	[2,7,11,15]
	9

	Actual
	  ✔ runtime: 0 ms
	  ✔ answer: [0,1]
	  ✔ stdout: ''

	Expected
	  ✔ runtime: 4 ms
	  ✔ answer: [0,1]
	  ✔ stdout: ''

### [Submission]

	  ✔ Accepted
	  ✔ 29/29 cases passed (2 ms)
	  ✔ Your runtime beats 93.56 % of java submissions