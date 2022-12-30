import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menang extends World
{

    /**
     * Constructor for objects of class Menang.
     * 
     */
    public Menang()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 700, 1);
        prepare();
    }
    private void prepare()
    {
        BtnKembali btnKembali = new BtnKembali();
        addObject(btnKembali,198,650);
        BtnUlangi btnUlangi = new BtnUlangi();
        addObject(btnUlangi,404,650);
    }
}
