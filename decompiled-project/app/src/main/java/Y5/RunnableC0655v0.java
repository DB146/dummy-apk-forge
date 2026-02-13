package Y5;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzcu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Y5.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0655v0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11962a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11963b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O1 f11964c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11965d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f11966e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f11967f;

    public RunnableC0655v0(C0632l1 c0632l1, String str, String str2, O1 o12, zzcu zzcuVar) {
        this.f11963b = str;
        this.f11965d = str2;
        this.f11964c = o12;
        this.f11966e = zzcuVar;
        this.f11967f = c0632l1;
    }

    public RunnableC0655v0(C0632l1 c0632l1, AtomicReference atomicReference, String str, String str2, O1 o12) {
        this.f11965d = atomicReference;
        this.f11963b = str;
        this.f11966e = str2;
        this.f11964c = o12;
        this.f11967f = c0632l1;
    }

    public /* synthetic */ RunnableC0655v0(BinderC0657w0 binderC0657w0, O1 o12, Bundle bundle, K k, String str) {
        this.f11965d = binderC0657w0;
        this.f11964c = o12;
        this.f11966e = bundle;
        this.f11967f = k;
        this.f11963b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        C0632l1 c0632l1;
        I i7;
        M1 m12;
        I i10;
        switch (this.f11962a) {
            case 0:
                K k = (K) this.f11967f;
                I1 i12 = ((BinderC0657w0) this.f11965d).f11980a;
                i12.A();
                try {
                    k.zze(i12.b0(this.f11964c, (Bundle) this.f11966e));
                    return;
                } catch (RemoteException e2) {
                    i12.b().f11577f.c("Failed to return trigger URIs for app", this.f11963b, e2);
                    return;
                }
            case 1:
                AtomicReference atomicReference2 = (AtomicReference) this.f11965d;
                synchronized (atomicReference2) {
                    try {
                        try {
                            c0632l1 = (C0632l1) this.f11967f;
                            i7 = c0632l1.f11815d;
                        } catch (RemoteException e10) {
                            W w10 = ((C0646q0) ((C0632l1) this.f11967f).f3094a).f11912f;
                            C0646q0.l(w10);
                            w10.f11577f.d("(legacy) Failed to get conditional properties; remote exception", null, this.f11963b, e10);
                            ((AtomicReference) this.f11965d).set(Collections.emptyList());
                            atomicReference = (AtomicReference) this.f11965d;
                        }
                        if (i7 == null) {
                            W w11 = ((C0646q0) c0632l1.f3094a).f11912f;
                            C0646q0.l(w11);
                            w11.f11577f.d("(legacy) Failed to get conditional properties; not connected to service", null, this.f11963b, (String) this.f11966e);
                            atomicReference2.set(Collections.emptyList());
                            atomicReference2.notify();
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            atomicReference2.set(i7.q(this.f11963b, (String) this.f11966e, this.f11964c));
                        } else {
                            atomicReference2.set(i7.t(null, this.f11963b, (String) this.f11966e));
                        }
                        c0632l1.W();
                        atomicReference = (AtomicReference) this.f11965d;
                        atomicReference.notify();
                        return;
                    } catch (Throwable th) {
                        ((AtomicReference) this.f11965d).notify();
                        throw th;
                    }
                }
            default:
                zzcu zzcuVar = (zzcu) this.f11966e;
                String str = (String) this.f11965d;
                String str2 = this.f11963b;
                C0632l1 c0632l12 = (C0632l1) this.f11967f;
                ArrayList arrayList = new ArrayList();
                try {
                    try {
                        i10 = c0632l12.f11815d;
                    } catch (Throwable th2) {
                        M1 m13 = ((C0646q0) c0632l12.f3094a).f11915w;
                        C0646q0.j(m13);
                        m13.x0(zzcuVar, arrayList);
                        throw th2;
                    }
                } catch (RemoteException e11) {
                    W w12 = ((C0646q0) c0632l12.f3094a).f11912f;
                    C0646q0.l(w12);
                    w12.f11577f.d("Failed to get conditional properties; remote exception", str2, str, e11);
                }
                if (i10 != null) {
                    arrayList = M1.y0(i10.q(str2, str, this.f11964c));
                    c0632l12.W();
                    m12 = ((C0646q0) c0632l12.f3094a).f11915w;
                    C0646q0.j(m12);
                    m12.x0(zzcuVar, arrayList);
                    return;
                }
                C0646q0 c0646q0 = (C0646q0) c0632l12.f3094a;
                W w13 = c0646q0.f11912f;
                C0646q0.l(w13);
                w13.f11577f.c("Failed to get conditional properties; not connected to service", str2, str);
                m12 = c0646q0.f11915w;
                C0646q0.j(m12);
                m12.x0(zzcuVar, arrayList);
                return;
        }
    }
}
