/*
 * An XML document type.
 * Localname: link
 * Namespace: http://wadl.dev.java.net/2009/02
 * Java type: net.java.dev.wadl.x2009.x02.LinkDocument
 *
 * Automatically generated - do not modify.
 */
package net.java.dev.wadl.x2009.x02.impl;
/**
 * A document containing one link(@http://wadl.dev.java.net/2009/02) element.
 *
 * This is a complex type.
 */
public class LinkDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.java.dev.wadl.x2009.x02.LinkDocument
{
    private static final long serialVersionUID = 1L;
    
    public LinkDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINK$0 = 
        new javax.xml.namespace.QName("http://wadl.dev.java.net/2009/02", "link");
    
    
    /**
     * Gets the "link" element
     */
    public net.java.dev.wadl.x2009.x02.LinkDocument.Link getLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.java.dev.wadl.x2009.x02.LinkDocument.Link target = null;
            target = (net.java.dev.wadl.x2009.x02.LinkDocument.Link)get_store().find_element_user(LINK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "link" element
     */
    public void setLink(net.java.dev.wadl.x2009.x02.LinkDocument.Link link)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.java.dev.wadl.x2009.x02.LinkDocument.Link target = null;
            target = (net.java.dev.wadl.x2009.x02.LinkDocument.Link)get_store().find_element_user(LINK$0, 0);
            if (target == null)
            {
                target = (net.java.dev.wadl.x2009.x02.LinkDocument.Link)get_store().add_element_user(LINK$0);
            }
            target.set(link);
        }
    }
    
    /**
     * Appends and returns a new empty "link" element
     */
    public net.java.dev.wadl.x2009.x02.LinkDocument.Link addNewLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.java.dev.wadl.x2009.x02.LinkDocument.Link target = null;
            target = (net.java.dev.wadl.x2009.x02.LinkDocument.Link)get_store().add_element_user(LINK$0);
            return target;
        }
    }
    /**
     * An XML link(@http://wadl.dev.java.net/2009/02).
     *
     * This is a complex type.
     */
    public static class LinkImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.java.dev.wadl.x2009.x02.LinkDocument.Link
    {
        private static final long serialVersionUID = 1L;
        
        public LinkImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DOC$0 = 
            new javax.xml.namespace.QName("http://wadl.dev.java.net/2009/02", "doc");
        private static final javax.xml.namespace.QName RESOURCETYPE$2 = 
            new javax.xml.namespace.QName("", "resource_type");
        private static final javax.xml.namespace.QName REL$4 = 
            new javax.xml.namespace.QName("", "rel");
        private static final javax.xml.namespace.QName REV$6 = 
            new javax.xml.namespace.QName("", "rev");
        
        
        /**
         * Gets a List of "doc" elements
         */
        public java.util.List<net.java.dev.wadl.x2009.x02.DocDocument.Doc> getDocList()
        {
            final class DocList extends java.util.AbstractList<net.java.dev.wadl.x2009.x02.DocDocument.Doc>
            {
                public net.java.dev.wadl.x2009.x02.DocDocument.Doc get(int i)
                    { return LinkImpl.this.getDocArray(i); }
                
                public net.java.dev.wadl.x2009.x02.DocDocument.Doc set(int i, net.java.dev.wadl.x2009.x02.DocDocument.Doc o)
                {
                    net.java.dev.wadl.x2009.x02.DocDocument.Doc old = LinkImpl.this.getDocArray(i);
                    LinkImpl.this.setDocArray(i, o);
                    return old;
                }
                
                public void add(int i, net.java.dev.wadl.x2009.x02.DocDocument.Doc o)
                    { LinkImpl.this.insertNewDoc(i).set(o); }
                
                public net.java.dev.wadl.x2009.x02.DocDocument.Doc remove(int i)
                {
                    net.java.dev.wadl.x2009.x02.DocDocument.Doc old = LinkImpl.this.getDocArray(i);
                    LinkImpl.this.removeDoc(i);
                    return old;
                }
                
                public int size()
                    { return LinkImpl.this.sizeOfDocArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new DocList();
            }
        }
        
        /**
         * Gets array of all "doc" elements
         * @deprecated
         */
        public net.java.dev.wadl.x2009.x02.DocDocument.Doc[] getDocArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<net.java.dev.wadl.x2009.x02.DocDocument.Doc> targetList = new java.util.ArrayList<net.java.dev.wadl.x2009.x02.DocDocument.Doc>();
                get_store().find_all_element_users(DOC$0, targetList);
                net.java.dev.wadl.x2009.x02.DocDocument.Doc[] result = new net.java.dev.wadl.x2009.x02.DocDocument.Doc[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "doc" element
         */
        public net.java.dev.wadl.x2009.x02.DocDocument.Doc getDocArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.DocDocument.Doc target = null;
                target = (net.java.dev.wadl.x2009.x02.DocDocument.Doc)get_store().find_element_user(DOC$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "doc" element
         */
        public int sizeOfDocArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DOC$0);
            }
        }
        
        /**
         * Sets array of all "doc" element
         */
        public void setDocArray(net.java.dev.wadl.x2009.x02.DocDocument.Doc[] docArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(docArray, DOC$0);
            }
        }
        
        /**
         * Sets ith "doc" element
         */
        public void setDocArray(int i, net.java.dev.wadl.x2009.x02.DocDocument.Doc doc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.DocDocument.Doc target = null;
                target = (net.java.dev.wadl.x2009.x02.DocDocument.Doc)get_store().find_element_user(DOC$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(doc);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "doc" element
         */
        public net.java.dev.wadl.x2009.x02.DocDocument.Doc insertNewDoc(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.DocDocument.Doc target = null;
                target = (net.java.dev.wadl.x2009.x02.DocDocument.Doc)get_store().insert_element_user(DOC$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "doc" element
         */
        public net.java.dev.wadl.x2009.x02.DocDocument.Doc addNewDoc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.DocDocument.Doc target = null;
                target = (net.java.dev.wadl.x2009.x02.DocDocument.Doc)get_store().add_element_user(DOC$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "doc" element
         */
        public void removeDoc(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DOC$0, i);
            }
        }
        
        /**
         * Gets the "resource_type" attribute
         */
        public java.lang.String getResourceType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESOURCETYPE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "resource_type" attribute
         */
        public org.apache.xmlbeans.XmlAnyURI xgetResourceType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(RESOURCETYPE$2);
                return target;
            }
        }
        
        /**
         * True if has "resource_type" attribute
         */
        public boolean isSetResourceType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RESOURCETYPE$2) != null;
            }
        }
        
        /**
         * Sets the "resource_type" attribute
         */
        public void setResourceType(java.lang.String resourceType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESOURCETYPE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESOURCETYPE$2);
                }
                target.setStringValue(resourceType);
            }
        }
        
        /**
         * Sets (as xml) the "resource_type" attribute
         */
        public void xsetResourceType(org.apache.xmlbeans.XmlAnyURI resourceType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(RESOURCETYPE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(RESOURCETYPE$2);
                }
                target.set(resourceType);
            }
        }
        
        /**
         * Unsets the "resource_type" attribute
         */
        public void unsetResourceType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RESOURCETYPE$2);
            }
        }
        
        /**
         * Gets the "rel" attribute
         */
        public java.lang.String getRel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REL$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "rel" attribute
         */
        public org.apache.xmlbeans.XmlToken xgetRel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlToken target = null;
                target = (org.apache.xmlbeans.XmlToken)get_store().find_attribute_user(REL$4);
                return target;
            }
        }
        
        /**
         * True if has "rel" attribute
         */
        public boolean isSetRel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(REL$4) != null;
            }
        }
        
        /**
         * Sets the "rel" attribute
         */
        public void setRel(java.lang.String rel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REL$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REL$4);
                }
                target.setStringValue(rel);
            }
        }
        
        /**
         * Sets (as xml) the "rel" attribute
         */
        public void xsetRel(org.apache.xmlbeans.XmlToken rel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlToken target = null;
                target = (org.apache.xmlbeans.XmlToken)get_store().find_attribute_user(REL$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlToken)get_store().add_attribute_user(REL$4);
                }
                target.set(rel);
            }
        }
        
        /**
         * Unsets the "rel" attribute
         */
        public void unsetRel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(REL$4);
            }
        }
        
        /**
         * Gets the "rev" attribute
         */
        public java.lang.String getRev()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REV$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "rev" attribute
         */
        public org.apache.xmlbeans.XmlToken xgetRev()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlToken target = null;
                target = (org.apache.xmlbeans.XmlToken)get_store().find_attribute_user(REV$6);
                return target;
            }
        }
        
        /**
         * True if has "rev" attribute
         */
        public boolean isSetRev()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(REV$6) != null;
            }
        }
        
        /**
         * Sets the "rev" attribute
         */
        public void setRev(java.lang.String rev)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REV$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REV$6);
                }
                target.setStringValue(rev);
            }
        }
        
        /**
         * Sets (as xml) the "rev" attribute
         */
        public void xsetRev(org.apache.xmlbeans.XmlToken rev)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlToken target = null;
                target = (org.apache.xmlbeans.XmlToken)get_store().find_attribute_user(REV$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlToken)get_store().add_attribute_user(REV$6);
                }
                target.set(rev);
            }
        }
        
        /**
         * Unsets the "rev" attribute
         */
        public void unsetRev()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(REV$6);
            }
        }
    }
}
