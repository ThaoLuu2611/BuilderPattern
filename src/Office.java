import java.util.Set;

public class Office {

    private int mCountTable;
    private int mCountChair;
    private int mCountLight;
    private int mCountAir;
    private int mCountFan;

    private Office(Builder builder) {
        mCountTable = builder.mCountTable;
        mCountChair = builder.mCountChair;
        mCountLight = builder.mCountLight;
        mCountAir = builder.mCountAir;
        mCountFan = builder.mCountFan;
    }

    public static class Builder {

        private int mCountTable;
        private int mCountChair;
        private int mCountLight;
        private int mCountAir;
        private int mCountFan;

        public Builder() {

        }

        public Office build() {
            return new Office(this);
        }

        public void setTable(int countTable) {
            this.mCountTable = countTable;
            //return this;
        }

        public Builder setChair(int countChair) {
            this.mCountChair = countChair;
            return this;
        }

        public Builder setLight(int countLight) {
            this.mCountLight = countLight;
            return this;
        }

        public Builder setAir(int countAir) {
            this.mCountAir = countAir;
            return this;
        }

        public Builder setFan(int countFan) {
            this.mCountFan = countFan;
            return this;
        }
        
        public Office create(){
        	Office office = new Office(this);
        	return office;
        }

    }
    
    public String toString(){
    	return "Table: " + mCountTable +" Chair: "+ mCountChair+" Light: "+mCountLight+" Air: "+mCountAir +" Fan: "+mCountFan;
    }
    
   
}