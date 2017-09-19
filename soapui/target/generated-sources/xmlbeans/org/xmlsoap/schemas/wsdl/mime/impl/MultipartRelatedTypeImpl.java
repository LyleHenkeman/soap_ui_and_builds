/*
 * XML Type:  multipartRelatedType
 * Namespace: http://schemas.xmlsoap.org/wsdl/mime/
 * Java type: org.xmlsoap.schemas.wsdl.mime.MultipartRelatedType
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.wsdl.mime.impl;
/**
 * An XML multipartRelatedType(@http://schemas.xmlsoap.org/wsdl/mime/).
 *
 * This is a complex type.
 */
public class MultipartRelatedTypeImpl extends org.xmlsoap.schemas.wsdl.impl.TExtensibilityElementImpl implements org.xmlsoap.schemas.wsdl.mime.MultipartRelatedType
{
    private static final long serialVersionUID = 1L;
    
    public MultipartRelatedTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PART$0 = 
        new javax.xml.namespace.QName("", "part");
    
    
    /**
     * Gets a List of "part" elements
     */
    public java.util.List<org.xmlsoap.schemas.wsdl.mime.TPart> getPartList()
    {
        final class PartList extends java.util.AbstractList<org.xmlsoap.schemas.wsdl.mime.TPart>
        {
            public org.xmlsoap.schemas.wsdl.mime.TPart get(int i)
                { return MultipartRelatedTypeImpl.this.getPartArray(i); }
            
            public org.xmlsoap.schemas.wsdl.mime.TPart set(int i, org.xmlsoap.schemas.wsdl.mime.TPart o)
            {
                org.xmlsoap.schemas.wsdl.mime.TPart old = MultipartRelatedTypeImpl.this.getPartArray(i);
                MultipartRelatedTypeImpl.this.setPartArray(i, o);
                return old;
            }
            
            public void add(int i, org.xmlsoap.schemas.wsdl.mime.TPart o)
                { MultipartRelatedTypeImpl.this.insertNewPart(i).set(o); }
            
            public org.xmlsoap.schemas.wsdl.mime.TPart remove(int i)
            {
                org.xmlsoap.schemas.wsdl.mime.TPart old = MultipartRelatedTypeImpl.this.getPartArray(i);
                MultipartRelatedTypeImpl.this.removePart(i);
                return old;
            }
            
            public int size()
                { return MultipartRelatedTypeImpl.this.sizeOfPartArray(); }
            
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
    public org.xmlsoap.schemas.wsdl.mime.TPart[] getPartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.xmlsoap.schemas.wsdl.mime.TPart> targetList = new java.util.ArrayList<org.xmlsoap.schemas.wsdl.mime.TPart>();
            get_store().find_all_element_users(PART$0, targetList);
            org.xmlsoap.schemas.wsdl.mime.TPart[] result = new org.xmlsoap.schemas.wsdl.mime.TPart[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "part" element
     */
    public org.xmlsoap.schemas.wsdl.mime.TPart getPartArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.mime.TPart target = null;
            target = (org.xmlsoap.schemas.wsdl.mime.TPart)get_store().find_element_user(PART$0, i);
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
    public void setPartArray(org.xmlsoap.schemas.wsdl.mime.TPart[] partArray)
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
    public void setPartArray(int i, org.xmlsoap.schemas.wsdl.mime.TPart part)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.mime.TPart target = null;
            target = (org.xmlsoap.schemas.wsdl.mime.TPart)get_store().find_element_user(PART$0, i);
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
    public org.xmlsoap.schemas.wsdl.mime.TPart insertNewPart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.mime.TPart target = null;
            target = (org.xmlsoap.schemas.wsdl.mime.TPart)get_store().insert_element_user(PART$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "part" element
     */
    public org.xmlsoap.schemas.wsdl.mime.TPart addNewPart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.mime.TPart target = null;
            target = (org.xmlsoap.schemas.wsdl.mime.TPart)get_store().add_element_user(PART$0);
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
}
