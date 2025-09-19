package class4;

public class function
{
    public static void test1()
    {
        System.out.println("test1");
        return;
    }

    public static void test2(int a)
    {
        //拷贝传值，形参是对实参的拷贝，改变不影响实参，但如果是数组传递的是指针，所以可以对数组储存的数据进行改更改
        a=1234;
        return;
    }

    public static void test3(int[] args)
    {
        args[0]=1234;
        return;
    }
    public static void main()
    {
        //如果声明了返回void数据就不能使用return返回数据，声明了返回int就必须return int类型的数据
        test1();

        int a=123;
        int[] arr={123};
        test2(a);
        test3(arr);
        System.out.println(a);
        System.out.println(arr[0]);
    }
    //讲解一下java方法执行原理：函数执行前，类会被加载到方法区，main函数会在栈区创建栈桢，遵循FILO规则，随后调用其他方法也会创建栈桢，执行完毕后会弹出清除，回到上一个方法中


}
