package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
final class zzix extends zzit {
    private final zziz zza;

    public zzix(zziz zzizVar, int i7) {
        super(zzizVar.size(), i7);
        this.zza = zzizVar;
    }

    @Override // com.google.android.gms.internal.pal.zzit
    public final Object zza(int i7) {
        return this.zza.get(i7);
    }
}
