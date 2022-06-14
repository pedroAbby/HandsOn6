public class GDA{

	GDA(){
	}
	
	Gradiante g = new Gradiante();
	
	public void calculate(double[] vectorSales, double[] vectorAdvertising){
		double loss=g.LossFunction(vectorSales,vectorAdvertising);
		double proximo=g.getProximo();
		double b0=0;
		double b1=0;
		double alfa=g.getAlfa();
		double dpb0=0;
		double dpb1=0;
		
		while(loss>proximo){
			b0=g.getB0();
			b1=g.getB1();
			dpb0=g.dPb0(vectorSales,vectorAdvertising);
			dpb1=g.dPb1(vectorSales,vectorAdvertising);
			b0=b0-alfa*dpb0;
			g.setB0(b0);//actualizaB0
			b1=b1-alfa*dpb1;
			g.setB1(b1);//actualiza B1
			loss=g.LossFunction(vectorSales,vectorAdvertising);
			System.out.println(loss);

		}
		
		System.out.println("B0 =  " + b0  +  " B1 "+ b1 +"  " + loss);
	}



}
