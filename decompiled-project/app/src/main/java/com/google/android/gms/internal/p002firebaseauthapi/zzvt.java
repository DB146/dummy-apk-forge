package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
public enum zzvt implements zzala {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);

    private final int zzi;

    zzvt(int i7) {
        this.zzi = i7;
    }

    public static zzvt zza(int i7) {
        if (i7 == 0) {
            return UNKNOWN_HASH;
        }
        if (i7 == 1) {
            return SHA1;
        }
        if (i7 == 2) {
            return SHA384;
        }
        if (i7 == 3) {
            return SHA256;
        }
        if (i7 == 4) {
            return SHA512;
        }
        if (i7 != 5) {
            return null;
        }
        return SHA224;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        sb2.append(zzvt.class.getName());
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
            return this.zzi;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
