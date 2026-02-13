package o4;

import java.util.Arrays;

/* renamed from: o4.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1800n {

    /* renamed from: e, reason: collision with root package name */
    public static final C1800n f21866e = new C1800n(-1, -1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f21867a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21868b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21869c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21870d;

    public C1800n(int i7, int i10, int i11) {
        this.f21867a = i7;
        this.f21868b = i10;
        this.f21869c = i11;
        this.f21870d = n5.D.J(i11) ? n5.D.z(i11, i10) : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1800n)) {
            return false;
        }
        C1800n c1800n = (C1800n) obj;
        return this.f21867a == c1800n.f21867a && this.f21868b == c1800n.f21868b && this.f21869c == c1800n.f21869c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f21867a), Integer.valueOf(this.f21868b), Integer.valueOf(this.f21869c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AudioFormat[sampleRate=");
        sb2.append(this.f21867a);
        sb2.append(", channelCount=");
        sb2.append(this.f21868b);
        sb2.append(", encoding=");
        return X.c.k(sb2, this.f21869c, ']');
    }
}
