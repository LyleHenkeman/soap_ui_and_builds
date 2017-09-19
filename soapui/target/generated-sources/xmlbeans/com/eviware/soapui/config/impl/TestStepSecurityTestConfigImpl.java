/*
 * XML Type:  TestStepSecurityTest
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.TestStepSecurityTestConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML TestStepSecurityTest(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class TestStepSecurityTestConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.TestStepSecurityTestConfig
{
    private static final long serialVersionUID = 1L;
    
    public TestStepSecurityTestConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TESTSTEPID$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "testStepId");
    private static final javax.xml.namespace.QName TESTSTEPSECURITYCHECK$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "testStepSecurityCheck");
    private static final javax.xml.namespace.QName TESTSTEPSECURITYSCAN$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "testStepSecurityScan");
    
    
    /**
     * Gets the "testStepId" element
     */
    public java.lang.String getTestStepId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TESTSTEPID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "testStepId" element
     */
    public org.apache.xmlbeans.XmlString xgetTestStepId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TESTSTEPID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "testStepId" element
     */
    public void setTestStepId(java.lang.String testStepId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TESTSTEPID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TESTSTEPID$0);
            }
            target.setStringValue(testStepId);
        }
    }
    
    /**
     * Sets (as xml) the "testStepId" element
     */
    public void xsetTestStepId(org.apache.xmlbeans.XmlString testStepId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TESTSTEPID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TESTSTEPID$0);
            }
            target.set(testStepId);
        }
    }
    
    /**
     * Gets a List of "testStepSecurityCheck" elements
     */
    public java.util.List<com.eviware.soapui.config.SecurityCheckConfig> getTestStepSecurityCheckList()
    {
        final class TestStepSecurityCheckList extends java.util.AbstractList<com.eviware.soapui.config.SecurityCheckConfig>
        {
            public com.eviware.soapui.config.SecurityCheckConfig get(int i)
                { return TestStepSecurityTestConfigImpl.this.getTestStepSecurityCheckArray(i); }
            
            public com.eviware.soapui.config.SecurityCheckConfig set(int i, com.eviware.soapui.config.SecurityCheckConfig o)
            {
                com.eviware.soapui.config.SecurityCheckConfig old = TestStepSecurityTestConfigImpl.this.getTestStepSecurityCheckArray(i);
                TestStepSecurityTestConfigImpl.this.setTestStepSecurityCheckArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.SecurityCheckConfig o)
                { TestStepSecurityTestConfigImpl.this.insertNewTestStepSecurityCheck(i).set(o); }
            
            public com.eviware.soapui.config.SecurityCheckConfig remove(int i)
            {
                com.eviware.soapui.config.SecurityCheckConfig old = TestStepSecurityTestConfigImpl.this.getTestStepSecurityCheckArray(i);
                TestStepSecurityTestConfigImpl.this.removeTestStepSecurityCheck(i);
                return old;
            }
            
            public int size()
                { return TestStepSecurityTestConfigImpl.this.sizeOfTestStepSecurityCheckArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TestStepSecurityCheckList();
        }
    }
    
    /**
     * Gets array of all "testStepSecurityCheck" elements
     * @deprecated
     */
    public com.eviware.soapui.config.SecurityCheckConfig[] getTestStepSecurityCheckArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.SecurityCheckConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.SecurityCheckConfig>();
            get_store().find_all_element_users(TESTSTEPSECURITYCHECK$2, targetList);
            com.eviware.soapui.config.SecurityCheckConfig[] result = new com.eviware.soapui.config.SecurityCheckConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "testStepSecurityCheck" element
     */
    public com.eviware.soapui.config.SecurityCheckConfig getTestStepSecurityCheckArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SecurityCheckConfig target = null;
            target = (com.eviware.soapui.config.SecurityCheckConfig)get_store().find_element_user(TESTSTEPSECURITYCHECK$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "testStepSecurityCheck" element
     */
    public int sizeOfTestStepSecurityCheckArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TESTSTEPSECURITYCHECK$2);
        }
    }
    
    /**
     * Sets array of all "testStepSecurityCheck" element
     */
    public void setTestStepSecurityCheckArray(com.eviware.soapui.config.SecurityCheckConfig[] testStepSecurityCheckArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(testStepSecurityCheckArray, TESTSTEPSECURITYCHECK$2);
        }
    }
    
    /**
     * Sets ith "testStepSecurityCheck" element
     */
    public void setTestStepSecurityCheckArray(int i, com.eviware.soapui.config.SecurityCheckConfig testStepSecurityCheck)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SecurityCheckConfig target = null;
            target = (com.eviware.soapui.config.SecurityCheckConfig)get_store().find_element_user(TESTSTEPSECURITYCHECK$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(testStepSecurityCheck);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "testStepSecurityCheck" element
     */
    public com.eviware.soapui.config.SecurityCheckConfig insertNewTestStepSecurityCheck(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SecurityCheckConfig target = null;
            target = (com.eviware.soapui.config.SecurityCheckConfig)get_store().insert_element_user(TESTSTEPSECURITYCHECK$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "testStepSecurityCheck" element
     */
    public com.eviware.soapui.config.SecurityCheckConfig addNewTestStepSecurityCheck()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SecurityCheckConfig target = null;
            target = (com.eviware.soapui.config.SecurityCheckConfig)get_store().add_element_user(TESTSTEPSECURITYCHECK$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "testStepSecurityCheck" element
     */
    public void removeTestStepSecurityCheck(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TESTSTEPSECURITYCHECK$2, i);
        }
    }
    
    /**
     * Gets a List of "testStepSecurityScan" elements
     */
    public java.util.List<com.eviware.soapui.config.SecurityScanConfig> getTestStepSecurityScanList()
    {
        final class TestStepSecurityScanList extends java.util.AbstractList<com.eviware.soapui.config.SecurityScanConfig>
        {
            public com.eviware.soapui.config.SecurityScanConfig get(int i)
                { return TestStepSecurityTestConfigImpl.this.getTestStepSecurityScanArray(i); }
            
            public com.eviware.soapui.config.SecurityScanConfig set(int i, com.eviware.soapui.config.SecurityScanConfig o)
            {
                com.eviware.soapui.config.SecurityScanConfig old = TestStepSecurityTestConfigImpl.this.getTestStepSecurityScanArray(i);
                TestStepSecurityTestConfigImpl.this.setTestStepSecurityScanArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.SecurityScanConfig o)
                { TestStepSecurityTestConfigImpl.this.insertNewTestStepSecurityScan(i).set(o); }
            
            public com.eviware.soapui.config.SecurityScanConfig remove(int i)
            {
                com.eviware.soapui.config.SecurityScanConfig old = TestStepSecurityTestConfigImpl.this.getTestStepSecurityScanArray(i);
                TestStepSecurityTestConfigImpl.this.removeTestStepSecurityScan(i);
                return old;
            }
            
            public int size()
                { return TestStepSecurityTestConfigImpl.this.sizeOfTestStepSecurityScanArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TestStepSecurityScanList();
        }
    }
    
    /**
     * Gets array of all "testStepSecurityScan" elements
     * @deprecated
     */
    public com.eviware.soapui.config.SecurityScanConfig[] getTestStepSecurityScanArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.SecurityScanConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.SecurityScanConfig>();
            get_store().find_all_element_users(TESTSTEPSECURITYSCAN$4, targetList);
            com.eviware.soapui.config.SecurityScanConfig[] result = new com.eviware.soapui.config.SecurityScanConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "testStepSecurityScan" element
     */
    public com.eviware.soapui.config.SecurityScanConfig getTestStepSecurityScanArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SecurityScanConfig target = null;
            target = (com.eviware.soapui.config.SecurityScanConfig)get_store().find_element_user(TESTSTEPSECURITYSCAN$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "testStepSecurityScan" element
     */
    public int sizeOfTestStepSecurityScanArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TESTSTEPSECURITYSCAN$4);
        }
    }
    
    /**
     * Sets array of all "testStepSecurityScan" element
     */
    public void setTestStepSecurityScanArray(com.eviware.soapui.config.SecurityScanConfig[] testStepSecurityScanArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(testStepSecurityScanArray, TESTSTEPSECURITYSCAN$4);
        }
    }
    
    /**
     * Sets ith "testStepSecurityScan" element
     */
    public void setTestStepSecurityScanArray(int i, com.eviware.soapui.config.SecurityScanConfig testStepSecurityScan)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SecurityScanConfig target = null;
            target = (com.eviware.soapui.config.SecurityScanConfig)get_store().find_element_user(TESTSTEPSECURITYSCAN$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(testStepSecurityScan);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "testStepSecurityScan" element
     */
    public com.eviware.soapui.config.SecurityScanConfig insertNewTestStepSecurityScan(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SecurityScanConfig target = null;
            target = (com.eviware.soapui.config.SecurityScanConfig)get_store().insert_element_user(TESTSTEPSECURITYSCAN$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "testStepSecurityScan" element
     */
    public com.eviware.soapui.config.SecurityScanConfig addNewTestStepSecurityScan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SecurityScanConfig target = null;
            target = (com.eviware.soapui.config.SecurityScanConfig)get_store().add_element_user(TESTSTEPSECURITYSCAN$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "testStepSecurityScan" element
     */
    public void removeTestStepSecurityScan(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TESTSTEPSECURITYSCAN$4, i);
        }
    }
}
