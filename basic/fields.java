package basic;

/**
 * fields
 */
public class fields{

    public double T, P, rho, H, alpha;
    public double[] U = new double[3];

    double get_U(char type){
        if(type == 'x'){
            return U[0];
        }

        else if(type == 'y'){
            return U[1];
        }

        else if(type == 'z'){
            return U[2];
        }

        else{
            System.out.println("error");
            return 1;
        }
    }
}