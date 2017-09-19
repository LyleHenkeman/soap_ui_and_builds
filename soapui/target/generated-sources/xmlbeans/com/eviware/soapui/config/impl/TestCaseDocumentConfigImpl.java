/*
 * An XML document type.
 * Localname: testCase
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.TestCaseDocumentConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * A document containing one testCase(@http://eviware.com/soapui/config) element.
 *
 * This is a complex type.
 */
public class TestCaseDocumentConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.TestCaseDocumentConfig
{
    private static final long serialVersionUID = 1L;
    
    public TestCaseDocumentConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TESTCASE$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "testCase");
    
    
    /**
     * Gets the "testCase" element
     */
    public com.eviware.soapui.config.TestCaseConfig getTestCase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestCaseConfig target = null;
            target = (com.eviware.soapui.config.TestCaseConfig)get_store().find_element_user(TESTCASE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "testCase" element
     */
    public void setTestCase(com.eviware.soapui.config.TestCaseConfig testCase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestCaseConfig target = null;
            target = (com.eviware.soapui.config.TestCaseConfig)get_store().find_element_user(TESTCASE$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.TestCaseConfig)get_store().add_element_user(TESTCASE$0);
            }
            target.set(testCase);
        }
    }
    
    /**
     * Appends and returns a new empty "testCase" element
     */
    public com.eviware.soapui.config.TestCaseConfig addNewTestCase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestCaseConfig target = null;
            target = (com.eviware.soapui.config.TestCaseConfig)get_store().add_element_user(TESTCASE$0);
            return target;
        }
    }
}
