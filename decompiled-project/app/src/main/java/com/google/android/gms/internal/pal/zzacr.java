package com.google.android.gms.internal.pal;

import P1.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzacr {
    private static final zzacr zzb = new zzacr(true);
    final zzafe zza = new zzaeu(16);
    private boolean zzc;
    private boolean zzd;

    private zzacr() {
    }

    private zzacr(boolean z8) {
        zzb();
        zzb();
    }

    public static zzacr zza() {
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0013. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void zzd(zzacq zzacqVar, Object obj) {
        boolean z8;
        zzafy zzb2 = zzacqVar.zzb();
        zzadg.zze(obj);
        zzafy zzafyVar = zzafy.zza;
        zzafz zzafzVar = zzafz.INT;
        switch (zzb2.zza().ordinal()) {
            case 0:
                z8 = obj instanceof Integer;
                if (z8) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzacqVar.zza()), zzacqVar.zzb().zza(), obj.getClass().getName()));
            case 1:
                z8 = obj instanceof Long;
                if (z8) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzacqVar.zza()), zzacqVar.zzb().zza(), obj.getClass().getName()));
            case 2:
                z8 = obj instanceof Float;
                if (z8) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzacqVar.zza()), zzacqVar.zzb().zza(), obj.getClass().getName()));
            case 3:
                z8 = obj instanceof Double;
                if (z8) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzacqVar.zza()), zzacqVar.zzb().zza(), obj.getClass().getName()));
            case 4:
                z8 = obj instanceof Boolean;
                if (z8) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzacqVar.zza()), zzacqVar.zzb().zza(), obj.getClass().getName()));
            case 5:
                z8 = obj instanceof String;
                if (z8) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzacqVar.zza()), zzacqVar.zzb().zza(), obj.getClass().getName()));
            case 6:
                if ((obj instanceof zzaby) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzacqVar.zza()), zzacqVar.zzb().zza(), obj.getClass().getName()));
            case 7:
                if ((obj instanceof Integer) || (obj instanceof zzadb)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzacqVar.zza()), zzacqVar.zzb().zza(), obj.getClass().getName()));
            case g.BYTES_FIELD_NUMBER /* 8 */:
                if ((obj instanceof zzaef) || (obj instanceof zzadk)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzacqVar.zza()), zzacqVar.zzb().zza(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzacqVar.zza()), zzacqVar.zzb().zza(), obj.getClass().getName()));
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        zzacr zzacrVar = new zzacr();
        for (int i7 = 0; i7 < this.zza.zzb(); i7++) {
            Map.Entry zzg = this.zza.zzg(i7);
            zzacrVar.zzc((zzacq) zzg.getKey(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzacrVar.zzc((zzacq) entry.getKey(), entry.getValue());
        }
        zzacrVar.zzd = this.zzd;
        return zzacrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzacr) {
            return this.zza.equals(((zzacr) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (this.zzc) {
            return;
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzc(zzacq zzacqVar, Object obj) {
        if (!zzacqVar.zzc()) {
            zzd(zzacqVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                zzd(zzacqVar, arrayList.get(i7));
            }
            obj = arrayList;
        }
        if (obj instanceof zzadk) {
            this.zzd = true;
        }
        this.zza.put(zzacqVar, obj);
    }
}
