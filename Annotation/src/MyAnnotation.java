import java.lang.annotation.Inherited;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * @author ZhouWu
 * @create 2019-08-03-9:07
 */

@Inherited
@Target({TYPE, FIELD, METHOD,PARAMETER,CONSTRUCTOR,LOCAL_VARIABLE})
@Repeatable(MyAnnotations.class)
public @interface MyAnnotation {

    String value() default "hello";

}
