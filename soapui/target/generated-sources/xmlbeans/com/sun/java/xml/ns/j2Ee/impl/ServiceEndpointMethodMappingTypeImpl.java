/*
 * XML Type:  service-endpoint-method-mappingType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * An XML service-endpoint-method-mappingType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public class ServiceEndpointMethodMappingTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType
{
    private static final long serialVersionUID = 1L;
    
    public ServiceEndpointMethodMappingTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName JAVAMETHODNAME$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "java-method-name");
    private static final javax.xml.namespace.QName WSDLOPERATION$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "wsdl-operation");
    private static final javax.xml.namespace.QName WRAPPEDELEMENT$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "wrapped-element");
    private static final javax.xml.namespace.QName METHODPARAMPARTSMAPPING$6 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "method-param-parts-mapping");
    private static final javax.xml.namespace.QName WSDLRETURNVALUEMAPPING$8 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "wsdl-return-value-mapping");
    private static final javax.xml.namespace.QName ID$10 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "java-method-name" element
     */
    public com.sun.java.xml.ns.j2Ee.String getJavaMethodName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().find_element_user(JAVAMETHODNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "java-method-name" element
     */
    public void setJavaMethodName(com.sun.java.xml.ns.j2Ee.String javaMethodName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().find_element_user(JAVAMETHODNAME$0, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.String)get_store().add_element_user(JAVAMETHODNAME$0);
            }
            target.set(javaMethodName);
        }
    }
    
    /**
     * Appends and returns a new empty "java-method-name" element
     */
    public com.sun.java.xml.ns.j2Ee.String addNewJavaMethodName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().add_element_user(JAVAMETHODNAME$0);
            return target;
        }
    }
    
    /**
     * Gets the "wsdl-operation" element
     */
    public com.sun.java.xml.ns.j2Ee.String getWsdlOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().find_element_user(WSDLOPERATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "wsdl-operation" element
     */
    public void setWsdlOperation(com.sun.java.xml.ns.j2Ee.String wsdlOperation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().find_element_user(WSDLOPERATION$2, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.String)get_store().add_element_user(WSDLOPERATION$2);
            }
            target.set(wsdlOperation);
        }
    }
    
    /**
     * Appends and returns a new empty "wsdl-operation" element
     */
    public com.sun.java.xml.ns.j2Ee.String addNewWsdlOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().add_element_user(WSDLOPERATION$2);
            return target;
        }
    }
    
    /**
     * Gets the "wrapped-element" element
     */
    public com.sun.java.xml.ns.j2Ee.EmptyType getWrappedElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EmptyType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EmptyType)get_store().find_element_user(WRAPPEDELEMENT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "wrapped-element" element
     */
    public boolean isSetWrappedElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WRAPPEDELEMENT$4) != 0;
        }
    }
    
    /**
     * Sets the "wrapped-element" element
     */
    public void setWrappedElement(com.sun.java.xml.ns.j2Ee.EmptyType wrappedElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EmptyType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EmptyType)get_store().find_element_user(WRAPPEDELEMENT$4, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.EmptyType)get_store().add_element_user(WRAPPEDELEMENT$4);
            }
            target.set(wrappedElement);
        }
    }
    
    /**
     * Appends and returns a new empty "wrapped-element" element
     */
    public com.sun.java.xml.ns.j2Ee.EmptyType addNewWrappedElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EmptyType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EmptyType)get_store().add_element_user(WRAPPEDELEMENT$4);
            return target;
        }
    }
    
    /**
     * Unsets the "wrapped-element" element
     */
    public void unsetWrappedElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WRAPPEDELEMENT$4, 0);
        }
    }
    
    /**
     * Gets a List of "method-param-parts-mapping" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.MethodParamPartsMappingType> getMethodParamPartsMappingList()
    {
        final class MethodParamPartsMappingList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.MethodParamPartsMappingType>
        {
            public com.sun.java.xml.ns.j2Ee.MethodParamPartsMappingType get(int i)
                { return ServiceEndpointMethodMappingTypeImpl.this.getMethodParamPartsMappingArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.MethodParamPartsMappingType set(int i, com.sun.java.xml.ns.j2Ee.MethodParamPartsMappingType o)
            {
                com.sun.java.xml.ns.j2Ee.MethodParamPartsMappingType old = ServiceEndpointMethodMappingTypeImpl.this.getMethodParamPartsMappingArray(i);
                ServiceEndpointMethodMappingTypeImpl.this.setMethodParamPartsMappingArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.MethodParamPartsMappingType o)
                { ServiceEndpointMethodMappingTypeImpl.this.insertNewMethodParamPartsMapping(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.MethodParamPartsMappingType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.MethodParamPartsMappingType old = ServiceEndpointMethodMappingTypeImpl.this.getMethodParamPartsMappingArray(i);
                ServiceEndpointMethodMappingTypeImpl.this.removeMethodParamPartsMapping(i);
                return old;
            }
            
            public int size()
                { return ServiceEndpointMethodMappingTypeImpl.this.sizeOfMethodParamPartsMappingArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MethodParamPartsMappingList();
        }
    }
    
    /**
     * Gets array of all "method-param-parts-mapping" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.MethodParamPartsMappingType[] getMethodParamPartsMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.MethodParamPartsMappingType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.MethodParamPartsMappingType>();
            get_store().find_all_element_users(METHODPARAMPARTSMAPPING$6, targetList);
            com.sun.java.xml.ns.j2Ee.MethodParamPartsMappingType[] result = new com.sun.java.xml.ns.j2Ee.MethodParamPartsMappingType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "method-param-parts-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.MethodParamPartsMappingType getMethodParamPartsMappingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MethodParamPartsMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MethodParamPartsMappingType)get_store().find_element_user(METHODPARAMPARTSMAPPING$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "method-param-parts-mapping" element
     */
    public int sizeOfMethodParamPartsMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METHODPARAMPARTSMAPPING$6);
        }
    }
    
    /**
     * Sets array of all "method-param-parts-mapping" element
     */
    public void setMethodParamPartsMappingArray(com.sun.java.xml.ns.j2Ee.MethodParamPartsMappingType[] methodParamPartsMappingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(methodParamPartsMappingArray, METHODPARAMPARTSMAPPING$6);
        }
    }
    
    /**
     * Sets ith "method-param-parts-mapping" element
     */
    public void setMethodParamPartsMappingArray(int i, com.sun.java.xml.ns.j2Ee.MethodParamPartsMappingType methodParamPartsMapping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MethodParamPartsMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MethodParamPartsMappingType)get_store().find_element_user(METHODPARAMPARTSMAPPING$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(methodParamPartsMapping);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "method-param-parts-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.MethodParamPartsMappingType insertNewMethodParamPartsMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MethodParamPartsMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MethodParamPartsMappingType)get_store().insert_element_user(METHODPARAMPARTSMAPPING$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "method-param-parts-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.MethodParamPartsMappingType addNewMethodParamPartsMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MethodParamPartsMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MethodParamPartsMappingType)get_store().add_element_user(METHODPARAMPARTSMAPPING$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "method-param-parts-mapping" element
     */
    public void removeMethodParamPartsMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METHODPARAMPARTSMAPPING$6, i);
        }
    }
    
    /**
     * Gets the "wsdl-return-value-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.WsdlReturnValueMappingType getWsdlReturnValueMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.WsdlReturnValueMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.WsdlReturnValueMappingType)get_store().find_element_user(WSDLRETURNVALUEMAPPING$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "wsdl-return-value-mapping" element
     */
    public boolean isSetWsdlReturnValueMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WSDLRETURNVALUEMAPPING$8) != 0;
        }
    }
    
    /**
     * Sets the "wsdl-return-value-mapping" element
     */
    public void setWsdlReturnValueMapping(com.sun.java.xml.ns.j2Ee.WsdlReturnValueMappingType wsdlReturnValueMapping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.WsdlReturnValueMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.WsdlReturnValueMappingType)get_store().find_element_user(WSDLRETURNVALUEMAPPING$8, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.WsdlReturnValueMappingType)get_store().add_element_user(WSDLRETURNVALUEMAPPING$8);
            }
            target.set(wsdlReturnValueMapping);
        }
    }
    
    /**
     * Appends and returns a new empty "wsdl-return-value-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.WsdlReturnValueMappingType addNewWsdlReturnValueMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.WsdlReturnValueMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.WsdlReturnValueMappingType)get_store().add_element_user(WSDLRETURNVALUEMAPPING$8);
            return target;
        }
    }
    
    /**
     * Unsets the "wsdl-return-value-mapping" element
     */
    public void unsetWsdlReturnValueMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WSDLRETURNVALUEMAPPING$8, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$10);
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
            return get_store().find_attribute_user(ID$10) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$10);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$10);
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
            get_store().remove_attribute(ID$10);
        }
    }
}
