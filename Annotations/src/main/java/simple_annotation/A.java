package simple_annotation;


public class A {
    @RepeatableAnnotation()
    @RepeatableAnnotation(str = "World", number = 3)
    public void print(String str, int number) {
        System.out.println(str + number);
    }
}

