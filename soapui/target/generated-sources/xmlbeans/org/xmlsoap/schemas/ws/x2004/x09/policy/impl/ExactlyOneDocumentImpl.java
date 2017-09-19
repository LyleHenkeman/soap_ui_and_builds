/*
 * An XML document type.
 * Localname: ExactlyOne
 * Namespace: http://schemas.xmlsoap.org/ws/2004/09/policy
 * Java type: org.xmlsoap.schemas.ws.x2004.x09.policy.ExactlyOneDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.ws.x2004.x09.policy.impl;
/**
 * A document containing one ExactlyOne(@http://schemas.xmlsoap.org/ws/2004/09/policy) element.
 *
 * This is a complex type.
 */
public class ExactlyOneDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.ws.x2004.x09.policy.ExactlyOneDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExactlyOneDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXACTLYONE$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2004/09/policy", "ExactlyOne");
    
    
    /**
     * Gets the "ExactlyOne" element
     */
    public org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType getExactlyOne()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType target = null;
            target = (org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType)get_store().find_element_user(EXACTLYONE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ExactlyOne" element
     */
    public void setExactlyOne(org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType exactlyOne)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType target = null;
            target = (org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType)get_store().find_element_user(EXACTLYONE$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType)get_store().add_element_user(EXACTLYONE$0);
            }
            target.set(exactlyOne);
        }
    }
    
    /**
     * Appends and returns a new empty "ExactlyOne" element
     */
    public org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType addNewExactlyOne()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType target = null;
            target = (org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType)get_store().add_element_user(EXACTLYONE$0);
            return target;
        }
    }
}
