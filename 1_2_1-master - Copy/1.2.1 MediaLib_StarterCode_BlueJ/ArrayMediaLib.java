
/**
 * Write a description of class ArrayMediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayMediaLib
{
    public static void main(String[] arg) {
        
        String [] sharingFriends = {"Jaiveer", "Pranav", "CJ", "Bill"};//, "Nye"};
        for(int i = 0; i < sharingFriends.length; i ++)
        {
            System.out.println(sharingFriends[i]);
        }
        //, 1, 2, 5, 6, 2, 4, 8, 3, 6, 9
        int total = 0;  
        int [] daysBtwnPurchase = { 2, 5, 1, 2, 4, 4, 1, 3};
        for (int item: daysBtwnPurchase) {
            total += item; 
        }
        System.out.println(1.0*total/daysBtwnPurchase.length);

        Song[] topTenSongs = {new Song("The Twist"), 
                new Song("Smooth"), 
                new Song("Mack the Knife"),
                new Song("How Do I Live"),
                new Song("Party Rock Anthem"),
                new Song("I Gotta Feeling"),
                new Song("Macarena"),
                new Song("Physical"),
                new Song("You Light Up My Life"),
                new Song("Hey Jude")};

        for (Song s: topTenSongs)
        {
            System.out.println(s.getTitle());
        }

        // for (int i = 0; i < topTenSongs.length; i++) {
        // topTenSongs[i] = new Song("test");
        // }
        for (Song s: topTenSongs){
            s.setPrice(1.29);
        }

        for (int i = 2; i < 10; i+=3) {
            topTenSongs[i].setPrice(0.99);
        }
        // show the array
        System.out.println("-AFTER--");
        for (Song showSong : topTenSongs) {
            System.out.println(showSong.getTitle() + " " + showSong.getPrice());
        }
        
        
        int index = SongFinder.findTitle(null, null);
        if (index >=0 ) {
            System.out.println("Found " + topTenSongs[index].getTitle());
        }
        else  {
            System.out.println("Song not found!");
        }
    }
}
