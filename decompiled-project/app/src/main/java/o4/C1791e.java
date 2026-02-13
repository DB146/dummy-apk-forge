package o4;

import m4.InterfaceC1569g;

/* renamed from: o4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1791e implements InterfaceC1569g {

    /* renamed from: u, reason: collision with root package name */
    public static final C1791e f21838u = new C1791e(0, 0, 1, 1, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f21839a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21840b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21841c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21842d;

    /* renamed from: e, reason: collision with root package name */
    public final int f21843e;

    /* renamed from: f, reason: collision with root package name */
    public R7.b f21844f;

    static {
        int i7 = n5.D.f21141a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public C1791e(int i7, int i10, int i11, int i12, int i13) {
        this.f21839a = i7;
        this.f21840b = i10;
        this.f21841c = i11;
        this.f21842d = i12;
        this.f21843e = i13;
    }

    public final R7.b a() {
        if (this.f21844f == null) {
            this.f21844f = new R7.b(this);
        }
        return this.f21844f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1791e.class != obj.getClass()) {
            return false;
        }
        C1791e c1791e = (C1791e) obj;
        return this.f21839a == c1791e.f21839a && this.f21840b == c1791e.f21840b && this.f21841c == c1791e.f21841c && this.f21842d == c1791e.f21842d && this.f21843e == c1791e.f21843e;
    }

    public final int hashCode() {
        return ((((((((527 + this.f21839a) * 31) + this.f21840b) * 31) + this.f21841c) * 31) + this.f21842d) * 31) + this.f21843e;
    }
}
