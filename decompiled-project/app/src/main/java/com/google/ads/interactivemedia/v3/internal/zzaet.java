package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.internal.zzaep;
import com.google.ads.interactivemedia.v3.internal.zzaet;
import com.google.android.gms.common.api.f;
import h3.o;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class zzaet<MessageType extends zzaet<MessageType, BuilderType>, BuilderType extends zzaep<MessageType, BuilderType>> extends zzadb<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzahk zzc = zzahk.zzc();

    private final int zza(zzags zzagsVar) {
        if (zzagsVar != null) {
            return zzagsVar.zza(this);
        }
        return zzagh.zza().zzb(getClass()).zza(this);
    }

    public static zzaet zzaB(zzaet zzaetVar, zzadr zzadrVar) {
        zzaef zzaefVar = zzaef.zza;
        zzadv zzl = zzadrVar.zzl();
        zzaet zzaA = zzaetVar.zzaA();
        try {
            zzags zzb2 = zzagh.zza().zzb(zzaA.getClass());
            zzb2.zzh(zzaA, zzadw.zzq(zzl), zzaefVar);
            zzb2.zzf(zzaA);
            try {
                zzl.zzm(0);
                zzb(zzaA);
                zzb(zzaA);
                return zzaA;
            } catch (zzafc e2) {
                e2.zzh(zzaA);
                throw e2;
            }
        } catch (zzafc e10) {
            e10.zzh(zzaA);
            throw e10;
        } catch (zzahi e11) {
            zzafc zza = e11.zza();
            zza.zzh(zzaA);
            throw zza;
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzafc) {
                throw ((zzafc) e12.getCause());
            }
            zzafc zzafcVar = new zzafc(e12);
            zzafcVar.zzh(zzaA);
            throw zzafcVar;
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof zzafc) {
                throw ((zzafc) e13.getCause());
            }
            throw e13;
        }
    }

    public static zzaet zzaC(zzaet zzaetVar, zzadr zzadrVar, zzaef zzaefVar) {
        zzadv zzl = zzadrVar.zzl();
        zzaet zzaA = zzaetVar.zzaA();
        try {
            zzags zzb2 = zzagh.zza().zzb(zzaA.getClass());
            zzb2.zzh(zzaA, zzadw.zzq(zzl), zzaefVar);
            zzb2.zzf(zzaA);
            try {
                zzl.zzm(0);
                zzb(zzaA);
                return zzaA;
            } catch (zzafc e2) {
                e2.zzh(zzaA);
                throw e2;
            }
        } catch (zzafc e10) {
            e10.zzh(zzaA);
            throw e10;
        } catch (zzahi e11) {
            zzafc zza = e11.zza();
            zza.zzh(zzaA);
            throw zza;
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzafc) {
                throw ((zzafc) e12.getCause());
            }
            zzafc zzafcVar = new zzafc(e12);
            zzafcVar.zzh(zzaA);
            throw zzafcVar;
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof zzafc) {
                throw ((zzafc) e13.getCause());
            }
            throw e13;
        }
    }

    public static zzaet zzaD(zzaet zzaetVar, byte[] bArr, zzaef zzaefVar) {
        zzaet zzc = zzc(zzaetVar, bArr, 0, bArr.length, zzaefVar);
        zzb(zzc);
        return zzc;
    }

    public static zzaey zzaE() {
        return zzaeu.zzf();
    }

    public static zzaez zzaF() {
        return zzagi.zze();
    }

    public static zzaez zzaG(zzaez zzaezVar) {
        int size = zzaezVar.size();
        return zzaezVar.zzd(size == 0 ? 10 : size + size);
    }

    public static Object zzaI(Method method, Object obj, Object... objArr) {
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

    public static Object zzaJ(zzafz zzafzVar, String str, Object[] objArr) {
        return new zzagj(zzafzVar, str, objArr);
    }

    public static void zzaM(Class cls, zzaet zzaetVar) {
        zzaetVar.zzaL();
        zzb.put(cls, zzaetVar);
    }

    public static zzaet zzaz(Class cls) {
        Map map = zzb;
        zzaet zzaetVar = (zzaet) map.get(cls);
        if (zzaetVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzaetVar = (zzaet) map.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (zzaetVar == null) {
            zzaetVar = (zzaet) ((zzaet) zzaht.zze(cls)).zzj(6, null, null);
            if (zzaetVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzaetVar);
        }
        return zzaetVar;
    }

    private static zzaet zzb(zzaet zzaetVar) {
        if (zzaetVar == null || zzaetVar.zzaP()) {
            return zzaetVar;
        }
        zzafc zza = new zzahi(zzaetVar).zza();
        zza.zzh(zzaetVar);
        throw zza;
    }

    private static zzaet zzc(zzaet zzaetVar, byte[] bArr, int i7, int i10, zzaef zzaefVar) {
        zzaet zzaA = zzaetVar.zzaA();
        try {
            zzags zzb2 = zzagh.zza().zzb(zzaA.getClass());
            zzb2.zzi(zzaA, bArr, 0, i10, new zzade(zzaefVar));
            zzb2.zzf(zzaA);
            return zzaA;
        } catch (zzafc e2) {
            e2.zzh(zzaA);
            throw e2;
        } catch (zzahi e10) {
            zzafc zza = e10.zza();
            zza.zzh(zzaA);
            throw zza;
        } catch (IOException e11) {
            if (e11.getCause() instanceof zzafc) {
                throw ((zzafc) e11.getCause());
            }
            zzafc zzafcVar = new zzafc(e11);
            zzafcVar.zzh(zzaA);
            throw zzafcVar;
        } catch (IndexOutOfBoundsException unused) {
            zzafc zzi = zzafc.zzi();
            zzi.zzh(zzaA);
            throw zzi;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzagh.zza().zzb(getClass()).zzk(this, (zzaet) obj);
    }

    public final int hashCode() {
        if (zzaQ()) {
            return zzaw();
        }
        int i7 = this.zza;
        if (i7 != 0) {
            return i7;
        }
        int zzaw = zzaw();
        this.zza = zzaw;
        return zzaw;
    }

    public final String toString() {
        return zzagb.zza(this, super.toString());
    }

    public final zzaet zzaA() {
        return (zzaet) zzj(4, null, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafz
    public final /* synthetic */ zzafy zzaH() {
        return (zzaep) zzj(5, null, null);
    }

    public final void zzaK() {
        zzagh.zza().zzb(getClass()).zzf(this);
        zzaL();
    }

    public final void zzaL() {
        this.zzd &= f.API_PRIORITY_OTHER;
    }

    public final void zzaN(int i7) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | f.API_PRIORITY_OTHER;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafz
    public final void zzaO(zzaea zzaeaVar) {
        zzagh.zza().zzb(getClass()).zzj(this, zzaeb.zza(zzaeaVar));
    }

    public final boolean zzaP() {
        byte byteValue = ((Byte) zzj(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzl = zzagh.zza().zzb(getClass()).zzl(this);
        zzj(2, true != zzl ? null : this, null);
        return zzl;
    }

    public final boolean zzaQ() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaga
    public final /* synthetic */ zzafz zzaR() {
        return (zzaet) zzj(6, null, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadb
    public final int zzat(zzags zzagsVar) {
        if (zzaQ()) {
            int zza = zza(zzagsVar);
            if (zza >= 0) {
                return zza;
            }
            throw new IllegalStateException(o.l(zza, "serialized size must be non-negative, was "));
        }
        int i7 = this.zzd & f.API_PRIORITY_OTHER;
        if (i7 != Integer.MAX_VALUE) {
            return i7;
        }
        int zza2 = zza(zzagsVar);
        if (zza2 < 0) {
            throw new IllegalStateException(o.l(zza2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | zza2;
        return zza2;
    }

    public final int zzaw() {
        return zzagh.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafz
    public final int zzax() {
        int i7;
        if (zzaQ()) {
            i7 = zza(null);
            if (i7 < 0) {
                throw new IllegalStateException(o.l(i7, "serialized size must be non-negative, was "));
            }
        } else {
            i7 = this.zzd & f.API_PRIORITY_OTHER;
            if (i7 == Integer.MAX_VALUE) {
                i7 = zza(null);
                if (i7 < 0) {
                    throw new IllegalStateException(o.l(i7, "serialized size must be non-negative, was "));
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | i7;
            }
        }
        return i7;
    }

    public final zzaep zzay() {
        return (zzaep) zzj(5, null, null);
    }

    public abstract Object zzj(int i7, Object obj, Object obj2);
}
