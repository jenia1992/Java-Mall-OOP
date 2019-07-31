/*
 *  Parent of all Employees
 *  
 *  Manger
 *  Seller
 *  SeniorSeller
 *  ResponsibleRegister
 *  
 *  
 *  */
public abstract class AbsEmployee {
	protected String name;
	protected int id;
	protected int jobPercent;
	protected int baseSalary;
	
	public abstract double getSalary();

	public AbsEmployee(String name, int id, int jobPercent, int baseSalary) {
		this.name = name;
		this.id = id;
		this.jobPercent = jobPercent;
		this.baseSalary = baseSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getJobPercent() {
		return jobPercent;
	}

	public void setJobPercent(int jobPercent) {
		this.jobPercent = jobPercent;
	}

	public int getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public String toString() {
		return "AbsEmployee [name=" + name + ", id=" + id + ", jobPercent=" + jobPercent + ", baseSalary=" + baseSalary
				+ "]";
	}
	
	

}
