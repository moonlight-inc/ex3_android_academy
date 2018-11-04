package e.mipro.business_card.DTO;

import com.google.gson.annotations.SerializedName;

public class MultimediaDTO {
    @SerializedName("url")
    private String url;

    @SerializedName("format")
    private String format;

    public String getFormat() {
        return format;
    }

    public String getUrl() {
        return url;
    }
}