/*
 * XML Type:  testsuite
 * Namespace: http://eviware.com/soapui/junit
 * Java type: com.eviware.soapui.junit.Testsuite
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.junit.impl;
/**
 * An XML testsuite(@http://eviware.com/soapui/junit).
 *
 * This is a complex type.
 */
public class TestsuiteImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.junit.Testsuite
{
    private static final long serialVersionUID = 1L;
    
    public TestsuiteImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPERTIES$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/junit", "properties");
    private static final javax.xml.namespace.QName TESTCASE$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/junit", "testcase");
    private static final javax.xml.namespace.QName SYSTEMOUT$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/junit", "system-out");
    private static final javax.xml.namespace.QName SYSTEMERR$6 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/junit", "system-err");
    private static final javax.xml.namespace.QName ERRORS$8 = 
        new javax.xml.namespace.QName("", "errors");
    private static final javax.xml.namespace.QName FAILURES$10 = 
        new javax.xml.namespace.QName("", "failures");
    private static final javax.xml.namespace.QName NAME$12 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName TESTS$14 = 
        new javax.xml.namespace.QName("", "tests");
    private static final javax.xml.namespace.QName TIME$16 = 
        new javax.xml.namespace.QName("", "time");
    private static final javax.xml.namespace.QName PACKAGE$18 = 
        new javax.xml.namespace.QName("", "package");
    private static final javax.xml.namespace.QName ID$20 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "properties" element
     */
    public com.eviware.soapui.junit.Properties getProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.junit.Properties target = null;
            target = (com.eviware.soapui.junit.Properties)get_store().find_element_user(PROPERTIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "properties" element
     */
    public boolean isSetProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPERTIES$0) != 0;
        }
    }
    
    /**
     * Sets the "properties" element
     */
    public void setProperties(com.eviware.soapui.junit.Properties properties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.junit.Properties target = null;
            target = (com.eviware.soapui.junit.Properties)get_store().find_element_user(PROPERTIES$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.junit.Properties)get_store().add_element_user(PROPERTIES$0);
            }
            target.set(properties);
        }
    }
    
    /**
     * Appends and returns a new empty "properties" element
     */
    public com.eviware.soapui.junit.Properties addNewProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.junit.Properties target = null;
            target = (com.eviware.soapui.junit.Properties)get_store().add_element_user(PROPERTIES$0);
            return target;
        }
    }
    
    /**
     * Unsets the "properties" element
     */
    public void unsetProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPERTIES$0, 0);
        }
    }
    
    /**
     * Gets a List of "testcase" elements
     */
    public java.util.List<com.eviware.soapui.junit.Testcase> getTestcaseList()
    {
        final class TestcaseList extends java.util.AbstractList<com.eviware.soapui.junit.Testcase>
        {
            public com.eviware.soapui.junit.Testcase get(int i)
                { return TestsuiteImpl.this.getTestcaseArray(i); }
            
            public com.eviware.soapui.junit.Testcase set(int i, com.eviware.soapui.junit.Testcase o)
            {
                com.eviware.soapui.junit.Testcase old = TestsuiteImpl.this.getTestcaseArray(i);
                TestsuiteImpl.this.setTestcaseArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.junit.Testcase o)
                { TestsuiteImpl.this.insertNewTestcase(i).set(o); }
            
            public com.eviware.soapui.junit.Testcase remove(int i)
            {
                com.eviware.soapui.junit.Testcase old = TestsuiteImpl.this.getTestcaseArray(i);
                TestsuiteImpl.this.removeTestcase(i);
                return old;
            }
            
            public int size()
                { return TestsuiteImpl.this.sizeOfTestcaseArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TestcaseList();
        }
    }
    
    /**
     * Gets array of all "testcase" elements
     * @deprecated
     */
    public com.eviware.soapui.junit.Testcase[] getTestcaseArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.junit.Testcase> targetList = new java.util.ArrayList<com.eviware.soapui.junit.Testcase>();
            get_store().find_all_element_users(TESTCASE$2, targetList);
            com.eviware.soapui.junit.Testcase[] result = new com.eviware.soapui.junit.Testcase[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "testcase" element
     */
    public com.eviware.soapui.junit.Testcase getTestcaseArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.junit.Testcase target = null;
            target = (com.eviware.soapui.junit.Testcase)get_store().find_element_user(TESTCASE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "testcase" element
     */
    public int sizeOfTestcaseArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TESTCASE$2);
        }
    }
    
    /**
     * Sets array of all "testcase" element
     */
    public void setTestcaseArray(com.eviware.soapui.junit.Testcase[] testcaseArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(testcaseArray, TESTCASE$2);
        }
    }
    
    /**
     * Sets ith "testcase" element
     */
    public void setTestcaseArray(int i, com.eviware.soapui.junit.Testcase testcase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.junit.Testcase target = null;
            target = (com.eviware.soapui.junit.Testcase)get_store().find_element_user(TESTCASE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(testcase);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "testcase" element
     */
    public com.eviware.soapui.junit.Testcase insertNewTestcase(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.junit.Testcase target = null;
            target = (com.eviware.soapui.junit.Testcase)get_store().insert_element_user(TESTCASE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "testcase" element
     */
    public com.eviware.soapui.junit.Testcase addNewTestcase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.junit.Testcase target = null;
            target = (com.eviware.soapui.junit.Testcase)get_store().add_element_user(TESTCASE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "testcase" element
     */
    public void removeTestcase(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TESTCASE$2, i);
        }
    }
    
    /**
     * Gets the "system-out" element
     */
    public java.lang.String getSystemOut()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYSTEMOUT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "system-out" element
     */
    public org.apache.xmlbeans.XmlNormalizedString xgetSystemOut()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNormalizedString target = null;
            target = (org.apache.xmlbeans.XmlNormalizedString)get_store().find_element_user(SYSTEMOUT$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "system-out" element
     */
    public void setSystemOut(java.lang.String systemOut)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYSTEMOUT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SYSTEMOUT$4);
            }
            target.setStringValue(systemOut);
        }
    }
    
    /**
     * Sets (as xml) the "system-out" element
     */
    public void xsetSystemOut(org.apache.xmlbeans.XmlNormalizedString systemOut)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNormalizedString target = null;
            target = (org.apache.xmlbeans.XmlNormalizedString)get_store().find_element_user(SYSTEMOUT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNormalizedString)get_store().add_element_user(SYSTEMOUT$4);
            }
            target.set(systemOut);
        }
    }
    
    /**
     * Gets the "system-err" element
     */
    public java.lang.String getSystemErr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYSTEMERR$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "system-err" element
     */
    public org.apache.xmlbeans.XmlNormalizedString xgetSystemErr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNormalizedString target = null;
            target = (org.apache.xmlbeans.XmlNormalizedString)get_store().find_element_user(SYSTEMERR$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "system-err" element
     */
    public void setSystemErr(java.lang.String systemErr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYSTEMERR$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SYSTEMERR$6);
            }
            target.setStringValue(systemErr);
        }
    }
    
    /**
     * Sets (as xml) the "system-err" element
     */
    public void xsetSystemErr(org.apache.xmlbeans.XmlNormalizedString systemErr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNormalizedString target = null;
            target = (org.apache.xmlbeans.XmlNormalizedString)get_store().find_element_user(SYSTEMERR$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNormalizedString)get_store().add_element_user(SYSTEMERR$6);
            }
            target.set(systemErr);
        }
    }
    
    /**
     * Gets the "errors" attribute
     */
    public int getErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORS$8);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "errors" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(ERRORS$8);
            return target;
        }
    }
    
    /**
     * True if has "errors" attribute
     */
    public boolean isSetErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ERRORS$8) != null;
        }
    }
    
    /**
     * Sets the "errors" attribute
     */
    public void setErrors(int errors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ERRORS$8);
            }
            target.setIntValue(errors);
        }
    }
    
    /**
     * Sets (as xml) the "errors" attribute
     */
    public void xsetErrors(org.apache.xmlbeans.XmlInt errors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(ERRORS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(ERRORS$8);
            }
            target.set(errors);
        }
    }
    
    /**
     * Unsets the "errors" attribute
     */
    public void unsetErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ERRORS$8);
        }
    }
    
    /**
     * Gets the "failures" attribute
     */
    public int getFailures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILURES$10);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "failures" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetFailures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(FAILURES$10);
            return target;
        }
    }
    
    /**
     * True if has "failures" attribute
     */
    public boolean isSetFailures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FAILURES$10) != null;
        }
    }
    
    /**
     * Sets the "failures" attribute
     */
    public void setFailures(int failures)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILURES$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FAILURES$10);
            }
            target.setIntValue(failures);
        }
    }
    
    /**
     * Sets (as xml) the "failures" attribute
     */
    public void xsetFailures(org.apache.xmlbeans.XmlInt failures)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(FAILURES$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(FAILURES$10);
            }
            target.set(failures);
        }
    }
    
    /**
     * Unsets the "failures" attribute
     */
    public void unsetFailures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FAILURES$10);
        }
    }
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$12);
            return target;
        }
    }
    
    /**
     * True if has "name" attribute
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAME$12) != null;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$12);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$12);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" attribute
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAME$12);
        }
    }
    
    /**
     * Gets the "tests" attribute
     */
    public int getTests()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TESTS$14);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "tests" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetTests()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(TESTS$14);
            return target;
        }
    }
    
    /**
     * True if has "tests" attribute
     */
    public boolean isSetTests()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TESTS$14) != null;
        }
    }
    
    /**
     * Sets the "tests" attribute
     */
    public void setTests(int tests)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TESTS$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TESTS$14);
            }
            target.setIntValue(tests);
        }
    }
    
    /**
     * Sets (as xml) the "tests" attribute
     */
    public void xsetTests(org.apache.xmlbeans.XmlInt tests)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(TESTS$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(TESTS$14);
            }
            target.set(tests);
        }
    }
    
    /**
     * Unsets the "tests" attribute
     */
    public void unsetTests()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TESTS$14);
        }
    }
    
    /**
     * Gets the "time" attribute
     */
    public java.lang.String getTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIME$16);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "time" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TIME$16);
            return target;
        }
    }
    
    /**
     * True if has "time" attribute
     */
    public boolean isSetTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TIME$16) != null;
        }
    }
    
    /**
     * Sets the "time" attribute
     */
    public void setTime(java.lang.String time)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIME$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIME$16);
            }
            target.setStringValue(time);
        }
    }
    
    /**
     * Sets (as xml) the "time" attribute
     */
    public void xsetTime(org.apache.xmlbeans.XmlString time)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TIME$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TIME$16);
            }
            target.set(time);
        }
    }
    
    /**
     * Unsets the "time" attribute
     */
    public void unsetTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TIME$16);
        }
    }
    
    /**
     * Gets the "package" attribute
     */
    public java.lang.String getPackage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PACKAGE$18);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "package" attribute
     */
    public org.apache.xmlbeans.XmlString xgetPackage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PACKAGE$18);
            return target;
        }
    }
    
    /**
     * True if has "package" attribute
     */
    public boolean isSetPackage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PACKAGE$18) != null;
        }
    }
    
    /**
     * Sets the "package" attribute
     */
    public void setPackage(java.lang.String xpackage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PACKAGE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PACKAGE$18);
            }
            target.setStringValue(xpackage);
        }
    }
    
    /**
     * Sets (as xml) the "package" attribute
     */
    public void xsetPackage(org.apache.xmlbeans.XmlString xpackage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PACKAGE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PACKAGE$18);
            }
            target.set(xpackage);
        }
    }
    
    /**
     * Unsets the "package" attribute
     */
    public void unsetPackage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PACKAGE$18);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$20);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlString xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$20);
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$20) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$20);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlString id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$20);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$20);
        }
    }
}
