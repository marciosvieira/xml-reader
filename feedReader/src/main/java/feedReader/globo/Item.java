package feedReader.globo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "title",
    "description",
    "link",
    "dccreator",
    "guid"
})
public class Item {

    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String link;
    @XmlElement(required = true)
    protected String dccreator;
    protected int guid;
    
    /**
     * Obtém o valor da propriedade title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Define o valor da propriedade title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade link.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLink() {
        return link;
    }

    /**
     * Define o valor da propriedade link.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLink(String value) {
        this.link = value;
    }

    /**
     * Obtém o valor da propriedade dccreator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDccreator() {
        return dccreator;
    }

    /**
     * Define o valor da propriedade dccreator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDccreator(String value) {
        this.dccreator = value;
    }

    /**
     * Obtém o valor da propriedade guid.
     * 
     */
    public int getGuid() {
        return guid;
    }

    /**
     * Define o valor da propriedade guid.
     * 
     */
    public void setGuid(int value) {
        this.guid = value;
    }

}
