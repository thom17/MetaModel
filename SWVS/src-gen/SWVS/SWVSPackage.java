/**
 */
package SWVS;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see SWVS.SWVSFactory
 * @model kind="package"
 * @generated
 */
public interface SWVSPackage extends EPackage {
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "SWVS";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.example.org/sWVS";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "sWVS";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SWVSPackage eINSTANCE = SWVS.impl.SWVSPackageImpl.init();

  /**
   * The meta object id for the '{@link SWVS.impl.ProjectImpl <em>Project</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see SWVS.impl.ProjectImpl
   * @see SWVS.impl.SWVSPackageImpl#getProject()
   * @generated
   */
  int PROJECT = 0;

  /**
   * The feature id for the '<em><b>Project Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__PROJECT_NAME = 0;

  /**
   * The feature id for the '<em><b>Requirement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__REQUIREMENT = 1;

  /**
   * The feature id for the '<em><b>Systems</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__SYSTEMS = 2;

  /**
   * The feature id for the '<em><b>Actor List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__ACTOR_LIST = 3;

  /**
   * The feature id for the '<em><b>Class List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__CLASS_LIST = 4;

  /**
   * The feature id for the '<em><b>MObjects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__MOBJECTS = 5;

  /**
   * The feature id for the '<em><b>Objects</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__OBJECTS = 6;

  /**
   * The feature id for the '<em><b>Fin Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__FIN_DATE = 7;

  /**
   * The number of structural features of the '<em>Project</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_FEATURE_COUNT = 8;

  /**
   * The number of operations of the '<em>Project</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link SWVS.impl.MObjectImpl <em>MObject</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see SWVS.impl.MObjectImpl
   * @see SWVS.impl.SWVSPackageImpl#getMObject()
   * @generated
   */
  int MOBJECT = 3;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBJECT__ID = 0;

  /**
   * The feature id for the '<em><b>Data base Src Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBJECT__DATA_BASE_SRC_NAME = 1;

  /**
   * The feature id for the '<em><b>Object Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBJECT__OBJECT_TYPE = 2;

  /**
   * The feature id for the '<em><b>File Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBJECT__FILE_PATH = 3;

  /**
   * The feature id for the '<em><b>Added Object</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBJECT__ADDED_OBJECT = 4;

  /**
   * The feature id for the '<em><b>Implement Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBJECT__IMPLEMENT_NAME = 5;

  /**
   * The feature id for the '<em><b>Object Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBJECT__OBJECT_NAME = 6;

  /**
   * The feature id for the '<em><b>Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBJECT__REQUIREMENTS = 7;

  /**
   * The number of structural features of the '<em>MObject</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBJECT_FEATURE_COUNT = 8;

  /**
   * The number of operations of the '<em>MObject</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBJECT_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link SWVS.impl.RequirementImpl <em>Requirement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see SWVS.impl.RequirementImpl
   * @see SWVS.impl.SWVSPackageImpl#getRequirement()
   * @generated
   */
  int REQUIREMENT = 1;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__ID = MOBJECT__ID;

  /**
   * The feature id for the '<em><b>Data base Src Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__DATA_BASE_SRC_NAME = MOBJECT__DATA_BASE_SRC_NAME;

  /**
   * The feature id for the '<em><b>Object Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__OBJECT_TYPE = MOBJECT__OBJECT_TYPE;

  /**
   * The feature id for the '<em><b>File Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__FILE_PATH = MOBJECT__FILE_PATH;

  /**
   * The feature id for the '<em><b>Added Object</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__ADDED_OBJECT = MOBJECT__ADDED_OBJECT;

  /**
   * The feature id for the '<em><b>Implement Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__IMPLEMENT_NAME = MOBJECT__IMPLEMENT_NAME;

  /**
   * The feature id for the '<em><b>Object Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__OBJECT_NAME = MOBJECT__OBJECT_NAME;

  /**
   * The feature id for the '<em><b>Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__REQUIREMENTS = MOBJECT__REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Contents</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__CONTENTS = MOBJECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rq Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__RQ_TYPE = MOBJECT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Department</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__DEPARTMENT = MOBJECT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Requirement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT_FEATURE_COUNT = MOBJECT_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>Requirement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT_OPERATION_COUNT = MOBJECT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link SWVS.impl.MSystemImpl <em>MSystem</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see SWVS.impl.MSystemImpl
   * @see SWVS.impl.SWVSPackageImpl#getMSystem()
   * @generated
   */
  int MSYSTEM = 2;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSYSTEM__ID = MOBJECT__ID;

  /**
   * The feature id for the '<em><b>Data base Src Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSYSTEM__DATA_BASE_SRC_NAME = MOBJECT__DATA_BASE_SRC_NAME;

  /**
   * The feature id for the '<em><b>Object Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSYSTEM__OBJECT_TYPE = MOBJECT__OBJECT_TYPE;

  /**
   * The feature id for the '<em><b>File Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSYSTEM__FILE_PATH = MOBJECT__FILE_PATH;

  /**
   * The feature id for the '<em><b>Added Object</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSYSTEM__ADDED_OBJECT = MOBJECT__ADDED_OBJECT;

  /**
   * The feature id for the '<em><b>Implement Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSYSTEM__IMPLEMENT_NAME = MOBJECT__IMPLEMENT_NAME;

  /**
   * The feature id for the '<em><b>Object Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSYSTEM__OBJECT_NAME = MOBJECT__OBJECT_NAME;

  /**
   * The feature id for the '<em><b>Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSYSTEM__REQUIREMENTS = MOBJECT__REQUIREMENTS;

  /**
   * The feature id for the '<em><b>System Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSYSTEM__SYSTEM_TYPE = MOBJECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Usecase</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSYSTEM__USECASE = MOBJECT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Def Class</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSYSTEM__DEF_CLASS = MOBJECT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSYSTEM__STATES = MOBJECT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>MSystem</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSYSTEM_FEATURE_COUNT = MOBJECT_FEATURE_COUNT + 4;

  /**
   * The number of operations of the '<em>MSystem</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSYSTEM_OPERATION_COUNT = MOBJECT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link SWVS.impl.UseCaseImpl <em>Use Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see SWVS.impl.UseCaseImpl
   * @see SWVS.impl.SWVSPackageImpl#getUseCase()
   * @generated
   */
  int USE_CASE = 4;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__ID = MOBJECT__ID;

