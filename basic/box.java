package basic;

import java.util.ArrayList;

public class box extends fields{

    int label;
    
    ArrayList<Double> point = new ArrayList<>();
    ArrayList<Double> surface = new ArrayList<>();
    double volume;

    public box(ArrayList<Double> point, ArrayList<Double> surface, int i){

        this.label = i;
        this.point = point;
        this.surface = surface;
        volume = surface.get(0)*surface.get(1);

    }
}
