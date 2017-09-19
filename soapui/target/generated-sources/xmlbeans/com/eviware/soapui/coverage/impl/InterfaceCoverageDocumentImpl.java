/*
 * An XML document type.
 * Localname: interfaceCoverage
 * Namespace: http://eviware.com/soapui/coverage
 * Java type: com.eviware.soapui.coverage.InterfaceCoverageDocument
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.coverage.impl;
/**
 * A document containing one interfaceCoverage(@http://eviware.com/soapui/coverage) element.
 *
 * This is a complex type.
 */
public class InterfaceCoverageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.coverage.InterfaceCoverageDocument
{
    private static final long serialVersionUID = 1L;
    
    public InterfaceCoverageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTERFACECOVERAGE$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/coverage", "interfaceCoverage");
    
    
    /**
     * Gets the "interfaceCoverage" element
     */
    public com.eviware.soapui.coverage.InterfaceCoverageType getInterfaceCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.coverage.InterfaceCoverageType target = null;
            target = (com.eviware.soapui.coverage.InterfaceCoverageType)get_store().find_element_user(INTERFACECOVERAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "interfaceCoverage" element
     */
    public void setInterfaceCoverage(com.eviware.soapui.coverage.InterfaceCoverageType interfaceCoverage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.coverage.InterfaceCoverageType target = null;
            target = (com.eviware.soapui.coverage.InterfaceCoverageType)get_store().find_element_user(INTERFACECOVERAGE$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.coverage.InterfaceCoverageType)get_store().add_element_user(INTERFACECOVERAGE$0);
            }
            target.set(interfaceCoverage);
        }
    }
    
    /**
     * Appends and returns a new empty "interfaceCoverage" element
     */
    public com.eviware.soapui.coverage.InterfaceCoverageType addNewInterfaceCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.coverage.InterfaceCoverageType target = null;
            target = (com.eviware.soapui.coverage.InterfaceCoverageType)get_store().add_element_user(INTERFACECOVERAGE$0);
            return target;
        }
    }
}
