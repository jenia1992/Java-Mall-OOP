import java.util.Vector;

public class Seller extends AbsEmployee {
	private Vector<Double> sales;
	
	
	public Seller(String name, int id, int jobPercent, int baseSalary) {
		super(name, id, jobPercent, baseSalary);
		this.sales = new Vector<Double>();
	}
	@Override
	public double getSalary() {
		double sum = 0;
		for (int i = 0;i<this.sales.size();i++){
			sum += this.sales.get(i);
		}
		sum /= this.sales.size();
		return (sum + this.baseSalary + this.sales.size()) * this.jobPercent / 100;
	}
	
	public Vector<Double> getSales() {
		return sales;
	}

	public void addSales(double sale) {
		this.sales.add(sale);
	}

	@Override
	public String toString() {
		return "Seller [sales=" + this.sales + "]";
	}
	public void printSales() {
		for (int i = 0; i < this.sales.size(); i++) {
			System.out.println(this.sales.get(i));
		}
	}
	

}
