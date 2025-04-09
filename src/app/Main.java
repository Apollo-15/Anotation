package app;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class<ArrayUtils> object = ArrayUtils.class;
        for (Method method : object.getDeclaredMethods()) {
            if (method.isAnnotationPresent(MethodInfo.class)) {
                MethodInfo methodInfo = method.getAnnotation(MethodInfo.class);
                System.out.println("Method: " + methodInfo.methodName());
                System.out.println("Method type: " + methodInfo.returnType());
                System.out.println("Description: " + methodInfo.description());
            }
            if (method.isAnnotationPresent(Author.class)) {
                Author author = method.getAnnotation(Author.class);
                System.out.println("Author's first name: " + author.firstName());
                System.out.println("Author's last name: " + author.lastName());
            }
        }
    }
}
