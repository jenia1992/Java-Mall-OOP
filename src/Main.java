import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {
	static HashMap<Integer, Canyon> allCanyons = new HashMap<Integer, Canyon>();
	static HashMap<String, AbsChain> allChains = new HashMap<String, AbsChain>();

	public static void main(String[] args) {
		init();
		defaultMenu();
		
	}
	
	public static void init() {
		
		// init malls
		allCanyons.put(432,new Canyon(432,"Hasharon"));
		allCanyons.put(212,new Canyon(212,"Hilel"));
		//init chains
		allChains.put("Shuper",new BookChain("Shuper","Harry Potter"));
		allChains.put("George",new FastFoodChain("George",10,45,25));
		allChains.put("Columbus",new FoodChain("Columbus",10));
		allChains.put("Bastro",new ClothChain("Bastro","BastroImport"));
		//init shops
		if(allChains.containsKey("Bastro")) {
			allChains.get("Bastro").addShop(new Shop(65,allChains.get("Bastro"),212));;
		}
		if(allChains.containsKey("Columbus")) {
			allChains.get("Columbus").addShop(new Shop(12,allChains.get("Columbus"),212));
		}
		if(allChains.containsKey("George")) {
			allChains.get("George").addShop(new Shop(43,allChains.get("George"),432));
			allChains.get("George").addShop(new Shop(81,allChains.get("George"),432));
		}
		if(allChains.containsKey("Shuper")) {
			allChains.get("Shuper").addShop(new Shop(2,allChains.get("Shuper"),432));
		}
			Seller seller1=new Seller("koko",12,70,3500);
			//allChains.get("Shuper").addEmployee(seller1.getId(),seller1);
			allChains.get("Shuper").getShopById(2).addEmployee(seller1);
			//allChains.get("Shuper").printAllChainShops();
	
		

	}
	
	public static void defaultMenu() {
         Scanner myObj = new Scanner(System.in);  // Create a Scanner object
         while(true) {
        	 printCanyons();
        	 printChains();
        	 System.out.println("choose you menu:");
        	 System.out.println("menu: 1");
        	 System.out.println("menu: 2");
        	 System.out.println("menu: 3");
        	 String choice = myObj.nextLine();  // Read user input
        	 switch(choice) {
        	  case "1":
        		  
        		  menu1();
        	    break;
        	  case "2":
        		  menu2();
        	    break;
        	  case "3":
        		  menu3();
          	    break;
        	  default:
        	    // code block
        	}
         }
	}
	
	public static void printCanyons() {
		Map<Integer, Canyon> map = new TreeMap<Integer, Canyon>(allCanyons); 
		System.out.println("***************************************************************************************");
        System.out.println("Canyons After Sorting:");
        Set <Integer>set = map.keySet();
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()) {
        	Integer canyonId = iterator.next();
        	Canyon ans=map.get(canyonId);
             System.out.print(canyonId
           		  + ": ");
             System.out.println(ans);
        }
	}
	
	public static void printChains() {
		Map<String, AbsChain> map = new TreeMap<String, AbsChain>(allChains); 
		System.out.println("***************************************************************************************");
        System.out.println("Chains After Sorting:");
        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
             Map.Entry canyon = (Map.Entry)iterator.next();
             System.out.print(canyon.getKey() 
           		  + ": ");
             System.out.println(canyon.getValue());
        }
        System.out.println("***************************************************************************************");
        allChains.get("Shuper").printAllChainShops();
	}
	///////////////////////<<<<<<<<<<<<<<<<<<< MENU 1 >>>>>>>>>>>>>>>>>/////////////////////
	public static void menu1() {
		System.out.println("Menu 1!!!!");
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		String choice = myObj.nextLine();  // Read user input
		String[] array = choice.split(" ");
		switch(array[0]) {
		  	case "1":
	    	    addChain(array);
	    	    break;
		  	case "2":
	    	    addEmployee(array);
	    	    break;
		  	case "3":
	    	    // code block
	    	    break;
		  	case "4":
	    	    // code block
	    	    break;
		  	case "5":
	    	    // code block
	    	    break;
		  	case "6":
	    	    // code block
	    	    break;
		  	case "7":
		  		menu2();
	    	    break;
		  	case "8":
	    	    menu3();
	    	    break;
		  	case "9":
	    	    break;
	  	  default:
	  	    // code block
	  	}
	}
///////////////////////<<<<<<<<<<<<<<<<<<< MENU 2 >>>>>>>>>>>>>>>>>/////////////////////
	public static void menu2() {
		System.out.println("Menu 2!!!!");
	}
///////////////////////<<<<<<<<<<<<<<<<<<< MENU 3 >>>>>>>>>>>>>>>>>/////////////////////
	public static void menu3() {
		System.out.println("Menu 3!!!!");
	}
	
	public static void addChain(String[] array) {
		//[0]<command> //[1]<type> //[2]<name> //<arguments>
		String type = array[1];
		String name = array[2];
		String supplierName;
		String suppliers;
  		String mealPrice;
		String discount;
		String bestSeller;
		
		switch(type) {
	  	case "1":
	  		//ClothChain
	  		//<arguments>:: <supplierName>
	  		supplierName = array[3];
    	    allChains.put(name, new ClothChain(name,supplierName));
    	    break;
	  	case "2":
	  		//FoodChain
	  		//<arguments>:: <suppliers>
	  		suppliers = array[3];
			allChains.put(name,new FoodChain(name,Integer.parseInt(suppliers)));
    	    break;
	  	case "3":
	  		//FastFoodChain
	  		//<arguments>:: <suppliers>,<mealPrice>,<discount>
	  		suppliers = array[3];
	  		mealPrice = array[4];
			discount = array[5];
			allChains.put(name,new FastFoodChain(name,Integer.parseInt(suppliers),Double.parseDouble(mealPrice),Double.parseDouble(discount)));
    	    // code block
    	    break;
	  	case "4":
    	    //BookChain
	  		//<arguments>:: <bestSeller>
	  		bestSeller = array[3];
	  		allChains.put(name, new BookChain(name,bestSeller));
    	    break;
	  	default:
	  	    // code block
		}
	}
	public static void addEmployee(String[] array) {
		//[0]<command> //[1]<name> //[2]<id> //[3]<type> //[4]<jobPercent> //[5]<salary> //[6]<ChainName> //[7]<storeID>
		String name=array[1];
		int id=Integer.parseInt(array[2]);
		String type=array[3].toUpperCase();
		int jobPercent=Integer.parseInt(array[4]);
		int salary=Integer.parseInt(array[5]);
		String chainName=array[6];
		int storeID=Integer.parseInt(array[7]);
		AbsEmployee tempEmp;
		switch(type){
	  	case "A":
    	    tempEmp=new Manager(name,id,jobPercent,salary,1);
    	    break;
	  	case "B":
	  		tempEmp=new SeniorSeller(name,id,jobPercent,salary);
    	    break;
	  	case "C":
	  		tempEmp=new Seller(name,id,jobPercent,salary);
    	    break;
	  	case "D":
	  		tempEmp=new ResponsibleRegister(name, id, jobPercent, salary);
    	    break;
	  	
	  	  default:
	  	    // code block
	  		 return;
	  	} 
			try {
				allChains.get(chainName).getShopById(storeID).addEmployee(tempEmp);
			}catch(Exception e) {
				System.out.println(e);
			}
			
			
			
	}
	
	
	
	

}
