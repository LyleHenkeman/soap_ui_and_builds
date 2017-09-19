/*
 * XML Type:  testsuites
 * Namespace: http://eviware.com/soapui/junit
 * Java type: com.eviware.soapui.junit.Testsuites
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.junit.impl;
/**
 * An XML testsuites(@http://eviware.com/soapui/junit).
 *
 * This is a complex type.
 */
public class TestsuitesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.junit.Testsuites
{
    private static final long serialVersionUID = 1L;
    
    public TestsuitesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TESTSUITE$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/junit", "testsuite");
    
    
    /**
     * Gets the "testsuite" element
     */
    public com.eviware.soapui.junit.Testsuite getTestsuite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.junit.Testsuite target = null;
            target = (com.eviware.soapui.junit.Testsuite)get_store().find_element_user(TESTSUITE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "testsuite" element
     */
    public void setTestsuite(com.eviware.soapui.junit.Testsuite testsuite)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.junit.Testsuite target = null;
            target = (com.eviware.soapui.junit.Testsuite)get_store().find_element_user(TESTSUITE$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.junit.Testsuite)get_store().add_element_user(TESTSUITE$0);
            }
            target.set(testsuite);
        }
    }
    
    /**
     * Appends and returns a new empty "testsuite" element
     */
    public com.eviware.soapui.junit.Testsuite addNewTestsuite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.junit.Testsuite target = null;
            target = (com.eviware.soapui.junit.Testsuite)get_store().add_element_user(TESTSUITE$0);
            return target;
        }
    }
}
