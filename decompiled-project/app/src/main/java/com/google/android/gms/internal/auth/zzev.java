package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.auth.zzet;
import com.google.android.gms.internal.auth.zzev;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class zzev<MessageType extends zzev<MessageType, BuilderType>, BuilderType extends zzet<MessageType, BuilderType>> extends zzdq<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzha zzc = zzha.zza();

    public static zzev zzb(Class cls) {
        Map map = zzb;
        zzev zzevVar = (zzev) map.get(cls);
        if (zzevVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzevVar = (zzev) map.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (zzevVar == null) {
            zzevVar = (zzev) ((zzev) zzhj.zze(cls)).zzn(6, null, null);
            if (zzevVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzevVar);
        }
        return zzevVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if (r1 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzev zzd(zzev zzevVar, byte[] bArr) {
        byte byteValue;
        zzev zzo = zzo(zzevVar, bArr, 0, bArr.length, zzel.zza);
        if (zzo != null && (byteValue = ((Byte) zzo.zzn(1, null, null)).byteValue()) != 1) {
            if (byteValue != 0) {
                boolean zzi = zzgf.zza().zzb(zzo.getClass()).zzi(zzo);
                zzo.zzn(2, true != zzi ? null : zzo, null);
            }
            zzfb zza = new zzgy(zzo).zza();
            zza.zze(zzo);
            throw zza;
        }
        return zzo;
    }

    public static zzez zzf() {
        return zzgg.zze();
    }

    public static Object zzg(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static Object zzh(zzfx zzfxVar, String str, Object[] objArr) {
        return new zzgh(zzfxVar, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", objArr);
    }

    public static void zzk(Class cls, zzev zzevVar) {
        zzevVar.zzj();
        zzb.put(cls, zzevVar);
    }

    private static zzev zzo(zzev zzevVar, byte[] bArr, int i7, int i10, zzel zzelVar) {
        zzev zzc = zzevVar.zzc();
        try {
            zzgi zzb2 = zzgf.zza().zzb(zzc.getClass());
            zzb2.zzg(zzc, bArr, 0, i10, new zzdt(zzelVar));
            zzb2.zze(zzc);
            return zzc;
        } catch (zzfb e2) {
            e2.zze(zzc);
            throw e2;
        } catch (zzgy e10) {
            zzfb zza = e10.zza();
            zza.zze(zzc);
            throw zza;
        } catch (IOException e11) {
            if (e11.getCause() instanceof zzfb) {
                throw ((zzfb) e11.getCause());
            }
            zzfb zzfbVar = new zzfb(e11);
            zzfbVar.zze(zzc);
            throw zzfbVar;
        } catch (IndexOutOfBoundsException unused) {
            zzfb zzf = zzfb.zzf();
            zzf.zze(zzc);
            throw zzf;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzgf.zza().zzb(getClass()).zzh(this, (zzev) obj);
    }

    public final int hashCode() {
        if (zzm()) {
            return zza();
        }
        int i7 = this.zza;
        if (i7 != 0) {
            return i7;
        }
        int zza = zza();
        this.zza = zza;
        return zza;
    }

    public final String toString() {
        return zzfz.zza(this, super.toString());
    }

    public final int zza() {
        return zzgf.zza().zzb(getClass()).zza(this);
    }

    public final zzev zzc() {
        return (zzev) zzn(4, null, null);
    }

    @Override // com.google.android.gms.internal.auth.zzfy
    public final /* synthetic */ zzfx zze() {
        return (zzev) zzn(6, null, null);
    }

    public final void zzi() {
        zzgf.zza().zzb(getClass()).zze(this);
        zzj();
    }

    public final void zzj() {
        this.zzd &= f.API_PRIORITY_OTHER;
    }

    public final void zzl(int i7) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | f.API_PRIORITY_OTHER;
    }

    public final boolean zzm() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public abstract Object zzn(int i7, Object obj, Object obj2);
}
