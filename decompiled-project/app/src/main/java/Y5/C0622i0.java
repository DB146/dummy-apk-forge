package Y5;

import com.google.android.gms.internal.measurement.zzc;
import java.util.Objects;
import u.C2066t;

/* renamed from: Y5.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0622i0 extends C2066t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0628k0 f11777a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0622i0(C0628k0 c0628k0) {
        super(20);
        Objects.requireNonNull(c0628k0);
        this.f11777a = c0628k0;
    }

    @Override // u.C2066t
    public final Object create(Object obj) {
        String str = (String) obj;
        com.google.android.gms.common.internal.G.d(str);
        C0628k0 c0628k0 = this.f11777a;
        c0628k0.K();
        com.google.android.gms.common.internal.G.d(str);
        C0633m c0633m = c0628k0.f12021b.f11405c;
        I1.S(c0633m);
        Q7.h R02 = c0633m.R0(str);
        if (R02 == null) {
            return null;
        }
        W w10 = ((C0646q0) c0628k0.f3094a).f11912f;
        C0646q0.l(w10);
        w10.f11573B.b(str, "Populate EES config from database on cache miss. appId");
        c0628k0.R(str, c0628k0.S(str, (byte[]) R02.f8695b));
        return (zzc) c0628k0.f11804x.snapshot().get(str);
    }
}
