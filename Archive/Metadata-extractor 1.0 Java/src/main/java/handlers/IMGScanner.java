package handlers;

import com.drew.imaging.ImageMetadataReader;
import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.Tag;
import com.drew.metadata.exif.ExifSubIFDDirectory;
import org.apache.commons.imaging.formats.jpeg.exif.ExifRewriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class IMGScanner {
    public static void readIMG() {
        String filepath = "src/main/java/extractorMain/testimg.jpg";
        File imageFile = new File(filepath);
        Metadata metadata;

        try {
            metadata = ImageMetadataReader.readMetadata(imageFile);
            for(Directory directory : metadata.getDirectories()){
                System.out.println(directory);
                for(Tag tag : directory.getTags()){
                    System.out.println(tag);
                }
            }

//            ExifSubIFDDirectory exifSubIFDDirectory = metadata.getFirstDirectoryOfType(ExifSubIFDDirectory.class);
//            System.out.println(exifSubIFDDirectory.TAG_ARTIST);
//            //need to go back to apache imaging to use the writer because the current one is not found
//            //new ExifWriter()
//            try (OutputStream outputStream = new FileOutputStream("path/to/your/output_image.jpg")) {
//                new ExifRewriter().updateExifMetadataLossless(imageFile,  outputStream, exifSubIFDDirectory );
//            }
//            exifSubIFDDirectory.setString(ExifSubIFDDirectory.TAG_ARTIST, "Apple");
//            System.out.println(exifSubIFDDirectory.TAG_ARTIST);
        } catch (IOException | ImageProcessingException e) {
            e.printStackTrace();
        }

    }

    public static void setData(Metadata imgFile) {

    }
}
