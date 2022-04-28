public class Obje {

    public Obje() {
    }
    
    public class altın extends Obje{
        private int sure;
        private int altınSayisi;

        public altın() {
        }

        public altın(int sure, int altınSayisi) {
            this.sure = sure;
            this.altınSayisi = altınSayisi;
        }
        
        public int getSure() {
            return sure;
        }

        public void setSure(int sure) {
            this.sure = sure;
        }

        public int getAltınSayisi() {
            return altınSayisi;
        }

        public void setAltınSayisi(int altınSayisi) {
            this.altınSayisi = altınSayisi;
        }
        
        
    }
    public class mantar extends Obje{
            private int sure;
            public mantar() {
            }

            public mantar(int sure) {
                this.sure = sure;
            }
            
            public int getSure() {
                return sure;
            }

            public void setSure(int sure) {
                this.sure = sure;
            }
            
        }
}