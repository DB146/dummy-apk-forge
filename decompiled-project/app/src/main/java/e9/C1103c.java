package e9;

import P8.p;

/* renamed from: e9.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1103c {

    /* renamed from: a, reason: collision with root package name */
    public final int f16816a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f16817b;

    /* renamed from: c, reason: collision with root package name */
    public final p[] f16818c;

    public C1103c(int i7, int i10, int i11, int i12, int[] iArr) {
        this.f16816a = i7;
        this.f16817b = iArr;
        float f4 = i12;
        this.f16818c = new p[]{new p(i10, f4), new p(i11, f4)};
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1103c) && this.f16816a == ((C1103c) obj).f16816a;
    }

    public final int hashCode() {
        return this.f16816a;
    }
}
