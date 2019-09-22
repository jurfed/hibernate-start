package config;

import entities2.Cat2;
import entities2.Dog2;
import entities2.Parrot2;
import entities3.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Configuration
public class MyConfig4 {

    @Bean(name = "cat2")
    public Cat2 getCat2(Parrot2 parrot2){
        Cat2 cat2 = new Cat2();
        cat2.setName(parrot2.getName() + "-killer");
        return cat2;
    }

    @Bean(name = "dog2")
    public Dog2 getDog2(){
        return new Dog2();
    }

    @Bean(name = "parrot-kesha")
    public Parrot2 getParrot2(){
        return new Parrot2();
    }

    @Bean
    public WeekDay getDay() {
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        switch (dayOfWeek) {
            case MONDAY: return new Monday();
            case TUESDAY: return new Tuesday();
            case WEDNESDAY: return new Wednesday();
            case THURSDAY: return new Thursday();
            case FRIDAY: return new Friday();
            case SATURDAY: return new Saturday();
            default: return new Sunday();
        }
    }

}
