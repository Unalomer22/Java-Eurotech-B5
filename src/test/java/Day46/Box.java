package Day46;

public class Box {
    // Data,state, properties, fields,...
    int en;
    int boy;
    int yukseklik;


    Box(){
        this.en = 1;
        this.boy = 1;
        this.yukseklik = 1;
    }
    Box(Box kutu){// Passing object as an argument to constructor
        this.en = kutu.en;
        this.boy = kutu.boy;
        this.yukseklik = kutu.yukseklik;
    }
    Box(int en, int boy){
        this.en = en;
        this.boy = boy;
    }
    Box(int en,int boy,int yukseklik){
        this.en = en;
        this.boy = boy;
        this.yukseklik = yukseklik;
    }

    public void addBox(Box kutu){
        this.yukseklik += kutu.yukseklik;
    }


    @Override
    public String toString() {
        return "Box{" +
                "en=" + en +
                ", boy=" + boy +
                ", yukseklik=" + yukseklik +
                '}';
    }
    public void displayInfo(){
        System.out.println("En .. "+ this.en +
                            " Boy .. " + this.boy +
                            " Yukseklik .. " + this.yukseklik);
    }
}
