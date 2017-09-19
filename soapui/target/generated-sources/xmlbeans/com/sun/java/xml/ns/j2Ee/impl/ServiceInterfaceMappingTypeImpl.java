/*
 * XML Type:  service-interface-mappingType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.ServiceInterfaceMappingType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * An XML service-interface-mappingType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public class ServiceInterfaceMappingTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.ServiceInterfaceMappingType
{
    private static final long serialVersionUID = 1L;
    
    public ServiceInterfaceMappingTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICEINTERFACE$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "service-interface");
    private static final javax.xml.namespace.QName WSDLSERVICENAME$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "wsdl-service-name");
    private static final javax.xml.namespace.QName PORTMAPPING$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "port-mapping");
    private static final javax.xml.namespace.QName ID$6 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "service-interface" element
     */
    public com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType getServiceInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType)get_store().find_element_user(SERVICEINTERFACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "service-interface" element
     */
    public void setServiceInterface(com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType serviceInterface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType)get_store().find_element_user(SERVICEINTERFACE$0, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType)get_store().add_element_user(SERVICEINTERFACE$0);
            }
            target.set(serviceInterface);
        }
    }
    
    /**
     * Appends and returns a new empty "service-interface" element
     */
    public com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType addNewServiceInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType)get_store().add_element_user(SERVICEINTERFACE$0);
            return target;
        }
    }
    
    /**
     * Gets the "wsdl-service-name" element
     */
    public com.sun.java.xml.ns.j2Ee.XsdQNameType getWsdlServiceName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.XsdQNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.XsdQNameType)get_store().find_element_user(WSDLSERVICENAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "wsdl-service-name" element
     */
    public void setWsdlServiceName(com.sun.java.xml.ns.j2Ee.XsdQNameType wsdlServiceName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.XsdQNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.XsdQNameType)get_store().find_element_user(WSDLSERVICENAME$2, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.XsdQNameType)get_store().add_element_user(WSDLSERVICENAME$2);
            }
            target.set(wsdlServiceName);
        }
    }
    
    /**
     * Appends and returns a new empty "wsdl-service-name" element
     */
    public com.sun.java.xml.ns.j2Ee.XsdQNameType addNewWsdlServiceName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.XsdQNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.XsdQNameType)get_store().add_element_user(WSDLSERVICENAME$2);
            return target;
        }
    }
    
    /**
     * Gets a List of "port-mapping" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.PortMappingType> getPortMappingList()
    {
        final class PortMappingList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.PortMappingType>
        {
            public com.sun.java.xml.ns.j2Ee.PortMappingType get(int i)
                { return ServiceInterfaceMappingTypeImpl.this.getPortMappingArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.PortMappingType set(int i, com.sun.java.xml.ns.j2Ee.PortMappingType o)
            {
                com.sun.java.xml.ns.j2Ee.PortMappingType old = ServiceInterfaceMappingTypeImpl.this.getPortMappingArray(i);
                ServiceInterfaceMappingTypeImpl.this.setPortMappingArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.PortMappingType o)
                { ServiceInterfaceMappingTypeImpl.this.insertNewPortMapping(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.PortMappingType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.PortMappingType old = ServiceInterfaceMappingTypeImpl.this.getPortMappingArray(i);
                ServiceInterfaceMappingTypeImpl.this.removePortMapping(i);
                return old;
            }
            
            public int size()
                { return ServiceInterfaceMappingTypeImpl.this.sizeOfPortMappingArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PortMappingList();
        }
    }
    
    /**
     * Gets array of all "port-mapping" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.PortMappingType[] getPortMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.PortMappingType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.PortMappingType>();
            get_store().find_all_element_users(PORTMAPPING$4, targetList);
            com.sun.java.xml.ns.j2Ee.PortMappingType[] result = new com.sun.java.xml.ns.j2Ee.PortMappingType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "port-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.PortMappingType getPortMappingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.PortMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.PortMappingType)get_store().find_element_user(PORTMAPPING$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "port-mapping" element
     */
    public int sizeOfPortMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PORTMAPPING$4);
        }
    }
    
    /**
     * Sets array of all "port-mapping" element
     */
    public void setPortMappingArray(com.sun.java.xml.ns.j2Ee.PortMappingType[] portMappingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(portMappingArray, PORTMAPPING$4);
        }
    }
    
    /**
     * Sets ith "port-mapping" element
     */
    public void setPortMappingArray(int i, com.sun.java.xml.ns.j2Ee.PortMappingType portMapping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.PortMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.PortMappingType)get_store().find_element_user(PORTMAPPING$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(portMapping);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "port-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.PortMappingType insertNewPortMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.PortMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.PortMappingType)get_store().insert_element_user(PORTMAPPING$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "port-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.PortMappingType addNewPortMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.PortMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.PortMappingType)get_store().add_element_user(PORTMAPPING$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "port-mapping" element
     */
    public void removePortMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PORTMAPPING$4, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$6);
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
            return get_store().find_attribute_user(ID$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$6);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$6);
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
            get_store().remove_attribute(ID$6);
        }
    }
}
