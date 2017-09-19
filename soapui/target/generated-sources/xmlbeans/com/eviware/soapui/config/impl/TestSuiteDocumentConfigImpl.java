/*
 * An XML document type.
 * Localname: testSuite
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.TestSuiteDocumentConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * A document containing one testSuite(@http://eviware.com/soapui/config) element.
 *
 * This is a complex type.
 */
public class TestSuiteDocumentConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.TestSuiteDocumentConfig
{
    private static final long serialVersionUID = 1L;
    
    public TestSuiteDocumentConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TESTSUITE$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "testSuite");
    
    
    /**
     * Gets the "testSuite" element
     */
    public com.eviware.soapui.config.TestSuiteConfig getTestSuite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestSuiteConfig target = null;
            target = (com.eviware.soapui.config.TestSuiteConfig)get_store().find_element_user(TESTSUITE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "testSuite" element
     */
    public void setTestSuite(com.eviware.soapui.config.TestSuiteConfig testSuite)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestSuiteConfig target = null;
            target = (com.eviware.soapui.config.TestSuiteConfig)get_store().find_element_user(TESTSUITE$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.TestSuiteConfig)get_store().add_element_user(TESTSUITE$0);
            }
            target.set(testSuite);
        }
    }
    
    /**
     * Appends and returns a new empty "testSuite" element
     */
    public com.eviware.soapui.config.TestSuiteConfig addNewTestSuite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestSuiteConfig target = null;
            target = (com.eviware.soapui.config.TestSuiteConfig)get_store().add_element_user(TESTSUITE$0);
            return target;
        }
    }
}
