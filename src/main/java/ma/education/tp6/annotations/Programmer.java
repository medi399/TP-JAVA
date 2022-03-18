package ma.education.tp6.annotations;
import java.lang.annotation.*;


@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Programmer {
    String name();
    int id();
}
