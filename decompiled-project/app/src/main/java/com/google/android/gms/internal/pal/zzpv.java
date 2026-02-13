package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzpv {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public zzpv() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new HashMap();
        this.zzd = new HashMap();
    }

    public zzpv(zzqb zzqbVar) {
        Map map;
        Map map2;
        Map map3;
        Map map4;
        map = zzqbVar.zza;
        this.zza = new HashMap(map);
        map2 = zzqbVar.zzb;
        this.zzb = new HashMap(map2);
        map3 = zzqbVar.zzc;
        this.zzc = new HashMap(map3);
        map4 = zzqbVar.zzd;
        this.zzd = new HashMap(map4);
    }

    public final zzpv zza(zzou zzouVar) {
        zzpx zzpxVar = new zzpx(zzouVar.zzd(), zzouVar.zzc(), null);
        if (this.zzb.containsKey(zzpxVar)) {
            zzou zzouVar2 = (zzou) this.zzb.get(zzpxVar);
            if (!zzouVar2.equals(zzouVar) || !zzouVar.equals(zzouVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzpxVar.toString()));
            }
        } else {
            this.zzb.put(zzpxVar, zzouVar);
        }
        return this;
    }

    public final zzpv zzb(zzox zzoxVar) {
        zzpz zzpzVar = new zzpz(zzoxVar.zza(), zzoxVar.zzb(), null);
        if (this.zza.containsKey(zzpzVar)) {
            zzox zzoxVar2 = (zzox) this.zza.get(zzpzVar);
            if (!zzoxVar2.equals(zzoxVar) || !zzoxVar.equals(zzoxVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzpzVar.toString()));
            }
        } else {
            this.zza.put(zzpzVar, zzoxVar);
        }
        return this;
    }

    public final zzpv zzc(zzpm zzpmVar) {
        zzpx zzpxVar = new zzpx(zzpmVar.zzb(), zzpmVar.zza(), null);
        if (this.zzd.containsKey(zzpxVar)) {
            zzpm zzpmVar2 = (zzpm) this.zzd.get(zzpxVar);
            if (!zzpmVar2.equals(zzpmVar) || !zzpmVar.equals(zzpmVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzpxVar.toString()));
            }
        } else {
            this.zzd.put(zzpxVar, zzpmVar);
        }
        return this;
    }

    public final zzpv zzd(zzpp zzppVar) {
        zzpz zzpzVar = new zzpz(zzppVar.zza(), zzppVar.zzb(), null);
        if (this.zzc.containsKey(zzpzVar)) {
            zzpp zzppVar2 = (zzpp) this.zzc.get(zzpzVar);
            if (!zzppVar2.equals(zzppVar) || !zzppVar.equals(zzppVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzpzVar.toString()));
            }
        } else {
            this.zzc.put(zzpzVar, zzppVar);
        }
        return this;
    }
}
