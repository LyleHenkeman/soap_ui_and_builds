/*
 * An XML document type.
 * Localname: option
 * Namespace: http://wadl.dev.java.net/2009/02
 * Java type: net.java.dev.wadl.x2009.x02.OptionDocument
 *
 * Automatically generated - do not modify.
 */
package net.java.dev.wadl.x2009.x02.impl;
/**
 * A document containing one option(@http://wadl.dev.java.net/2009/02) element.
 *
 * This is a complex type.
 */
public class OptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.java.dev.wadl.x2009.x02.OptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public OptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPTION$0 = 
        new javax.xml.namespace.QName("http://wadl.dev.java.net/2009/02", "option");
    
    
    /**
     * Gets the "option" element
     */
    public net.java.dev.wadl.x2009.x02.OptionDocument.Option getOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.java.dev.wadl.x2009.x02.OptionDocument.Option target = null;
            target = (net.java.dev.wadl.x2009.x02.OptionDocument.Option)get_store().find_element_user(OPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "option" element
     */
    public void setOption(net.java.dev.wadl.x2009.x02.OptionDocument.Option option)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.java.dev.wadl.x2009.x02.OptionDocument.Option target = null;
            target = (net.java.dev.wadl.x2009.x02.OptionDocument.Option)get_store().find_element_user(OPTION$0, 0);
            if (target == null)
            {
                target = (net.java.dev.wadl.x2009.x02.OptionDocument.Option)get_store().add_element_user(OPTION$0);
            }
            target.set(option);
        }
    }
    
    /**
     * Appends and returns a new empty "option" element
     */
    public net.java.dev.wadl.x2009.x02.OptionDocument.Option addNewOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.java.dev.wadl.x2009.x02.OptionDocument.Option target = null;
            target = (net.java.dev.wadl.x2009.x02.OptionDocument.Option)get_store().add_element_user(OPTION$0);
            return target;
        }
    }
    /**
     * An XML option(@http://wadl.dev.java.net/2009/02).
     *
     * This is a complex type.
     */
    public static class OptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.java.dev.wadl.x2009.x02.OptionDocument.Option
    {
        private static final long serialVersionUID = 1L;
        
        public OptionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DOC$0 = 
            new javax.xml.namespace.QName("http://wadl.dev.java.net/2009/02", "doc");
        private static final javax.xml.namespace.QName VALUE$2 = 
            new javax.xml.namespace.QName("", "value");
        private static final javax.xml.namespace.QName MEDIATYPE$4 = 
            new javax.xml.namespace.QName("", "mediaType");
        
        
        /**
         * Gets a List of "doc" elements
         */
        public java.util.List<net.java.dev.wadl.x2009.x02.DocDocument.Doc> getDocList()
        {
            final class DocList extends java.util.AbstractList<net.java.dev.wadl.x2009.x02.DocDocument.Doc>
            {
                public net.java.dev.wadl.x2009.x02.DocDocument.Doc get(int i)
                    { return OptionImpl.this.getDocArray(i); }
                
                public net.java.dev.wadl.x2009.x02.DocDocument.Doc set(int i, net.java.dev.wadl.x2009.x02.DocDocument.Doc o)
                {
                    net.java.dev.wadl.x2009.x02.DocDocument.Doc old = OptionImpl.this.getDocArray(i);
                    OptionImpl.this.setDocArray(i, o);
                    return old;
                }
                
                public void add(int i, net.java.dev.wadl.x2009.x02.DocDocument.Doc o)
                    { OptionImpl.this.insertNewDoc(i).set(o); }
                
                public net.java.dev.wadl.x2009.x02.DocDocument.Doc remove(int i)
                {
                    net.java.dev.wadl.x2009.x02.DocDocument.Doc old = OptionImpl.this.getDocArray(i);
                    OptionImpl.this.removeDoc(i);
                    return old;
                }
                
                public int size()
                    { return OptionImpl.this.sizeOfDocArray(); }
                
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
         * Gets the "value" attribute
         */
        public java.lang.String getValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "value" attribute
         */
        public org.apache.xmlbeans.XmlString xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$2);
                return target;
            }
        }
        
        /**
         * Sets the "value" attribute
         */
        public void setValue(java.lang.String value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$2);
                }
                target.setStringValue(value);
            }
        }
        
        /**
         * Sets (as xml) the "value" attribute
         */
        public void xsetValue(org.apache.xmlbeans.XmlString value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VALUE$2);
                }
                target.set(value);
            }
        }
        
        /**
         * Gets the "mediaType" attribute
         */
        public java.lang.String getMediaType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEDIATYPE$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "mediaType" attribute
         */
        public org.apache.xmlbeans.XmlString xgetMediaType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MEDIATYPE$4);
                return target;
            }
        }
        
        /**
         * True if has "mediaType" attribute
         */
        public boolean isSetMediaType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MEDIATYPE$4) != null;
            }
        }
        
        /**
         * Sets the "mediaType" attribute
         */
        public void setMediaType(java.lang.String mediaType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEDIATYPE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MEDIATYPE$4);
                }
                target.setStringValue(mediaType);
            }
        }
        
        /**
         * Sets (as xml) the "mediaType" attribute
         */
        public void xsetMediaType(org.apache.xmlbeans.XmlString mediaType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MEDIATYPE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MEDIATYPE$4);
                }
                target.set(mediaType);
            }
        }
        
        /**
         * Unsets the "mediaType" attribute
         */
        public void unsetMediaType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MEDIATYPE$4);
            }
        }
    }
}
