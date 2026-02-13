package Y5;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzcu;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Y5.d1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0608d1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11704a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11705b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f11706c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O1 f11707d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f11708e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0632l1 f11709f;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f11710u;

    public RunnableC0608d1(C0632l1 c0632l1, String str, String str2, O1 o12, boolean z8, zzcu zzcuVar) {
        this.f11705b = str;
        this.f11706c = str2;
        this.f11707d = o12;
        this.f11708e = z8;
        this.f11710u = zzcuVar;
        this.f11709f = c0632l1;
    }

    public RunnableC0608d1(C0632l1 c0632l1, AtomicReference atomicReference, String str, String str2, O1 o12, boolean z8) {
        this.f11710u = atomicReference;
        this.f11705b = str;
        this.f11706c = str2;
        this.f11707d = o12;
        this.f11708e = z8;
        this.f11709f = c0632l1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        RemoteException e2;
        M1 m12;
        I i7;
        String str;
        C0646q0 c0646q0;
        AtomicReference atomicReference;
        C0632l1 c0632l1;
        I i10;
        switch (this.f11704a) {
            case 0:
                String str2 = this.f11705b;
                zzcu zzcuVar = (zzcu) this.f11710u;
                C0632l1 c0632l12 = this.f11709f;
                Bundle bundle2 = new Bundle();
                try {
                    try {
                        i7 = c0632l12.f11815d;
                        str = this.f11706c;
                        c0646q0 = (C0646q0) c0632l12.f3094a;
                    } catch (Throwable th) {
                        th = th;
                        bundle2 = bundle;
                        M1 m13 = ((C0646q0) c0632l12.f3094a).f11915w;
                        C0646q0.j(m13);
                        m13.w0(zzcuVar, bundle2);
                        throw th;
                    }
                } catch (RemoteException e10) {
                    bundle = bundle2;
                    e2 = e10;
                } catch (Throwable th2) {
                    th = th2;
                    M1 m132 = ((C0646q0) c0632l12.f3094a).f11915w;
                    C0646q0.j(m132);
                    m132.w0(zzcuVar, bundle2);
                    throw th;
                }
                if (i7 == null) {
                    W w10 = c0646q0.f11912f;
                    C0646q0.l(w10);
                    w10.f11577f.c("Failed to get user properties; not connected to service", str2, str);
                    M1 m14 = c0646q0.f11915w;
                    C0646q0.j(m14);
                    m14.w0(zzcuVar, bundle2);
                    return;
                }
                List<K1> e11 = i7.e(str2, str, this.f11708e, this.f11707d);
                bundle = new Bundle();
                if (e11 != null) {
                    for (K1 k12 : e11) {
                        String str3 = k12.f11432e;
                        String str4 = k12.f11429b;
                        if (str3 != null) {
                            bundle.putString(str4, str3);
                        } else {
                            Long l10 = k12.f11431d;
                            if (l10 != null) {
                                bundle.putLong(str4, l10.longValue());
                            } else {
                                Double d10 = k12.f11434u;
                                if (d10 != null) {
                                    bundle.putDouble(str4, d10.doubleValue());
                                }
                            }
                        }
                    }
                }
                try {
                    c0632l12.W();
                    m12 = c0646q0.f11915w;
                } catch (RemoteException e12) {
                    e2 = e12;
                    W w11 = ((C0646q0) c0632l12.f3094a).f11912f;
                    C0646q0.l(w11);
                    w11.f11577f.c("Failed to get user properties; remote exception", str2, e2);
                    m12 = ((C0646q0) c0632l12.f3094a).f11915w;
                    C0646q0.j(m12);
                    m12.w0(zzcuVar, bundle);
                    return;
                }
                C0646q0.j(m12);
                m12.w0(zzcuVar, bundle);
                return;
            default:
                AtomicReference atomicReference2 = (AtomicReference) this.f11710u;
                synchronized (atomicReference2) {
                    try {
                        try {
                            c0632l1 = this.f11709f;
                            i10 = c0632l1.f11815d;
                        } catch (RemoteException e13) {
                            W w12 = ((C0646q0) this.f11709f.f3094a).f11912f;
                            C0646q0.l(w12);
                            w12.f11577f.d("(legacy) Failed to get user properties; remote exception", null, this.f11705b, e13);
                            ((AtomicReference) this.f11710u).set(Collections.emptyList());
                            atomicReference = (AtomicReference) this.f11710u;
                        }
                        if (i10 == null) {
                            W w13 = ((C0646q0) c0632l1.f3094a).f11912f;
                            C0646q0.l(w13);
                            w13.f11577f.d("(legacy) Failed to get user properties; not connected to service", null, this.f11705b, this.f11706c);
                            atomicReference2.set(Collections.emptyList());
                            atomicReference2.notify();
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            atomicReference2.set(i10.e(this.f11705b, this.f11706c, this.f11708e, this.f11707d));
                        } else {
                            atomicReference2.set(i10.a(null, this.f11705b, this.f11706c, this.f11708e));
                        }
                        c0632l1.W();
                        atomicReference = (AtomicReference) this.f11710u;
                        atomicReference.notify();
                        return;
                    } catch (Throwable th3) {
                        ((AtomicReference) this.f11710u).notify();
                        throw th3;
                    }
                }
        }
    }
}
