/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.provider;

import de.uka.ipd.sdq.identifier.provider.IdentifierEditPlugin;

import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.provider.ConfigurationrepresentationEditPlugin;

import edu.kit.kastel.sdq.coupling.models.codeql.provider.CodeqlEditPlugin;

import edu.kit.kastel.sdq.coupling.models.java.provider.JavaEditPlugin;

import org.dataflowanalysis.pcm.extension.dictionary.DataDictionary.provider.DataDictionaryEditPlugin;

import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.provider.DataDictionaryCharacterizedEditPlugin;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

/**
 * This is the central singleton for the Edfacodeqlcorrespondences edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class EdfacodeqlcorrespondencesEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EdfacodeqlcorrespondencesEditPlugin INSTANCE = new EdfacodeqlcorrespondencesEditPlugin();

	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdfacodeqlcorrespondencesEditPlugin() {
		super(new ResourceLocator[] { CodeqlEditPlugin.INSTANCE, ConfigurationrepresentationEditPlugin.INSTANCE,
				DataDictionaryEditPlugin.INSTANCE, DataDictionaryCharacterizedEditPlugin.INSTANCE,
				IdentifierEditPlugin.INSTANCE,
				edu.kit.kastel.sdq.coupling.models.identifier.provider.IdentifierEditPlugin.INSTANCE,
				JavaEditPlugin.INSTANCE, });
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipsePlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}
	}

}
