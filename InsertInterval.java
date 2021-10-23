/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        int i = 0, n = intervals.size();

        ArrayList<Interval> ans = new ArrayList<>();
        while(i<n && intervals.get(i).end < newInterval.start)
            ans.add(intervals.get(i++));
        
        Interval merge = new Interval(newInterval.start, newInterval.end);
        while(i<n && intervals.get(i).start <= newInterval.end){
            merge.start = Math.min(merge.start, intervals.get(i).start);
            merge.end = Math.max(merge.end, intervals.get(i).end);
            i++;
        }
      
        ans.add(merge);
        
        while(i<n)
            ans.add(intervals.get(i++));
         
        return ans;
    }
}
