/**
 */
package SWVS.provider;

import SWVS.Project;
import SWVS.SWVSFactory;
import SWVS.SWVSPackage;

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
 * This is the item provider adapter for a {@link SWVS.Project} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjectItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectItemProvider(AdapterFactory adapterFactory) {
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

			addProjectNamePropertyDescriptor(object);
			addObjListPropertyDescriptor(object);
			addFinDatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Project Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProjectNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Project_projectName_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Project_projectName_feature",
								"_UI_Project_type"),
						SWVSPackage.Literals.PROJECT__PROJECT_NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Obj List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObjListPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Project_objList_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Project_objList_feature",
								"_UI_Project_type"),
						SWVSPackage.Literals.PROJECT__OBJ_LIST, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Fin Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFinDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Project_finDate_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Project_finDate_feature",
								"_UI_Project_type"),
						SWVSPackage.Literals.PROJECT__FIN_DATE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(SWVSPackage.Literals.PROJECT__REQUIREMENT);
			childrenFeatures.add(SWVSPackage.Literals.PROJECT__SYSTEM);
			childrenFeatures.add(SWVSPackage.Literals.PROJECT__ACTOR);
			childrenFeatures.add(SWVSPackage.Literals.PROJECT__CLASS);
			childrenFeatures.add(SWVSPackage.Literals.PROJECT__OBJECT);
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
	 * This returns Project.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Project"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Project) object).getProjectName();
		return label == null || label.length() == 0 ? getString("_UI_Project_type")
				: getString("_UI_Project_type") + " " + label;
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

		switch (notification.getFeatureID(Project.class)) {
		case SWVSPackage.PROJECT__PROJECT_NAME:
		case SWVSPackage.PROJECT__FIN_DATE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case SWVSPackage.PROJECT__REQUIREMENT:
		case SWVSPackage.PROJECT__SYSTEM:
		case SWVSPackage.PROJECT__ACTOR:
		case SWVSPackage.PROJECT__CLASS:
		case SWVSPackage.PROJECT__OBJECT:
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

		newChildDescriptors.add(createChildParameter(SWVSPackage.Literals.PROJECT__REQUIREMENT,
				SWVSFactory.eINSTANCE.createRequirement()));

		newChildDescriptors
				.add(createChildParameter(SWVSPackage.Literals.PROJECT__SYSTEM, SWVSFactory.eINSTANCE.createSystem()));

		newChildDescriptors
				.add(createChildParameter(SWVSPackage.Literals.PROJECT__ACTOR, SWVSFactory.eINSTANCE.createActor()));

		newChildDescriptors
				.add(createChildParameter(SWVSPackage.Literals.PROJECT__CLASS, SWVSFactory.eINSTANCE.createClass()));

		newChildDescriptors
				.add(createChildParameter(SWVSPackage.Literals.PROJECT__OBJECT, SWVSFactory.eINSTANCE.createObject()));

		newChildDescriptors.add(
				createChildParameter(SWVSPackage.Literals.PROJECT__OBJECT, SWVSFactory.eINSTANCE.createRequirement()));

		newChildDescriptors
				.add(createChildParameter(SWVSPackage.Literals.PROJECT__OBJECT, SWVSFactory.eINSTANCE.createSystem()));

		newChildDescriptors
				.add(createChildParameter(SWVSPackage.Literals.PROJECT__OBJECT, SWVSFactory.eINSTANCE.createUseCase()));

		newChildDescriptors
				.add(createChildParameter(SWVSPackage.Literals.PROJECT__OBJECT, SWVSFactory.eINSTANCE.createFlow()));

		newChildDescriptors
				.add(createChildParameter(SWVSPackage.Literals.PROJECT__OBJECT, SWVSFactory.eINSTANCE.createActor()));

		newChildDescriptors
				.add(createChildParameter(SWVSPackage.Literals.PROJECT__OBJECT, SWVSFactory.eINSTANCE.createClass()));

		newChildDescriptors
				.add(createChildParameter(SWVSPackage.Literals.PROJECT__OBJECT, SWVSFactory.eINSTANCE.createField()));

		newChildDescriptors
				.add(createChildParameter(SWVSPackage.Literals.PROJECT__OBJECT, SWVSFactory.eINSTANCE.createMethod()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == SWVSPackage.Literals.PROJECT__REQUIREMENT
				|| childFeature == SWVSPackage.Literals.PROJECT__OBJECT
				|| childFeature == SWVSPackage.Literals.PROJECT__SYSTEM
				|| childFeature == SWVSPackage.Literals.PROJECT__ACTOR
				|| childFeature == SWVSPackage.Literals.PROJECT__CLASS;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SWVSEditPlugin.INSTANCE;
	}

}
