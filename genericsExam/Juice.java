package genericsExam;

public class Juice {
    String name;

    //생성자
    Juice(String name) {
        this.name = name + "Juice";
    }

    public String toString() {
        return name;
    }
}