  /**
   * The feature id for the '<em><b>Data base Src Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__DATA_BASE_SRC_NAME = MOBJECT__DATA_BASE_SRC_NAME;

  /**
   * The feature id for the '<em><b>Object Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__OBJECT_TYPE = MOBJECT__OBJECT_TYPE;

  /**
   * The feature id for the '<em><b>File Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__FILE_PATH = MOBJECT__FILE_PATH;

  /**
   * The feature id for the '<em><b>Added Object</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__ADDED_OBJECT = MOBJECT__ADDED_OBJECT;

  /**
   * The feature id for the '<em><b>Implement Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__IMPLEMENT_NAME = MOBJECT__IMPLEMENT_NAME;

  /**
   * The feature id for the '<em><b>Object Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__OBJECT_NAME = MOBJECT__OBJECT_NAME;

  /**
   * The feature id for the '<em><b>Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__REQUIREMENTS = MOBJECT__REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Extend</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__EXTEND = MOBJECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Include</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__INCLUDE = MOBJECT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Flows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__FLOWS = MOBJECT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Context</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__CONTEXT = MOBJECT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Act Actors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__ACT_ACTORS = MOBJECT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__CONDITION = MOBJECT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Use Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE_FEATURE_COUNT = MOBJECT_FEATURE_COUNT + 6;

  /**
   * The number of operations of the '<em>Use Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE_OPERATION_COUNT = MOBJECT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link SWVS.impl.FlowImpl <em>Flow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see SWVS.impl.FlowImpl
   * @see SWVS.impl.SWVSPackageImpl#getFlow()
   * @generated
   */
  int FLOW = 5;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW__ID = MOBJECT__ID;

  /**
   * The feature id for the '<em><b>Data base Src Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW__DATA_BASE_SRC_NAME = MOBJECT__DATA_BASE_SRC_NAME;

  /**
   * The feature id for the '<em><b>Object Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW__OBJECT_TYPE = MOBJECT__OBJECT_TYPE;

  /**
   * The feature id for the '<em><b>File Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW__FILE_PATH = MOBJECT__FILE_PATH;

  /**
   * The feature id for the '<em><b>Added Object</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW__ADDED_OBJECT = MOBJECT__ADDED_OBJECT;

  /**
   * The feature id for the '<em><b>Implement Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW__IMPLEMENT_NAME = MOBJECT__IMPLEMENT_NAME;

  /**
   * The feature id for the '<em><b>Object Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW__OBJECT_NAME = MOBJECT__OBJECT_NAME;

  /**
   * The feature id for the '<em><b>Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW__REQUIREMENTS = MOBJECT__REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Flow Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW__FLOW_ID = MOBJECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Host</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW__HOST = MOBJECT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Clients</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW__CLIENTS = MOBJECT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Context</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW__CONTEXT = MOBJECT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Detail Flows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW__DETAIL_FLOWS = MOBJECT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Result</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW__RESULT = MOBJECT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW__CONDITION = MOBJECT_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Flow</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_FEATURE_COUNT = MOBJECT_FEATURE_COUNT + 7;

  /**
   * The number of operations of the '<em>Flow</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_OPERATION_COUNT = MOBJECT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link SWVS.impl.ActorImpl <em>Actor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see SWVS.impl.ActorImpl
   * @see SWVS.impl.SWVSPackageImpl#getActor()
   * @generated
   */
  int ACTOR = 6;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__ID = MOBJECT__ID;

  /**
   * The feature id for the '<em><b>Data base Src Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__DATA_BASE_SRC_NAME = MOBJECT__DATA_BASE_SRC_NAME;

  /**
   * The feature id for the '<em><b>Object Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__OBJECT_TYPE = MOBJECT__OBJECT_TYPE;

  /**
   * The feature id for the '<em><b>File Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__FILE_PATH = MOBJECT__FILE_PATH;

  /**
   * The feature id for the '<em><b>Added Object</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__ADDED_OBJECT = MOBJECT__ADDED_OBJECT;

  /**
   * The feature id for the '<em><b>Implement Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__IMPLEMENT_NAME = MOBJECT__IMPLEMENT_NAME;

  /**
   * The feature id for the '<em><b>Object Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__OBJECT_NAME = MOBJECT__OBJECT_NAME;

  /**
   * The feature id for the '<em><b>Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__REQUIREMENTS = MOBJECT__REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Act Usecases</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__ACT_USECASES = MOBJECT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Actor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_FEATURE_COUNT = MOBJECT_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Actor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_OPERATION_COUNT = MOBJECT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link SWVS.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see SWVS.impl.ConditionImpl
   * @see SWVS.impl.SWVSPackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 7;

  /**
   * The feature id for the '<em><b>Pre Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__PRE_CONDITION = 0;

  /**
   * The feature id for the '<em><b>Post Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__POST_CONDITION = 1;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link SWVS.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see SWVS.impl.FunctionImpl
   * @see SWVS.impl.SWVSPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 8;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = 0;

  /**
   * The number of operations of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link SWVS.impl.MClassImpl <em>MClass</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see SWVS.impl.MClassImpl
   * @see SWVS.impl.SWVSPackageImpl#getMClass()
   * @generated
   */
  int MCLASS = 9;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCLASS__ID = MOBJECT__ID;

  /**
   * The feature id for the '<em><b>Data base Src Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCLASS__DATA_BASE_SRC_NAME = MOBJECT__DATA_BASE_SRC_NAME;

  /**
   * The feature id for the '<em><b>Object Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCLASS__OBJECT_TYPE = MOBJECT__OBJECT_TYPE;

  /**
   * The feature id for the '<em><b>File Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCLASS__FILE_PATH = MOBJECT__FILE_PATH;

  /**
   * The feature id for the '<em><b>Added Object</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCLASS__ADDED_OBJECT = MOBJECT__ADDED_OBJECT;

  /**
   * The feature id for the '<em><b>Implement Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCLASS__IMPLEMENT_NAME = MOBJECT__IMPLEMENT_NAME;

  /**
   * The feature id for the '<em><b>Object Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCLASS__OBJECT_NAME = MOBJECT__OBJECT_NAME;

  /**
   * The feature id for the '<em><b>Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCLASS__REQUIREMENTS = MOBJECT__REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCLASS__FIELDS = MOBJECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCLASS__PACKAGE = MOBJECT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Has Class List</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCLASS__HAS_CLASS_LIST = MOBJECT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Super Class List</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCLASS__SUPER_CLASS_LIST = MOBJECT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCLASS__METHODS = MOBJECT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Def Base</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCLASS__DEF_BASE = MOBJECT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Class Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCLASS__CLASS_TYPE = MOBJECT_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>MClass</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCLASS_FEATURE_COUNT = MOBJECT_FEATURE_COUNT + 7;

  /**
   * The number of operations of the '<em>MClass</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCLASS_OPERATION_COUNT = MOBJECT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link SWVS.impl.FieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see SWVS.impl.FieldImpl
   * @see SWVS.impl.SWVSPackageImpl#getField()
   * @generated
   */
  int FIELD = 10;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__ID = MOBJECT__ID;

  /**
   * The feature id for the '<em><b>Data base Src Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__DATA_BASE_SRC_NAME = MOBJECT__DATA_BASE_SRC_NAME;

  /**
   * The feature id for the '<em><b>Object Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__OBJECT_TYPE = MOBJECT__OBJECT_TYPE;

  /**
   * The feature id for the '<em><b>File Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__FILE_PATH = MOBJECT__FILE_PATH;

  /**
   * The feature id for the '<em><b>Added Object</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__ADDED_OBJECT = MOBJECT__ADDED_OBJECT;

  /**
   * The feature id for the '<em><b>Implement Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__IMPLEMENT_NAME = MOBJECT__IMPLEMENT_NAME;

  /**
   * The feature id for the '<em><b>Object Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__OBJECT_NAME = MOBJECT__OBJECT_NAME;

  /**
   * The feature id for the '<em><b>Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__REQUIREMENTS = MOBJECT__REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__TYPE_NAME = MOBJECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Is Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__IS_CLASS = MOBJECT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = MOBJECT_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_OPERATION_COUNT = MOBJECT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link SWVS.impl.BeverageImpl <em>Beverage</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see SWVS.impl.BeverageImpl
   * @see SWVS.impl.SWVSPackageImpl#getBeverage()
   * @generated
   */
  int BEVERAGE = 11;

