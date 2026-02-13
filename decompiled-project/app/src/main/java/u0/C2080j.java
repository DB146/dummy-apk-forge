package u0;

import i0.C1289b;
import java.util.ArrayList;

/* renamed from: u0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2080j {

    /* renamed from: a, reason: collision with root package name */
    public final long f24763a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24764b;

    /* renamed from: c, reason: collision with root package name */
    public final long f24765c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f24766d;

    /* renamed from: e, reason: collision with root package name */
    public final float f24767e;

    /* renamed from: f, reason: collision with root package name */
    public final long f24768f;
    public final long g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f24769h;

    /* renamed from: i, reason: collision with root package name */
    public final int f24770i;
    public final long j;
    public final ArrayList k;

    /* renamed from: l, reason: collision with root package name */
    public final long f24771l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f24772m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f24773n;

    /* renamed from: o, reason: collision with root package name */
    public C2080j f24774o;

    public C2080j(long j, long j10, long j11, boolean z8, float f4, long j12, long j13, boolean z10, int i7, ArrayList arrayList, long j14, long j15) {
        this(j, j10, j11, z8, f4, j12, j13, z10, false, i7, j14);
        this.k = arrayList;
        this.f24771l = j15;
    }

    public C2080j(long j, long j10, long j11, boolean z8, float f4, long j12, long j13, boolean z10, boolean z11, int i7, long j14) {
        this.f24763a = j;
        this.f24764b = j10;
        this.f24765c = j11;
        this.f24766d = z8;
        this.f24767e = f4;
        this.f24768f = j12;
        this.g = j13;
        this.f24769h = z10;
        this.f24770i = i7;
        this.j = j14;
        this.f24771l = 0L;
        this.f24772m = z11;
        this.f24773n = z11;
    }

    public final void a() {
        C2080j c2080j = this.f24774o;
        if (c2080j == null) {
            this.f24772m = true;
            this.f24773n = true;
        } else if (c2080j != null) {
            c2080j.a();
        }
    }

    public final boolean b() {
        C2080j c2080j = this.f24774o;
        return c2080j != null ? c2080j.b() : this.f24772m || this.f24773n;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PointerInputChange(id=");
        sb2.append((Object) ("PointerId(value=" + this.f24763a + ')'));
        sb2.append(", uptimeMillis=");
        sb2.append(this.f24764b);
        sb2.append(", position=");
        sb2.append((Object) C1289b.g(this.f24765c));
        sb2.append(", pressed=");
        sb2.append(this.f24766d);
        sb2.append(", pressure=");
        sb2.append(this.f24767e);
        sb2.append(", previousUptimeMillis=");
        sb2.append(this.f24768f);
        sb2.append(", previousPosition=");
        sb2.append((Object) C1289b.g(this.g));
        sb2.append(", previousPressed=");
        sb2.append(this.f24769h);
        sb2.append(", isConsumed=");
        sb2.append(b());
        sb2.append(", type=");
        int i7 = this.f24770i;
        sb2.append((Object) (i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb2.append(", historical=");
        Object obj = this.k;
        if (obj == null) {
            obj = Eb.v.f3891a;
        }
        sb2.append(obj);
        sb2.append(",scrollDelta=");
        sb2.append((Object) C1289b.g(this.j));
        sb2.append(')');
        return sb2.toString();
    }
}
