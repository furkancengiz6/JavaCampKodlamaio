public class UserManager {
    public void add(User user){
        System.out.println(user.getFirstName()+"\t"+user.getLastName()+"\t"+"Eklenmiştir.");
    }

    public void update(User user){
        System.out.println(user.getFirstName()+""+user.getLastName()+""+"Güncellenmiştir.");
    }

    public void delete(User user){
        System.out.println(user.getFirstName()+""+user.getLastName()+""+"Silinmiştir.");

    }




}
