/*
 * XML Type:  testcase
 * Namespace: http://eviware.com/soapui/junit
 * Java type: com.eviware.soapui.junit.Testcase
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.junit.impl;
/**
 * An XML testcase(@http://eviware.com/soapui/junit).
 *
 * This is a complex type.
 */
public class TestcaseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.junit.Testcase
{
    private static final long serialVersionUID = 1L;
    
    public TestcaseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPERTIES$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/junit", "properties");
    private static final javax.xml.namespace.QName FAILURE$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/junit", "failure");
    private static final javax.xml.namespace.QName ERROR$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/junit", "error");
    private static final javax.xml.namespace.QName NAME$6 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName TIME$8 = 
        new javax.xml.namespace.QName("", "time");
    private static final javax.xml.namespace.QName PACKAGE$10 = 
        new javax.xml.namespace.QName("", "package");
    
    
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
     * Gets the "failure" element
     */
    public com.eviware.soapui.junit.FailureDocument.Failure getFailure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.junit.FailureDocument.Failure target = null;
            target = (com.eviware.soapui.junit.FailureDocument.Failure)get_store().find_element_user(FAILURE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "failure" element
     */
    public boolean isSetFailure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FAILURE$2) != 0;
        }
    }
    
    /**
     * Sets the "failure" element
     */
    public void setFailure(com.eviware.soapui.junit.FailureDocument.Failure failure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.junit.FailureDocument.Failure target = null;
            target = (com.eviware.soapui.junit.FailureDocument.Failure)get_store().find_element_user(FAILURE$2, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.junit.FailureDocument.Failure)get_store().add_element_user(FAILURE$2);
            }
            target.set(failure);
        }
    }
    
    /**
     * Appends and returns a new empty "failure" element
     */
    public com.eviware.soapui.junit.FailureDocument.Failure addNewFailure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.junit.FailureDocument.Failure target = null;
            target = (com.eviware.soapui.junit.FailureDocument.Failure)get_store().add_element_user(FAILURE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "failure" element
     */
    public void unsetFailure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FAILURE$2, 0);
        }
    }
    
    /**
     * Gets the "error" element
     */
    public com.eviware.soapui.junit.ErrorDocument.Error getError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.junit.ErrorDocument.Error target = null;
            target = (com.eviware.soapui.junit.ErrorDocument.Error)get_store().find_element_user(ERROR$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "error" element
     */
    public boolean isSetError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERROR$4) != 0;
        }
    }
    
    /**
     * Sets the "error" element
     */
    public void setError(com.eviware.soapui.junit.ErrorDocument.Error error)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.junit.ErrorDocument.Error target = null;
            target = (com.eviware.soapui.junit.ErrorDocument.Error)get_store().find_element_user(ERROR$4, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.junit.ErrorDocument.Error)get_store().add_element_user(ERROR$4);
            }
            target.set(error);
        }
    }
    
    /**
     * Appends and returns a new empty "error" element
     */
    public com.eviware.soapui.junit.ErrorDocument.Error addNewError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.junit.ErrorDocument.Error target = null;
            target = (com.eviware.soapui.junit.ErrorDocument.Error)get_store().add_element_user(ERROR$4);
            return target;
        }
    }
    
    /**
     * Unsets the "error" element
     */
    public void unsetError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERROR$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
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
            return get_store().find_attribute_user(NAME$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$6);
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
            get_store().remove_attribute(NAME$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIME$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TIME$8);
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
            return get_store().find_attribute_user(TIME$8) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIME$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIME$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TIME$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TIME$8);
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
            get_store().remove_attribute(TIME$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PACKAGE$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PACKAGE$10);
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
            return get_store().find_attribute_user(PACKAGE$10) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PACKAGE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PACKAGE$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PACKAGE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PACKAGE$10);
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
            get_store().remove_attribute(PACKAGE$10);
        }
    }
}
