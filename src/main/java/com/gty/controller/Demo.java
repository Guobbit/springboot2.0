package com.gty.controller;

public class Demo {
	public static void main(String[] args) {
		int[] a = { 19, 222, 33, 1, 80, 77, 60 };
		int[] b = maopao(a);
		System.out.println("=====冒泡=====");
		for (int x : b) {
			System.out.print(x + " ");
		}
		System.out.println();
		int[] c = xuanze(a);
		System.out.println("=====选择=====");
		for (int y : c) {
			System.out.print(y + " ");
		}

	}
	// 通过相邻的两个数的比较, 根据需要决定是否将两个数互换位置, 然后将比较往前(或往后)推进.
	public static int[] maopao(int[] a) {
		int temp;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}

	// 第0个逐步和后面全部的比,比完0位置就得到最小的数,紧接着再从1位置对比后面的元素,以此类推,逐步得到从小到大的值.
	public static int[] xuanze(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int k = i;
			for (int j = k + 1; j < a.length; j++) {
				if (a[j] < a[k]) {
					k = j;
				}
				if (i != k) {
					int temp = a[i];
					a[i] = a[k];
					a[k] = temp;
				}
			}
		}

		return a;
	}

}
