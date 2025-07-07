/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.provider;

import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.provider.ConfigurationrepresentationEditPlugin;

import edu.kit.kastel.sdq.coupling.models.identifier.provider.IdentifierEditPlugin;

import edu.kit.kastel.sdq.coupling.models.java.provider.JavaEditPlugin;

import edu.kit.kastel.sdq.coupling.models.joana.provider.JoanaEditPlugin;

import edu.kit.kastel.sdq.coupling.models.joanascar.provider.JoanascarEditPlugin;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

/**
 * This is the central singleton for the Joanascarcorrespondences edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class JoanascarcorrespondencesEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final JoanascarcorrespondencesEditPlugin INSTANCE = new JoanascarcorrespondencesEditPlugin();

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
	public JoanascarcorrespondencesEditPlugin() {
		super(new ResourceLocator[] { ConfigurationrepresentationEditPlugin.INSTANCE, IdentifierEditPlugin.INSTANCE,
				JavaEditPlugin.INSTANCE, JoanaEditPlugin.INSTANCE, JoanascarEditPlugin.INSTANCE, });
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
