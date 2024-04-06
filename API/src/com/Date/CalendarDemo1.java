package com.Date;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo1 {
    public static void main(String[] args) {
        //1.获取日历对象
        //细节：calendar是一个抽象类，要用静态方法调用该对象
        //细节2：月份表示为0~11，如果获取出来的是0，实际上是一月
        //星期，1~7，1表示星期日
        Calendar c = Calendar.getInstance();
        System.out.println(c);

        //2.修改日历的时间
        c.setTime(new Date());
        System.out.println(c);

        //3.获取日期中的某个字段信息
        // 0:纪元 1：年 2：月 3:一年中的第几周 4：一个月中的第几周 5：日
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));

        //4.修改日历中的某个字段
        c.set(Calendar.YEAR,2000);
        System.out.println(c.get(1));

        //5.为日历中的某个字符按增加/减少指定的值
        c.add(1,1);
        System.out.println(c.get(1));
    }
}
