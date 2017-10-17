/**
 * Write a description of class LoopingMediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoopingMediaLib
{
    public static void main()
    {
        String songInfo = MediaFile.readString();
        MediaFile.saveAndClose();
        int favoriteRating = 8; 
        System.out.println("My Favorite Songs");
        System.out.println("-----------------");
        //while(songInfo.length() > 1)
        //for(int i = 0; i < 100; i++)
        while(songInfo.length() > 1)
        {
            int searchIndex = 0;
        
            /*if(songInfo.length() == 0)
            {
                break;
            }
            */
           
 
            String title = songInfo.substring(0, songInfo.indexOf("|"));
            searchIndex = songInfo.indexOf("|", searchIndex + 1);
            String rating = songInfo.substring(searchIndex + 1, songInfo.indexOf(
            "|", searchIndex + 1));
            searchIndex = songInfo.indexOf("|", searchIndex + 1);
            songInfo = songInfo.substring(searchIndex + 1, songInfo.length());
            if(Integer.valueOf(rating) >= favoriteRating) {
                System.out.println(title + "(" + rating + ")");
            }
        }
    }
}
