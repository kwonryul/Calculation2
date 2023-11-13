interface Interface {
    void hello();
}

interface InterfacePrint {
    void print();
}

class ImplSuper implements Interface {
    public int s;

    public ImplSuper(int s) {
        this.s = s;
    }
    public void hello() {
        System.out.println("hello " + s);
    }

    public void override(int x) {
        s = x;
        System.out.println("override super " + s);
    }
}

class Impl extends ImplSuper implements InterfacePrint {
    public int y;
    public Impl(int s, int y) {
        super(s);
        this.y = y;
    }

    public void override(int x) {
        y = x;
        System.out.println("override " + y);
    }

    public void print() {
        System.out.println("impl_print " + s + "\t" + y);
    }
}

class Impl2 implements Interface {
    public void hello() {
        System.out.println("22222");
    }
}







public class Oop {
    private static void overrideExecutor(ImplSuper is) {
        int x = is.s + 1;
        is.override(x);
    }

    private static void interfaceExecutor(Interface i) {
        i.hello();
    }

    public static void main(String[] args) {
        ImplSuper is = new ImplSuper(100);
        Impl i = new Impl(40, 5);
        Impl2 i2 = new Impl2();
        i.print();
        overrideExecutor(is);
        overrideExecutor(i);
        interfaceExecutor(is);
        interfaceExecutor(i);
        interfaceExecutor(i2);
        i.print();
    }
}

