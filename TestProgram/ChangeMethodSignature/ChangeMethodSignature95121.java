
@Retention(RetentionPolicy.RUNTIME)
public @interface IsTest {
	String setUp() default "";
	String tearDown() default "";
}
