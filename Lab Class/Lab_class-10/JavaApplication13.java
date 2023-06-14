package javaapplication13;

import java.util.ArrayList;
import java.util.List;

public class JavaApplication13 {

    public static void main(String[] args) {

        Player p1 = new Player("Messi", 10);

        Ball baseball1 = new Baseball("Base Brand", 4);

        Ball baseball2 = new Baseball("Base2 Brand", 3);

        Ball football = new Football("Foot Brand", 5);

        Ball football2 = new Football("Foot Brand2", 4);

        List<Ball> ballgroup = new ArrayList<Ball>();

        ballgroup.add(baseball1);
        ballgroup.add(baseball2);
        ballgroup.add(football);
        ballgroup.add(football2);

        p1.display();
        p1.Gets(ballgroup);
    }

}
