public class CountDivisors {
    public long numberOfDivisors(int n) {
        int res = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                res++;
            }
        }
    return res;
    }
}
