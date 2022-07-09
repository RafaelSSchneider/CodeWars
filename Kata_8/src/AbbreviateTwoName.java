public class AbbreviateTwoName {
    public static String abbrevName(String name) {
    String[] spliter = name.split(" ");
    name = "";
        for(int i = 0; i <= 1; i++){
            name += spliter[i].toUpperCase().charAt(0);
        if(i == 0){
            name += ".";
        }
    }
        return name;
    }
}