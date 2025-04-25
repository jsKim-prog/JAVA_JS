package annotationExam;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) //실행시 사용가능
public @interface DateTime {
    String yymmdd();
    String hhmmss();
}
