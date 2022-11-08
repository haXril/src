package swcTest;
import java.util.Stack;
import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class StackTest
{
    @SuppressWarnings("removal")
	public static void main (String[] args){
        /*
                Stack S = new Stack();//
                Stack tempStack = new Stack();
                Stack S2 = new Stack();
                
        
        String str;
        
        for (int x=0; x<5; x++)
        {
             str = JOptionPane.showInputDialog("Enter a number: ");
             S.push(new Integer(str));
        }
        
        System.out.println("The element in the Stack is : " + S);
        
        for (int x=0; x<5; x++)
        {
             tempStack.push(S.pop());
        }
        
        System.out.println("The element in the Temp Stack is : " + tempStack);
        
        for (int x=0; x<5; x++)
        {
             S2.push(tempStack.peek());
             S.push(tempStack.pop());
             
        }
        
        System.out.println("The element in the Second Stack is : " + S2);
        System.out.println("The element in the Stack is : " + S);
        */
        ArrayList<Integer> AL = new ArrayList<Integer>();
        LinkedList<Integer> LL = new LinkedList<Integer>();
        Stack<Integer> st = new Stack<Integer>();
        String str;
        
        /*
        for (int x=0; x<5; x++)
        {
             str = JOptionPane.showInputDialog("Enter a number for ArrayList "+ (x+1)+" : ");
             AL.add(new Integer(str));
        }
        
        for (int x=0; x<5; x++)
        {
             str = JOptionPane.showInputDialog("Enter a number for LinkedList "+ (x+1)+" : ");
             LL.add(new Integer(str));
        }
        
        for (int x=0; x<5; x++)
        {
            str = JOptionPane.showInputDialog("Enter a number for Stack "+ (x+1)+" : ");
             st.push(new Integer(str));
        }
        
        //System.out.println("The element in the ArrayList is : " + AL);
        //System.out.println("The element in the LinkedList is : " + LL);
        //System.out.println("The element in the Second Stack is : " + st);
        //System.out.print("\nCalculation Result is :" );
        */
        
        String respond = "";
		
        while(respond.equals("yes")==true){
        	
        		str = JOptionPane.showInputDialog("Enter a number for ArrayList : ");
                AL.add(new Integer(str));
                str = JOptionPane.showInputDialog("Enter a number for LinkedList : ");
                LL.add(new Integer(str));
                str = JOptionPane.showInputDialog("Enter a number for Stack : ");
                st.push(new Integer(str));
                
                respond = JOptionPane.showInputDialog("Are you want to input the extra number ?"+"\nPlease type 'yes' or 'no'");
                
                if(respond.equals("yes")==false) {
                	System.out.println("The new element in the ArrayList is : " + AL);
        	        System.out.println("The new element in the LinkedList is : " + LL);
        	        System.out.println("The new element in the Second Stack is : " + st);
        	        System.out.print("\nNew Calculation Result is :" );
        	        
        	        for (int x=0; x<5; x++)
        	        {
        	            int num = (AL.get(x) * LL.get(x))+ st.pop();
        	            
        	            System.out.print(num+",");
        	        }
        	        
        	        System.exit(0);
                }
        }
        
    }
}