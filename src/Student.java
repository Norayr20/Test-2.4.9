public class Student {
    public static void main(String[] args) {
        Student student = new Student();
        student.study();
    }
    protected final String studying;

    protected Student(String work) {
        this.studying = work;
    }

    public Student() {
        this.studying = "Прохожу тестовое задание.";
    }

    public void study() {
        System.out.println("Я очень занят. " + studying);
    }
}

class JavaStudent extends Student {
    public JavaStudent() {
        super("Я очень занят. Прохожу курс по Java.");
    }
}