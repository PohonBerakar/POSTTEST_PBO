public class Support extends Karakter implements interf {

    public Support(String nama, String atribut, Integer atk, Integer hp, Integer def) {
        super(nama, atribut, atk, hp, def);
    }

    @Override
    public void infoRole(){
        System.out.println("Role     = Support ");
    }

    @Override
    public void sprole(){
        System.out.println("Support dapat meningkatkan stat milik rekan tim");
    }

    @Override
    public void rolebonus(){
        System.out.println("Saat memberikan buff terhadap rekan tim, meningkatkan damage diberikan mereka");
    }
}