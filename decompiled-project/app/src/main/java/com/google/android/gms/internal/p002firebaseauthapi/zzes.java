package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import y.S;

/* loaded from: classes.dex */
public final class zzes implements zzbe {
    private static final byte[] zza = new byte[0];
    private static final Set<String> zzb;
    private final String zzc;
    private final zzce zzd;
    private final zzbe zze;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = Collections.unmodifiableSet(hashSet);
    }

    @Deprecated
    private zzes(zzww zzwwVar, zzbe zzbeVar) {
        if (!zzb.contains(zzwwVar.zzf())) {
            throw new IllegalArgumentException(S.b("Unsupported DEK key type: ", zzwwVar.zzf(), ". Only Tink AEAD key types are supported."));
        }
        this.zzc = zzwwVar.zzf();
        this.zzd = zzcm.zza(((zzww) ((zzaky) zzww.zza(zzwwVar).zza(zzxu.RAW).zze())).zzk());
        this.zze = zzbeVar;
    }

    public static zzbe zza(zzcx zzcxVar, zzbe zzbeVar) {
        try {
            return new zzes(zzww.zza(zzcm.zza(zzcxVar), zzakk.zza()), zzbeVar);
        } catch (zzalf e2) {
            throw new GeneralSecurityException(e2);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i7 = wrap.getInt();
            if (i7 <= 0 || i7 > 4096 || i7 > bArr.length - 4) {
                throw new GeneralSecurityException("length of encrypted DEK too large");
            }
            byte[] bArr3 = new byte[i7];
            wrap.get(bArr3, 0, i7);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            return ((zzbe) zzoz.zza().zza(zzpc.zza().zza((zzpc) zzqe.zza(this.zzc, zzajp.zza(this.zze.zza(bArr3, zza)), zzws.zza.SYMMETRIC, zzxu.RAW, null), zzbj.zza()), zzbe.class)).zza(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e10) {
            e = e10;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e11) {
            e = e11;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        zzbm zza2 = zzos.zza().zza(this.zzd, (Integer) null);
        byte[] zzb2 = this.zze.zzb(((zzqe) zzpc.zza().zza(zza2, zzqe.class, zzbj.zza())).zzd().zzd(), zza);
        if (zzb2.length > 4096) {
            throw new GeneralSecurityException("length of encrypted DEK too large");
        }
        byte[] zzb3 = ((zzbe) zzoz.zza().zza(zza2, zzbe.class)).zzb(bArr, bArr2);
        return ByteBuffer.allocate(zzb2.length + 4 + zzb3.length).putInt(zzb2.length).put(zzb2).put(zzb3).array();
    }
}
