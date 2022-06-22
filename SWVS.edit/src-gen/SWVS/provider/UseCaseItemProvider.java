/**
 */
package SWVS.provider;

import SWVS.SWVSFactory;
import SWVS.SWVSPackage;
import SWVS.UseCase;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link SWVS.UseCase} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UseCaseItemProvider extends MObjectItemProvider {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UseCaseItemProvider(AdapterFactory adapterFactory) {
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

      addContextPropertyDescriptor(object);
      addActActorsPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Context feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addContextPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_UseCase_context_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_UseCase_context_feature",
            "_UI_UseCase_type"),
        SWVSPackage.Literals.USE_CASE__CONTEXT, true, false, false,
        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Act Actors feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addActActorsPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_UseCase_actActors_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_UseCase_actActors_feature",
            "_UI_UseCase_type"),
        SWVSPackage.Literals.USE_CASE__ACT_ACTORS, true, false, true, null, null, null));
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
      childrenFeatures.add(SWVSPackage.Literals.USE_CASE__EXTEND);
      childrenFeatures.add(SWVSPackage.Literals.USE_CASE__INCLUDE);
      childrenFeatures.add(SWVSPackage.Literals.USE_CASE__FLOWS);
      childrenFeatures.add(SWVSPackage.Literals.USE_CASE__CONDITION);
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
   * This returns UseCase.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/UseCase"));
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
    String label = ((UseCase) object).getId();
    return label == null || label.length() == 0 ? getString("_UI_UseCase_type")
        : getString("_UI_UseCase_type") + " " + label;
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

    switch (notification.getFeatureID(UseCase.class)) {
      case SWVSPackage.USE_CASE__CONTEXT:
        fireNotifyChanged(
            new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
      case SWVSPackage.USE_CASE__EXTEND:
      case SWVSPackage.USE_CASE__INCLUDE:
      case SWVSPackage.USE_CASE__FLOWS:
      case SWVSPackage.USE_CASE__CONDITION:
        fireNotifyChanged(
            new ViewerNotification(notification, notification.getNotifier(), true, false));
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

    newChildDescriptors.add(createChildParameter(SWVSPackage.Literals.USE_CASE__EXTEND,
        SWVSFactory.eINSTANCE.createUseCase()));

    newChildDescriptors.add(createChildParameter(SWVSPackage.Literals.USE_CASE__INCLUDE,
        SWVSFactory.eINSTANCE.createUseCase()));

    newChildDescriptors.add(createChildParameter(SWVSPackage.Literals.USE_CASE__FLOWS,
        SWVSFactory.eINSTANCE.createFlow()));

    newChildDescriptors.add(createChildParameter(SWVSPackage.Literals.USE_CASE__CONDITION,
        SWVSFactory.eINSTANCE.createCondition()));
  }

  /**
   * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCreateChildText(Object owner, Object feature, Object child,
      Collection<?> selection) {
    Object childFeature = feature;
    Object childObject = child;

    boolean qualify = childFeature == SWVSPackage.Literals.USE_CASE__EXTEND
        || childFeature == SWVSPackage.Literals.USE_CASE__INCLUDE;

    if (qualify) {
      return getString("_UI_CreateChild_text2", new Object[] {getTypeText(childObject),
          getFeatureText(childFeature), getTypeText(owner)});
    }
    return super.getCreateChildText(owner, feature, child, selection);
  }

}
