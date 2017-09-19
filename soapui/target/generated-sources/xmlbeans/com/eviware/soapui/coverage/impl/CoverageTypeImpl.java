/*
 * XML Type:  CoverageType
 * Namespace: http://eviware.com/soapui/coverage
 * Java type: com.eviware.soapui.coverage.CoverageType
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.coverage.impl;
/**
 * An XML CoverageType(@http://eviware.com/soapui/coverage).
 *
 * This is a complex type.
 */
public class CoverageTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.coverage.CoverageType
{
    private static final long serialVersionUID = 1L;
    
    public CoverageTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COVERAGE$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/coverage", "coverage");
    private static final javax.xml.namespace.QName ASSERTIONCOVERAGE$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/coverage", "assertionCoverage");
    private static final javax.xml.namespace.QName COUNT$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/coverage", "count");
    
    
    /**
     * Gets the "coverage" element
     */
    public java.math.BigInteger getCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COVERAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "coverage" element
     */
    public org.apache.xmlbeans.XmlInteger xgetCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(COVERAGE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "coverage" element
     */
    public void setCoverage(java.math.BigInteger coverage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COVERAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COVERAGE$0);
            }
            target.setBigIntegerValue(coverage);
        }
    }
    
    /**
     * Sets (as xml) the "coverage" element
     */
    public void xsetCoverage(org.apache.xmlbeans.XmlInteger coverage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(COVERAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(COVERAGE$0);
            }
            target.set(coverage);
        }
    }
    
    /**
     * Gets the "assertionCoverage" element
     */
    public java.math.BigInteger getAssertionCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSERTIONCOVERAGE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "assertionCoverage" element
     */
    public org.apache.xmlbeans.XmlInteger xgetAssertionCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ASSERTIONCOVERAGE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "assertionCoverage" element
     */
    public void setAssertionCoverage(java.math.BigInteger assertionCoverage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSERTIONCOVERAGE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ASSERTIONCOVERAGE$2);
            }
            target.setBigIntegerValue(assertionCoverage);
        }
    }
    
    /**
     * Sets (as xml) the "assertionCoverage" element
     */
    public void xsetAssertionCoverage(org.apache.xmlbeans.XmlInteger assertionCoverage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ASSERTIONCOVERAGE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(ASSERTIONCOVERAGE$2);
            }
            target.set(assertionCoverage);
        }
    }
    
    /**
     * Gets the "count" element
     */
    public java.math.BigInteger getCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "count" element
     */
    public org.apache.xmlbeans.XmlInteger xgetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(COUNT$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "count" element
     */
    public void setCount(java.math.BigInteger count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNT$4);
            }
            target.setBigIntegerValue(count);
        }
    }
    
    /**
     * Sets (as xml) the "count" element
     */
    public void xsetCount(org.apache.xmlbeans.XmlInteger count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(COUNT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(COUNT$4);
            }
            target.set(count);
        }
    }
}
