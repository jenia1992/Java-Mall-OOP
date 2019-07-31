import java.util.Vector;

public class SeniorSeller extends AbsEmployee {
	private Vector<Double> sales;
	private Vector<Double> canceledSales;
	
	
	public SeniorSeller(String name, int id, int jobPercent, int baseSalary) {
		super(name, id, jobPercent, baseSalary);
		this.sales = new Vector<Double>();
		this.canceledSales = new Vector<Double>();
	}
	@Override
	public double getSalary() {
		double sum = 0;
		for (int i = 0;i<sales.size();i++){
			sum += sales.get(i);
		}
		sum /= sales.size();
		
		return (sum + baseSalary + sales.size())*jobPercent / 100 * 1.5;
	}
	public void addSales(double sale) {
		this.sales.add(sale);
	}
	public void addCanceledSales(double sale) {
		this.canceledSales.add(sale);
	}


}
