package player;

import judge.Result;
import main.Hand;

public class CPULevel2 implements Player {

	private final RandomHand m_RandomHand = new RandomHand();
	
	@Override
	public String getName() {
		return "CPU Level 2";
	}

	@Override
	public Hand play() {
		return m_RandomHand.getHand();
	}

	@Override
	public void memory(Hand hand, Result result) {
		// Do Nothing.
	}

}