  /**
   * The feature id for the '<em><b>Price</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEVERAGE__PRICE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEVERAGE__NAME = 1;

  /**
   * The number of structural features of the '<em>Beverage</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEVERAGE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Beverage</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEVERAGE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link SWVS.impl.CoffeeImpl <em>Coffee</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see SWVS.impl.CoffeeImpl
   * @see SWVS.impl.SWVSPackageImpl#getCoffee()
   * @generated
   */
  int COFFEE = 12;

  /**
   * The feature id for the '<em><b>Price</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COFFEE__PRICE = BEVERAGE__PRICE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COFFEE__NAME = BEVERAGE__NAME;

  /**
   * The feature id for the '<em><b>Caffeine</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COFFEE__CAFFEINE = BEVERAGE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Coffee</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COFFEE_FEATURE_COUNT = BEVERAGE_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Coffee</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COFFEE_OPERATION_COUNT = BEVERAGE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link SWVS.impl.TeaImpl <em>Tea</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see SWVS.impl.TeaImpl
   * @see SWVS.impl.SWVSPackageImpl#getTea()
   * @generated
   */
  int TEA = 13;

  /**
   * The feature id for the '<em><b>Price</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEA__PRICE = BEVERAGE__PRICE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEA__NAME = BEVERAGE__NAME;

  /**
   * The feature id for the '<em><b>Tea back</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEA__TEA_BACK = BEVERAGE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Tea</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEA_FEATURE_COUNT = BEVERAGE_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Tea</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEA_OPERATION_COUNT = BEVERAGE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link SWVS.impl.Tea_BackImpl <em>Tea Back</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see SWVS.impl.Tea_BackImpl
   * @see SWVS.impl.SWVSPackageImpl#getTea_Back()
   * @generated
   */
  int TEA_BACK = 14;

  /**
   * The feature id for the '<em><b>Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEA_BACK__WEIGHT = 0;

  /**
   * The number of structural features of the '<em>Tea Back</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEA_BACK_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Tea Back</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEA_BACK_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link SWVS.impl.CustomerImpl <em>Customer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see SWVS.impl.CustomerImpl
   * @see SWVS.impl.SWVSPackageImpl#getCustomer()
   * @generated
   */
  int CUSTOMER = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOMER__NAME = 0;

  /**
   * The feature id for the '<em><b>Beverage</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOMER__BEVERAGE = 1;

  /**
   * The number of structural features of the '<em>Customer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOMER_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Customer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOMER_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link SWVS.impl.MMethodImpl <em>MMethod</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see SWVS.impl.MMethodImpl
   * @see SWVS.impl.SWVSPackageImpl#getMMethod()
   * @generated
   */
  int MMETHOD = 16;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MMETHOD__ID = MOBJECT__ID;

  /**
   * The feature id for the '<em><b>Data base Src Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MMETHOD__DATA_BASE_SRC_NAME = MOBJECT__DATA_BASE_SRC_NAME;

  /**
   * The feature id for the '<em><b>Object Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MMETHOD__OBJECT_TYPE = MOBJECT__OBJECT_TYPE;

  /**
   * The feature id for the '<em><b>File Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MMETHOD__FILE_PATH = MOBJECT__FILE_PATH;

  /**
   * The feature id for the '<em><b>Added Object</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MMETHOD__ADDED_OBJECT = MOBJECT__ADDED_OBJECT;

  /**
   * The feature id for the '<em><b>Implement Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MMETHOD__IMPLEMENT_NAME = MOBJECT__IMPLEMENT_NAME;

  /**
   * The feature id for the '<em><b>Object Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MMETHOD__OBJECT_NAME = MOBJECT__OBJECT_NAME;

  /**
   * The feature id for the '<em><b>Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MMETHOD__REQUIREMENTS = MOBJECT__REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MMETHOD__RETURN_TYPE = MOBJECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Is Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MMETHOD__IS_STATIC = MOBJECT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Test Usecase</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MMETHOD__TEST_USECASE = MOBJECT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Base</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MMETHOD__BASE = MOBJECT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Argument</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MMETHOD__ARGUMENT = MOBJECT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>MMethod</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MMETHOD_FEATURE_COUNT = MOBJECT_FEATURE_COUNT + 5;

  /**
   * The number of operations of the '<em>MMethod</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MMETHOD_OPERATION_COUNT = MOBJECT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link SWVS.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see SWVS.impl.StateImpl
   * @see SWVS.impl.SWVSPackageImpl#getState()
   * @generated
   */
  int STATE = 17;

  /**
   * The feature id for the '<em><b>State Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__STATE_ID = 0;

  /**
   * The feature id for the '<em><b>Use Case Status</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__USE_CASE_STATUS = 1;

  /**
   * The feature id for the '<em><b>Implementation Status</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__IMPLEMENTATION_STATUS = 2;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link SWVS.impl.ObjectImpl <em>Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see SWVS.impl.ObjectImpl
   * @see SWVS.impl.SWVSPackageImpl#getObject()
   * @generated
   */
  int OBJECT = 18;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__ID = 0;

  /**
   * The feature id for the '<em><b>Data base Src Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__DATA_BASE_SRC_NAME = 1;

  /**
   * The feature id for the '<em><b>Object Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__OBJECT_TYPE = 2;

  /**
   * The feature id for the '<em><b>File Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__FILE_PATH = 3;

  /**
   * The feature id for the '<em><b>Added Object</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__ADDED_OBJECT = 4;

  /**
   * The feature id for the '<em><b>Implement Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__IMPLEMENT_NAME = 5;

  /**
   * The feature id for the '<em><b>Object Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__OBJECT_NAME = 6;

  /**
   * The feature id for the '<em><b>Requirement</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__REQUIREMENT = 7;

  /**
   * The number of structural features of the '<em>Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_FEATURE_COUNT = 8;

  /**
   * The number of operations of the '<em>Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_OPERATION_COUNT = 0;


  /**
   * Returns the meta object for class '{@link SWVS.Project <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Project</em>'.
   * @see SWVS.Project
   * @generated
   */
  EClass getProject();

  /**
   * Returns the meta object for the attribute '{@link SWVS.Project#getProjectName <em>Project Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Project Name</em>'.
   * @see SWVS.Project#getProjectName()
   * @see #getProject()
   * @generated
   */
  EAttribute getProject_ProjectName();

  /**
   * Returns the meta object for the containment reference list '{@link SWVS.Project#getRequirement <em>Requirement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Requirement</em>'.
   * @see SWVS.Project#getRequirement()
   * @see #getProject()
   * @generated
   */
  EReference getProject_Requirement();

