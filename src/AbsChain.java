/*
 *  Parent of all Chains
 *  
 *  */

import java.util.TreeMap;
import java.util.Vector;
public abstract class AbsChain {
	protected String chainName;
//	Vector <AbsEmployee> chainEmployees;
	TreeMap<Integer, AbsEmployee> chainEmployees;
	TreeMap<Integer,Shop>chainShops;
	
	
	public AbsChain(String chainName) {
		this.chainName = chainName;
//		this.chainEmployees = new Vector <AbsEmployee>();
		this.chainShops = new TreeMap<Integer,Shop>();
		this.chainEmployees=new TreeMap<Integer,AbsEmployee>();
	}
	
	public String getChainName() {
		return this.chainName;
	}

	public void setChainName(String chainName) {
		this.chainName = chainName;
	}
	public Shop getShopById(int id) {
		if(chainShops.containsKey(id)) {
			return this.chainShops.get(id);
		}
		return null;
	}
	public void addShop(Shop shop){
		this.chainShops.put(shop.getShopID(), shop);
	}
	public void addEmployee(int id,AbsEmployee employee){ // add employee to chain
		if(!chainEmployees.containsKey(id)) {
			chainEmployees.put(id, employee);
		}
	}
	public void printAllChainShops() {
			System.out.println(chainShops);
		
	}
	@Override
	public String toString() {
		return "AbsChain [chainName=" + chainName + ", chainEmployees=" + chainEmployees + ", chainShops=" + chainShops
				+ "]";
	}

	

	
	
	
	
	
}
