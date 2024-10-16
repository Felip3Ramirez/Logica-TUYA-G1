package SuperClases_SubClases;

public class Admin extends User {
    private String rol;

    public Admin (int id, String name,String email, String rol){
        super(id, name, email);
        this.rol = rol;
    }
    public String getSpeciality() {
        return rol;
    }
}