  /**
   * Returns the meta object for the containment reference list '{@link SWVS.Project#getSystems <em>Systems</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Systems</em>'.
   * @see SWVS.Project#getSystems()
   * @see #getProject()
   * @generated
   */
  EReference getProject_Systems();

  /**
   * Returns the meta object for the containment reference list '{@link SWVS.Project#getActorList <em>Actor List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actor List</em>'.
   * @see SWVS.Project#getActorList()
   * @see #getProject()
   * @generated
   */
  EReference getProject_ActorList();

  /**
   * Returns the meta object for the containment reference list '{@link SWVS.Project#getClassList <em>Class List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Class List</em>'.
   * @see SWVS.Project#getClassList()
   * @see #getProject()
   * @generated
   */
  EReference getProject_ClassList();

  /**
   * Returns the meta object for the containment reference list '{@link SWVS.Project#getMObjects <em>MObjects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>MObjects</em>'.
   * @see SWVS.Project#getMObjects()
   * @see #getProject()
   * @generated
   */
  EReference getProject_MObjects();

  /**
   * Returns the meta object for the reference list '{@link SWVS.Project#getObjects <em>Objects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Objects</em>'.
   * @see SWVS.Project#getObjects()
   * @see #getProject()
   * @generated
   */
  EReference getProject_Objects();

  /**
   * Returns the meta object for the attribute '{@link SWVS.Project#getFinDate <em>Fin Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fin Date</em>'.
   * @see SWVS.Project#getFinDate()
   * @see #getProject()
   * @generated
   */
  EAttribute getProject_FinDate();

  /**
   * Returns the meta object for class '{@link SWVS.Requirement <em>Requirement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Requirement</em>'.
   * @see SWVS.Requirement
   * @generated
   */
  EClass getRequirement();

  /**
   * Returns the meta object for the attribute '{@link SWVS.Requirement#getContents <em>Contents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Contents</em>'.
   * @see SWVS.Requirement#getContents()
   * @see #getRequirement()
   * @generated
   */
  EAttribute getRequirement_Contents();

  /**
   * Returns the meta object for the attribute '{@link SWVS.Requirement#getRqType <em>Rq Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rq Type</em>'.
   * @see SWVS.Requirement#getRqType()
   * @see #getRequirement()
   * @generated
   */
  EAttribute getRequirement_RqType();

  /**
   * Returns the meta object for the attribute '{@link SWVS.Requirement#getDepartment <em>Department</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Department</em>'.
   * @see SWVS.Requirement#getDepartment()
   * @see #getRequirement()
   * @generated
   */
  EAttribute getRequirement_Department();

  /**
   * Returns the meta object for class '{@link SWVS.MSystem <em>MSystem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MSystem</em>'.
   * @see SWVS.MSystem
   * @generated
   */
  EClass getMSystem();

  /**
   * Returns the meta object for the attribute '{@link SWVS.MSystem#getSystemType <em>System Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>System Type</em>'.
   * @see SWVS.MSystem#getSystemType()
   * @see #getMSystem()
   * @generated
   */
  EAttribute getMSystem_SystemType();

  /**
   * Returns the meta object for the containment reference list '{@link SWVS.MSystem#getUsecase <em>Usecase</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Usecase</em>'.
   * @see SWVS.MSystem#getUsecase()
   * @see #getMSystem()
   * @generated
   */
  EReference getMSystem_Usecase();

  /**
   * Returns the meta object for the reference list '{@link SWVS.MSystem#getDefClass <em>Def Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Def Class</em>'.
   * @see SWVS.MSystem#getDefClass()
   * @see #getMSystem()
   * @generated
   */
  EReference getMSystem_DefClass();

  /**
   * Returns the meta object for the containment reference list '{@link SWVS.MSystem#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see SWVS.MSystem#getStates()
   * @see #getMSystem()
   * @generated
   */
  EReference getMSystem_States();

  /**
   * Returns the meta object for class '{@link SWVS.MObject <em>MObject</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MObject</em>'.
   * @see SWVS.MObject
   * @generated
   */
  EClass getMObject();

  /**
   * Returns the meta object for the attribute '{@link SWVS.MObject#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see SWVS.MObject#getId()
   * @see #getMObject()
   * @generated
   */
  EAttribute getMObject_Id();

  /**
   * Returns the meta object for the attribute '{@link SWVS.MObject#getData_base_SrcName <em>Data base Src Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Data base Src Name</em>'.
   * @see SWVS.MObject#getData_base_SrcName()
   * @see #getMObject()
   * @generated
   */
  EAttribute getMObject_Data_base_SrcName();

  /**
   * Returns the meta object for the attribute '{@link SWVS.MObject#getObjectType <em>Object Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Object Type</em>'.
   * @see SWVS.MObject#getObjectType()
   * @see #getMObject()
   * @generated
   */
  EAttribute getMObject_ObjectType();

  /**
   * Returns the meta object for the attribute '{@link SWVS.MObject#getFilePath <em>File Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>File Path</em>'.
   * @see SWVS.MObject#getFilePath()
   * @see #getMObject()
   * @generated
   */
  EAttribute getMObject_FilePath();

  /**
   * Returns the meta object for the attribute '{@link SWVS.MObject#isAddedObject <em>Added Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added Object</em>'.
   * @see SWVS.MObject#isAddedObject()
   * @see #getMObject()
   * @generated
   */
  EAttribute getMObject_AddedObject();

  /**
   * Returns the meta object for the attribute '{@link SWVS.MObject#getImplementName <em>Implement Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Implement Name</em>'.
   * @see SWVS.MObject#getImplementName()
   * @see #getMObject()
   * @generated
   */
  EAttribute getMObject_ImplementName();

  /**
   * Returns the meta object for the attribute '{@link SWVS.MObject#getObjectName <em>Object Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Object Name</em>'.
   * @see SWVS.MObject#getObjectName()
   * @see #getMObject()
   * @generated
   */
  EAttribute getMObject_ObjectName();

  /**
   * Returns the meta object for the reference list '{@link SWVS.MObject#getRequirements <em>Requirements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Requirements</em>'.
   * @see SWVS.MObject#getRequirements()
   * @see #getMObject()
   * @generated
   */
  EReference getMObject_Requirements();

  /**
   * Returns the meta object for class '{@link SWVS.UseCase <em>Use Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Use Case</em>'.
   * @see SWVS.UseCase
   * @generated
   */
  EClass getUseCase();

  /**
   * Returns the meta object for the containment reference list '{@link SWVS.UseCase#getExtend <em>Extend</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Extend</em>'.
   * @see SWVS.UseCase#getExtend()
   * @see #getUseCase()
   * @generated
   */
  EReference getUseCase_Extend();

  /**
   * Returns the meta object for the containment reference list '{@link SWVS.UseCase#getInclude <em>Include</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Include</em>'.
   * @see SWVS.UseCase#getInclude()
   * @see #getUseCase()
   * @generated
   */
  EReference getUseCase_Include();

  /**
   * Returns the meta object for the containment reference list '{@link SWVS.UseCase#getFlows <em>Flows</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Flows</em>'.
   * @see SWVS.UseCase#getFlows()
   * @see #getUseCase()
   * @generated
   */
  EReference getUseCase_Flows();

