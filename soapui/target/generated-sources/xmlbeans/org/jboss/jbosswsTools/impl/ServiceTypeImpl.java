/*
 * XML Type:  serviceType
 * Namespace: http://www.jboss.org/jbossws-tools
 * Java type: org.jboss.jbosswsTools.ServiceType
 *
 * Automatically generated - do not modify.
 */
package org.jboss.jbosswsTools.impl;
/**
 * An XML serviceType(@http://www.jboss.org/jbossws-tools).
 *
 * This is a complex type.
 */
public class ServiceTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.jboss.jbosswsTools.ServiceType
{
    private static final long serialVersionUID = 1L;
    
    public ServiceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATION$0 = 
        new javax.xml.namespace.QName("http://www.jboss.org/jbossws-tools", "operation");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName ENDPOINT$4 = 
        new javax.xml.namespace.QName("", "endpoint");
    private static final javax.xml.namespace.QName STYLE$6 = 
        new javax.xml.namespace.QName("", "style");
    private static final javax.xml.namespace.QName PARAMETERSTYLE$8 = 
        new javax.xml.namespace.QName("", "parameter-style");
    
    
    /**
     * Gets a List of "operation" elements
     */
    public java.util.List<org.jboss.jbosswsTools.OperationType> getOperationList()
    {
        final class OperationList extends java.util.AbstractList<org.jboss.jbosswsTools.OperationType>
        {
            public org.jboss.jbosswsTools.OperationType get(int i)
                { return ServiceTypeImpl.this.getOperationArray(i); }
            
            public org.jboss.jbosswsTools.OperationType set(int i, org.jboss.jbosswsTools.OperationType o)
            {
                org.jboss.jbosswsTools.OperationType old = ServiceTypeImpl.this.getOperationArray(i);
                ServiceTypeImpl.this.setOperationArray(i, o);
                return old;
            }
            
            public void add(int i, org.jboss.jbosswsTools.OperationType o)
                { ServiceTypeImpl.this.insertNewOperation(i).set(o); }
            
            public org.jboss.jbosswsTools.OperationType remove(int i)
            {
                org.jboss.jbosswsTools.OperationType old = ServiceTypeImpl.this.getOperationArray(i);
                ServiceTypeImpl.this.removeOperation(i);
                return old;
            }
            
            public int size()
                { return ServiceTypeImpl.this.sizeOfOperationArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new OperationList();
        }
    }
    
    /**
     * Gets array of all "operation" elements
     * @deprecated
     */
    public org.jboss.jbosswsTools.OperationType[] getOperationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.jboss.jbosswsTools.OperationType> targetList = new java.util.ArrayList<org.jboss.jbosswsTools.OperationType>();
            get_store().find_all_element_users(OPERATION$0, targetList);
            org.jboss.jbosswsTools.OperationType[] result = new org.jboss.jbosswsTools.OperationType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "operation" element
     */
    public org.jboss.jbosswsTools.OperationType getOperationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.OperationType target = null;
            target = (org.jboss.jbosswsTools.OperationType)get_store().find_element_user(OPERATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "operation" element
     */
    public int sizeOfOperationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPERATION$0);
        }
    }
    
    /**
     * Sets array of all "operation" element
     */
    public void setOperationArray(org.jboss.jbosswsTools.OperationType[] operationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(operationArray, OPERATION$0);
        }
    }
    
    /**
     * Sets ith "operation" element
     */
    public void setOperationArray(int i, org.jboss.jbosswsTools.OperationType operation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.OperationType target = null;
            target = (org.jboss.jbosswsTools.OperationType)get_store().find_element_user(OPERATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(operation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "operation" element
     */
    public org.jboss.jbosswsTools.OperationType insertNewOperation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.OperationType target = null;
            target = (org.jboss.jbosswsTools.OperationType)get_store().insert_element_user(OPERATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "operation" element
     */
    public org.jboss.jbosswsTools.OperationType addNewOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.OperationType target = null;
            target = (org.jboss.jbosswsTools.OperationType)get_store().add_element_user(OPERATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "operation" element
     */
    public void removeOperation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPERATION$0, i);
        }
    }
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.jboss.jbosswsTools.ServiceType.Name xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.ServiceType.Name target = null;
            target = (org.jboss.jbosswsTools.ServiceType.Name)get_store().find_attribute_user(NAME$2);
            return target;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.jboss.jbosswsTools.ServiceType.Name name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.ServiceType.Name target = null;
            target = (org.jboss.jbosswsTools.ServiceType.Name)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.jboss.jbosswsTools.ServiceType.Name)get_store().add_attribute_user(NAME$2);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "endpoint" attribute
     */
    public java.lang.String getEndpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDPOINT$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "endpoint" attribute
     */
    public org.jboss.jbosswsTools.ServiceType.Endpoint xgetEndpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.ServiceType.Endpoint target = null;
            target = (org.jboss.jbosswsTools.ServiceType.Endpoint)get_store().find_attribute_user(ENDPOINT$4);
            return target;
        }
    }
    
    /**
     * Sets the "endpoint" attribute
     */
    public void setEndpoint(java.lang.String endpoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDPOINT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENDPOINT$4);
            }
            target.setStringValue(endpoint);
        }
    }
    
    /**
     * Sets (as xml) the "endpoint" attribute
     */
    public void xsetEndpoint(org.jboss.jbosswsTools.ServiceType.Endpoint endpoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.ServiceType.Endpoint target = null;
            target = (org.jboss.jbosswsTools.ServiceType.Endpoint)get_store().find_attribute_user(ENDPOINT$4);
            if (target == null)
            {
                target = (org.jboss.jbosswsTools.ServiceType.Endpoint)get_store().add_attribute_user(ENDPOINT$4);
            }
            target.set(endpoint);
        }
    }
    
    /**
     * Gets the "style" attribute
     */
    public org.jboss.jbosswsTools.ServiceType.Style.Enum getStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(STYLE$6);
            }
            if (target == null)
            {
                return null;
            }
            return (org.jboss.jbosswsTools.ServiceType.Style.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "style" attribute
     */
    public org.jboss.jbosswsTools.ServiceType.Style xgetStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.ServiceType.Style target = null;
            target = (org.jboss.jbosswsTools.ServiceType.Style)get_store().find_attribute_user(STYLE$6);
            if (target == null)
            {
                target = (org.jboss.jbosswsTools.ServiceType.Style)get_default_attribute_value(STYLE$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "style" attribute
     */
    public boolean isSetStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STYLE$6) != null;
        }
    }
    
    /**
     * Sets the "style" attribute
     */
    public void setStyle(org.jboss.jbosswsTools.ServiceType.Style.Enum style)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STYLE$6);
            }
            target.setEnumValue(style);
        }
    }
    
    /**
     * Sets (as xml) the "style" attribute
     */
    public void xsetStyle(org.jboss.jbosswsTools.ServiceType.Style style)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.ServiceType.Style target = null;
            target = (org.jboss.jbosswsTools.ServiceType.Style)get_store().find_attribute_user(STYLE$6);
            if (target == null)
            {
                target = (org.jboss.jbosswsTools.ServiceType.Style)get_store().add_attribute_user(STYLE$6);
            }
            target.set(style);
        }
    }
    
    /**
     * Unsets the "style" attribute
     */
    public void unsetStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STYLE$6);
        }
    }
    
    /**
     * Gets the "parameter-style" attribute
     */
    public org.jboss.jbosswsTools.ServiceType.ParameterStyle.Enum getParameterStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARAMETERSTYLE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PARAMETERSTYLE$8);
            }
            if (target == null)
            {
                return null;
            }
            return (org.jboss.jbosswsTools.ServiceType.ParameterStyle.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "parameter-style" attribute
     */
    public org.jboss.jbosswsTools.ServiceType.ParameterStyle xgetParameterStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.ServiceType.ParameterStyle target = null;
            target = (org.jboss.jbosswsTools.ServiceType.ParameterStyle)get_store().find_attribute_user(PARAMETERSTYLE$8);
            if (target == null)
            {
                target = (org.jboss.jbosswsTools.ServiceType.ParameterStyle)get_default_attribute_value(PARAMETERSTYLE$8);
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
            return get_store().find_attribute_user(PARAMETERSTYLE$8) != null;
        }
    }
    
    /**
     * Sets the "parameter-style" attribute
     */
    public void setParameterStyle(org.jboss.jbosswsTools.ServiceType.ParameterStyle.Enum parameterStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARAMETERSTYLE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARAMETERSTYLE$8);
            }
            target.setEnumValue(parameterStyle);
        }
    }
    
    /**
     * Sets (as xml) the "parameter-style" attribute
     */
    public void xsetParameterStyle(org.jboss.jbosswsTools.ServiceType.ParameterStyle parameterStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.ServiceType.ParameterStyle target = null;
            target = (org.jboss.jbosswsTools.ServiceType.ParameterStyle)get_store().find_attribute_user(PARAMETERSTYLE$8);
            if (target == null)
            {
                target = (org.jboss.jbosswsTools.ServiceType.ParameterStyle)get_store().add_attribute_user(PARAMETERSTYLE$8);
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
            get_store().remove_attribute(PARAMETERSTYLE$8);
        }
    }
    /**
     * An XML name(@).
     *
     * This is an atomic type that is a restriction of org.jboss.jbosswsTools.ServiceType$Name.
     */
    public static class NameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.jboss.jbosswsTools.ServiceType.Name
    {
        private static final long serialVersionUID = 1L;
        
        public NameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected NameImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML endpoint(@).
     *
     * This is an atomic type that is a restriction of org.jboss.jbosswsTools.ServiceType$Endpoint.
     */
    public static class EndpointImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.jboss.jbosswsTools.ServiceType.Endpoint
    {
        private static final long serialVersionUID = 1L;
        
        public EndpointImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected EndpointImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML style(@).
     *
     * This is an atomic type that is a restriction of org.jboss.jbosswsTools.ServiceType$Style.
     */
    public static class StyleImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.jboss.jbosswsTools.ServiceType.Style
    {
        private static final long serialVersionUID = 1L;
        
        public StyleImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected StyleImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML parameter-style(@).
     *
     * This is an atomic type that is a restriction of org.jboss.jbosswsTools.ServiceType$ParameterStyle.
     */
    public static class ParameterStyleImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.jboss.jbosswsTools.ServiceType.ParameterStyle
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
