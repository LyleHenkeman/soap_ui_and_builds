/*
 * An XML document type.
 * Localname: AnonymousResponses
 * Namespace: http://www.w3.org/2007/05/addressing/metadata
 * Java type: org.w3.x2007.x05.addressing.metadata.AnonymousResponsesDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2007.x05.addressing.metadata.impl;
/**
 * A document containing one AnonymousResponses(@http://www.w3.org/2007/05/addressing/metadata) element.
 *
 * This is a complex type.
 */
public class AnonymousResponsesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2007.x05.addressing.metadata.AnonymousResponsesDocument
{
    private static final long serialVersionUID = 1L;
    
    public AnonymousResponsesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANONYMOUSRESPONSES$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2007/05/addressing/metadata", "AnonymousResponses");
    
    
    /**
     * Gets the "AnonymousResponses" element
     */
    public org.w3.x2007.x05.addressing.metadata.AnonymousResponsesDocument.AnonymousResponses getAnonymousResponses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2007.x05.addressing.metadata.AnonymousResponsesDocument.AnonymousResponses target = null;
            target = (org.w3.x2007.x05.addressing.metadata.AnonymousResponsesDocument.AnonymousResponses)get_store().find_element_user(ANONYMOUSRESPONSES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AnonymousResponses" element
     */
    public void setAnonymousResponses(org.w3.x2007.x05.addressing.metadata.AnonymousResponsesDocument.AnonymousResponses anonymousResponses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2007.x05.addressing.metadata.AnonymousResponsesDocument.AnonymousResponses target = null;
            target = (org.w3.x2007.x05.addressing.metadata.AnonymousResponsesDocument.AnonymousResponses)get_store().find_element_user(ANONYMOUSRESPONSES$0, 0);
            if (target == null)
            {
                target = (org.w3.x2007.x05.addressing.metadata.AnonymousResponsesDocument.AnonymousResponses)get_store().add_element_user(ANONYMOUSRESPONSES$0);
            }
            target.set(anonymousResponses);
        }
    }
    
    /**
     * Appends and returns a new empty "AnonymousResponses" element
     */
    public org.w3.x2007.x05.addressing.metadata.AnonymousResponsesDocument.AnonymousResponses addNewAnonymousResponses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2007.x05.addressing.metadata.AnonymousResponsesDocument.AnonymousResponses target = null;
            target = (org.w3.x2007.x05.addressing.metadata.AnonymousResponsesDocument.AnonymousResponses)get_store().add_element_user(ANONYMOUSRESPONSES$0);
            return target;
        }
    }
    /**
     * An XML AnonymousResponses(@http://www.w3.org/2007/05/addressing/metadata).
     *
     * This is a complex type.
     */
    public static class AnonymousResponsesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2007.x05.addressing.metadata.AnonymousResponsesDocument.AnonymousResponses
    {
        private static final long serialVersionUID = 1L;
        
        public AnonymousResponsesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
