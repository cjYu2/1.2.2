
/**
 * Write a description of class Song here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Song
{
    // instance variables - replace the example below with your own
    private int rating;
    private String title;
    private double price;
    private boolean favorite;

    /**
     * Constructor for objects of class Song
     */
    public Song() //Constructor from 1.1.2
    {
        // initialise instance variables
        rating = 0;
        //Assignment dyslexia
        //0 = rating;
        title = "";
        price = 0.0;
    }
    public Song(String title) 
    {
        this.title = title; 
    }
    public Song(String title, double price) //Constructor from step 9
    {
        this.title = title;
        this.price = price;
    }
    public Song(String title, double price, int rating) //Constructor from step 10
    {
        this.title = title;
        this.price = price;
        this.rating = rating;
    }
    
    public String getTitle() //Accessor from 1.1.2
    {
        return title;
    }
    
    public void setTitle(String t) //Mutator from 1.1.2
    {
        title = t;
    }
    
    public int getRating() //Accessor from 1.1.2
    {
        return rating;
    }
    
    public void setRating(int r) //Mutator from 1.1.2
    {
        rating = r;
    }
    
    public double getPrice() //Accessor from step 4
    {
        return price;
    }
    
    public void setPrice(double p) //Mutator from step 4
    {
        price = p;
    }
    
    public void addToFavorites() //Mutator from step 7
    {
        favorite = true;
    }
    
    public boolean isFavorite() //Accessor from step 8
    {
        return favorite;
    }
}
