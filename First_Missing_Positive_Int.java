public class Solution {
    public int firstMissingPositive(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n; i++){
            while(arr[i] > 0 && arr[i] < n+1){
                if(arr[i] == i+1 || arr[i] == arr[arr[i]-1])
                    break;
               
                int temp = arr[arr[i]-1];
                arr[arr[i]-1] = arr[i];
                arr[i] = temp;
            }
        }
        int ans = n+1;
        for(int i=0; i<n; i++){
            if(arr[i] != i+1){
                ans = i+1;
                break;
            }
        }
        return ans;
    }
}
