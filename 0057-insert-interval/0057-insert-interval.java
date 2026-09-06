class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int []> list = new ArrayList<>();

        boolean flag = false;
        int newStart = newInterval[0];

        for(int i = 0 ; i < intervals.length ; i++){
            int currStart =intervals[i][0];
            if(currStart >= newStart && flag == false){
                flag = true;
                list.add(new int[]{newStart,newInterval[1]});
            }

            list.add(new int[]{currStart,intervals[i][1]});
        }

        if(!flag){
            list.add(new int[]{newStart,newInterval[1]});
        }

        
        return  merge(list.toArray(new int[list.size()][]));
    }
    public int[][] merge(int[][] interval){

        if(interval.length == 0){
            return new int[0][];
        }

        ArrayList <int[]> list = new ArrayList<>();

        int start = interval[0][0];
        int end = interval[0][1];


        for(int i = 1 ; i < interval.length ; i++){
            if(end >= interval[i][0]){
                end = Math.max(end, interval[i][1]);
            }else{
                list.add(new int[]{start,end});
                start = interval[i][0];
                end = interval[i][1];
            }
        }
        list.add(new int[]{start,end});
        return list.toArray(new int[list.size()][]);
    }
}