package annotationExam;

import java.lang.annotation.Annotation;
@Deprecated
@SuppressWarnings("1111") //유효하지 않은 애너테이션은 무시
@TestInfo(testedBy = "aaa", testDate = @DateTime(yymmdd = "250425", hhmmss = "235959"))
public class AnnotationEx5 {
    public static void main(String[] args) {
        //AnnotationEx5의 클래스 객체를 얻는다.
        Class<AnnotationEx5> cls = AnnotationEx5.class;

        TestInfo anno = (TestInfo) cls.getAnnotation(TestInfo.class);
        System.out.println("anno.testedBy()="+anno.testedBy());
        System.out.println("anno.testDate().yymmdd()="+anno.testDate().yymmdd());
        System.out.println("anno.testDate().hhmmdd()="+anno.testDate().hhmmss());

        for(String str:anno.testTools()){
            System.out.println("testTools="+str);
        }
        System.out.println();
        //AnnotationEx5에 적용된 모든 애너테이션을 가져온다.
        Annotation[] annoArr = cls.getAnnotations();
        for (Annotation a: annoArr) System.out.println(a);
    }
}
/*
anno.testedBy()=aaa
anno.testDate().yymmdd()=250425
anno.testDate().hhmmdd()=235959
testTools=JUnit

@java.lang.Deprecated(forRemoval=false, since="")
@annotationExam.TestInfo(count=1, testType=FIRST, testTools={"JUnit"}, testedBy="aaa", testDate=@annotationExam.DateTime(yymmdd="250425", hhmmss="235959"))
 */