package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public enum zzvn implements zzadb {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);

    private static final zzadc zzg = new zzadc() { // from class: com.google.android.gms.internal.pal.zzvm
    };
    private final int zzi;

    zzvn(int i7) {
        this.zzi = i7;
    }

    public static zzvn zzb(int i7) {
        if (i7 == 0) {
            return UNKNOWN_KEYMATERIAL;
        }
        if (i7 == 1) {
            return SYMMETRIC;
        }
        if (i7 == 2) {
            return ASYMMETRIC_PRIVATE;
        }
        if (i7 == 3) {
            return ASYMMETRIC_PUBLIC;
        }
        if (i7 != 4) {
            return null;
        }
        return REMOTE;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzi;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
