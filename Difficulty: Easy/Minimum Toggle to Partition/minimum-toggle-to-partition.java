class Solution {
    int minToggle(int[] arr) {
        int ones=0,toggles=0;
        for(int i:arr){
            if(i==1){
                ones++;
            }
            else{
                toggles=Math.min(toggles+1,ones);
            }
        }
        return toggles;
    }
}