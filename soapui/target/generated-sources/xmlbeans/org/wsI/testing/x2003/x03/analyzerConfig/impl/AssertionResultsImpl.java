/*
 * XML Type:  assertionResults
 * Namespace: http://www.ws-i.org/testing/2003/03/analyzerConfig/
 * Java type: org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults
 *
 * Automatically generated - do not modify.
 */
package org.wsI.testing.x2003.x03.analyzerConfig.impl;
/**
 * An XML assertionResults(@http://www.ws-i.org/testing/2003/03/analyzerConfig/).
 *
 * This is a complex type.
 */
public class AssertionResultsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults
{
    private static final long serialVersionUID = 1L;
    
    public AssertionResultsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName MESSAGEENTRY$2 = 
        new javax.xml.namespace.QName("", "messageEntry");
    private static final javax.xml.namespace.QName ASSERTIONDESCRIPTION$4 = 
        new javax.xml.namespace.QName("", "assertionDescription");
    private static final javax.xml.namespace.QName FAILUREMESSAGE$6 = 
        new javax.xml.namespace.QName("", "failureMessage");
    private static final javax.xml.namespace.QName FAILUREDETAIL$8 = 
        new javax.xml.namespace.QName("", "failureDetail");
    
    
    /**
     * Gets the "type" attribute
     */
    public org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults.Type.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPE$0);
            }
            if (target == null)
            {
                return null;
            }
            return (org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults.Type.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults.Type xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults.Type target = null;
            target = (org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults.Type)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults.Type)get_default_attribute_value(TYPE$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "type" attribute
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE$0) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults.Type.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$0);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults.Type type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults.Type target = null;
            target = (org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults.Type)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults.Type)get_store().add_attribute_user(TYPE$0);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" attribute
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE$0);
        }
    }
    
    /**
     * Gets the "messageEntry" attribute
     */
    public boolean getMessageEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MESSAGEENTRY$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MESSAGEENTRY$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "messageEntry" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetMessageEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MESSAGEENTRY$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(MESSAGEENTRY$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "messageEntry" attribute
     */
    public boolean isSetMessageEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MESSAGEENTRY$2) != null;
        }
    }
    
    /**
     * Sets the "messageEntry" attribute
     */
    public void setMessageEntry(boolean messageEntry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MESSAGEENTRY$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MESSAGEENTRY$2);
            }
            target.setBooleanValue(messageEntry);
        }
    }
    
    /**
     * Sets (as xml) the "messageEntry" attribute
     */
    public void xsetMessageEntry(org.apache.xmlbeans.XmlBoolean messageEntry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MESSAGEENTRY$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(MESSAGEENTRY$2);
            }
            target.set(messageEntry);
        }
    }
    
    /**
     * Unsets the "messageEntry" attribute
     */
    public void unsetMessageEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MESSAGEENTRY$2);
        }
    }
    
    /**
     * Gets the "assertionDescription" attribute
     */
    public boolean getAssertionDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ASSERTIONDESCRIPTION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ASSERTIONDESCRIPTION$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "assertionDescription" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAssertionDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ASSERTIONDESCRIPTION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ASSERTIONDESCRIPTION$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "assertionDescription" attribute
     */
    public boolean isSetAssertionDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ASSERTIONDESCRIPTION$4) != null;
        }
    }
    
    /**
     * Sets the "assertionDescription" attribute
     */
    public void setAssertionDescription(boolean assertionDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ASSERTIONDESCRIPTION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ASSERTIONDESCRIPTION$4);
            }
            target.setBooleanValue(assertionDescription);
        }
    }
    
    /**
     * Sets (as xml) the "assertionDescription" attribute
     */
    public void xsetAssertionDescription(org.apache.xmlbeans.XmlBoolean assertionDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ASSERTIONDESCRIPTION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ASSERTIONDESCRIPTION$4);
            }
            target.set(assertionDescription);
        }
    }
    
    /**
     * Unsets the "assertionDescription" attribute
     */
    public void unsetAssertionDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ASSERTIONDESCRIPTION$4);
        }
    }
    
    /**
     * Gets the "failureMessage" attribute
     */
    public boolean getFailureMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILUREMESSAGE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FAILUREMESSAGE$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "failureMessage" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFailureMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FAILUREMESSAGE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(FAILUREMESSAGE$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "failureMessage" attribute
     */
    public boolean isSetFailureMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FAILUREMESSAGE$6) != null;
        }
    }
    
    /**
     * Sets the "failureMessage" attribute
     */
    public void setFailureMessage(boolean failureMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILUREMESSAGE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FAILUREMESSAGE$6);
            }
            target.setBooleanValue(failureMessage);
        }
    }
    
    /**
     * Sets (as xml) the "failureMessage" attribute
     */
    public void xsetFailureMessage(org.apache.xmlbeans.XmlBoolean failureMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FAILUREMESSAGE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FAILUREMESSAGE$6);
            }
            target.set(failureMessage);
        }
    }
    
    /**
     * Unsets the "failureMessage" attribute
     */
    public void unsetFailureMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FAILUREMESSAGE$6);
        }
    }
    
    /**
     * Gets the "failureDetail" attribute
     */
    public boolean getFailureDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILUREDETAIL$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FAILUREDETAIL$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "failureDetail" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFailureDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FAILUREDETAIL$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(FAILUREDETAIL$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "failureDetail" attribute
     */
    public boolean isSetFailureDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FAILUREDETAIL$8) != null;
        }
    }
    
    /**
     * Sets the "failureDetail" attribute
     */
    public void setFailureDetail(boolean failureDetail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILUREDETAIL$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FAILUREDETAIL$8);
            }
            target.setBooleanValue(failureDetail);
        }
    }
    
    /**
     * Sets (as xml) the "failureDetail" attribute
     */
    public void xsetFailureDetail(org.apache.xmlbeans.XmlBoolean failureDetail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FAILUREDETAIL$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FAILUREDETAIL$8);
            }
            target.set(failureDetail);
        }
    }
    
    /**
     * Unsets the "failureDetail" attribute
     */
    public void unsetFailureDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FAILUREDETAIL$8);
        }
    }
    /**
     * An XML type(@).
     *
     * This is an atomic type that is a restriction of org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults$Type.
     */
    public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults.Type
    {
        private static final long serialVersionUID = 1L;
        
        public TypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected TypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
