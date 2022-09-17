
/**
 * Write a description of class sound here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class sound
{
    public static void main (String[] args)
    {
        new sound ();
    }
    
    public void sound (String filename)
    {
        File Clap = new File (filename);
        PlaySound (Clap);
        
    }
    
     public void PlaySound (File Sound)
    {
        try {
            Clip clip = AudioSystem.getClip ();
            clip.open (AudioSystem.getAudioInputStream (Sound));
            clip.start ();
            
            Thread.sleep(clip.getMicrosecondLength () /1000);
    }
    catch (Exception e)
    {
    }
}
}
    
    
