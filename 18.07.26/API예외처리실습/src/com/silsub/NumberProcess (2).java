package com.silsub;

import com.silsub.*;

public class NumberProcess {

	public NumberProcess() {
	}

	public boolean checkDouble(int a, int b) throws NumberRangeException {
		
		
		if ((a < 1 || a > 100) || (b < 1 || b > 100)) {
			throw new NumberRangeException("1부터 100 사이의 값이 아닙니다.");
		}
		if (a == (b * 2)) {
			boolean chk = true;
			return chk;
		} else {
			boolean chk = false;
			return chk;
		}

	}

}
