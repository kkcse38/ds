package stack;

import java.util.Stack;

import javax.lang.model.util.ElementScanner6;
public class RainWaterTrapped{

    public static int findTotalRainWaterTrapped(int arr[]){

        //leftMax stores the max towser length to the left of current tower
        int leftMax = 0, i, res;
        //stack stores the max tower length to right side of the current node 
        Stack<Integer> s = new Stack();
        
        i = arr.length-1;
        while(i >= 0){
            if(s.isEmpty())
                s.push(arr[i]);
            else if(s.peek() < arr[i])
                s.push(arr[i]);
            else
                s.push(s.peek());
            i--;            
        }
        // System.out.println(s);

        //starting from 2nd tower as there will be no water trap on 1st tower also exclude the last tower.
        i = 1;
        leftMax = arr[0];
        res = 0;
        s.pop();

        while(i < arr.length-1){
            s.pop();
            res = res + Math.max(Math.min(leftMax, s.peek())-arr[i],0);
            if(leftMax < arr[i])
                leftMax = arr[i];
            i++;
        }

        return res;
    }

    public static void main(String[] args) {

        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(findTotalRainWaterTrapped(arr));    
    }
}