package demo;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.util.ArrayList;
import java.util.List;

import com.corax.graphics.callers.IProcessingInvoker;
import com.corax.graphics.transformations.zoomblur.ZoomBlurInvoker;

public class ZoomBlurTest {
	public static void main(String[] args) {
		
		BufferedImage image = SwingUtil.loadImage(TestCommons.IMAGE_FILE);

		List<Image> images = new ArrayList<>();
		IProcessingInvoker invoker = new ZoomBlurInvoker(0.1f);
		WritableRaster r = invoker.process(image.getRaster());
		images.add(SwingUtil.rasterToImage(r));
		
		SwingUtil.showImages(image, images);
	}
}
	