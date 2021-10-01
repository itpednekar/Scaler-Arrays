public class Solution {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        int N = A.size();
        int pf[] = new int[N];
        pf[0] = A.get(0) ==  1 ? 1 : 0;

        for(int i=1; i<N; i++){
            if(A.get(i) == 1)
                pf[i] = pf[i-1] + 1;
            else
                pf[i] = pf[i-1];
            
        }
      
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i=0; i<B.size(); i++){
            int L = B.get(i).get(0) == 1 ? 0 : B.get(i).get(0) - 1;
            int R = B.get(i).get(1) - 1;
            int xor = 0;
            
            int total = R - L + 1;
            int total_1 = (L != 0) ? pf[R] - pf[L-1] : pf[R];
            int total_0 = total - total_1;

            if(total_1 % 2 == 0){
                xor = 0;
            }
            else{
                xor = 1;
            }
            
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(xor);
            temp.add(total_0);
            ans.add(temp);
        }
        
        return ans;
    }
}
