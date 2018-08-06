
package urbanAPI;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UrbanResponse {


    @SerializedName("tags")
    @Expose
    public List<String> tags;

    @SerializedName("result_type")
    @Expose
    public String resultType;

    @SerializedName("list")
    @Expose
    private List<UrbanList> list;

    @SerializedName("sounds")
    @Expose
    public List<String> sounds;
	
	public List<UrbanList> getInfo() {
	    return list;
	}
}
