package year2023.week10.lectures.customannotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

@Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface OOPStudent {
    String name() default "aga";
}

@OOPStudent(name = "beg")
class MyMainAnnotations {
    @OOPStudent(name = "Begler beg Becuir Pasa Ishakovic")
    private static int name;
    @OOPStudent
    private String saySomething(){
        return "Becir aga";
    }
    public static void main(String[] args) {
        MyMainAnnotations instance = new MyMainAnnotations();
        for (Field field : instance.getClass().getDeclaredFields()){
            if(field.isAnnotationPresent(OOPStudent.class)){
                OOPStudent annotation = field.getAnnotation(OOPStudent.class);
                System.out.println(annotation.name());
            }
        }
    }
}
