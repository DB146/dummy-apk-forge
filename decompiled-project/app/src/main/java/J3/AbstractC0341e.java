package J3;

import android.content.Context;
import android.graphics.Bitmap;

/* renamed from: J3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0341e implements A3.p {
    @Override // A3.p
    public final C3.A a(Context context, C3.A a9, int i7, int i10) {
        if (!W3.o.j(i7, i10)) {
            throw new IllegalArgumentException(A3.c.e(i7, i10, "Cannot apply transformation on width: ", " or height: ", " less than or equal to zero and not Target.SIZE_ORIGINAL"));
        }
        D3.a aVar = com.bumptech.glide.b.a(context).f14599a;
        Bitmap bitmap = (Bitmap) a9.get();
        if (i7 == Integer.MIN_VALUE) {
            i7 = bitmap.getWidth();
        }
        if (i10 == Integer.MIN_VALUE) {
            i10 = bitmap.getHeight();
        }
        Bitmap c10 = c(aVar, bitmap, i7, i10);
        return bitmap.equals(c10) ? a9 : C0340d.e(aVar, c10);
    }

    public abstract Bitmap c(D3.a aVar, Bitmap bitmap, int i7, int i10);
}
