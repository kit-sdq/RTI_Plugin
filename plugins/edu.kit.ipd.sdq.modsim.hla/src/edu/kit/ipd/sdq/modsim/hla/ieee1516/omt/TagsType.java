/**
 */
package edu.kit.ipd.sdq.modsim.hla.ieee1516.omt;

import java.lang.String;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tags Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TagsType#getUpdateReflectTag <em>Update Reflect Tag</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TagsType#getSendReceiveTag <em>Send Receive Tag</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TagsType#getDeleteRemoveTag <em>Delete Remove Tag</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TagsType#getDivestitureRequestTag <em>Divestiture Request Tag</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TagsType#getDivestitureCompletionTag <em>Divestiture Completion Tag</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TagsType#getAcquisitionRequestTag <em>Acquisition Request Tag</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TagsType#getRequestUpdateTag <em>Request Update Tag</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TagsType#getAny <em>Any</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TagsType#getIdtag <em>Idtag</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TagsType#getNotes <em>Notes</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TagsType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getTagsType()
 * @model extendedMetaData="name='tagsType' kind='elementOnly'"
 * @generated
 */
public interface TagsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Update Reflect Tag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Reflect Tag</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Reflect Tag</em>' containment reference.
	 * @see #setUpdateReflectTag(TagType)
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getTagsType_UpdateReflectTag()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='updateReflectTag' namespace='##targetNamespace'"
	 * @generated
	 */
	TagType getUpdateReflectTag();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TagsType#getUpdateReflectTag <em>Update Reflect Tag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Reflect Tag</em>' containment reference.
	 * @see #getUpdateReflectTag()
	 * @generated
	 */
	void setUpdateReflectTag(TagType value);

	/**
	 * Returns the value of the '<em><b>Send Receive Tag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send Receive Tag</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send Receive Tag</em>' containment reference.
	 * @see #setSendReceiveTag(TagType)
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getTagsType_SendReceiveTag()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sendReceiveTag' namespace='##targetNamespace'"
	 * @generated
	 */
	TagType getSendReceiveTag();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TagsType#getSendReceiveTag <em>Send Receive Tag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Receive Tag</em>' containment reference.
	 * @see #getSendReceiveTag()
	 * @generated
	 */
	void setSendReceiveTag(TagType value);

	/**
	 * Returns the value of the '<em><b>Delete Remove Tag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delete Remove Tag</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Remove Tag</em>' containment reference.
	 * @see #setDeleteRemoveTag(TagType)
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getTagsType_DeleteRemoveTag()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deleteRemoveTag' namespace='##targetNamespace'"
	 * @generated
	 */
	TagType getDeleteRemoveTag();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TagsType#getDeleteRemoveTag <em>Delete Remove Tag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Remove Tag</em>' containment reference.
	 * @see #getDeleteRemoveTag()
	 * @generated
	 */
	void setDeleteRemoveTag(TagType value);

	/**
	 * Returns the value of the '<em><b>Divestiture Request Tag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Divestiture Request Tag</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Divestiture Request Tag</em>' containment reference.
	 * @see #setDivestitureRequestTag(TagType)
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getTagsType_DivestitureRequestTag()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='divestitureRequestTag' namespace='##targetNamespace'"
	 * @generated
	 */
	TagType getDivestitureRequestTag();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TagsType#getDivestitureRequestTag <em>Divestiture Request Tag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Divestiture Request Tag</em>' containment reference.
	 * @see #getDivestitureRequestTag()
	 * @generated
	 */
	void setDivestitureRequestTag(TagType value);

	/**
	 * Returns the value of the '<em><b>Divestiture Completion Tag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Divestiture Completion Tag</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Divestiture Completion Tag</em>' containment reference.
	 * @see #setDivestitureCompletionTag(TagType)
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getTagsType_DivestitureCompletionTag()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='divestitureCompletionTag' namespace='##targetNamespace'"
	 * @generated
	 */
	TagType getDivestitureCompletionTag();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TagsType#getDivestitureCompletionTag <em>Divestiture Completion Tag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Divestiture Completion Tag</em>' containment reference.
	 * @see #getDivestitureCompletionTag()
	 * @generated
	 */
	void setDivestitureCompletionTag(TagType value);

	/**
	 * Returns the value of the '<em><b>Acquisition Request Tag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acquisition Request Tag</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acquisition Request Tag</em>' containment reference.
	 * @see #setAcquisitionRequestTag(TagType)
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getTagsType_AcquisitionRequestTag()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='acquisitionRequestTag' namespace='##targetNamespace'"
	 * @generated
	 */
	TagType getAcquisitionRequestTag();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TagsType#getAcquisitionRequestTag <em>Acquisition Request Tag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acquisition Request Tag</em>' containment reference.
	 * @see #getAcquisitionRequestTag()
	 * @generated
	 */
	void setAcquisitionRequestTag(TagType value);

	/**
	 * Returns the value of the '<em><b>Request Update Tag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Update Tag</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Update Tag</em>' containment reference.
	 * @see #setRequestUpdateTag(TagType)
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getTagsType_RequestUpdateTag()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requestUpdateTag' namespace='##targetNamespace'"
	 * @generated
	 */
	TagType getRequestUpdateTag();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TagsType#getRequestUpdateTag <em>Request Update Tag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Update Tag</em>' containment reference.
	 * @see #getRequestUpdateTag()
	 * @generated
	 */
	void setRequestUpdateTag(TagType value);

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
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getTagsType_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':7' processing='strict'"
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
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getTagsType_Idtag()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='idtag'"
	 * @generated
	 */
	String getIdtag();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TagsType#getIdtag <em>Idtag</em>}' attribute.
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
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getTagsType_Notes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='notes'"
	 * @generated
	 */
	List<String> getNotes();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TagsType#getNotes <em>Notes</em>}' attribute.
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
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getTagsType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':10' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // TagsType
