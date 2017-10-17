
/**
 * Write a description of class SongFinder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SongFinder
{
    public static int findTitle(Song[] songs, String target){
        if (songs == null || target == null) {
            return -1; 
        }
        for (int i = 0; i < songs.length; i++){
            String word = songs[i].getTitle();
            if (word.equals(target)) {
                return i;
            }
        }
        return -1;
       }
}
