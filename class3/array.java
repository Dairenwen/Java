package class3;

import java.util.Scanner;
import java.util.Random;

public class array
{
    public static void reversearray()
    {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int left=0,right=arr.length-1;
        while(left<right)
        {
            int tmp=arr[left];
            arr[left]=arr[right];
            arr[right]=tmp;
            left++;
            right--;
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void findmax()
    {
        int[] arr={123,234,345,456,567,678,789,890};
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max) max=arr[i];
        }
        System.out.println(max);
    }
    public static void main(String[] args)
    {
        int[] arr1=new int[]{1,2,3,4,5,6,7,8,9,10};//可以这样创建静态数组
        int[] arr2={1,2,3,4,5,6,7,8,9,10};//也可以省略new
        System.out.println(arr1.length);//获取数组长度可以直接调用length

        for(int i=0;i<arr1.length;i++) System.out.println(arr1[i]);//遍历数组

        //上面是静态开辟数组，即知道具体放入的元素，下面是动态开辟数组
        int[] arr3=new int[10];
        int size=10;
        int[] arr4=new int[size];
        //java的内存分配：方法区：放class文件；栈区：运行的方法，main函数，变量；堆区：new出来的对象都保存在堆中
        //数组的所有成员（即存储数据的数组对象本身），无论何种情况，都一定在堆空间上。这是Java内存模型的固定规则，数组属于引用类型，其对象实例必然存于堆区。
        int[] arr5=arr4;//如果是局部变量的数组名位于栈区，数组赋值相当于给一个地址

        arr5=null;
        System.out.println(arr5);
        //arr5[0]=1;//当你将一个空指针给数组名时候，如果进行解引用操作或者访问，都会报错

        reversearray();
        findmax();
    }

}
