package com.ugo.spring_test.registrationmgt;
import com.springinaction.springidol.PerformanceException;
import com.springinaction.springidol.Performer;
import com.springinaction.springidol.Stage;
import com.ugo.autowiring.byname.FootBallTeam;
import com.ugo.autowiring.byname.FootBaller;
import com.ugo.autowiring.javaconfig.Person;
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
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol.xml","com/ugo/autowiring/byname/auto-wire.xml.xml");
        Performer performer = (Performer)ctx.getBean("duke");
        Performer performer1 = (Performer)ctx.getBean("duke2");
        performer.perform();
        
        System.out.println(performer == performer1);
        
        Stage stage = (Stage)ctx.getBean("stage");
        stage.stageName();
        
        /*Testing autowire by name*/
        FootBallTeam footBallTeam = (FootBallTeam)ctx.getBean("footBallTeam");
        FootBaller baller = (FootBaller)ctx.getBean("footBaller");
        footBallTeam.setFootBaller(baller);
        baller.setAge(22);
        baller.setName("Theo");
        
        FootBallTeam footBallTeam1 = (FootBallTeam)ctx.getBean("footBallTeam");
        System.out.println(footBallTeam.getFootBaller().getName());
        System.out.println(footBallTeam1.getFootBaller().getName());
        
        Person person = (Person)ctx.getBean("getPerson");
        
        person.getName("");
    }
}
