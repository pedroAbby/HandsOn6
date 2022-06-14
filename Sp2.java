import java.lang.Math;
public class Sp2{


	
    Sp2(){}

    
    public double sLoss(double[]y,double[]x,double b0,double b1){
    double s=0.0;
    double n=y.length;
    	for(int i=0;i<n;i++){
           s+=(y[i]-(b0+b1*x[i]));
            
        }
        s=s/n;
        s=s*s;
    	return s;
    }
    
    public double sDpb0(double[]y,double[]x,double b0,double b1){
    double dpb0=0.0;
    double n=y.length;
    	for(int i=0;i<n;i++){
    		dpb0 = (y[i]-(b0+(b1*x[i])));
        }
        dpb0=(-2.0/n)*dpb0;
    	return dpb0;
    }
    
    public double sDpb1(double[]y,double[]x,double b0,double b1){
    double dpb1=0.0;
    double n=y.length;
    	for(int i=0;i<n;i++){
            dpb1 = ((y[i]-(b0+(b1*x[i])))*x[i]);
        }
        dpb1=(-2.0/n)*dpb1;
    	return dpb1;
    }
}
