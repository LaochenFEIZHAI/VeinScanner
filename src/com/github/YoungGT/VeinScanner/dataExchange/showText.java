package com.github.YoungGT.VeinScanner.dataExchange;

import com.github.YoungGT.VeinScanner.gui.VeinScanner;

/**
 *
 * @author Administrator
 */
public class showText {
	public showText(String type) {
		if (type.equals("ERROR")) {
			VeinScanner.jLabel8.setText("请输入正确的坐标!");
		} else {
			VeinScanner.jLabel8.setText("计算完毕");
		}
	}

	public static void showPoints() {
		VeinScanner.vp00.setText(returnToShow.vpS[0][0]);
		VeinScanner.vp01.setText(returnToShow.vpS[0][1]);
		VeinScanner.vp02.setText(returnToShow.vpS[0][2]);
		VeinScanner.vp10.setText(returnToShow.vpS[1][0]);
		VeinScanner.vp11.setText(returnToShow.vpS[1][1]);
		VeinScanner.vp12.setText(returnToShow.vpS[1][2]);
		VeinScanner.vp20.setText(returnToShow.vpS[2][0]);
		VeinScanner.vp21.setText(returnToShow.vpS[2][1]);
		VeinScanner.vp22.setText(returnToShow.vpS[2][2]);
	}
}
