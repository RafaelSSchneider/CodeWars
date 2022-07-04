public class BreakCamelCase {
    public static String camelCase(String input) {
        String output = "";
        for(int i = 0; i < input.length(); i++){
            if(Character.isUpperCase(input.charAt(i))){
           output += " "; //if == true, adds a space
           output += input.charAt(i); // adds the letter
            }else{
                output += input.charAt(i); // adds the rest of the string
            }
        }
        return output;
    }
}
//Need to do again to understand better!