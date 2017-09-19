/*
 * An XML document type.
 * Localname: Upgrade
 * Namespace: http://www.w3.org/2003/05/soap-envelope
 * Java type: org.w3.x2003.x05.soapEnvelope.UpgradeDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2003.x05.soapEnvelope.impl;
/**
 * A document containing one Upgrade(@http://www.w3.org/2003/05/soap-envelope) element.
 *
 * This is a complex type.
 */
public class UpgradeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2003.x05.soapEnvelope.UpgradeDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpgradeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPGRADE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2003/05/soap-envelope", "Upgrade");
    
    
    /**
     * Gets the "Upgrade" element
     */
    public org.w3.x2003.x05.soapEnvelope.UpgradeType getUpgrade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2003.x05.soapEnvelope.UpgradeType target = null;
            target = (org.w3.x2003.x05.soapEnvelope.UpgradeType)get_store().find_element_user(UPGRADE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Upgrade" element
     */
    public void setUpgrade(org.w3.x2003.x05.soapEnvelope.UpgradeType upgrade)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2003.x05.soapEnvelope.UpgradeType target = null;
            target = (org.w3.x2003.x05.soapEnvelope.UpgradeType)get_store().find_element_user(UPGRADE$0, 0);
            if (target == null)
            {
                target = (org.w3.x2003.x05.soapEnvelope.UpgradeType)get_store().add_element_user(UPGRADE$0);
            }
            target.set(upgrade);
        }
    }
    
    /**
     * Appends and returns a new empty "Upgrade" element
     */
    public org.w3.x2003.x05.soapEnvelope.UpgradeType addNewUpgrade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2003.x05.soapEnvelope.UpgradeType target = null;
            target = (org.w3.x2003.x05.soapEnvelope.UpgradeType)get_store().add_element_user(UPGRADE$0);
            return target;
        }
    }
}
