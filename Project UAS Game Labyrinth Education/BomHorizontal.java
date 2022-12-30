import lang.stride.*;
import java.util.*;
import greenfoot.*;

public class BomHorizontal extends Bom
{
    public BomHorizontal(int speed)
    {
        super(speed);
    }
    
    public void act(){
        super.WallDetect();
        setLocation(getX()-speed, getY());
    }
}
