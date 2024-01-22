package edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis.utils;

public class Tuple<K,V> {

	private K first;
	private V second;
	
	public Tuple(K first, V second) {
		super();
		this.first = first;
		this.second = second;
	}

	public K getFirst() {
		return first;
	}

	public void setFirst(K first) {
		this.first = first;
	}

	public V getSecond() {
		return second;
	}

	public void setSecond(V second) {
		this.second = second;
	}
}
