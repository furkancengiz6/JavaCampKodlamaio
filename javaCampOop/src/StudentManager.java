public class StudentManager extends UserManager{

    public void add(Student student) {
        System.out.println(student.getFirstName()+"\tiçin\t"+student.getChooseClass()+"\tSınıfı eklendi");
    }


    public void delete(Student student) {
        System.out.println(student.getFirstName()+"\tiçin"+student.getChooseClass()+"\tSınıf silindi");
    }
}
