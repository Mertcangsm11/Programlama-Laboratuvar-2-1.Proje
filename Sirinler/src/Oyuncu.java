

public class Oyuncu extends Karakter{
    private int oyuncuID;
    private String oyuncuAd;
    private String oyuncuTur;
    private int oyuncuSkor;
    
       

    public Oyuncu() {
    }

    
    
    public Oyuncu(int oyuncuID, String oyuncuAd, String oyuncuTur, int oyuncuSkor) {
        this.oyuncuID = oyuncuID;
        this.oyuncuAd = oyuncuAd;
        this.oyuncuTur = oyuncuTur;
        this.oyuncuSkor = oyuncuSkor;
    }

    public Oyuncu(int oyuncuID, String oyuncuAd, String oyuncuTur, int oyuncuSkor, int ID, String Ad, String Tur) {
        super(ID, Ad, Tur);
        this.oyuncuID = oyuncuID;
        this.oyuncuAd = oyuncuAd;
        this.oyuncuTur = oyuncuTur;
        this.oyuncuSkor = oyuncuSkor;
    }
    
    public void PuaniGoster(int sayi){
        int puan;
        puan=sayi;
    }
    class TembelSirin extends Oyuncu{
        private int hız;
        private int puan;
        

        public TembelSirin() {
        }

        public TembelSirin(int hız, int puan) {
            this.hız = hız;
            this.puan=puan;
            
            
        }

        public int getHız() {
            return hız;
        }

        public void setHız(int hız) {
            this.hız = hız;
        }

        public int getpuan() {
            return puan;
        }

        public void setpuan(int Apuan) {
            this.puan = Apuan;
        }

        
        
    }
    class GozlukluSirin extends Oyuncu{
        private int hız;
        private int puan;
        
        
        public GozlukluSirin() {
        }

        public GozlukluSirin(int hız, int puan) {
            this.hız = hız;
            this.puan = puan;
            
        }
        public int getHız() {
            return hız;
        }

        public void setHız(int hız) {
            this.hız = hız;
        }

        public int getpuan() {
            return puan;
        }

        public void setpuan(int Apuan) {
            this.puan = Apuan;
        }

        

        
    }
    class Puan extends Oyuncu{

        public Puan(int sayi) {
        }

        
        @Override
        public void PuaniGoster(int sayi) {
            super.PuaniGoster(sayi);
            
        }
        
        
        
        
    }
    @Override
    public void setTur(String Tur) {
        super.setTur(Tur); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTur() {
        return super.getTur(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAd(String Ad) {
        super.setAd(Ad); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getAd() {
        return super.getAd(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setID(int ID) {
        super.setID(ID); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getID() {
        return super.getID(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void EnKısaYol() {
        super.EnKısaYol(); //To change body of generated methods, choose Tools | Templates.
    }

    public int getOyuncuID() {
        return oyuncuID;
    }

    public void setOyuncuID(int oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public String getOyuncuAd() {
        return oyuncuAd;
    }

    public void setOyuncuAd(String oyuncuAd) {
        this.oyuncuAd = oyuncuAd;
    }

    public String getOyuncuTur() {
        return oyuncuTur;
    }

    public void setOyuncuTur(String oyuncuTur) {
        this.oyuncuTur = oyuncuTur;
    }

    public int getOyuncuSkor() {
        return oyuncuSkor;
    }

    public void setOyuncuSkor(int oyuncuSkor) {
        this.oyuncuSkor = oyuncuSkor;
    }

   

    

    
    
}