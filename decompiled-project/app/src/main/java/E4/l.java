package E4;

import A9.L2;
import android.media.MediaCodecInfo;
import java.util.List;
import n5.D;

/* loaded from: classes.dex */
public abstract class l {
    public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i7, int i10, double d10) {
        List supportedPerformancePoints;
        boolean covers;
        supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            String str = D.f21142b;
            if (!str.equals("sabrina") && !str.equals("boreal")) {
                String str2 = D.f21144d;
                if (!str2.startsWith("Lenovo TB-X605") && !str2.startsWith("Lenovo TB-X606") && !str2.startsWith("Lenovo TB-X616")) {
                    L2.j();
                    MediaCodecInfo.VideoCapabilities.PerformancePoint f4 = L2.f(i7, i10, (int) d10);
                    for (int i11 = 0; i11 < supportedPerformancePoints.size(); i11++) {
                        covers = L2.g(supportedPerformancePoints.get(i11)).covers(f4);
                        if (covers) {
                            return 2;
                        }
                    }
                    return 1;
                }
            }
        }
        return 0;
    }
}
