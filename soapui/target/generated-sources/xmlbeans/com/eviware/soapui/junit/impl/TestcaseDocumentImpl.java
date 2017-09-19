/*
 * An XML document type.
 * Localname: testcase
 * Namespace: http://eviware.com/soapui/junit
 * Java type: com.eviware.soapui.junit.TestcaseDocument
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.junit.impl;
/**
 * A document containing one testcase(@http://eviware.com/soapui/junit) element.
 *
 * This is a complex type.
 */
public class TestcaseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.junit.TestcaseDocument
{
    private static final long serialVersionUID = 1L;
    
    public TestcaseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TESTCASE$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/junit", "testcase");
    
    
    /**
     * Gets the "testcase" element
     */
    public com.eviware.soapui.junit.Testcase getTestcase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.junit.Testcase target = null;
            target = (com.eviware.soapui.junit.Testcase)get_store().find_element_user(TESTCASE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "testcase" element
     */
    public void setTestcase(com.eviware.soapui.junit.Testcase testcase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.junit.Testcase target = null;
            target = (com.eviware.soapui.junit.Testcase)get_store().find_element_user(TESTCASE$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.junit.Testcase)get_store().add_element_user(TESTCASE$0);
            }
            target.set(testcase);
        }
    }
    
    /**
     * Appends and returns a new empty "testcase" element
     */
    public com.eviware.soapui.junit.Testcase addNewTestcase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.junit.Testcase target = null;
            target = (com.eviware.soapui.junit.Testcase)get_store().add_element_user(TESTCASE$0);
            return target;
        }
    }
}
