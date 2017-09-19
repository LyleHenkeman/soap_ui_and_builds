/*
 * XML Type:  tService
 * Namespace: http://schemas.xmlsoap.org/wsdl/
 * Java type: org.xmlsoap.schemas.wsdl.TService
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.wsdl.impl;
/**
 * An XML tService(@http://schemas.xmlsoap.org/wsdl/).
 *
 * This is a complex type.
 */
public class TServiceImpl extends org.xmlsoap.schemas.wsdl.impl.TExtensibleDocumentedImpl implements org.xmlsoap.schemas.wsdl.TService
{
    private static final long serialVersionUID = 1L;
    
    public TServiceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PORT$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/wsdl/", "port");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("", "name");
    
    
    /**
     * Gets a List of "port" elements
     */
    public java.util.List<org.xmlsoap.schemas.wsdl.TPort> getPortList()
    {
        final class PortList extends java.util.AbstractList<org.xmlsoap.schemas.wsdl.TPort>
        {
            public org.xmlsoap.schemas.wsdl.TPort get(int i)
                { return TServiceImpl.this.getPortArray(i); }
            
            public org.xmlsoap.schemas.wsdl.TPort set(int i, org.xmlsoap.schemas.wsdl.TPort o)
            {
                org.xmlsoap.schemas.wsdl.TPort old = TServiceImpl.this.getPortArray(i);
                TServiceImpl.this.setPortArray(i, o);
                return old;
            }
            
            public void add(int i, org.xmlsoap.schemas.wsdl.TPort o)
                { TServiceImpl.this.insertNewPort(i).set(o); }
            
            public org.xmlsoap.schemas.wsdl.TPort remove(int i)
            {
                org.xmlsoap.schemas.wsdl.TPort old = TServiceImpl.this.getPortArray(i);
                TServiceImpl.this.removePort(i);
                return old;
            }
            
            public int size()
                { return TServiceImpl.this.sizeOfPortArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PortList();
        }
    }
    
    /**
     * Gets array of all "port" elements
     * @deprecated
     */
    public org.xmlsoap.schemas.wsdl.TPort[] getPortArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.xmlsoap.schemas.wsdl.TPort> targetList = new java.util.ArrayList<org.xmlsoap.schemas.wsdl.TPort>();
            get_store().find_all_element_users(PORT$0, targetList);
            org.xmlsoap.schemas.wsdl.TPort[] result = new org.xmlsoap.schemas.wsdl.TPort[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "port" element
     */
    public org.xmlsoap.schemas.wsdl.TPort getPortArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.TPort target = null;
            target = (org.xmlsoap.schemas.wsdl.TPort)get_store().find_element_user(PORT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "port" element
     */
    public int sizeOfPortArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PORT$0);
        }
    }
    
    /**
     * Sets array of all "port" element
     */
    public void setPortArray(org.xmlsoap.schemas.wsdl.TPort[] portArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(portArray, PORT$0);
        }
    }
    
    /**
     * Sets ith "port" element
     */
    public void setPortArray(int i, org.xmlsoap.schemas.wsdl.TPort port)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.TPort target = null;
            target = (org.xmlsoap.schemas.wsdl.TPort)get_store().find_element_user(PORT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(port);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "port" element
     */
    public org.xmlsoap.schemas.wsdl.TPort insertNewPort(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.TPort target = null;
            target = (org.xmlsoap.schemas.wsdl.TPort)get_store().insert_element_user(PORT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "port" element
     */
    public org.xmlsoap.schemas.wsdl.TPort addNewPort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.TPort target = null;
            target = (org.xmlsoap.schemas.wsdl.TPort)get_store().add_element_user(PORT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "port" element
     */
    public void removePort(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PORT$0, i);
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
    public org.apache.xmlbeans.XmlNCName xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNCName target = null;
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(NAME$2);
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
    public void xsetName(org.apache.xmlbeans.XmlNCName name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNCName target = null;
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNCName)get_store().add_attribute_user(NAME$2);
            }
            target.set(name);
        }
    }
}
