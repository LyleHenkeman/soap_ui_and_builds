/*
 * An XML document type.
 * Localname: addStyleSheet
 * Namespace: http://www.ws-i.org/testing/2003/03/common/
 * Java type: org.wsI.testing.x2003.x03.common.AddStyleSheetDocument
 *
 * Automatically generated - do not modify.
 */
package org.wsI.testing.x2003.x03.common.impl;
/**
 * A document containing one addStyleSheet(@http://www.ws-i.org/testing/2003/03/common/) element.
 *
 * This is a complex type.
 */
public class AddStyleSheetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.wsI.testing.x2003.x03.common.AddStyleSheetDocument
{
    private static final long serialVersionUID = 1L;
    
    public AddStyleSheetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDSTYLESHEET$0 = 
        new javax.xml.namespace.QName("http://www.ws-i.org/testing/2003/03/common/", "addStyleSheet");
    
    
    /**
     * Gets the "addStyleSheet" element
     */
    public org.wsI.testing.x2003.x03.common.AddStyleSheet getAddStyleSheet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.common.AddStyleSheet target = null;
            target = (org.wsI.testing.x2003.x03.common.AddStyleSheet)get_store().find_element_user(ADDSTYLESHEET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "addStyleSheet" element
     */
    public void setAddStyleSheet(org.wsI.testing.x2003.x03.common.AddStyleSheet addStyleSheet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.common.AddStyleSheet target = null;
            target = (org.wsI.testing.x2003.x03.common.AddStyleSheet)get_store().find_element_user(ADDSTYLESHEET$0, 0);
            if (target == null)
            {
                target = (org.wsI.testing.x2003.x03.common.AddStyleSheet)get_store().add_element_user(ADDSTYLESHEET$0);
            }
            target.set(addStyleSheet);
        }
    }
    
    /**
     * Appends and returns a new empty "addStyleSheet" element
     */
    public org.wsI.testing.x2003.x03.common.AddStyleSheet addNewAddStyleSheet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.common.AddStyleSheet target = null;
            target = (org.wsI.testing.x2003.x03.common.AddStyleSheet)get_store().add_element_user(ADDSTYLESHEET$0);
            return target;
        }
    }
}
