public class Tanker extends Karakter implements interf{

    public Tanker(String nama, String atribut, Integer atk, Integer hp, Integer def) {
        super(nama, atribut, atk, hp, def);
    }

    @Override
    public void infoRole(){
        System.out.println("Role     = Tanker");
    }

    @Override
    public void sprole(){
        System.out.println("Tanker memiliki defensif yang sanagat tinggi");
    }

    @Override
    public void rolebonus(){
        System.out.println("Saat menerima damage, akan meningkatkan def diri sendiri");
    }
}