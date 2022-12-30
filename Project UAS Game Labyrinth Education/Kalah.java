import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kalah here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kalah extends World
{

    /**
     * Constructor for objects of class Kalah.
     * 
     */
    public Kalah()
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
