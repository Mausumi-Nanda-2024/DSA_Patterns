class Solution {
    public int jumpyBall(int h) {
        // code here
        int distance = 0;
        
        while(h!=0){
            distance+= 2L*h;
            h= h/2;
        }
        
        return distance;
    }
}