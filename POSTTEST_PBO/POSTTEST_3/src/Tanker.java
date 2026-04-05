public class Tanker extends Karakter {

    public Tanker(String nama, String atribut, Integer atk, Integer hp, Integer def) {
        super(nama, atribut, atk, hp, def);
    }

    public void infoRole(){
        System.out.println("Role     = Tanker ");
    }
}