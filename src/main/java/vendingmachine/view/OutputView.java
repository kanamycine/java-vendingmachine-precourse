package vendingmachine.view;

import java.util.Iterator;
import java.util.LinkedHashMap;

import vendingmachine.domain.Coin;
import vendingmachine.domain.VendingMachine;
import vendingmachine.utils.Message;

public class OutputView {
	private static final String WON_FORMAT = "원 - ";
	private static final String EA_FORMAT = "개";
	private static final String BALANCE_FORMAT = "투입 금액: ";
	private static final String CHANGES_FORMAT = "잔돈";

	public static void printHoldingCoins(LinkedHashMap<Coin, Integer> coins){
		System.out.println(Message.HOLDING_COINS_MESSAGE);
		Iterator<Coin> keys = coins.keySet().iterator();
		while (keys.hasNext()){
			Coin key = keys.next();
			int value = coins.get(key);
			System.out.println(key.getAmount() + WON_FORMAT + value + EA_FORMAT);
		}
		System.out.println();
	}

	public static void printBalance(VendingMachine vendingMachine){
		System.out.println(BALANCE_FORMAT + vendingMachine.inputMoneyToString());
	}

	public static void printChangeCoins(LinkedHashMap<Coin, Integer> coins){
		System.out.println(CHANGES_FORMAT);
		Iterator<Coin> keys = coins.keySet().iterator();
		while (keys.hasNext()){
			Coin key = keys.next();
			int value = coins.get(key);
			if (value == 0){
				continue;
			}
			System.out.println(key.getAmount() + WON_FORMAT + value + EA_FORMAT);
		}
		System.out.println();
	}
}

