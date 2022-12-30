import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Petunjuk extends World
{

    /**
     * Constructor for objects of class Petunjuk.
     * 
     */
    public Petunjuk()
    {    
        super(600, 700, 1);
        prepare();
    }
    private void prepare()
    {
        BtnKembali btnKembali = new BtnKembali();
        addObject(btnKembali,300,650);
    }
}
