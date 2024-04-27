package edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.util;

import java.util.Collection;
import java.util.stream.Collectors;

import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.EntryPointCorrespondence;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.FieldCorrespondence;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JOANASCARCorrespondences;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JoanascarcorrespondencesFactory;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.LevelCorrespondence;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.ParameterCorrespondence;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.SystemElementCorrespondence;
import edu.kit.kastel.sdq.coupling.models.java.members.Field;
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;
import edu.kit.kastel.sdq.coupling.models.joana.EntryPoint;
import edu.kit.kastel.sdq.coupling.models.joana.Level;
import edu.kit.kastel.sdq.coupling.models.joanascar.EntryPointIdentifying;
import edu.kit.kastel.sdq.coupling.models.joanascar.FieldIdentifying;
import edu.kit.kastel.sdq.coupling.models.joanascar.Level_SCAR;
import edu.kit.kastel.sdq.coupling.models.joanascar.ParameterIdentifying;

public class JOANASCARCorrespondenceUtil {
	public static JOANASCARCorrespondences createSCARCorrespondences() {
		return JoanascarcorrespondencesFactory.eINSTANCE.createJOANASCARCorrespondences();
	}
	
	public static FieldCorrespondence createCorrespondence(Field field_JAVA, FieldIdentifying field_SCAR) {
		FieldCorrespondence corr = JoanascarcorrespondencesFactory.eINSTANCE.createFieldCorrespondence();
		corr.setField_JAVA(field_JAVA);
		corr.setField_SCAR(field_SCAR);
		return corr;
	}
	
	public static ParameterCorrespondence createCorrespondence(Parameter parameter_JAVA, ParameterIdentifying parameter_SCAR) {
		ParameterCorrespondence corr = JoanascarcorrespondencesFactory.eINSTANCE.createParameterCorrespondence();
		corr.setParameter_JAVA(parameter_JAVA);
		corr.setParameter_SCAR(parameter_SCAR);
		return corr;
	}
	
	public static LevelCorrespondence createCorrespondence(Level securityLevel_JOANA, Level_SCAR securityLevel_SCAR) {
		LevelCorrespondence corr = JoanascarcorrespondencesFactory.eINSTANCE.createLevelCorrespondence();
		corr.setLevel_JOANA(securityLevel_JOANA);
		corr.setLevel_SCAR(securityLevel_SCAR);
		return corr;
	}
	
	public static EntryPointCorrespondence createCorrespondence(EntryPoint entryPoint_JOANA, EntryPointIdentifying entryPoint_SCAR) {
		EntryPointCorrespondence corr = JoanascarcorrespondencesFactory.eINSTANCE.createEntryPointCorrespondence();
		corr.setEntryPoint_JOANA(entryPoint_JOANA);
		corr.setEntryPoint_SCAR(entryPoint_SCAR);
		return corr;
	}
	
	
	
	public static boolean correspondenceExists(Field field, JOANASCARCorrespondences correspondences) {
		return getFieldCorrespondences(correspondences.getSystemElementCorrespondences()).stream().anyMatch(correspondence -> correspondence.getField_JAVA().equals(field));
	}
	
	public static boolean correspondenceExists(FieldIdentifying field, JOANASCARCorrespondences correspondences) {
		return getFieldCorrespondences(correspondences.getSystemElementCorrespondences()).stream().anyMatch(correspondence -> correspondence.getField_SCAR().equals(field));
	}

	public static boolean correspondenceExists(Parameter parameter, JOANASCARCorrespondences correspondences) {
		return getParameterCorrespondences(correspondences.getSystemElementCorrespondences()).stream().anyMatch(correspondence -> correspondence.getParameter_JAVA().equals(parameter));
	}
	
	public static boolean correspondenceExists(ParameterIdentifying parameter, JOANASCARCorrespondences correspondences) {
		return getParameterCorrespondences(correspondences.getSystemElementCorrespondences()).stream().anyMatch(correspondence -> correspondence.getParameter_SCAR().equals(parameter));
	}
	
	public static boolean correspondenceExists(Level securityLevel, JOANASCARCorrespondences correspondences) {
		return correspondences.getLevelCorrespondences().stream().anyMatch(correspondence -> correspondence.getLevel_JOANA().equals(securityLevel));
	}
	
	public static boolean correspondenceExists(EntryPoint entryPoint_JOANA, JOANASCARCorrespondences correspondences) {
		return correspondences.getEntryPointCorrespondences().stream().anyMatch(correspondence -> correspondence.getEntryPoint_JOANA().equals(entryPoint_JOANA));
	}
	
	public static boolean correspondenceExists(EntryPointIdentifying entryPoint_SCAR, JOANASCARCorrespondences correspondences) {
		return correspondences.getEntryPointCorrespondences().stream().anyMatch(correspondence -> correspondence.getEntryPoint_SCAR().getTag().equals(entryPoint_SCAR.getTag()));
	}
	
