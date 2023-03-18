package javalab;

import java.util.Scanner;

public class switchstmnt {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        // System.out.print("Enter the type of fruit : ");
        // String fruit = in.next();

//         switch(fruit){
// // if mutiple lines of codes comes then use curly braces after case 
//             case "mango" -> {
//                 System.out.println("The king of fruits");
//             }
//             case "apple" -> System.out.println("Red in colour");
                
//             case "guava" -> System.out.println("Green in colour");
                
//             default -> System.out.println("Some Normal fruit");
                

//         }
        
        // System.out.print("Enter the day :");
        // int day = in.nextInt();

        // switch(day){
        //     case 1,2,3,4,5 -> System.out.println("Weekday");
        //     case 6,7 -> System.out.println("Weekend");
        //     default -> System.out.println("Enter a valid number");
        // }

        // NESTED SWITCH CASES(switch cases inside a switch case)

        int empID = in.nextInt();
        

        switch(empID){
            case 1 -> System.out.println("Deepak pm");
            case 2 -> System.out.println("Rahul raj");
            case 3 ->{
                String department = in.next();
                System.out.println("Employee 3 ");
                switch(department){
                    case "it" -> System.out.println("IT department");
                    case "acc" -> System.out.println("Accounting department");
                    
                    default -> System.out.println("Enter a valid department");
                }
            }
            default -> System.out.println("Enter a valid empId");
        }
        
    }
}
