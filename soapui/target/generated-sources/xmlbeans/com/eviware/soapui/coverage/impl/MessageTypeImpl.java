/*
 * XML Type:  MessageType
 * Namespace: http://eviware.com/soapui/coverage
 * Java type: com.eviware.soapui.coverage.MessageType
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.coverage.impl;
/**
 * An XML MessageType(@http://eviware.com/soapui/coverage).
 *
 * This is a complex type.
 */
public class MessageTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.coverage.MessageType
{
    private static final long serialVersionUID = 1L;
    
    public MessageTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTRACTCOVERAGE$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/coverage", "contractCoverage");
    private static final javax.xml.namespace.QName LINE$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/coverage", "line");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("", "type");
    
    
    /**
     * Gets the "contractCoverage" element
     */
    public com.eviware.soapui.coverage.CoverageType getContractCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.coverage.CoverageType target = null;
            target = (com.eviware.soapui.coverage.CoverageType)get_store().find_element_user(CONTRACTCOVERAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "contractCoverage" element
     */
    public void setContractCoverage(com.eviware.soapui.coverage.CoverageType contractCoverage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.coverage.CoverageType target = null;
            target = (com.eviware.soapui.coverage.CoverageType)get_store().find_element_user(CONTRACTCOVERAGE$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.coverage.CoverageType)get_store().add_element_user(CONTRACTCOVERAGE$0);
            }
            target.set(contractCoverage);
        }
    }
    
    /**
     * Appends and returns a new empty "contractCoverage" element
     */
    public com.eviware.soapui.coverage.CoverageType addNewContractCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.coverage.CoverageType target = null;
            target = (com.eviware.soapui.coverage.CoverageType)get_store().add_element_user(CONTRACTCOVERAGE$0);
            return target;
        }
    }
    
    /**
     * Gets a List of "line" elements
     */
    public java.util.List<com.eviware.soapui.coverage.LineType> getLineList()
    {
        final class LineList extends java.util.AbstractList<com.eviware.soapui.coverage.LineType>
        {
            public com.eviware.soapui.coverage.LineType get(int i)
                { return MessageTypeImpl.this.getLineArray(i); }
            
            public com.eviware.soapui.coverage.LineType set(int i, com.eviware.soapui.coverage.LineType o)
            {
                com.eviware.soapui.coverage.LineType old = MessageTypeImpl.this.getLineArray(i);
                MessageTypeImpl.this.setLineArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.coverage.LineType o)
                { MessageTypeImpl.this.insertNewLine(i).set(o); }
            
            public com.eviware.soapui.coverage.LineType remove(int i)
            {
                com.eviware.soapui.coverage.LineType old = MessageTypeImpl.this.getLineArray(i);
                MessageTypeImpl.this.removeLine(i);
                return old;
            }
            
            public int size()
                { return MessageTypeImpl.this.sizeOfLineArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LineList();
        }
    }
    
    /**
     * Gets array of all "line" elements
     * @deprecated
     */
    public com.eviware.soapui.coverage.LineType[] getLineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.coverage.LineType> targetList = new java.util.ArrayList<com.eviware.soapui.coverage.LineType>();
            get_store().find_all_element_users(LINE$2, targetList);
            com.eviware.soapui.coverage.LineType[] result = new com.eviware.soapui.coverage.LineType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "line" element
     */
    public com.eviware.soapui.coverage.LineType getLineArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.coverage.LineType target = null;
            target = (com.eviware.soapui.coverage.LineType)get_store().find_element_user(LINE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "line" element
     */
    public int sizeOfLineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINE$2);
        }
    }
    
    /**
     * Sets array of all "line" element
     */
    public void setLineArray(com.eviware.soapui.coverage.LineType[] lineArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(lineArray, LINE$2);
        }
    }
    
    /**
     * Sets ith "line" element
     */
    public void setLineArray(int i, com.eviware.soapui.coverage.LineType line)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.coverage.LineType target = null;
            target = (com.eviware.soapui.coverage.LineType)get_store().find_element_user(LINE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(line);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "line" element
     */
    public com.eviware.soapui.coverage.LineType insertNewLine(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.coverage.LineType target = null;
            target = (com.eviware.soapui.coverage.LineType)get_store().insert_element_user(LINE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "line" element
     */
    public com.eviware.soapui.coverage.LineType addNewLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.coverage.LineType target = null;
            target = (com.eviware.soapui.coverage.LineType)get_store().add_element_user(LINE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "line" element
     */
    public void removeLine(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINE$2, i);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public java.lang.String getType()
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
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.apache.xmlbeans.XmlString xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$4);
            return target;
        }
    }
    
    /**
     * True if has "type" attribute
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE$4) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(java.lang.String type)
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
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.apache.xmlbeans.XmlString type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$4);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" attribute
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE$4);
        }
    }
}
