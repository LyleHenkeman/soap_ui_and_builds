/*
 * XML Type:  UpgradeType
 * Namespace: http://www.w3.org/2003/05/soap-envelope
 * Java type: org.w3.x2003.x05.soapEnvelope.UpgradeType
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2003.x05.soapEnvelope.impl;
/**
 * An XML UpgradeType(@http://www.w3.org/2003/05/soap-envelope).
 *
 * This is a complex type.
 */
public class UpgradeTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2003.x05.soapEnvelope.UpgradeType
{
    private static final long serialVersionUID = 1L;
    
    public UpgradeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUPPORTEDENVELOPE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2003/05/soap-envelope", "SupportedEnvelope");
    
    
    /**
     * Gets a List of "SupportedEnvelope" elements
     */
    public java.util.List<org.w3.x2003.x05.soapEnvelope.SupportedEnvType> getSupportedEnvelopeList()
    {
        final class SupportedEnvelopeList extends java.util.AbstractList<org.w3.x2003.x05.soapEnvelope.SupportedEnvType>
        {
            public org.w3.x2003.x05.soapEnvelope.SupportedEnvType get(int i)
                { return UpgradeTypeImpl.this.getSupportedEnvelopeArray(i); }
            
            public org.w3.x2003.x05.soapEnvelope.SupportedEnvType set(int i, org.w3.x2003.x05.soapEnvelope.SupportedEnvType o)
            {
                org.w3.x2003.x05.soapEnvelope.SupportedEnvType old = UpgradeTypeImpl.this.getSupportedEnvelopeArray(i);
                UpgradeTypeImpl.this.setSupportedEnvelopeArray(i, o);
                return old;
            }
            
            public void add(int i, org.w3.x2003.x05.soapEnvelope.SupportedEnvType o)
                { UpgradeTypeImpl.this.insertNewSupportedEnvelope(i).set(o); }
            
            public org.w3.x2003.x05.soapEnvelope.SupportedEnvType remove(int i)
            {
                org.w3.x2003.x05.soapEnvelope.SupportedEnvType old = UpgradeTypeImpl.this.getSupportedEnvelopeArray(i);
                UpgradeTypeImpl.this.removeSupportedEnvelope(i);
                return old;
            }
            
            public int size()
                { return UpgradeTypeImpl.this.sizeOfSupportedEnvelopeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SupportedEnvelopeList();
        }
    }
    
    /**
     * Gets array of all "SupportedEnvelope" elements
     * @deprecated
     */
    public org.w3.x2003.x05.soapEnvelope.SupportedEnvType[] getSupportedEnvelopeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.w3.x2003.x05.soapEnvelope.SupportedEnvType> targetList = new java.util.ArrayList<org.w3.x2003.x05.soapEnvelope.SupportedEnvType>();
            get_store().find_all_element_users(SUPPORTEDENVELOPE$0, targetList);
            org.w3.x2003.x05.soapEnvelope.SupportedEnvType[] result = new org.w3.x2003.x05.soapEnvelope.SupportedEnvType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SupportedEnvelope" element
     */
    public org.w3.x2003.x05.soapEnvelope.SupportedEnvType getSupportedEnvelopeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2003.x05.soapEnvelope.SupportedEnvType target = null;
            target = (org.w3.x2003.x05.soapEnvelope.SupportedEnvType)get_store().find_element_user(SUPPORTEDENVELOPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SupportedEnvelope" element
     */
    public int sizeOfSupportedEnvelopeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPPORTEDENVELOPE$0);
        }
    }
    
    /**
     * Sets array of all "SupportedEnvelope" element
     */
    public void setSupportedEnvelopeArray(org.w3.x2003.x05.soapEnvelope.SupportedEnvType[] supportedEnvelopeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(supportedEnvelopeArray, SUPPORTEDENVELOPE$0);
        }
    }
    
    /**
     * Sets ith "SupportedEnvelope" element
     */
    public void setSupportedEnvelopeArray(int i, org.w3.x2003.x05.soapEnvelope.SupportedEnvType supportedEnvelope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2003.x05.soapEnvelope.SupportedEnvType target = null;
            target = (org.w3.x2003.x05.soapEnvelope.SupportedEnvType)get_store().find_element_user(SUPPORTEDENVELOPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(supportedEnvelope);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SupportedEnvelope" element
     */
    public org.w3.x2003.x05.soapEnvelope.SupportedEnvType insertNewSupportedEnvelope(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2003.x05.soapEnvelope.SupportedEnvType target = null;
            target = (org.w3.x2003.x05.soapEnvelope.SupportedEnvType)get_store().insert_element_user(SUPPORTEDENVELOPE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SupportedEnvelope" element
     */
    public org.w3.x2003.x05.soapEnvelope.SupportedEnvType addNewSupportedEnvelope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2003.x05.soapEnvelope.SupportedEnvType target = null;
            target = (org.w3.x2003.x05.soapEnvelope.SupportedEnvType)get_store().add_element_user(SUPPORTEDENVELOPE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "SupportedEnvelope" element
     */
    public void removeSupportedEnvelope(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPPORTEDENVELOPE$0, i);
        }
    }
}