  /**
   * Returns the meta object for the attribute '{@link SWVS.UseCase#getContext <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Context</em>'.
   * @see SWVS.UseCase#getContext()
   * @see #getUseCase()
   * @generated
   */
  EAttribute getUseCase_Context();

  /**
   * Returns the meta object for the reference list '{@link SWVS.UseCase#getActActors <em>Act Actors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Act Actors</em>'.
   * @see SWVS.UseCase#getActActors()
   * @see #getUseCase()
   * @generated
   */
  EReference getUseCase_ActActors();

  /**
   * Returns the meta object for the containment reference '{@link SWVS.UseCase#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see SWVS.UseCase#getCondition()
   * @see #getUseCase()
   * @generated
   */
  EReference getUseCase_Condition();

  /**
   * Returns the meta object for class '{@link SWVS.Flow <em>Flow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Flow</em>'.
   * @see SWVS.Flow
   * @generated
   */
  EClass getFlow();

  /**
   * Returns the meta object for the attribute '{@link SWVS.Flow#getFlowId <em>Flow Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Flow Id</em>'.
   * @see SWVS.Flow#getFlowId()
   * @see #getFlow()
   * @generated
   */
  EAttribute getFlow_FlowId();

  /**
   * Returns the meta object for the reference list '{@link SWVS.Flow#getHost <em>Host</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Host</em>'.
   * @see SWVS.Flow#getHost()
   * @see #getFlow()
   * @generated
   */
  EReference getFlow_Host();

  /**
   * Returns the meta object for the reference list '{@link SWVS.Flow#getClients <em>Clients</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Clients</em>'.
   * @see SWVS.Flow#getClients()
   * @see #getFlow()
   * @generated
   */
  EReference getFlow_Clients();

  /**
   * Returns the meta object for the attribute '{@link SWVS.Flow#getContext <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Context</em>'.
   * @see SWVS.Flow#getContext()
   * @see #getFlow()
   * @generated
   */
  EAttribute getFlow_Context();

  /**
   * Returns the meta object for the containment reference list '{@link SWVS.Flow#getDetailFlows <em>Detail Flows</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Detail Flows</em>'.
   * @see SWVS.Flow#getDetailFlows()
   * @see #getFlow()
   * @generated
   */
  EReference getFlow_DetailFlows();

  /**
   * Returns the meta object for the attribute '{@link SWVS.Flow#getResult <em>Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Result</em>'.
   * @see SWVS.Flow#getResult()
   * @see #getFlow()
   * @generated
   */
  EAttribute getFlow_Result();

  /**
   * Returns the meta object for the containment reference '{@link SWVS.Flow#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see SWVS.Flow#getCondition()
   * @see #getFlow()
   * @generated
   */
  EReference getFlow_Condition();

  /**
   * Returns the meta object for class '{@link SWVS.Actor <em>Actor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actor</em>'.
   * @see SWVS.Actor
   * @generated
   */
  EClass getActor();

  /**
   * Returns the meta object for the reference list '{@link SWVS.Actor#getActUsecases <em>Act Usecases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Act Usecases</em>'.
   * @see SWVS.Actor#getActUsecases()
   * @see #getActor()
   * @generated
   */
  EReference getActor_ActUsecases();

  /**
   * Returns the meta object for class '{@link SWVS.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see SWVS.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for the attribute '{@link SWVS.Condition#getPreCondition <em>Pre Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pre Condition</em>'.
   * @see SWVS.Condition#getPreCondition()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_PreCondition();

  /**
   * Returns the meta object for the attribute '{@link SWVS.Condition#getPostCondition <em>Post Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Post Condition</em>'.
   * @see SWVS.Condition#getPostCondition()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_PostCondition();

  /**
   * Returns the meta object for class '{@link SWVS.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see SWVS.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for class '{@link SWVS.MClass <em>MClass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MClass</em>'.
   * @see SWVS.MClass
   * @generated
   */
  EClass getMClass();

  /**
   * Returns the meta object for the containment reference list '{@link SWVS.MClass#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see SWVS.MClass#getFields()
   * @see #getMClass()
   * @generated
   */
  EReference getMClass_Fields();

  /**
   * Returns the meta object for the attribute '{@link SWVS.MClass#getPackage <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Package</em>'.
   * @see SWVS.MClass#getPackage()
   * @see #getMClass()
   * @generated
   */
  EAttribute getMClass_Package();

  /**
   * Returns the meta object for the reference list '{@link SWVS.MClass#getHasClassList <em>Has Class List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Has Class List</em>'.
   * @see SWVS.MClass#getHasClassList()
   * @see #getMClass()
   * @generated
   */
  EReference getMClass_HasClassList();

  /**
   * Returns the meta object for the reference list '{@link SWVS.MClass#getSuperClassList <em>Super Class List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Super Class List</em>'.
   * @see SWVS.MClass#getSuperClassList()
   * @see #getMClass()
   * @generated
   */
  EReference getMClass_SuperClassList();

  /**
   * Returns the meta object for the containment reference list '{@link SWVS.MClass#getMethods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methods</em>'.
   * @see SWVS.MClass#getMethods()
   * @see #getMClass()
   * @generated
   */
  EReference getMClass_Methods();

  /**
   * Returns the meta object for the reference list '{@link SWVS.MClass#getDefBase <em>Def Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Def Base</em>'.
   * @see SWVS.MClass#getDefBase()
   * @see #getMClass()
   * @generated
   */
  EReference getMClass_DefBase();

  /**
   * Returns the meta object for the attribute '{@link SWVS.MClass#getClassType <em>Class Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class Type</em>'.
   * @see SWVS.MClass#getClassType()
   * @see #getMClass()
   * @generated
   */
  EAttribute getMClass_ClassType();

  /**
   * Returns the meta object for class '{@link SWVS.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see SWVS.Field
   * @generated
   */
  EClass getField();

  /**
   * Returns the meta object for the attribute '{@link SWVS.Field#getTypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type Name</em>'.
   * @see SWVS.Field#getTypeName()
   * @see #getField()
   * @generated
   */
  EAttribute getField_TypeName();

  /**
   * Returns the meta object for the attribute '{@link SWVS.Field#isIsClass <em>Is Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Class</em>'.
   * @see SWVS.Field#isIsClass()
   * @see #getField()
   * @generated
   */
  EAttribute getField_IsClass();

  /**
   * Returns the meta object for class '{@link SWVS.Beverage <em>Beverage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Beverage</em>'.
   * @see SWVS.Beverage
   * @generated
   */
  EClass getBeverage();

  /**
   * Returns the meta object for the attribute '{@link SWVS.Beverage#getPrice <em>Price</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Price</em>'.
   * @see SWVS.Beverage#getPrice()
   * @see #getBeverage()
   * @generated
   */
  EAttribute getBeverage_Price();

  /**
   * Returns the meta object for the attribute '{@link SWVS.Beverage#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see SWVS.Beverage#getName()
   * @see #getBeverage()
   * @generated
   */
  EAttribute getBeverage_Name();

