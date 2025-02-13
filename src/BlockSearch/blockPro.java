package BlockSearch;

public class blockPro {
    private int min;
    private int max;
    private int startIndex;
    private int endIndex;

    public blockPro(){

    }
    public blockPro(int min,int max,int startIndex,int endIndex){
        this.min=min;
        this.max=max;
        this.startIndex=startIndex;
        this.endIndex=endIndex;
    }

    public void setMin(int min){
        this.min=min;
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

    public int getMin(){
        return min;
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
