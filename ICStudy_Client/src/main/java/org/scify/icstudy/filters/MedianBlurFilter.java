/* 
 * Copyright 2014 SciFY.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.scify.icstudy.filters;

import static org.bytedeco.javacpp.opencv_core.IPL_DEPTH_8U;
import org.bytedeco.javacpp.opencv_core.IplImage;
import static org.bytedeco.javacpp.opencv_core.cvCreateImage;
import static org.bytedeco.javacpp.opencv_core.cvGetSize;
import static org.bytedeco.javacpp.opencv_imgproc.COLOR_GRAY2RGB;
import static org.bytedeco.javacpp.opencv_imgproc.COLOR_RGB2GRAY;
import static org.bytedeco.javacpp.opencv_imgproc.CV_MEDIAN;
import static org.bytedeco.javacpp.opencv_imgproc.cvCvtColor;
import static org.bytedeco.javacpp.opencv_imgproc.cvSmooth;

/**
 *
 * @author peustr
 */
public class MedianBlurFilter extends DefaultICSeeFilter {

    // For a nxn window, must be an odd number
    public static int SQUARE = 3;

    @Override
    public IplImage filter(IplImage sourceImage) {

        IplImage procImg = cvCreateImage(cvGetSize(sourceImage), IPL_DEPTH_8U, 1);

        cvCvtColor(sourceImage, procImg, COLOR_RGB2GRAY);

        cvSmooth(procImg, procImg, CV_MEDIAN, SQUARE, 0, 0, 0);

        cvCvtColor(procImg, sourceImage, COLOR_GRAY2RGB);

        return sourceImage;
    }

}
