package p9;

import android.graphics.Rect;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final V8.c f23216a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23217b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23218c;

    /* renamed from: d, reason: collision with root package name */
    public Rect f23219d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f23220e;

    public s(byte[] bArr, int i7, int i10, int i11, int i12) {
        this.f23216a = new V8.c(bArr, i7, i10);
        this.f23218c = i12;
        this.f23217b = i11;
        if (i7 * i10 <= bArr.length) {
            return;
        }
        StringBuilder q10 = h3.o.q(i7, i10, "Image data does not match the resolution. ", "x", " > ");
        q10.append(bArr.length);
        throw new IllegalArgumentException(q10.toString());
    }
}
