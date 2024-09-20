package edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.util;

public class Triple<K,V, E> extends Tuple<K, V> {

	private E third; 
	
	public Triple(K first, V second, E third) {
		super(first, second);
		this.third = third;
	}

	public E getThird() {
		return third;
	}

	public void setThird(E third) {
		this.third = third;
	}
	
	
	
	

}
