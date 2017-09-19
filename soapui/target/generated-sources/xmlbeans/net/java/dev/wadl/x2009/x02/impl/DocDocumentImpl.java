/*
 * An XML document type.
 * Localname: doc
 * Namespace: http://wadl.dev.java.net/2009/02
 * Java type: net.java.dev.wadl.x2009.x02.DocDocument
 *
 * Automatically generated - do not modify.
 */
package net.java.dev.wadl.x2009.x02.impl;
/**
 * A document containing one doc(@http://wadl.dev.java.net/2009/02) element.
 *
 * This is a complex type.
 */
public class DocDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.java.dev.wadl.x2009.x02.DocDocument
{
    private static final long serialVersionUID = 1L;
    
    public DocDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOC$0 = 
        new javax.xml.namespace.QName("http://wadl.dev.java.net/2009/02", "doc");
    
    
    /**
     * Gets the "doc" element
     */
    public net.java.dev.wadl.x2009.x02.DocDocument.Doc getDoc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.java.dev.wadl.x2009.x02.DocDocument.Doc target = null;
            target = (net.java.dev.wadl.x2009.x02.DocDocument.Doc)get_store().find_element_user(DOC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "doc" element
     */
    public void setDoc(net.java.dev.wadl.x2009.x02.DocDocument.Doc doc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.java.dev.wadl.x2009.x02.DocDocument.Doc target = null;
            target = (net.java.dev.wadl.x2009.x02.DocDocument.Doc)get_store().find_element_user(DOC$0, 0);
            if (target == null)
            {
                target = (net.java.dev.wadl.x2009.x02.DocDocument.Doc)get_store().add_element_user(DOC$0);
            }
            target.set(doc);
        }
    }
    
    /**
     * Appends and returns a new empty "doc" element
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
     * An XML doc(@http://wadl.dev.java.net/2009/02).
     *
     * This is a complex type.
     */
    public static class DocImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.java.dev.wadl.x2009.x02.DocDocument.Doc
    {
        private static final long serialVersionUID = 1L;
        
        public DocImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TITLE$0 = 
            new javax.xml.namespace.QName("", "title");
        private static final javax.xml.namespace.QName LANG$2 = 
            new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
        
        
        /**
         * Gets the "title" attribute
         */
        public java.lang.String getTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "title" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$0);
                return target;
            }
        }
        
        /**
         * True if has "title" attribute
         */
        public boolean isSetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TITLE$0) != null;
            }
        }
        
        /**
         * Sets the "title" attribute
         */
        public void setTitle(java.lang.String title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TITLE$0);
                }
                target.setStringValue(title);
            }
        }
        
        /**
         * Sets (as xml) the "title" attribute
         */
        public void xsetTitle(org.apache.xmlbeans.XmlString title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TITLE$0);
                }
                target.set(title);
            }
        }
        
        /**
         * Unsets the "title" attribute
         */
        public void unsetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TITLE$0);
            }
        }
        
        /**
         * Gets the "lang" attribute
         */
        public java.lang.String getLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "lang" attribute
         */
        public org.w3.xml.x1998.namespace.LangAttribute.Lang xgetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.xml.x1998.namespace.LangAttribute.Lang target = null;
                target = (org.w3.xml.x1998.namespace.LangAttribute.Lang)get_store().find_attribute_user(LANG$2);
                return target;
            }
        }
        
        /**
         * True if has "lang" attribute
         */
        public boolean isSetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LANG$2) != null;
            }
        }
        
        /**
         * Sets the "lang" attribute
         */
        public void setLang(java.lang.String lang)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$2);
                }
                target.setStringValue(lang);
            }
        }
        
        /**
         * Sets (as xml) the "lang" attribute
         */
        public void xsetLang(org.w3.xml.x1998.namespace.LangAttribute.Lang lang)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.xml.x1998.namespace.LangAttribute.Lang target = null;
                target = (org.w3.xml.x1998.namespace.LangAttribute.Lang)get_store().find_attribute_user(LANG$2);
                if (target == null)
                {
                    target = (org.w3.xml.x1998.namespace.LangAttribute.Lang)get_store().add_attribute_user(LANG$2);
                }
                target.set(lang);
            }
        }
        
        /**
         * Unsets the "lang" attribute
         */
        public void unsetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LANG$2);
            }
        }
    }
}
