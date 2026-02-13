package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
public enum zzvn implements zzala {
    UNKNOWN_CURVE(0),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    CURVE25519(5),
    UNRECOGNIZED(-1);

    private final int zzh;

    zzvn(int i7) {
        this.zzh = i7;
    }

    public static zzvn zza(int i7) {
        if (i7 == 0) {
            return UNKNOWN_CURVE;
        }
        if (i7 == 2) {
            return NIST_P256;
        }
        if (i7 == 3) {
            return NIST_P384;
        }
        if (i7 == 4) {
            return NIST_P521;
        }
        if (i7 != 5) {
            return null;
        }
        return CURVE25519;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        sb2.append(zzvn.class.getName());
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
            return this.zzh;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
