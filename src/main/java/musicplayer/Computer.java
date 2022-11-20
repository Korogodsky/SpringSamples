package musicplayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
	JazzMusicPlayer musicPlayer;

	@Autowired
	public Computer(JazzMusicPlayer musicPlayer) {
		this.musicPlayer = musicPlayer;
	}

	@Override
	public String toString() {
		return "Computer palying: " + musicPlayer.toString();
	}

}
