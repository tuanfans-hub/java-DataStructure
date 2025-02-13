package BlockSearch;

public class block {
    private int max;
    private int startIndex;
    private int endIndex;

    public block(){

    }

    public block(int max,int startIndex,int endIndex){
        this.max=max;
        this.startIndex=startIndex;
        this.endIndex=endIndex;
    }

    public void setMax(int max){
        this.max=max;
    }
    public void setStartIndex(int startIndex){
        this.startIndex=startIndex;
    }
    public void setEndIndex(int endIndex){
        this.endIndex=endIndex;
    }

    public int getMax(){
        return max;
    }
    public int getStartIndex(){
        return startIndex;
    }
    public int getEndIndex(){
        return endIndex;
    }
}
