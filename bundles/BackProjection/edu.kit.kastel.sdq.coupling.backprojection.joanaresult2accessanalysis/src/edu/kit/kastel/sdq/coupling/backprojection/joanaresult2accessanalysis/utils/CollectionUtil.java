package edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.utils;

import java.util.Collection;

public class CollectionUtil {
	public static <T> boolean containsAny(Collection<T> ifContaining, Collection<T> testAgainst) {
		for (T elementToTest : testAgainst) {
			if (ifContaining.contains(elementToTest)) {
				return true;
			}
		}

		return false;
	}
}
