class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int largest=0;
        List<Boolean> kids = new ArrayList<Boolean>();
        
        for (int x = 0; x < candies.length; x++){
            if (candies[x] > largest){
                largest = candies[x]; 
            }
        }
        
        for(int i=0; i < candies.length; i++){
            if(candies[i] + extraCandies >= largest ){
                kids.add(true);    
            }else{
                kids.add(false);
            }
        }
        return kids;
    }
}