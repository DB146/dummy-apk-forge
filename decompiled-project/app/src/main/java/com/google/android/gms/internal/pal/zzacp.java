package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
final class zzacp {
    private static final zzacn zza = new zzaco();
    private static final zzacn zzb;

    static {
        zzacn zzacnVar = null;
        try {
            zzacnVar = (zzacn) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zzb = zzacnVar;
    }

    public static zzacn zza() {
        zzacn zzacnVar = zzb;
        if (zzacnVar != null) {
            return zzacnVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static zzacn zzb() {
        return zza;
    }
}
