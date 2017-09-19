/*
 * XML Type:  CheckedParameter
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.CheckedParameterConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML CheckedParameter(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class CheckedParameterConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.CheckedParameterConfig
{
    private static final long serialVersionUID = 1L;
    
    public CheckedParameterConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMETERNAME$0 = 
        new javax.xml.namespace.QName("", "parameterName");
    private static final javax.xml.namespace.QName CHECKED$2 = 
        new javax.xml.namespace.QName("", "checked");
    private static final javax.xml.namespace.QName XPATH$4 = 
        new javax.xml.namespace.QName("", "xpath");
    private static final javax.xml.namespace.QName TYPE$6 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName LABEL$8 = 
        new javax.xml.namespace.QName("", "label");
    
    
    /**
     * Gets the "parameterName" attribute
     */
    public java.lang.String getParameterName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARAMETERNAME$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "parameterName" attribute
     */
    public org.apache.xmlbeans.XmlString xgetParameterName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PARAMETERNAME$0);
            return target;
        }
    }
    
    /**
     * True if has "parameterName" attribute
     */
    public boolean isSetParameterName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PARAMETERNAME$0) != null;
        }
    }
    
    /**
     * Sets the "parameterName" attribute
     */
    public void setParameterName(java.lang.String parameterName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARAMETERNAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARAMETERNAME$0);
            }
            target.setStringValue(parameterName);
        }
    }
    
    /**
     * Sets (as xml) the "parameterName" attribute
     */
    public void xsetParameterName(org.apache.xmlbeans.XmlString parameterName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PARAMETERNAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PARAMETERNAME$0);
            }
            target.set(parameterName);
        }
    }
    
    /**
     * Unsets the "parameterName" attribute
     */
    public void unsetParameterName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PARAMETERNAME$0);
        }
    }
    
    /**
     * Gets the "checked" attribute
     */
    public boolean getChecked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHECKED$2);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "checked" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetChecked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CHECKED$2);
            return target;
        }
    }
    
    /**
     * True if has "checked" attribute
     */
    public boolean isSetChecked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CHECKED$2) != null;
        }
    }
    
    /**
     * Sets the "checked" attribute
     */
    public void setChecked(boolean checked)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHECKED$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CHECKED$2);
            }
            target.setBooleanValue(checked);
        }
    }
    
    /**
     * Sets (as xml) the "checked" attribute
     */
    public void xsetChecked(org.apache.xmlbeans.XmlBoolean checked)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CHECKED$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CHECKED$2);
            }
            target.set(checked);
        }
    }
    
    /**
     * Unsets the "checked" attribute
     */
    public void unsetChecked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CHECKED$2);
        }
    }
    
    /**
     * Gets the "xpath" attribute
     */
    public java.lang.String getXpath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XPATH$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "xpath" attribute
     */
    public org.apache.xmlbeans.XmlString xgetXpath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(XPATH$4);
            return target;
        }
    }
    
    /**
     * True if has "xpath" attribute
     */
    public boolean isSetXpath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(XPATH$4) != null;
        }
    }
    
    /**
     * Sets the "xpath" attribute
     */
    public void setXpath(java.lang.String xpath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XPATH$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(XPATH$4);
            }
            target.setStringValue(xpath);
        }
    }
    
    /**
     * Sets (as xml) the "xpath" attribute
     */
    public void xsetXpath(org.apache.xmlbeans.XmlString xpath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(XPATH$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(XPATH$4);
            }
            target.set(xpath);
        }
    }
    
    /**
     * Unsets the "xpath" attribute
     */
    public void unsetXpath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(XPATH$4);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public java.lang.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.apache.xmlbeans.XmlString xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$6);
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
            return get_store().find_attribute_user(TYPE$6) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(java.lang.String type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$6);
            }
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.apache.xmlbeans.XmlString type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$6);
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
            get_store().remove_attribute(TYPE$6);
        }
    }
    
    /**
     * Gets the "label" attribute
     */
    public java.lang.String getLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "label" attribute
     */
    public org.apache.xmlbeans.XmlString xgetLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABEL$8);
            return target;
        }
    }
    
    /**
     * True if has "label" attribute
     */
    public boolean isSetLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LABEL$8) != null;
        }
    }
    
    /**
     * Sets the "label" attribute
     */
    public void setLabel(java.lang.String label)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LABEL$8);
            }
            target.setStringValue(label);
        }
    }
    
    /**
     * Sets (as xml) the "label" attribute
     */
    public void xsetLabel(org.apache.xmlbeans.XmlString label)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABEL$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LABEL$8);
            }
            target.set(label);
        }
    }
    
    /**
     * Unsets the "label" attribute
     */
    public void unsetLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LABEL$8);
        }
    }
}
