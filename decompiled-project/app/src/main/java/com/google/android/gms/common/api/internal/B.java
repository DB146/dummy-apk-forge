package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.internal.base.zau;
import java.util.concurrent.atomic.AtomicReference;
import u.C2053f;

/* loaded from: classes.dex */
public final class B extends AbstractC0971l implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f14907a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f14908b;

    /* renamed from: c, reason: collision with root package name */
    public final zau f14909c;

    /* renamed from: d, reason: collision with root package name */
    public final F5.e f14910d;

    /* renamed from: e, reason: collision with root package name */
    public final C2053f f14911e;

    /* renamed from: f, reason: collision with root package name */
    public final C0967h f14912f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(InterfaceC0972m interfaceC0972m, C0967h c0967h) {
        super(interfaceC0972m);
        F5.e eVar = F5.e.f4098d;
        this.f14908b = new AtomicReference(null);
        this.f14909c = new zau(Looper.getMainLooper());
        this.f14910d = eVar;
        this.f14911e = new C2053f(0);
        this.f14912f = c0967h;
        this.mLifecycleFragment.d("ConnectionlessLifecycleHelper", this);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0971l
    public final void onActivityResult(int i7, int i10, Intent intent) {
        AtomicReference atomicReference = this.f14908b;
        X x2 = (X) atomicReference.get();
        C0967h c0967h = this.f14912f;
        if (i7 != 1) {
            if (i7 == 2) {
                int d10 = this.f14910d.d(getActivity(), F5.f.f4099a);
                if (d10 == 0) {
                    atomicReference.set(null);
                    zau zauVar = c0967h.f14987B;
                    zauVar.sendMessage(zauVar.obtainMessage(3));
                    return;
                } else {
                    if (x2 == null) {
                        return;
                    }
                    if (x2.f14965b.f4088b == 18 && d10 == 18) {
                        return;
                    }
                }
            }
        } else if (i10 == -1) {
            atomicReference.set(null);
            zau zauVar2 = c0967h.f14987B;
            zauVar2.sendMessage(zauVar2.obtainMessage(3));
            return;
        } else if (i10 == 0) {
            if (x2 != null) {
                F5.b bVar = new F5.b(1, intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, x2.f14965b.toString());
                atomicReference.set(null);
                c0967h.h(bVar, x2.f14964a);
                return;
            }
            return;
        }
        if (x2 != null) {
            atomicReference.set(null);
            c0967h.h(x2.f14965b, x2.f14964a);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        F5.b bVar = new F5.b(13, null);
        AtomicReference atomicReference = this.f14908b;
        X x2 = (X) atomicReference.get();
        int i7 = x2 == null ? -1 : x2.f14964a;
        atomicReference.set(null);
        this.f14912f.h(bVar, i7);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0971l
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f14908b.set(bundle.getBoolean("resolving_error", false) ? new X(new F5.b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0971l
    public final void onResume() {
        super.onResume();
        if (this.f14911e.isEmpty()) {
            return;
        }
        this.f14912f.b(this);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0971l
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        X x2 = (X) this.f14908b.get();
        if (x2 == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", x2.f14964a);
        F5.b bVar = x2.f14965b;
        bundle.putInt("failed_status", bVar.f4088b);
        bundle.putParcelable("failed_resolution", bVar.f4089c);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0971l
    public final void onStart() {
        super.onStart();
        this.f14907a = true;
        if (this.f14911e.isEmpty()) {
            return;
        }
        this.f14912f.b(this);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0971l
    public final void onStop() {
        this.f14907a = false;
        C0967h c0967h = this.f14912f;
        c0967h.getClass();
        synchronized (C0967h.f14984F) {
            try {
                if (c0967h.f14999y == this) {
                    c0967h.f14999y = null;
                    c0967h.f15000z.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
