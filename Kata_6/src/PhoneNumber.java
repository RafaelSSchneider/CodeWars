public class PhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        String AreaCode = "";
        String PhoneNumFirtsHalf = "";
        String PhoneNumSecHalf = "";
    for(int i = 0; i < 3; i++){
        AreaCode += numbers[i];
    }
    for(int i = 3; i < 6; i++){
        PhoneNumFirtsHalf += numbers[i];
    }
    for(int i = 6; i < 10; i++){
        PhoneNumSecHalf += numbers[i];
    }
        return "(" + AreaCode + ")"+ " " + PhoneNumFirtsHalf + "-" + PhoneNumSecHalf;
    }
}
