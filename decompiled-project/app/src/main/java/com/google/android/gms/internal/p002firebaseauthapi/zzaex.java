package com.google.android.gms.internal.p002firebaseauthapi;

import Y6.i;
import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC0971l;
import com.google.android.gms.common.api.internal.InterfaceC0972m;
import com.google.android.gms.common.internal.G;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import n7.AbstractC1712c;
import n7.l;
import n7.t;
import o7.InterfaceC1819i;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzaex<ResultT, CallbackT> implements zzafi<ResultT> {
    protected final int zza;
    protected i zzc;
    protected l zzd;
    protected CallbackT zze;
    protected InterfaceC1819i zzf;
    protected zzaey<ResultT> zzg;
    protected Executor zzi;
    protected zzahn zzj;
    protected zzahc zzk;
    protected zzagn zzl;
    protected zzahx zzm;
    protected AbstractC1712c zzn;
    protected String zzo;
    protected String zzp;
    protected zzaaj zzq;
    protected zzahk zzr;
    protected zzahj zzs;
    protected zzaij zzt;
    private boolean zzu;
    protected final zzaez zzb = new zzaez(this);
    protected final List<t> zzh = new ArrayList();

    /* loaded from: classes.dex */
    public static class zza extends AbstractC0971l {
        private final List<t> zza;

        private zza(InterfaceC0972m interfaceC0972m, List<t> list) {
            super(interfaceC0972m);
            this.mLifecycleFragment.d("PhoneAuthActivityStopCallback", this);
            this.zza = list;
        }

        public static void zza(Activity activity, List<t> list) {
            InterfaceC0972m fragment = AbstractC0971l.getFragment(activity);
            if (((zza) fragment.r(zza.class, "PhoneAuthActivityStopCallback")) == null) {
                new zza(fragment, list);
            }
        }

        @Override // com.google.android.gms.common.api.internal.AbstractC0971l
        public void onStop() {
            synchronized (this.zza) {
                this.zza.clear();
            }
        }
    }

    public zzaex(int i7) {
        this.zza = i7;
    }

    public static /* synthetic */ void zza(zzaex zzaexVar) {
        zzaexVar.zzb();
        G.i("no success or failure set on method implementation", zzaexVar.zzu);
    }

    public static /* synthetic */ void zza(zzaex zzaexVar, Status status) {
        InterfaceC1819i interfaceC1819i = zzaexVar.zzf;
        if (interfaceC1819i != null) {
            interfaceC1819i.zza(status);
        }
    }

    public final zzaex<ResultT, CallbackT> zza(i iVar) {
        G.h(iVar, "firebaseApp cannot be null");
        this.zzc = iVar;
        return this;
    }

    public final zzaex<ResultT, CallbackT> zza(CallbackT callbackt) {
        G.h(callbackt, "external callback cannot be null");
        this.zze = callbackt;
        return this;
    }

    public final zzaex<ResultT, CallbackT> zza(l lVar) {
        G.h(lVar, "firebaseUser cannot be null");
        this.zzd = lVar;
        return this;
    }

    public final zzaex<ResultT, CallbackT> zza(t tVar, Activity activity, Executor executor, String str) {
        t zza2 = zzaft.zza(str, tVar, this);
        synchronized (this.zzh) {
            List<t> list = this.zzh;
            G.g(zza2);
            list.add(zza2);
        }
        if (activity != null) {
            zza.zza(activity, this.zzh);
        }
        G.g(executor);
        this.zzi = executor;
        return this;
    }

    public final zzaex<ResultT, CallbackT> zza(InterfaceC1819i interfaceC1819i) {
        G.h(interfaceC1819i, "external failure callback cannot be null");
        this.zzf = interfaceC1819i;
        return this;
    }

    public final void zza(Status status) {
        this.zzu = true;
        this.zzg.zza(null, status);
    }

    public abstract void zzb();

    public final void zzb(ResultT resultt) {
        this.zzu = true;
        this.zzg.zza(resultt, null);
    }
}
