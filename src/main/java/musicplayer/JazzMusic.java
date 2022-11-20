package musicplayer;

import org.springframework.stereotype.Component;

@Component("componentJazzMusic")
public class JazzMusic implements Music {

	public String getSong() {
		return "Jazz music";
	}

}
