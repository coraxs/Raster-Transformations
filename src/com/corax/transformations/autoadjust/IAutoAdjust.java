package com.corax.transformations.autoadjust;

import java.awt.image.WritableRaster;

public interface IAutoAdjust {
	WritableRaster autoAdjust(WritableRaster source, float percent);
}
