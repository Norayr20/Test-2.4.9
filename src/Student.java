public class Student {
    public static void main(String[] args) {
        JavaStudent javaStudent = new JavaStudent();
        System.out.println(javaStudent.getInfo());
    }

    public static class JavaStudent extends Student {
        public JavaStudent() {
            super("Я очень занят. Прохожу курс по Java.");
        }

        public String getInfo() {
            return "Студент: " + this.getName() + ". " + this.getDescription();
        }
    }

    private String name;
    private String description;

    public Student(String description) {
        this.name = "JavaStudent";
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }
}