package utils;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.*;

public class Sound {

    /**
     * @param filename Name of the file that is going to be played
     */
    public void playSound(String filename){
        try
        {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(new File(filename)));
            clip.start();
        }
        catch (Exception exc)
        {
            exc.printStackTrace(System.out);
        }
    }
}
