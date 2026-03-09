import java.util.*;

public class Main{
    static ArrayList<Karakter> daftar = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    static void jeda() {
        System.out.println(" ");
        System.out.println("Tekan Enter untuk melanjutkan !");
        input.nextLine();
    }
    static void lihat(){
        if (daftar.isEmpty()){
            System.out.println("Data Masih kosong");
            jeda();
        }
        else {
            int i=1;
            for(Karakter karakter:daftar){
                System.out.println("No. "+i);
                System.out.println("Nama     = " + karakter.nama);
                System.out.println("Atribut  = " + karakter.atribut);
                System.out.println("Atk      = " + karakter.atk);
                System.out.println("HP       = " + karakter.hp);
                System.out.println("Def      = " + karakter.def);
                System.out.println(" ");
                i++;
            }
            jeda();
        }
    }
    static void tambah(){
        String nama, atribute;
        Integer atk,hp,def;
        System.out.println("Masukkan Nama Karakter    : ");
        nama= input.nextLine();
        System.out.println("Masukkan Atribut Karakter : ");
        atribute= input.nextLine();
        System.out.println("Masukkan Atk Karakter     : ");
        atk= input.nextInt();
        input.nextLine();
        System.out.println("Masukkan HP Karakter      : ");
        hp= input.nextInt();
        input.nextLine();
        System.out.println("Masukkan Def Karakter     : ");
        def= input.nextInt();
        input.nextLine();
        Karakter Karakter = new Karakter(nama,atribute,atk,hp,def);
        daftar.add(Karakter);
        System.out.println("Data berhasil ditambahkan !");
        jeda();
    }
    static void edit(){
        if (daftar.isEmpty()){
            System.out.println("Data Masih kosong");
            jeda();
        }
        else {
            String nama, atribute;
            Integer atk, hp, def;
            int i = 1;
            for (Karakter karakter : daftar) {
                System.out.println(i + ". " + karakter.nama);
                i++;
            }
            System.out.println(" ");
            System.out.println("Masukkan nomor karakter yang ingin di edit : ");
            int pilih = input.nextInt() - 1;
            input.nextLine();
            if (pilih < 0 || pilih >= daftar.size()) {
                System.out.println("Nomor tidak valid!");
                jeda();
            }
            else {
//tanda 1
                System.out.println("Masukkan nama baru : ");
                nama = input.nextLine();
                System.out.println("Masukkan atribut baru : ");
                atribute = input.nextLine();
                System.out.println("Masukkan atk baru : ");
                atk = input.nextInt();
                input.nextLine();
                System.out.println("Masukkan hp baru : ");
                hp = input.nextInt();
                input.nextLine();
                System.out.println("Masukkan def baru : ");
                def = input.nextInt();
                input.nextLine();

                daftar.get(pilih).ambildata(nama, atribute, atk, hp, def);
                System.out.println("Data berhasil diubah");
                jeda();
            }
        }
    }
    static void hapus(){
        if (daftar.isEmpty()){
            System.out.println("Data Masih kosong");
            jeda();
        }
        else {
            int i = 1;
            for (Karakter karakter : daftar) {
                System.out.println(i + ". " + karakter.nama);
                i++;
            }
            System.out.println(" ");
            System.out.println("Masukkan nomor karakter yang ingin di Hapus : ");
            int pilih = input.nextInt() - 1;
            input.nextLine();
            if (pilih < 0 || pilih >= daftar.size()) {
                System.out.println("Nomor tidak valid!");
                jeda();
            }
            else {
                daftar.remove(pilih);
                System.out.println("Data berhasil dihapus !");
                jeda();
            }
        }
    }

     public static void main(String[] args) {
        int pilihan = 0;
        while (pilihan !=5){
            System.out.println("Database Karakter 7DS Grand Cross");
            System.out.println("1. Lihat Karakter");
            System.out.println("2. Tambah Karakter");
            System.out.println("3. Edit Karakter");
            System.out.println("4. Hapus Karakter");
            System.out.println("5. Keluar Program");
            System.out.print("Masukkan Pilihan : ");
            pilihan = input.nextInt();
            input.nextLine();
            if (pilihan == 1) {
                lihat();
            }
            else if(pilihan==2){
                tambah();
            }
            else if(pilihan==3){
                edit();
            }
            else if(pilihan==4){
                hapus();
            }
            else if(pilihan==5){
                System.out.println("Berhasil Keluar");
            }
            else{
                System.out.println("Masukkan Pilihan yang valid !!!");
                jeda();
            }
        }
    }
}