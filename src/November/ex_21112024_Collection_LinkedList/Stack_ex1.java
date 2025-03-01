package November.ex_21112024_Collection_LinkedList;

import java.util.Stack;

public class Stack_ex1 {
    /*  ---- Stack-----
        - Stack of books
        - Last In First Out - FILO (first in last out)
        - push, peek,  pop
     */
    public static void main(String[] args) {

        Stack s = new Stack();
        s.push("Trupti");
        s.push("Amey");
        s.add("Kiara");
        s.add("Sneha");
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.peek());   //look for element at top (comes last)
        System.out.println(s.pop());    //remove top
        System.out.println(s);
        s.add("Seema");
        s.push("Karan");
        System.out.println(s);
        s.add(0,"Shruti");  //add at 0 index
        System.out.println(s);
    }
}
