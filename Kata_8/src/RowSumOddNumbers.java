import java.util.ArrayList;

public class RowSumOddNumbers {
    public static void main(String[] args) {
        rowSumOddNumbers(4);
    }
    public static int rowSumOddNumbers(int n) {
        ArrayList<Integer> row = new ArrayList<Integer>();
        int sum = 0;
        int result = 0;
        int num = 1;
        for(int i = 0; i <= n; i++){
            for (int j = 0; j < i; j++){
                sum+=num;
                num+=2;

            }
            row.add(sum);
            sum = 0;
        }
        result = row.get(n);

        return result;
    }
}
