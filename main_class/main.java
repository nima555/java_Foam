package main_class;

import java.util.ArrayList;

import basic.Initiate;
import basic.Lattice;
import basic.box;
/**
 * main
 */
public class main {

    public static void main(String[] args) {



        final double scale = 1;
        double edge[] = {1,1};

        final int dxnum = 1000;
        final int dynum = 1000;

        final double T_init = 301;
        final double P_init = 0;
        final double H_init = 103000;
        final double rho_init = 10;
        final double[] U_init = {0,0,0};



        ArrayList<Double> values = new ArrayList<>();
        values.add(T_init);
        values.add(P_init);
        values.add(H_init);
        values.add(rho_init);
        values.add(U_init[0]);
        values.add(U_init[1]);
        values.add(U_init[2]);



        Lattice lattice = new Lattice(dxnum, dynum, edge);

        Initiate initiate = new Initiate(lattice, values);

        System.out.println(lattice.world.size());
        System.out.println(lattice.world.get(100).T);

    }
}