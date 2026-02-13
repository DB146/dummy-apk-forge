package rc;

import Y5.C0660y;
import a.AbstractC0672a;
import java.io.FileNotFoundException;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.zip.Inflater;

/* loaded from: classes2.dex */
public final class K extends o {

    /* renamed from: f, reason: collision with root package name */
    public static final z f23946f;

    /* renamed from: c, reason: collision with root package name */
    public final z f23947c;

    /* renamed from: d, reason: collision with root package name */
    public final o f23948d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f23949e;

    static {
        String str = z.f24006b;
        f23946f = C0660y.a("/", false);
    }

    public K(z zVar, o oVar, LinkedHashMap linkedHashMap) {
        this.f23947c = zVar;
        this.f23948d = oVar;
        this.f23949e = linkedHashMap;
    }

    @Override // rc.o
    public final v F(z zVar) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // rc.o
    public final H K(z file) {
        Throwable th;
        C c10;
        kotlin.jvm.internal.l.e(file, "file");
        z zVar = f23946f;
        zVar.getClass();
        sc.g gVar = (sc.g) this.f23949e.get(sc.c.b(zVar, file, true));
        if (gVar == null) {
            throw new FileNotFoundException("no such file: " + file);
        }
        v F10 = this.f23948d.F(this.f23947c);
        try {
            c10 = AbstractC1958b.c(F10.F(gVar.f24378h));
            try {
                F10.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (F10 != null) {
                try {
                    F10.close();
                } catch (Throwable th4) {
                    AbstractC0672a.c(th3, th4);
                }
            }
            th = th3;
            c10 = null;
        }
        if (th != null) {
            throw th;
        }
        kotlin.jvm.internal.l.e(c10, "<this>");
        sc.b.f(c10, null);
        int i7 = gVar.g;
        long j = gVar.f24377f;
        if (i7 == 0) {
            return new sc.d(c10, j, true);
        }
        return new sc.d(new u(AbstractC1958b.c(new sc.d(c10, gVar.f24376e, true)), new Inflater(true)), j, false);
    }

    @Override // rc.o
    public final I2.A n(z path) {
        Long valueOf;
        Long l10;
        Long l11;
        Long valueOf2;
        Throwable th;
        Throwable th2;
        sc.g gVar;
        kotlin.jvm.internal.l.e(path, "path");
        z zVar = f23946f;
        zVar.getClass();
        sc.g gVar2 = (sc.g) this.f23949e.get(sc.c.b(zVar, path, true));
        if (gVar2 == null) {
            return null;
        }
        long j = gVar2.f24378h;
        if (j != -1) {
            v F10 = this.f23948d.F(this.f23947c);
            try {
                C c10 = AbstractC1958b.c(F10.F(j));
                try {
                    gVar = sc.b.f(c10, gVar2);
                    kotlin.jvm.internal.l.b(gVar);
                    try {
                        c10.close();
                        th2 = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    try {
                        c10.close();
                    } catch (Throwable th5) {
                        AbstractC0672a.c(th4, th5);
                    }
                    th2 = th4;
                    gVar = null;
                }
            } catch (Throwable th6) {
                th = th6;
                if (F10 != null) {
                    try {
                        F10.close();
                    } catch (Throwable th7) {
                        AbstractC0672a.c(th, th7);
                    }
                }
                gVar2 = null;
            }
            if (th2 != null) {
                throw th2;
            }
            try {
                F10.close();
                th = null;
            } catch (Throwable th8) {
                th = th8;
            }
            th = th;
            gVar2 = gVar;
            if (th != null) {
                throw th;
            }
        }
        boolean z8 = gVar2.f24373b;
        boolean z10 = !z8;
        Long valueOf3 = z8 ? null : Long.valueOf(gVar2.f24377f);
        Long l12 = gVar2.f24381m;
        if (l12 != null) {
            valueOf = Long.valueOf((l12.longValue() / 10000) - 11644473600000L);
        } else {
            valueOf = gVar2.f24384p != null ? Long.valueOf(r2.intValue() * 1000) : null;
        }
        Long l13 = gVar2.k;
        if (l13 != null) {
            l10 = Long.valueOf((l13.longValue() / 10000) - 11644473600000L);
        } else {
            if (gVar2.f24382n != null) {
                l10 = Long.valueOf(r3.intValue() * 1000);
            } else {
                int i7 = gVar2.j;
                if (i7 == -1 || i7 == -1) {
                    l10 = null;
                } else {
                    int i10 = gVar2.f24379i;
                    int i11 = (i10 >> 5) & 15;
                    GregorianCalendar gregorianCalendar = new GregorianCalendar();
                    gregorianCalendar.set(14, 0);
                    gregorianCalendar.set(((i10 >> 9) & 127) + 1980, i11 - 1, i10 & 31, (i7 >> 11) & 31, (i7 >> 5) & 63, (i7 & 31) << 1);
                    l10 = Long.valueOf(gregorianCalendar.getTime().getTime());
                }
            }
        }
        Long l14 = gVar2.f24380l;
        if (l14 != null) {
            valueOf2 = Long.valueOf((l14.longValue() / 10000) - 11644473600000L);
        } else {
            if (gVar2.f24383o == null) {
                l11 = null;
                return new I2.A(z10, z8, null, valueOf3, valueOf, l10, l11);
            }
            valueOf2 = Long.valueOf(r0.intValue() * 1000);
        }
        l11 = valueOf2;
        return new I2.A(z10, z8, null, valueOf3, valueOf, l10, l11);
    }
}
