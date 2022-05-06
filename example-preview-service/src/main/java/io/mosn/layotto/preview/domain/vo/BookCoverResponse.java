package io.mosn.layotto.preview.domain.vo;

public class BookCoverResponse {
    private String imageUrl;

    public BookCoverResponse(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * Getter method for property <tt>imageUrl</tt>.
     *
     * @return property value of imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Setter method for property <tt>imageUrl</tt>.
     *
     * @param imageUrl value to be assigned to property imageUrl
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
