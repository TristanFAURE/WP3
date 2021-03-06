package org.eclipse.emf.doc2model.doc2model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.doc2model.doc2model.ReferenceAction#getReferenceAttribute <em>Reference Attribute</em>}</li>
 *   <li>{@link org.eclipse.emf.doc2model.doc2model.ReferenceAction#getCurrentElement <em>Current Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.doc2model.doc2model.Doc2modelPackage#getReferenceAction()
 * @model abstract="true"
 * @generated
 */
public interface ReferenceAction extends Action {
	/**
	 * Returns the value of the '<em><b>Reference Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Attribute</em>' attribute.
	 * @see #setReferenceAttribute(String)
	 * @see org.eclipse.emf.doc2model.doc2model.Doc2modelPackage#getReferenceAction_ReferenceAttribute()
	 * @model
	 * @generated
	 */
	String getReferenceAttribute();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.doc2model.doc2model.ReferenceAction#getReferenceAttribute <em>Reference Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Attribute</em>' attribute.
	 * @see #getReferenceAttribute()
	 * @generated
	 */
	void setReferenceAttribute(String value);

	/**
	 * Returns the value of the '<em><b>Current Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Element</em>' reference.
	 * @see #setCurrentElement(Value)
	 * @see org.eclipse.emf.doc2model.doc2model.Doc2modelPackage#getReferenceAction_CurrentElement()
	 * @model
	 * @generated
	 */
	Value getCurrentElement();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.doc2model.doc2model.ReferenceAction#getCurrentElement <em>Current Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Element</em>' reference.
	 * @see #getCurrentElement()
	 * @generated
	 */
	void setCurrentElement(Value value);

} // ReferenceAction
