/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

/**
 *
 * @author Franz
 */

public class Perpustakaan {

    /**
     * @param args the command line arguments
     */
public static void main(String[]args){
String [] judul=new String[5];
int [] harga=new int[5];
int denda;
int [] total=new int[5];
int terlambatmengumpul;
int bayar=0;


        System.out.println("|=============================================|");
        System.out.println("|                 Perpustakaan                |");
        System.out.println("|           Universitas Tarumanegara          |");
        System.out.println("|=============================================|");
        System.out.println("|        Input data diri terlebih dahulu      |");
        System.out.println("|=============================================|");
        System.out.print(" NIM   : ");
        String nim=ProsesInput.VariabelString();
        System.out.print(" Nama  : ");
        String nama=ProsesInput.VariabelString();
        System.out.print(" No.HP : ");
        String nohp=ProsesInput.VariabelString();
        System.out.println("|=============================================|");
        System.out.println("");
        System.out.print(" Berapa buku yang ingin anda dipinjam? : ");
        String x=ProsesInput.VariabelString();
        int a=Integer.valueOf(x).intValue();
        System.out.println("");
        System.out.println("|=============================================|");
        System.out.println("|                 Perpustakaan                |");
        System.out.println("|           Universitas Tarumanegara          |");
        System.out.println("|=============================================|");
        System.out.println("|   Kategori Buku    | Topik Pembahasan       |");
        System.out.println("|1. Java             |    3 Buku              |");
        System.out.println("|2. C++              |    3 Buku              |");
        System.out.println("|3. PHP              |    3 Buku              |");
        System.out.println("|====================|========================|");
        System.out.println("");
        for (int i=1;i<=a;i++){
        System.out.print(" Silahkan Pilih Kategori Buku 1-3 : ");
        String pilihlah=ProsesInput.VariabelString();
        System.out.println("");
        int pilihan=Integer.valueOf(pilihlah).intValue();
        System.out.println("|=============================================|");
        switch(pilihan){
        
        case 1:{System.out.println("|   Kategori Buku Java :                      |");
        System.out.println("|1. Java Encapsulation                        |");
        System.out.println("|2. Java Inheritance                          |");
        System.out.println("|3. Java Polymorism                           |");
        System.out.println("|=============================================|");
        System.out.println("");
        System.out.print (" Silahkan Pilih Buku Java 1-3 : ");
        String bukujava=ProsesInput.VariabelString();
        System.out.println("");
        System.out.println("|=============================================|");
        int java=Integer.valueOf(bukujava).intValue();
        if (java==1){judul[i]=" Java Encapsulation";}else
        if(java==2){judul[i]=" Java Inheritance";}else
        {judul[i]=" Java Polymorism";}
        System.out.println(" Judul buku yang di pinjam : "+judul[i]);}
        System.out.println("|=============================================|");
        System.out.println("");
        break;

        case 2:{System.out.println("|   Kategori Buku C++ :                     |");
        System.out.println("|1. Operator Overloading                      |");
        System.out.println("|2. Typecasting dan RTTI                      |");
        System.out.println("|3. Preprocessor Directive                    |");
        System.out.println("|=============================================|");
        System.out.println("");
        System.out.print (" Silahkan Pilih Buku C++ 1-3 : ");
        String bukucplus=ProsesInput.VariabelString();
        System.out.println("");
        System.out.println("|=============================================|");
        int cplus=Integer.valueOf(bukucplus).intValue();
        System.out.println("");
        if (cplus==1){judul[i]="Operator Overloading";}else
        if(cplus==2){judul[i]="Typecasting dan RTTI";}else
        {judul[i]="Preprocessor Directive";}
        System.out.println(" Judul buku yang di pinjam : "+judul[i]);}
        System.out.println("|=============================================|");
        System.out.println("");
        break;
        
        case 3:{System.out.println("|   Kategori Buku PHP :                     |");
        System.out.println("|1. Struktur Dasar HTML                       |");
        System.out.println("|2. Perkenalan Bootstrap                      |");
        System.out.println("|3. Membuat Dokument PHP Pertama              |");
        System.out.println("|=============================================|");
        System.out.println("");
        System.out.print (" Silahkan Pilih Buku PHP 1-3 : ");
        String bukuphp=ProsesInput.VariabelString();
        System.out.println("");
        System.out.println("|=============================================|");
        int php=Integer.valueOf(bukuphp).intValue();
        if (php==1){judul[i]="Struktur Dasar HTML";}else
        if(php==2){judul[i]="Perkenalan Bootstrap";}else
        {judul[i]="Membuat Dokument PHP Pertama";}
        System.out.println(" Judul buku yang di pinjam : "+judul[i]);}
        System.out.println("|=============================================|");
        System.out.println("");
        break;
        default:
}


// Harga dari setiap ketegori buku
if (pilihan==1) {harga[i]=2000;}
else
if (pilihan==2) {harga[i]=3000;}
else
{harga[i]=4000;}}
// --------------------
System.out.print ("Lama Peminjaman (Hitungan Minggu)= ");
String waktuPinjam=ProsesInput.VariabelString();
int pinjam=Integer.valueOf(waktuPinjam).intValue();
System.out.print ("Lama Pengembalian (Hitungan Hari) = ");
String waktuKembali=ProsesInput.VariabelString();
int kembali=Integer.valueOf(waktuKembali).intValue();
System.out.println("");


// Denda yang dikenakan jika terlambat
terlambatmengumpul=kembali-(pinjam*7);
if (kembali<(pinjam*7)){denda=0;}
else
{denda=terlambatmengumpul*500;}

        System.out.println("|=============================================|");
        System.out.println("|                 Perpustakaan                |");
        System.out.println("|           Universitas Tarumanegara          |");
        System.out.println("|=============================================|");
        System.out.println(" 1. Nim                    : "+nim );
        System.out.println(" 2. Nama                   : "+nama);
        System.out.println(" 3. No. Hp                 : "+nohp );
        System.out.println(" 4. Buku yang di pinjam    : "+pinjam );
        System.out.println(" 5. Janji lama peminjaman  : (Hitungan Minggu) "+kembali );
        System.out.println(" 6. Lama buku dikembalikan : (Hitungan Hari) "+terlambatmengumpul );
        System.out.println("|=============================================|");
System.out.println("");

//Perhitungan Akhir
for (int i=1;i<=a;i++){
total[i]=(harga[i]*(pinjam));
bayar=bayar+total[i]+denda;}

        System.out.println("|=============================================|");
        System.out.println("|               Pengembalian Buku             |");
        System.out.println("|                 Perpustakaan                |");
        System.out.println("|           Universitas Tarumanegara          |");
        System.out.println("|=============================================|");
        System.out.println("|No| Judul Buku                | Total Bayar  |");
        for (int i=1;i<=a;++i){
        System.out.println("| "+i+"| "+judul[i]+"          | "+total[i]+" |");
}
        System.out.println("|=============================================|");
        System.out.println(" Jumlah Denda : "+denda);
        System.out.println(" Total Bayar : "+bayar);
        System.out.println("|=============================================|");}
}