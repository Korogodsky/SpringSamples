package musicplayer;

import org.springframework.stereotype.Component;

@Component("componentClassicMusic")
public class ClassicMusic implements Music {

	public String getSong() {
		return "Classic music";
	}

}
