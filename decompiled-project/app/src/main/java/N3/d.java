package N3;

import A3.p;
import C3.A;
import J3.C0340d;
import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class d implements p {

    /* renamed from: b, reason: collision with root package name */
    public final p f7183b;

    public d(p pVar) {
        W3.g.c(pVar, "Argument must not be null");
        this.f7183b = pVar;
    }

    @Override // A3.p
    public final A a(Context context, A a9, int i7, int i10) {
        c cVar = (c) a9.get();
        A c0340d = new C0340d(com.bumptech.glide.b.a(context).f14599a, ((g) cVar.f7173a.f7172b).f7196l);
        p pVar = this.f7183b;
        A a10 = pVar.a(context, c0340d, i7, i10);
        if (!c0340d.equals(a10)) {
            c0340d.d();
        }
        ((g) cVar.f7173a.f7172b).c(pVar, (Bitmap) a10.get());
        return a9;
    }

    @Override // A3.h
    public final void b(MessageDigest messageDigest) {
        this.f7183b.b(messageDigest);
    }

    @Override // A3.h
    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f7183b.equals(((d) obj).f7183b);
        }
        return false;
    }

    @Override // A3.h
    public final int hashCode() {
        return this.f7183b.hashCode();
    }
}
