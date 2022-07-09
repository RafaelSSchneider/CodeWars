public class ExexAndOhs {
    public static boolean getXO(String str) {

        boolean checker = true;
        int x = 0, o = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'x' || str.charAt(i) == 'X'){
                x++;
            } else if (str.charAt(i) == 'o' ||str.charAt(i) == 'O') {
                o++;
            }
        }
        if(x == o){
            checker = true;
        }else{
            checker = false;
        }
        return checker;
    }
}
