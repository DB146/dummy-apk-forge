package com.google.android.gms.internal.p002firebaseauthapi;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.G;
import java.util.ArrayList;
import java.util.List;
import n7.E;
import n7.F;

/* loaded from: classes.dex */
public final class zzahc {
    private String zza;
    private String zzb;
    private boolean zzc;
    private String zzd;
    private String zze;
    private zzahs zzf;
    private String zzg;
    private long zzh;
    private long zzi;
    private boolean zzj;
    private F zzk;
    private List<zzahq> zzl;
    private zzaj<E> zzm;

    public zzahc() {
        this.zzf = new zzahs();
        this.zzm = zzaj.zzh();
    }

    public zzahc(String str, String str2, boolean z8, String str3, String str4, zzahs zzahsVar, String str5, String str6, long j, long j10, boolean z10, F f4, List<zzahq> list, zzaj<E> zzajVar) {
        zzahs zzahsVar2;
        this.zza = str;
        this.zzb = str2;
        this.zzc = z8;
        this.zzd = str3;
        this.zze = str4;
        if (zzahsVar == null) {
            zzahsVar2 = new zzahs();
        } else {
            List<zzaht> zza = zzahsVar.zza();
            zzahs zzahsVar3 = new zzahs();
            if (zza != null) {
                zzahsVar3.zza().addAll(zza);
            }
            zzahsVar2 = zzahsVar3;
        }
        this.zzf = zzahsVar2;
        this.zzg = str6;
        this.zzh = j;
        this.zzi = j10;
        this.zzj = false;
        this.zzk = null;
        this.zzl = list == null ? new ArrayList<>() : list;
        this.zzm = zzajVar;
    }

    public final long zza() {
        return this.zzh;
    }

    public final zzahc zza(zzaj<E> zzajVar) {
        G.g(zzajVar);
        this.zzm = zzajVar;
        return this;
    }

    public final zzahc zza(String str) {
        this.zzd = str;
        return this;
    }

    public final zzahc zza(List<zzaht> list) {
        G.g(list);
        zzahs zzahsVar = new zzahs();
        this.zzf = zzahsVar;
        zzahsVar.zza().addAll(list);
        return this;
    }

    public final zzahc zza(F f4) {
        this.zzk = f4;
        return this;
    }

    public final zzahc zza(boolean z8) {
        this.zzj = z8;
        return this;
    }

    public final long zzb() {
        return this.zzi;
    }

    public final zzahc zzb(String str) {
        this.zzb = str;
        return this;
    }

    public final Uri zzc() {
        if (TextUtils.isEmpty(this.zze)) {
            return null;
        }
        return Uri.parse(this.zze);
    }

    public final zzahc zzc(String str) {
        this.zze = str;
        return this;
    }

    public final zzaj<E> zzd() {
        return this.zzm;
    }

    public final F zze() {
        return this.zzk;
    }

    public final zzahs zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zzd;
    }

    public final String zzh() {
        return this.zzb;
    }

    public final String zzi() {
        return this.zza;
    }

    public final String zzj() {
        return this.zzg;
    }

    public final List<zzahq> zzk() {
        return this.zzl;
    }

    public final List<zzaht> zzl() {
        return this.zzf.zza();
    }

    public final boolean zzm() {
        return this.zzc;
    }

    public final boolean zzn() {
        return this.zzj;
    }
}
