package m5;

import N6.t0;
import android.os.SystemClock;
import java.util.ArrayList;
import n5.AbstractC1705a;

/* renamed from: m5.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1610g implements InterfaceC1616m {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20606a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f20607b = new ArrayList(1);

    /* renamed from: c, reason: collision with root package name */
    public int f20608c;

    /* renamed from: d, reason: collision with root package name */
    public C1619p f20609d;

    public AbstractC1610g(boolean z8) {
        this.f20606a = z8;
    }

    @Override // m5.InterfaceC1616m
    public final void a(T t5) {
        t5.getClass();
        ArrayList arrayList = this.f20607b;
        if (arrayList.contains(t5)) {
            return;
        }
        arrayList.add(t5);
        this.f20608c++;
    }

    public final void b(int i7) {
        C1619p c1619p = this.f20609d;
        int i10 = n5.D.f21141a;
        for (int i11 = 0; i11 < this.f20608c; i11++) {
            T t5 = (T) this.f20607b.get(i11);
            boolean z8 = this.f20606a;
            C1621s c1621s = (C1621s) t5;
            synchronized (c1621s) {
                t0 t0Var = C1621s.f20642n;
                if (z8 && (c1619p.f20634h & 8) != 8) {
                    c1621s.f20655h += i7;
                }
            }
        }
    }

    public final void c() {
        C1619p c1619p = this.f20609d;
        int i7 = n5.D.f21141a;
        for (int i10 = 0; i10 < this.f20608c; i10++) {
            T t5 = (T) this.f20607b.get(i10);
            boolean z8 = this.f20606a;
            C1621s c1621s = (C1621s) t5;
            synchronized (c1621s) {
                try {
                    t0 t0Var = C1621s.f20642n;
                    if (z8 && (c1619p.f20634h & 8) != 8) {
                        AbstractC1705a.m(c1621s.f20654f > 0);
                        c1621s.f20652d.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        int i11 = (int) (elapsedRealtime - c1621s.g);
                        c1621s.j += i11;
                        long j = c1621s.k;
                        long j10 = c1621s.f20655h;
                        c1621s.k = j + j10;
                        if (i11 > 0) {
                            c1621s.f20651c.a((int) Math.sqrt(j10), (((float) j10) * 8000.0f) / i11);
                            if (c1621s.j < 2000) {
                                if (c1621s.k >= 524288) {
                                }
                                c1621s.c(i11, c1621s.f20655h, c1621s.f20657l);
                                c1621s.g = elapsedRealtime;
                                c1621s.f20655h = 0L;
                            }
                            c1621s.f20657l = c1621s.f20651c.b();
                            c1621s.c(i11, c1621s.f20655h, c1621s.f20657l);
                            c1621s.g = elapsedRealtime;
                            c1621s.f20655h = 0L;
                        }
                        c1621s.f20654f--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f20609d = null;
    }

    public final void f() {
        for (int i7 = 0; i7 < this.f20608c; i7++) {
            ((T) this.f20607b.get(i7)).getClass();
        }
    }

    public final void g(C1619p c1619p) {
        this.f20609d = c1619p;
        for (int i7 = 0; i7 < this.f20608c; i7++) {
            T t5 = (T) this.f20607b.get(i7);
            boolean z8 = this.f20606a;
            C1621s c1621s = (C1621s) t5;
            synchronized (c1621s) {
                try {
                    t0 t0Var = C1621s.f20642n;
                    if (z8 && (c1619p.f20634h & 8) != 8) {
                        if (c1621s.f20654f == 0) {
                            c1621s.f20652d.getClass();
                            c1621s.g = SystemClock.elapsedRealtime();
                        }
                        c1621s.f20654f++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
