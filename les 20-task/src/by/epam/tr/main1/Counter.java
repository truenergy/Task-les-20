package by.epam.tr.main1;

import java.util.Objects;

public class Counter {
	private long counter;
	final long from;
	final long to;
	boolean status;

	public Counter() {
		counter = 0;
		from = 0;
		to = 999;
		status = false;

	}

	public Counter(long from, long to, long current, boolean status) {
		this.from = from;
		this.to = to;
		current = this.counter;
		this.status = status;
	}

	public long getCounter() {
		return counter;
	}

	public void setCounter(long counter) {
		this.counter = counter;
	}

	public long getFrom() {
		return from;
	}

	public long getTo() {
		return to;
	}
	

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		return Objects.hash(counter, from, status, to);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Counter other = (Counter) obj;
		return counter == other.counter && from == other.from && status == other.status && to == other.to;
	}

	@Override
	public String toString() {
		return "Counter [counter=" + counter + ", from=" + from + ", to=" + to + ", status=" + status + "]";
	}

	

}
