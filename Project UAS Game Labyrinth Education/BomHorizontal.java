import lang.stride.*;
import java.util.*;
import greenfoot.*;

public class BomHorizontal extends Actor
{
    private int speed;
    public BomHorizontal(int inc){
        speed = inc;
    }
    public void act(){
        setLocation(getX()-speed, getY());
        if(isTouching(WallHorizontal.class)){
            speed = -speed;
        }
    }
}
