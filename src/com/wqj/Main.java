package com.wqj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int cishu = 0;
    static int tizushu = 0;
    static List l1 = new ArrayList();
    static List l = new ArrayList();
    static List result = new ArrayList();
    static String str5 = "";

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int a = Integer.parseInt(s.nextLine());
            if (a == 0) {
                break;
            } else {
                for (int n = 0; n < a; n++) {
                    String ss = s.nextLine();
                    l1.add(ss);

                }
                int b = Integer.parseInt(s.nextLine());
                for (int n = 0; n < b; n++) {
                    String ss1 = s.nextLine();
                    l.add(ss1);
                }
            }
//            List zuhe = new ArrayList<List<String>>();
//            zuhe.add(l1.toString());
//            zuhe.add(l.toString());
            tizushu++;
            if (l.size() != l1.size()) {
                str5 = "Wrong Answer";
            } else {
                for (int i = 0; i < l.size(); i++) {
                    if (l.get(i).toString().equals(l1.get(i).toString())) {
                        cishu++;
                    }
                }
                if (cishu == l.size()) {
                    str5 = "Accepted";
                } else {
                    int shuzi = 0;
                    for (int i = 0; i < l.size(); i++) {
                        if (panduan(l.get(i).toString(), l1.get(i).toString())) {
                            shuzi++;
                        }
                    }
                    if (shuzi == l.size()) {
                        str5 = "Presentation Error";
                    } else
                        str5 = "Wrong Answer";
                }
                l.clear();
                l1.clear();
            }
            result.add(str5);
            cishu=0;
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.println("Run #" + (i + 1) + ": " + result.get(i));
        }
    }

    public static boolean panduan(String str, String str1) {
        boolean a = false;
        if (!"".equals(str) && !"".equals(str1)) {
            char num[] = str.toCharArray();//把字符串转换为字符数组
            char num1[] = str1.toCharArray();//把字符串转换为字符数组
            StringBuffer title = new StringBuffer();//使用StringBuffer类，把非数字放到title中
            StringBuffer title1 = new StringBuffer();//使用StringBuffer类，把非数字放到title1中
            StringBuffer hire = new StringBuffer();//把数字放到hire中
            StringBuffer hire1 = new StringBuffer();//把数字放到hire1中

            for (int i = 0; i < num.length; i++) {
                // 判断输入的数字是否为数字还是字符
                if (Character.isDigit(num[i])) {//把字符串转换为字符，再调用Character.isDigit(char)方法判断是否是数字，是返回True，否则False
                    hire.append(num[i]);// 如果输入的是数字，把它赋给hire
//                hire1.append(num1[i]);
                } else {
                    title.append(num[i]);// 如果输入的是字符，把它赋给title
//                title1.append(num1[i]);// 如果输入的是字符，把它赋给title
                }

            }
            for (int i = 0; i < num1.length; i++) {
                if (Character.isDigit(num1[i])) {//把字符串转换为字符，再调用Character.isDigit(char)方法判断是否是数字，是返回True，否则False
                    hire1.append(num1[i]);// 如果输入的是数字，把它赋给hire
//                hire1.append(num1[i]);
                } else {
                    title1.append(num1[i]);// 如果输入的是字符，把它赋给title
//                title1.append(num1[i]);// 如果输入的是字符，把它赋给title
                }
            }
//             System.out.println(hire);
//             System.out.println(hire1);
//            System.out.println(str.length());
//            System.out.println(str1.length());
            if (hire.toString().equals("") && hire1.toString().equals("") && str.length() == str1.length()) {
                a = true;
            } else if (hire.toString().equals(hire1.toString())) {
                a = true;
            }
        }
        return a;
    }
}







