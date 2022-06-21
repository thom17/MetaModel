/**
 */
package SWVS.impl;

import SWVS.Actor;
import SWVS.Beverage;
import SWVS.Coffee;
import SWVS.Condition;
import SWVS.Customer;
import SWVS.Field;
import SWVS.Flow;
import SWVS.Function;
import SWVS.Method;
import SWVS.Project;
import SWVS.Requirement;
import SWVS.SWVSFactory;
import SWVS.SWVSPackage;
import SWVS.State;
import SWVS.Tea;
import SWVS.Tea_Back;
import SWVS.UseCase;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SWVSFactoryImpl extends EFactoryImpl implements SWVSFactory {
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SWVSFactory init() {
    try {
      SWVSFactory theSWVSFactory =
          (SWVSFactory) EPackage.Registry.INSTANCE.getEFactory(SWVSPackage.eNS_URI);
      if (theSWVSFactory != null) {
        return theSWVSFactory;
      }
    } catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SWVSFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SWVSFactoryImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass) {
    switch (eClass.getClassifierID()) {
      case SWVSPackage.PROJECT:
        return createProject();
      case SWVSPackage.REQUIREMENT:
        return createRequirement();
      case SWVSPackage.SYSTEM:
        return createSystem();
      case SWVSPackage.OBJECT:
        return createObject();
      case SWVSPackage.USE_CASE:
        return createUseCase();
      case SWVSPackage.FLOW:
        return createFlow();
      case SWVSPackage.ACTOR:
        return createActor();
      case SWVSPackage.CONDITION:
        return createCondition();
      case SWVSPackage.FUNCTION:
        return createFunction();
      case SWVSPackage.CLASS:
        return createClass();
      case SWVSPackage.FIELD:
        return createField();
      case SWVSPackage.BEVERAGE:
        return createBeverage();
      case SWVSPackage.COFFEE:
        return createCoffee();
      case SWVSPackage.TEA:
        return createTea();
      case SWVSPackage.TEA_BACK:
        return createTea_Back();
      case SWVSPackage.CUSTOMER:
        return createCustomer();
      case SWVSPackage.METHOD:
        return createMethod();
      case SWVSPackage.STATE:
        return createState();
      default:
        throw new IllegalArgumentException(
            "The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Project createProject() {
    ProjectImpl project = new ProjectImpl();
    return project;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Requirement createRequirement() {
    RequirementImpl requirement = new RequirementImpl();
    return requirement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SWVS.System createSystem() {
    SystemImpl system = new SystemImpl();
    return system;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SWVS.Object createObject() {
    ObjectImpl object = new ObjectImpl();
    return object;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UseCase createUseCase() {
    UseCaseImpl useCase = new UseCaseImpl();
    return useCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Flow createFlow() {
    FlowImpl flow = new FlowImpl();
    return flow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actor createActor() {
    ActorImpl actor = new ActorImpl();
    return actor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition createCondition() {
    ConditionImpl condition = new ConditionImpl();
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function createFunction() {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SWVS.Class createClass() {
    ClassImpl class_ = new ClassImpl();
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field createField() {
    FieldImpl field = new FieldImpl();
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Beverage createBeverage() {
    BeverageImpl beverage = new BeverageImpl();
    return beverage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Coffee createCoffee() {
    CoffeeImpl coffee = new CoffeeImpl();
    return coffee;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tea createTea() {
    TeaImpl tea = new TeaImpl();
    return tea;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tea_Back createTea_Back() {
    Tea_BackImpl tea_Back = new Tea_BackImpl();
    return tea_Back;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Customer createCustomer() {
    CustomerImpl customer = new CustomerImpl();
    return customer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method createMethod() {
    MethodImpl method = new MethodImpl();
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State createState() {
    StateImpl state = new StateImpl();
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SWVSPackage getSWVSPackage() {
    return (SWVSPackage) getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SWVSPackage getPackage() {
    return SWVSPackage.eINSTANCE;
  }

} //SWVSFactoryImpl
