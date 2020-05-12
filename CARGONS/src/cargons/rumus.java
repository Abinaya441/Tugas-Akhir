package cargons;

public class rumus {
    
    int berat;
    int rms;
    int jenis2;
    int kali;
    int disc;
    int total;
    private String harga;
    
    public void setHarga(String harga){
        this.harga=harga;
    }    
    
    public String getHarga(){
        return harga;
    }
    
    public rumus (int berats, int jenis2s, int kalis){
        berat = berats;
        jenis2 = jenis2s;
        kali = kalis;
        rms = berat * jenis2 * kali;
        while (berat>3 && disc<=10000){
            disc = rms / 10;
        }
        total = rms - disc;
    }
    
    public void menu(){
        harga = Integer.toString(total);
        setHarga(harga);
    }
}
