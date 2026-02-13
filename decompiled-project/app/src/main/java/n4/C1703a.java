package n4;

import P4.B;
import java.util.Arrays;
import m4.L0;

/* renamed from: n4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1703a {

    /* renamed from: a, reason: collision with root package name */
    public final long f21070a;

    /* renamed from: b, reason: collision with root package name */
    public final L0 f21071b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21072c;

    /* renamed from: d, reason: collision with root package name */
    public final B f21073d;

    /* renamed from: e, reason: collision with root package name */
    public final long f21074e;

    /* renamed from: f, reason: collision with root package name */
    public final L0 f21075f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final B f21076h;

    /* renamed from: i, reason: collision with root package name */
    public final long f21077i;
    public final long j;

    public C1703a(long j, L0 l02, int i7, B b2, long j10, L0 l03, int i10, B b10, long j11, long j12) {
        this.f21070a = j;
        this.f21071b = l02;
        this.f21072c = i7;
        this.f21073d = b2;
        this.f21074e = j10;
        this.f21075f = l03;
        this.g = i10;
        this.f21076h = b10;
        this.f21077i = j11;
        this.j = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1703a.class != obj.getClass()) {
            return false;
        }
        C1703a c1703a = (C1703a) obj;
        return this.f21070a == c1703a.f21070a && this.f21072c == c1703a.f21072c && this.f21074e == c1703a.f21074e && this.g == c1703a.g && this.f21077i == c1703a.f21077i && this.j == c1703a.j && O5.b.o(this.f21071b, c1703a.f21071b) && O5.b.o(this.f21073d, c1703a.f21073d) && O5.b.o(this.f21075f, c1703a.f21075f) && O5.b.o(this.f21076h, c1703a.f21076h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f21070a), this.f21071b, Integer.valueOf(this.f21072c), this.f21073d, Long.valueOf(this.f21074e), this.f21075f, Integer.valueOf(this.g), this.f21076h, Long.valueOf(this.f21077i), Long.valueOf(this.j)});
    }
}
