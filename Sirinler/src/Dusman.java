
public class Dusman extends Karakter{
    private int dusmanID;
    private String dusmanAd;
    private String dusmanTur;

    public Dusman() {
    }

    public Dusman(int dusmanID, String dusmanAd, String dusmanTur) {
        this.dusmanID = dusmanID;
        this.dusmanAd = dusmanAd;
        this.dusmanTur = dusmanTur;
    }

    public Dusman(int dusmanID, String dusmanAd, String dusmanTur, int ID, String Ad, String Tur) {
        super(ID, Ad, Tur);
        this.dusmanID = dusmanID;
        this.dusmanAd = dusmanAd;
        this.dusmanTur = dusmanTur;
    }
    class Gargamel extends Dusman{
        private int hız;
        private int puan;

        public Gargamel() {
        }

        public Gargamel(int hız, int puan) {
            this.hız = hız;
            this.puan = puan;
        }

        public int getHız() {
            return hız;
        }

        public void setHız(int hız) {
            this.hız = hız;
        }

        public int getPuan() {
            return puan;
        }

        public void setPuan(int puan) {
            this.puan = puan;
        }
        
    }
    class Azman extends Dusman{
        private int hız;
        private int puan;

        public Azman() {
        }

        public Azman(int hız, int puan) {
            this.hız = hız;
            this.puan = puan;
        }

        public int getHız() {
            return hız;
        }

        public void setHız(int hız) {
            this.hız = hız;
        }

        public int getPuan() {
            return puan;
        }

        public void setPuan(int puan) {
            this.puan = puan;
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

    public int getDusmanID() {
        return dusmanID;
    }

    public void setDusmanID(int dusmanID) {
        this.dusmanID = dusmanID;
    }

    public String getDusmanAd() {
        return dusmanAd;
    }

    public void setDusmanAd(String dusmanAd) {
        this.dusmanAd = dusmanAd;
    }

    public String getDusmanTur() {
        return dusmanTur;
    }

    public void setDusmanTur(String dusmanTur) {
        this.dusmanTur = dusmanTur;
    }
    
}