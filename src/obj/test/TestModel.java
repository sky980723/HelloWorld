package obj.test;

import java.util.ArrayList;
import java.util.List;

public class TestModel {
    public static void main(String[] args) {
        System.out.println("test");
        System.out.println("args = [" + args + "]");
        int num = 1;
        System.out.println("num = " + num);
        System.out.println(args);
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        //判断list是否为null，使用模板：list.null
        if (list == null) {
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
        //换另一个模板生成：如果!= null : list.nn
        if (list != null) {
            
        }
        //循环遍历list
        //list.for:增强for循环
        for (Integer integer : list) {
            
        }
        //list.fori：普通for循环
        for (int i = 0; i < list.size(); i++) {
            
        }
        //list.forr：逆向普通for循环
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
        //"test".sout
        System.out.println("test");
    }
    private static final int A = 1;
    public static final String a = "a";
    public static final int a = 2;
   
}
