package musicplayer;

import java.util.ArrayList;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan("musicplayer")
@PropertySource("classpath:musicPlayer.properties")
public class SpringMusicPlayer {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext xmlContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		MusicPlayer firstPlayer = xmlContext.getBean("musicPlayer", MusicPlayer.class);
		firstPlayer.playMusic();
		
		MusicPlayer secondMusicPlayer = xmlContext.getBean("mPlayer", MusicPlayer.class);
		secondMusicPlayer.playMusic();
		System.out.println("volume: " + secondMusicPlayer.getVolume() + " (" + secondMusicPlayer.getName() +")");
		
		ArrayList<Music> music = new ArrayList<Music>();
		music.add(xmlContext.getBean("componentClassicMusic", ClassicMusic.class));
		music.add(xmlContext.getBean("componentRockMusic", RockMusic.class));
		MusicPlayer thirdMusicPlayer = new MusicPlayer(music);
		thirdMusicPlayer.setName("thirdMusicPlayer");
		thirdMusicPlayer.playMusic();
		
		xmlContext.close();
		
		AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext(SpringMusicPlayer.class);
		ArrayList<Music> annotationMusic = new ArrayList<Music>();
		annotationMusic.add(annotationContext.getBean("componentClassicMusic", ClassicMusic.class));
		annotationMusic.add(annotationContext.getBean("componentRockMusic", RockMusic.class));
		MusicPlayer fourthMusicPlayer = new MusicPlayer(annotationMusic);
		fourthMusicPlayer.setName("fourthMusicPlayer");
		fourthMusicPlayer.playMusic();

		JazzMusicPlayer jazzMusicPlayer = annotationContext.getBean("jazzMusicPlayer", JazzMusicPlayer.class);
		jazzMusicPlayer.setName("jazzMusicPlayer");
		jazzMusicPlayer.playMusic();
		
		Computer comp = annotationContext.getBean("computer", Computer.class);
		System.out.println(comp);
		
		HardRockMusic hardRock1 = annotationContext.getBean("componentHardRockMusic", HardRockMusic.class);
		System.out.println(hardRock1.getDescription());
		System.out.println(hardRock1.getTotal());
		HardRockMusic hardRock2 = annotationContext.getBean("componentHardRockMusic", HardRockMusic.class);
		System.out.println(hardRock2.getDescription());
		System.out.println(hardRock2.getTotal());
		System.out.println("Hard Rock prototype: " + !(hardRock1==hardRock2));
		
		annotationContext.close();
		
//		ArrayList<Music> music = new ArrayList<Music>();
//		music.add(new RockMusic());
//		music.add(new ClassicMusic());
//		
//		MusicPlayer player = new MusicPlayer(music);
//		player.playMusic();
		
	}

}
