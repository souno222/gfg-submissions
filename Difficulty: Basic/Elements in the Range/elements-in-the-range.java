class Solution {
    public boolean checkElements(int start, int end, int[] arr) {
            if(end<start){
                return false;
            }
            long sum=0;
            long targetSum=(end-start+1)*(end+start)/2;
            for(int i=0;i<arr.length;i++){
                int num=arr[i];
                if(num>=start && num<=end){
                    sum+=num;
                }
            }
            if(sum==targetSum){
                return true;
            }
            else{
                return false;
            }
    }
}