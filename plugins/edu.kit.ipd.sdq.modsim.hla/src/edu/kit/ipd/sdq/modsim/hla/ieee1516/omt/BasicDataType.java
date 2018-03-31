/**
 */
package edu.kit.ipd.sdq.modsim.hla.ieee1516.omt;

import java.lang.String;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.BasicDataType#getName <em>Name</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.BasicDataType#getSize <em>Size</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.BasicDataType#getInterpretation <em>Interpretation</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.BasicDataType#getEndian <em>Endian</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.BasicDataType#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.BasicDataType#getAny <em>Any</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.BasicDataType#getIdtag <em>Idtag</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.BasicDataType#getNotes <em>Notes</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.BasicDataType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getBasicDataType()
 * @model extendedMetaData="name='basicDataType' kind='elementOnly'"
 * @generated
 */
public interface BasicDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(IdentifierType)
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getBasicDataType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	IdentifierType getName();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.BasicDataType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(IdentifierType value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * defines the size of the data representation in terms of the number of bits contained in the data representation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size</em>' containment reference.
	 * @see #setSize(Size)
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getBasicDataType_Size()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='size' namespace='##targetNamespace'"
	 * @generated
	 */
	Size getSize();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.BasicDataType#getSize <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' containment reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Size value);

	/**
	 * Returns the value of the '<em><b>Interpretation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * describes how the data representation should be interpreted
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interpretation</em>' containment reference.
	 * @see #setInterpretation(edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String)
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getBasicDataType_Interpretation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='interpretation' namespace='##targetNamespace'"
	 * @generated
	 */
	edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String getInterpretation();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.BasicDataType#getInterpretation <em>Interpretation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpretation</em>' containment reference.
	 * @see #getInterpretation()
	 * @generated
	 */
	void setInterpretation(edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String value);

	/**
	 * Returns the value of the '<em><b>Endian</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * describe how multiple bytes within the representation are arranged
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endian</em>' containment reference.
	 * @see #setEndian(EndianType)
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getBasicDataType_Endian()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='endian' namespace='##targetNamespace'"
	 * @generated
	 */
	EndianType getEndian();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.BasicDataType#getEndian <em>Endian</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endian</em>' containment reference.
	 * @see #getEndian()
	 * @generated
	 */
	void setEndian(EndianType value);

	/**
	 * Returns the value of the '<em><b>Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * describes, in detail, the encoding of the data representation (e.g., the bit ordering) as delivered to and received from the RTI
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encoding</em>' containment reference.
	 * @see #setEncoding(edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String)
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getBasicDataType_Encoding()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='encoding' namespace='##targetNamespace'"
	 * @generated
	 */
	edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String getEncoding();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.BasicDataType#getEncoding <em>Encoding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding</em>' containment reference.
	 * @see #getEncoding()
	 * @generated
	 */
	void setEncoding(edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String value);

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getBasicDataType_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':5' processing='strict'"
	 * @generated
	 */
	FeatureMap getAny();

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
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getBasicDataType_Idtag()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='idtag'"
	 * @generated
	 */
	String getIdtag();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.BasicDataType#getIdtag <em>Idtag</em>}' attribute.
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
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getBasicDataType_Notes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='notes'"
	 * @generated
	 */
	List<String> getNotes();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.BasicDataType#getNotes <em>Notes</em>}' attribute.
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
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getBasicDataType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':8' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // BasicDataType
