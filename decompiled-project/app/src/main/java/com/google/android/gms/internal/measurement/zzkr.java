package com.google.android.gms.internal.measurement;

import A3.c;
import com.google.android.gms.internal.measurement.zzkq;
import com.google.android.gms.internal.measurement.zzkr;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zzkr<MessageType extends zzkr<MessageType, BuilderType>, BuilderType extends zzkq<MessageType, BuilderType>> implements zznl {
    protected int zza = 0;

    public static void zzce(Iterable iterable, List list) {
        zzkq.zzaU(iterable, list);
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final zzlg zzcb() {
        try {
            int zzcn = zzcn();
            zzlg zzlgVar = zzlg.zzb;
            byte[] bArr = new byte[zzcn];
            int i7 = zzll.zzb;
            zzlj zzljVar = new zzlj(bArr, 0, zzcn);
            zzcB(zzljVar);
            return zzld.zza(zzljVar, bArr);
        } catch (IOException e2) {
            String name = getClass().getName();
            throw new RuntimeException(c.m(new StringBuilder(name.length() + 72), "Serializing ", name, " to a ByteString threw an IOException (should never happen)."), e2);
        }
    }

    public final byte[] zzcc() {
        try {
            int zzcn = zzcn();
            byte[] bArr = new byte[zzcn];
            int i7 = zzll.zzb;
            zzlj zzljVar = new zzlj(bArr, 0, zzcn);
            zzcB(zzljVar);
            zzljVar.zzE();
            return bArr;
        } catch (IOException e2) {
            String name = getClass().getName();
            throw new RuntimeException(c.m(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e2);
        }
    }

    public int zzcd(zznw zznwVar) {
        throw null;
    }
}
