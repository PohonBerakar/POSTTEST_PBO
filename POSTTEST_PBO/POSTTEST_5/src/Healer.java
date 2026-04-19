public class Healer extends Karakter implements interf {

    public Healer(String nama, String atribut, Integer atk, Integer hp, Integer def) {
        super(nama, atribut, atk, hp, def);
    }

    @Override
    public void infoRole(){
        System.out.println("Role     = Healer ");
    }

    @Override
    public void sprole(){
        System.out.println("Helar dapat memulihkan HP milik rekan tim");
    }

    @Override
    public void rolebonus(){
        System.out.println("Saat memberikan pemulihan kepada rekan tim, mengurangi damage diterima mereka");
    }
}