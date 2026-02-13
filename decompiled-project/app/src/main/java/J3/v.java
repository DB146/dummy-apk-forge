package J3;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class v extends AbstractC0341e {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f5498b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(A3.h.f353a);

    @Override // A3.h
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(f5498b);
    }

    @Override // J3.AbstractC0341e
    public final Bitmap c(D3.a aVar, Bitmap bitmap, int i7, int i10) {
        return A.b(aVar, bitmap, i7, i10);
    }

    @Override // A3.h
    public final boolean equals(Object obj) {
        return obj instanceof v;
    }

    @Override // A3.h
    public final int hashCode() {
        return 1572326941;
    }
}
