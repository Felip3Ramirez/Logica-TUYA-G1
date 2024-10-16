package SuperClases_SubClases;

public class Student extends User {
    private String type;

    public Student (int id, String name,String email, String type){
        super(id, name, email);
        this.type = type;
    }
    public String getType() {
        return type;
    }
}