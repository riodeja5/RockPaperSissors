package player;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import judge.Result;
import main.Hand;

public class Human implements Player {

	private final String m_sName;
	private final BufferedReader reader;
	
	public Human(final String sName) {
		m_sName = sName;
		reader = new BufferedReader(new InputStreamReader(System.in));
	}

	@Override
	public String getName() {
		return m_sName;
	}

	@Override
	public Hand play() {
		
		try {
			while(true) {
				System.out.println("じゃんけんの手を入力してください。G/P/C");
				final String sName = reader.readLine();
				final Hand hand = Hand.getHand(sName);
				if (Hand.ILLEGAL != hand) {
					return hand;
				}
				System.out.println("入力エラーです。");
			}
		} catch (IOException e) {
			return Hand.ILLEGAL;
		}
	}

	@Override
	public void memory(Hand hand, Result result) {
		// TODO Auto-generated method stub
		System.out.println("相手の手を覚えておきましょう。[" + hand + "]");
	}

}
