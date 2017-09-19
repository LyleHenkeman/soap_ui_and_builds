/*
 * XML Type:  TestOnDemandTxn
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.TestOnDemandTxnConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML TestOnDemandTxn(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class TestOnDemandTxnConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.TestOnDemandTxnConfig
{
    private static final long serialVersionUID = 1L;
    
    public TestOnDemandTxnConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TESTSUITE$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "TestSuite");
    private static final javax.xml.namespace.QName TESTCASE$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "TestCase");
    private static final javax.xml.namespace.QName CONTENT$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "Content");
    private static final javax.xml.namespace.QName PASSWORD$6 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "Password");
    
    
    /**
     * Gets the "TestSuite" element
     */
    public com.eviware.soapui.config.TestOnDemandTestSuiteConfig getTestSuite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestOnDemandTestSuiteConfig target = null;
            target = (com.eviware.soapui.config.TestOnDemandTestSuiteConfig)get_store().find_element_user(TESTSUITE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TestSuite" element
     */
    public void setTestSuite(com.eviware.soapui.config.TestOnDemandTestSuiteConfig testSuite)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestOnDemandTestSuiteConfig target = null;
            target = (com.eviware.soapui.config.TestOnDemandTestSuiteConfig)get_store().find_element_user(TESTSUITE$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.TestOnDemandTestSuiteConfig)get_store().add_element_user(TESTSUITE$0);
            }
            target.set(testSuite);
        }
    }
    
    /**
     * Appends and returns a new empty "TestSuite" element
     */
    public com.eviware.soapui.config.TestOnDemandTestSuiteConfig addNewTestSuite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestOnDemandTestSuiteConfig target = null;
            target = (com.eviware.soapui.config.TestOnDemandTestSuiteConfig)get_store().add_element_user(TESTSUITE$0);
            return target;
        }
    }
    
    /**
     * Gets the "TestCase" element
     */
    public com.eviware.soapui.config.TestOnDemandTestCaseConfig getTestCase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestOnDemandTestCaseConfig target = null;
            target = (com.eviware.soapui.config.TestOnDemandTestCaseConfig)get_store().find_element_user(TESTCASE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TestCase" element
     */
    public void setTestCase(com.eviware.soapui.config.TestOnDemandTestCaseConfig testCase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestOnDemandTestCaseConfig target = null;
            target = (com.eviware.soapui.config.TestOnDemandTestCaseConfig)get_store().find_element_user(TESTCASE$2, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.TestOnDemandTestCaseConfig)get_store().add_element_user(TESTCASE$2);
            }
            target.set(testCase);
        }
    }
    
    /**
     * Appends and returns a new empty "TestCase" element
     */
    public com.eviware.soapui.config.TestOnDemandTestCaseConfig addNewTestCase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestOnDemandTestCaseConfig target = null;
            target = (com.eviware.soapui.config.TestOnDemandTestCaseConfig)get_store().add_element_user(TESTCASE$2);
            return target;
        }
    }
    
    /**
     * Gets the "Content" element
     */
    public com.eviware.soapui.config.TestOnDemandContentConfig getContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestOnDemandContentConfig target = null;
            target = (com.eviware.soapui.config.TestOnDemandContentConfig)get_store().find_element_user(CONTENT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Content" element
     */
    public void setContent(com.eviware.soapui.config.TestOnDemandContentConfig content)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestOnDemandContentConfig target = null;
            target = (com.eviware.soapui.config.TestOnDemandContentConfig)get_store().find_element_user(CONTENT$4, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.TestOnDemandContentConfig)get_store().add_element_user(CONTENT$4);
            }
            target.set(content);
        }
    }
    
    /**
     * Appends and returns a new empty "Content" element
     */
    public com.eviware.soapui.config.TestOnDemandContentConfig addNewContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestOnDemandContentConfig target = null;
            target = (com.eviware.soapui.config.TestOnDemandContentConfig)get_store().add_element_user(CONTENT$4);
            return target;
        }
    }
    
    /**
     * Gets the "Password" element
     */
    public com.eviware.soapui.config.TestOnDemandProjectPasswordConfig getPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestOnDemandProjectPasswordConfig target = null;
            target = (com.eviware.soapui.config.TestOnDemandProjectPasswordConfig)get_store().find_element_user(PASSWORD$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Password" element
     */
    public void setPassword(com.eviware.soapui.config.TestOnDemandProjectPasswordConfig password)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestOnDemandProjectPasswordConfig target = null;
            target = (com.eviware.soapui.config.TestOnDemandProjectPasswordConfig)get_store().find_element_user(PASSWORD$6, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.TestOnDemandProjectPasswordConfig)get_store().add_element_user(PASSWORD$6);
            }
            target.set(password);
        }
    }
    
    /**
     * Appends and returns a new empty "Password" element
     */
    public com.eviware.soapui.config.TestOnDemandProjectPasswordConfig addNewPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestOnDemandProjectPasswordConfig target = null;
            target = (com.eviware.soapui.config.TestOnDemandProjectPasswordConfig)get_store().add_element_user(PASSWORD$6);
            return target;
        }
    }
}
