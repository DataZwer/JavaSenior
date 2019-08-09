import java.lang.annotation.Inherited;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;

/**
 * @author ZhouWu
 * @create 2019-08-03-9:38
 */

@Inherited
@Target({TYPE, FIELD, METHOD,PARAMETER,CONSTRUCTOR,LOCAL_VARIABLE})

public @interface MyAnnotations {
    MyAnnotation[] value();
}
