package edu.kit.kastel.sdq.coupling.alignment.generation.javacodegenerator.utils;

public class Filter {
	public static final String OBJECT_MARKER = "Object";
	public static final String ARRAY_MARKER = "_Array";
	public static final String INTERFACE_MARKER = "_I";
	public static final String CLASS_MARKER = "_C";
	public static final String PRIMITIVE_MARKER = "_P";
	public static final String REMOTE_CLASS_MARKER = "_R";

	public static boolean checkFilterList(String name) {

		return name.equals(OBJECT_MARKER) || name.contains(ARRAY_MARKER) || name.contains(INTERFACE_MARKER) ||
			name.contains(CLASS_MARKER) || name.contains(PRIMITIVE_MARKER) || name.contains(REMOTE_CLASS_MARKER);

	}
}
