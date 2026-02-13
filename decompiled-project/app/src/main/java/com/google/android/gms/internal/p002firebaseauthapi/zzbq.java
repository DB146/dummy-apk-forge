package com.google.android.gms.internal.p002firebaseauthapi;

import A3.c;
import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import com.google.android.gms.internal.p002firebaseauthapi.zzxc;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbq implements zzoa {
    private final zzxc zza;
    private final List<zzbt> zzb;
    private final zzoj zzc;

    /* JADX INFO: Access modifiers changed from: private */
    public zzbq(zzxc zzxcVar, List<zzbt> list, zzoj zzojVar) {
        this.zza = zzxcVar;
        this.zzb = list;
        this.zzc = zzojVar;
        if (zzit.zza.zza()) {
            HashSet hashSet = new HashSet();
            for (zzxc.zza zzaVar : zzxcVar.zze()) {
                if (hashSet.contains(Integer.valueOf(zzaVar.zza()))) {
                    throw new GeneralSecurityException(c.f(zzaVar.zza(), "KeyID ", " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing."));
                }
                hashSet.add(Integer.valueOf(zzaVar.zza()));
            }
            if (!hashSet.contains(Integer.valueOf(zzxcVar.zzb()))) {
                throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
    }

    public /* synthetic */ zzbq(zzxc zzxcVar, List list, zzoj zzojVar, zzbw zzbwVar) {
        this(zzxcVar, list, zzojVar);
    }

    private static zzbm zza(zzxc.zza zzaVar) {
        zzqe zza = zzqe.zza(zzaVar.zzb().zzf(), zzaVar.zzb().zze(), zzaVar.zzb().zzb(), zzaVar.zzf(), zzaVar.zzf() == zzxu.RAW ? null : Integer.valueOf(zzaVar.zza()));
        zzpc zza2 = zzpc.zza();
        zzck zza3 = zzck.zza();
        return !zza2.zzb(zza) ? new zzoe(zza, zza3) : zza2.zza((zzpc) zza, zza3);
    }

    private static zzbo zza(zzwt zzwtVar) {
        int i7 = zzbp.zza[zzwtVar.ordinal()];
        if (i7 == 1) {
            return zzbo.zza;
        }
        if (i7 == 2) {
            return zzbo.zzb;
        }
        if (i7 == 3) {
            return zzbo.zzc;
        }
        throw new GeneralSecurityException("Unknown key status");
    }

    public static final zzbq zza(zzbn zzbnVar) {
        return new zzbs().zza(new zzbr(zzbnVar.zza()).zzb().zza()).zza();
    }

    @Deprecated
    public static final zzbq zza(zzby zzbyVar, zzbe zzbeVar, byte[] bArr) {
        zzvq zza = zzbyVar.zza();
        if (zza == null || zza.zzc().zzb() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return zza(zza(zza, zzbeVar, bArr));
    }

    public static final zzbq zza(zzxc zzxcVar) {
        zzd(zzxcVar);
        return new zzbq(zzxcVar, zzc(zzxcVar), zzoj.zza);
    }

    public static /* synthetic */ zzxc.zza zza(zzbm zzbmVar, zzbo zzboVar, int i7) {
        return zzb(zzbmVar, zzboVar, i7);
    }

    private static zzxc zza(zzvq zzvqVar, zzbe zzbeVar, byte[] bArr) {
        try {
            zzxc zza = zzxc.zza(zzbeVar.zza(zzvqVar.zzc().zzd(), bArr), zzakk.zza());
            zzd(zza);
            return zza;
        } catch (zzalf unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    public static zzxc.zza zzb(zzbm zzbmVar, zzbo zzboVar, int i7) {
        zzwt zzwtVar;
        zzqe zzqeVar = (zzqe) zzpc.zza().zza(zzbmVar, zzqe.class, zzck.zza());
        Integer zze = zzqeVar.zze();
        if (zze != null && zze.intValue() != i7) {
            throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
        }
        if (zzbo.zza.equals(zzboVar)) {
            zzwtVar = zzwt.ENABLED;
        } else if (zzbo.zzb.equals(zzboVar)) {
            zzwtVar = zzwt.DISABLED;
        } else {
            if (!zzbo.zzc.equals(zzboVar)) {
                throw new IllegalStateException("Unknown key status");
            }
            zzwtVar = zzwt.DESTROYED;
        }
        return (zzxc.zza) ((zzaky) zzxc.zza.zzd().zza(zzws.zza().zza(zzqeVar.zzf()).zza(zzqeVar.zzd()).zza(zzqeVar.zza())).zza(zzwtVar).zza(i7).zza(zzqeVar.zzc()).zze());
    }

    public static /* synthetic */ void zzb(zzxc zzxcVar) {
        zzd(zzxcVar);
    }

    private static List<zzbt> zzc(zzxc zzxcVar) {
        ArrayList arrayList = new ArrayList(zzxcVar.zza());
        for (zzxc.zza zzaVar : zzxcVar.zze()) {
            int zza = zzaVar.zza();
            try {
                arrayList.add(new zzbt(zza(zzaVar), zza(zzaVar.zzc()), zza, zza == zzxcVar.zzb()));
            } catch (GeneralSecurityException e2) {
                if (zzit.zza.zza()) {
                    throw new GeneralSecurityException("Parsing of a single key failed (maybe wrong status?) and Tink is configured via validateKeysetsOnParsing to reject such keysets.", e2);
                }
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static void zzd(zzxc zzxcVar) {
        if (zzxcVar == null || zzxcVar.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public final String toString() {
        return zzcl.zza(this.zza).toString();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzoa
    public final int zza() {
        return this.zzb.size();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzoa
    public final /* synthetic */ zzod zza(int i7) {
        if (i7 < 0 || i7 >= zza()) {
            throw new IndexOutOfBoundsException(X.c.e(i7, zza(), "Invalid index ", " for keyset of size "));
        }
        if (this.zzb.get(i7) != null) {
            return this.zzb.get(i7);
        }
        throw new IllegalStateException(c.f(i7, "Keyset-Entry at position ", " has wrong status or key parsing failed"));
    }

    public final <P> P zza(zzbf zzbfVar, Class<P> cls) {
        if (!(zzbfVar instanceof zzno)) {
            throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
        }
        zzno zznoVar = (zzno) zzbfVar;
        zzcl.zzb(this.zza);
        for (int i7 = 0; i7 < zza(); i7++) {
            if (this.zzb.get(i7) == null) {
                throw new GeneralSecurityException("Key parsing of key with index " + i7 + " and type_url " + this.zza.zza(i7).zzb().zzf() + " failed, unable to get primitive");
            }
        }
        return (P) zznoVar.zza(this, this.zzc, cls);
    }

    @Deprecated
    public final void zza(zzbx zzbxVar) {
        for (zzxc.zza zzaVar : this.zza.zze()) {
            if (zzaVar.zzb().zzb() == zzws.zza.UNKNOWN_KEYMATERIAL || zzaVar.zzb().zzb() == zzws.zza.SYMMETRIC || zzaVar.zzb().zzb() == zzws.zza.ASYMMETRIC_PRIVATE) {
                throw new GeneralSecurityException(c.j("keyset contains key material of type ", zzaVar.zzb().zzb().name(), " for type url ", zzaVar.zzb().zzf()));
            }
        }
        zzbxVar.zza(this.zza);
    }

    @Deprecated
    public final void zza(zzbx zzbxVar, zzbe zzbeVar, byte[] bArr) {
        zzxc zzxcVar = this.zza;
        zzbxVar.zza((zzvq) ((zzaky) zzvq.zza().zza(zzajp.zza(zzbeVar.zzb(zzxcVar.zzk(), bArr))).zza(zzcl.zza(zzxcVar)).zze()));
    }

    public final zzbq zzb() {
        zzxc.zza zzaVar;
        zzbt zzbtVar;
        if (this.zza == null) {
            throw new GeneralSecurityException("cleartext keyset is not available");
        }
        zzxc.zzb zzc = zzxc.zzc();
        ArrayList arrayList = new ArrayList(this.zzb.size());
        int i7 = 0;
        for (zzbt zzbtVar2 : this.zzb) {
            if (zzbtVar2 == null || !(zzbtVar2.zzb() instanceof zzcd)) {
                zzxc.zza zza = this.zza.zza(i7);
                zzws zzb = zza.zzb();
                if (zzb.zzb() != zzws.zza.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("The keyset contains a non-private key");
                }
                zzaVar = (zzxc.zza) ((zzaky) zza.zzn().zza(zzch.zza(zzb.zzf(), zzb.zze())).zze());
                try {
                    zzbm zza2 = zza(zzaVar);
                    int zza3 = zzaVar.zza();
                    zzbtVar = new zzbt(zza2, zza(zzaVar.zzc()), zza3, zza3 == this.zza.zzb());
                } catch (GeneralSecurityException unused) {
                    zzbtVar = null;
                }
            } else {
                zzbm zzc2 = ((zzcd) zzbtVar2.zzb()).zzc();
                zzbtVar = new zzbt(zzc2, zzbtVar2.zzc(), zzbtVar2.zza(), zzbtVar2.zzd());
                zzaVar = zzb(zzc2, zzbtVar2.zzc(), zzbtVar2.zza());
            }
            zzc.zza(zzaVar);
            arrayList.add(zzbtVar);
            i7++;
        }
        zzc.zza(this.zza.zzb());
        return new zzbq((zzxc) ((zzaky) zzc.zze()), arrayList, this.zzc);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzoa
    public final /* synthetic */ zzod zzc() {
        for (zzbt zzbtVar : this.zzb) {
            if (zzbtVar != null && zzbtVar.zzd()) {
                if (zzbtVar.zzc() == zzbo.zza) {
                    return zzbtVar;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    public final zzxc zzd() {
        return this.zza;
    }
}
