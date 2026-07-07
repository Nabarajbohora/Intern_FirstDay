package MemoryAllocation;

public class Memory {
    public static void main (String[]args){
//
//        int i = 1;
//        Object obj = new Object();
//        Memory mem = new Memory();
//        mem.foo(obj);
//    }
//    private void foo(Object param){
//        String str = param.toString();
//        System.out.println(str);


        int i = 1;
        Object obj = new Object();
        Memory Mem = new Memory();
        Mem.foo(obj);
    }
    private void  foo(Object param){
        String str = param.toString();
        System.out.println(str);
    }
}
