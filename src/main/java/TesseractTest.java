import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class TesseractTest {

	public static void main(String[] args) throws Exception {

		// Replace "src/main/resources/image.png" with the path to your image file
		File image = new File("src/main/resources/image.png");
		ITesseract tesseract = new Tesseract();
		// Replace "src/main/resources/tessdata/" with the path to your Tesseract trained data
		tesseract.setDatapath("src/main/resources/tessdata/");
		// The language is set to Turkish for the image being used
		tesseract.setLanguage("tur");

		try {
			String result = tesseract.doOCR(image);
			System.out.println(result);
		} catch (TesseractException e) {
			e.printStackTrace();
		}

	}
}