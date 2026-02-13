package com.google.android.gms.internal.pal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzadx implements zzaes {
    private static final zzaed zza = new zzadv();
    private final zzaed zzb;

    public zzadx() {
        zzaed zzaedVar;
        zzacu zza2 = zzacu.zza();
        try {
            zzaedVar = (zzaed) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            zzaedVar = zza;
        }
        zzadw zzadwVar = new zzadw(zza2, zzaedVar);
        zzadg.zzf(zzadwVar, "messageInfoFactory");
        this.zzb = zzadwVar;
    }

    private static boolean zzb(zzaec zzaecVar) {
        return zzaecVar.zzc() == 1;
    }

    @Override // com.google.android.gms.internal.pal.zzaes
    public final zzaer zza(Class cls) {
        zzaet.zzG(cls);
        zzaec zzb = this.zzb.zzb(cls);
        return zzb.zzb() ? zzacz.class.isAssignableFrom(cls) ? zzaej.zzc(zzaet.zzB(), zzacp.zzb(), zzb.zza()) : zzaej.zzc(zzaet.zzz(), zzacp.zza(), zzb.zza()) : zzacz.class.isAssignableFrom(cls) ? zzb(zzb) ? zzaei.zzm(cls, zzb, zzael.zzb(), zzadt.zze(), zzaet.zzB(), zzacp.zzb(), zzaeb.zzb()) : zzaei.zzm(cls, zzb, zzael.zzb(), zzadt.zze(), zzaet.zzB(), null, zzaeb.zzb()) : zzb(zzb) ? zzaei.zzm(cls, zzb, zzael.zza(), zzadt.zzd(), zzaet.zzz(), zzacp.zza(), zzaeb.zza()) : zzaei.zzm(cls, zzb, zzael.zza(), zzadt.zzd(), zzaet.zzA(), null, zzaeb.zza());
    }
}
