/*
 * XML Type:  tBinding
 * Namespace: http://schemas.xmlsoap.org/wsdl/
 * Java type: org.xmlsoap.schemas.wsdl.TBinding
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.wsdl.impl;
/**
 * An XML tBinding(@http://schemas.xmlsoap.org/wsdl/).
 *
 * This is a complex type.
 */
public class TBindingImpl extends org.xmlsoap.schemas.wsdl.impl.TExtensibleDocumentedImpl implements org.xmlsoap.schemas.wsdl.TBinding
{
    private static final long serialVersionUID = 1L;
    
    public TBindingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATION$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/wsdl/", "operation");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("", "type");
    
    
    /**
     * Gets a List of "operation" elements
     */
    public java.util.List<org.xmlsoap.schemas.wsdl.TBindingOperation> getOperationList()
    {
        final class OperationList extends java.util.AbstractList<org.xmlsoap.schemas.wsdl.TBindingOperation>
        {
            public org.xmlsoap.schemas.wsdl.TBindingOperation get(int i)
                { return TBindingImpl.this.getOperationArray(i); }
            
            public org.xmlsoap.schemas.wsdl.TBindingOperation set(int i, org.xmlsoap.schemas.wsdl.TBindingOperation o)
            {
                org.xmlsoap.schemas.wsdl.TBindingOperation old = TBindingImpl.this.getOperationArray(i);
                TBindingImpl.this.setOperationArray(i, o);
                return old;
            }
            
            public void add(int i, org.xmlsoap.schemas.wsdl.TBindingOperation o)
                { TBindingImpl.this.insertNewOperation(i).set(o); }
            
            public org.xmlsoap.schemas.wsdl.TBindingOperation remove(int i)
            {
                org.xmlsoap.schemas.wsdl.TBindingOperation old = TBindingImpl.this.getOperationArray(i);
                TBindingImpl.this.removeOperation(i);
                return old;
            }
            
            public int size()
                { return TBindingImpl.this.sizeOfOperationArray(); }
            
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
    public org.xmlsoap.schemas.wsdl.TBindingOperation[] getOperationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.xmlsoap.schemas.wsdl.TBindingOperation> targetList = new java.util.ArrayList<org.xmlsoap.schemas.wsdl.TBindingOperation>();
            get_store().find_all_element_users(OPERATION$0, targetList);
            org.xmlsoap.schemas.wsdl.TBindingOperation[] result = new org.xmlsoap.schemas.wsdl.TBindingOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "operation" element
     */
    public org.xmlsoap.schemas.wsdl.TBindingOperation getOperationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.TBindingOperation target = null;
            target = (org.xmlsoap.schemas.wsdl.TBindingOperation)get_store().find_element_user(OPERATION$0, i);
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
    public void setOperationArray(org.xmlsoap.schemas.wsdl.TBindingOperation[] operationArray)
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
    public void setOperationArray(int i, org.xmlsoap.schemas.wsdl.TBindingOperation operation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.TBindingOperation target = null;
            target = (org.xmlsoap.schemas.wsdl.TBindingOperation)get_store().find_element_user(OPERATION$0, i);
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
    public org.xmlsoap.schemas.wsdl.TBindingOperation insertNewOperation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.TBindingOperation target = null;
            target = (org.xmlsoap.schemas.wsdl.TBindingOperation)get_store().insert_element_user(OPERATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "operation" element
     */
    public org.xmlsoap.schemas.wsdl.TBindingOperation addNewOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.TBindingOperation target = null;
            target = (org.xmlsoap.schemas.wsdl.TBindingOperation)get_store().add_element_user(OPERATION$0);
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
    
    /**
     * Gets the "type" attribute
     */
    public javax.xml.namespace.QName getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(TYPE$4);
            return target;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(javax.xml.namespace.QName type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$4);
            }
            target.setQNameValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.apache.xmlbeans.XmlQName type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(TYPE$4);
            }
            target.set(type);
        }
    }
}
