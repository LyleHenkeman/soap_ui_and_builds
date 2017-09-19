/*
 * XML Type:  LineType
 * Namespace: http://eviware.com/soapui/coverage
 * Java type: com.eviware.soapui.coverage.LineType
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.coverage.impl;
/**
 * An XML LineType(@http://eviware.com/soapui/coverage).
 *
 * This is a complex type.
 */
public class LineTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.coverage.LineType
{
    private static final long serialVersionUID = 1L;
    
    public LineTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEXT$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/coverage", "text");
    private static final javax.xml.namespace.QName SEGMENT$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/coverage", "segment");
    private static final javax.xml.namespace.QName COVERAGE$4 = 
        new javax.xml.namespace.QName("", "coverage");
    
    
    /**
     * Gets the "text" element
     */
    public java.lang.String getText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "text" element
     */
    public org.apache.xmlbeans.XmlString xgetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEXT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "text" element
     */
    public void setText(java.lang.String text)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEXT$0);
            }
            target.setStringValue(text);
        }
    }
    
    /**
     * Sets (as xml) the "text" element
     */
    public void xsetText(org.apache.xmlbeans.XmlString text)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEXT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TEXT$0);
            }
            target.set(text);
        }
    }
    
    /**
     * Gets a List of "segment" elements
     */
    public java.util.List<com.eviware.soapui.coverage.SegmentType> getSegmentList()
    {
        final class SegmentList extends java.util.AbstractList<com.eviware.soapui.coverage.SegmentType>
        {
            public com.eviware.soapui.coverage.SegmentType get(int i)
                { return LineTypeImpl.this.getSegmentArray(i); }
            
            public com.eviware.soapui.coverage.SegmentType set(int i, com.eviware.soapui.coverage.SegmentType o)
            {
                com.eviware.soapui.coverage.SegmentType old = LineTypeImpl.this.getSegmentArray(i);
                LineTypeImpl.this.setSegmentArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.coverage.SegmentType o)
                { LineTypeImpl.this.insertNewSegment(i).set(o); }
            
            public com.eviware.soapui.coverage.SegmentType remove(int i)
            {
                com.eviware.soapui.coverage.SegmentType old = LineTypeImpl.this.getSegmentArray(i);
                LineTypeImpl.this.removeSegment(i);
                return old;
            }
            
            public int size()
                { return LineTypeImpl.this.sizeOfSegmentArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SegmentList();
        }
    }
    
    /**
     * Gets array of all "segment" elements
     * @deprecated
     */
    public com.eviware.soapui.coverage.SegmentType[] getSegmentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.coverage.SegmentType> targetList = new java.util.ArrayList<com.eviware.soapui.coverage.SegmentType>();
            get_store().find_all_element_users(SEGMENT$2, targetList);
            com.eviware.soapui.coverage.SegmentType[] result = new com.eviware.soapui.coverage.SegmentType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "segment" element
     */
    public com.eviware.soapui.coverage.SegmentType getSegmentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.coverage.SegmentType target = null;
            target = (com.eviware.soapui.coverage.SegmentType)get_store().find_element_user(SEGMENT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "segment" element
     */
    public int sizeOfSegmentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEGMENT$2);
        }
    }
    
    /**
     * Sets array of all "segment" element
     */
    public void setSegmentArray(com.eviware.soapui.coverage.SegmentType[] segmentArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(segmentArray, SEGMENT$2);
        }
    }
    
    /**
     * Sets ith "segment" element
     */
    public void setSegmentArray(int i, com.eviware.soapui.coverage.SegmentType segment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.coverage.SegmentType target = null;
            target = (com.eviware.soapui.coverage.SegmentType)get_store().find_element_user(SEGMENT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(segment);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "segment" element
     */
    public com.eviware.soapui.coverage.SegmentType insertNewSegment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.coverage.SegmentType target = null;
            target = (com.eviware.soapui.coverage.SegmentType)get_store().insert_element_user(SEGMENT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "segment" element
     */
    public com.eviware.soapui.coverage.SegmentType addNewSegment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.coverage.SegmentType target = null;
            target = (com.eviware.soapui.coverage.SegmentType)get_store().add_element_user(SEGMENT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "segment" element
     */
    public void removeSegment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEGMENT$2, i);
        }
    }
    
    /**
     * Gets the "coverage" attribute
     */
    public java.lang.String getCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COVERAGE$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "coverage" attribute
     */
    public org.apache.xmlbeans.XmlString xgetCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COVERAGE$4);
            return target;
        }
    }
    
    /**
     * True if has "coverage" attribute
     */
    public boolean isSetCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COVERAGE$4) != null;
        }
    }
    
    /**
     * Sets the "coverage" attribute
     */
    public void setCoverage(java.lang.String coverage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COVERAGE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COVERAGE$4);
            }
            target.setStringValue(coverage);
        }
    }
    
    /**
     * Sets (as xml) the "coverage" attribute
     */
    public void xsetCoverage(org.apache.xmlbeans.XmlString coverage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COVERAGE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(COVERAGE$4);
            }
            target.set(coverage);
        }
    }
    
    /**
     * Unsets the "coverage" attribute
     */
    public void unsetCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COVERAGE$4);
        }
    }
}
