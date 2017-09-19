/*
 * XML Type:  webservice-descriptionType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * An XML webservice-descriptionType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public class WebserviceDescriptionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType
{
    private static final long serialVersionUID = 1L;
    
    public WebserviceDescriptionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "description");
    private static final javax.xml.namespace.QName DISPLAYNAME$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "display-name");
    private static final javax.xml.namespace.QName ICON$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "icon");
    private static final javax.xml.namespace.QName WEBSERVICEDESCRIPTIONNAME$6 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "webservice-description-name");
    private static final javax.xml.namespace.QName WSDLFILE$8 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "wsdl-file");
    private static final javax.xml.namespace.QName JAXRPCMAPPINGFILE$10 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "jaxrpc-mapping-file");
    private static final javax.xml.namespace.QName PORTCOMPONENT$12 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "port-component");
    private static final javax.xml.namespace.QName ID$14 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "description" element
     */
    public com.sun.java.xml.ns.j2Ee.DescriptionType getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.DescriptionType target = null;
            target = (com.sun.java.xml.ns.j2Ee.DescriptionType)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$0) != 0;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(com.sun.java.xml.ns.j2Ee.DescriptionType description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.DescriptionType target = null;
            target = (com.sun.java.xml.ns.j2Ee.DescriptionType)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.DescriptionType)get_store().add_element_user(DESCRIPTION$0);
            }
            target.set(description);
        }
    }
    
    /**
     * Appends and returns a new empty "description" element
     */
    public com.sun.java.xml.ns.j2Ee.DescriptionType addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.DescriptionType target = null;
            target = (com.sun.java.xml.ns.j2Ee.DescriptionType)get_store().add_element_user(DESCRIPTION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$0, 0);
        }
    }
    
    /**
     * Gets the "display-name" element
     */
    public com.sun.java.xml.ns.j2Ee.DisplayNameType getDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.DisplayNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.DisplayNameType)get_store().find_element_user(DISPLAYNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "display-name" element
     */
    public boolean isSetDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPLAYNAME$2) != 0;
        }
    }
    
    /**
     * Sets the "display-name" element
     */
    public void setDisplayName(com.sun.java.xml.ns.j2Ee.DisplayNameType displayName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.DisplayNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.DisplayNameType)get_store().find_element_user(DISPLAYNAME$2, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.DisplayNameType)get_store().add_element_user(DISPLAYNAME$2);
            }
            target.set(displayName);
        }
    }
    
    /**
     * Appends and returns a new empty "display-name" element
     */
    public com.sun.java.xml.ns.j2Ee.DisplayNameType addNewDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.DisplayNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.DisplayNameType)get_store().add_element_user(DISPLAYNAME$2);
            return target;
        }
    }
    
    /**
     * Unsets the "display-name" element
     */
    public void unsetDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPLAYNAME$2, 0);
        }
    }
    
    /**
     * Gets the "icon" element
     */
    public com.sun.java.xml.ns.j2Ee.IconType getIcon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.IconType target = null;
            target = (com.sun.java.xml.ns.j2Ee.IconType)get_store().find_element_user(ICON$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "icon" element
     */
    public boolean isSetIcon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ICON$4) != 0;
        }
    }
    
    /**
     * Sets the "icon" element
     */
    public void setIcon(com.sun.java.xml.ns.j2Ee.IconType icon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.IconType target = null;
            target = (com.sun.java.xml.ns.j2Ee.IconType)get_store().find_element_user(ICON$4, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.IconType)get_store().add_element_user(ICON$4);
            }
            target.set(icon);
        }
    }
    
    /**
     * Appends and returns a new empty "icon" element
     */
    public com.sun.java.xml.ns.j2Ee.IconType addNewIcon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.IconType target = null;
            target = (com.sun.java.xml.ns.j2Ee.IconType)get_store().add_element_user(ICON$4);
            return target;
        }
    }
    
    /**
     * Unsets the "icon" element
     */
    public void unsetIcon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ICON$4, 0);
        }
    }
    
    /**
     * Gets the "webservice-description-name" element
     */
    public com.sun.java.xml.ns.j2Ee.String getWebserviceDescriptionName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().find_element_user(WEBSERVICEDESCRIPTIONNAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "webservice-description-name" element
     */
    public void setWebserviceDescriptionName(com.sun.java.xml.ns.j2Ee.String webserviceDescriptionName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().find_element_user(WEBSERVICEDESCRIPTIONNAME$6, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.String)get_store().add_element_user(WEBSERVICEDESCRIPTIONNAME$6);
            }
            target.set(webserviceDescriptionName);
        }
    }
    
    /**
     * Appends and returns a new empty "webservice-description-name" element
     */
    public com.sun.java.xml.ns.j2Ee.String addNewWebserviceDescriptionName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().add_element_user(WEBSERVICEDESCRIPTIONNAME$6);
            return target;
        }
    }
    
    /**
     * Gets the "wsdl-file" element
     */
    public com.sun.java.xml.ns.j2Ee.PathType getWsdlFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.PathType target = null;
            target = (com.sun.java.xml.ns.j2Ee.PathType)get_store().find_element_user(WSDLFILE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "wsdl-file" element
     */
    public void setWsdlFile(com.sun.java.xml.ns.j2Ee.PathType wsdlFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.PathType target = null;
            target = (com.sun.java.xml.ns.j2Ee.PathType)get_store().find_element_user(WSDLFILE$8, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.PathType)get_store().add_element_user(WSDLFILE$8);
            }
            target.set(wsdlFile);
        }
    }
    
    /**
     * Appends and returns a new empty "wsdl-file" element
     */
    public com.sun.java.xml.ns.j2Ee.PathType addNewWsdlFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.PathType target = null;
            target = (com.sun.java.xml.ns.j2Ee.PathType)get_store().add_element_user(WSDLFILE$8);
            return target;
        }
    }
    
    /**
     * Gets the "jaxrpc-mapping-file" element
     */
    public com.sun.java.xml.ns.j2Ee.PathType getJaxrpcMappingFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.PathType target = null;
            target = (com.sun.java.xml.ns.j2Ee.PathType)get_store().find_element_user(JAXRPCMAPPINGFILE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "jaxrpc-mapping-file" element
     */
    public void setJaxrpcMappingFile(com.sun.java.xml.ns.j2Ee.PathType jaxrpcMappingFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.PathType target = null;
            target = (com.sun.java.xml.ns.j2Ee.PathType)get_store().find_element_user(JAXRPCMAPPINGFILE$10, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.PathType)get_store().add_element_user(JAXRPCMAPPINGFILE$10);
            }
            target.set(jaxrpcMappingFile);
        }
    }
    
    /**
     * Appends and returns a new empty "jaxrpc-mapping-file" element
     */
    public com.sun.java.xml.ns.j2Ee.PathType addNewJaxrpcMappingFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.PathType target = null;
            target = (com.sun.java.xml.ns.j2Ee.PathType)get_store().add_element_user(JAXRPCMAPPINGFILE$10);
            return target;
        }
    }
    
    /**
     * Gets a List of "port-component" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.PortComponentType> getPortComponentList()
    {
        final class PortComponentList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.PortComponentType>
        {
            public com.sun.java.xml.ns.j2Ee.PortComponentType get(int i)
                { return WebserviceDescriptionTypeImpl.this.getPortComponentArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.PortComponentType set(int i, com.sun.java.xml.ns.j2Ee.PortComponentType o)
            {
                com.sun.java.xml.ns.j2Ee.PortComponentType old = WebserviceDescriptionTypeImpl.this.getPortComponentArray(i);
                WebserviceDescriptionTypeImpl.this.setPortComponentArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.PortComponentType o)
                { WebserviceDescriptionTypeImpl.this.insertNewPortComponent(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.PortComponentType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.PortComponentType old = WebserviceDescriptionTypeImpl.this.getPortComponentArray(i);
                WebserviceDescriptionTypeImpl.this.removePortComponent(i);
                return old;
            }
            
            public int size()
                { return WebserviceDescriptionTypeImpl.this.sizeOfPortComponentArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PortComponentList();
        }
    }
    
    /**
     * Gets array of all "port-component" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.PortComponentType[] getPortComponentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.PortComponentType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.PortComponentType>();
            get_store().find_all_element_users(PORTCOMPONENT$12, targetList);
            com.sun.java.xml.ns.j2Ee.PortComponentType[] result = new com.sun.java.xml.ns.j2Ee.PortComponentType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "port-component" element
     */
    public com.sun.java.xml.ns.j2Ee.PortComponentType getPortComponentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.PortComponentType target = null;
            target = (com.sun.java.xml.ns.j2Ee.PortComponentType)get_store().find_element_user(PORTCOMPONENT$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "port-component" element
     */
    public int sizeOfPortComponentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PORTCOMPONENT$12);
        }
    }
    
    /**
     * Sets array of all "port-component" element
     */
    public void setPortComponentArray(com.sun.java.xml.ns.j2Ee.PortComponentType[] portComponentArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(portComponentArray, PORTCOMPONENT$12);
        }
    }
    
    /**
     * Sets ith "port-component" element
     */
    public void setPortComponentArray(int i, com.sun.java.xml.ns.j2Ee.PortComponentType portComponent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.PortComponentType target = null;
            target = (com.sun.java.xml.ns.j2Ee.PortComponentType)get_store().find_element_user(PORTCOMPONENT$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(portComponent);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "port-component" element
     */
    public com.sun.java.xml.ns.j2Ee.PortComponentType insertNewPortComponent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.PortComponentType target = null;
            target = (com.sun.java.xml.ns.j2Ee.PortComponentType)get_store().insert_element_user(PORTCOMPONENT$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "port-component" element
     */
    public com.sun.java.xml.ns.j2Ee.PortComponentType addNewPortComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.PortComponentType target = null;
            target = (com.sun.java.xml.ns.j2Ee.PortComponentType)get_store().add_element_user(PORTCOMPONENT$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "port-component" element
     */
    public void removePortComponent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PORTCOMPONENT$12, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$14);
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
    public org.apache.xmlbeans.XmlID xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$14);
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
            return get_store().find_attribute_user(ID$14) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$14);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlID id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$14);
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
            get_store().remove_attribute(ID$14);
        }
    }
}
