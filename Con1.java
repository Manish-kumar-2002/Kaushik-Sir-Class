class Box {
    int l, b, h;

    // void putData() {
    // l = b = h = 0;
    // }

    void putData(int x, int y, int z) {
        l = x;
        b = y;
        h = z;
    }

    void display() {
        System.out.println(l + " " + b + " " + h);
    }
}

class Con1 {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box();
        // b1.putData();
        // b2.putData(7, 2, 1);
        b1.display();
        b2.display();
    }
}