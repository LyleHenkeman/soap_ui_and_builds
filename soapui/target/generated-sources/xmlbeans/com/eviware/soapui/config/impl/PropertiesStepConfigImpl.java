/*
 * XML Type:  PropertiesStep
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.PropertiesStepConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML PropertiesStep(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class PropertiesStepConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.PropertiesStepConfig
{
    private static final long serialVersionUID = 1L;
    
    public PropertiesStepConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCE$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "source");
    private static final javax.xml.namespace.QName TARGET$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "target");
    private static final javax.xml.namespace.QName PROPERTIES$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "properties");
    private static final javax.xml.namespace.QName CREATEMISSINGONLOAD$6 = 
        new javax.xml.namespace.QName("", "createMissingOnLoad");
    private static final javax.xml.namespace.QName SAVEFIRST$8 = 
        new javax.xml.namespace.QName("", "saveFirst");
    private static final javax.xml.namespace.QName DISCARDVALUESONSAVE$10 = 
        new javax.xml.namespace.QName("", "discardValuesOnSave");
    
    
    /**
     * Gets the "source" element
     */
    public java.lang.String getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" element
     */
    public org.apache.xmlbeans.XmlString xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "source" element
     */
    public boolean isSetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCE$0) != 0;
        }
    }
    
    /**
     * Sets the "source" element
     */
    public void setSource(java.lang.String source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCE$0);
            }
            target.setStringValue(source);
        }
    }
    
    /**
     * Sets (as xml) the "source" element
     */
    public void xsetSource(org.apache.xmlbeans.XmlString source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCE$0);
            }
            target.set(source);
        }
    }
    
    /**
     * Unsets the "source" element
     */
    public void unsetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCE$0, 0);
        }
    }
    
    /**
     * Gets the "target" element
     */
    public java.lang.String getTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGET$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "target" element
     */
    public org.apache.xmlbeans.XmlString xgetTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGET$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "target" element
     */
    public boolean isSetTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TARGET$2) != 0;
        }
    }
    
    /**
     * Sets the "target" element
     */
    public void setTarget(java.lang.String targetValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGET$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGET$2);
            }
            target.setStringValue(targetValue);
        }
    }
    
    /**
     * Sets (as xml) the "target" element
     */
    public void xsetTarget(org.apache.xmlbeans.XmlString targetValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGET$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TARGET$2);
            }
            target.set(targetValue);
        }
    }
    
    /**
     * Unsets the "target" element
     */
    public void unsetTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TARGET$2, 0);
        }
    }
    
    /**
     * Gets the "properties" element
     */
    public com.eviware.soapui.config.PropertiesTypeConfig getProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PropertiesTypeConfig target = null;
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().find_element_user(PROPERTIES$4, 0);
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
            return get_store().count_elements(PROPERTIES$4) != 0;
        }
    }
    
    /**
     * Sets the "properties" element
     */
    public void setProperties(com.eviware.soapui.config.PropertiesTypeConfig properties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PropertiesTypeConfig target = null;
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().find_element_user(PROPERTIES$4, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().add_element_user(PROPERTIES$4);
            }
            target.set(properties);
        }
    }
    
    /**
     * Appends and returns a new empty "properties" element
     */
    public com.eviware.soapui.config.PropertiesTypeConfig addNewProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PropertiesTypeConfig target = null;
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().add_element_user(PROPERTIES$4);
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
            get_store().remove_element(PROPERTIES$4, 0);
        }
    }
    
    /**
     * Gets the "createMissingOnLoad" attribute
     */
    public boolean getCreateMissingOnLoad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CREATEMISSINGONLOAD$6);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "createMissingOnLoad" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCreateMissingOnLoad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CREATEMISSINGONLOAD$6);
            return target;
        }
    }
    
    /**
     * True if has "createMissingOnLoad" attribute
     */
    public boolean isSetCreateMissingOnLoad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CREATEMISSINGONLOAD$6) != null;
        }
    }
    
    /**
     * Sets the "createMissingOnLoad" attribute
     */
    public void setCreateMissingOnLoad(boolean createMissingOnLoad)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CREATEMISSINGONLOAD$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CREATEMISSINGONLOAD$6);
            }
            target.setBooleanValue(createMissingOnLoad);
        }
    }
    
    /**
     * Sets (as xml) the "createMissingOnLoad" attribute
     */
    public void xsetCreateMissingOnLoad(org.apache.xmlbeans.XmlBoolean createMissingOnLoad)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CREATEMISSINGONLOAD$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CREATEMISSINGONLOAD$6);
            }
            target.set(createMissingOnLoad);
        }
    }
    
    /**
     * Unsets the "createMissingOnLoad" attribute
     */
    public void unsetCreateMissingOnLoad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CREATEMISSINGONLOAD$6);
        }
    }
    
    /**
     * Gets the "saveFirst" attribute
     */
    public boolean getSaveFirst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SAVEFIRST$8);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "saveFirst" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSaveFirst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SAVEFIRST$8);
            return target;
        }
    }
    
    /**
     * True if has "saveFirst" attribute
     */
    public boolean isSetSaveFirst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SAVEFIRST$8) != null;
        }
    }
    
    /**
     * Sets the "saveFirst" attribute
     */
    public void setSaveFirst(boolean saveFirst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SAVEFIRST$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SAVEFIRST$8);
            }
            target.setBooleanValue(saveFirst);
        }
    }
    
    /**
     * Sets (as xml) the "saveFirst" attribute
     */
    public void xsetSaveFirst(org.apache.xmlbeans.XmlBoolean saveFirst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SAVEFIRST$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SAVEFIRST$8);
            }
            target.set(saveFirst);
        }
    }
    
    /**
     * Unsets the "saveFirst" attribute
     */
    public void unsetSaveFirst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SAVEFIRST$8);
        }
    }
    
    /**
     * Gets the "discardValuesOnSave" attribute
     */
    public boolean getDiscardValuesOnSave()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISCARDVALUESONSAVE$10);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "discardValuesOnSave" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDiscardValuesOnSave()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DISCARDVALUESONSAVE$10);
            return target;
        }
    }
    
    /**
     * True if has "discardValuesOnSave" attribute
     */
    public boolean isSetDiscardValuesOnSave()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DISCARDVALUESONSAVE$10) != null;
        }
    }
    
    /**
     * Sets the "discardValuesOnSave" attribute
     */
    public void setDiscardValuesOnSave(boolean discardValuesOnSave)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISCARDVALUESONSAVE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISCARDVALUESONSAVE$10);
            }
            target.setBooleanValue(discardValuesOnSave);
        }
    }
    
    /**
     * Sets (as xml) the "discardValuesOnSave" attribute
     */
    public void xsetDiscardValuesOnSave(org.apache.xmlbeans.XmlBoolean discardValuesOnSave)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DISCARDVALUESONSAVE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DISCARDVALUESONSAVE$10);
            }
            target.set(discardValuesOnSave);
        }
    }
    
    /**
     * Unsets the "discardValuesOnSave" attribute
     */
    public void unsetDiscardValuesOnSave()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DISCARDVALUESONSAVE$10);
        }
    }
}
