import config.MyConfig;
import entities.Cat;
import entities.Dog;
import entities.Parrot;
import entities2.Cat2;
import entities2.Dog2;
import entities2.Parrot2;
import entities3.WeekDay;
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

    }
}
