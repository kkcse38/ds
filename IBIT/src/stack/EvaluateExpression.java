//package stack;
import java.util.Stack;
public class EvaluateExpression{

    public static int calData(int operand1, int operand2, String oper){

        switch(oper){
            case "+":
                return operand1 + operand2;
            case "-":
                return operand2 - operand2;
            case "*":
                return operand2 * operand1;
            case "/":
                return operand1 / operand2;
            default:
                return -99999;             
        }

    }

    public static int evaluateExpression(String arr[]){
        int i=0;
        Stack<Integer> s = new Stack();

        while(i < arr.length){
            try{
                int num = Integer.parseInt(arr[i]);
                s.push(num);
            }catch(NumberFormatException n){
                s.push(calData(s.pop(), s.pop(), arr[i]));
            } 
            i++;
        }

        return s.pop();
    }

    public static void main(String[] args) {
        
        //String arr[] = {"4", "13", "5", "/", "+"};
        String arr[] = {"2", "1", "+", "3", "*"};
        System.out.println(evaluateExpression(arr));

    }
}