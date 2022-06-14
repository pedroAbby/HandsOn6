public class Gradiante{


    private double B0=0;
    private double B1=0;
    private double alfa=0.0003;
    private double proximo=0.01;
    
    Gradiante(){}
    Sp2 s = new Sp2();
    
    //paso #1
    
    public double getProximo(){return proximo;}
    public double getB0(){return B0;}
    public double getB1(){return B1;}
    public double getAlfa(){return alfa;}
    public void setB0(double b0){B0=b0;}
    public void setB1(double b1){B1=b1;}

    
    //paso #2
    public double LossFunction(double[] vectorSales,double[] vectorAdvertising){
    		double n=vectorAdvertising.length;
    
         double loss=s.sLoss(vectorSales,vectorAdvertising,B0,B1);
        return loss;
    }
    
    //paso #3
    
    public double dPb0(double[] vectorSales,double[] vectorAdvertising){
    	double n=vectorAdvertising.length;
    	double dpb0=s.sDpb0(vectorSales,vectorAdvertising,B0,B1);
    	return dpb0;
    }
    
    public double dPb1(double[] vectorSales,double[] vectorAdvertising){
    	double n=vectorAdvertising.length;
    	double dpb1=s.sDpb1(vectorSales,vectorAdvertising,B0,B1);
    	return dpb1;
    }
}
