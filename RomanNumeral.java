import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {
    private static Map<Character, Integer> map;

    static {
        map = new HashMap<Character, Integer>() {
            {
                put('I', 1);
                put('V', 5);
                put('X', 10);
                put('L', 50);
                put('C', 100);
                put('D', 500);
                put('M', 1000);
            }
        };
    }

    public int romanToInt(String s) {

        if (s == "VV") {

            return 0;
        }

        else {
            for (char c : s.toCharArray()) {
                if (!map.containsKey(c)) {
                    return 0;
                }
            }
            int convertedNumber = 0;
            for (int i = 0; i < s.length(); i++) {
                int currentNumber = map.get(s.charAt(i));
                int next = (i + 1 < s.length()) ? map.get(s.charAt(i + 1)) : 0;

                if (currentNumber >= next) {
                    convertedNumber += currentNumber;
                } else {
                    convertedNumber -= currentNumber;
                }
            }
            return convertedNumber;
        }
    }

    public static void main(String[] args) {
        RomanNumeral roma = new RomanNumeral();
        int result = roma.romanToInt("XX");
        System.out.println("Result: " + result);
    }
}
