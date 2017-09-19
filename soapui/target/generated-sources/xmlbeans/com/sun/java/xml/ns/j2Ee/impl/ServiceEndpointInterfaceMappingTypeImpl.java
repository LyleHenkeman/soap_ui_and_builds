/*
 * XML Type:  service-endpoint-interface-mappingType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * An XML service-endpoint-interface-mappingType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public class ServiceEndpointInterfaceMappingTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType
{
    private static final long serialVersionUID = 1L;
    
    public ServiceEndpointInterfaceMappingTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICEENDPOINTINTERFACE$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "service-endpoint-interface");
    private static final javax.xml.namespace.QName WSDLPORTTYPE$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "wsdl-port-type");
    private static final javax.xml.namespace.QName WSDLBINDING$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "wsdl-binding");
    private static final javax.xml.namespace.QName SERVICEENDPOINTMETHODMAPPING$6 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "service-endpoint-method-mapping");
    private static final javax.xml.namespace.QName ID$8 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "service-endpoint-interface" element
     */
    public com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType getServiceEndpointInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType)get_store().find_element_user(SERVICEENDPOINTINTERFACE$0, 0);
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
            target = (com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType)get_store().find_element_user(SERVICEENDPOINTINTERFACE$0, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType)get_store().add_element_user(SERVICEENDPOINTINTERFACE$0);
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
            target = (com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType)get_store().add_element_user(SERVICEENDPOINTINTERFACE$0);
            return target;
        }
    }
    
    /**
     * Gets the "wsdl-port-type" element
     */
    public com.sun.java.xml.ns.j2Ee.XsdQNameType getWsdlPortType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.XsdQNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.XsdQNameType)get_store().find_element_user(WSDLPORTTYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "wsdl-port-type" element
     */
    public void setWsdlPortType(com.sun.java.xml.ns.j2Ee.XsdQNameType wsdlPortType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.XsdQNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.XsdQNameType)get_store().find_element_user(WSDLPORTTYPE$2, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.XsdQNameType)get_store().add_element_user(WSDLPORTTYPE$2);
            }
            target.set(wsdlPortType);
        }
    }
    
    /**
     * Appends and returns a new empty "wsdl-port-type" element
     */
    public com.sun.java.xml.ns.j2Ee.XsdQNameType addNewWsdlPortType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.XsdQNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.XsdQNameType)get_store().add_element_user(WSDLPORTTYPE$2);
            return target;
        }
    }
    
    /**
     * Gets the "wsdl-binding" element
     */
    public com.sun.java.xml.ns.j2Ee.XsdQNameType getWsdlBinding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.XsdQNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.XsdQNameType)get_store().find_element_user(WSDLBINDING$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "wsdl-binding" element
     */
    public void setWsdlBinding(com.sun.java.xml.ns.j2Ee.XsdQNameType wsdlBinding)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.XsdQNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.XsdQNameType)get_store().find_element_user(WSDLBINDING$4, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.XsdQNameType)get_store().add_element_user(WSDLBINDING$4);
            }
            target.set(wsdlBinding);
        }
    }
    
    /**
     * Appends and returns a new empty "wsdl-binding" element
     */
    public com.sun.java.xml.ns.j2Ee.XsdQNameType addNewWsdlBinding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.XsdQNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.XsdQNameType)get_store().add_element_user(WSDLBINDING$4);
            return target;
        }
    }
    
    /**
     * Gets a List of "service-endpoint-method-mapping" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType> getServiceEndpointMethodMappingList()
    {
        final class ServiceEndpointMethodMappingList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType>
        {
            public com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType get(int i)
                { return ServiceEndpointInterfaceMappingTypeImpl.this.getServiceEndpointMethodMappingArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType set(int i, com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType o)
            {
                com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType old = ServiceEndpointInterfaceMappingTypeImpl.this.getServiceEndpointMethodMappingArray(i);
                ServiceEndpointInterfaceMappingTypeImpl.this.setServiceEndpointMethodMappingArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType o)
                { ServiceEndpointInterfaceMappingTypeImpl.this.insertNewServiceEndpointMethodMapping(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType old = ServiceEndpointInterfaceMappingTypeImpl.this.getServiceEndpointMethodMappingArray(i);
                ServiceEndpointInterfaceMappingTypeImpl.this.removeServiceEndpointMethodMapping(i);
                return old;
            }
            
            public int size()
                { return ServiceEndpointInterfaceMappingTypeImpl.this.sizeOfServiceEndpointMethodMappingArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ServiceEndpointMethodMappingList();
        }
    }
    
    /**
     * Gets array of all "service-endpoint-method-mapping" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType[] getServiceEndpointMethodMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType>();
            get_store().find_all_element_users(SERVICEENDPOINTMETHODMAPPING$6, targetList);
            com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType[] result = new com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "service-endpoint-method-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType getServiceEndpointMethodMappingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType)get_store().find_element_user(SERVICEENDPOINTMETHODMAPPING$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "service-endpoint-method-mapping" element
     */
    public int sizeOfServiceEndpointMethodMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICEENDPOINTMETHODMAPPING$6);
        }
    }
    
    /**
     * Sets array of all "service-endpoint-method-mapping" element
     */
    public void setServiceEndpointMethodMappingArray(com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType[] serviceEndpointMethodMappingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(serviceEndpointMethodMappingArray, SERVICEENDPOINTMETHODMAPPING$6);
        }
    }
    
    /**
     * Sets ith "service-endpoint-method-mapping" element
     */
    public void setServiceEndpointMethodMappingArray(int i, com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType serviceEndpointMethodMapping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType)get_store().find_element_user(SERVICEENDPOINTMETHODMAPPING$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(serviceEndpointMethodMapping);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "service-endpoint-method-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType insertNewServiceEndpointMethodMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType)get_store().insert_element_user(SERVICEENDPOINTMETHODMAPPING$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "service-endpoint-method-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType addNewServiceEndpointMethodMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType)get_store().add_element_user(SERVICEENDPOINTMETHODMAPPING$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "service-endpoint-method-mapping" element
     */
    public void removeServiceEndpointMethodMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICEENDPOINTMETHODMAPPING$6, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$8);
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
            return get_store().find_attribute_user(ID$8) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$8);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$8);
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
            get_store().remove_attribute(ID$8);
        }
    }
}