  /**
   * Returns the meta object for class '{@link SWVS.Coffee <em>Coffee</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Coffee</em>'.
   * @see SWVS.Coffee
   * @generated
   */
  EClass getCoffee();

  /**
   * Returns the meta object for the attribute '{@link SWVS.Coffee#getCaffeine <em>Caffeine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Caffeine</em>'.
   * @see SWVS.Coffee#getCaffeine()
   * @see #getCoffee()
   * @generated
   */
  EAttribute getCoffee_Caffeine();

  /**
   * Returns the meta object for class '{@link SWVS.Tea <em>Tea</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tea</em>'.
   * @see SWVS.Tea
   * @generated
   */
  EClass getTea();

  /**
   * Returns the meta object for the containment reference '{@link SWVS.Tea#getTea_back <em>Tea back</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tea back</em>'.
   * @see SWVS.Tea#getTea_back()
   * @see #getTea()
   * @generated
   */
  EReference getTea_Tea_back();

  /**
   * Returns the meta object for class '{@link SWVS.Tea_Back <em>Tea Back</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tea Back</em>'.
   * @see SWVS.Tea_Back
   * @generated
   */
  EClass getTea_Back();

  /**
   * Returns the meta object for the attribute '{@link SWVS.Tea_Back#getWeight <em>Weight</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Weight</em>'.
   * @see SWVS.Tea_Back#getWeight()
   * @see #getTea_Back()
   * @generated
   */
  EAttribute getTea_Back_Weight();

  /**
   * Returns the meta object for class '{@link SWVS.Customer <em>Customer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Customer</em>'.
   * @see SWVS.Customer
   * @generated
   */
  EClass getCustomer();

  /**
   * Returns the meta object for the attribute '{@link SWVS.Customer#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see SWVS.Customer#getName()
   * @see #getCustomer()
   * @generated
   */
  EAttribute getCustomer_Name();

  /**
   * Returns the meta object for the reference '{@link SWVS.Customer#getBeverage <em>Beverage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Beverage</em>'.
   * @see SWVS.Customer#getBeverage()
   * @see #getCustomer()
   * @generated
   */
  EReference getCustomer_Beverage();

  /**
   * Returns the meta object for class '{@link SWVS.MMethod <em>MMethod</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MMethod</em>'.
   * @see SWVS.MMethod
   * @generated
   */
  EClass getMMethod();

  /**
   * Returns the meta object for the attribute '{@link SWVS.MMethod#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Return Type</em>'.
   * @see SWVS.MMethod#getReturnType()
   * @see #getMMethod()
   * @generated
   */
  EAttribute getMMethod_ReturnType();

  /**
   * Returns the meta object for the attribute '{@link SWVS.MMethod#isIsStatic <em>Is Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Static</em>'.
   * @see SWVS.MMethod#isIsStatic()
   * @see #getMMethod()
   * @generated
   */
  EAttribute getMMethod_IsStatic();

  /**
   * Returns the meta object for the reference '{@link SWVS.MMethod#getTestUsecase <em>Test Usecase</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Test Usecase</em>'.
   * @see SWVS.MMethod#getTestUsecase()
   * @see #getMMethod()
   * @generated
   */
  EReference getMMethod_TestUsecase();

  /**
   * Returns the meta object for the reference list '{@link SWVS.MMethod#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Base</em>'.
   * @see SWVS.MMethod#getBase()
   * @see #getMMethod()
   * @generated
   */
  EReference getMMethod_Base();

  /**
   * Returns the meta object for the attribute list '{@link SWVS.MMethod#getArgument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Argument</em>'.
   * @see SWVS.MMethod#getArgument()
   * @see #getMMethod()
   * @generated
   */
  EAttribute getMMethod_Argument();

  /**
   * Returns the meta object for class '{@link SWVS.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see SWVS.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute '{@link SWVS.State#getStateId <em>State Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>State Id</em>'.
   * @see SWVS.State#getStateId()
   * @see #getState()
   * @generated
   */
  EAttribute getState_StateId();

  /**
   * Returns the meta object for the attribute '{@link SWVS.State#getUseCaseStatus <em>Use Case Status</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Use Case Status</em>'.
   * @see SWVS.State#getUseCaseStatus()
   * @see #getState()
   * @generated
   */
  EAttribute getState_UseCaseStatus();

  /**
   * Returns the meta object for the attribute '{@link SWVS.State#getImplementationStatus <em>Implementation Status</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Implementation Status</em>'.
   * @see SWVS.State#getImplementationStatus()
   * @see #getState()
   * @generated
   */
  EAttribute getState_ImplementationStatus();

  /**
   * Returns the meta object for class '{@link SWVS.Object <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object</em>'.
   * @see SWVS.Object
   * @generated
   */
  EClass getObject();

  /**
   * Returns the meta object for the attribute '{@link SWVS.Object#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see SWVS.Object#getId()
   * @see #getObject()
   * @generated
   */
  EAttribute getObject_Id();

  /**
   * Returns the meta object for the attribute '{@link SWVS.Object#getData_base_SrcName <em>Data base Src Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Data base Src Name</em>'.
   * @see SWVS.Object#getData_base_SrcName()
   * @see #getObject()
   * @generated
   */
  EAttribute getObject_Data_base_SrcName();

  /**
   * Returns the meta object for the attribute '{@link SWVS.Object#getObjectType <em>Object Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Object Type</em>'.
   * @see SWVS.Object#getObjectType()
   * @see #getObject()
   * @generated
   */
  EAttribute getObject_ObjectType();

  /**
   * Returns the meta object for the attribute '{@link SWVS.Object#getFilePath <em>File Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>File Path</em>'.
   * @see SWVS.Object#getFilePath()
   * @see #getObject()
   * @generated
   */
  EAttribute getObject_FilePath();

  /**
   * Returns the meta object for the attribute '{@link SWVS.Object#isAddedObject <em>Added Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Added Object</em>'.
   * @see SWVS.Object#isAddedObject()
   * @see #getObject()
   * @generated
   */
  EAttribute getObject_AddedObject();

  /**
   * Returns the meta object for the attribute '{@link SWVS.Object#getImplementName <em>Implement Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Implement Name</em>'.
   * @see SWVS.Object#getImplementName()
   * @see #getObject()
   * @generated
   */
  EAttribute getObject_ImplementName();

  /**
   * Returns the meta object for the attribute '{@link SWVS.Object#getObjectName <em>Object Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Object Name</em>'.
   * @see SWVS.Object#getObjectName()
   * @see #getObject()
   * @generated
   */
  EAttribute getObject_ObjectName();

