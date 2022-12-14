package musicplayer;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
	
	private List<Music> music;
	private ClassicMusic classicMusic;
	private String name;
	private int volume;

	public MusicPlayer() {}
	
	public MusicPlayer(List<Music> music) {
		this.music = music;
	}
	
	public static MusicPlayer getMusicPlayer(List<Music> music) {
		System.out.println("factory");
		return new MusicPlayer(music);
	}
	
	public void initMethod() {
		System.out.println("Init method: " + getName());
	}
	
	public void destroyMethod() {
		System.out.println("Destroy method: " + getName());
	}
	
	public void playMusic() {
		for (Music m : music) {
			System.out.println("Playing: " + m.getSong() + " (" + getName() + ")");
		}
	}
	
	public void playClassicMusic() {
		System.out.println("Playing: " + classicMusic.getSong() + " (" + getName() + ")");
	}

	public List<Music> getMusic() {
		return music;
	}

	public void setMusic(List<Music> music) {
		this.music = music;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
}
