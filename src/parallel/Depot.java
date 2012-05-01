package parallel;

public interface Depot {
	public abstract boolean tryAcquire();
	public abstract void release();
	
} // end of class Depot
