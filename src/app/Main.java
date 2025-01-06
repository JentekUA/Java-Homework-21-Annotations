package app;

import annotation.Author;
import annotation.MethodInfo;

public class Main {
    public static void main(String[] args) {
        Class<ArrayUtils> clazz = ArrayUtils.class;

        for (var method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(MethodInfo.class)) {
                var methodInfo = method.getAnnotation(MethodInfo.class);
                System.out.println("Method: " + methodInfo.name());
                System.out.println("Return Type: " + methodInfo.returnType());
                System.out.println("Description: " + methodInfo.description());
            }

            if (method.isAnnotationPresent(Author.class)) {
                var author = method.getAnnotation(Author.class);
                System.out.println("Author: " + author.firstName() + " " + author.lastName() + " " + author.email());
                System.out.println();
            }
        }
    }
}