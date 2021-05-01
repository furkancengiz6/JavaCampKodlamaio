public class Main {

    public static void main(String[] args) {
        User user = new User(1,"Furkan","Cengiz","furkan@example.com","123456");
        UserManager userManager= new UserManager();
        userManager.add(user);

       Student student = new Student(2,"knsakd","asdasd","asfasf@sdadsa.com","963456","Java");
       StudentManager studentManager = new StudentManager();
       studentManager.add(student);
       Instructor instructor= new Instructor(3,"kadir","cengiz","email@hotmail.com","19972002","engin demiroğ");
       InstructorManager instructorManager = new InstructorManager();
       instructorManager.add(instructor);
    }
}
