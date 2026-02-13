package com.google.ads.interactivemedia.v3.internal;

import P1.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzaek {
    private static final zzaek zzb = new zzaek(true);
    final zzahf zza = new zzagv(16);
    private boolean zzc;
    private boolean zzd;

    private zzaek() {
    }

    private zzaek(boolean z8) {
        zzb();
        zzb();
    }

    public static zzaek zza() {
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void zzd(zzaej zzaejVar, Object obj) {
        boolean z8;
        zzahz zzb2 = zzaejVar.zzb();
        byte[] bArr = zzafa.zzd;
        obj.getClass();
        zzahz zzahzVar = zzahz.zza;
        zzaia zzaiaVar = zzaia.INT;
        switch (zzb2.zza().ordinal()) {
            case 0:
                z8 = obj instanceof Integer;
                if (z8) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzaejVar.zza()), zzaejVar.zzb().zza(), obj.getClass().getName()));
            case 1:
                z8 = obj instanceof Long;
                if (z8) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzaejVar.zza()), zzaejVar.zzb().zza(), obj.getClass().getName()));
            case 2:
                z8 = obj instanceof Float;
                if (z8) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzaejVar.zza()), zzaejVar.zzb().zza(), obj.getClass().getName()));
            case 3:
                z8 = obj instanceof Double;
                if (z8) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzaejVar.zza()), zzaejVar.zzb().zza(), obj.getClass().getName()));
            case 4:
                z8 = obj instanceof Boolean;
                if (z8) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzaejVar.zza()), zzaejVar.zzb().zza(), obj.getClass().getName()));
            case 5:
                z8 = obj instanceof String;
                if (z8) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzaejVar.zza()), zzaejVar.zzb().zza(), obj.getClass().getName()));
            case 6:
                if ((obj instanceof zzadr) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzaejVar.zza()), zzaejVar.zzb().zza(), obj.getClass().getName()));
            case 7:
                if ((obj instanceof Integer) || (obj instanceof zzaev)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzaejVar.zza()), zzaejVar.zzb().zza(), obj.getClass().getName()));
            case g.BYTES_FIELD_NUMBER /* 8 */:
                if ((obj instanceof zzafz) || (obj instanceof zzafe)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzaejVar.zza()), zzaejVar.zzb().zza(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzaejVar.zza()), zzaejVar.zzb().zza(), obj.getClass().getName()));
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        zzaek zzaekVar = new zzaek();
        for (int i7 = 0; i7 < this.zza.zzb(); i7++) {
            Map.Entry zzg = this.zza.zzg(i7);
            zzaekVar.zzc((zzaej) zzg.getKey(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzaekVar.zzc((zzaej) entry.getKey(), entry.getValue());
        }
        zzaekVar.zzd = this.zzd;
        return zzaekVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzaek) {
            return this.zza.equals(((zzaek) obj).zza);
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
        for (int i7 = 0; i7 < this.zza.zzb(); i7++) {
            Map.Entry zzg = this.zza.zzg(i7);
            if (zzg.getValue() instanceof zzaet) {
                ((zzaet) zzg.getValue()).zzaK();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzc(zzaej zzaejVar, Object obj) {
        if (!zzaejVar.zzc()) {
            zzd(zzaejVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                zzd(zzaejVar, arrayList.get(i7));
            }
            obj = arrayList;
        }
        if (obj instanceof zzafe) {
            this.zzd = true;
        }
        this.zza.put(zzaejVar, obj);
    }
}
