package com.github.YoungGT.VeinScanner.calc;

import com.github.YoungGT.VeinScanner.dataExchange.returnToShow;

/**
 *
 * @author Administrator
 */
public class calcPoints {
	public static int[][] veinPointsX = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
	public static int[][] veinPointsZ = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
	int inX, inZ;
	int vpX, vpZ;

	public calcPoints(int aX, int aZ) {
		this.inX = aX;
		this.inZ = aZ;
		this.vpX = this.inX - (this.inX - 24) % 48;
		this.vpZ = this.inZ - (this.inZ - 24) % 48;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				veinPointsX[i][j] = this.vpX + (j - 1) * 48;
				veinPointsZ[i][j] = this.vpZ + (i - 1) * 48;
			}
		}
		returnToShow.putVeinPointsInOrder();
	}
}
