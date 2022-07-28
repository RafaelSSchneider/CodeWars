public class BeastFeast {
    public static boolean feast(String beast, String dish) {
        int lenghtBeast = beast.length();
        int lenghtDish = dish.length();
        if(beast.charAt(0) == dish.charAt(0)){
            if(beast.charAt(lenghtBeast - 1) == dish.charAt(lenghtDish - 1)){
                return true;
            }
        }
        return false;
    }
}
