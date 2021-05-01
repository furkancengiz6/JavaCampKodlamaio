public class Student extends User{
    private String chooseClass ;
    public Student(){

    }
    public Student(int id, String firstName,String lastName,String email,String password,String chooseClass){
        super(id,firstName,lastName,email,password);
        this.setChooseClass(chooseClass);
    }

    public String getChooseClass() {
        return chooseClass;
    }

    public void setChooseClass(String chooseClass) {
        this.chooseClass = chooseClass;
    }
}
