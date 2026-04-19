public class DPS extends Karakter implements interf{

    public DPS(String nama, String atribut, Integer atk, Integer hp, Integer def) {
        super(nama, atribut, atk, hp, def);
    }

    @Override
    public void infoRole(){
        System.out.println("Role     = DPS");
    }

    @Override
    public void sprole(){
        System.out.println("DPS dapat menyebabkan damage yang saat tinggi kepada musuh");
    }

    @Override
    public void rolebonus(){
        System.out.println("saat mmeberikan damage kepada musuh, meningkatkan damage diberikan diri sendiri");
    }
}