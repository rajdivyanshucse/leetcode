// 3754. Concatenate Non-Zero Digits and Multiply by Sum I
class Solution {
    public long sumAndMultiply(int n) {
        if(n==0){
            return 0;
        }
        int[] digit = Integer.toString(n).chars().map(Character::getNumericValue).toArray();
        int sum = 0;
        StringBuilder x= new StringBuilder();
        for(int i:digit){
            if(i!=0){
                x.append(i);
                sum += i; 
            }
        }
        long result = Long.parseLong(x.toString())*sum;
        return result;
    }
}
