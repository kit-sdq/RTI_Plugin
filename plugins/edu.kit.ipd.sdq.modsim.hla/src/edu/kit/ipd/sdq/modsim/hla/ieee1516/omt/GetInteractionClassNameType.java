/**
 */
package edu.kit.ipd.sdq.modsim.hla.ieee1516.omt;

import java.lang.String;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Interaction Class Name Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetInteractionClassNameType#getIdtag <em>Idtag</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetInteractionClassNameType#getIsCallback <em>Is Callback</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetInteractionClassNameType#isIsUsed <em>Is Used</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetInteractionClassNameType#getNotes <em>Notes</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetInteractionClassNameType#getSection <em>Section</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetInteractionClassNameType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getGetInteractionClassNameType()
 * @model extendedMetaData="name='getInteractionClassName_._type' kind='empty'"
 * @generated
 */
public interface GetInteractionClassNameType extends EObject {
	/**
	 * Returns the value of the '<em><b>Idtag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Idtag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idtag</em>' attribute.
	 * @see #setIdtag(String)
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getGetInteractionClassNameType_Idtag()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='idtag'"
	 * @generated
	 */
	String getIdtag();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetInteractionClassNameType#getIdtag <em>Idtag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idtag</em>' attribute.
	 * @see #getIdtag()
	 * @generated
	 */
	void setIdtag(String value);

	/**
	 * Returns the value of the '<em><b>Is Callback</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Callback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Callback</em>' attribute.
	 * @see #isSetIsCallback()
	 * @see #unsetIsCallback()
	 * @see #setIsCallback(Object)
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getGetInteractionClassNameType_IsCallback()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='isCallback'"
	 * @generated
	 */
	Object getIsCallback();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetInteractionClassNameType#getIsCallback <em>Is Callback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Callback</em>' attribute.
	 * @see #isSetIsCallback()
	 * @see #unsetIsCallback()
	 * @see #getIsCallback()
	 * @generated
	 */
	void setIsCallback(Object value);

	/**
	 * Unsets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetInteractionClassNameType#getIsCallback <em>Is Callback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsCallback()
	 * @see #getIsCallback()
	 * @see #setIsCallback(Object)
	 * @generated
	 */
	void unsetIsCallback();

	/**
	 * Returns whether the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetInteractionClassNameType#getIsCallback <em>Is Callback</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Callback</em>' attribute is set.
	 * @see #unsetIsCallback()
	 * @see #getIsCallback()
	 * @see #setIsCallback(Object)
	 * @generated
	 */
	boolean isSetIsCallback();

	/**
	 * Returns the value of the '<em><b>Is Used</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Used</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Used</em>' attribute.
	 * @see #isSetIsUsed()
	 * @see #unsetIsUsed()
	 * @see #setIsUsed(boolean)
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getGetInteractionClassNameType_IsUsed()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isUsed'"
	 * @generated
	 */
	boolean isIsUsed();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetInteractionClassNameType#isIsUsed <em>Is Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Used</em>' attribute.
	 * @see #isSetIsUsed()
	 * @see #unsetIsUsed()
	 * @see #isIsUsed()
	 * @generated
	 */
	void setIsUsed(boolean value);

	/**
	 * Unsets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetInteractionClassNameType#isIsUsed <em>Is Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsUsed()
	 * @see #isIsUsed()
	 * @see #setIsUsed(boolean)
	 * @generated
	 */
	void unsetIsUsed();

	/**
	 * Returns whether the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetInteractionClassNameType#isIsUsed <em>Is Used</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Used</em>' attribute is set.
	 * @see #unsetIsUsed()
	 * @see #isIsUsed()
	 * @see #setIsUsed(boolean)
	 * @generated
	 */
	boolean isSetIsUsed();

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' attribute.
	 * @see #setNotes(List)
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getGetInteractionClassNameType_Notes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='notes'"
	 * @generated
	 */
	List<String> getNotes();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetInteractionClassNameType#getNotes <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' attribute.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(List<String> value);

	/**
	 * Returns the value of the '<em><b>Section</b></em>' attribute.
	 * The default value is <code>"10.16"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Section</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section</em>' attribute.
	 * @see #isSetSection()
	 * @see #unsetSection()
	 * @see #setSection(Object)
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getGetInteractionClassNameType_Section()
	 * @model default="10.16" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='section'"
	 * @generated
	 */
	Object getSection();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetInteractionClassNameType#getSection <em>Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section</em>' attribute.
	 * @see #isSetSection()
	 * @see #unsetSection()
	 * @see #getSection()
	 * @generated
	 */
	void setSection(Object value);

	/**
	 * Unsets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetInteractionClassNameType#getSection <em>Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSection()
	 * @see #getSection()
	 * @see #setSection(Object)
	 * @generated
	 */
	void unsetSection();

	/**
	 * Returns whether the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.GetInteractionClassNameType#getSection <em>Section</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Section</em>' attribute is set.
	 * @see #unsetSection()
	 * @see #getSection()
	 * @see #setSection(Object)
	 * @generated
	 */
	boolean isSetSection();

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getGetInteractionClassNameType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':5' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // GetInteractionClassNameType
