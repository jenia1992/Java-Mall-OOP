import java.util.Vector;

public class Shop {
	protected int shopID;
	protected AbsChain chain;
	Vector <AbsEmployee> shopEmployees;
	protected int canyonID;
	

	public Shop(int shopID, AbsChain chain,int canyonId) {
		this.shopID = shopID;
		this.chain = chain;
		this.canyonID = canyonId;
		this.shopEmployees = new Vector <AbsEmployee>();
		Main.allCanyons.get(this.canyonID).addShop(this);
	}
	

	public int getShopID() {
		return this.shopID;
	}

	public void setShopID(int shopID) {
		this.shopID = shopID;
	}
	
	public int getCanyonID() {
		return canyonID;
	}


	public void setCanyonID(int canyonID) {
		this.canyonID = canyonID;
	}

	
	public String getChainName() {
		return chain.getChainName();
	}
	public void addEmployee(AbsEmployee employee){ // add employee to shop and chain
		this.shopEmployees.add(employee);
		this.chain.addEmployee(employee.id,employee);
	}

	@Override
	public String toString() {
		return "Shop [shopID=" + shopID + ", chain=" + chain + ", shopEmployees=" + shopEmployees + "]";
	}
	
	
	
}
