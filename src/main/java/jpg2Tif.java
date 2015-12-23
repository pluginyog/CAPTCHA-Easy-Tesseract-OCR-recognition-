/**
 * Created by zjian on 2015/11/20.
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.media.jai.RenderedOp;
import javax.media.jai.JAI;
import com.sun.media.jai.codec.ImageCodec;
import com.sun.media.jai.codec.ImageEncoder;
import com.sun.media.jai.codec.TIFFEncodeParam;

/**
 * @Description
 * @author caorong
 * @date 2013-4-8
 *
 */
public class jpg2Tif {

    public static void main(String[] args) throws Exception {
        jpg2tif("images/222.jpg",
                "images/222.tif");
    }

    /**
     * 将jpg格式转化为tif格式
     *
     * @param srcFile
     *            需要装换的源文件
     * @param descFile
     *            装换后的转存文件
     * @throws Exception
     */
    public static void jpg2tif(String srcFile, String descFile)throws Exception {
        RenderedOp src = JAI.create("fileload", srcFile);
        OutputStream os = new FileOutputStream(descFile);
        TIFFEncodeParam param = new TIFFEncodeParam();
        ImageEncoder encoder = ImageCodec.createImageEncoder("TIFF", os, param);
        encoder.encode(src);
        os.close();
    }
}