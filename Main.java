public class Main {

	public static void main(String[] args) {
		DataSet ds = new DataSet();
		ds.setSales(2,4,6,8,10,12,14,16,18);
		ds.setAdvertising(1,2,3,4,5,6,7,8,9);
		//ds.setAdvertising(1,2,3,4,5,6,7,8,9);
		//ds.setSales(3,6,9,12,15,18,21,24,27);
		
		GDA gda = new GDA();
		
		gda.calculate(ds.getSales(),ds.getAdvertising());
	}
}
