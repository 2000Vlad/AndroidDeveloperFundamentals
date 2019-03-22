package cristian.babarusi.module8.challenge1;

import com.google.gson.annotations.SerializedName;

public class Titles {

    @SerializedName("title")
    private String mTitle;

    public String getTitle() {
        return mTitle;
    }
}


public  class MovieTitles {
 @SerializedName("results")   //JSON Attribute from root
 private List<MovieTitle> mTitles;
    
    public List<MovieTitle> getTitles(){
    return mTitles;
    }
    
    public void setTitles(List<MovieTitle> titles){
     mTitles = titles;
    }
   
}
public class MovieTitle{
  @SerializedName("title") //JSON Attribute from "results"  
 private String mMovieTitle;
    
    ...getter
     ...setter
}
