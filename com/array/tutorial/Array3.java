package com.array.tutorial;

public class Array3 {

	public static void main(String[] args) {

		int[][][] i = { { { 10, 20, 30 }, { 40, 50, 60 } }, { { 70, 80, 90 }, { 100, 110, 120 } } };
		System.out.println(i[0][1][2]);
		System.out.println(i[1][1][2]);
		System.out.println(i[0][1][1]);
		System.out.println(i[0][1][0]);
		System.out.println(i[1][1][1]);
		System.out.println(i[1][0][2]);

		for (int[][] row : i) {
			for (int[] column : row) {
				System.out.print(column + "   ");
			}
			System.out.println();

		}
	}
}