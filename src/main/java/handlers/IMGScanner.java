package handlers;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.formats.tiff.TiffImageMetadata;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputSet;

import java.io.File;
import java.io.IOException;

public class IMGScanner {
    public static void readIMG() {
        String filepath = "src/main/java/extractorMain/testimg.jpg";
        File imageFile = new File(filepath);

        try {
            ImageMetadata metadata = Imaging.getMetadata(imageFile);

            // Access and use the metadata as needed
            //try to make this into a stream just for fun
            System.out.print(metadata);
            setData(metadata);
            System.out.println(metadata);

        } catch (IOException | ImageReadException e) {
            e.printStackTrace();
        }
    }

    public static void setData(ImageMetadata imgFile) {

    }
}
