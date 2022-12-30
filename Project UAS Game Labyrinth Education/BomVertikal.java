import lang.stride.*;
import java.util.*;
import greenfoot.*;

public class BomVertikal extends Bom
{
    public BomVertikal(int speed)
    {
        super(speed);
    }
    
    public void act(){
        super.WallDetect();
        setLocation(getX(), getY()-speed);
    }
}
