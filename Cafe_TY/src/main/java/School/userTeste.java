package School;

public class userTeste {

    public static void main(String[] args) {
        User user = new User();

        user.setEmail("Pepito@gmail.com");
        user.setName("Pedro");
        user.setId(3020);

        System.out.println(user.getId()+"  "+ user.getName()+"  "+ user.getEmail());


        //Student studiante = new Student();

       // studiante.id = 1;
    }
}
