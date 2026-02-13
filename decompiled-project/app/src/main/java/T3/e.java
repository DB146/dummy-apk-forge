package T3;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static Integer f9225d;

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f9226a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f9227b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public d f9228c;

    public e(ImageView imageView) {
        this.f9226a = imageView;
    }

    public final int a(int i7, int i10, int i11) {
        int i12 = i10 - i11;
        if (i12 > 0) {
            return i12;
        }
        int i13 = i7 - i11;
        if (i13 > 0) {
            return i13;
        }
        ImageView imageView = this.f9226a;
        if (imageView.isLayoutRequested() || i10 != -2) {
            return 0;
        }
        if (Log.isLoggable("CustomViewTarget", 4)) {
            Log.i("CustomViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
        }
        Context context = imageView.getContext();
        if (f9225d == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            W3.g.c(windowManager, "Argument must not be null");
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            f9225d = Integer.valueOf(Math.max(point.x, point.y));
        }
        return f9225d.intValue();
    }
}
