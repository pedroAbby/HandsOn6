
public class DataSet {	
	private double sales[];	
	private double advertising[];
	
	DataSet() {
	}
	
	
	public void setSales(double... data){
		this.sales=data;
	}
	public void setAdvertising(double... data){
		this.advertising=data;
	}
	public double[] getSales(){
		return this.sales;
	}
	public double[] getAdvertising(){
		return this.advertising;
	}
}
