class Solution {
    public int i = 0;
    public int max;
    public int[] global_nums;

    public void main() {
        int[] nums = [1, 7, 3, 6, 5, 6];
        this.pivotIndex(nums);
    }

    public int pivotIndex(int[] nums) {
        this.max = nums.length;
        this.global_nums = nums;
        for (int i = 0; i < this.max; i++) {
            if (getLeftNumSum(i) == getRightNumSum(i)) {
                return i;
            }
        }
        return -1;
    }

    public int getLeftNumSum(int key) {
        int sum = 0;
        for (int i = 0; i < key; i++) {
            sum += this.global_nums[i];
        }
        return sum;
    }

    public int getRightNumSum(int key) {
        int sum = 0;
        for (int i = key; i < this.max; i++) {
            sum += this.global_nums[i];
        }
        return sum;
    }

}