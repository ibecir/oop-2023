package year2023.week10.labs.task2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class Start {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        List<Integer> grades = Arrays.asList(90, 85, 95, 88, 92);
        GradeAnalyzer gradeAnalyzer = new GradeAnalyzer(grades);
        Class<?> gradeAnalyzerClass = gradeAnalyzer.getClass();

        Field[] fields = gradeAnalyzerClass.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            System.out.println("Field name: " + field.getName() + ", Value: " + field.get(gradeAnalyzer));
        }

        Method[] methods = gradeAnalyzerClass.getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().startsWith("calculate") || method.getName().startsWith("print")) {
                System.out.println("Method name: " + method.getName() + ", Result: " + method.invoke(gradeAnalyzer));
            }
        }
    }
}
