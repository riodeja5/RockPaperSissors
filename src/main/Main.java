package main;

import java.util.List;
import java.util.Map;

import judge.Judgement;
import judge.Result;
import player.CPULevel1;
import player.CPULevel2;
import player.CPULevel3;
import player.Human;
import player.Player;

public class Main {

	public static void main(final String[] args) {
		
		final Judgement judgement = new Judgement();
		
		final Player player1 = new Human("You");
//		final Player player2 = new CPULevel1();
//		final Player player2 = new Human("Me");
//		final Player player2 = new CPULevel2();
		final Player player2 = new CPULevel3();
		
		System.out.println("じゃんけんゲーム開始");
		System.out.println("第1プレイヤーは" + player1.getName() + "です。");
		System.out.println("第2プレイヤーは" + player2.getName() + "です。");
		
		for (int ii = 0; ii < 3; ii++) {
			
			final Hand hand1 = player1.play();
			final Hand hand2 = player2.play();
			
			System.out.println("じゃんけんポン！");
			
			System.out.println(player1.getName() + "は" + hand1.getName() + "を出しました");
			System.out.println(player2.getName() + "は" + hand2.getName() + "を出しました");
			
			final List<Result> listResult = judgement.judge(hand1, hand2);

			final Result result1 = listResult.get(0);
			final Result result2 = listResult.get(1);
			switch (result1) {
			case DRAW:
				System.out.println("あいこです");
				break;
			case WIN:
				System.out.println(player1.getName() + "の勝ちです");
				break;
			case LOSE:
				System.out.println(player1.getName() + "の負けです");
				break;
			}
			
			player1.memory(hand2, result1);
			player2.memory(hand1, result2);
		}
	}
}
