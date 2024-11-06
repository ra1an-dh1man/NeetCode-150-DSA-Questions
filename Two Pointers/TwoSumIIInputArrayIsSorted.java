//LeetCode question 167
  class TwoSumIIInputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j = numbers.length -1;
        int sum=0;
        while(i<j){
            sum=numbers[i]+numbers[j];
            if(sum<target){
                i++;
            }
            else if(sum>target){
                j--;
            }
            else{
                int a[]={i+1,j+1};
                return a;
            }
        }
        int b[]={0};
        return b;
    }
}
