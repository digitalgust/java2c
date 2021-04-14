package test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Foo1 {
//

    public void t0() {
        System.out.println("HelloWorld.");
    }

    public void t1() {

        byte f0 = 100;
        byte f1 = (byte) (5 % f0 - 2 * (9 + 5) / 2);
        System.out.println("+ = " + (f0 + f1));
        System.out.println("- = " + (f0 - f1));
        System.out.println("* = " + (f0 * f1));
        System.out.println("/ = " + (f0 / f1));
        System.out.println("% = " + (f0 % f1));
        byte[] val = new byte[10];
        f1 = 100;
        f1 = (byte) (f1 * f1 / f1 + f1 - f1 / 2);
        System.out.println(f1);
        val[0] = f1;
        System.out.println(val[0]);
        for (int i = 0; i < val.length; i++) {
            val[i] = (byte) (5 % f0 - 2 * (9 + 5) / 2);
        }
        System.out.println("byte.length=" + val.length + " type:" + val.getClass().getComponentType());
        for (int i = 0; i < val.length; i++) {
            System.out.println("val[" + i + "]=" + val[i]);
        }
    }

    public void t2() {

        short f0 = 100;
        short f1 = (short) (5 % f0 - 2 * (9 + 5) / 2);
        System.out.println("+ = " + (f0 + f1));
        System.out.println("- = " + (f0 - f1));
        System.out.println("* = " + (f0 * f1));
        System.out.println("/ = " + (f0 / f1));
        System.out.println("% = " + (f0 % f1));
        short[] val = new short[10];
        f1 = 1000;
        f1 = (short) (f1 * f1 / f1 + f1 - f1 / 2);
        System.out.println(f1);
        val[0] = f1;
        System.out.println(val[0]);
        for (int i = 0; i < val.length; i++) {
            val[i] = (short) (5 % f0 - 2 * (9 + 5) / 2);
        }
        System.out.println("short.length=" + val.length);
        for (int i = 0; i < val.length; i++) {
            System.out.println("val[" + i + "]=" + val[i]);
        }
    }

    public void t3() {

        int f0 = 100;
        int f1 = 5 % f0 - 2 * (9 + 5) / 2;
        ;
        System.out.println("+ = " + (f0 + f1));
        System.out.println("- = " + (f0 - f1));
        System.out.println("* = " + (f0 * f1));
        System.out.println("/ = " + (f0 / f1));
        System.out.println("% = " + (f0 % f1));
        int[] val = new int[10];
        f1 = 100000000;
        f1 = f1 * f1 / f1 + f1 - f1 / 2;
        System.out.println(f1);
        val[0] = f1;
        System.out.println(val[0]);
        for (int i = 0; i < val.length; i++) {
            val[i] = 5 % f0 - 2 * (9 + 5) / 2;
        }
        System.out.println("int.length=" + val.length);
        for (int i = 0; i < val.length; i++) {
            System.out.println("val[" + i + "]=" + val[i]);
        }
    }

    public void t4() {

        long f0 = 100;
        long f1 = 5 % f0 - 2 * (9 + 5) / 2;
        ;
        System.out.println("+ = " + (f0 + f1));
        System.out.println("- = " + (f0 - f1));
        System.out.println("* = " + (f0 * f1));
        System.out.println("/ = " + (f0 / f1));
        System.out.println("% = " + (f0 % f1));
        long[] val = new long[10];
        f1 = 1000000000000000L;
        f1 = f1 * f1 / f1 + f1 - f1 / 2;
        System.out.println(f1);
        val[0] = f1;
        System.out.println(val[0]);
        for (int i = 0; i < val.length; i++) {
            val[i] = 5 % f0 - 2 * (9 + 5) / 2;
        }
        System.out.println("long.length=" + val.length);
        for (int i = 0; i < val.length; i++) {
            System.out.println("val[" + i + "]=" + val[i]);
        }
        f1 = 0x7fffffffffffffffL;
        String s = Long.toString(f1, 16);
        System.out.println("hex:" + s);
        long v1 = Long.parseLong(s, 16);
        System.out.println("hex to long :" + v1);
    }

    public void t5() {

        float f0 = 1.5f;
        float f1 = f0;
        System.out.println("+ = " + (f0 + f1));
        System.out.println("- = " + (f0 - f1));
        System.out.println("* = " + (f0 * f1));
        System.out.println("/ = " + (f0 / f1));
        System.out.println("% = " + (f0 % f1));
        float[] val = new float[10];
        f1 = 5 % f0 - 0.6f * (0.5f + 5) / 9.8f;
        System.out.println(f1);
        val[0] = f1;
        System.out.println(val[0]);
        for (int i = 0; i < val.length; i++) {
            val[i] = i % f0 - 0.6f * (0.5f + 5) / 9.8f;
        }
        System.out.println("float.length=" + val.length);
        for (int i = 0; i < val.length; i++) {
            System.out.println("val[" + i + "]=" + val[i]);
        }
    }

    public void t6() {

        double f0 = 1.5f;
        double f1 = f0;
        System.out.println("+ = " + (f0 + f1));
        System.out.println("- = " + (f0 - f1));
        System.out.println("* = " + (f0 * f1));
        System.out.println("/ = " + (f0 / f1));
        System.out.println("% = " + (f0 % f1));
        double[] val = new double[10];
        f1 = 5 % f0 - 0.6f * (0.5f + 5) / 9.8f;
        System.out.println(f1);
        val[0] = f1;
        System.out.println(val[0]);
        for (int i = 0; i < val.length; i++) {
            val[i] = i % f0 - 0.6f * (0.5f + 5) / 9.8f;
        }
        System.out.println("double.length=" + val.length);
        for (int i = 0; i < val.length; i++) {
            System.out.println("val[" + i + "]=" + val[i]);
        }
    }

    class T7class {

        Object obj_r;
    }

    void t7_1(T7class t7) {

        t7.obj_r = new Long(1);//在方法结束时，此对象应该被释放

        t7.obj_r = new Integer(2);

        String s = "中国";
        System.out.println(s);
        byte[] b = s.getBytes("utf-8");
        if (b != null) {
            System.out.println(s + " bytes:" + b.length);
            String s1 = new String(b, 0, b.length, "utf-8");
            System.out.println(s1);
        }
    }

    void t7() {
        T7class t7 = new T7class();
        t7_1(t7);
    }

    void t8() throws RuntimeException {
        int i = 0;
        try {
            i = 1;
            if (true) {
                throw new Exception("exception test 1");
            }
            i = 0;
        } catch (Exception e) {
            i = 2;
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("i=" + i);
        //if (true) throw new RuntimeException("exception test 2");
        i = 3;

        System.out.println("i=" + i);
        System.out.println();
    }

    void t9() {
        int ch = 5;
        int v = 66;
        switch (ch) {
            case 4:
                v = 98;
                break;
            case 5:
                v = 85;
                break;
            case 6:
                v = 108;
                break;
            default:
                v = 90;
        }
        System.out.println("v=" + v);
    }

    void t10() {
        int ch = 1000;
        int v = 66;
        switch (ch) {
            case 1:
                v = 98;
                break;
            case 100:
                v = 85;
                break;
            case 1000:
                v = 108;
                break;
            default:
                v = 90;
        }
        System.out.println("v=" + v);
    }


    void t11() {
        int[][][] a3 = new int[2][2][];
        a3[1][1] = new int[3];
        a3[1][1][2] = 9;
        System.out.println("arr print:" + a3[1][1][2]);
    }


    void t12() {
        final Object lock = new Object();
        Thread t = new Thread(() -> {
            System.out.println("Second Thread start.");
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println("count= " + i);
                    Thread.sleep(100);
                    if (i == 5) {
                        synchronized (lock) {
                            lock.notify();
                            System.out.println("second notify.");
                        }
                    }
                }
            } catch (Exception e) {
            }
            System.out.println("Second Thread over.");
        });
        t.start();
        try {
            synchronized (lock) {
                lock.wait();
                System.out.println("Main thread weakup.");
            }
        } catch (Exception e) {
        }
    }

    public void t13() {
        try {
            Class c = Class.forName("test.Foo2");
            Object o = c.newInstance();
            Method m = c.getMethod("t2");
            m.invoke(o);
            m = c.getMethod("getName", Object.class, int.class, byte.class, String.class, Object.class);
            if (m != null) {
                System.out.println("invoke " + m.invoke(o, this, 2, 4, "Here is ok", o));
            }
            System.out.println("forName and newInstance :" + o);

        } catch (Exception e) {
        }
    }

    public void t14() {
        try {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < 10; i++) list.add(i);
            System.out.println("List size:" + list.size() + " elementAt (4) =" + list.indexOf(4));

            Map<Integer, String> map = new HashMap<>();
            for (int i = 0; i < 10; i++) map.put(i, "value-" + i);
            System.out.println("Map size:" + map.size() + " key(4) =" + map.get(4));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        Foo1 obj = new Foo1();
        obj.t0();
        obj.t1();
        obj.t2();
        obj.t3();
        obj.t4();
        obj.t5();
        obj.t6();
        obj.t7();
        obj.t8();
        obj.t9();
        obj.t10();
        obj.t11();
        obj.t12();
        obj.t13();
        obj.t14();
    }
}