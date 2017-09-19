/*
 * An XML document type.
 * Localname: All
 * Namespace: http://schemas.xmlsoap.org/ws/2004/09/policy
 * Java type: org.xmlsoap.schemas.ws.x2004.x09.policy.AllDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.ws.x2004.x09.policy.impl;
/**
 * A document containing one All(@http://schemas.xmlsoap.org/ws/2004/09/policy) element.
 *
 * This is a complex type.
 */
public class AllDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.ws.x2004.x09.policy.AllDocument
{
    private static final long serialVersionUID = 1L;
    
    public AllDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALL$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2004/09/policy", "All");
    
    
    /**
     * Gets the "All" element
     */
    public org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType getAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType target = null;
            target = (org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType)get_store().find_element_user(ALL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "All" element
     */
    public void setAll(org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType all)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType target = null;
            target = (org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType)get_store().find_element_user(ALL$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType)get_store().add_element_user(ALL$0);
            }
            target.set(all);
        }
    }
    
    /**
     * Appends and returns a new empty "All" element
     */
    public org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType addNewAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType target = null;
            target = (org.xmlsoap.schemas.ws.x2004.x09.policy.OperatorContentType)get_store().add_element_user(ALL$0);
            return target;
        }
    }
}
