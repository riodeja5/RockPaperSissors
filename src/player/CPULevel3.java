package player;

import judge.Result;
import main.Hand;

public class CPULevel3 implements Player {

	private final RandomHand m_RandomHand = new RandomHand();
	private int m_iGameCount = 0;
	private Hand m_PreHand = Hand.ILLEGAL;
	private Result m_PreResult = Result.DRAW;
	
	@Override
	public String getName() {
		return "CPU Level 3";
	}

	@Override
	public Hand play() {
		
		m_iGameCount++;
		if (1 == m_iGameCount
				|| Result.LOSE == m_PreResult) {
			
			final Hand nextHand = m_RandomHand.getHand();
			m_PreHand = nextHand;
			return nextHand;
		}
		
		return m_PreHand;
	}

	@Override
	public void memory(Hand hand, Result result) {
		m_PreResult = result;
	}

}
