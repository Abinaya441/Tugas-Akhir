package cargons;

public class tempat {
    
    String tujuan;
    private String[] data = new String [5];
    private int[] angka = new int [5];
    private int kali2;
    
    public void setKali2(int kali2){
        this.kali2=kali2;
    }
    
    public int getKali2(){
        return kali2;
    }
    
    public tempat (String tujuans){
        tujuan = tujuans;
        String[] data = {"JAKARTA", "BANDUNG", "SURABAYA", "YOGYAKARTA", "SEMARANG"};
        int[] angka = {3, 4, 5, 2, 1};
        this.data=data;
        this.angka=angka;
    }
    
    public void jk(){
        for (int i=0; i<data.length; i++){
            if (data[i].equals(tujuan)){
                int c = angka[i];
                setKali2(c);
            }
        }        
    }
}
