import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;

public class JavaTutorialWavFileAbspielen {
	public static void main(String[] args) {
		
		File f = new File("01 Fantasy (online-audio-converter.com)");
		AudioClip sound = Applet.newAudioClip(f.toURL());
		sound.play();
		Thread.sleep(100000);
	}
}
