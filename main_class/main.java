package main_class;

import basic.Lattice;
import basic.box;
/**
 * main
 */
public class main {

    public static void main(String[] args) {

        final double scale = 1;
        double edge[] = {0,0,1,1};

        final int dxnum = 1000;
        final int dynum = 1000;

        Lattice lattice = new Lattice();
        lattice.Lattice(dxnum, dynum, edge);

        System.out.print(lattice.world.size());

        
    }
}