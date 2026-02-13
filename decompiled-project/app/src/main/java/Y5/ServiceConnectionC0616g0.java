package Y5;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.zzbp;
import com.google.android.gms.internal.measurement.zzbq;
import java.util.Objects;

/* renamed from: Y5.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC0616g0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final String f11757a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0619h0 f11758b;

    public ServiceConnectionC0616g0(C0619h0 c0619h0, String str) {
        Objects.requireNonNull(c0619h0);
        this.f11758b = c0619h0;
        this.f11757a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C0619h0 c0619h0 = this.f11758b;
        if (iBinder == null) {
            W w10 = c0619h0.f11773a.f11912f;
            C0646q0.l(w10);
            w10.f11580w.a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            zzbq zzb = zzbp.zzb(iBinder);
            if (zzb == null) {
                W w11 = c0619h0.f11773a.f11912f;
                C0646q0.l(w11);
                w11.f11580w.a("Install Referrer Service implementation was not found");
                return;
            }
            C0646q0 c0646q0 = c0619h0.f11773a;
            W w12 = c0646q0.f11912f;
            C0646q0.l(w12);
            w12.f11573B.a("Install Referrer Service connected");
            C0640o0 c0640o0 = c0646q0.f11913u;
            C0646q0.l(c0640o0);
            c0640o0.S(new E5.k(this, zzb, this));
        } catch (RuntimeException e2) {
            W w13 = c0619h0.f11773a.f11912f;
            C0646q0.l(w13);
            w13.f11580w.b(e2, "Exception occurred while calling Install Referrer API");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        W w10 = this.f11758b.f11773a.f11912f;
        C0646q0.l(w10);
        w10.f11573B.a("Install Referrer Service disconnected");
    }
}
