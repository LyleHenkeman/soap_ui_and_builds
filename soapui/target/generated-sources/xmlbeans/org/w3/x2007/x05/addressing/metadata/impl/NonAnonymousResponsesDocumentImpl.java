/*
 * An XML document type.
 * Localname: NonAnonymousResponses
 * Namespace: http://www.w3.org/2007/05/addressing/metadata
 * Java type: org.w3.x2007.x05.addressing.metadata.NonAnonymousResponsesDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2007.x05.addressing.metadata.impl;
/**
 * A document containing one NonAnonymousResponses(@http://www.w3.org/2007/05/addressing/metadata) element.
 *
 * This is a complex type.
 */
public class NonAnonymousResponsesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2007.x05.addressing.metadata.NonAnonymousResponsesDocument
{
    private static final long serialVersionUID = 1L;
    
    public NonAnonymousResponsesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NONANONYMOUSRESPONSES$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2007/05/addressing/metadata", "NonAnonymousResponses");
    
    
    /**
     * Gets the "NonAnonymousResponses" element
     */
    public org.w3.x2007.x05.addressing.metadata.NonAnonymousResponsesDocument.NonAnonymousResponses getNonAnonymousResponses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2007.x05.addressing.metadata.NonAnonymousResponsesDocument.NonAnonymousResponses target = null;
            target = (org.w3.x2007.x05.addressing.metadata.NonAnonymousResponsesDocument.NonAnonymousResponses)get_store().find_element_user(NONANONYMOUSRESPONSES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "NonAnonymousResponses" element
     */
    public void setNonAnonymousResponses(org.w3.x2007.x05.addressing.metadata.NonAnonymousResponsesDocument.NonAnonymousResponses nonAnonymousResponses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2007.x05.addressing.metadata.NonAnonymousResponsesDocument.NonAnonymousResponses target = null;
            target = (org.w3.x2007.x05.addressing.metadata.NonAnonymousResponsesDocument.NonAnonymousResponses)get_store().find_element_user(NONANONYMOUSRESPONSES$0, 0);
            if (target == null)
            {
                target = (org.w3.x2007.x05.addressing.metadata.NonAnonymousResponsesDocument.NonAnonymousResponses)get_store().add_element_user(NONANONYMOUSRESPONSES$0);
            }
            target.set(nonAnonymousResponses);
        }
    }
    
    /**
     * Appends and returns a new empty "NonAnonymousResponses" element
     */
    public org.w3.x2007.x05.addressing.metadata.NonAnonymousResponsesDocument.NonAnonymousResponses addNewNonAnonymousResponses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2007.x05.addressing.metadata.NonAnonymousResponsesDocument.NonAnonymousResponses target = null;
            target = (org.w3.x2007.x05.addressing.metadata.NonAnonymousResponsesDocument.NonAnonymousResponses)get_store().add_element_user(NONANONYMOUSRESPONSES$0);
            return target;
        }
    }
    /**
     * An XML NonAnonymousResponses(@http://www.w3.org/2007/05/addressing/metadata).
     *
     * This is a complex type.
     */
    public static class NonAnonymousResponsesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2007.x05.addressing.metadata.NonAnonymousResponsesDocument.NonAnonymousResponses
    {
        private static final long serialVersionUID = 1L;
        
        public NonAnonymousResponsesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
