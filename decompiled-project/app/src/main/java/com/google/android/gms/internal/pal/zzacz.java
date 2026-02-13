package com.google.android.gms.internal.pal;

import com.google.android.gms.internal.pal.zzacv;
import com.google.android.gms.internal.pal.zzacz;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class zzacz<MessageType extends zzacz<MessageType, BuilderType>, BuilderType extends zzacv<MessageType, BuilderType>> extends zzabi<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    protected zzafj zzc = zzafj.zzc();
    protected int zzd = -1;

    private static zzacz zza(zzacz zzaczVar) {
        if (zzaczVar == null || zzaczVar.zzaH()) {
            return zzaczVar;
        }
        zzadi zza = new zzafh(zzaczVar).zza();
        zza.zzh(zzaczVar);
        throw zza;
    }

    public static zzadf zzaA(zzadf zzadfVar) {
        int size = zzadfVar.size();
        return zzadfVar.zzd(size == 0 ? 10 : size + size);
    }

    public static Object zzaD(Method method, Object obj, Object... objArr) {
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

    public static Object zzaE(zzaef zzaefVar, String str, Object[] objArr) {
        return new zzaep(zzaefVar, str, objArr);
    }

    public static void zzaF(Class cls, zzacz zzaczVar) {
        zzb.put(cls, zzaczVar);
    }

    public static zzacz zzav(Class cls) {
        Map map = zzb;
        zzacz zzaczVar = (zzacz) map.get(cls);
        if (zzaczVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzaczVar = (zzacz) map.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (zzaczVar == null) {
            zzaczVar = (zzacz) ((zzacz) zzafs.zze(cls)).zzb(6, null, null);
            if (zzaczVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzaczVar);
        }
        return zzaczVar;
    }

    public static zzacz zzaw(zzacz zzaczVar, zzaby zzabyVar, zzacm zzacmVar) {
        zzacc zzh = zzabyVar.zzh();
        zzacz zzaczVar2 = (zzacz) zzaczVar.zzb(4, null, null);
        try {
            zzaer zzb2 = zzaen.zza().zzb(zzaczVar2.getClass());
            zzb2.zzh(zzaczVar2, zzacd.zzq(zzh), zzacmVar);
            zzb2.zzf(zzaczVar2);
            try {
                zzh.zzm(0);
                zza(zzaczVar2);
                return zzaczVar2;
            } catch (zzadi e2) {
                e2.zzh(zzaczVar2);
                throw e2;
            }
        } catch (zzadi e10) {
            e10.zzh(zzaczVar2);
            throw e10;
        } catch (zzafh e11) {
            zzadi zza = e11.zza();
            zza.zzh(zzaczVar2);
            throw zza;
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzadi) {
                throw ((zzadi) e12.getCause());
            }
            zzadi zzadiVar = new zzadi(e12);
            zzadiVar.zzh(zzaczVar2);
            throw zzadiVar;
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof zzadi) {
                throw ((zzadi) e13.getCause());
            }
            throw e13;
        }
    }

    public static zzacz zzax(zzacz zzaczVar, byte[] bArr, zzacm zzacmVar) {
        zzacz zzc = zzc(zzaczVar, bArr, 0, bArr.length, zzacmVar);
        zza(zzc);
        return zzc;
    }

    public static zzade zzay() {
        return zzada.zzf();
    }

    public static zzadf zzaz() {
        return zzaeo.zze();
    }

    private static zzacz zzc(zzacz zzaczVar, byte[] bArr, int i7, int i10, zzacm zzacmVar) {
        zzacz zzaczVar2 = (zzacz) zzaczVar.zzb(4, null, null);
        try {
            zzaer zzb2 = zzaen.zza().zzb(zzaczVar2.getClass());
            zzb2.zzi(zzaczVar2, bArr, 0, i10, new zzabl(zzacmVar));
            zzb2.zzf(zzaczVar2);
            if (zzaczVar2.zza == 0) {
                return zzaczVar2;
            }
            throw new RuntimeException();
        } catch (zzadi e2) {
            e2.zzh(zzaczVar2);
            throw e2;
        } catch (zzafh e10) {
            zzadi zza = e10.zza();
            zza.zzh(zzaczVar2);
            throw zza;
        } catch (IOException e11) {
            if (e11.getCause() instanceof zzadi) {
                throw ((zzadi) e11.getCause());
            }
            zzadi zzadiVar = new zzadi(e11);
            zzadiVar.zzh(zzaczVar2);
            throw zzadiVar;
        } catch (IndexOutOfBoundsException unused) {
            zzadi zzi = zzadi.zzi();
            zzi.zzh(zzaczVar2);
            throw zzi;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzaen.zza().zzb(getClass()).zzk(this, (zzacz) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.zza;
        if (i7 != 0) {
            return i7;
        }
        int zzb2 = zzaen.zza().zzb(getClass()).zzb(this);
        this.zza = zzb2;
        return zzb2;
    }

    public final String toString() {
        return zzaeh.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.pal.zzaef
    public final /* synthetic */ zzaee zzaB() {
        return (zzacv) zzb(5, null, null);
    }

    @Override // com.google.android.gms.internal.pal.zzaef
    public final /* synthetic */ zzaee zzaC() {
        zzacv zzacvVar = (zzacv) zzb(5, null, null);
        zzacvVar.zzal(this);
        return zzacvVar;
    }

    @Override // com.google.android.gms.internal.pal.zzaef
    public final void zzaG(zzach zzachVar) {
        zzaen.zza().zzb(getClass()).zzj(this, zzaci.zza(zzachVar));
    }

    public final boolean zzaH() {
        byte byteValue = ((Byte) zzb(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzl = zzaen.zza().zzb(getClass()).zzl(this);
        zzb(2, true != zzl ? null : this, null);
        return zzl;
    }

    @Override // com.google.android.gms.internal.pal.zzabi
    public final int zzap() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.pal.zzaeg
    public final /* synthetic */ zzaef zzaq() {
        return (zzacz) zzb(6, null, null);
    }

    @Override // com.google.android.gms.internal.pal.zzabi
    public final void zzar(int i7) {
        this.zzd = i7;
    }

    @Override // com.google.android.gms.internal.pal.zzaef
    public final int zzat() {
        int i7 = this.zzd;
        if (i7 != -1) {
            return i7;
        }
        int zza = zzaen.zza().zzb(getClass()).zza(this);
        this.zzd = zza;
        return zza;
    }

    public final zzacv zzau() {
        return (zzacv) zzb(5, null, null);
    }

    public abstract Object zzb(int i7, Object obj, Object obj2);
}
