package shop;

import java.util.List;

public class ShopApp {
	public void run() {
		System.out.println("店ランキング");
		ShopManager manager = new ShopManager();
		List<Shop> shops = manager.getShopList();
		for(Shop sh : shops) {
			System.out.println(sh.getName());
			System.out.println(sh.getRank());
		}
	}
}
