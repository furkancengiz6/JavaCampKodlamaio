public class Instructor extends User {
    private String teacherChoose;

    public Instructor(int id, String firstName,String lastName,String email,String password,String teacherChoose){
        super(id,firstName,lastName,email,password);
        this.setTeacherChoose(teacherChoose);
    }

    public String getTeacherChoose() {
        return teacherChoose;
    }

    public void setTeacherChoose(String teacherChoose) {
        this.teacherChoose = teacherChoose;
    }
}
