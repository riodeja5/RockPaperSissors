package main;

public enum Hand {

	ROCK("G"),
	PAPER("P"),
	SISSORS("C"),
	ILLEGAL("GWASHI")
	;
	
	private final String m_sName;
	
	Hand(final String sName) {
		m_sName = sName;
	}
	
	String getName() {
		return m_sName;
	}
	
	public static Hand getHand(final String sName) {
		
		for (final Hand hand : Hand.values()) {
			if (hand.m_sName.equals(sName)) {
				return hand;
			}
		}
		
		return ILLEGAL;
	}
}
