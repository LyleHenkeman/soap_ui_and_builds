/*
 * XML Type:  ArrayOfRedirect
 * Namespace: http://www.ws-i.org/testing/2003/03/monitorConfig/
 * Java type: org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect
 *
 * Automatically generated - do not modify.
 */
package org.wsI.testing.x2003.x03.monitorConfig.impl;
/**
 * An XML ArrayOfRedirect(@http://www.ws-i.org/testing/2003/03/monitorConfig/).
 *
 * This is a complex type.
 */
public class ArrayOfRedirectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfRedirectImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMMENT$0 = 
        new javax.xml.namespace.QName("http://www.ws-i.org/testing/2003/03/monitorConfig/", "comment");
    private static final javax.xml.namespace.QName REDIRECT$2 = 
        new javax.xml.namespace.QName("http://www.ws-i.org/testing/2003/03/monitorConfig/", "redirect");
    
    
    /**
     * Gets the "comment" element
     */
    public java.lang.String getComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "comment" element
     */
    public org.wsI.testing.x2003.x03.monitorConfig.Comment xgetComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.monitorConfig.Comment target = null;
            target = (org.wsI.testing.x2003.x03.monitorConfig.Comment)get_store().find_element_user(COMMENT$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "comment" element
     */
    public boolean isSetComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMMENT$0) != 0;
        }
    }
    
    /**
     * Sets the "comment" element
     */
    public void setComment(java.lang.String comment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMMENT$0);
            }
            target.setStringValue(comment);
        }
    }
    
    /**
     * Sets (as xml) the "comment" element
     */
    public void xsetComment(org.wsI.testing.x2003.x03.monitorConfig.Comment comment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.monitorConfig.Comment target = null;
            target = (org.wsI.testing.x2003.x03.monitorConfig.Comment)get_store().find_element_user(COMMENT$0, 0);
            if (target == null)
            {
                target = (org.wsI.testing.x2003.x03.monitorConfig.Comment)get_store().add_element_user(COMMENT$0);
            }
            target.set(comment);
        }
    }
    
    /**
     * Unsets the "comment" element
     */
    public void unsetComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMMENT$0, 0);
        }
    }
    
    /**
     * Gets a List of "redirect" elements
     */
    public java.util.List<org.wsI.testing.x2003.x03.monitorConfig.Redirect> getRedirectList()
    {
        final class RedirectList extends java.util.AbstractList<org.wsI.testing.x2003.x03.monitorConfig.Redirect>
        {
            public org.wsI.testing.x2003.x03.monitorConfig.Redirect get(int i)
                { return ArrayOfRedirectImpl.this.getRedirectArray(i); }
            
            public org.wsI.testing.x2003.x03.monitorConfig.Redirect set(int i, org.wsI.testing.x2003.x03.monitorConfig.Redirect o)
            {
                org.wsI.testing.x2003.x03.monitorConfig.Redirect old = ArrayOfRedirectImpl.this.getRedirectArray(i);
                ArrayOfRedirectImpl.this.setRedirectArray(i, o);
                return old;
            }
            
            public void add(int i, org.wsI.testing.x2003.x03.monitorConfig.Redirect o)
                { ArrayOfRedirectImpl.this.insertNewRedirect(i).set(o); }
            
            public org.wsI.testing.x2003.x03.monitorConfig.Redirect remove(int i)
            {
                org.wsI.testing.x2003.x03.monitorConfig.Redirect old = ArrayOfRedirectImpl.this.getRedirectArray(i);
                ArrayOfRedirectImpl.this.removeRedirect(i);
                return old;
            }
            
            public int size()
                { return ArrayOfRedirectImpl.this.sizeOfRedirectArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RedirectList();
        }
    }
    
    /**
     * Gets array of all "redirect" elements
     * @deprecated
     */
    public org.wsI.testing.x2003.x03.monitorConfig.Redirect[] getRedirectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.wsI.testing.x2003.x03.monitorConfig.Redirect> targetList = new java.util.ArrayList<org.wsI.testing.x2003.x03.monitorConfig.Redirect>();
            get_store().find_all_element_users(REDIRECT$2, targetList);
            org.wsI.testing.x2003.x03.monitorConfig.Redirect[] result = new org.wsI.testing.x2003.x03.monitorConfig.Redirect[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "redirect" element
     */
    public org.wsI.testing.x2003.x03.monitorConfig.Redirect getRedirectArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.monitorConfig.Redirect target = null;
            target = (org.wsI.testing.x2003.x03.monitorConfig.Redirect)get_store().find_element_user(REDIRECT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "redirect" element
     */
    public boolean isNilRedirectArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.monitorConfig.Redirect target = null;
            target = (org.wsI.testing.x2003.x03.monitorConfig.Redirect)get_store().find_element_user(REDIRECT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "redirect" element
     */
    public int sizeOfRedirectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REDIRECT$2);
        }
    }
    
    /**
     * Sets array of all "redirect" element
     */
    public void setRedirectArray(org.wsI.testing.x2003.x03.monitorConfig.Redirect[] redirectArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(redirectArray, REDIRECT$2);
        }
    }
    
    /**
     * Sets ith "redirect" element
     */
    public void setRedirectArray(int i, org.wsI.testing.x2003.x03.monitorConfig.Redirect redirect)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.monitorConfig.Redirect target = null;
            target = (org.wsI.testing.x2003.x03.monitorConfig.Redirect)get_store().find_element_user(REDIRECT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(redirect);
        }
    }
    
    /**
     * Nils the ith "redirect" element
     */
    public void setNilRedirectArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.monitorConfig.Redirect target = null;
            target = (org.wsI.testing.x2003.x03.monitorConfig.Redirect)get_store().find_element_user(REDIRECT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "redirect" element
     */
    public org.wsI.testing.x2003.x03.monitorConfig.Redirect insertNewRedirect(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.monitorConfig.Redirect target = null;
            target = (org.wsI.testing.x2003.x03.monitorConfig.Redirect)get_store().insert_element_user(REDIRECT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "redirect" element
     */
    public org.wsI.testing.x2003.x03.monitorConfig.Redirect addNewRedirect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.monitorConfig.Redirect target = null;
            target = (org.wsI.testing.x2003.x03.monitorConfig.Redirect)get_store().add_element_user(REDIRECT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "redirect" element
     */
    public void removeRedirect(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REDIRECT$2, i);
        }
    }
}
