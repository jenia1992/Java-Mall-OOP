
public class ClothChain extends AbsChain {
	protected String importerName;
	public ClothChain(String chainName,String importerName) {
		super(chainName);
		this.importerName=importerName;
	}
	public String getImporterName() {
		return this.importerName;
	}
	public void setImporterName(String importerName) {
		this.importerName = importerName;
	}
	@Override
	public String toString() {
		return "ClothChain [importerName=" + importerName + "]";
	}
	
	
	
}
