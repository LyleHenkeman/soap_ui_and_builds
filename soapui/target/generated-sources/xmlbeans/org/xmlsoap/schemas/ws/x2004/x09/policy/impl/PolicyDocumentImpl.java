/*
 * An XML document type.
 * Localname: Policy
 * Namespace: http://schemas.xmlsoap.org/ws/2004/09/policy
 * Java type: org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.ws.x2004.x09.policy.impl;
/**
 * A document containing one Policy(@http://schemas.xmlsoap.org/ws/2004/09/policy) element.
 *
 * This is a complex type.
 */
public class PolicyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyDocument
{
    private static final long serialVersionUID = 1L;
    
    public PolicyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POLICY$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2004/09/policy", "Policy");
    
    
    /**
     * Gets the "Policy" element
     */
    public org.xmlsoap.schemas.ws.x2004.x09.policy.Policy getPolicy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.ws.x2004.x09.policy.Policy target = null;
            target = (org.xmlsoap.schemas.ws.x2004.x09.policy.Policy)get_store().find_element_user(POLICY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Policy" element
     */
    public void setPolicy(org.xmlsoap.schemas.ws.x2004.x09.policy.Policy policy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.ws.x2004.x09.policy.Policy target = null;
            target = (org.xmlsoap.schemas.ws.x2004.x09.policy.Policy)get_store().find_element_user(POLICY$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.ws.x2004.x09.policy.Policy)get_store().add_element_user(POLICY$0);
            }
            target.set(policy);
        }
    }
    
    /**
     * Appends and returns a new empty "Policy" element
     */
    public org.xmlsoap.schemas.ws.x2004.x09.policy.Policy addNewPolicy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.ws.x2004.x09.policy.Policy target = null;
            target = (org.xmlsoap.schemas.ws.x2004.x09.policy.Policy)get_store().add_element_user(POLICY$0);
            return target;
        }
    }
}
