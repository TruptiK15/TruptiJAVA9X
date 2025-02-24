package November.ex_11112024_Access_Modifier.Criminal;

import November.ex_11112024_Access_Modifier.Police.Cop;

public class Thief{

    public static void main(String[] args) {
        Cop c = new Cop(10);
        //System.out.println(c.gun);    - gun is private
        //c.canIshoot();                - gun is protected
        //public variables & method can be access it as it public
    }
}
