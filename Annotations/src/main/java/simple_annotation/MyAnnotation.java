package simple_annotation;

public @interface MyAnnotation {

    //fields are public abstract by default
    //can define String( not via new String), primitive types, enums
    //cannot use reference types as fields (new Object(), new String("Hello"), Integer, etc.)
    //field with the name value can be passed as a parameter without name if passed alone

    String str() default "Hello";
    int number() default 10;

    enum MyEnum {
        BLACK, WHITE, GREEN, ORANGE
    }
}
