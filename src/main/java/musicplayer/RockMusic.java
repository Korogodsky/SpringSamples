package musicplayer;

import org.springframework.stereotype.Component;

@Component("componentRockMusic")
public class RockMusic implements Music{

	public String getSong() {
		return "Rock music";
	}

}
