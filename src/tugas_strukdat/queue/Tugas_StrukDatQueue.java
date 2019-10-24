/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_strukdat.queue;

/**
 *
 * @author Sayyid Muhammad Habib
 */
public class Tugas_StrukDatQueue {
    static String[] mobil;
    static int parkir;
    static int top;
    
    static void kondisi(int jumlah)
    {
        parkir=jumlah;
        mobil=new String[parkir];
        top=0;
    }
    
    static void masuk(String i)
    {
        System.out.println("");
        System.out.println("--------------------------------------------------------------");
        if(top>=parkir)
            System.out.println("Maaf Antrian Mobil Penuh");
        else
        {
            System.out.println("Mobil Dengan No. Polisi "+i+" Masuk Antrian");
            mobil[top++]=i;
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("");
    }
    
    static void bayar()
    {
        if(top<=0)
            System.out.println("Maaf, Antrian Mobil Kosong");
        else
        {
            String pop=mobil[0];
            int i=1;
            System.out.println("");
            System.out.println("--------------------------------------------------------------");
            System.out.println("Mobil Dengan No. Polisi "+pop+" Telah Mengambil Tiket Parkir");
            while(i<top)
            {
                mobil[i-1]=mobil[i];
                i++;
            }
            top--;
            System.out.println("--------------------------------------------------------------");
            System.out.println("");
        }
    }
    
    static void find(String i)
    {
        int temp=0;
        boolean hasil=false;
        while(temp<top)
        {
            if(i==mobil[temp])
            {
                hasil=true;
                break;
            }            
            temp++;
        }
        System.out.println("");
        System.out.println("--------------------------------------------------------------");
        if(hasil)
            System.out.println("Mobil Dengan No. Polisi "+i+" Ditemukan Di Antrian Ke-"+(temp+1));
        else
            System.out.println("Mobil Tidak Ditemukan Di Antrian");

        System.out.println("--------------------------------------------------------------");
        System.out.println("");
    }
    
    static void display()
    {
        System.out.println("");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Antrian Mobil :");
        int i=0;
        while(i<top)
        {
            System.out.println("antrian ke ["+(i+1)+"] :"+mobil[i]);
            i++;
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("");
    }
    public static void main(String[] args) {
        Tugas_StrukDatQueue a=new Tugas_StrukDatQueue();
        a.kondisi(5);
        a.bayar();
        a.masuk("BM 1234 BC");
        a.masuk("BM 5678 AC");
        a.masuk("BA 1245 AB");
        a.masuk("B 6123 GH");
        a.display();
        a.masuk("B 6901 AA");
        a.masuk("BM 4568 BB");
        a.bayar();
        a.display();
        a.find("BA 1245 AB");
        
    }
}
