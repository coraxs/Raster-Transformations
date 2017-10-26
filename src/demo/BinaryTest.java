package demo;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.corax.transformations.binary.BinaryInvoker;
import com.corax.transformations.callers.ITransformationInvoker;
import com.corax.transformations.grayscale.GrayscaleType;

public class BinaryTest {
	public static void main(String[] args) throws IOException {

		BufferedImage image = SwingUtil.loadImage(TestCommons.IMAGE_FILE);

		BufferedImage image2 = SwingUtil.loadImage(TestCommons.IMAGE_FILE);

		List<Image> images = new ArrayList<>();

		float step = 0.1f;
		for (int i = 1; i < 8; i++) {
			ITransformationInvoker invoker = new BinaryInvoker(i * step);
			WritableRaster r = invoker.transform(image.getRaster());
			images.add(SwingUtil.rasterToImage(r, image.getColorModel()));
		}

		for (int i = 1; i < 8; i++) {
			ITransformationInvoker invoker = new BinaryInvoker(i * step, GrayscaleType.LUMINOSITY, 40, 60, 80, 255, 55, 100);
			WritableRaster r = invoker.transform(image.getRaster());
			images.add(SwingUtil.rasterToImage(r, image.getColorModel()));
		}

		SwingUtil.showImages(image, images);

	}
}