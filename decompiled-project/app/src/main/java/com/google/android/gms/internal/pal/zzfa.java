package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzfa extends zzfg {
    private final zzeb zzi;
    private long zzj;

    public zzfa(zzdu zzduVar, String str, String str2, zzr zzrVar, int i7, int i10, zzeb zzebVar) {
        super(zzduVar, "mkunJHFc5vhTAVOcsaNSYx7OvFB6slgbORGrA/joIDO0IYq5rQvDcAbp2AI6CPUh", "k8GEQUoJxJPI/0jAlfeUix8QD7WaaXAfMcSQAzrpgrU=", zzrVar, i7, 53);
        this.zzi = zzebVar;
        if (zzebVar != null) {
            this.zzj = zzebVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.pal.zzfg
    public final void zza() {
        if (this.zzi != null) {
            this.zze.zzQ(((Long) this.zzf.invoke(null, Long.valueOf(this.zzj))).longValue());
        }
    }
}
