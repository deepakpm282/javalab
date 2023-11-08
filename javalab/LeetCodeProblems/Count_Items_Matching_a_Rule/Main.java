package LeetCodeProblems.Count_Items_Matching_a_Rule;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>(Arrays.asList(Arrays.asList("phone","blue","pixel"),
                Arrays.asList("computer","silver","lenovo"),
                Arrays.asList("phone","gold","iphone")));
        System.out.println(countMatches(items,"color","silver"));
    }
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        for(List<String> str : items){
            for(String ch : str){
                if(ch.equals(ruleKey) && ch.equals(ruleValue)){
                    return items.indexOf(ch);
                }
            }
        }
        return -1;
    }
}
