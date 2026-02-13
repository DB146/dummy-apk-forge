package B0;

import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class L0 {

    /* renamed from: a, reason: collision with root package name */
    public static final L0 f1748a = new Object();

    public final boolean a(MotionEvent motionEvent, int i7) {
        float rawX;
        float rawY;
        rawX = motionEvent.getRawX(i7);
        if ((Float.floatToRawIntBits(rawX) & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) < 2139095040) {
            rawY = motionEvent.getRawY(i7);
            if ((Float.floatToRawIntBits(rawY) & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) < 2139095040) {
                return true;
            }
        }
        return false;
    }
}
