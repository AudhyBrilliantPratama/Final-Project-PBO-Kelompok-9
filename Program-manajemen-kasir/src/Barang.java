package fp.pbo;

import java.util.ArrayList;

public class Barang { // Untuk membuat class barang
    private String idBarang; // Variabel id barang
    
    public   Barang (String idBarang){
        this.idBarang = idBarang;    
    }
   
    public String getidBarang(){
        return idBarang;
    }  
}       
    // end of class barang

    class makanan extends Barang{ // Class makanan yang merupakan turunan dari class barang 
        private String namaMakanan; // Variabel nama makanan
        
        public makanan(String idBarang, String namaMakanan) {
            super(idBarang); // Variabel nama makanan merupakan turunan dari id barang
            this.namaMakanan = namaMakanan;
        }
        
        public String getNamaMakanan() {
        return namaMakanan;
        }   
 }    
    // end of class makanan
        
    class minuman extends Barang{ // Class minuman yang merupakan turunan dari class barang 
        private final String namaMinuman; // Variabel nama minuman

        public minuman(String idBarang, String namaMinuman) {
            super(idBarang); // Variabel nama minuman merupakan turunan dari id barang
            this.namaMinuman = namaMinuman;
        }
        public String getNamaMinuman(){
        return namaMinuman;
        }        
}
    // end of class minuman

    class detailmakanan extends makanan{ // Class detail makanan yang merupakan turunan dari class makanan
        private int hargaMakanan; // Variabel harga makanan
        
        public detailmakanan(String idBarang, String namaMakanan,int hargaMakanan){
            super(idBarang,namaMakanan); // Variabel nama makanan merupakan turunan dari id barang
            this.hargaMakanan = hargaMakanan;
        }
         public int getDetailMakanan(){
         return hargaMakanan;
    }
         
         public String toString(){
             return "Id Makanan    : "+ getidBarang()+"\n"
                  + "Nama Makanan  : "+ getNamaMakanan()+"\n"
                  + "Harga Makanan : "+getDetailMakanan();
         }
}
    // end of class detailmakanan

    class detailminuman extends minuman{ // Class detail minuman yang merupakan turunan dari class minuman
        
        private int hargaMinuman; // Variabel harga minuman
        
        public detailminuman(String idBarang, String namaMinuman,int hargaMinuman){
            super(idBarang,namaMinuman); // Variabel nama minuman merupakan turunan dari id barang
            this.hargaMinuman = hargaMinuman;
        }
        public int getDetailMinuman(){
        return hargaMinuman;
        
    }
        public String toString(){
        return "Id Minuman    : "+ getidBarang()+"\n"
             + "Nama Minuman  : "+ getNamaMinuman()+"\n"
             + "Harga Minuman : "+getDetailMinuman();
        }
    }  
    

