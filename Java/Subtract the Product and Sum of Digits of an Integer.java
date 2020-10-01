class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        do{
             // Using modulo 10 to get all the digit
            sum += n % 10;
            product *= n % 10;
            n /= 10;
        }while(n > 0);
        return product - sum;
    }
}