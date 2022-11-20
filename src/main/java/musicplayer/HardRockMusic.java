package musicplayer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("componentHardRockMusic")
@Scope("prototype")
public class HardRockMusic implements Music{
	@Value("${HardRockMusic.descriplion}")
	private String description;
	
	@Value("${HardRockMusic.total}")
	private int total;

	public String getSong() {
		return "Rock music";
	}

	public String getDescription() {
		return description;
	}

	public int getTotal() {
		return total;
	}
	
    @javax.annotation.PostConstruct
	public void initMethod() {
		System.out.println("Init hard rock");
	}
    
    @javax.annotation.PreDestroy	
	public void destroyMethod() {
		System.out.println("Destroy hard rock");
	}

}
