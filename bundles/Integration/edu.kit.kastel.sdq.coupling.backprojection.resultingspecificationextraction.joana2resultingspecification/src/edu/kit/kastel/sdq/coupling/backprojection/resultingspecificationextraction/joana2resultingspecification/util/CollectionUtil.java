package edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.util;

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
