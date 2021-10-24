public class Solution {
    public int maxArr(ArrayList<Integer> A) {
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long min1 = Long.MAX_VALUE;
        long min2 = Long.MAX_VALUE;

        for(int i=0; i<A.size(); i++){
            max1 = Math.max(A.get(i)+i,max1);
            max2 = Math.max(-(A.get(i)-i),max2);
            
            min1 = Math.min(A.get(i)+i,min1);
            min2 = Math.min(-(A.get(i)-i),min2);
        }
        long ans = Math.max(max1-min1, max2-min2);
        return (int) ans;
        
    }
}
