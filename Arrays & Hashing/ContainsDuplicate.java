//LeetCode question 217
class  ContainsDuplicate{
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> a=new HashSet<>();
        for(int n:nums){
            if(a.contains(n))return true;
            else a.add(n);
        }
        return false;
    }
}
