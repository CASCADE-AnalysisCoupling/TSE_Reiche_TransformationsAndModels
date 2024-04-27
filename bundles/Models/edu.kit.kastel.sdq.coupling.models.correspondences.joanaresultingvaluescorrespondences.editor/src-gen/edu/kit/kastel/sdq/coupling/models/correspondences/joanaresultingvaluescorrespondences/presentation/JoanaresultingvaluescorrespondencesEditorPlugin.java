/**
 */
package edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.presentation;

import edu.kit.kastel.sdq.coupling.models.identifier.provider.IdentifierEditPlugin;

import edu.kit.kastel.sdq.coupling.models.java.provider.JavaEditPlugin;

import edu.kit.kastel.sdq.coupling.models.joana.provider.JoanaEditPlugin;

import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.provider.JoanaresultingvaluesEditPlugin;

import edu.kit.kastel.sdq.coupling.models.joanascar.provider.JoanascarEditPlugin;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.ui.EclipseUIPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

/**
 * This is the central singleton for the Joanaresultingvaluescorrespondences editor plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class JoanaresultingvaluescorrespondencesEditorPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final JoanaresultingvaluescorrespondencesEditorPlugin INSTANCE = new JoanaresultingvaluescorrespondencesEditorPlugin();

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
	public JoanaresultingvaluescorrespondencesEditorPlugin() {
		super(new ResourceLocator[] { IdentifierEditPlugin.INSTANCE, JavaEditPlugin.INSTANCE, JoanaEditPlugin.INSTANCE,
				JoanaresultingvaluesEditPlugin.INSTANCE, JoanascarEditPlugin.INSTANCE, });
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
	public static class Implementation extends EclipseUIPlugin {
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
