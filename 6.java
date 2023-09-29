package guvi;

import java.util.Scanner;

public class HotelTariff {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m, d;
		float r, total;
		m = sc.nextInt();
		r = sc.nextFloat();
		d = sc.nextInt();
		switch (m) {
		case 1:
		case 2:
		case 3:
			total = r * d;
			System.out.println("Hotel tariff:RS." + total);
			break;
		case 4:
		case 5:
		case 6:
			total = r * d;
			total += 0.2 * total;
			System.out.println("Hotel Tariff RS." + total);
			break;
		case 7:
		case 8:
		case 9:
		case 10:
			total = r * d;
			System.out.println("Hotel Tariff: rs." + total);
			break;
		case 11:
		case 12:
			total = r * d;
			total += 0.2 * total;
			System.out.println("Hotel Tariff: rs.\"+total");
			break;
		default:
			System.out.println("invalid input");
		}
	}
}
