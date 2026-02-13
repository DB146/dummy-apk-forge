package com.google.android.gms.common.api.internal;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.AbstractBinderC0985a;
import com.google.android.gms.common.internal.AbstractC1005v;
import com.google.android.gms.common.internal.InterfaceC0997m;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.internal.common.zza;
import java.util.Set;

/* loaded from: classes.dex */
public final class Y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14966a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14967b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14968c;

    public /* synthetic */ Y(int i7, Object obj, Object obj2) {
        this.f14966a = i7;
        this.f14968c = obj;
        this.f14967b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v29, types: [com.google.android.gms.internal.common.zza] */
    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0997m interfaceC0997m;
        Set set;
        InterfaceC0997m interfaceC0997m2 = null;
        switch (this.f14966a) {
            case 0:
                if (((B) this.f14968c).f14907a) {
                    F5.b bVar = ((X) this.f14967b).f14965b;
                    if ((bVar.f4088b == 0 || bVar.f4089c == null) ? false : true) {
                        B b2 = (B) this.f14968c;
                        InterfaceC0972m interfaceC0972m = b2.mLifecycleFragment;
                        Activity activity = b2.getActivity();
                        PendingIntent pendingIntent = bVar.f4089c;
                        com.google.android.gms.common.internal.G.g(pendingIntent);
                        int i7 = ((X) this.f14967b).f14964a;
                        int i10 = GoogleApiActivity.f14888b;
                        Intent intent = new Intent(activity, (Class<?>) GoogleApiActivity.class);
                        intent.putExtra("pending_intent", pendingIntent);
                        intent.putExtra("failing_client_id", i7);
                        intent.putExtra("notify_manager", false);
                        interfaceC0972m.startActivityForResult(intent, 1);
                        return;
                    }
                    B b10 = (B) this.f14968c;
                    if (b10.f14910d.b(bVar.f4088b, b10.getActivity(), null) != null) {
                        B b11 = (B) this.f14968c;
                        b11.f14910d.i(b11.getActivity(), b11.mLifecycleFragment, bVar.f4088b, (B) this.f14968c);
                        return;
                    }
                    if (bVar.f4088b != 18) {
                        B b12 = (B) this.f14968c;
                        int i11 = ((X) this.f14967b).f14964a;
                        b12.f14908b.set(null);
                        b12.f14912f.h(bVar, i11);
                        return;
                    }
                    B b13 = (B) this.f14968c;
                    F5.e eVar = b13.f14910d;
                    Activity activity2 = b13.getActivity();
                    eVar.getClass();
                    ProgressBar progressBar = new ProgressBar(activity2, null, R.attr.progressBarStyleLarge);
                    progressBar.setIndeterminate(true);
                    progressBar.setVisibility(0);
                    AlertDialog.Builder builder = new AlertDialog.Builder(activity2);
                    builder.setView(progressBar);
                    builder.setMessage(AbstractC1005v.b(activity2, 18));
                    builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
                    AlertDialog create = builder.create();
                    F5.e.g(activity2, create, "GooglePlayServicesUpdatingDialog", b13);
                    B b14 = (B) this.f14968c;
                    Context applicationContext = b14.getActivity().getApplicationContext();
                    A a9 = new A(this, create);
                    b14.f14910d.getClass();
                    IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                    intentFilter.addDataScheme("package");
                    I i12 = new I(a9);
                    zao.zaa(applicationContext, i12, intentFilter);
                    i12.f14938b = applicationContext;
                    if (F5.h.b(applicationContext)) {
                        return;
                    }
                    B b15 = (B) this.f14968c;
                    b15.f14908b.set(null);
                    zau zauVar = b15.f14912f.f14987B;
                    zauVar.sendMessage(zauVar.obtainMessage(3));
                    if (create.isShowing()) {
                        create.dismiss();
                    }
                    synchronized (i12) {
                        try {
                            Context context = i12.f14938b;
                            if (context != null) {
                                context.unregisterReceiver(i12);
                            }
                            i12.f14938b = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
                return;
            case 1:
                G g = (G) this.f14968c;
                E e2 = (E) ((C0967h) g.f14935f).f14998x.get((C0960a) g.f14932c);
                if (e2 == null) {
                    return;
                }
                F5.b bVar2 = (F5.b) this.f14967b;
                if (!(bVar2.f4088b == 0)) {
                    e2.n(bVar2, null);
                    return;
                }
                g.f14930a = true;
                com.google.android.gms.common.api.g gVar = (com.google.android.gms.common.api.g) g.f14931b;
                if (gVar.requiresSignIn()) {
                    if (!g.f14930a || (interfaceC0997m = (InterfaceC0997m) g.f14933d) == null) {
                        return;
                    }
                    gVar.getRemoteService(interfaceC0997m, (Set) g.f14934e);
                    return;
                }
                try {
                    gVar.getRemoteService(null, gVar.getScopesForConnectionlessNonSignIn());
                    return;
                } catch (SecurityException e10) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
                    gVar.disconnect("Failed to get service from broker.");
                    e2.n(new F5.b(10), null);
                    return;
                }
            default:
                a6.h hVar = (a6.h) this.f14967b;
                F5.b bVar3 = hVar.f12794b;
                boolean z8 = bVar3.f4088b == 0;
                N n6 = (N) this.f14968c;
                if (z8) {
                    com.google.android.gms.common.internal.z zVar = hVar.f12795c;
                    com.google.android.gms.common.internal.G.g(zVar);
                    F5.b bVar4 = zVar.f15129c;
                    if (bVar4.f4088b != 0) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(bVar4)), new Exception());
                        n6.j.d(bVar4);
                        n6.f14952f.disconnect();
                        return;
                    }
                    G g2 = n6.j;
                    IBinder iBinder = zVar.f15128b;
                    if (iBinder != null) {
                        int i13 = AbstractBinderC0985a.f15057a;
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        interfaceC0997m2 = queryLocalInterface instanceof InterfaceC0997m ? (InterfaceC0997m) queryLocalInterface : new zza(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
                    }
                    g2.getClass();
                    if (interfaceC0997m2 == null || (set = n6.f14950d) == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        g2.d(new F5.b(4));
                    } else {
                        g2.f14933d = interfaceC0997m2;
                        g2.f14934e = set;
                        if (g2.f14930a) {
                            ((com.google.android.gms.common.api.g) g2.f14931b).getRemoteService(interfaceC0997m2, set);
                        }
                    }
                } else {
                    n6.j.d(bVar3);
                }
                n6.f14952f.disconnect();
                return;
        }
    }
}
