package player;

import judge.Result;
import main.Hand;

public class CPULevel1 implements Player {

	private Hand m_PreHand = Hand.ILLEGAL;
	
	@Override
	public String getName() {
		return "CPU Level 1";
	}

	@Override
	public Hand play() {
		
		final Hand nextHand;
		
		switch (m_PreHand) {
		
		case ROCK:
			nextHand = Hand.SISSORS;
			break;
			
		case SISSORS:
			nextHand = Hand.PAPER;
			break;
			
		case PAPER:
		case ILLEGAL:
		default:
			nextHand = Hand.ROCK;
			break;
		}
		
		m_PreHand = nextHand;
		return nextHand;
	}

	@Override
	public void memory(Hand hand, Result result) {
		// Do Nothing.
	}

}
