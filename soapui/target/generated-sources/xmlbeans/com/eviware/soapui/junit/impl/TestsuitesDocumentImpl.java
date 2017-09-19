/*
 * An XML document type.
 * Localname: testsuites
 * Namespace: http://eviware.com/soapui/junit
 * Java type: com.eviware.soapui.junit.TestsuitesDocument
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.junit.impl;
/**
 * A document containing one testsuites(@http://eviware.com/soapui/junit) element.
 *
 * This is a complex type.
 */
public class TestsuitesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.junit.TestsuitesDocument
{
    private static final long serialVersionUID = 1L;
    
    public TestsuitesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TESTSUITES$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/junit", "testsuites");
    
    
    /**
     * Gets the "testsuites" element
     */
    public com.eviware.soapui.junit.Testsuites getTestsuites()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.junit.Testsuites target = null;
            target = (com.eviware.soapui.junit.Testsuites)get_store().find_element_user(TESTSUITES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "testsuites" element
     */
    public void setTestsuites(com.eviware.soapui.junit.Testsuites testsuites)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.junit.Testsuites target = null;
            target = (com.eviware.soapui.junit.Testsuites)get_store().find_element_user(TESTSUITES$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.junit.Testsuites)get_store().add_element_user(TESTSUITES$0);
            }
            target.set(testsuites);
        }
    }
    
    /**
     * Appends and returns a new empty "testsuites" element
     */
    public com.eviware.soapui.junit.Testsuites addNewTestsuites()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.junit.Testsuites target = null;
            target = (com.eviware.soapui.junit.Testsuites)get_store().add_element_user(TESTSUITES$0);
            return target;
        }
    }
}