  /**
   * Returns the meta object for the reference list '{@link SWVS.Object#getRequirement <em>Requirement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Requirement</em>'.
   * @see SWVS.Object#getRequirement()
   * @see #getObject()
   * @generated
   */
  EReference getObject_Requirement();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SWVSFactory getSWVSFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals {
    /**
     * The meta object literal for the '{@link SWVS.impl.ProjectImpl <em>Project</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see SWVS.impl.ProjectImpl
     * @see SWVS.impl.SWVSPackageImpl#getProject()
     * @generated
     */
    EClass PROJECT = eINSTANCE.getProject();

    /**
     * The meta object literal for the '<em><b>Project Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECT__PROJECT_NAME = eINSTANCE.getProject_ProjectName();

    /**
     * The meta object literal for the '<em><b>Requirement</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__REQUIREMENT = eINSTANCE.getProject_Requirement();

    /**
     * The meta object literal for the '<em><b>Systems</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__SYSTEMS = eINSTANCE.getProject_Systems();

    /**
     * The meta object literal for the '<em><b>Actor List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__ACTOR_LIST = eINSTANCE.getProject_ActorList();

    /**
     * The meta object literal for the '<em><b>Class List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__CLASS_LIST = eINSTANCE.getProject_ClassList();

    /**
     * The meta object literal for the '<em><b>MObjects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__MOBJECTS = eINSTANCE.getProject_MObjects();

    /**
     * The meta object literal for the '<em><b>Objects</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__OBJECTS = eINSTANCE.getProject_Objects();

    /**
     * The meta object literal for the '<em><b>Fin Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECT__FIN_DATE = eINSTANCE.getProject_FinDate();

    /**
     * The meta object literal for the '{@link SWVS.impl.RequirementImpl <em>Requirement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see SWVS.impl.RequirementImpl
     * @see SWVS.impl.SWVSPackageImpl#getRequirement()
     * @generated
     */
    EClass REQUIREMENT = eINSTANCE.getRequirement();

    /**
     * The meta object literal for the '<em><b>Contents</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIREMENT__CONTENTS = eINSTANCE.getRequirement_Contents();

    /**
     * The meta object literal for the '<em><b>Rq Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIREMENT__RQ_TYPE = eINSTANCE.getRequirement_RqType();

    /**
     * The meta object literal for the '<em><b>Department</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIREMENT__DEPARTMENT = eINSTANCE.getRequirement_Department();

    /**
     * The meta object literal for the '{@link SWVS.impl.MSystemImpl <em>MSystem</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see SWVS.impl.MSystemImpl
     * @see SWVS.impl.SWVSPackageImpl#getMSystem()
     * @generated
     */
    EClass MSYSTEM = eINSTANCE.getMSystem();

    /**
     * The meta object literal for the '<em><b>System Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MSYSTEM__SYSTEM_TYPE = eINSTANCE.getMSystem_SystemType();

    /**
     * The meta object literal for the '<em><b>Usecase</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MSYSTEM__USECASE = eINSTANCE.getMSystem_Usecase();

    /**
     * The meta object literal for the '<em><b>Def Class</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MSYSTEM__DEF_CLASS = eINSTANCE.getMSystem_DefClass();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MSYSTEM__STATES = eINSTANCE.getMSystem_States();

    /**
     * The meta object literal for the '{@link SWVS.impl.MObjectImpl <em>MObject</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see SWVS.impl.MObjectImpl
     * @see SWVS.impl.SWVSPackageImpl#getMObject()
     * @generated
     */
    EClass MOBJECT = eINSTANCE.getMObject();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOBJECT__ID = eINSTANCE.getMObject_Id();

    /**
     * The meta object literal for the '<em><b>Data base Src Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOBJECT__DATA_BASE_SRC_NAME = eINSTANCE.getMObject_Data_base_SrcName();

    /**
     * The meta object literal for the '<em><b>Object Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOBJECT__OBJECT_TYPE = eINSTANCE.getMObject_ObjectType();

    /**
     * The meta object literal for the '<em><b>File Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOBJECT__FILE_PATH = eINSTANCE.getMObject_FilePath();

    /**
     * The meta object literal for the '<em><b>Added Object</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOBJECT__ADDED_OBJECT = eINSTANCE.getMObject_AddedObject();

    /**
     * The meta object literal for the '<em><b>Implement Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOBJECT__IMPLEMENT_NAME = eINSTANCE.getMObject_ImplementName();

    /**
     * The meta object literal for the '<em><b>Object Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOBJECT__OBJECT_NAME = eINSTANCE.getMObject_ObjectName();

    /**
     * The meta object literal for the '<em><b>Requirements</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOBJECT__REQUIREMENTS = eINSTANCE.getMObject_Requirements();

    /**
     * The meta object literal for the '{@link SWVS.impl.UseCaseImpl <em>Use Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see SWVS.impl.UseCaseImpl
     * @see SWVS.impl.SWVSPackageImpl#getUseCase()
     * @generated
     */
    EClass USE_CASE = eINSTANCE.getUseCase();

    /**
     * The meta object literal for the '<em><b>Extend</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USE_CASE__EXTEND = eINSTANCE.getUseCase_Extend();

    /**
     * The meta object literal for the '<em><b>Include</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USE_CASE__INCLUDE = eINSTANCE.getUseCase_Include();

    /**
     * The meta object literal for the '<em><b>Flows</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USE_CASE__FLOWS = eINSTANCE.getUseCase_Flows();

    /**
     * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USE_CASE__CONTEXT = eINSTANCE.getUseCase_Context();

    /**
     * The meta object literal for the '<em><b>Act Actors</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USE_CASE__ACT_ACTORS = eINSTANCE.getUseCase_ActActors();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USE_CASE__CONDITION = eINSTANCE.getUseCase_Condition();

    /**
     * The meta object literal for the '{@link SWVS.impl.FlowImpl <em>Flow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see SWVS.impl.FlowImpl
     * @see SWVS.impl.SWVSPackageImpl#getFlow()
     * @generated
     */
    EClass FLOW = eINSTANCE.getFlow();

    /**
     * The meta object literal for the '<em><b>Flow Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOW__FLOW_ID = eINSTANCE.getFlow_FlowId();

    /**
     * The meta object literal for the '<em><b>Host</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOW__HOST = eINSTANCE.getFlow_Host();

    /**
     * The meta object literal for the '<em><b>Clients</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOW__CLIENTS = eINSTANCE.getFlow_Clients();

    /**
     * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOW__CONTEXT = eINSTANCE.getFlow_Context();

    /**
     * The meta object literal for the '<em><b>Detail Flows</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOW__DETAIL_FLOWS = eINSTANCE.getFlow_DetailFlows();

    /**
     * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOW__RESULT = eINSTANCE.getFlow_Result();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOW__CONDITION = eINSTANCE.getFlow_Condition();

    /**
     * The meta object literal for the '{@link SWVS.impl.ActorImpl <em>Actor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see SWVS.impl.ActorImpl
     * @see SWVS.impl.SWVSPackageImpl#getActor()
     * @generated
     */
    EClass ACTOR = eINSTANCE.getActor();

    /**
     * The meta object literal for the '<em><b>Act Usecases</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTOR__ACT_USECASES = eINSTANCE.getActor_ActUsecases();

    /**
     * The meta object literal for the '{@link SWVS.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see SWVS.impl.ConditionImpl
     * @see SWVS.impl.SWVSPackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '<em><b>Pre Condition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__PRE_CONDITION = eINSTANCE.getCondition_PreCondition();

    /**
     * The meta object literal for the '<em><b>Post Condition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__POST_CONDITION = eINSTANCE.getCondition_PostCondition();

    /**
     * The meta object literal for the '{@link SWVS.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see SWVS.impl.FunctionImpl
     * @see SWVS.impl.SWVSPackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '{@link SWVS.impl.MClassImpl <em>MClass</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see SWVS.impl.MClassImpl
     * @see SWVS.impl.SWVSPackageImpl#getMClass()
     * @generated
     */
    EClass MCLASS = eINSTANCE.getMClass();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MCLASS__FIELDS = eINSTANCE.getMClass_Fields();

    /**
     * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MCLASS__PACKAGE = eINSTANCE.getMClass_Package();

    /**
     * The meta object literal for the '<em><b>Has Class List</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MCLASS__HAS_CLASS_LIST = eINSTANCE.getMClass_HasClassList();

    /**
     * The meta object literal for the '<em><b>Super Class List</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MCLASS__SUPER_CLASS_LIST = eINSTANCE.getMClass_SuperClassList();

    /**
     * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MCLASS__METHODS = eINSTANCE.getMClass_Methods();

    /**
     * The meta object literal for the '<em><b>Def Base</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MCLASS__DEF_BASE = eINSTANCE.getMClass_DefBase();

    /**
     * The meta object literal for the '<em><b>Class Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MCLASS__CLASS_TYPE = eINSTANCE.getMClass_ClassType();

    /**
     * The meta object literal for the '{@link SWVS.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see SWVS.impl.FieldImpl
     * @see SWVS.impl.SWVSPackageImpl#getField()
     * @generated
     */
    EClass FIELD = eINSTANCE.getField();

    /**
     * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__TYPE_NAME = eINSTANCE.getField_TypeName();

    /**
     * The meta object literal for the '<em><b>Is Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__IS_CLASS = eINSTANCE.getField_IsClass();

    /**
     * The meta object literal for the '{@link SWVS.impl.BeverageImpl <em>Beverage</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see SWVS.impl.BeverageImpl
     * @see SWVS.impl.SWVSPackageImpl#getBeverage()
     * @generated
     */
    EClass BEVERAGE = eINSTANCE.getBeverage();

    /**
     * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BEVERAGE__PRICE = eINSTANCE.getBeverage_Price();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BEVERAGE__NAME = eINSTANCE.getBeverage_Name();

    /**
     * The meta object literal for the '{@link SWVS.impl.CoffeeImpl <em>Coffee</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see SWVS.impl.CoffeeImpl
     * @see SWVS.impl.SWVSPackageImpl#getCoffee()
     * @generated
     */
    EClass COFFEE = eINSTANCE.getCoffee();

    /**
     * The meta object literal for the '<em><b>Caffeine</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COFFEE__CAFFEINE = eINSTANCE.getCoffee_Caffeine();

    /**
     * The meta object literal for the '{@link SWVS.impl.TeaImpl <em>Tea</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see SWVS.impl.TeaImpl
     * @see SWVS.impl.SWVSPackageImpl#getTea()
     * @generated
     */
    EClass TEA = eINSTANCE.getTea();

    /**
     * The meta object literal for the '<em><b>Tea back</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEA__TEA_BACK = eINSTANCE.getTea_Tea_back();

    /**
     * The meta object literal for the '{@link SWVS.impl.Tea_BackImpl <em>Tea Back</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see SWVS.impl.Tea_BackImpl
     * @see SWVS.impl.SWVSPackageImpl#getTea_Back()
     * @generated
     */
    EClass TEA_BACK = eINSTANCE.getTea_Back();

    /**
     * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEA_BACK__WEIGHT = eINSTANCE.getTea_Back_Weight();

    /**
     * The meta object literal for the '{@link SWVS.impl.CustomerImpl <em>Customer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see SWVS.impl.CustomerImpl
     * @see SWVS.impl.SWVSPackageImpl#getCustomer()
     * @generated
     */
    EClass CUSTOMER = eINSTANCE.getCustomer();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CUSTOMER__NAME = eINSTANCE.getCustomer_Name();

    /**
     * The meta object literal for the '<em><b>Beverage</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOMER__BEVERAGE = eINSTANCE.getCustomer_Beverage();

    /**
     * The meta object literal for the '{@link SWVS.impl.MMethodImpl <em>MMethod</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see SWVS.impl.MMethodImpl
     * @see SWVS.impl.SWVSPackageImpl#getMMethod()
     * @generated
     */
    EClass MMETHOD = eINSTANCE.getMMethod();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MMETHOD__RETURN_TYPE = eINSTANCE.getMMethod_ReturnType();

    /**
     * The meta object literal for the '<em><b>Is Static</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MMETHOD__IS_STATIC = eINSTANCE.getMMethod_IsStatic();

    /**
     * The meta object literal for the '<em><b>Test Usecase</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MMETHOD__TEST_USECASE = eINSTANCE.getMMethod_TestUsecase();

    /**
     * The meta object literal for the '<em><b>Base</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MMETHOD__BASE = eINSTANCE.getMMethod_Base();

    /**
     * The meta object literal for the '<em><b>Argument</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MMETHOD__ARGUMENT = eINSTANCE.getMMethod_Argument();

    /**
     * The meta object literal for the '{@link SWVS.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see SWVS.impl.StateImpl
     * @see SWVS.impl.SWVSPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>State Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__STATE_ID = eINSTANCE.getState_StateId();

    /**
     * The meta object literal for the '<em><b>Use Case Status</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__USE_CASE_STATUS = eINSTANCE.getState_UseCaseStatus();

    /**
     * The meta object literal for the '<em><b>Implementation Status</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__IMPLEMENTATION_STATUS = eINSTANCE.getState_ImplementationStatus();

    /**
     * The meta object literal for the '{@link SWVS.impl.ObjectImpl <em>Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see SWVS.impl.ObjectImpl
     * @see SWVS.impl.SWVSPackageImpl#getObject()
     * @generated
     */
    EClass OBJECT = eINSTANCE.getObject();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT__ID = eINSTANCE.getObject_Id();

    /**
     * The meta object literal for the '<em><b>Data base Src Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT__DATA_BASE_SRC_NAME = eINSTANCE.getObject_Data_base_SrcName();

    /**
     * The meta object literal for the '<em><b>Object Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT__OBJECT_TYPE = eINSTANCE.getObject_ObjectType();

    /**
     * The meta object literal for the '<em><b>File Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT__FILE_PATH = eINSTANCE.getObject_FilePath();

    /**
     * The meta object literal for the '<em><b>Added Object</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT__ADDED_OBJECT = eINSTANCE.getObject_AddedObject();

    /**
     * The meta object literal for the '<em><b>Implement Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT__IMPLEMENT_NAME = eINSTANCE.getObject_ImplementName();

    /**
     * The meta object literal for the '<em><b>Object Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT__OBJECT_NAME = eINSTANCE.getObject_ObjectName();

    /**
     * The meta object literal for the '<em><b>Requirement</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT__REQUIREMENT = eINSTANCE.getObject_Requirement();

  }

} //SWVSPackage
