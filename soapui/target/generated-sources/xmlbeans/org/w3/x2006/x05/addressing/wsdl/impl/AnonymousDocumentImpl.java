/*
 * An XML document type.
 * Localname: Anonymous
 * Namespace: http://www.w3.org/2006/05/addressing/wsdl
 * Java type: org.w3.x2006.x05.addressing.wsdl.AnonymousDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2006.x05.addressing.wsdl.impl;
/**
 * A document containing one Anonymous(@http://www.w3.org/2006/05/addressing/wsdl) element.
 *
 * This is a complex type.
 */
public class AnonymousDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2006.x05.addressing.wsdl.AnonymousDocument
{
    private static final long serialVersionUID = 1L;
    
    public AnonymousDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANONYMOUS$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2006/05/addressing/wsdl", "Anonymous");
    
    
    /**
     * Gets the "Anonymous" element
     */
    public org.w3.x2006.x05.addressing.wsdl.AnonymousDocument.Anonymous getAnonymous()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2006.x05.addressing.wsdl.AnonymousDocument.Anonymous target = null;
            target = (org.w3.x2006.x05.addressing.wsdl.AnonymousDocument.Anonymous)get_store().find_element_user(ANONYMOUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Anonymous" element
     */
    public void setAnonymous(org.w3.x2006.x05.addressing.wsdl.AnonymousDocument.Anonymous anonymous)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2006.x05.addressing.wsdl.AnonymousDocument.Anonymous target = null;
            target = (org.w3.x2006.x05.addressing.wsdl.AnonymousDocument.Anonymous)get_store().find_element_user(ANONYMOUS$0, 0);
            if (target == null)
            {
                target = (org.w3.x2006.x05.addressing.wsdl.AnonymousDocument.Anonymous)get_store().add_element_user(ANONYMOUS$0);
            }
            target.set(anonymous);
        }
    }
    
    /**
     * Appends and returns a new empty "Anonymous" element
     */
    public org.w3.x2006.x05.addressing.wsdl.AnonymousDocument.Anonymous addNewAnonymous()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2006.x05.addressing.wsdl.AnonymousDocument.Anonymous target = null;
            target = (org.w3.x2006.x05.addressing.wsdl.AnonymousDocument.Anonymous)get_store().add_element_user(ANONYMOUS$0);
            return target;
        }
    }
    /**
     * An XML Anonymous(@http://www.w3.org/2006/05/addressing/wsdl).
     *
     * This is an atomic type that is a restriction of org.w3.x2006.x05.addressing.wsdl.AnonymousDocument$Anonymous.
     */
    public static class AnonymousImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.w3.x2006.x05.addressing.wsdl.AnonymousDocument.Anonymous
    {
        private static final long serialVersionUID = 1L;
        
        public AnonymousImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected AnonymousImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        
    }
}
