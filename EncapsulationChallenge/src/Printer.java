public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex)
    {
        if(tonerLevel<0){
            this.tonerLevel = tonerLevel;
        }else if(tonerLevel>100){
            this.tonerLevel = tonerLevel;
        }else{
            this.tonerLevel = tonerLevel;
        }
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        tonerLevel += tonerAmount;
        if(tonerLevel>100 || tonerLevel<0){
            return -1;
        }
        return tonerLevel;

    }
    public int printPages(int pages){
        if(duplex){
            System.out.println("Its a duplex printer");
            if(pages%2==0){
                pagesPrinted = pages/2;
                return pagesPrinted;
            }else{
                pagesPrinted = pages/2 +1;
                return pagesPrinted;
            }
        }else {
            pagesPrinted = pages;
            return pagesPrinted;
        }
    }
}
