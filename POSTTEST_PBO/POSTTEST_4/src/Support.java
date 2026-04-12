public class Support extends Karakter {

    public Support(String nama, String atribut, Integer atk, Integer hp, Integer def) {
        super(nama, atribut, atk, hp, def);
    }

    @Override
    public void infoRole(){
        System.out.println("Role     = Support ");
    }
}