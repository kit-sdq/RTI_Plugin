/**
 */
package edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.provider;


import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ConfirmAttributeOwnershipAcquisitionCancellationType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ConfirmAttributeOwnershipAcquisitionCancellationType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfirmAttributeOwnershipAcquisitionCancellationTypeItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfirmAttributeOwnershipAcquisitionCancellationTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIdtagPropertyDescriptor(object);
			addIsCallbackPropertyDescriptor(object);
			addIsUsedPropertyDescriptor(object);
			addNotesPropertyDescriptor(object);
			addSectionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Idtag feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdtagPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConfirmAttributeOwnershipAcquisitionCancellationType_idtag_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConfirmAttributeOwnershipAcquisitionCancellationType_idtag_feature", "_UI_ConfirmAttributeOwnershipAcquisitionCancellationType_type"),
				 OmtPackage.eINSTANCE.getConfirmAttributeOwnershipAcquisitionCancellationType_Idtag(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Callback feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsCallbackPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConfirmAttributeOwnershipAcquisitionCancellationType_isCallback_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConfirmAttributeOwnershipAcquisitionCancellationType_isCallback_feature", "_UI_ConfirmAttributeOwnershipAcquisitionCancellationType_type"),
				 OmtPackage.eINSTANCE.getConfirmAttributeOwnershipAcquisitionCancellationType_IsCallback(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Used feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsUsedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConfirmAttributeOwnershipAcquisitionCancellationType_isUsed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConfirmAttributeOwnershipAcquisitionCancellationType_isUsed_feature", "_UI_ConfirmAttributeOwnershipAcquisitionCancellationType_type"),
				 OmtPackage.eINSTANCE.getConfirmAttributeOwnershipAcquisitionCancellationType_IsUsed(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Notes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNotesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConfirmAttributeOwnershipAcquisitionCancellationType_notes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConfirmAttributeOwnershipAcquisitionCancellationType_notes_feature", "_UI_ConfirmAttributeOwnershipAcquisitionCancellationType_type"),
				 OmtPackage.eINSTANCE.getConfirmAttributeOwnershipAcquisitionCancellationType_Notes(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Section feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConfirmAttributeOwnershipAcquisitionCancellationType_section_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConfirmAttributeOwnershipAcquisitionCancellationType_section_feature", "_UI_ConfirmAttributeOwnershipAcquisitionCancellationType_type"),
				 OmtPackage.eINSTANCE.getConfirmAttributeOwnershipAcquisitionCancellationType_Section(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(OmtPackage.eINSTANCE.getConfirmAttributeOwnershipAcquisitionCancellationType_AnyAttribute());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ConfirmAttributeOwnershipAcquisitionCancellationType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ConfirmAttributeOwnershipAcquisitionCancellationType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ConfirmAttributeOwnershipAcquisitionCancellationType)object).getIdtag();
		return label == null || label.length() == 0 ?
			getString("_UI_ConfirmAttributeOwnershipAcquisitionCancellationType_type") :
			getString("_UI_ConfirmAttributeOwnershipAcquisitionCancellationType_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ConfirmAttributeOwnershipAcquisitionCancellationType.class)) {
			case OmtPackage.CONFIRM_ATTRIBUTE_OWNERSHIP_ACQUISITION_CANCELLATION_TYPE__IDTAG:
			case OmtPackage.CONFIRM_ATTRIBUTE_OWNERSHIP_ACQUISITION_CANCELLATION_TYPE__IS_CALLBACK:
			case OmtPackage.CONFIRM_ATTRIBUTE_OWNERSHIP_ACQUISITION_CANCELLATION_TYPE__IS_USED:
			case OmtPackage.CONFIRM_ATTRIBUTE_OWNERSHIP_ACQUISITION_CANCELLATION_TYPE__NOTES:
			case OmtPackage.CONFIRM_ATTRIBUTE_OWNERSHIP_ACQUISITION_CANCELLATION_TYPE__SECTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OmtPackage.CONFIRM_ATTRIBUTE_OWNERSHIP_ACQUISITION_CANCELLATION_TYPE__ANY_ATTRIBUTE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Hla_metamodelEditPlugin.INSTANCE;
	}

}