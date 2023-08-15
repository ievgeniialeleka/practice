package simple_annotation;

public class B extends A {

   public void print() {
       System.out.println("B");
   }

    public static void main(String[] args) {
        A a = new B();

    }
}
