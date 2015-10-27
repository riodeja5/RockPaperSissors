package judge;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import main.Hand;

public class Judgement {

	/**
	 * 第1プレイヤーの第2プレイヤーに対する勝敗を判定する。
	 * @param handOne 第1プレイヤーの手
	 * @param handOnother 第2プレイヤーの手
	 * @return 第1プレイヤーの第2プレイヤーに対する勝敗
	 */
	public List<Result> judge(final Hand handOne, final Hand handOnother) {
		
		final List<Result> listResult = new LinkedList<Result>();
		
		if (handOne == handOnother) {
			listResult.add(Result.DRAW);
			listResult.add(Result.DRAW);
			return listResult;
		}
		
		if (Hand.ROCK == handOne
				&& Hand.SISSORS == handOnother) {
			listResult.add(Result.WIN);
			listResult.add(Result.LOSE);
			return listResult;
		}
		
		if (Hand.PAPER == handOne
				&& Hand.ROCK == handOnother) {
			listResult.add(Result.WIN);
			listResult.add(Result.LOSE);
			return listResult;
		}
		
		if (Hand.SISSORS == handOne
				&& Hand.PAPER == handOnother) {
			listResult.add(Result.WIN);
			listResult.add(Result.LOSE);
			return listResult;
		}
		
		// 相手が変な手を出したら反則負け
		if (Hand.ILLEGAL == handOnother) {
			listResult.add(Result.WIN);
			listResult.add(Result.LOSE);
			return listResult;
		}
		listResult.add(Result.LOSE);
		listResult.add(Result.WIN);
		return listResult;
	}
}
