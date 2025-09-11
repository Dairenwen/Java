package class1;

import java.util.Scanner;

//java的文件名后缀必须带有java
public class HelloWorld
{
    //请注意，这里java的类名必须与文件名相同
    public static void main(String[] args)
    {
        //java的byte类型是一个字节，char类型为2个字节
        byte a=12;
        int b=13;
        long c=12345678910L;//加上L代表为long类型（自动为int类型)
        float d=3.1415926F;//加上F代表为float类型（自动为double类型）

        //byte，short，char是直接转换成int进行计算的
        short e=(short)(a+b);

        //能加就加，不能加就在合在一起
        System.out.println(1+2+"Hello,linux!Hello,Java!");
        System.out.println(1+"Hello,linux!Hello,Java!"+2);

        //解决一下java中输入输出的问题,使用API，即官方写好的程序接口
        //先import scanner,再new一个sanner，第一次输入调用nextInt，往后调用next

        // 创建 Scanner
        Scanner scanner = new Scanner(System.in);
        // 读取整数
        System.out.print("请输入一个整数：");
        int num = scanner.nextInt();
        System.out.println("你输入的整数是：" + num);
        // 读取字符串（注意：next() 读取到空格为止，nextLine() 读取一整行）
        System.out.print("请输入一个字符串：");
        String str = scanner.next(); // 若前面用了 nextInt()，需先处理换行符，可再加一次 nextLine()
        System.out.println("你输入的字符串是：" + str);


        //switch语句的注意事项:
        //表达式类型只能是byte、short、int、char；JDK5开始支持枚举；JDK7开始支持String；不支持double、float、long。
        String str1 = "apple";
        switch(str1)
        {
            case "apple":
                System.out.println(str1);
                break;
            default:
                break;
        }

    }
}
