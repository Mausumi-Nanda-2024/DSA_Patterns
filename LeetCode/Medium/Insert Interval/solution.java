class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> tempList = new ArrayList<>();

        boolean inserted = false;

        for(int[] interval : intervals){

            if(!inserted && interval[0] >= newInterval[0]){

            tempList.add(newInterval);
            inserted = true;
            }

            tempList.add(interval);
        }

        if(!inserted){
            tempList.add(newInterval);
        }

        List<int[]> result = new ArrayList<>();

        int start1 = tempList.get(0)[0];
        int end1 = tempList.get(0)[1];

        for (int i = 1; i < tempList.size(); i++) {

            int start2 = tempList.get(i)[0];
            int end2 = tempList.get(i)[1];

           
            if (end1 >= start2) {

               
                end1 = Math.max(end1, end2);

            } else {

                result.add(new int[]{start1, end1});

              
                start1 = start2;
                end1 = end2;
            }
        }


        result.add(new int[]{start1, end1});

    
        return result.toArray(new int[result.size()][]);
    }
}
        

