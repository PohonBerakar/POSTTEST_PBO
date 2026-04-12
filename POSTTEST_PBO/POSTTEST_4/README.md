#laporan Posttes-4
Muhammad Husein Permadi
2409106051
B1-24
Praktikum PBO
# pt1
## Deskripsi program
    Program ini adalah program crud untuk database karakter 7dsg dimana kita bisa melihat , menambah , mengedit, dan menghapus karakter.
    Program ini menggunakan 2 class yang dimana terdapat class main dan juga class karakter

## Main
![main](gambar/main.png)
ini adalah program dari menu utama yang menggunakan if else untuk memilih menu.

## Lihat data
![lihat](gambar/lihat.png)
ini adalah program dari menu lihat yang menggunakan perulangan untuk menampilkan seluruh datanya

## tambah data
![tambah](gambar/tambah.png)
ini adalah program dari menu tambah dimana saat kiita selesai menginput data maka program akan menambahkan data yang kita input ke databasenya

## ubah data
![edit](gambar/edit1.png)
![edit2](gambar/edit2.png)
ini adalah program dari menu ubah yang digunakan untuk mengubah data dari data yang telah ditambahkan

## hapus data
![lihat](gambar/hapus.png)
ini adalah program dari menu hapus untuk menghapus data yang sudah ada.


# pt2
## private class modifire
![private](gambar/p1.png)
private adalah class modifier paling ketat dimana dia hanya bisa di akses oleh class uang sama

## default class modifier
![default](gambar/def.png)
default adalah access modifier dimana penguna tidak mencantumkan accessmodifier apapun , access modifier ini hanya bisa di akses di class dan package yang sama

## Public class modifier
![public](gambar/publ.png)
public adalah access modifier paling bebas karena dapat di akses dimanapun getter dan setter menggunakan class ini agar dapat diakses di package lain.

## proctected class modifier
![protect](gambar/pro.png)
protected adalah access yang hanya melarang penggunaan di package yang berbeda

## getter & setter
![gettersetter](gambar/getset.png)
getter digunakan untuk mengambil data, pada program ini digunakan untuk melihat data, sehingga program pada lihat data berubah menjadi 
![geter](gambar/lget.png)

setter digunakan untuk mengubah data sehingga pada program ini kodenya berubah menjadi seperti ini
![seter](gambar/setambil.png)
dan di program utamanya digunakan pada menu edit
![setere](gambar/setedit.png)


# pt3
## penambahan child DPS
![DPS child](gambar/dps.png)
inheritance berarti memiliki turunan maksudnya child akan mewarisi atribut dari parent nya, misalnya seperti dps, disini dps mewarisi atribut dari karakter

## penambahan chhild Tanker
![Tanker child](gambar/tank.png)
saat 1 parent memiliki lebih dari 1 child maka disebut hierarchical inheritance 

## penambahan child Healer
![Tanker child](gambar/hl.png)

## penambahan chhild Support
![Tanker child](gambar/sp.png)

## menampilkan role di fitur lihat
![Lihat role](gambar/lihatrole.png)
pada program di atas akan menampilkan role saat pengguna melihat data karakter tergantung jenis role apa yang dipilih pengguna saaat menambahkan data, role akan di tampilkan setelah nama.

## pilih role saat menambah data
![Pilih role](gambar/pilihrole.png)
pada program di atas setelah pengguna memilih untuk menambahkan data maka pengguna akan memilih lagi untuk role yang ingin ditambahkan

## menambah data ke role yang dipilih
![Data pilih role](gambar/tambahrole.png)
setelah memilih role dan mengisi data karakteer maka prorgram akan menambahkan data berdasarkan role yang dipilih.


# pt4 Polymorphism
## overriding
![TumbalOverride](gambar/tumbalover.png)
ini adalah info role default yang nantinya akan di timpa oleh teks sesuai dengan role dari karakter
![Override](gambar/oride.png)
tambahkan override di semua child agar nantinya inforole dari setiap role akan menimpa dari teks info role default
![penggunaanoverride](gambar/lihatafter.png)
disini untuk inforole sudah tidak perlu if else lagi , cukup kode singkat saja karena sudah polimorfism override

## overload
![Overload](gambar/ol1.png)
bisa kita lihat disini ada method baru namun sama seperti yang di atasnya hanya berbeda parameter
![Menu baru](gambar/menubaru.png)
disini ada penambahan menu baru agar fungsi overload yang telah dibuat tadi jadi berguna, jadinya ditambahkan menu untuk hanya mengubah nama dari suatu karakter.
