package basic;

import java.util.ArrayList;

public class Initiate extends fields{
    
    public Initiate(Lattice lattice, ArrayList<Double> values){

        for(int i = 1; i < lattice.world.size(); i++){

            box b = lattice.world.get(i);
            b.T = values.get(0);
            b.P = values.get(1);
            b.H = values.get(2);
            b.rho = values.get(3);

            b.U[0] = values.get(4);
            b.U[1] = values.get(5);
            b.U[2] = values.get(6);
        }
    }
}
