public class Solution {
    public ArrayList<Integer> flip(String A) {
        int n = A.length();
        int [] arr = new int [n];
        boolean flag = false;
        for(int i=0; i<n; i++){
            if(A.charAt(i) == '0'){
                flag = true;
                arr[i] = 1;
            }
            else{
                arr[i] = -1;
            }
        }
        
        int currMax = 0;
        int prevMax = Integer.MIN_VALUE;
        int start = 0, start_o = 0, end = 0;
        if(flag == false){
            return new ArrayList<Integer>();
        }
        else{
            for(int i=0; i<n; i++){
                currMax += arr[i];
                if(currMax < 0){
                    start = i+1;
                    currMax = 0;
                }
                else if(currMax > prevMax){
                    end = i;
                    start_o = start;
                    prevMax = currMax;
                }
            }
        }
        return new ArrayList<Integer>(Arrays.asList(start_o+1, end+1));
    }
}
