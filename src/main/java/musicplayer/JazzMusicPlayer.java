package musicplayer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class JazzMusicPlayer {
	
	private Music music;
	private String name;
	private int volume;

	public JazzMusicPlayer() {}
	
	@Autowired
	public JazzMusicPlayer(@Qualifier("componentJazzMusic") Music music) {
		this.music = music;
	}
	
	public void initMethod() {
		System.out.println("Init method: " + getName());
	}
	
	public void destroyMethod() {
		System.out.println("Destroy method: " + getName());
	}
	
	public void playMusic() {
		System.out.println("Playing: " + music.getSong() + " (" + getName() + ")");
	}

	public Music getMusic() {
		return music;
	}

	//@Autowired
	public void setMusic(JazzMusic music) {
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

	@Override
	public String toString() {
		return music.getSong();
	}
	
}
