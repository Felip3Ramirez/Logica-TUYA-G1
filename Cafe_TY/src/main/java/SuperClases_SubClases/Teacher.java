package SuperClases_SubClases;

public class Teacher extends User {
    private String speciality;

    public Teacher (int id, String name,String email, String speciality){
        super(id, name, email);
        this.speciality = speciality;
    }
    public String getSpeciality() {
        return speciality;
    }
}
