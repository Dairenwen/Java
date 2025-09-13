package class2;

import java.util.Random;
import java.util.Scanner;

public class random
{
    public static void guessnumber()
    {
        //猜数字的小游戏
        Random ran=new Random();
        Scanner scan=new Scanner(System.in);
        int number=ran.nextInt(100),put=-1;
        //System.out.print("Please put in your number: ");
        //put=scan.nextInt();
        while(put!=number)
        {
            System.out.print("Please put in your number: ");
            put=scan.nextInt();
            if(put<number) System.out.println("Your number too small");
            else if(put>number) System.out.println("Your number too big");
        }
        System.out.println("Perfect!");

    }
    public static void main(String[] args)
    {
        Random ran= new Random();
        for(int i=0;i<10;i++)
        {
            int number=ran.nextInt(100);//注意先导包，new对象，调用函数，生成0-99的随机数
            System.out.println("the random number is "+number);
        }

        guessnumber();
    }
}
