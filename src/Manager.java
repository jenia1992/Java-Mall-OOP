
public class Manager extends AbsEmployee {
	private int rank;
	
	public Manager(String name, int id, int jobPercent, int baseSalary, int rank) {
		super(name, id, jobPercent, baseSalary);
		this.rank = rank;
	}
	@Override
	public double getSalary() {
		return this.baseSalary * this.rank * this.jobPercent / 100;
	}
	public int getRank() {
		return this.rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "Manager [rank=" + rank + "]";
	}
	

	

}
