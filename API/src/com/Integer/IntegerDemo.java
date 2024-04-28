package com.Integer;

import java.util.ArrayList;
import java.util.Scanner;

public class IntegerDemo {
    public static void main(String[] args) {
        //键盘录入一些1~100之间的整数，并添加到集合中
        //直到集合中所有数据和超过200为止

        //1.创建一个集合用来添加整数
        ArrayList<Integer> list = new ArrayList<>();
        //2.键盘录入数据添加到集合中
        Scanner s = new Scanner(System.in);
        while (true){
            System.out.println("请录入一个整数");
            String numStr = s.nextLine();
            int num = Integer.parseInt(numStr);
            //将不符合要求的数据进行过滤
            if (num< 1 || num > 100){
                System.out.println("抱歉，当前录入的数据格式错误，请重新输入！");
                continue;
            }
            list.add(num);
            
            //统计集合中所有的数据和
            int sum = getSum(list);
            if (sum > 200){
                System.out.println("你目前录入的数据之和为"+ sum+"您录入的数据之和超过200，数据录入停止！");
                return;
            }
        }
    }

    private static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            Integer num = list.get(i);
            sum = sum  + num;
        }
        return sum;
    }
}
