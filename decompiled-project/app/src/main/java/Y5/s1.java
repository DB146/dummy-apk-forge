package Y5;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.Objects;

/* loaded from: classes.dex */
public final class s1 extends AbstractC0636n {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11939e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f11940f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(A4.e eVar, InterfaceC0661y0 interfaceC0661y0) {
        super(interfaceC0661y0);
        Objects.requireNonNull(eVar);
        this.f11940f = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(I1 i12, InterfaceC0661y0 interfaceC0661y0) {
        super(interfaceC0661y0);
        Objects.requireNonNull(i12);
        this.f11940f = i12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(y1 y1Var, InterfaceC0661y0 interfaceC0661y0) {
        super(interfaceC0661y0);
        Objects.requireNonNull(y1Var);
        this.f11940f = y1Var;
    }

    @Override // Y5.AbstractC0636n
    public final void a() {
        BroadcastOptions makeBasic;
        BroadcastOptions shareIdentityEnabled;
        Bundle bundle;
        switch (this.f11939e) {
            case 0:
                A4.e eVar = (A4.e) this.f11940f;
                t1 t1Var = (t1) eVar.f380d;
                t1Var.J();
                C0646q0 c0646q0 = (C0646q0) t1Var.f3094a;
                c0646q0.f11917y.getClass();
                eVar.a(SystemClock.elapsedRealtime(), false, false);
                C0654v c0654v = c0646q0.f11891B;
                C0646q0.i(c0654v);
                c0646q0.f11917y.getClass();
                c0654v.M(SystemClock.elapsedRealtime());
                return;
            case 1:
                y1 y1Var = (y1) this.f11940f;
                y1Var.N();
                W w10 = ((C0646q0) y1Var.f3094a).f11912f;
                C0646q0.l(w10);
                w10.f11573B.a("Starting upload from DelayedRunnable");
                y1Var.f12021b.q();
                return;
            default:
                I1 i12 = (I1) this.f11940f;
                i12.c().J();
                String str = (String) i12.f11384E.pollFirst();
                if (str != null) {
                    ((M5.b) i12.e()).getClass();
                    i12.f11401W = SystemClock.elapsedRealtime();
                    i12.b().f11573B.b(str, "Sending trigger URI notification to app");
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intent.setPackage(str);
                    Context context = i12.f11414z.f11907a;
                    if (Build.VERSION.SDK_INT < 34) {
                        context.sendBroadcast(intent);
                    } else {
                        makeBasic = BroadcastOptions.makeBasic();
                        shareIdentityEnabled = makeBasic.setShareIdentityEnabled(true);
                        bundle = shareIdentityEnabled.toBundle();
                        context.sendBroadcast(intent, null, bundle);
                    }
                }
                i12.F();
                return;
        }
    }
}
