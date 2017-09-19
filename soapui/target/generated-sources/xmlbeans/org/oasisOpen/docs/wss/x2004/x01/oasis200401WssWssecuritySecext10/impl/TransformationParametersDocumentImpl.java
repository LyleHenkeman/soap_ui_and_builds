/*
 * An XML document type.
 * Localname: TransformationParameters
 * Namespace: http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd
 * Java type: org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.TransformationParametersDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.impl;
/**
 * A document containing one TransformationParameters(@http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd) element.
 *
 * This is a complex type.
 */
public class TransformationParametersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.TransformationParametersDocument
{
    private static final long serialVersionUID = 1L;
    
    public TransformationParametersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRANSFORMATIONPARAMETERS$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "TransformationParameters");
    
    
    /**
     * Gets the "TransformationParameters" element
     */
    public org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.TransformationParametersType getTransformationParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.TransformationParametersType target = null;
            target = (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.TransformationParametersType)get_store().find_element_user(TRANSFORMATIONPARAMETERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TransformationParameters" element
     */
    public void setTransformationParameters(org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.TransformationParametersType transformationParameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.TransformationParametersType target = null;
            target = (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.TransformationParametersType)get_store().find_element_user(TRANSFORMATIONPARAMETERS$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.TransformationParametersType)get_store().add_element_user(TRANSFORMATIONPARAMETERS$0);
            }
            target.set(transformationParameters);
        }
    }
    
    /**
     * Appends and returns a new empty "TransformationParameters" element
     */
    public org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.TransformationParametersType addNewTransformationParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.TransformationParametersType target = null;
            target = (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.TransformationParametersType)get_store().add_element_user(TRANSFORMATIONPARAMETERS$0);
            return target;
        }
    }
}
