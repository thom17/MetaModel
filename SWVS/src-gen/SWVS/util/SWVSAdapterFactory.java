/**
 */
package SWVS.util;

import SWVS.Actor;
import SWVS.Beverage;
import SWVS.Coffee;
import SWVS.Condition;
import SWVS.Customer;
import SWVS.Field;
import SWVS.Flow;
import SWVS.Function;
import SWVS.MClass;
import SWVS.MMethod;
import SWVS.MObject;
import SWVS.MSystem;
import SWVS.Project;
import SWVS.Requirement;
import SWVS.SWVSPackage;
import SWVS.State;
import SWVS.Tea;
import SWVS.Tea_Back;
import SWVS.UseCase;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see SWVS.SWVSPackage
 * @generated
 */
public class SWVSAdapterFactory extends AdapterFactoryImpl {
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SWVSPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SWVSAdapterFactory() {
    if (modelPackage == null) {
      modelPackage = SWVSPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object) {
    if (object == modelPackage) {
      return true;
    }
    if (object instanceof EObject) {
      return ((EObject) object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SWVSSwitch<Adapter> modelSwitch = new SWVSSwitch<Adapter>() {
    @Override
    public Adapter caseProject(Project object) {
      return createProjectAdapter();
    }

    @Override
    public Adapter caseRequirement(Requirement object) {
      return createRequirementAdapter();
    }

    @Override
    public Adapter caseMSystem(MSystem object) {
      return createMSystemAdapter();
    }

    @Override
    public Adapter caseMObject(MObject object) {
      return createMObjectAdapter();
    }

    @Override
    public Adapter caseUseCase(UseCase object) {
      return createUseCaseAdapter();
    }

    @Override
    public Adapter caseFlow(Flow object) {
      return createFlowAdapter();
    }

    @Override
    public Adapter caseActor(Actor object) {
      return createActorAdapter();
    }

    @Override
    public Adapter caseCondition(Condition object) {
      return createConditionAdapter();
    }

    @Override
    public Adapter caseFunction(Function object) {
      return createFunctionAdapter();
    }

    @Override
    public Adapter caseMClass(MClass object) {
      return createMClassAdapter();
    }

    @Override
    public Adapter caseField(Field object) {
      return createFieldAdapter();
    }

    @Override
    public Adapter caseBeverage(Beverage object) {
      return createBeverageAdapter();
    }

    @Override
    public Adapter caseCoffee(Coffee object) {
      return createCoffeeAdapter();
    }

    @Override
    public Adapter caseTea(Tea object) {
      return createTeaAdapter();
    }

    @Override
    public Adapter caseTea_Back(Tea_Back object) {
      return createTea_BackAdapter();
    }

    @Override
    public Adapter caseCustomer(Customer object) {
      return createCustomerAdapter();
    }

    @Override
    public Adapter caseMMethod(MMethod object) {
      return createMMethodAdapter();
    }

    @Override
    public Adapter caseState(State object) {
      return createStateAdapter();
    }

    @Override
    public Adapter caseObject(SWVS.Object object) {
      return createObjectAdapter();
    }

    @Override
    public Adapter defaultCase(EObject object) {
      return createEObjectAdapter();
    }
  };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target) {
    return modelSwitch.doSwitch((EObject) target);
  }


  /**
   * Creates a new adapter for an object of class '{@link SWVS.Project <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see SWVS.Project
   * @generated
   */
  public Adapter createProjectAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link SWVS.Requirement <em>Requirement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see SWVS.Requirement
   * @generated
   */
  public Adapter createRequirementAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link SWVS.MSystem <em>MSystem</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see SWVS.MSystem
   * @generated
   */
  public Adapter createMSystemAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link SWVS.MObject <em>MObject</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see SWVS.MObject
   * @generated
   */
  public Adapter createMObjectAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link SWVS.UseCase <em>Use Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see SWVS.UseCase
   * @generated
   */
  public Adapter createUseCaseAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link SWVS.Flow <em>Flow</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see SWVS.Flow
   * @generated
   */
  public Adapter createFlowAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link SWVS.Actor <em>Actor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see SWVS.Actor
   * @generated
   */
  public Adapter createActorAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link SWVS.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see SWVS.Condition
   * @generated
   */
  public Adapter createConditionAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link SWVS.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see SWVS.Function
   * @generated
   */
  public Adapter createFunctionAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link SWVS.MClass <em>MClass</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see SWVS.MClass
   * @generated
   */
  public Adapter createMClassAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link SWVS.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see SWVS.Field
   * @generated
   */
  public Adapter createFieldAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link SWVS.Beverage <em>Beverage</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see SWVS.Beverage
   * @generated
   */
  public Adapter createBeverageAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link SWVS.Coffee <em>Coffee</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see SWVS.Coffee
   * @generated
   */
  public Adapter createCoffeeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link SWVS.Tea <em>Tea</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see SWVS.Tea
   * @generated
   */
  public Adapter createTeaAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link SWVS.Tea_Back <em>Tea Back</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see SWVS.Tea_Back
   * @generated
   */
  public Adapter createTea_BackAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link SWVS.Customer <em>Customer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see SWVS.Customer
   * @generated
   */
  public Adapter createCustomerAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link SWVS.MMethod <em>MMethod</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see SWVS.MMethod
   * @generated
   */
  public Adapter createMMethodAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link SWVS.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see SWVS.State
   * @generated
   */
  public Adapter createStateAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link SWVS.Object <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see SWVS.Object
   * @generated
   */
  public Adapter createObjectAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter() {
    return null;
  }

} //SWVSAdapterFactory
