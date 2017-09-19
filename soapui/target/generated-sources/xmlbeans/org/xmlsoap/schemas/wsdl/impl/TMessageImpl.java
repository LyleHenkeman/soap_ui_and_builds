/*
 * XML Type:  tMessage
 * Namespace: http://schemas.xmlsoap.org/wsdl/
 * Java type: org.xmlsoap.schemas.wsdl.TMessage
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.wsdl.impl;
/**
 * An XML tMessage(@http://schemas.xmlsoap.org/wsdl/).
 *
 * This is a complex type.
 */
public class TMessageImpl extends org.xmlsoap.schemas.wsdl.impl.TExtensibleDocumentedImpl implements org.xmlsoap.schemas.wsdl.TMessage
{
    private static final long serialVersionUID = 1L;
    
    public TMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PART$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/wsdl/", "part");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("", "name");
    
    
    /**
     * Gets a List of "part" elements
     */
    public java.util.List<org.xmlsoap.schemas.wsdl.TPart> getPartList()
    {
        final class PartList extends java.util.AbstractList<org.xmlsoap.schemas.wsdl.TPart>
        {
            public org.xmlsoap.schemas.wsdl.TPart get(int i)
                { return TMessageImpl.this.getPartArray(i); }
            
            public org.xmlsoap.schemas.wsdl.TPart set(int i, org.xmlsoap.schemas.wsdl.TPart o)
            {
                org.xmlsoap.schemas.wsdl.TPart old = TMessageImpl.this.getPartArray(i);
                TMessageImpl.this.setPartArray(i, o);
                return old;
            }
            
            public void add(int i, org.xmlsoap.schemas.wsdl.TPart o)
                { TMessageImpl.this.insertNewPart(i).set(o); }
            
            public org.xmlsoap.schemas.wsdl.TPart remove(int i)
            {
                org.xmlsoap.schemas.wsdl.TPart old = TMessageImpl.this.getPartArray(i);
                TMessageImpl.this.removePart(i);
                return old;
            }
            
            public int size()
                { return TMessageImpl.this.sizeOfPartArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PartList();
        }
    }
    
    /**
     * Gets array of all "part" elements
     * @deprecated
     */
    public org.xmlsoap.schemas.wsdl.TPart[] getPartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.xmlsoap.schemas.wsdl.TPart> targetList = new java.util.ArrayList<org.xmlsoap.schemas.wsdl.TPart>();
            get_store().find_all_element_users(PART$0, targetList);
            org.xmlsoap.schemas.wsdl.TPart[] result = new org.xmlsoap.schemas.wsdl.TPart[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "part" element
     */
    public org.xmlsoap.schemas.wsdl.TPart getPartArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.TPart target = null;
            target = (org.xmlsoap.schemas.wsdl.TPart)get_store().find_element_user(PART$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "part" element
     */
    public int sizeOfPartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PART$0);
        }
    }
    
    /**
     * Sets array of all "part" element
     */
    public void setPartArray(org.xmlsoap.schemas.wsdl.TPart[] partArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(partArray, PART$0);
        }
    }
    
    /**
     * Sets ith "part" element
     */
    public void setPartArray(int i, org.xmlsoap.schemas.wsdl.TPart part)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.TPart target = null;
            target = (org.xmlsoap.schemas.wsdl.TPart)get_store().find_element_user(PART$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(part);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "part" element
     */
    public org.xmlsoap.schemas.wsdl.TPart insertNewPart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.TPart target = null;
            target = (org.xmlsoap.schemas.wsdl.TPart)get_store().insert_element_user(PART$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "part" element
     */
    public org.xmlsoap.schemas.wsdl.TPart addNewPart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.TPart target = null;
            target = (org.xmlsoap.schemas.wsdl.TPart)get_store().add_element_user(PART$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "part" element
     */
    public void removePart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PART$0, i);
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
