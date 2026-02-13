package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzpc extends zzka {
    private final zzps zza;

    public zzpc(zzps zzpsVar, zzlg zzlgVar) {
        int i7 = zzpb.zza[zzpsVar.zza().ordinal()];
        this.zza = zzpsVar;
    }

    @Override // com.google.android.gms.internal.pal.zzka
    public final zzks zza() {
        throw new UnsupportedOperationException("Cannot get parameters on LegacyProtoKey");
    }
}
