package com.ugo.spring_test.registrationmgt;
import com.springinaction.springidol.PerformanceException;
import com.springinaction.springidol.Performer;
import com.springinaction.springidol.Stage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )throws PerformanceException
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol.xml");
        Performer performer = (Performer)ctx.getBean("duke");
        performer.perform();
        
        
    }
}
