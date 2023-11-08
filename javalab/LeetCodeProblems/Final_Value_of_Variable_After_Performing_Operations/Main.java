package LeetCodeProblems.Final_Value_of_Variable_After_Performing_Operations;

public class Main {
    public static void main(String[] args) {
        String[] operations = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operations));
    }
    static int finalValueAfterOperations(String[] operations) {
        int index = 0;
        int value = 0;
        while(index != operations.length){
            if(operations[index].equals("++X") || operations[index].equals("X++")){
                value += 1;
            } else {
                value -= 1;
            }
            index+=1;
        }
        return value;
    }
}
