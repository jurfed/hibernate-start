import config.MyConfig;
import config.MyConfig4;
import entities.Cat;
import entities.Dog;
import entities.Parrot;
import entities2.Cat2;
import entities2.Dog2;
import entities2.Parrot2;
import entities3.WeekDay;
import entities4.entities.Cat4;
import entities4.entities.Dog4;
import entities4.entities.Parrot4;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("entities");

        // initializing by annotation (entities) @Component
        Cat cat = context.getBean(Cat.class);
        Dog dog = (Dog) context.getBean("dog");
        Parrot parrot = context.getBean("parrot-kesha", Parrot.class);

        System.out.println(cat.getName());
        System.out.println(dog.getName());
        System.out.println(parrot.getName());

//initializing by creating MyCinfig and @Bean annotation (entities2, entities3)
        ApplicationContext context2 = new AnnotationConfigApplicationContext(MyConfig.class);

        Cat2 cat2 = context2.getBean(Cat2.class);
        Dog2 dog2 = (Dog2) context2.getBean("dog2");
        Parrot2 parrot2 = context2.getBean("parrot-kesha", Parrot2.class);

        System.out.println(cat2.getName());
        System.out.println(dog2.getName());
        System.out.println(parrot2.getName());

        WeekDay weekDay = context2.getBean(WeekDay.class);
        System.out.println(weekDay.getWeekDayName());

 //combinate annotation with @Component and config (entitites4 and MyConfig4)
        ApplicationContext context4 = new AnnotationConfigApplicationContext(MyConfig4.class);
        Cat4 cat4 = context4.getBean(Cat4.class);
        Dog4 dog4 = (Dog4) context4.getBean("dog4");
        Parrot4 parrot4 = context4.getBean("parrot-kesha4", Parrot4.class);

        System.out.println(cat4.getName());
        System.out.println(dog4.getName());
        System.out.println(parrot4.getName());

        WeekDay weekDay2 = context4.getBean(WeekDay.class);
        System.out.println(weekDay2.getWeekDayName());
    }
}
