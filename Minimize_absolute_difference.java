public class Solution {
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
        int Na = A.size();
        int Nb = B.size();
        int Nc = C.size();
        
        int i = 0;
        int j = 0;
        int k = 0;
        int ans = Integer.MAX_VALUE;
        
        while(i<Na && j<Nb && k < Nc){
            int min = findMin(A.get(i), B.get(j), C.get(k));
            int max = findMax(A.get(i), B.get(j), C.get(k));
            ans = Math.min(max - min, ans);
            
            if(A.get(i) == min)
                i++;
            else 
                if(B.get(j) == min)
                j++;
            else 
                k++;
        }
        return ans;
    }
        int findMin(int a, int b, int c){
            int min = a;
            if(min > b)
              min = b;
            if(min > c)
              min = c;
            return min;
        }
        int findMax(int a, int b, int c){
            int max = a;
            if(max < b)
                max = b;
            if(max < c)
                max = c;
            return max;
        }
}
