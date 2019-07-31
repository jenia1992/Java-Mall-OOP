import java.util.Vector;
public class Canyon {
	protected int canyonID;
	protected String canyonAddress;
	Vector <Shop> canyonStores;
	
	public Canyon(int canyonID, String canyonAddress) {
		super();
		this.canyonID = canyonID;
		this.canyonAddress = canyonAddress;
		this.canyonStores = new Vector <Shop>();
	}
	
	public int getCanyonID() {
		return this.canyonID;
	}
	public void setCanyonID(int canyonID) {
		this.canyonID = canyonID;
	}
	public String getCanyonAddress() {
		return this.canyonAddress;
	}
	public void setCanyonAddress(String canyonAddress) {
		this.canyonAddress = canyonAddress;
	}
	public void addShop(Shop shop) {
		this.canyonStores.add(shop);
	}

	@Override
	public String toString() {
		return "Canyon [canyonID=" + canyonID + ", canyonAddress=" + canyonAddress + ", canyonStores=" + canyonStores
				+ "]";
	}
	
	
}
