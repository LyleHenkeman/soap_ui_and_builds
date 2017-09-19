/*
 * An XML document type.
 * Localname: Include
 * Namespace: http://www.w3.org/2004/08/xop/include
 * Java type: org.w3.x2004.x08.xop.include.IncludeDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2004.x08.xop.include.impl;
/**
 * A document containing one Include(@http://www.w3.org/2004/08/xop/include) element.
 *
 * This is a complex type.
 */
public class IncludeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2004.x08.xop.include.IncludeDocument
{
    private static final long serialVersionUID = 1L;
    
    public IncludeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCLUDE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2004/08/xop/include", "Include");
    
    
    /**
     * Gets the "Include" element
     */
    public org.w3.x2004.x08.xop.include.Include getInclude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2004.x08.xop.include.Include target = null;
            target = (org.w3.x2004.x08.xop.include.Include)get_store().find_element_user(INCLUDE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Include" element
     */
    public void setInclude(org.w3.x2004.x08.xop.include.Include include)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2004.x08.xop.include.Include target = null;
            target = (org.w3.x2004.x08.xop.include.Include)get_store().find_element_user(INCLUDE$0, 0);
            if (target == null)
            {
                target = (org.w3.x2004.x08.xop.include.Include)get_store().add_element_user(INCLUDE$0);
            }
            target.set(include);
        }
    }
    
    /**
     * Appends and returns a new empty "Include" element
     */
    public org.w3.x2004.x08.xop.include.Include addNewInclude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2004.x08.xop.include.Include target = null;
            target = (org.w3.x2004.x08.xop.include.Include)get_store().add_element_user(INCLUDE$0);
            return target;
        }
    }
}
