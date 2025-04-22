package collectionsExam;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesEx1 {
    public static void main(String[] args) {
        Properties prop = new Properties();
        
        //(key, value) 저장
        prop.setProperty("timeout", "30");
        prop.setProperty("language", "kr");
        prop.setProperty("size", "10");
        prop.setProperty("capacity", "10");
        
        //Enumeration으로 prop 저장 요소들 출력
        Enumeration e = prop.propertyNames();
        while (e.hasMoreElements()){
            String element = (String) e.nextElement();
            System.out.println(element+"="+prop.getProperty(element)); //key=value 출력
        }
        System.out.println();
        //값 변경
        prop.setProperty("size", "20");
        System.out.println("size="+prop.getProperty("size"));
        System.out.println("capacity="+prop.getProperty("capacity", "20"));
        System.out.println("loadfactor="+prop.getProperty("loadfactor", "0.75"));
        System.out.println(prop);
        prop.list(System.out); //prop에 저장된 요소들을 화면에 출력
        
    }
}
/*
capacity=10
size=10
timeout=30
language=kr

size=20
capacity=10
loadfactor=0.75
{size=20, language=kr, timeout=30, capacity=10}
-- listing properties --
size=20
language=kr
timeout=30
capacity=10

 */