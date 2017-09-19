/*
 * XML Type:  wsdlToJavaType
 * Namespace: http://www.jboss.org/jbossws-tools
 * Java type: org.jboss.jbosswsTools.WsdlToJavaType
 *
 * Automatically generated - do not modify.
 */
package org.jboss.jbosswsTools.impl;
/**
 * An XML wsdlToJavaType(@http://www.jboss.org/jbossws-tools).
 *
 * This is a complex type.
 */
public class WsdlToJavaTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.jboss.jbosswsTools.WsdlToJavaType
{
    private static final long serialVersionUID = 1L;
    
    public WsdlToJavaTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAPPING$0 = 
        new javax.xml.namespace.QName("http://www.jboss.org/jbossws-tools", "mapping");
    private static final javax.xml.namespace.QName WEBSERVICES$2 = 
        new javax.xml.namespace.QName("http://www.jboss.org/jbossws-tools", "webservices");
    private static final javax.xml.namespace.QName LOCATION$4 = 
        new javax.xml.namespace.QName("", "location");
    private static final javax.xml.namespace.QName PARAMETERSTYLE$6 = 
        new javax.xml.namespace.QName("", "parameter-style");
    
    
    /**
     * Gets the "mapping" element
     */
    public org.jboss.jbosswsTools.MappingType getMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.MappingType target = null;
            target = (org.jboss.jbosswsTools.MappingType)get_store().find_element_user(MAPPING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "mapping" element
     */
    public boolean isSetMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAPPING$0) != 0;
        }
    }
    
    /**
     * Sets the "mapping" element
     */
    public void setMapping(org.jboss.jbosswsTools.MappingType mapping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.MappingType target = null;
            target = (org.jboss.jbosswsTools.MappingType)get_store().find_element_user(MAPPING$0, 0);
            if (target == null)
            {
                target = (org.jboss.jbosswsTools.MappingType)get_store().add_element_user(MAPPING$0);
            }
            target.set(mapping);
        }
    }
    
    /**
     * Appends and returns a new empty "mapping" element
     */
    public org.jboss.jbosswsTools.MappingType addNewMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.MappingType target = null;
            target = (org.jboss.jbosswsTools.MappingType)get_store().add_element_user(MAPPING$0);
            return target;
        }
    }
    
    /**
     * Unsets the "mapping" element
     */
    public void unsetMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAPPING$0, 0);
        }
    }
    
    /**
     * Gets the "webservices" element
     */
    public org.jboss.jbosswsTools.WsxmlType getWebservices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.WsxmlType target = null;
            target = (org.jboss.jbosswsTools.WsxmlType)get_store().find_element_user(WEBSERVICES$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "webservices" element
     */
    public boolean isSetWebservices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WEBSERVICES$2) != 0;
        }
    }
    
    /**
     * Sets the "webservices" element
     */
    public void setWebservices(org.jboss.jbosswsTools.WsxmlType webservices)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.WsxmlType target = null;
            target = (org.jboss.jbosswsTools.WsxmlType)get_store().find_element_user(WEBSERVICES$2, 0);
            if (target == null)
            {
                target = (org.jboss.jbosswsTools.WsxmlType)get_store().add_element_user(WEBSERVICES$2);
            }
            target.set(webservices);
        }
    }
    
    /**
     * Appends and returns a new empty "webservices" element
     */
    public org.jboss.jbosswsTools.WsxmlType addNewWebservices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.WsxmlType target = null;
            target = (org.jboss.jbosswsTools.WsxmlType)get_store().add_element_user(WEBSERVICES$2);
            return target;
        }
    }
    
    /**
     * Unsets the "webservices" element
     */
    public void unsetWebservices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WEBSERVICES$2, 0);
        }
    }
    
    /**
     * Gets the "location" attribute
     */
    public java.lang.String getLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATION$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "location" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(LOCATION$4);
            return target;
        }
    }
    
    /**
     * Sets the "location" attribute
     */
    public void setLocation(java.lang.String location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCATION$4);
            }
            target.setStringValue(location);
        }
    }
    
    /**
     * Sets (as xml) the "location" attribute
     */
    public void xsetLocation(org.apache.xmlbeans.XmlAnyURI location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(LOCATION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(LOCATION$4);
            }
            target.set(location);
        }
    }
    
    /**
     * Gets the "parameter-style" attribute
     */
    public org.jboss.jbosswsTools.WsdlToJavaType.ParameterStyle.Enum getParameterStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARAMETERSTYLE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PARAMETERSTYLE$6);
            }
            if (target == null)
            {
                return null;
            }
            return (org.jboss.jbosswsTools.WsdlToJavaType.ParameterStyle.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "parameter-style" attribute
     */
    public org.jboss.jbosswsTools.WsdlToJavaType.ParameterStyle xgetParameterStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.WsdlToJavaType.ParameterStyle target = null;
            target = (org.jboss.jbosswsTools.WsdlToJavaType.ParameterStyle)get_store().find_attribute_user(PARAMETERSTYLE$6);
            if (target == null)
            {
                target = (org.jboss.jbosswsTools.WsdlToJavaType.ParameterStyle)get_default_attribute_value(PARAMETERSTYLE$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "parameter-style" attribute
     */
    public boolean isSetParameterStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PARAMETERSTYLE$6) != null;
        }
    }
    
    /**
     * Sets the "parameter-style" attribute
     */
    public void setParameterStyle(org.jboss.jbosswsTools.WsdlToJavaType.ParameterStyle.Enum parameterStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARAMETERSTYLE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARAMETERSTYLE$6);
            }
            target.setEnumValue(parameterStyle);
        }
    }
    
    /**
     * Sets (as xml) the "parameter-style" attribute
     */
    public void xsetParameterStyle(org.jboss.jbosswsTools.WsdlToJavaType.ParameterStyle parameterStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.WsdlToJavaType.ParameterStyle target = null;
            target = (org.jboss.jbosswsTools.WsdlToJavaType.ParameterStyle)get_store().find_attribute_user(PARAMETERSTYLE$6);
            if (target == null)
            {
                target = (org.jboss.jbosswsTools.WsdlToJavaType.ParameterStyle)get_store().add_attribute_user(PARAMETERSTYLE$6);
            }
            target.set(parameterStyle);
        }
    }
    
    /**
     * Unsets the "parameter-style" attribute
     */
    public void unsetParameterStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PARAMETERSTYLE$6);
        }
    }
    /**
     * An XML parameter-style(@).
     *
     * This is an atomic type that is a restriction of org.jboss.jbosswsTools.WsdlToJavaType$ParameterStyle.
     */
    public static class ParameterStyleImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.jboss.jbosswsTools.WsdlToJavaType.ParameterStyle
    {
        private static final long serialVersionUID = 1L;
        
        public ParameterStyleImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ParameterStyleImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
