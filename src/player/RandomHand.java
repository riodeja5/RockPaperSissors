package player;

import java.util.Random;

import main.Hand;

public class RandomHand {

	private final Random m_Random = new Random();

	public Hand getHand() {
		
		final int iRandomVal = m_Random.nextInt(3);
		
		switch (iRandomVal) {
		case 0:
			return Hand.ROCK;
			
		case 1:
			return Hand.PAPER;
			
		case 2:
			return Hand.SISSORS;

		default:
			return Hand.ILLEGAL;
		}
	}
}
