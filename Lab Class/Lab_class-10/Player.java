
package javaapplication13;

import java.util.List;

public class Player {
    private String playerName;
    private int playerNo;

    public Player(String playerName, int playerNo) {
        this.playerName = playerName;
        this.playerNo = playerNo;
    }
    
    public void Gets(List<Ball> ball)
    {
        System.out.println("\n\nPlayer have those Balls: ");
        for(Ball b : ball)
        {
            System.out.println("Ball Brand: "+b.getBrandname());
            System.out.println("Ball Size: "+b.getSize());
        }
    }
    
    public void display()
    {
        System.out.println("Player Information: ");
        System.out.println("Player Name: "+playerName);
        System.out.println("Jursey Number: "+playerNo);
    }
}
