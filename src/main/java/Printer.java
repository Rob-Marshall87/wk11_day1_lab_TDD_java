public class Printer {
    private int sheets;
    private int toner;

    public Printer(){
        this.sheets = 50;
        this.toner = 100;
    }

    public int getSheets() {
        return sheets;
    }

    public void setSheets(int sheets) {
        this.sheets = sheets;
    }

    public int getToner() {
        return toner;
    }

    public void setToner(int toner) {
        this.toner = toner;
    }

    public void printCopies(int pages, int copies){
        if (this.sheets >= (pages *copies)) {
            this.sheets -= (pages * copies);
            this.toner -= (pages * copies);
        }
    }

    public void refillSheets(){
        this.sheets = 50;
    }
}
