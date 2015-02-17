

// ショッピングカート（注文内容を記録）
class ShoppingCart {
	public static final int MAX_ITEMS = 10;
	private int count = 0;
	private String[] items = new String[MAX_ITEMS];
	public void add(String item) {
		items[count] = item;
		count++;
	}
	public String[] getItems() {
		return items;
	}
	public int getCount() {
		return count;
	}
}

//class ShoppingCartIterator implements Iterator<String> {
//
//}


public class Main {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		cart.add("りんご");
		cart.add("みかん");
		cart.add("バナナ");

		int count = cart.getCount();

		String[] items = cart.getItems();
		for (int i = 0; i < count; i++) {
			System.out.println(items[i]);
		}
	}
}
