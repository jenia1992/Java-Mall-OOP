
public class ResponsibleRegister extends AbsEmployee {
	private int opsNum;
	public ResponsibleRegister(String name, int id, int jobPercent, int baseSalary) {
		super(name, id, jobPercent, baseSalary);
		this.opsNum = 0;
	}

	@Override
	public double getSalary() {
		return (this.baseSalary+this.opsNum) * this.jobPercent/100;
	}

	public int getOpsNum() {
		return this.opsNum;
	}

	public void setOpsNum(int opsNum) {
		this.opsNum = opsNum;
	}

	@Override
	public String toString() {
		return "ResponsibleRegister [opsNum=" + this.opsNum + "]";
	}
	
	
}
