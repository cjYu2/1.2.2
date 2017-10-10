
/**
 * Write a description of class MediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MediaLib
{
   public static void main()
   {
       System.out.println("Welcome to your Media Library");
       Song song1 = new Song();
       song1.setPrice(1.0);
       System.out.println(song1.getPrice());
       song1.setTitle("Johnny B. Goode");
       System.out.println(song1.getTitle());
       System.out.println(song1.getRating());

       double totalCost = 0.0;
       int numSongs = 0;
       int totalRatings = 0;
       
       Song song2 = new Song("Song2", 1.29, 3);
       totalCost += song2.getPrice();
       numSongs += 1;
       totalRatings += song2.getRating();
       
       Song song3 = new Song("Song3", 1.29, 2);
       totalCost += song3.getPrice();
       numSongs += 1;
       totalRatings += song3.getRating();
       
       Song song4 = new Song("Song4", 1.29, 9);
       totalCost += song4.getPrice();
       numSongs += 1;
       totalRatings += song4.getRating();
       
       Song song5 = new Song("Song5", 0.99, 8);
       totalCost += song5.getPrice();
       numSongs += 1;
       totalRatings += song5.getRating();
       
       Song song6 = new Song("Song6", 0.99, 2);
       totalCost += song6.getPrice();
       numSongs += 1;
       totalRatings += song6.getRating();
       
       Song song7 = new Song("Song7", 0.99, 4);
       totalCost += song7.getPrice();
       numSongs += 1;
       totalRatings += song7.getRating();
       
       Song song8 = new Song("Song8", 1.29, 10);       
       totalCost += song8.getPrice();
       numSongs += 1;
       totalRatings += song8.getRating();
       
       double avgCost = totalCost / (double) numSongs;
       System.out.println("Total Cost: " + totalCost
        + "\nAverage Cost: " + avgCost);
       
       double avgRating = (double) totalRatings / (double) numSongs;
       System.out.println("Average Rating: " + avgRating);
       
       Book book1 = new Book();
       book1.setTitle("Book 1");
       System.out.println(book1.getTitle());
       System.out.println(book1.getRating());
       Movie movie1 = new Movie();
       movie1.setTitle("Movie 1");
       System.out.println(movie1.getTitle());
       System.out.println(movie1.getRating());
       MediaFile.writeString(song2.getTitle()+"|"+song2.getRating());
       MediaFile.writeString(song3.getTitle()+"|"+song3.getRating());
       MediaFile.writeString(song4.getTitle()+"|"+song4.getRating());
       MediaFile.writeString(song5.getTitle()+"|"+song5.getRating());
       MediaFile.writeString(song6.getTitle()+"|"+song6.getRating());
       MediaFile.writeString(song7.getTitle()+"|"+song7.getRating());
       MediaFile.writeString(song8.getTitle()+"|"+song8.getRating());
       MediaFile.saveAndClose();
       
       
   }
}
