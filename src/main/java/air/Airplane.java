package air;

public class Airplane {

    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void ascent(int x){
        setHeight(getHeight()+x);
    }


    public void descent(int x){
        setHeight(getHeight()-x);
    }


}
