public class Solution {
    public int solve(ArrayList<Integer> A) {
        int n = A.size();
        int pf[] = new int [n];
        for(int i=0; i<n; i++){
            if(A.get(i) == 0)
                A.set(i, -1);
        }
        pf[0] = A.get(0);
        
        for(int i=1; i<n; i++){
            pf[i] = pf[i-1] + A.get(i);
        }
        
        int ans = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<n; i++){
            if(pf[i] == 0)
                ans = Math.max(ans, i+1);
            else if(hm.containsKey(pf[i])){
                int len = i - hm.get(pf[i]);
                ans = Math.max(ans, len);
            }
            else{
                hm.put(pf[i], i);
            }
        }
        
        return ans;
    }
}
