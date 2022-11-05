package musicplayer;

// import java.util.ArrayList;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMusicPlayer {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		MusicPlayer firstPlayer = context.getBean("musicPlayer", MusicPlayer.class);
		firstPlayer.playMusic();
		
		MusicPlayer secondMusicPlayer = context.getBean("mPlayer", MusicPlayer.class);
		secondMusicPlayer.playMusic();
		System.out.println("volume: " + secondMusicPlayer.getVolume() + " (" + secondMusicPlayer.getName() +")");
		
		context.close();
		
//		ArrayList<Music> music = new ArrayList<Music>();
//		music.add(new RockMusic());
//		music.add(new ClassicMusic());
//		
//		MusicPlayer player = new MusicPlayer(music);
//		player.playMusic();
		
	}

}
