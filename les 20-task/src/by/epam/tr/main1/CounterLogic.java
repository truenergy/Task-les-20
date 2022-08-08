package by.epam.tr.main1;

public class CounterLogic {

	public void increase(Counter counter, int amount) {
		if (counter.isStatus() == false) {
			System.out.println("turn on the counter");
		} else {

			long current = counter.getCounter() + amount;

			long current1 = counter.getCounter();
			for (long i = counter.getCounter(); i <= current; i++) {
				current1++;
			}
			int sum = 0;
			if (current1 > counter.getTo()) {
				while (current1 > counter.getTo()) {
					current1 = current1 - counter.getTo();
					sum++;
				}
			}

			counter.setCounter(current1);
			if (sum == 0) {
				System.out.println("present value " + counter.getCounter());
			} else {
				System.out.println("present value " + counter.getCounter() + ", counter reset: " + sum + "times");
			}
		}
	}

	public void decrease(Counter counter, int amount) {
		if (counter.isStatus() == false) {
			System.out.println("turn on the counter");
		} else {
			long current = counter.getCounter() - amount;

			long current1 = counter.getCounter();
			for (long i = counter.getCounter(); i > current; i--) {
				current1--;
			}

			int sum = 0;
			if (current1 < counter.getFrom()) {
				while (current1 < counter.getFrom()) {
					current1 = counter.getTo() - current1;
					sum++;
				}
			}

			counter.setCounter(current1);
			if (sum == 0) {
				System.out.println("present value " + counter.getCounter());
			} else {
				System.out.println("present value " + counter.getCounter() + ", counter reset: " + sum + "times");
			}
		}
	}
}
