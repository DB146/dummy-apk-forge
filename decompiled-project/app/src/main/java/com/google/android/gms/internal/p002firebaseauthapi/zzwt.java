package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
public enum zzwt implements zzala {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);

    private final int zzg;

    zzwt(int i7) {
        this.zzg = i7;
    }

    public static zzwt zza(int i7) {
        if (i7 == 0) {
            return UNKNOWN_STATUS;
        }
        if (i7 == 1) {
            return ENABLED;
        }
        if (i7 == 2) {
            return DISABLED;
        }
        if (i7 != 3) {
            return null;
        }
        return DESTROYED;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        sb2.append(zzwt.class.getName());
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != UNRECOGNIZED) {
            sb2.append(" number=");
            sb2.append(zza());
        }
        sb2.append(" name=");
        sb2.append(name());
        sb2.append('>');
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzala
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzg;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
