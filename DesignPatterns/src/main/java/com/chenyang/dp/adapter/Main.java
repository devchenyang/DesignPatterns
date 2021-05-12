package com.chenyang.dp.adapter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * 字符缓冲流不能直接有文件输入流，可以通过转成字符输入流然后再加到字符缓冲流中
 * 这里的字符输入流就是adapter适配器
 */
public class Main {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("D:/test.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        while (line != null && !line.equals("")) {
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
    }
}
