package bookmarket.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	ArrayList<CartItem> itemList = new ArrayList<>();
	int numItems = 0;

	public boolean isEmpty() {
		return numItems == 0;
	}

	public ArrayList<CartItem> getItemList() {
		return itemList;
	}

	public void setItemList(ArrayList<CartItem> itemList) {
		this.itemList = itemList;
	}

	public int getNumItems() {
		return numItems;
	}

	public void setNumItems(int numItems) {
		this.numItems = numItems;
	}

	public String getItemInfo(int index) {
		return itemList.get(index).toString();
	}
}
