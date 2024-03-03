class A {
    int a[] = new int[2];
    
    void show()
     {
        a[0] = 10;
        a[1] = 20;
        for (int i = 0; i<a.length;i++) {
            System.out.println("Size of array: " +a.length+ ", element of array: " +a[i]);
        }
    }
    public static void main (String args[]) {
        A z = new A();
        z.show();
    }
}
