package com.jikexueyuan.ILJQQ;
/*
 * jikexueyuan
 * Yiqing Hu
 * 
 * This program has a function of opening files and find out
 * all the files that is formatting with mp3
 */

import java.io.File;

public class FindFile {
	public static void main(String[] args) {
		// 设置目标文件夹
		// 我的电脑是Mac 我设置的是自己电脑里面音乐的文件地址
		// 老师请根据自己文件位置设置地址
		File fin = new File("src/Music");
		// 调用方法扫描文件夹
		isMusic(fin);
	}

	/*
	 * 使用递归法来调用从而实现打开子文件夹
	 */
	public static void isMusic(File fin) {
		File[] file = fin.listFiles();
		if (file != null) {
			// for each loop
			for (File file2 : file) {
				if (file2.isFile()) {
					String name = file2.getPath();
					if (name.endsWith("mp3")) {
						System.out.println(name);
					}
				} else {
					// recursion(递归)
					isMusic(file2);
				}
			}
		}
	}
}
