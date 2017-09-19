/*
 * XML Type:  port-componentType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.PortComponentType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * An XML port-componentType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public class PortComponentTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.PortComponentType
{
    private static final long serialVersionUID = 1L;
    
    public PortComponentTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "description");
    private static final javax.xml.namespace.QName DISPLAYNAME$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "display-name");
    private static final javax.xml.namespace.QName ICON$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "icon");
    private static final javax.xml.namespace.QName PORTCOMPONENTNAME$6 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "port-component-name");
    private static final javax.xml.namespace.QName WSDLPORT$8 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "wsdl-port");
    private static final javax.xml.namespace.QName SERVICEENDPOINTINTERFACE$10 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "service-endpoint-interface");
    private static final javax.xml.namespace.QName SERVICEIMPLBEAN$12 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "service-impl-bean");
    private static final javax.xml.namespace.QName HANDLER$14 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "handler");
    private static final javax.xml.namespace.QName ID$16 = 
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
     * Gets the "port-component-name" element
     */
    public com.sun.java.xml.ns.j2Ee.String getPortComponentName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().find_element_user(PORTCOMPONENTNAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "port-component-name" element
     */
    public void setPortComponentName(com.sun.java.xml.ns.j2Ee.String portComponentName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().find_element_user(PORTCOMPONENTNAME$6, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.String)get_store().add_element_user(PORTCOMPONENTNAME$6);
            }
            target.set(portComponentName);
        }
    }
    
    /**
     * Appends and returns a new empty "port-component-name" element
     */
    public com.sun.java.xml.ns.j2Ee.String addNewPortComponentName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().add_element_user(PORTCOMPONENTNAME$6);
            return target;
        }
    }
    
    /**
     * Gets the "wsdl-port" element
     */
    public com.sun.java.xml.ns.j2Ee.XsdQNameType getWsdlPort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.XsdQNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.XsdQNameType)get_store().find_element_user(WSDLPORT$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "wsdl-port" element
     */
    public void setWsdlPort(com.sun.java.xml.ns.j2Ee.XsdQNameType wsdlPort)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.XsdQNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.XsdQNameType)get_store().find_element_user(WSDLPORT$8, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.XsdQNameType)get_store().add_element_user(WSDLPORT$8);
            }
            target.set(wsdlPort);
        }
    }
    
    /**
     * Appends and returns a new empty "wsdl-port" element
     */
    public com.sun.java.xml.ns.j2Ee.XsdQNameType addNewWsdlPort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.XsdQNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.XsdQNameType)get_store().add_element_user(WSDLPORT$8);
            return target;
        }
    }
    
    /**
     * Gets the "service-endpoint-interface" element
     */
    public com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType getServiceEndpointInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType)get_store().find_element_user(SERVICEENDPOINTINTERFACE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "service-endpoint-interface" element
     */
    public void setServiceEndpointInterface(com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType serviceEndpointInterface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType)get_store().find_element_user(SERVICEENDPOINTINTERFACE$10, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType)get_store().add_element_user(SERVICEENDPOINTINTERFACE$10);
            }
            target.set(serviceEndpointInterface);
        }
    }
    
    /**
     * Appends and returns a new empty "service-endpoint-interface" element
     */
    public com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType addNewServiceEndpointInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType)get_store().add_element_user(SERVICEENDPOINTINTERFACE$10);
            return target;
        }
    }
    
    /**
     * Gets the "service-impl-bean" element
     */
    public com.sun.java.xml.ns.j2Ee.ServiceImplBeanType getServiceImplBean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ServiceImplBeanType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ServiceImplBeanType)get_store().find_element_user(SERVICEIMPLBEAN$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "service-impl-bean" element
     */
    public void setServiceImplBean(com.sun.java.xml.ns.j2Ee.ServiceImplBeanType serviceImplBean)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ServiceImplBeanType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ServiceImplBeanType)get_store().find_element_user(SERVICEIMPLBEAN$12, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.ServiceImplBeanType)get_store().add_element_user(SERVICEIMPLBEAN$12);
            }
            target.set(serviceImplBean);
        }
    }
    
    /**
     * Appends and returns a new empty "service-impl-bean" element
     */
    public com.sun.java.xml.ns.j2Ee.ServiceImplBeanType addNewServiceImplBean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ServiceImplBeanType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ServiceImplBeanType)get_store().add_element_user(SERVICEIMPLBEAN$12);
            return target;
        }
    }
    
    /**
     * Gets a List of "handler" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.PortComponentHandlerType> getHandlerList()
    {
        final class HandlerList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.PortComponentHandlerType>
        {
            public com.sun.java.xml.ns.j2Ee.PortComponentHandlerType get(int i)
                { return PortComponentTypeImpl.this.getHandlerArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.PortComponentHandlerType set(int i, com.sun.java.xml.ns.j2Ee.PortComponentHandlerType o)
            {
                com.sun.java.xml.ns.j2Ee.PortComponentHandlerType old = PortComponentTypeImpl.this.getHandlerArray(i);
                PortComponentTypeImpl.this.setHandlerArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.PortComponentHandlerType o)
                { PortComponentTypeImpl.this.insertNewHandler(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.PortComponentHandlerType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.PortComponentHandlerType old = PortComponentTypeImpl.this.getHandlerArray(i);
                PortComponentTypeImpl.this.removeHandler(i);
                return old;
            }
            
            public int size()
                { return PortComponentTypeImpl.this.sizeOfHandlerArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new HandlerList();
        }
    }
    
    /**
     * Gets array of all "handler" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.PortComponentHandlerType[] getHandlerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.PortComponentHandlerType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.PortComponentHandlerType>();
            get_store().find_all_element_users(HANDLER$14, targetList);
            com.sun.java.xml.ns.j2Ee.PortComponentHandlerType[] result = new com.sun.java.xml.ns.j2Ee.PortComponentHandlerType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "handler" element
     */
    public com.sun.java.xml.ns.j2Ee.PortComponentHandlerType getHandlerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.PortComponentHandlerType target = null;
            target = (com.sun.java.xml.ns.j2Ee.PortComponentHandlerType)get_store().find_element_user(HANDLER$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "handler" element
     */
    public int sizeOfHandlerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HANDLER$14);
        }
    }
    
    /**
     * Sets array of all "handler" element
     */
    public void setHandlerArray(com.sun.java.xml.ns.j2Ee.PortComponentHandlerType[] handlerArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(handlerArray, HANDLER$14);
        }
    }
    
    /**
     * Sets ith "handler" element
     */
    public void setHandlerArray(int i, com.sun.java.xml.ns.j2Ee.PortComponentHandlerType handler)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.PortComponentHandlerType target = null;
            target = (com.sun.java.xml.ns.j2Ee.PortComponentHandlerType)get_store().find_element_user(HANDLER$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(handler);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "handler" element
     */
    public com.sun.java.xml.ns.j2Ee.PortComponentHandlerType insertNewHandler(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.PortComponentHandlerType target = null;
            target = (com.sun.java.xml.ns.j2Ee.PortComponentHandlerType)get_store().insert_element_user(HANDLER$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "handler" element
     */
    public com.sun.java.xml.ns.j2Ee.PortComponentHandlerType addNewHandler()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.PortComponentHandlerType target = null;
            target = (com.sun.java.xml.ns.j2Ee.PortComponentHandlerType)get_store().add_element_user(HANDLER$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "handler" element
     */
    public void removeHandler(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HANDLER$14, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$16);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$16);
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
            return get_store().find_attribute_user(ID$16) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$16);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$16);
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
            get_store().remove_attribute(ID$16);
        }
    }
}
