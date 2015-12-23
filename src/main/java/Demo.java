import cn.easyproject.easyocr.EasyOCR;
import cn.easyproject.easyocr.ImageType;

/**
 * Created by zjian on 2015/11/19.
 */
public class Demo {
    public static void main(String[] args) {

        EasyOCR e = new EasyOCR();
//        e.setTesseractOptions("-l apofont");
        e.setTesseractOptions("-l eng");

//直接识别图片内容
//        System.out.println(e.discern("images/test6.php.png"));
//直接识别验证码图片内容
//        System.out.println(e.discernAndAutoCleanImage("images/22222.png", ImageType.CAPTCHA_INTERFERENCE_LINE));
//验证码图片，经过：普通清理、形变场景自动一体化处理后，识别内容
        System.out.println(e.discernAndAutoCleanImage("images/captcha.jpg", ImageType.CLEAR));
        System.out.println(e.discernAndAutoCleanImage("images/2222.jpg", ImageType.CAPTCHA_WHITE_CHAR));
        System.out.println(e.discernAndAutoCleanImage("images/20151117142240980.jpg", ImageType.CAPTCHA_WHITE_CHAR));
//        System.out.println(e.discernAndAutoCleanImage("images/test6.php.png",ImageType.CAPTCHA_SPOT));
    }
}

