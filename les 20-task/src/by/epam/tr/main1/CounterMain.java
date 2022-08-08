package by.epam.tr.main1;

public class CounterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter counter = new Counter();
		counter.setCounter(50);
		counter.setStatus(true);
	
		CounterView view = new CounterView();
		view.printFirstCount(counter);
		
		int plus = 2150;
		int minus = 150;
		
		CounterLogic logic = new CounterLogic();
		logic.increase(counter, plus);
		
		view.printFirstCount(counter);
		counter.setStatus(false);
		logic.decrease(counter, minus);
}
}