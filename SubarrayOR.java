//https://github.com/itpednekar/Scaler-Arrays/blob/main/SubarrayOR.java
public class Solution {
    public int solve(int[] A) {
        long n = A.length, mod = 1000 * 1000 * 1000 + 7;
        long pow = 1L; long ans = 0L;
        long totalSubarr = n * (n + 1) / 2;

        for(int i=0; i<32; i++){
            long contiZero = 0L;
            long subArrWithORZero = 0L;

            for(int j=0; j<n; j++){
                if((A[j] & (1 << i)) == (1 << i)){
                    subArrWithORZero = subArrWithORZero + (contiZero * (contiZero + 1)) / 2;
                    contiZero = 0;
                }
                else{
                    contiZero++;
                }
            }
            subArrWithORZero += (contiZero*(contiZero + 1)) / 2;
            long oneCount = totalSubarr - subArrWithORZero;
            if(i != 0){
                pow = pow * 2L;
            }
            ans += (oneCount*pow) % mod;
            ans %= mod;
        }
        return (int) ans;
    }
}
