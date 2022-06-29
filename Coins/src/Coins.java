
public class Coins {

	public static void main(String[] args) {
		double cost = 13.58;
		double payment = 20;
		double changeDue = (payment - cost) * 100;
		boolean enoughChange = true;
		System.out.println("Total change due is:" + changeDue);

		while (enoughChange) {

			if (changeDue >= 2000) {
				changeDue = changeDue - 2000;
				System.out.println("£20 note given" + changeDue / 100);
			} else if (changeDue >= 1000) {
				changeDue = changeDue - 1000;
				System.out.println("£10 note given £" + changeDue / 100 + " is left");
			} else if (changeDue >= 500) {
				changeDue = changeDue - 500;
				System.out.println("£5 note given £" + changeDue / 100 + " is left");
			} else if (changeDue >= 100) {
				changeDue = changeDue - 100;
				System.out.println("£1 coin given £" + changeDue / 100 + " is left");
			} else if (changeDue >= 50) {
				changeDue = changeDue - 50;
				System.out.println("50p coin given £" + changeDue / 100 + " is left");
			} else if (changeDue >= 20) {

				changeDue = changeDue - 20;
				System.out.println("20p coin given £" + changeDue / 100 + " is left");
			} else if (changeDue >= 10) {

				changeDue = changeDue - 10;
				System.out.println("10p coin given £" + changeDue / 100 + " is left");
			} else if (changeDue >= 5) {

				changeDue = changeDue - 5;
				System.out.println("5p coin given £" + changeDue / 100 + " is left");

			} else if (changeDue >= 2) {

				changeDue = changeDue - 2;
				System.out.println("2p coin given £" + changeDue / 100 + " is left");
			} else if (changeDue >= 1) {
				changeDue = changeDue - 1;
				System.out.println(changeDue);
				System.out.println("1p coin given £" + changeDue + " is left");
			}

			if (changeDue == 0 || changeDue < 0.001) {
				enoughChange = false;
			}
		}
	}
}
