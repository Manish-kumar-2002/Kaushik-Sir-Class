class Test {
    int a, b;
    static int c = 6, d;

    Test() {
        c++;
        a = 5;
        b = 20;
        System.out.println("This is Constructor");
    }

    static {
        d = c + 7;
        System.out.println("This is Static Method");
    }

    static void show() {
        System.out.println(c + " " + d);
        System.out.println("This is Static Method");
    }

    void display() {
        System.out.println(a + " " + b + " " + c + " " + d);
    }
}

class Static1 {
    public static void main(String[] args) {
        System.out.println("This is main Method");
        Test ob = new Test();
        Test.show();
        Test.d = 19;
        ob.display();
    }
}