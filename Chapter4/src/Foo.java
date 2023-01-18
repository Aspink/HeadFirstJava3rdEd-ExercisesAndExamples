public class Foo {
    public void go() {
        int x = 0;
        int z = x + 3;
        //Won't compile, because x is not initialized.
    }
}
