package LeetCodeProblems.Defanging_an_IP_Address;
import java.lang.String;
public class Main {
    public static void main(String[] args) {
        String add = "255.100.50.0";
        System.out.println(defangIPAddress(add));
    }
    static String defangIPAddress(String add) {
        int index = 0;
        StringBuilder value = new StringBuilder();
        while(index != add.length()) {
            char ch = add.charAt(index);
            if (ch == '.') {
                value.append(add.replace(".", "[.]"));
                return value.toString();
            }
            index += 1;
        }
        return value.toString();
    }
}
