//This is not optimum solution, TC : 2^n
public class Solution {
    int sum = 0;
    public int solve(ArrayList<Integer> A) {
        getAllSubsequences(A, 0, new ArrayList<Integer> ());
        return sum;
    }
	public void getAllSubsequences(ArrayList<Integer> A, int i, ArrayList<Integer> temp){
	    if(i == A.size()){
	        if(temp.size() > 1)
	        {
	           sum = sum + (findMax(temp) - findMin(temp));
	        }
	    }
	    else{
	    getAllSubsequences(A, i+1, temp);
	    temp.add(A.get(i));
	    getAllSubsequences(A, i+1, temp);
	    temp.remove(temp.size() - 1);
	    }
	}
	
	public int findMax(ArrayList<Integer> temp){
	    int max = Integer.MIN_VALUE;
	    for(int i=0; i<temp.size(); i++){
	        if(temp.get(i) > max)
	            max = temp.get(i);
	    }
	    return max;
	}
	
	public int findMin(ArrayList<Integer> temp){
	    int min = Integer.MAX_VALUE;
	    for(int i=0; i<temp.size(); i++){
	        if(temp.get(i) < min)
	            min = temp.get(i);
	    }
	    return min;
	}
	
}
