import java.util.*;

class Solution {
    public int minMeetingRooms(int[] start, int[] end) {
        
        
      int n = start.length;
      
      if(n == 0){
          return 0;
      }
      
      Arrays.sort(start);
      Arrays.sort(end);
      
      int i = 0;
      int j = 0;
      
      int room =0;
      int max = 0;
      
      while(i < n){
          
          if(start[i] < end[j]){
              
              room++;
              
              max = Math.max(max , room);
              
              i++;
              
          }else{
              
              room--;
              j++;
          }
      }
      
      return max;
        
    }
}
