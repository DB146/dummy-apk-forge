package G8;

import java.io.IOException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final t f4396a;

    /* renamed from: b, reason: collision with root package name */
    public static final u f4397b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ x[] f4398c;

    static {
        t tVar = new t();
        f4396a = tVar;
        u uVar = new u();
        f4397b = uVar;
        f4398c = new x[]{tVar, uVar, new x() { // from class: G8.v
            public static Double b(String str, O8.a aVar) {
                try {
                    Double valueOf = Double.valueOf(str);
                    if (!valueOf.isInfinite()) {
                        if (valueOf.isNaN()) {
                        }
                        return valueOf;
                    }
                    if (aVar.f7505C != 1) {
                        throw new IOException("JSON forbids NaN and infinities: " + valueOf + "; at path " + aVar.V(true));
                    }
                    return valueOf;
                } catch (NumberFormatException e2) {
                    StringBuilder n6 = X.c.n("Cannot parse ", str, "; at path ");
                    n6.append(aVar.V(true));
                    throw new Db.d(4, n6.toString(), e2);
                }
            }

            @Override // G8.x
            public final Number a(O8.a aVar) {
                String h02 = aVar.h0();
                if (h02.indexOf(46) >= 0) {
                    return b(h02, aVar);
                }
                try {
                    return Long.valueOf(Long.parseLong(h02));
                } catch (NumberFormatException unused) {
                    return b(h02, aVar);
                }
            }
        }, new x() { // from class: G8.w
            @Override // G8.x
            public final Number a(O8.a aVar) {
                String h02 = aVar.h0();
                try {
                    return I8.h.i(h02);
                } catch (NumberFormatException e2) {
                    StringBuilder n6 = X.c.n("Cannot parse ", h02, "; at path ");
                    n6.append(aVar.V(true));
                    throw new Db.d(4, n6.toString(), e2);
                }
            }
        }};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f4398c.clone();
    }

    public abstract Number a(O8.a aVar);
}
