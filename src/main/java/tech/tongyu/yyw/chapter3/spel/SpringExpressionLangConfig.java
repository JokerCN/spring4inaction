package tech.tongyu.yyw.chapter3.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import tech.tongyu.yyw.chapter3.spel.impl.StandardCircle;
import tech.tongyu.yyw.chapter3.spel.intel.Circle;

import java.util.Date;
import java.util.GregorianCalendar;

@Configuration
@ComponentScan("tech.tongyu.yyw.chapter2.impl")
public class SpringExpressionLangConfig {

    @Value("#{sgtPeppers.artist}")
    private String artist;

    /*@Value(("#{sgtPeppers.play()}"))
    private String play;*/

    @Value("#{T(java.lang.Math).PI}")
    private double pi;

    @Value("#{T(java.lang.Math).random()}")
    private double random;

    @Bean
    public Circle circle(){
        return new StandardCircle();
    }

    @Value("#{T(java.lang.Math).PI * circle.radius * 2}")
    private double length;

    @Value("#{1 > 0 ? 'winner' : 'loser'}")
    private String answer;

    @Value("#{ 100 eq 100 }")
    private boolean trueEnd;

    public String getAnswer() {
        return answer;
    }

    public boolean isTrueEnd() {
        return trueEnd;
    }

    public double getLength() {
        return length;
    }

    public double getRandom() {
        return random;
    }

    public double getPi() {
        return pi;
    }

    public String getArtist() {
        return artist;
    }

    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        Expression exp = parser.parseExpression("'Hello world'"); // => ParseException
        String message = (String) exp.getValue(); // => EvaluationException
        System.out.println(message);

        exp = parser.parseExpression("'Hello world'.concat('!')");
        message = (String) exp.getValue();
        System.out.println(message);

        exp = parser.parseExpression("'Hello world'.toUpperCase()");
        message = (String) exp.getValue();
        System.out.println(message);

        GregorianCalendar calendar = new GregorianCalendar();
        calendar.set(1856, 7, 9);

        Inventor tesla = new Inventor("Nikola Tesla", calendar.getTime(), "Serbian");
        exp = parser.parseExpression("name");

        EvaluationContext context = new StandardEvaluationContext(tesla);
        String name = (String) exp.getValue(context);
        System.out.println(name);
    }

}

class Inventor{
    private String name;
    private Date birthday;
    private String nationality;

    public Inventor(String name, Date birthday, String nationality){
        this.name = name;
        this.birthday = birthday;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getNationality() {
        return nationality;
    }
}
