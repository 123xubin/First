package coin;

import java.util.HashMap;
import java.util.Scanner;

public class Coin {
	private HashMap<Integer,String> coinnames = new HashMap<Integer,String>();
	
	
	public Coin() {
		coinnames.put(1, "penny");
		coinnames.put(10, "dim");
		coinnames.put(25, "quarter");
		coinnames.put(50, "half-dollar");
		for (Integer K:coinnames.keySet()) {
			String s = coinnames.get(K);
			System.out.println(s);
		}
	}
	public String getName(int amount) {
		if(coinnames.containsKey(amount))
			return coinnames.get(amount);
		else
			return "Not";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int amount = in.nextInt();
		Coin coin = new Coin();
		String name = coin.getName(amount);
		System.out.print(name);
	}

}
