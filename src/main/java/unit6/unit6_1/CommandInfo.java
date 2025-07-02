package unit6.unit6_1;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface CommandInfo {
    String name();
    String description();
}

