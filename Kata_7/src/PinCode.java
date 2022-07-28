public class PinCode {
    public static boolean validatePin(String pin) {
        // Your code here...
        boolean Checker = false;
        System.out.println(pin);
        for(int i = 0; i < pin.length(); i++){
            if(pin.length() == 4 || pin.length() == 6){
                if(Character.isDigit(pin.charAt(i))){
                    Checker = true;
                }else{
                    Checker = false;
                    break;
                }
            }
        }
        return Checker;
    }
}
