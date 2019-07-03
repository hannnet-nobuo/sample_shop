package shop;

import java.util.ArrayList;
import java.util.List;

public class ShopManager {
	public List<Shop> getShopList(){
		List<Shop> result = new ArrayList<Shop>();
		result.add(new Shop("まつや",1));
		result.add(new Shop("吉野家",2));
		result.add(new Shop("牛丼や",3));
		return result;
	}

}
