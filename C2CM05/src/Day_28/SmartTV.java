package Day_28;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface SmartTV {
	
	String os() default "Android";
	int version() default 1;
	
	

}
