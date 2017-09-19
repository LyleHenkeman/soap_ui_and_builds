/*
 * XML Type:  javaToWsdlType
 * Namespace: http://www.jboss.org/jbossws-tools
 * Java type: org.jboss.jbosswsTools.JavaToWsdlType
 *
 * Automatically generated - do not modify.
 */
package org.jboss.jbosswsTools.impl;
/**
 * An XML javaToWsdlType(@http://www.jboss.org/jbossws-tools).
 *
 * This is a complex type.
 */
public class JavaToWsdlTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.jboss.jbosswsTools.JavaToWsdlType
{
    private static final long serialVersionUID = 1L;
    
    public JavaToWsdlTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICE$0 = 
        new javax.xml.namespace.QName("http://www.jboss.org/jbossws-tools", "service");
    private static final javax.xml.namespace.QName NAMESPACES$2 = 
        new javax.xml.namespace.QName("http://www.jboss.org/jbossws-tools", "namespaces");
    private static final javax.xml.namespace.QName MAPPING$4 = 
        new javax.xml.namespace.QName("http://www.jboss.org/jbossws-tools", "mapping");
    private static final javax.xml.namespace.QName WEBSERVICES$6 = 
        new javax.xml.namespace.QName("http://www.jboss.org/jbossws-tools", "webservices");
    
    
    /**
     * Gets the "service" element
     */
    public org.jboss.jbosswsTools.ServiceType getService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.ServiceType target = null;
            target = (org.jboss.jbosswsTools.ServiceType)get_store().find_element_user(SERVICE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "service" element
     */
    public void setService(org.jboss.jbosswsTools.ServiceType service)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.ServiceType target = null;
            target = (org.jboss.jbosswsTools.ServiceType)get_store().find_element_user(SERVICE$0, 0);
            if (target == null)
            {
                target = (org.jboss.jbosswsTools.ServiceType)get_store().add_element_user(SERVICE$0);
            }
            target.set(service);
        }
    }
    
    /**
     * Appends and returns a new empty "service" element
     */
    public org.jboss.jbosswsTools.ServiceType addNewService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.ServiceType target = null;
            target = (org.jboss.jbosswsTools.ServiceType)get_store().add_element_user(SERVICE$0);
            return target;
        }
    }
    
    /**
     * Gets the "namespaces" element
     */
    public org.jboss.jbosswsTools.NamespacesType getNamespaces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.NamespacesType target = null;
            target = (org.jboss.jbosswsTools.NamespacesType)get_store().find_element_user(NAMESPACES$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "namespaces" element
     */
    public void setNamespaces(org.jboss.jbosswsTools.NamespacesType namespaces)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.NamespacesType target = null;
            target = (org.jboss.jbosswsTools.NamespacesType)get_store().find_element_user(NAMESPACES$2, 0);
            if (target == null)
            {
                target = (org.jboss.jbosswsTools.NamespacesType)get_store().add_element_user(NAMESPACES$2);
            }
            target.set(namespaces);
        }
    }
    
    /**
     * Appends and returns a new empty "namespaces" element
     */
    public org.jboss.jbosswsTools.NamespacesType addNewNamespaces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.NamespacesType target = null;
            target = (org.jboss.jbosswsTools.NamespacesType)get_store().add_element_user(NAMESPACES$2);
            return target;
        }
    }
    
    /**
     * Gets the "mapping" element
     */
    public org.jboss.jbosswsTools.MappingType getMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.MappingType target = null;
            target = (org.jboss.jbosswsTools.MappingType)get_store().find_element_user(MAPPING$4, 0);
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
            return get_store().count_elements(MAPPING$4) != 0;
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
            target = (org.jboss.jbosswsTools.MappingType)get_store().find_element_user(MAPPING$4, 0);
            if (target == null)
            {
                target = (org.jboss.jbosswsTools.MappingType)get_store().add_element_user(MAPPING$4);
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
            target = (org.jboss.jbosswsTools.MappingType)get_store().add_element_user(MAPPING$4);
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
            get_store().remove_element(MAPPING$4, 0);
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
            target = (org.jboss.jbosswsTools.WsxmlType)get_store().find_element_user(WEBSERVICES$6, 0);
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
            return get_store().count_elements(WEBSERVICES$6) != 0;
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
            target = (org.jboss.jbosswsTools.WsxmlType)get_store().find_element_user(WEBSERVICES$6, 0);
            if (target == null)
            {
                target = (org.jboss.jbosswsTools.WsxmlType)get_store().add_element_user(WEBSERVICES$6);
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
            target = (org.jboss.jbosswsTools.WsxmlType)get_store().add_element_user(WEBSERVICES$6);
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
            get_store().remove_element(WEBSERVICES$6, 0);
        }
    }
}
