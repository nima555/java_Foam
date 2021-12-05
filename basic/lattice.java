package basic;

import java.util.ArrayList;

/**
 * lattice
 */
public class Lattice {

    int lattices;
    int points;
    int surfaces;
    double dx, dy;
    public ArrayList<box> world = new ArrayList<>();

    public Lattice(int dxnum, int dynum, double[] edge){

        this.dx = (edge[0])/(double)dxnum;
        this.dy = (edge[1])/(double)dxnum;

        for(int i = 0; i < dxnum; i++){
            for(int j = 0; j < dynum; j++){

                double[] basic = {i*dx, j*dy};

                ArrayList<Double> point = new ArrayList<>();
                ArrayList<Double> surface = new ArrayList<>();

                point.add(basic[0]);
                point.add(basic[1]);
                point.add(basic[0]+dx);
                point.add(basic[1]);
                point.add(basic[0]+dx);
                point.add(basic[1]+dy);
                point.add(basic[0]);
                point.add(basic[1]+dy);

                surface.add(dx);
                surface.add(dy);
                surface.add(dx);
                surface.add(dy);

                this.world.add(new box(point, surface, (i+1)*(j+1)-1));

            }
        }

        this.lattices = dxnum*dynum;
        this.points = this.lattices*(dxnum+1)*(dynum+1);
        this.surfaces = (dxnum+1)*dynum + dxnum*(dynum+1);
    }
}
