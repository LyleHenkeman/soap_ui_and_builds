/*
 * XML Type:  faultreason
 * Namespace: http://www.w3.org/2003/05/soap-envelope
 * Java type: org.w3.x2003.x05.soapEnvelope.Faultreason
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2003.x05.soapEnvelope.impl;
/**
 * An XML faultreason(@http://www.w3.org/2003/05/soap-envelope).
 *
 * This is a complex type.
 */
public class FaultreasonImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2003.x05.soapEnvelope.Faultreason
{
    private static final long serialVersionUID = 1L;
    
    public FaultreasonImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEXT$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2003/05/soap-envelope", "Text");
    
    
    /**
     * Gets a List of "Text" elements
     */
    public java.util.List<org.w3.x2003.x05.soapEnvelope.Reasontext> getTextList()
    {
        final class TextList extends java.util.AbstractList<org.w3.x2003.x05.soapEnvelope.Reasontext>
        {
            public org.w3.x2003.x05.soapEnvelope.Reasontext get(int i)
                { return FaultreasonImpl.this.getTextArray(i); }
            
            public org.w3.x2003.x05.soapEnvelope.Reasontext set(int i, org.w3.x2003.x05.soapEnvelope.Reasontext o)
            {
                org.w3.x2003.x05.soapEnvelope.Reasontext old = FaultreasonImpl.this.getTextArray(i);
                FaultreasonImpl.this.setTextArray(i, o);
                return old;
            }
            
            public void add(int i, org.w3.x2003.x05.soapEnvelope.Reasontext o)
                { FaultreasonImpl.this.insertNewText(i).set(o); }
            
            public org.w3.x2003.x05.soapEnvelope.Reasontext remove(int i)
            {
                org.w3.x2003.x05.soapEnvelope.Reasontext old = FaultreasonImpl.this.getTextArray(i);
                FaultreasonImpl.this.removeText(i);
                return old;
            }
            
            public int size()
                { return FaultreasonImpl.this.sizeOfTextArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TextList();
        }
    }
    
    /**
     * Gets array of all "Text" elements
     * @deprecated
     */
    public org.w3.x2003.x05.soapEnvelope.Reasontext[] getTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.w3.x2003.x05.soapEnvelope.Reasontext> targetList = new java.util.ArrayList<org.w3.x2003.x05.soapEnvelope.Reasontext>();
            get_store().find_all_element_users(TEXT$0, targetList);
            org.w3.x2003.x05.soapEnvelope.Reasontext[] result = new org.w3.x2003.x05.soapEnvelope.Reasontext[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Text" element
     */
    public org.w3.x2003.x05.soapEnvelope.Reasontext getTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2003.x05.soapEnvelope.Reasontext target = null;
            target = (org.w3.x2003.x05.soapEnvelope.Reasontext)get_store().find_element_user(TEXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Text" element
     */
    public int sizeOfTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEXT$0);
        }
    }
    
    /**
     * Sets array of all "Text" element
     */
    public void setTextArray(org.w3.x2003.x05.soapEnvelope.Reasontext[] textArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(textArray, TEXT$0);
        }
    }
    
    /**
     * Sets ith "Text" element
     */
    public void setTextArray(int i, org.w3.x2003.x05.soapEnvelope.Reasontext text)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2003.x05.soapEnvelope.Reasontext target = null;
            target = (org.w3.x2003.x05.soapEnvelope.Reasontext)get_store().find_element_user(TEXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(text);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Text" element
     */
    public org.w3.x2003.x05.soapEnvelope.Reasontext insertNewText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2003.x05.soapEnvelope.Reasontext target = null;
            target = (org.w3.x2003.x05.soapEnvelope.Reasontext)get_store().insert_element_user(TEXT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Text" element
     */
    public org.w3.x2003.x05.soapEnvelope.Reasontext addNewText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2003.x05.soapEnvelope.Reasontext target = null;
            target = (org.w3.x2003.x05.soapEnvelope.Reasontext)get_store().add_element_user(TEXT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Text" element
     */
    public void removeText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEXT$0, i);
        }
    }
}
