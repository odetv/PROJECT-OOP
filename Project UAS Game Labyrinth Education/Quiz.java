import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Quiz here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Quiz extends World
{

    /**
     * Constructor for objects of class Quiz.
     * 
     */
    public Quiz()
    {    
        super(600, 700, 1); 
        prepare();
    }
    private void prepare()
    {
        BtnBenar btnBenar = new BtnBenar();
        addObject(btnBenar,198,475);
        BtnSalah btnSalah = new BtnSalah();
        addObject(btnSalah,404,475);
    }
}
