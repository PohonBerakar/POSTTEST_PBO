public class Karakter {
    private String nama;
    private String atribut;
    private Integer atk;
    private Integer hp;
    private Integer def;

    Karakter(String nama,String atribut, Integer atk,Integer hp, Integer def){
        this.nama=nama;
        this.atribut=atribut;
        this.atk=atk;
        this.hp=hp;
        this.def=def;
    }

    public String getNama(){
        return nama;
    }
    public String getAtribut(){
        return atribut;
    }
    public Integer getAtk(){
        return atk;
    }
    public Integer getHp(){
        return hp;
    }
    public Integer getDef(){
        return def;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
    public void setAtribut(String atribut){
        this.atribut = atribut;
    }
    public void setAtk(Integer atk){
        this.atk = atk;
    }
    public void setHp(Integer hp){
        this.hp = hp;
    }
    public void setDef(Integer def){
        this.def = def;
    }

    protected void ambildata(String nama,String atribut, Integer atk,Integer hp, Integer def){
        setNama(nama);
        setAtribut(atribut);
        setAtk(atk);
        setHp(hp);
        setDef(def);
    }
}