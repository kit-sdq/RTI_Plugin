/**
 */
package edu.kit.ipd.sdq.modsim.hla.ieee1516.omt;

import java.lang.String;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Keyword Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.KeywordType#getTaxonomy <em>Taxonomy</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.KeywordType#getKeywordValue <em>Keyword Value</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.KeywordType#getIdtag <em>Idtag</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.KeywordType#getNotes <em>Notes</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.KeywordType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getKeywordType()
 * @model extendedMetaData="name='keywordType' kind='elementOnly'"
 * @generated
 */
public interface KeywordType extends EObject {
	/**
	 * Returns the value of the '<em><b>Taxonomy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taxonomy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taxonomy</em>' containment reference.
	 * @see #setTaxonomy(edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String)
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getKeywordType_Taxonomy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='taxonomy' namespace='##targetNamespace'"
	 * @generated
	 */
	edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String getTaxonomy();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.KeywordType#getTaxonomy <em>Taxonomy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taxonomy</em>' containment reference.
	 * @see #getTaxonomy()
	 * @generated
	 */
	void setTaxonomy(edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String value);

	/**
	 * Returns the value of the '<em><b>Keyword Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keyword Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keyword Value</em>' containment reference.
	 * @see #setKeywordValue(NonEmptyString1)
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getKeywordType_KeywordValue()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='keywordValue' namespace='##targetNamespace'"
	 * @generated
	 */
	NonEmptyString1 getKeywordValue();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.KeywordType#getKeywordValue <em>Keyword Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keyword Value</em>' containment reference.
	 * @see #getKeywordValue()
	 * @generated
	 */
	void setKeywordValue(NonEmptyString1 value);

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
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getKeywordType_Idtag()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='idtag'"
	 * @generated
	 */
	String getIdtag();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.KeywordType#getIdtag <em>Idtag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idtag</em>' attribute.
	 * @see #getIdtag()
	 * @generated
	 */
	void setIdtag(String value);

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
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getKeywordType_Notes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='notes'"
	 * @generated
	 */
	List<String> getNotes();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.KeywordType#getNotes <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' attribute.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(List<String> value);

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
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getKeywordType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':4' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // KeywordType
