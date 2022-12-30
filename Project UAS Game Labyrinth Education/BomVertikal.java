import lang.stride.*;
import java.util.*;
import greenfoot.*;

public class BomVertikal extends Actor
{
    private int speed;
    public BomVertikal(int inc){
        speed = inc;
    }
    public void act(){
        setLocation(getX(), getY()-speed);
        if(isTouching(WallVertikal.class)){
            speed = -speed;
        }
    }
}
