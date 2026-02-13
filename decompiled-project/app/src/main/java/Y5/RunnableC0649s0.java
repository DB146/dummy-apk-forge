package Y5;

import android.os.Bundle;
import java.util.Objects;

/* renamed from: Y5.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0649s0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11933a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11934b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11935c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f11936d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f11937e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f11938f;

    public RunnableC0649s0(S0 s02, String str, String str2, Object obj, long j) {
        this.f11934b = str;
        this.f11935c = str2;
        this.f11937e = obj;
        this.f11936d = j;
        Objects.requireNonNull(s02);
        this.f11938f = s02;
    }

    public RunnableC0649s0(C0605c1 c0605c1, Bundle bundle, Z0 z02, Z0 z03, long j) {
        this.f11934b = bundle;
        this.f11935c = z02;
        this.f11937e = z03;
        this.f11936d = j;
        Objects.requireNonNull(c0605c1);
        this.f11938f = c0605c1;
    }

    public RunnableC0649s0(BinderC0657w0 binderC0657w0, String str, String str2, String str3, long j) {
        this.f11934b = str;
        this.f11935c = str2;
        this.f11937e = str3;
        this.f11936d = j;
        Objects.requireNonNull(binderC0657w0);
        this.f11938f = binderC0657w0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11933a) {
            case 0:
                String str = (String) this.f11935c;
                BinderC0657w0 binderC0657w0 = (BinderC0657w0) this.f11938f;
                String str2 = (String) this.f11934b;
                if (str2 == null) {
                    I1 i12 = binderC0657w0.f11980a;
                    i12.c().J();
                    String str3 = i12.f11399U;
                    if (str3 == null || str3.equals(str)) {
                        i12.f11399U = str;
                        i12.f11398T = null;
                        return;
                    }
                    return;
                }
                Z0 z02 = new Z0(this.f11936d, (String) this.f11937e, str2);
                I1 i13 = binderC0657w0.f11980a;
                i13.c().J();
                String str4 = i13.f11399U;
                if (str4 != null) {
                    str4.equals(str);
                }
                i13.f11399U = str;
                i13.f11398T = z02;
                return;
            case 1:
                Object obj = this.f11937e;
                ((S0) this.f11938f).U(this.f11936d, obj, (String) this.f11934b, (String) this.f11935c);
                return;
            default:
                C0605c1 c0605c1 = (C0605c1) this.f11938f;
                c0605c1.getClass();
                Bundle bundle = (Bundle) this.f11934b;
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                M1 m12 = ((C0646q0) c0605c1.f3094a).f11915w;
                C0646q0.j(m12);
                c0605c1.T((Z0) this.f11935c, (Z0) this.f11937e, this.f11936d, true, m12.R("screen_view", bundle, null, false));
                return;
        }
    }
}
