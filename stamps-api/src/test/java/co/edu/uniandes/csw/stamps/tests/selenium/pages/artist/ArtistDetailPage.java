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
package co.edu.uniandes.csw.stamps.tests.selenium.pages.artist;

import co.edu.uniandes.csw.stamps.dtos.minimum.ArtistDTO;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ArtistDetailPage {

    @FindBy(id = "delete-artist")
    private WebElement deleteBtn;

    @FindBy(id = "edit-artist")
    private WebElement editBtn;

    @FindBy(id = "list-artist")
    private WebElement listBtn;

    
    @FindBy(id = "name")
    private WebElement name;
    
    @FindBy(id = "address")
    private WebElement address;
    
    @FindBy(id = "qualification")
    private WebElement qualification;
    
    @FindBy(id = "popularity")
    private WebElement popularity;
    
    @FindBy(id = "telephone")
    private WebElement telephone;

    @FindBy(id = "artisticCareer")
    private WebElement artisticCareer;

    public void list() {
        listBtn.click();
    }

    public void edit() {
        editBtn.click();
    }

    public void delete() {
        deleteBtn.click();
    }

    public ArtistDTO getData() {
        ArtistDTO artist = new ArtistDTO();        
        artist.setName(name.getText());
        artist.setAddress(address.getText());
        artist.setQualification(Byte.parseByte(qualification.getText()));
        artist.setPopularity(Long.parseLong(popularity.getText()));
        artist.setTelephone(Long.parseLong(telephone.getText()));
        artist.setArtisticCareer(artisticCareer.getText());
        return artist;
    }
}
