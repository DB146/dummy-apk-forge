package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class zzabx extends zzxi {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private final Map zzc = new HashMap();

    public zzabx(Class cls) {
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new zzabw(this, cls))) {
                Enum r42 = (Enum) field.get(null);
                String name = r42.name();
                String str = r42.toString();
                zzxl zzxlVar = (zzxl) field.getAnnotation(zzxl.class);
                if (zzxlVar != null) {
                    name = zzxlVar.zza();
                    for (String str2 : zzxlVar.zzb()) {
                        this.zza.put(str2, r42);
                    }
                }
                this.zza.put(name, r42);
                this.zzb.put(str, r42);
                this.zzc.put(r42, name);
            }
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) {
        if (zzacvVar.zzt() == 9) {
            zzacvVar.zzn();
            return null;
        }
        String zzi = zzacvVar.zzi();
        Enum r02 = (Enum) this.zza.get(zzi);
        return r02 != null ? r02 : (Enum) this.zzb.get(zzi);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ void write(zzacx zzacxVar, Object obj) {
        Enum r32 = (Enum) obj;
        zzacxVar.zzk(r32 == null ? null : (String) this.zzc.get(r32));
    }
}
