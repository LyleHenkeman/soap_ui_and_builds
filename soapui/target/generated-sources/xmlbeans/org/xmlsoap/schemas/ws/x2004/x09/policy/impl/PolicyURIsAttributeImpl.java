/*
 * An XML attribute type.
 * Localname: PolicyURIs
 * Namespace: http://schemas.xmlsoap.org/ws/2004/09/policy
 * Java type: org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyURIsAttribute
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.ws.x2004.x09.policy.impl;
/**
 * A document containing one PolicyURIs(@http://schemas.xmlsoap.org/ws/2004/09/policy) attribute.
 *
 * This is a complex type.
 */
public class PolicyURIsAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyURIsAttribute
{
    private static final long serialVersionUID = 1L;
    
    public PolicyURIsAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POLICYURIS$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2004/09/policy", "PolicyURIs");
    
    
    /**
     * Gets the "PolicyURIs" attribute
     */
    public java.util.List getPolicyURIs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POLICYURIS$0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "PolicyURIs" attribute
     */
    public org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyURIsAttribute.PolicyURIs xgetPolicyURIs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyURIsAttribute.PolicyURIs target = null;
            target = (org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyURIsAttribute.PolicyURIs)get_store().find_attribute_user(POLICYURIS$0);
            return target;
        }
    }
    
    /**
     * True if has "PolicyURIs" attribute
     */
    public boolean isSetPolicyURIs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(POLICYURIS$0) != null;
        }
    }
    
    /**
     * Sets the "PolicyURIs" attribute
     */
    public void setPolicyURIs(java.util.List policyURIs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POLICYURIS$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POLICYURIS$0);
            }
            target.setListValue(policyURIs);
        }
    }
    
    /**
     * Sets (as xml) the "PolicyURIs" attribute
     */
    public void xsetPolicyURIs(org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyURIsAttribute.PolicyURIs policyURIs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyURIsAttribute.PolicyURIs target = null;
            target = (org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyURIsAttribute.PolicyURIs)get_store().find_attribute_user(POLICYURIS$0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyURIsAttribute.PolicyURIs)get_store().add_attribute_user(POLICYURIS$0);
            }
            target.set(policyURIs);
        }
    }
    
    /**
     * Unsets the "PolicyURIs" attribute
     */
    public void unsetPolicyURIs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(POLICYURIS$0);
        }
    }
    /**
     * An XML PolicyURIs(@http://schemas.xmlsoap.org/ws/2004/09/policy).
     *
     * This is a list type whose items are org.apache.xmlbeans.XmlAnyURI.
     */
    public static class PolicyURIsImpl extends org.apache.xmlbeans.impl.values.XmlListImpl implements org.xmlsoap.schemas.ws.x2004.x09.policy.PolicyURIsAttribute.PolicyURIs
    {
        private static final long serialVersionUID = 1L;
        
        public PolicyURIsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected PolicyURIsImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
