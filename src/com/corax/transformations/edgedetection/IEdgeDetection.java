package com.corax.transformations.edgedetection;

import java.awt.image.WritableRaster;

public interface IEdgeDetection {
	WritableRaster detectEdges(WritableRaster source, int pixelMatrix);
}
