/*
 * XML Type:  parameterType
 * Namespace: http://www.jboss.org/jbossws-tools
 * Java type: org.jboss.jbosswsTools.ParameterType
 *
 * Automatically generated - do not modify.
 */
package org.jboss.jbosswsTools.impl;
/**
 * An XML parameterType(@http://www.jboss.org/jbossws-tools).
 *
 * This is a complex type.
 */
public class ParameterTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.jboss.jbosswsTools.ParameterType
{
    private static final long serialVersionUID = 1L;
    
    public ParameterTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName XMLNAME$2 = 
        new javax.xml.namespace.QName("", "xml-name");
    private static final javax.xml.namespace.QName MODE$4 = 
        new javax.xml.namespace.QName("", "mode");
    private static final javax.xml.namespace.QName HEADER$6 = 
        new javax.xml.namespace.QName("", "header");
    
    
    /**
     * Gets the "type" attribute
     */
    public org.apache.xmlbeans.XmlAnySimpleType getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(org.apache.xmlbeans.XmlAnySimpleType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(TYPE$0);
            }
            target.set(type);
        }
    }
    
    /**
     * Appends and returns a new empty "type" attribute
     */
    public org.apache.xmlbeans.XmlAnySimpleType addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(TYPE$0);
            return target;
        }
    }
    
    /**
     * Gets the "xml-name" attribute
     */
    public javax.xml.namespace.QName getXmlName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLNAME$2);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "xml-name" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetXmlName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(XMLNAME$2);
            return target;
        }
    }
    
    /**
     * True if has "xml-name" attribute
     */
    public boolean isSetXmlName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(XMLNAME$2) != null;
        }
    }
    
    /**
     * Sets the "xml-name" attribute
     */
    public void setXmlName(javax.xml.namespace.QName xmlName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLNAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(XMLNAME$2);
            }
            target.setQNameValue(xmlName);
        }
    }
    
    /**
     * Sets (as xml) the "xml-name" attribute
     */
    public void xsetXmlName(org.apache.xmlbeans.XmlQName xmlName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(XMLNAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(XMLNAME$2);
            }
            target.set(xmlName);
        }
    }
    
    /**
     * Unsets the "xml-name" attribute
     */
    public void unsetXmlName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(XMLNAME$2);
        }
    }
    
    /**
     * Gets the "mode" attribute
     */
    public org.jboss.jbosswsTools.ParameterType.Mode.Enum getMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MODE$4);
            }
            if (target == null)
            {
                return null;
            }
            return (org.jboss.jbosswsTools.ParameterType.Mode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "mode" attribute
     */
    public org.jboss.jbosswsTools.ParameterType.Mode xgetMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.ParameterType.Mode target = null;
            target = (org.jboss.jbosswsTools.ParameterType.Mode)get_store().find_attribute_user(MODE$4);
            if (target == null)
            {
                target = (org.jboss.jbosswsTools.ParameterType.Mode)get_default_attribute_value(MODE$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "mode" attribute
     */
    public boolean isSetMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MODE$4) != null;
        }
    }
    
    /**
     * Sets the "mode" attribute
     */
    public void setMode(org.jboss.jbosswsTools.ParameterType.Mode.Enum mode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MODE$4);
            }
            target.setEnumValue(mode);
        }
    }
    
    /**
     * Sets (as xml) the "mode" attribute
     */
    public void xsetMode(org.jboss.jbosswsTools.ParameterType.Mode mode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.ParameterType.Mode target = null;
            target = (org.jboss.jbosswsTools.ParameterType.Mode)get_store().find_attribute_user(MODE$4);
            if (target == null)
            {
                target = (org.jboss.jbosswsTools.ParameterType.Mode)get_store().add_attribute_user(MODE$4);
            }
            target.set(mode);
        }
    }
    
    /**
     * Unsets the "mode" attribute
     */
    public void unsetMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MODE$4);
        }
    }
    
    /**
     * Gets the "header" attribute
     */
    public boolean getHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEADER$6);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "header" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HEADER$6);
            return target;
        }
    }
    
    /**
     * True if has "header" attribute
     */
    public boolean isSetHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HEADER$6) != null;
        }
    }
    
    /**
     * Sets the "header" attribute
     */
    public void setHeader(boolean header)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEADER$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HEADER$6);
            }
            target.setBooleanValue(header);
        }
    }
    
    /**
     * Sets (as xml) the "header" attribute
     */
    public void xsetHeader(org.apache.xmlbeans.XmlBoolean header)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HEADER$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(HEADER$6);
            }
            target.set(header);
        }
    }
    
    /**
     * Unsets the "header" attribute
     */
    public void unsetHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HEADER$6);
        }
    }
    /**
     * An XML mode(@).
     *
     * This is an atomic type that is a restriction of org.jboss.jbosswsTools.ParameterType$Mode.
     */
    public static class ModeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.jboss.jbosswsTools.ParameterType.Mode
    {
        private static final long serialVersionUID = 1L;
        
        public ModeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ModeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
