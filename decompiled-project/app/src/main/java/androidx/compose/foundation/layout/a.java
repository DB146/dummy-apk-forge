package androidx.compose.foundation.layout;

import c0.m;

/* loaded from: classes.dex */
public abstract class a {
    public static m a(m mVar, float f4) {
        return mVar.c(new AspectRatioElement(f4));
    }

    public static final boolean b(int i7, int i10, long j) {
        int j10 = V0.a.j(j);
        if (i7 <= V0.a.h(j) && j10 <= i7) {
            int i11 = V0.a.i(j);
            if (i10 <= V0.a.g(j) && i11 <= i10) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [c0.m, androidx.compose.foundation.layout.PaddingElement, java.lang.Object] */
    public static m c(int i7, float f4, float f10) {
        if ((i7 & 1) != 0) {
            f4 = 0;
        }
        if ((i7 & 2) != 0) {
            f10 = 0;
        }
        float f11 = 0;
        float f12 = 0;
        ?? obj = new Object();
        obj.f13145a = f4;
        obj.f13146b = f10;
        obj.f13147c = f11;
        obj.f13148d = f12;
        obj.f13149e = true;
        if (!((f11 >= 0.0f || Float.isNaN(f11)) & (f4 >= 0.0f || Float.isNaN(f4)) & (f10 >= 0.0f || Float.isNaN(f10)) & (f12 >= 0.0f || Float.isNaN(f12)))) {
            D.a.a("Padding must be non-negative");
        }
        return obj;
    }
}
