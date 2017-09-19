/*
 * An XML document type.
 * Localname: param
 * Namespace: http://wadl.dev.java.net/2009/02
 * Java type: net.java.dev.wadl.x2009.x02.ParamDocument
 *
 * Automatically generated - do not modify.
 */
package net.java.dev.wadl.x2009.x02.impl;
/**
 * A document containing one param(@http://wadl.dev.java.net/2009/02) element.
 *
 * This is a complex type.
 */
public class ParamDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.java.dev.wadl.x2009.x02.ParamDocument
{
    private static final long serialVersionUID = 1L;
    
    public ParamDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAM$0 = 
        new javax.xml.namespace.QName("http://wadl.dev.java.net/2009/02", "param");
    
    
    /**
     * Gets the "param" element
     */
    public net.java.dev.wadl.x2009.x02.ParamDocument.Param getParam()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.java.dev.wadl.x2009.x02.ParamDocument.Param target = null;
            target = (net.java.dev.wadl.x2009.x02.ParamDocument.Param)get_store().find_element_user(PARAM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "param" element
     */
    public void setParam(net.java.dev.wadl.x2009.x02.ParamDocument.Param param)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.java.dev.wadl.x2009.x02.ParamDocument.Param target = null;
            target = (net.java.dev.wadl.x2009.x02.ParamDocument.Param)get_store().find_element_user(PARAM$0, 0);
            if (target == null)
            {
                target = (net.java.dev.wadl.x2009.x02.ParamDocument.Param)get_store().add_element_user(PARAM$0);
            }
            target.set(param);
        }
    }
    
    /**
     * Appends and returns a new empty "param" element
     */
    public net.java.dev.wadl.x2009.x02.ParamDocument.Param addNewParam()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.java.dev.wadl.x2009.x02.ParamDocument.Param target = null;
            target = (net.java.dev.wadl.x2009.x02.ParamDocument.Param)get_store().add_element_user(PARAM$0);
            return target;
        }
    }
    /**
     * An XML param(@http://wadl.dev.java.net/2009/02).
     *
     * This is a complex type.
     */
    public static class ParamImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.java.dev.wadl.x2009.x02.ParamDocument.Param
    {
        private static final long serialVersionUID = 1L;
        
        public ParamImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DOC$0 = 
            new javax.xml.namespace.QName("http://wadl.dev.java.net/2009/02", "doc");
        private static final javax.xml.namespace.QName OPTION$2 = 
            new javax.xml.namespace.QName("http://wadl.dev.java.net/2009/02", "option");
        private static final javax.xml.namespace.QName LINK$4 = 
            new javax.xml.namespace.QName("http://wadl.dev.java.net/2009/02", "link");
        private static final javax.xml.namespace.QName HREF$6 = 
            new javax.xml.namespace.QName("", "href");
        private static final javax.xml.namespace.QName NAME$8 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName STYLE$10 = 
            new javax.xml.namespace.QName("", "style");
        private static final javax.xml.namespace.QName ID$12 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName TYPE$14 = 
            new javax.xml.namespace.QName("", "type");
        private static final javax.xml.namespace.QName DEFAULT$16 = 
            new javax.xml.namespace.QName("", "default");
        private static final javax.xml.namespace.QName REQUIRED$18 = 
            new javax.xml.namespace.QName("", "required");
        private static final javax.xml.namespace.QName REPEATING$20 = 
            new javax.xml.namespace.QName("", "repeating");
        private static final javax.xml.namespace.QName FIXED$22 = 
            new javax.xml.namespace.QName("", "fixed");
        private static final javax.xml.namespace.QName PATH$24 = 
            new javax.xml.namespace.QName("", "path");
        
        
        /**
         * Gets a List of "doc" elements
         */
        public java.util.List<net.java.dev.wadl.x2009.x02.DocDocument.Doc> getDocList()
        {
            final class DocList extends java.util.AbstractList<net.java.dev.wadl.x2009.x02.DocDocument.Doc>
            {
                public net.java.dev.wadl.x2009.x02.DocDocument.Doc get(int i)
                    { return ParamImpl.this.getDocArray(i); }
                
                public net.java.dev.wadl.x2009.x02.DocDocument.Doc set(int i, net.java.dev.wadl.x2009.x02.DocDocument.Doc o)
                {
                    net.java.dev.wadl.x2009.x02.DocDocument.Doc old = ParamImpl.this.getDocArray(i);
                    ParamImpl.this.setDocArray(i, o);
                    return old;
                }
                
                public void add(int i, net.java.dev.wadl.x2009.x02.DocDocument.Doc o)
                    { ParamImpl.this.insertNewDoc(i).set(o); }
                
                public net.java.dev.wadl.x2009.x02.DocDocument.Doc remove(int i)
                {
                    net.java.dev.wadl.x2009.x02.DocDocument.Doc old = ParamImpl.this.getDocArray(i);
                    ParamImpl.this.removeDoc(i);
                    return old;
                }
                
                public int size()
                    { return ParamImpl.this.sizeOfDocArray(); }
                
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
         * Gets a List of "option" elements
         */
        public java.util.List<net.java.dev.wadl.x2009.x02.OptionDocument.Option> getOptionList()
        {
            final class OptionList extends java.util.AbstractList<net.java.dev.wadl.x2009.x02.OptionDocument.Option>
            {
                public net.java.dev.wadl.x2009.x02.OptionDocument.Option get(int i)
                    { return ParamImpl.this.getOptionArray(i); }
                
                public net.java.dev.wadl.x2009.x02.OptionDocument.Option set(int i, net.java.dev.wadl.x2009.x02.OptionDocument.Option o)
                {
                    net.java.dev.wadl.x2009.x02.OptionDocument.Option old = ParamImpl.this.getOptionArray(i);
                    ParamImpl.this.setOptionArray(i, o);
                    return old;
                }
                
                public void add(int i, net.java.dev.wadl.x2009.x02.OptionDocument.Option o)
                    { ParamImpl.this.insertNewOption(i).set(o); }
                
                public net.java.dev.wadl.x2009.x02.OptionDocument.Option remove(int i)
                {
                    net.java.dev.wadl.x2009.x02.OptionDocument.Option old = ParamImpl.this.getOptionArray(i);
                    ParamImpl.this.removeOption(i);
                    return old;
                }
                
                public int size()
                    { return ParamImpl.this.sizeOfOptionArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new OptionList();
            }
        }
        
        /**
         * Gets array of all "option" elements
         * @deprecated
         */
        public net.java.dev.wadl.x2009.x02.OptionDocument.Option[] getOptionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<net.java.dev.wadl.x2009.x02.OptionDocument.Option> targetList = new java.util.ArrayList<net.java.dev.wadl.x2009.x02.OptionDocument.Option>();
                get_store().find_all_element_users(OPTION$2, targetList);
                net.java.dev.wadl.x2009.x02.OptionDocument.Option[] result = new net.java.dev.wadl.x2009.x02.OptionDocument.Option[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "option" element
         */
        public net.java.dev.wadl.x2009.x02.OptionDocument.Option getOptionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.OptionDocument.Option target = null;
                target = (net.java.dev.wadl.x2009.x02.OptionDocument.Option)get_store().find_element_user(OPTION$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "option" element
         */
        public int sizeOfOptionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OPTION$2);
            }
        }
        
        /**
         * Sets array of all "option" element
         */
        public void setOptionArray(net.java.dev.wadl.x2009.x02.OptionDocument.Option[] optionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(optionArray, OPTION$2);
            }
        }
        
        /**
         * Sets ith "option" element
         */
        public void setOptionArray(int i, net.java.dev.wadl.x2009.x02.OptionDocument.Option option)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.OptionDocument.Option target = null;
                target = (net.java.dev.wadl.x2009.x02.OptionDocument.Option)get_store().find_element_user(OPTION$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(option);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "option" element
         */
        public net.java.dev.wadl.x2009.x02.OptionDocument.Option insertNewOption(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.OptionDocument.Option target = null;
                target = (net.java.dev.wadl.x2009.x02.OptionDocument.Option)get_store().insert_element_user(OPTION$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "option" element
         */
        public net.java.dev.wadl.x2009.x02.OptionDocument.Option addNewOption()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.OptionDocument.Option target = null;
                target = (net.java.dev.wadl.x2009.x02.OptionDocument.Option)get_store().add_element_user(OPTION$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "option" element
         */
        public void removeOption(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OPTION$2, i);
            }
        }
        
        /**
         * Gets the "link" element
         */
        public net.java.dev.wadl.x2009.x02.LinkDocument.Link getLink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.LinkDocument.Link target = null;
                target = (net.java.dev.wadl.x2009.x02.LinkDocument.Link)get_store().find_element_user(LINK$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "link" element
         */
        public boolean isSetLink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LINK$4) != 0;
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
                target = (net.java.dev.wadl.x2009.x02.LinkDocument.Link)get_store().find_element_user(LINK$4, 0);
                if (target == null)
                {
                    target = (net.java.dev.wadl.x2009.x02.LinkDocument.Link)get_store().add_element_user(LINK$4);
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
                target = (net.java.dev.wadl.x2009.x02.LinkDocument.Link)get_store().add_element_user(LINK$4);
                return target;
            }
        }
        
        /**
         * Unsets the "link" element
         */
        public void unsetLink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LINK$4, 0);
            }
        }
        
        /**
         * Gets the "href" attribute
         */
        public java.lang.String getHref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "href" attribute
         */
        public org.apache.xmlbeans.XmlAnyURI xgetHref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(HREF$6);
                return target;
            }
        }
        
        /**
         * True if has "href" attribute
         */
        public boolean isSetHref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HREF$6) != null;
            }
        }
        
        /**
         * Sets the "href" attribute
         */
        public void setHref(java.lang.String href)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HREF$6);
                }
                target.setStringValue(href);
            }
        }
        
        /**
         * Sets (as xml) the "href" attribute
         */
        public void xsetHref(org.apache.xmlbeans.XmlAnyURI href)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(HREF$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(HREF$6);
                }
                target.set(href);
            }
        }
        
        /**
         * Unsets the "href" attribute
         */
        public void unsetHref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HREF$6);
            }
        }
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" attribute
         */
        public org.apache.xmlbeans.XmlNMTOKEN xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(NAME$8);
                return target;
            }
        }
        
        /**
         * True if has "name" attribute
         */
        public boolean isSetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NAME$8) != null;
            }
        }
        
        /**
         * Sets the "name" attribute
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$8);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" attribute
         */
        public void xsetName(org.apache.xmlbeans.XmlNMTOKEN name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(NAME$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(NAME$8);
                }
                target.set(name);
            }
        }
        
        /**
         * Unsets the "name" attribute
         */
        public void unsetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NAME$8);
            }
        }
        
        /**
         * Gets the "style" attribute
         */
        public net.java.dev.wadl.x2009.x02.ParamStyle.Enum getStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLE$10);
                if (target == null)
                {
                    return null;
                }
                return (net.java.dev.wadl.x2009.x02.ParamStyle.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "style" attribute
         */
        public net.java.dev.wadl.x2009.x02.ParamStyle xgetStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.ParamStyle target = null;
                target = (net.java.dev.wadl.x2009.x02.ParamStyle)get_store().find_attribute_user(STYLE$10);
                return target;
            }
        }
        
        /**
         * True if has "style" attribute
         */
        public boolean isSetStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STYLE$10) != null;
            }
        }
        
        /**
         * Sets the "style" attribute
         */
        public void setStyle(net.java.dev.wadl.x2009.x02.ParamStyle.Enum style)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STYLE$10);
                }
                target.setEnumValue(style);
            }
        }
        
        /**
         * Sets (as xml) the "style" attribute
         */
        public void xsetStyle(net.java.dev.wadl.x2009.x02.ParamStyle style)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.ParamStyle target = null;
                target = (net.java.dev.wadl.x2009.x02.ParamStyle)get_store().find_attribute_user(STYLE$10);
                if (target == null)
                {
                    target = (net.java.dev.wadl.x2009.x02.ParamStyle)get_store().add_attribute_user(STYLE$10);
                }
                target.set(style);
            }
        }
        
        /**
         * Unsets the "style" attribute
         */
        public void unsetStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STYLE$10);
            }
        }
        
        /**
         * Gets the "id" attribute
         */
        public java.lang.String getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$12);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "id" attribute
         */
        public org.apache.xmlbeans.XmlID xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlID target = null;
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$12);
                return target;
            }
        }
        
        /**
         * True if has "id" attribute
         */
        public boolean isSetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ID$12) != null;
            }
        }
        
        /**
         * Sets the "id" attribute
         */
        public void setId(java.lang.String id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$12);
                }
                target.setStringValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" attribute
         */
        public void xsetId(org.apache.xmlbeans.XmlID id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlID target = null;
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$12);
                }
                target.set(id);
            }
        }
        
        /**
         * Unsets the "id" attribute
         */
        public void unsetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ID$12);
            }
        }
        
        /**
         * Gets the "type" attribute
         */
        public javax.xml.namespace.QName getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPE$14);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getQNameValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public org.apache.xmlbeans.XmlQName xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlQName target = null;
                target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(TYPE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlQName)get_default_attribute_value(TYPE$14);
                }
                return target;
            }
        }
        
        /**
         * True if has "type" attribute
         */
        public boolean isSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TYPE$14) != null;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        public void setType(javax.xml.namespace.QName type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$14);
                }
                target.setQNameValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" attribute
         */
        public void xsetType(org.apache.xmlbeans.XmlQName type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlQName target = null;
                target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(TYPE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(TYPE$14);
                }
                target.set(type);
            }
        }
        
        /**
         * Unsets the "type" attribute
         */
        public void unsetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TYPE$14);
            }
        }
        
        /**
         * Gets the "default" attribute
         */
        public java.lang.String getDefault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULT$16);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "default" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDefault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULT$16);
                return target;
            }
        }
        
        /**
         * True if has "default" attribute
         */
        public boolean isSetDefault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEFAULT$16) != null;
            }
        }
        
        /**
         * Sets the "default" attribute
         */
        public void setDefault(java.lang.String xdefault)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULT$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULT$16);
                }
                target.setStringValue(xdefault);
            }
        }
        
        /**
         * Sets (as xml) the "default" attribute
         */
        public void xsetDefault(org.apache.xmlbeans.XmlString xdefault)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULT$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULT$16);
                }
                target.set(xdefault);
            }
        }
        
        /**
         * Unsets the "default" attribute
         */
        public void unsetDefault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEFAULT$16);
            }
        }
        
        /**
         * Gets the "required" attribute
         */
        public boolean getRequired()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUIRED$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(REQUIRED$18);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "required" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetRequired()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(REQUIRED$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(REQUIRED$18);
                }
                return target;
            }
        }
        
        /**
         * True if has "required" attribute
         */
        public boolean isSetRequired()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(REQUIRED$18) != null;
            }
        }
        
        /**
         * Sets the "required" attribute
         */
        public void setRequired(boolean required)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUIRED$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REQUIRED$18);
                }
                target.setBooleanValue(required);
            }
        }
        
        /**
         * Sets (as xml) the "required" attribute
         */
        public void xsetRequired(org.apache.xmlbeans.XmlBoolean required)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(REQUIRED$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(REQUIRED$18);
                }
                target.set(required);
            }
        }
        
        /**
         * Unsets the "required" attribute
         */
        public void unsetRequired()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(REQUIRED$18);
            }
        }
        
        /**
         * Gets the "repeating" attribute
         */
        public boolean getRepeating()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATING$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(REPEATING$20);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "repeating" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetRepeating()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(REPEATING$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(REPEATING$20);
                }
                return target;
            }
        }
        
        /**
         * True if has "repeating" attribute
         */
        public boolean isSetRepeating()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(REPEATING$20) != null;
            }
        }
        
        /**
         * Sets the "repeating" attribute
         */
        public void setRepeating(boolean repeating)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATING$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPEATING$20);
                }
                target.setBooleanValue(repeating);
            }
        }
        
        /**
         * Sets (as xml) the "repeating" attribute
         */
        public void xsetRepeating(org.apache.xmlbeans.XmlBoolean repeating)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(REPEATING$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(REPEATING$20);
                }
                target.set(repeating);
            }
        }
        
        /**
         * Unsets the "repeating" attribute
         */
        public void unsetRepeating()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(REPEATING$20);
            }
        }
        
        /**
         * Gets the "fixed" attribute
         */
        public java.lang.String getFixed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIXED$22);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fixed" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFixed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIXED$22);
                return target;
            }
        }
        
        /**
         * True if has "fixed" attribute
         */
        public boolean isSetFixed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FIXED$22) != null;
            }
        }
        
        /**
         * Sets the "fixed" attribute
         */
        public void setFixed(java.lang.String fixed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIXED$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIXED$22);
                }
                target.setStringValue(fixed);
            }
        }
        
        /**
         * Sets (as xml) the "fixed" attribute
         */
        public void xsetFixed(org.apache.xmlbeans.XmlString fixed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIXED$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FIXED$22);
                }
                target.set(fixed);
            }
        }
        
        /**
         * Unsets the "fixed" attribute
         */
        public void unsetFixed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FIXED$22);
            }
        }
        
        /**
         * Gets the "path" attribute
         */
        public java.lang.String getPath()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PATH$24);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "path" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPath()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PATH$24);
                return target;
            }
        }
        
        /**
         * True if has "path" attribute
         */
        public boolean isSetPath()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PATH$24) != null;
            }
        }
        
        /**
         * Sets the "path" attribute
         */
        public void setPath(java.lang.String path)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PATH$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PATH$24);
                }
                target.setStringValue(path);
            }
        }
        
        /**
         * Sets (as xml) the "path" attribute
         */
        public void xsetPath(org.apache.xmlbeans.XmlString path)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PATH$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PATH$24);
                }
                target.set(path);
            }
        }
        
        /**
         * Unsets the "path" attribute
         */
        public void unsetPath()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PATH$24);
            }
        }
    }
}
