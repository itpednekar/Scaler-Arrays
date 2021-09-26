public class Solution {
    public int solve(ArrayList<Integer> A) {
       ArrayList<Integer> copyA = new ArrayList<>(A);
       Collections.sort(copyA);
       int start = 0;
       int end = A.size() - 1;
       
       for(int i=0; i<A.size(); i++){
           if(A.get(i) == copyA.get(i))
                continue;
            else{
                start = i;
                break;
            }
       }
       for(int i=A.size()-1; i>=0; i--){
           if(A.get(i) == copyA.get(i))
                continue;
            else{
                end = i;
                break;
            }
       }
       
       return  end - start + 1 == A.size() ? 0 : end - start + 1;
    }
}
