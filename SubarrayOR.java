public class Solution {
    public int solve(ArrayList<Integer> A) {
        int n = A.size();
        long mod = 1000 * 1000 * 1000 + 7;
        long totalSubarr = n * (n + 1) / 2;
        long ans = 0L;
        long pow = 1L;
        
        for(int i=0; i<32; i++){
            long contiZero = 0L;
            long subArrWithORZero = 0L;
            long subArrWithOROne = 0L;
            for(int j=0; j<n; j++){
                int ithBitSet = (A.get(j) & (1 << i)) == 0 ? 0 : 1;
                if(ithBitSet == 0)
                    contiZero++;
                else{
                    subArrWithORZero = subArrWithORZero + (contiZero * (contiZero + 1)) / 2;
                    contiZero = 0;
                }
            }
            subArrWithORZero = subArrWithORZero + (contiZero * (contiZero + 1) / 2);
            subArrWithOROne = totalSubarr - subArrWithORZero;
            
            if(i != 0){
                pow = pow % mod;
                pow = pow * 2L;
            }
            
            ans += (subArrWithOROne * pow) % mod;
            ans = ans % mod;
        }
        
        return (int) ans ;
    }
}
