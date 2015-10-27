package player;
import judge.Result;
import main.Hand;

public interface Player {

	String getName();
	
	Hand play();
	
	void memory(final Hand hand, Result result);
}
