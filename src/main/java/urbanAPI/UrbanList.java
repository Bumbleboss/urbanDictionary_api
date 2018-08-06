
package urbanAPI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UrbanList {

    @SerializedName("definition")
    @Expose
    public String definition;

    @SerializedName("permalink")
    @Expose
    public String permalink;

    @SerializedName("thumbs_up")
    @Expose
    public Integer thumbsUp;

    @SerializedName("author")
    @Expose
    public String author;

    @SerializedName("word")
    @Expose
    public String word;

    @SerializedName("defid")
    @Expose
    public Integer defid;

    @SerializedName("current_vote")
    @Expose
    public String currentVote;

    @SerializedName("example")
    @Expose
    public String example;

    @SerializedName("thumbs_down")
    @Expose
    public Integer thumbsDown;
}
