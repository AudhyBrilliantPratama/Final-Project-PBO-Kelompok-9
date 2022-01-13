package fp.pbo;
import java.util.*;
import java.io.*;
import java.util.ArrayList;

public class PBO_C_KELOMPOK_9 {
Scanner scan=new Scanner(System.in).useDelimiter("\n");   // Membuat fungsi user input dengan nama scan
    
    
    int menu,pilihan; // Menu digunakan untuk fungsi switch case
    private Object idMakanan;
    PBO_C_KELOMPOK_9(){
        
// ADD DATA ADMIN 
        
        ArrayList <String> useradmin = new ArrayList<>(); // Database username admin
        String username1 = new String ("Budianto"); 
        String username2 = new String ("Alvin");
        String username3 = new String ("Audhy");
        useradmin.add(username1);
        useradmin.add(username2);
        
        ArrayList <String> userpassword = new ArrayList<>(); // Database password admin
        String password1= new String("057");
        String password2 = new String("131");
        String password3 = new String("123");
        userpassword.add(password1);
        userpassword.add(password2);
        
// ARRAYLIST MENU MAKANAN
        
        ArrayList<detailmakanan> strukMakanan = new ArrayList<>(); // Database makanan
        ArrayList<detailminuman> strukMinuman = new ArrayList<>(); // Database minuman
        
        
// DEFINE ARRAYLIST MEMBER
        
        ArrayList <String>namaMember = new ArrayList<>(); // Database nama member
        ArrayList <String>alamatMember = new ArrayList<>(); // Database alamat member
        ArrayList <String>noMember = new ArrayList<>(); // Database nomor member
        ArrayList <String>ktpMember = new ArrayList<>(); // Database KTP member
        
                
           
// ADD DATA MEMBER     

                // Nama
                String Danang = new String("Danang");
                namaMember.add(Danang);
               
                // Alamat
                String almDanang = new String("Jalan xxx");
                alamatMember.add(almDanang);
                
                // No HP
                String noDanang = new String("0895339038478");
                noMember.add(noDanang);
                
                //No KTP
                String ktpDanang = new String("3575011604010001");
                ktpMember.add(ktpDanang);
                
// LOGIN SEQUENCE                
        int administration = 0; // Untuk looping login sequence
        while  (administration < 1){
    
        String tempusername; // Menyimpan username yang dimasukkan oleh user
        String temppass; // Menyimpan password yang dimasukkan oleh user
        System.out.println("\t===============================");
        System.out.println("\t>>>>>     ADMIN LOGIN     <<<<<");
        System.out.println("\t===============================\n");
        System.out.print("username : ");
        tempusername = scan.nextLine();
        System.out.print("password : ");
        temppass = scan.nextLine();
        System.out.print("\n");
        
       
        int checkuser = 0; // 0=invalid, 1=passed
        int checkpass = 0; // 0=invalid, 1=passed
        
        for(int i = 0; i < useradmin.size();i ++){ // Looping sebanyak jumlah data user admin
            String realusername = useradmin.get(i); // Menyimpan username dari database ke temporary string
               if(tempusername.equals(realusername)){ // Proses perbandingan tempusername dengan realusername
                    i = useradmin.size(); // Jika tempusername dan realusername sama, maka proses looping akan dihentkan
                    checkuser = 1; // Syarat untuk masuk menu utama
                }else {
                 System.out.println("");
                }
        }
        
        for(int i = 0; i < useradmin.size();i ++){ // Looping sebanyak jumlah data user admin
            String realpassword = userpassword.get(i); // Menyimpan password dari database ke temporary string
               if(temppass.equals(realpassword)){ // Proses perbandingan temppass dengan realpassword
                    i = useradmin.size(); //Jika temppass dan realpassword sama, maka proses looping akan dihentkan
                    checkpass = 1; // Syarat untuk masuk menu utama
                }else {
                 System.out.println("");
                }
        } 
 
        if ((checkuser == 1) & (checkpass == 1)){ // Jika username dan password benar, maka akan masuk ke menu utama
          
     
// MENU UTAMA

             int loop = 1;
             int totalharga = 0; // Menyimpan value total harga
                  
        while ( loop != 0){
            
            System.out.println("\t=======================================");
            System.out.println("\t>>>>>     RESTAURANT KENANGAN     <<<<<");
            System.out.println("\t=======================================");
            
            System.out.println("\n 1. Pesan Makanan dan Minuman");
            System.out.println("\n 2. Administrasi");
            System.out.println("\n 3. Cetak Struk");
            System.out.println("\n 4. Exit");
            System.out.print("\n Masukan pilihan : ");
            
            pilihan = scan.nextInt();
            
// FIRST MENU
            int harga = 0; // Untuk melakukan proses penambahan harga 
            if (pilihan == 1){
   
                int loopmak = 1;
                
               while ( loopmak >0 ) {
                   
                int jumlah;
        
                System.out.println("\n\t =======================================================");
                System.out.println("\t >>>>>                   DAFTAR MENU               <<<<< ");
                System.out.println("\t =======================================================");

                System.out.println("\t  ______________________________________________________ ");
                System.out.println("\t |                            |                         |");
                System.out.println("\t |           Nama             |          Harga          |");
                System.out.println("\t |____________________________|_________________________|");
                System.out.println("\t |                            |                         |");
                System.out.println("\t |    1. Nasi Goreng Jawa     |       Rp 25000,00       |");
                System.out.println("\t |    2. Nasi Goreng Hongkong |       Rp 25000,00       |");
                System.out.println("\t |    3. Bihun Goreng         |       Rp 25000,00       |");
                System.out.println("\t |    4. Kwetiaw Goreng       |       Rp 35000,00       |");
                System.out.println("\t |    5. Capcay Goreng        |       Rp 30000,00       |");
                System.out.println("\t |    6. Capcay Kuah          |       Rp 30000,00       |");
                System.out.println("\t |    7. Gurami Goreng        |       Rp 55000,00       |");
                System.out.println("\t |    8. Es Teh               |       Rp 8000,00        |");
                System.out.println("\t |    9. Es Jeruk             |       Rp 12000,00       |");
                System.out.println("\t |   10. Es Campur            |       Rp 15000,00       |");
                System.out.println("\t |____________________________|_________________________|");
                System.out.println("");

                System.out.print("Masukan pilhan menu anda : ");
                menu = scan.nextInt(); // Pemilihan menu switch case
                System.out.print("\n");
               
            
                switch (menu){
                    case 1:
         
                System.out.println("Item         : Nasi Goreng Jawa ");
                System.out.print("Jumlah item  : ");
                jumlah = scan.nextInt();
                for(int i = 0; i< jumlah; i ++){
                detailmakanan barang1 = new detailmakanan("MK1001 ","Nasi Goreng Jawa ", 25000); // Pembuatan detail makanan 
                        strukMakanan.add(barang1); // Penambahan detail makanan ke dalam database makanan
                       
                        harga = harga + barang1.getDetailMakanan(); // Proses akumulasi harga
                }
                       
                     
                    break;

                    
                    case 2:
                System.out.println("Item         : Nasi Goreng Hongkong");
                System.out.print("Jumlah item  : ");
                jumlah = scan.nextInt();
                for(int i = 0; i< jumlah; i ++){
                detailmakanan barang1 = new detailmakanan("MK1002 ","Nasi Goreng Hongkong ", 25000); // Pembuatan detail makanan 
                        strukMakanan.add(barang1); // Penambahan detail makanan ke dalam database makanan
                        harga = harga + barang1.getDetailMakanan(); // Proses akumulasi harga
                }
                    
                    break;
                    
                    
                    case 3:
                System.out.println("Item         : Bihun Goreng ");
                System.out.print("Jumlah item  : ");
                jumlah = scan.nextInt();
                for(int i = 0; i< jumlah; i ++){
                detailmakanan barang1 = new detailmakanan("MK1003 ","Bihun Goreng ", 35000); // Pembuatan detail makanan
                        strukMakanan.add(barang1); // Penambahan detail makanan ke dalam database makanan
                        harga = harga + barang1.getDetailMakanan(); // Proses akumulasi harga
                }
                           
                    break;
                
                    case 4:
                System.out.println("Item         : Kwetiaw Goreng ");
                System.out.print("Jumlah item  : ");
                jumlah = scan.nextInt();
                for(int i = 0; i< jumlah; i ++){
                detailmakanan barang1 = new detailmakanan("MK1004 ","Kwetiaw Goreng ", 35000); // Pembuatan detail makanan
                        strukMakanan.add(barang1); // Penambahan detail makanan ke dalam database makanan
                        harga = harga + barang1.getDetailMakanan(); // Proses akumulasi harga
                }
                        
                    break;
                    
                    case 5:
                System.out.println("Item         : Capcay Goreng");
                System.out.print("Jumlah item  : ");
                jumlah = scan.nextInt();
                for(int i = 0; i< jumlah; i ++){
                detailmakanan barang1 = new detailmakanan("MK1005 ","Capcay Goreng ", 30000); // Pembuatan detail makanan
                        strukMakanan.add(barang1); // Penambahan detail makanan ke dalam database makanan
                        harga = harga + barang1.getDetailMakanan(); // Proses akumulasi harga
                }
                    
                    break;
                    
                    case 6:
                System.out.println("Item         : Capcay Kuah ");
                System.out.print("Jumlah item  : ");
                jumlah = scan.nextInt();
                for(int i = 0; i< jumlah; i ++){
                detailmakanan barang1 = new detailmakanan("MK1006 ","CapcayKuah ", 30000); // Pembuatan detail makanan
                        strukMakanan.add(barang1); // Penambahan detail makanan ke dalam database makanan
                        harga = harga + barang1.getDetailMakanan(); // Proses akumulasi harga
                }
                        
                    break;
                    
                    case 7:
                System.out.println("Item         : Gurami Goreng ");
                System.out.print("Jumlah item  : ");
                jumlah = scan.nextInt();
                for(int i = 0; i< jumlah; i ++){
                detailmakanan barang1 = new detailmakanan("MK1007 ","Gurami Goreng ", 55000); // Pembuatan detail makanan
                        strukMakanan.add(barang1); // Penambahan detail makanan ke dalam database makanan
                        harga = harga + barang1.getDetailMakanan(); // Proses akumulasi harga
                }
                         
                    break;
                    
                    case 8:
                System.out.println("Item         : Es Teh ");
                System.out.print("Jumlah item  : ");
                jumlah = scan.nextInt();
                for(int i = 0; i< jumlah; i ++){
                detailminuman barang1 = new detailminuman("MI1001 ","Es Teh ", 8000); // Pembuatan detail minuman
                        strukMinuman.add(barang1); // Penambahan detail minuman ke dalam database minuman
                        harga = harga + barang1.getDetailMinuman(); // Proses akumulasi harga
                }
                         
                    break;
                    
                    case 9:
                System.out.println("Item         : Es Jeruk ");
                System.out.print("Jumlah item  : ");
                jumlah = scan.nextInt();
                for(int i = 0; i< jumlah; i ++){
                detailminuman barang1 = new detailminuman("MI1002 ","Es Jeruk ", 12000); // Pembuatan detail minuman
                        strukMinuman.add(barang1); // Penambahan detail minuman ke dalam database minuman
                        harga = harga + barang1.getDetailMinuman(); // Proses akumulasi harga
                }
                        
                    break;
                    
                    case 10:
                System.out.println("Item         : Es Campur");
                System.out.print("Jumlah item  : ");
                jumlah = scan.nextInt();
                for(int i = 0; i< jumlah; i ++){
                detailminuman barang1 = new detailminuman("MI1003 ","Es Campur ", 15000); // Pembuatan detail minuman
                        strukMinuman.add(barang1); // Penambahan detail minuman ke dalam database minuman
                        harga = harga + barang1.getDetailMinuman(); // Proses akumulasi harga
                } 
                    break;
                
                    
};
                int pilmenu;
               
                System.out.println("\n[1] Iya");
                System.out.println("[2] Tidak");
                System.out.print("Apakah Anda Ingin Menambah Pesanan ? ");
                pilmenu = scan.nextInt();
                System.out.println("");
                
                System.out.print("");
                
                if(pilmenu == 1){
                    loopmak= 1;
                            
                }else if (pilmenu == 2) {
                    loopmak = 0;
           }else { 
                    System.out.println("Error, coba kembali");
                }
                    }
            totalharga = harga;

            }
            
// SECOND MENU
            
            else if (pilihan == 2){

// MENU ADMINISTRASI               
                System.out.println("\n\t =======================================================");
                System.out.println("\t >>>>>                   ADMINISTRASI              <<<<< ");
                System.out.println("\t =======================================================");
                System.out.println("\n1. Registrasi Member");
                System.out.println("2. Tampilkan Data Member");
                System.out.println("3. Cari Data Member");
                System.out.println("4. Hapus Member\n");
                
                int menuAdmin ;
                System.out.print("Masukkan pilihan : ");
                menuAdmin = scan.nextInt();
                System.out.print("");
                scan.nextLine();
 
                
                if(menuAdmin == 1){
                
                int jumlahdata; // Jumlah data yang akan dimasukkan
                System.out.print("\nMasukkan jumlah data yang akan diinput : ");
                jumlahdata = scan.nextInt();
                System.out.print("");
                scan.nextLine();
            
                for(int i = 0 ;i <jumlahdata ; i++){
                    
                String tempnama; // Menyimpan hasil user input ke dalam temp string
                String tempalamat; // Menyimpan hasil user input ke dalam temp string
                String tempnomor; // Menyimpan hasil user input ke dalam temp string
                String tempktp; // Menyimpan hasil user input ke dalam temp string
            
// TAMBAH MEMBER

                    System.out.println("");
                    System.out.print("Nama          : ");
                    tempnama = scan.nextLine();
                    System.out.print("Alamat        : ");
                    tempalamat = scan.nextLine();
                    System.out.print("No. Handphone : ");
                    tempnomor = scan.nextLine();
                    System.out.print("No. KTP       : ");
                    tempktp = scan.nextLine();
                    System.out.println("");
                    
                    String Membername = new String(tempnama); // Pembuatan detail member berdasarkan user input
                    namaMember.add(Membername); // Memasukkan data ke dalam database
                    
                    String MemberAlamat = new String(tempalamat); // Pembuatan detail member berdasarkan user input
                    alamatMember.add(MemberAlamat);  // Memasukkan data ke dalam database
                    
                    String MemberNo = new String(tempnomor); // Pembuatan detail member berdasarkan user input
                    noMember.add(MemberNo);  // Memasukkan data ke dalam database
                    
                    String MemberKTP = new String(tempktp); // Pembuatan detail member berdasarkan user input
                    ktpMember.add(MemberKTP); // Memasukkan data ke dalam database
                }
            
// TAMPILKAN DATA MEMBER

                }else if (menuAdmin == 2 ){
                System.out.println("\n\t =======================================================");
                System.out.println("\t >>>>>                   DATA MEMBER               <<<<< ");
                System.out.println("\t =======================================================\n");
                
                for(int x = 0 ; x < namaMember.size();x++){ // Menampilkan data sebanyak jumlah data dalam nama member
                    
                    System.out.println("Detail Member "+(x+1));
                    System.out.println("Nama   : " + namaMember.get(x));
                    System.out.println("Alamat : " + alamatMember.get(x));
                    System.out.println("No HP  : " + noMember.get(x));
                    System.out.println("NO KTP : " + ktpMember.get(x));
                    System.out.println("\n");
                    
                    }        
                }
                
// SEARCH DATA MEMBER
                
                else if (menuAdmin == 3 ){ 
                    
                    String dicari;
                    int ditemukan;
                    
                System.out.println("\n\t =======================================================");
                System.out.println("\t >>>>>                 CARI DATA MEMBER            <<<<< ");
                System.out.println("\t =======================================================\n");
                    
                    System.out.print("Masukan nama member          : ");
                    dicari = scan.nextLine();
                    
                    boolean ketemu = false; // False = data belum ditemukan, true = data ditemukan
                    int posisi = -1;
                    
                    for (int i = 0; i < namaMember.size();i++){ // Looping pencarian nama
                        String next = namaMember.get(i);
                        
                        if (next.equals(dicari)){ // Jika string selanjutnya sama dengan string yang di inputkan (string yang dicari)
                            ketemu = true; // Data ditemukan
                            posisi = i; // Posisi ditemukannya data
                            break;
                        }    
                    }
                    if (ketemu){
                        
                        System.out.println("Data ditemukan pada posisi : " + (posisi+1));
                        
                        System.out.println("\n===================");
                        System.out.println(">>> DATA MEMBER <<<");
                        System.out.println("===================\n");
                        System.out.println("Nama   : " + namaMember.get(posisi));
                        System.out.println("Alamat : " + alamatMember.get(posisi));
                        System.out.println("No HP  : " + noMember.get(posisi));
                        System.out.println("NO KTP : " + ktpMember.get(posisi));
                        System.out.println("\n");
                        
                    }
                    else{
                         System.out.println("Data tidak ditemukan");
                    }
                }
                   
// DELETE DATA MEMBER      
                
                else if (menuAdmin == 4){
                    
                    String dicari; 
                    int ditemukan;
                    
                System.out.println("\n\t =======================================================");
                System.out.println("\t >>>>>                DELETE DATA MEMBER           <<<<< ");
                System.out.println("\t =======================================================\n");
                    
                    System.out.print("Masukan nama member yang akan didelete: ");
                    dicari = scan.nextLine();
                    System.out.print("\n");
                    
                    boolean ketemu = false; // False = data belum ditemukan, true = data ditemukan
                    int posisi = -1;
                    
                    for (int i = 0; i < namaMember.size();i++){
                        String next = namaMember.get(i);
                        
                        if (next.equals(dicari)){ // Jika string selanjutnya sama dengan string yang di inputkan (string yang dicari)
                            ketemu = true; // Data ditemukan
                            posisi = i; // Posisi ditemukannya data
                        }
                        
                
                }if (ketemu){
                    namaMember.remove(posisi); // Proses penghapusan data berdasarkan value variabel posisi
                    alamatMember.remove(posisi); // Proses penghapusan data berdasarkan value variabel posisi
                    noMember.remove(posisi); // Proses penghapusan data berdasarkan value variabel posisi
                    ktpMember.remove(posisi); // Proses penghapusan data berdasarkan value variabel posisi
                    System.out.println("Data pada posisi "+ (posisi+1)+" berhasil dihapus");
                }else{
                    
                    System.out.println("Data tidak ditemukan");
                    
                }
                
                }
                
            }   
    // THIRD MENU
            else if (pilihan == 3){
                
                System.out.println("\n\t =======================================================");
                System.out.println("\t >>>>>                   STRUK HARGA               <<<<< ");
                System.out.println("\t =======================================================\n");
                
                int apakahmember; //  Variabel penentu status member 
                
                for(int q = 0 ; q < strukMakanan.size();q++){ // Proses looping untuk menampilkan data makanan sebanyak jumlah data strukMakanan
                    
                System.out.println(strukMakanan.get(q)); 
                 System.out.println("");  
                 
                
            }
                for(int w = 0 ; w < strukMinuman.size();w++){ // Proses looping untuk menampilkan data minuman sebanyak jumlah data strukMinuman
                System.out.println(strukMakanan.get(w));
                 System.out.println("");  
             }
                System.out.println("[1] Member");
                System.out.println("[2] Bukan Member");
                System.out.print("Masukkan keterangan membership anda : ");
                apakahmember = scan.nextInt();
                scan.nextLine();
                System.out.print("\n");
                
                if(apakahmember == 1){ // Jika member total harga akan diberikan diskon 10%
                    System.out.println("Total harga         : "+totalharga);
                    System.out.println("Diskon yang didapat : 10%");
                    System.out.println("Total Harga Akhir   : "+ (totalharga*90/100));
                    System.out.println("\n");
                
                }
                else if(apakahmember == 2){ // Jika bukan member langsung tampilkan harga akhir
                
                    System.out.println("Total harga : "+totalharga);
                    System.out.println("\n");
                
                }
            }
            
            else if(pilihan == 4){
                return; // Exit program
            }
                
                
            
          
            
            
         }   
        }        
    }  
    }
        
  

    public static void main(String[] args) {
        
        PBO_C_KELOMPOK_9 main = new PBO_C_KELOMPOK_9();
    // TODO code application logic here
    
    
    
    
    }
 
}
