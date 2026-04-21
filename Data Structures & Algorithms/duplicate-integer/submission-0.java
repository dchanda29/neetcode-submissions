class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set <Integer> noDupe = new HashSet<>();
        for(int i :nums)
        {
            if (!(noDupe.add(i))) return true;
        }
        return false;
    }
}