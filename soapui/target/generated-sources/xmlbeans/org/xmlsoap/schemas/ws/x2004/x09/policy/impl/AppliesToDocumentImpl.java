/*
 * An XML document type.
 * Localname: AppliesTo
 * Namespace: http://schemas.xmlsoap.org/ws/2004/09/policy
 * Java type: org.xmlsoap.schemas.ws.x2004.x09.policy.AppliesToDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.ws.x2004.x09.policy.impl;
/**
 * A document containing one AppliesTo(@http://schemas.xmlsoap.org/ws/2004/09/policy) element.
 *
 * This is a complex type.
 */
public class AppliesToDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.ws.x2004.x09.policy.AppliesToDocument
{
    private static final long serialVersionUID = 1L;
    
    public AppliesToDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APPLIESTO$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2004/09/policy", "AppliesTo");
    
    
    /**
     * Gets the "AppliesTo" element
     */
    public org.xmlsoap.schemas.ws.x2004.x09.policy.AppliesToDocument.AppliesTo getAppliesTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.ws.x2004.x09.policy.AppliesToDocument.AppliesTo target = null;
            target = (org.xmlsoap.schemas.ws.x2004.x09.policy.AppliesToDocument.AppliesTo)get_store().find_element_user(APPLIESTO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AppliesTo" element
     */
    public void setAppliesTo(org.xmlsoap.schemas.ws.x2004.x09.policy.AppliesToDocument.AppliesTo appliesTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.ws.x2004.x09.policy.AppliesToDocument.AppliesTo target = null;
            target = (org.xmlsoap.schemas.ws.x2004.x09.policy.AppliesToDocument.AppliesTo)get_store().find_element_user(APPLIESTO$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.ws.x2004.x09.policy.AppliesToDocument.AppliesTo)get_store().add_element_user(APPLIESTO$0);
            }
            target.set(appliesTo);
        }
    }
    
    /**
     * Appends and returns a new empty "AppliesTo" element
     */
    public org.xmlsoap.schemas.ws.x2004.x09.policy.AppliesToDocument.AppliesTo addNewAppliesTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.ws.x2004.x09.policy.AppliesToDocument.AppliesTo target = null;
            target = (org.xmlsoap.schemas.ws.x2004.x09.policy.AppliesToDocument.AppliesTo)get_store().add_element_user(APPLIESTO$0);
            return target;
        }
    }
    /**
     * An XML AppliesTo(@http://schemas.xmlsoap.org/ws/2004/09/policy).
     *
     * This is a complex type.
     */
    public static class AppliesToImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.ws.x2004.x09.policy.AppliesToDocument.AppliesTo
    {
        private static final long serialVersionUID = 1L;
        
        public AppliesToImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
