package com.github.YoungGT.VeinScanner.dataExchange;

import com.github.YoungGT.VeinScanner.calc.calcPoints;

/**
 *
 * @author Administrator
 */
public class returnToShow {
	public static String[][] vpS = { { "", "", "" }, { "", "", "" }, { "", "", "" } };

	public returnToShow(String type) {
		new showText(type);
	}

	public static void putVeinPointsInOrder() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				returnToShow.vpS[i][j] = calcPoints.veinPointsX[i][j] + "," + calcPoints.veinPointsZ[i][j];
			}
		}
		new returnToShow("PERFECT");
		showText.showPoints();
	}
}
