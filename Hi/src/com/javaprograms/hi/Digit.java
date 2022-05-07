package com.javaprograms.hi;
//square root and square
public class Digit {

	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			int d = 0, count = 0, l, r;

			int res = (int) Math.pow(i, 2);
			int n = i;
			int temp = n;
			int finalres = res;
			while (n != 0) {
				n /= 10;
				d++;
			}

			while (res != 0) {
				res = res / 10;
				count++;
			}
			String finalresString = String.valueOf(finalres);
			String lstr = "";
			String rstr = "";
			lstr = finalresString.substring(0, count - d);
			rstr = finalresString.substring(count - d, finalresString.length());
			if (lstr.compareTo("") == 0) {
				lstr = "0";
			}
			if (Integer.parseInt(lstr) + Integer.parseInt(rstr) == temp) {

				System.out.print(temp + " ");
		}
		}

	}

}