	public static boolean correspondenceExists(Level_SCAR securityLevel, JOANASCARCorrespondences correspondences) {
		return correspondences.getLevelCorrespondences().stream().anyMatch(correspondence -> correspondence.getLevel_JOANA().equals(securityLevel));
	}
	
	public static boolean correspondenceExists(Level securityLevel, Level_SCAR securityLevelScar, JOANASCARCorrespondences correspondences){
		return correspondences.getLevelCorrespondences().stream().anyMatch(correspondence -> {return correspondence.getLevel_SCAR().equals(securityLevelScar) && correspondence.getLevel_JOANA().equals(securityLevel);});
	}
	
	public static boolean correspondenceExists(Field field, FieldIdentifying fieldScar, JOANASCARCorrespondences correspondences){
		return getFieldCorrespondences(correspondences.getSystemElementCorrespondences()).stream().anyMatch(correspondence -> {return correspondence.getField_SCAR().equals(fieldScar) && correspondence.getField_JAVA().equals(field);});
	}
	
	public static boolean correspondenceExists(Parameter parameter, ParameterIdentifying parameterScar, JOANASCARCorrespondences correspondences){
		return getParameterCorrespondences(correspondences.getSystemElementCorrespondences()).stream().anyMatch(correspondence -> {return correspondence.getParameter_SCAR().equals(parameterScar) && correspondence.getParameter_JAVA().equals(parameter);});
	}
	
	public static boolean correspondenceExists(EntryPoint entryPoint_JOANA, EntryPointIdentifying entryPoint_SCAR, JOANASCARCorrespondences correspondences){
		return correspondences.getEntryPointCorrespondences().stream().anyMatch(correspondence -> {return correspondence.getEntryPoint_SCAR().getTag().equals(entryPoint_SCAR.getTag()) && correspondence.getEntryPoint_JOANA().equals(entryPoint_JOANA);});
	}
	
	
	
	public static Collection<FieldCorrespondence> getFieldCorrespondences(Collection<SystemElementCorrespondence> systemElementCorrespondences){
		return systemElementCorrespondences.stream().filter(FieldCorrespondence.class::isInstance).map(FieldCorrespondence.class::cast).collect(Collectors.toList());
	}
	
	public static Collection<ParameterCorrespondence> getParameterCorrespondences(Collection<SystemElementCorrespondence> systemElementCorrespondences){
		return systemElementCorrespondences.stream().filter(ParameterCorrespondence.class::isInstance).map(ParameterCorrespondence.class::cast).collect(Collectors.toList());
	}
	
	public static void createAndAddIfCorrespondenceNotExists(Level securityLevel, Level_SCAR securityLevelScar, JOANASCARCorrespondences correspondences) {
		if(!correspondenceExists(securityLevel,securityLevelScar, correspondences)) {
			correspondences.getLevelCorrespondences().add(createCorrespondence(securityLevel, securityLevelScar));
		}
	}
	
	public static void createAndAddIfCorrespondenceNotExists(Field field, FieldIdentifying fieldScar, JOANASCARCorrespondences correspondences) {
		if(!correspondenceExists(field, fieldScar, correspondences)) {
			correspondences.getSystemElementCorrespondences().add(createCorrespondence(field, fieldScar));
		}
	}
	
	public static void createAndAddIfCorrespondenceNotExists(Parameter parameter, ParameterIdentifying parameterScar, JOANASCARCorrespondences correspondences) {
		if(!correspondenceExists(parameter, parameterScar, correspondences)) {
			correspondences.getSystemElementCorrespondences().add(createCorrespondence(parameter, parameterScar));
		}
	}
	
	public static void createAndAddIfCorrespondenceNotExists(EntryPoint entryPoint, EntryPointIdentifying entryPoint_SCAR, JOANASCARCorrespondences correspondences) {
		if(!correspondenceExists(entryPoint, entryPoint_SCAR, correspondences)) {
			correspondences.getEntryPointCorrespondences().add(createCorrespondence(entryPoint, entryPoint_SCAR));
		}
	}
	
	public static EntryPoint getCorresponding(EntryPointIdentifying entryPoint_SCAR, JOANASCARCorrespondences correspondences) {
		return correspondences.getEntryPointCorrespondences().stream().filter(correspondence -> correspondence.getEntryPoint_SCAR().equals(entryPoint_SCAR)).findFirst().get().getEntryPoint_JOANA();
	}

	public static Parameter getCorresponding(ParameterIdentifying parameter_SCAR,
			JOANASCARCorrespondences correspondences) {
		return getParameterCorrespondences(correspondences.getSystemElementCorrespondences()).stream().filter(correspondence -> correspondence.getParameter_SCAR().equals(parameter_SCAR)).findFirst().get().getParameter_JAVA();
	}
}
