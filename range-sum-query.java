class NumArray {
    List<Integer> al = new ArrayList<>();
    int totalSum=0;
    public NumArray(int[] nums) {
        for(int i=0;i<nums.length;i++){
            al.add(nums[i]);
            totalSum+=nums[i];
        }
    }

    public void update(int index, int val) {
        totalSum = totalSum + (val) - al.get(index);
        al.set(index,val);
    }

    public int sumRange(int left, int right) {
        int sum=totalSum;
        for(int i=0;i<left;i++){
            sum = sum - al.get(i);
        }
        for(int i=right+1;i<al.size();i++)
            sum -= al.get(i);
        return sum;
    }
}
