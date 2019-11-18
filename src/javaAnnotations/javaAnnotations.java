package javaAnnotations;

public class javaAnnotations {
    /**
     to provide information for the compiler;
     to provide information for development tools to generate code, XML files and so forth;
     to provide information for frameworks and libraries at runtime.
     */
    /**
     @Deprecated indicates that the marked element (class, method, field and so on) is deprecated and should no longer be used. This annotation causes a compile warning if the element is used.
     @SuppressWarnings instructs the compiler to disable the compile-time warnings specified in the annotation parameters. This annotation can be applied to classes, methods, fields, local variables and other elements.
     @Override marks a method that overrides a superclass method. This annotation causes a compile error if the method is not found in one of the parent classes or implemented interfaces. This annotation can only be applied to methods.
     */
    public static void main(String[] args) {

    }

    @Deprecated
    public static void method() {
        System.out.println("an old method");
    }

    @SuppressWarnings(value = "unused")   //Annotation elements "unused" and "deprecation"
    public static void method2() {
        int a = 0;
    }

    @SuppressWarnings({"unused", "deprecation"})
    public static void method3() { }

    //All correct ways to mark annotation:
   // @SuppressWarnings("deprecation")
   // @SuppressWarnings(value = {"deprecation"})
   // @SuppressWarnings(value = "deprecation")
   // @SuppressWarnings({"deprecation", "unused"})
/*
    @NotNull
    private String login;

    @Range(min = 1, max = 100)
    private int level = 1;

 */
}

@Deprecated
class MyClass {
    // fields and methods
}

