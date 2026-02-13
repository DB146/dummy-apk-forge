package com.google.android.gms.internal.auth;

import F5.d;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.AbstractC0982x;
import com.google.android.gms.common.api.internal.C0981w;
import com.google.android.gms.common.api.internal.InterfaceC0978t;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import v5.AbstractC2145d;
import v5.C2143b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzab extends l implements zzg {
    private static final h zza;
    private static final a zzb;
    private static final i zzc;
    private static final I5.a zzd;
    private final Context zze;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.common.api.h, java.lang.Object] */
    static {
        ?? obj = new Object();
        zza = obj;
        zzv zzvVar = new zzv();
        zzb = zzvVar;
        zzc = new i("GoogleAuthService.API", zzvVar, obj);
        zzd = new I5.a("Auth", "GoogleAuthServiceClient");
    }

    public zzab(Context context) {
        super(context, null, zzc, e.f14901q, k.f15009c);
        this.zze = context;
    }

    public static void zzf(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.t() ? taskCompletionSource.trySetResult(obj) : taskCompletionSource.trySetException(G.l(status))) {
            return;
        }
        zzd.f("The task is already complete.", new Object[0]);
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zza(final zzbw zzbwVar) {
        C0981w builder = AbstractC0982x.builder();
        builder.f15005c = new d[]{AbstractC2145d.f25076c};
        builder.f15003a = new InterfaceC0978t() { // from class: com.google.android.gms.internal.auth.zzt
            @Override // com.google.android.gms.common.api.internal.InterfaceC0978t
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                ((zzp) ((zzi) obj).getService()).zzd(new zzx(zzabVar, (TaskCompletionSource) obj2), zzbwVar);
            }
        };
        builder.f15006d = 1513;
        return doWrite(builder.a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzb(final C2143b c2143b) {
        G.h(c2143b, "request cannot be null.");
        C0981w builder = AbstractC0982x.builder();
        builder.f15005c = new d[]{AbstractC2145d.f25075b};
        builder.f15003a = new InterfaceC0978t() { // from class: com.google.android.gms.internal.auth.zzu
            @Override // com.google.android.gms.common.api.internal.InterfaceC0978t
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                C2143b c2143b2 = c2143b;
                ((zzp) ((zzi) obj).getService()).zze(new zzz(zzabVar, (TaskCompletionSource) obj2), c2143b2);
            }
        };
        builder.f15006d = 1515;
        return doWrite(builder.a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzc(final Account account, final String str, final Bundle bundle) {
        G.h(account, "Account name cannot be null!");
        G.e(str, "Scope cannot be null!");
        C0981w builder = AbstractC0982x.builder();
        builder.f15005c = new d[]{AbstractC2145d.f25076c};
        builder.f15003a = new InterfaceC0978t() { // from class: com.google.android.gms.internal.auth.zzs
            @Override // com.google.android.gms.common.api.internal.InterfaceC0978t
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                ((zzp) ((zzi) obj).getService()).zzf(new zzw(zzabVar, (TaskCompletionSource) obj2), account, str, bundle);
            }
        };
        builder.f15006d = 1512;
        return doWrite(builder.a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzd(final Account account) {
        G.h(account, "account cannot be null.");
        C0981w builder = AbstractC0982x.builder();
        builder.f15005c = new d[]{AbstractC2145d.f25075b};
        builder.f15003a = new InterfaceC0978t() { // from class: com.google.android.gms.internal.auth.zzr
            @Override // com.google.android.gms.common.api.internal.InterfaceC0978t
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                ((zzp) ((zzi) obj).getService()).zzg(new zzaa(zzabVar, (TaskCompletionSource) obj2), account);
            }
        };
        builder.f15006d = 1517;
        return doWrite(builder.a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zze(final String str) {
        G.h(str, "Client package name cannot be null!");
        C0981w builder = AbstractC0982x.builder();
        builder.f15005c = new d[]{AbstractC2145d.f25075b};
        builder.f15003a = new InterfaceC0978t() { // from class: com.google.android.gms.internal.auth.zzq
            @Override // com.google.android.gms.common.api.internal.InterfaceC0978t
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                ((zzp) ((zzi) obj).getService()).zzh(new zzy(zzabVar, (TaskCompletionSource) obj2), str);
            }
        };
        builder.f15006d = 1514;
        return doWrite(builder.a());
    }
}
