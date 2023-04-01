package mivlgy.pin120;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        Musician musician = context.getBean("musician", Musician.class);
        System.out.println(musician.getName());

        context.close();
    }
}
