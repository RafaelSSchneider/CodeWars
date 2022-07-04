public class DeadFish {
    public static void main(String[] args) {
        parse("iiiiii");
    }

    public static int[] parse(String data) {
        boolean check = false;

        int len;
        for(len = 0; len < data.length(); ++len) {
            if (data.charAt(len) == 'o') {
                check = true;
                break;
            }
        }

        if (!check) {
            data = data + "o";
        }
        len = 0;
        int num;
        for(num = 0; num < data.length(); ++num) {
            if (data.charAt(num) == 'o') {
                ++len;
            }
        }

        num = 0;
        int[] result = new int[len];
        int j = 0;

        for(int i = 0; i < data.length(); ++i) {
            switch(data.charAt(i)) {
                case 'd':
                    --num;
                    break;
                case 'i':
                    ++num;
                    break;
                case 'o':
                    result[j] = num;
                    ++j;
                    break;
                case 's':
                    num *= num;
            }
        }

        return result;
    }
}
