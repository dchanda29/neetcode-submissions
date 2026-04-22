class Solution {
    public boolean isHappy(int n) {
        Set<Integer> s = new HashSet<>();

        while(!s.contains(n))
        {
            s.add(n);
            n=sumOfSq(n);
            if(n==1)
            return true;
        }
        return false;
    }

    private int sumOfSq(int n){
        int r =0 ;
        while(n>0)
        {
            int d=n%10;
            r=r+(d*d);
            n=n/10;
        }
        return r;
    }
}
