package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.common.api.internal.C0960a;
import com.google.android.gms.tasks.Task;
import v5.C2143b;

/* loaded from: classes.dex */
public interface zzg {
    /* synthetic */ C0960a getApiKey();

    Task zza(zzbw zzbwVar);

    Task zzb(C2143b c2143b);

    Task zzc(Account account, String str, Bundle bundle);

    Task zzd(Account account);

    Task zze(String str);
}
