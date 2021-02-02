package interface;
/**
*   @author -_R.S.C_-
*/
import model.Image;
public interface ImageDisplay {
    Image current();
    void show(Image image);
}