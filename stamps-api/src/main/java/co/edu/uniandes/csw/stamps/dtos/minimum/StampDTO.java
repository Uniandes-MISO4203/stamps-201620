/*
The MIT License (MIT)

Copyright (c) 2015 Los Andes University

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/
package co.edu.uniandes.csw.stamps.dtos.minimum;

import co.edu.uniandes.csw.stamps.entities.StampEntity;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * @generated
 */
@XmlRootElement
public class StampDTO implements Serializable{

    private Long id;
    private String name;
    private String image;
    private Long price;
    private boolean availableForSale;
    private short qualification;
    private String description;
    private Long popularity;
    private String artistComment;
    private String comments;

    /**
     * @generated
     */
    public StampDTO() {
    }

    /**
     * Crea un objeto StampMinimumDTO a partir de un objeto StampEntity.
     *
     * @param entity Entidad StampEntity desde la cual se va a crear el nuevo objeto.
     * @generated
     */
    public StampDTO(StampEntity entity) {
	if (entity!=null){
            this.id=entity.getId();
            this.name=entity.getName();
            this.image=entity.getImage();
            this.price=entity.getPrice();
            this.availableForSale=entity.isAvailableForSale();
            this.qualification=entity.getQualification();
            this.description=entity.getDescription();
            this.popularity=entity.getPopularity();
            this.artistComment=entity.getArtistComment();
            this.comments=entity.getComments();
        }
    }

    /**
     * Convierte un objeto StampMinimumDTO a StampEntity.
     *
     * @return Nueva objeto StampEntity.
     * @generated
     */
    public StampEntity toEntity() {
        StampEntity entity = new StampEntity();
        entity.setId(this.getId());
        entity.setName(this.getName());
        entity.setImage(this.getImage());
        entity.setPrice(this.getPrice());
        entity.setAvailableForSale(this.isAvailableForSale());
        entity.setQualification(this.getQualification());
        entity.setDescription(this.getDescription());
        entity.setPopularity(this.getPopularity());
        entity.setArtistComment(this.getArtistComment());
        entity.setComments(this.getComments());
        return entity;
    }
    /**
     * Obtiene el atributo id.
     *
     * @return atributo id.
     * @generated
     */
    public Long getId() {
        return id;
    }
    /**
     * Establece el valor del atributo id.
     *
     * @param id nuevo valor del atributo
     * @generated
     */
    public void setId(Long id) {
        this.id = id;
    }
    /**
     * Obtiene el atributo name.
     *
     * @return atributo name.
     * @generated
     */
    public String getName() {
        return name;
    }
    /**
     * Establece el valor del atributo name.
     *
     * @param name nuevo valor del atributo
     * @generated
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Obtiene el atributo image.
     *
     * @return atributo image.
     * @generated
     */
    public String getImage() {
        return image;
    }
    /**
     * Establece el valor del atributo image.
     *
     * @param image nuevo valor del atributo
     * @generated
     */
    public void setImage(String image) {
        this.image = image;
    }
    /**
     * Obtiene el atributo price.
     *
     * @return atributo price.
     * @generated
     */
    public Long getPrice() {
        return price;
    }
    /**
     * Establece el valor del atributo price.
     *
     * @param price nuevo valor del atributo
     * @generated
     */
    public void setPrice(Long price) {
        this.price = price;
    }
    /**
     * Obtiene el atributo AvailableForSale.
     *
     * @return atributo AvailableForSale.
     * @generated
     */   
    public boolean isAvailableForSale() {
        return availableForSale;
    }
    /**
     * Establece el valor del atributo AvailableForSale.
     *
     * @param AvailableForSale nuevo valor del atributo
     * @generated
     */
    public void setAvailableForSale(boolean availableForSale) {
        this.availableForSale = availableForSale;
    }
    /**
     * Obtiene el atributo qualification.
     *
     * @return atributo qualification.
     * @generated
     */
    public short getQualification() {
        return qualification;
    }
    /**
     * Establece el valor del atributo qualification.
     *
     * @param qualification nuevo valor del atributo
     * @generated
     */
    public void setQualification(short qualification) {
        this.qualification = qualification;
    }
    /**
     * Obtiene el atributo description.
     *
     * @return atributo description.
     * @generated
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Establece el valor del atributo description.
     *
     * @param description nuevo valor del atributo
     * @generated
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * Obtiene el atributo artistComment.
     *
     * @return atributo artistComment.
     * @generated
     */    
    public String getArtistComment() {
        return this.artistComment;
    }
    /**
     * Establece el valor del atributo artistComment.
     *
     * @param artistComment nuevo valor del atributo
     * @generated
     */
    public void setArtistComment(String artistComment) {
        this.artistComment = artistComment;
    }
    /**
     * Obtiene el atributo popularity.
     *
     * @return atributo popularity.
     * @generated
     */
    public Long getPopularity() {
        return popularity;
    }
    /**
     * Establece el valor del atributo popularity.
     *
     * @param popularity nuevo valor del atributo
     * @generated
     */
    public void setPopularity(Long popularity) {
        this.popularity = popularity;
    }
    /**
     * Obtiene el atributo comments.
     *
     * @return atributo comments.
     * @generated
     */
    public String getComments() {
        return comments;
    }
      /**
     * Establece el valor del atributo comments.
     *
     * @param comments nuevo valor del atributo
     * @generated
     */
    public void setComments(String comments) {
        this.comments = comments;
    }
}
