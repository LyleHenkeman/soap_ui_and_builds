/*
 * An XML document type.
 * Localname: operationCoverage
 * Namespace: http://eviware.com/soapui/coverage
 * Java type: com.eviware.soapui.coverage.OperationCoverageDocument
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.coverage.impl;
/**
 * A document containing one operationCoverage(@http://eviware.com/soapui/coverage) element.
 *
 * This is a complex type.
 */
public class OperationCoverageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.coverage.OperationCoverageDocument
{
    private static final long serialVersionUID = 1L;
    
    public OperationCoverageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATIONCOVERAGE$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/coverage", "operationCoverage");
    
    
    /**
     * Gets the "operationCoverage" element
     */
    public com.eviware.soapui.coverage.OperationCoverageType getOperationCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.coverage.OperationCoverageType target = null;
            target = (com.eviware.soapui.coverage.OperationCoverageType)get_store().find_element_user(OPERATIONCOVERAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "operationCoverage" element
     */
    public void setOperationCoverage(com.eviware.soapui.coverage.OperationCoverageType operationCoverage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.coverage.OperationCoverageType target = null;
            target = (com.eviware.soapui.coverage.OperationCoverageType)get_store().find_element_user(OPERATIONCOVERAGE$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.coverage.OperationCoverageType)get_store().add_element_user(OPERATIONCOVERAGE$0);
            }
            target.set(operationCoverage);
        }
    }
    
    /**
     * Appends and returns a new empty "operationCoverage" element
     */
    public com.eviware.soapui.coverage.OperationCoverageType addNewOperationCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.coverage.OperationCoverageType target = null;
            target = (com.eviware.soapui.coverage.OperationCoverageType)get_store().add_element_user(OPERATIONCOVERAGE$0);
            return target;
        }
    }
}
