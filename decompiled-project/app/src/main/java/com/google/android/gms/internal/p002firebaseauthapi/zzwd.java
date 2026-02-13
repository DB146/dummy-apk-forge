package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
public enum zzwd implements zzala {
    KEM_UNKNOWN(0),
    DHKEM_X25519_HKDF_SHA256(1),
    DHKEM_P256_HKDF_SHA256(2),
    DHKEM_P384_HKDF_SHA384(3),
    DHKEM_P521_HKDF_SHA512(4),
    UNRECOGNIZED(-1);

    private final int zzh;

    zzwd(int i7) {
        this.zzh = i7;
    }

    public static zzwd zza(int i7) {
        if (i7 == 0) {
            return KEM_UNKNOWN;
        }
        if (i7 == 1) {
            return DHKEM_X25519_HKDF_SHA256;
        }
        if (i7 == 2) {
            return DHKEM_P256_HKDF_SHA256;
        }
        if (i7 == 3) {
            return DHKEM_P384_HKDF_SHA384;
        }
        if (i7 != 4) {
            return null;
        }
        return DHKEM_P521_HKDF_SHA512;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        sb2.append(zzwd.class.getName());
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
