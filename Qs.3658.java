// 3658. GCD of Odd and Even Sums

class Solution {
    public int gcdOfOddEvenSums(int n) {
        return sumEven(n)- sumOdd(n);
    }

    public int sumOdd(int n){
        int i =0;
        int sum = 0;
        while(i!=n){
            sum += i*2 +1;
            i++;
        }
        return sum;
    }
    public int sumEven(int n){
        int i =0;
        int sum = 0;
        while(i!=n){
            sum += i*2 +2;
            i++;
        }
        return sum;
    }
}