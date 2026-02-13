package J3;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class t implements A3.p {

    /* renamed from: b, reason: collision with root package name */
    public final A3.p f5496b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5497c;

    public t(A3.p pVar, boolean z8) {
        this.f5496b = pVar;
        this.f5497c = z8;
    }

    @Override // A3.p
    public final C3.A a(Context context, C3.A a9, int i7, int i10) {
        D3.a aVar = com.bumptech.glide.b.a(context).f14599a;
        Drawable drawable = (Drawable) a9.get();
        C0340d a10 = s.a(aVar, drawable, i7, i10);
        if (a10 != null) {
            C3.A a11 = this.f5496b.a(context, a10, i7, i10);
            if (!a11.equals(a10)) {
                return new C0340d(context.getResources(), a11);
            }
            a11.d();
            return a9;
        }
        if (!this.f5497c) {
            return a9;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // A3.h
    public final void b(MessageDigest messageDigest) {
        this.f5496b.b(messageDigest);
    }

    @Override // A3.h
    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return this.f5496b.equals(((t) obj).f5496b);
        }
        return false;
    }

    @Override // A3.h
    public final int hashCode() {
        return this.f5496b.hashCode();
    }
}
