package judge;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import main.Hand;

public class Judgement {

	/**
	 * ��1�v���C���[�̑�2�v���C���[�ɑ΂��鏟�s�𔻒肷��B
	 * @param handOne ��1�v���C���[�̎�
	 * @param handOnother ��2�v���C���[�̎�
	 * @return ��1�v���C���[�̑�2�v���C���[�ɑ΂��鏟�s
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
		
		// ���肪�ςȎ���o�����甽������
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
