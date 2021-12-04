package basic;

import java.util.ArrayList;

/**
 * lattice
 */
public class Lattice {

    int lattices;
    int points;
    int surfaces;
    public ArrayList<box> world = new ArrayList<>();

    public void Lattice(int dxnum, int dynum, double[] edge){

        int s = dxnum*dynum;
        
    
        for(int i = 0; i < s; i++){
            world.add(new box());
        }


    }
}