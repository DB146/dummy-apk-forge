package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzanp {
    static final boolean zza;
    private static final Unsafe zzb;
    private static final Class<?> zzc;
    private static final boolean zzd;
    private static final boolean zze;
    private static final zzb zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;

    /* loaded from: classes.dex */
    public static final class zza extends zzb {
        public zza(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanp.zzb
        public final double zza(Object obj, long j) {
            return Double.longBitsToDouble(zze(obj, j));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanp.zzb
        public final void zza(Object obj, long j, byte b2) {
            if (zzanp.zza) {
                zzanp.zzc(obj, j, b2);
            } else {
                zzanp.zzd(obj, j, b2);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanp.zzb
        public final void zza(Object obj, long j, double d10) {
            zza(obj, j, Double.doubleToLongBits(d10));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanp.zzb
        public final void zza(Object obj, long j, float f4) {
            zza(obj, j, Float.floatToIntBits(f4));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanp.zzb
        public final void zza(Object obj, long j, boolean z8) {
            if (zzanp.zza) {
                zzanp.zza(obj, j, z8);
            } else {
                zzanp.zzb(obj, j, z8);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanp.zzb
        public final float zzb(Object obj, long j) {
            return Float.intBitsToFloat(zzd(obj, j));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanp.zzb
        public final boolean zzc(Object obj, long j) {
            return zzanp.zza ? zzanp.zzf(obj, j) : zzanp.zzg(obj, j);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class zzb {
        Unsafe zza;

        public zzb(Unsafe unsafe) {
            this.zza = unsafe;
        }

        public abstract double zza(Object obj, long j);

        public abstract void zza(Object obj, long j, byte b2);

        public abstract void zza(Object obj, long j, double d10);

        public abstract void zza(Object obj, long j, float f4);

        public final void zza(Object obj, long j, int i7) {
            this.zza.putInt(obj, j, i7);
        }

        public final void zza(Object obj, long j, long j10) {
            this.zza.putLong(obj, j, j10);
        }

        public abstract void zza(Object obj, long j, boolean z8);

        public final boolean zza() {
            Unsafe unsafe = this.zza;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                zzanp.zza(th);
                return false;
            }
        }

        public abstract float zzb(Object obj, long j);

        public final boolean zzb() {
            Unsafe unsafe = this.zza;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return zzanp.zza() != null;
            } catch (Throwable th) {
                zzanp.zza(th);
                return false;
            }
        }

        public abstract boolean zzc(Object obj, long j);

        public final int zzd(Object obj, long j) {
            return this.zza.getInt(obj, j);
        }

        public final long zze(Object obj, long j) {
            return this.zza.getLong(obj, j);
        }
    }

    /* loaded from: classes.dex */
    public static final class zzc extends zzb {
        public zzc(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanp.zzb
        public final double zza(Object obj, long j) {
            return Double.longBitsToDouble(zze(obj, j));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanp.zzb
        public final void zza(Object obj, long j, byte b2) {
            if (zzanp.zza) {
                zzanp.zzc(obj, j, b2);
            } else {
                zzanp.zzd(obj, j, b2);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanp.zzb
        public final void zza(Object obj, long j, double d10) {
            zza(obj, j, Double.doubleToLongBits(d10));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanp.zzb
        public final void zza(Object obj, long j, float f4) {
            zza(obj, j, Float.floatToIntBits(f4));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanp.zzb
        public final void zza(Object obj, long j, boolean z8) {
            if (zzanp.zza) {
                zzanp.zza(obj, j, z8);
            } else {
                zzanp.zzb(obj, j, z8);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanp.zzb
        public final float zzb(Object obj, long j) {
            return Float.intBitsToFloat(zzd(obj, j));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanp.zzb
        public final boolean zzc(Object obj, long j) {
            return zzanp.zza ? zzanp.zzf(obj, j) : zzanp.zzg(obj, j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
    static {
        zzb zzbVar;
        Field zze2;
        Unsafe zzb2 = zzb();
        zzb = zzb2;
        zzc = zzaji.zza();
        boolean zzd2 = zzd(Long.TYPE);
        zzd = zzd2;
        boolean zzd3 = zzd(Integer.TYPE);
        zze = zzd3;
        if (zzb2 != null) {
            if (zzd2) {
                zzbVar = new zzc(zzb2);
            } else if (zzd3) {
                zzbVar = new zza(zzb2);
            }
            zzf = zzbVar;
            zzg = zzbVar != null ? false : zzbVar.zzb();
            zzh = zzbVar != null ? false : zzbVar.zza();
            zzi = zzb(byte[].class);
            zzb(boolean[].class);
            zzc(boolean[].class);
            zzb(int[].class);
            zzc(int[].class);
            zzb(long[].class);
            zzc(long[].class);
            zzb(float[].class);
            zzc(float[].class);
            zzb(double[].class);
            zzc(double[].class);
            zzb(Object[].class);
            zzc(Object[].class);
            zze2 = zze();
            if (zze2 != null && zzbVar != null) {
                zzbVar.zza.objectFieldOffset(zze2);
            }
            zza = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        }
        zzbVar = null;
        zzf = zzbVar;
        zzg = zzbVar != null ? false : zzbVar.zzb();
        zzh = zzbVar != null ? false : zzbVar.zza();
        zzi = zzb(byte[].class);
        zzb(boolean[].class);
        zzc(boolean[].class);
        zzb(int[].class);
        zzc(int[].class);
        zzb(long[].class);
        zzc(long[].class);
        zzb(float[].class);
        zzc(float[].class);
        zzb(double[].class);
        zzc(double[].class);
        zzb(Object[].class);
        zzc(Object[].class);
        zze2 = zze();
        if (zze2 != null) {
            zzbVar.zza.objectFieldOffset(zze2);
        }
        zza = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzanp() {
    }

    public static double zza(Object obj, long j) {
        return zzf.zza(obj, j);
    }

    public static <T> T zza(Class<T> cls) {
        try {
            return (T) zzb.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static /* synthetic */ Field zza() {
        return zze();
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void zza(Object obj, long j, double d10) {
        zzf.zza(obj, j, d10);
    }

    public static void zza(Object obj, long j, float f4) {
        zzf.zza(obj, j, f4);
    }

    public static void zza(Object obj, long j, int i7) {
        zzf.zza(obj, j, i7);
    }

    public static void zza(Object obj, long j, long j10) {
        zzf.zza(obj, j, j10);
    }

    public static void zza(Object obj, long j, Object obj2) {
        zzf.zza.putObject(obj, j, obj2);
    }

    public static /* synthetic */ void zza(Object obj, long j, boolean z8) {
        zzc(obj, j, z8 ? (byte) 1 : (byte) 0);
    }

    public static /* synthetic */ void zza(Throwable th) {
        Logger.getLogger(zzanp.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th)));
    }

    public static void zza(byte[] bArr, long j, byte b2) {
        zzf.zza((Object) bArr, zzi + j, b2);
    }

    public static float zzb(Object obj, long j) {
        return zzf.zzb(obj, j);
    }

    private static int zzb(Class<?> cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static Unsafe zzb() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzanr());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ void zzb(Object obj, long j, boolean z8) {
        zzd(obj, j, z8 ? (byte) 1 : (byte) 0);
    }

    private static int zzc(Class<?> cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    public static int zzc(Object obj, long j) {
        return zzf.zzd(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzc(Object obj, long j, byte b2) {
        long j10 = (-4) & j;
        int zzc2 = zzc(obj, j10);
        int i7 = ((~((int) j)) & 3) << 3;
        zza(obj, j10, ((255 & b2) << i7) | (zzc2 & (~(255 << i7))));
    }

    public static void zzc(Object obj, long j, boolean z8) {
        zzf.zza(obj, j, z8);
    }

    public static boolean zzc() {
        return zzh;
    }

    public static long zzd(Object obj, long j) {
        return zzf.zze(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzd(Object obj, long j, byte b2) {
        long j10 = (-4) & j;
        int i7 = (((int) j) & 3) << 3;
        zza(obj, j10, ((255 & b2) << i7) | (zzc(obj, j10) & (~(255 << i7))));
    }

    public static boolean zzd() {
        return zzg;
    }

    private static boolean zzd(Class<?> cls) {
        try {
            Class<?> cls2 = zzc;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Object zze(Object obj, long j) {
        return zzf.zza.getObject(obj, j);
    }

    private static Field zze() {
        Field zza2 = zza((Class<?>) Buffer.class, "effectiveDirectAddress");
        if (zza2 != null) {
            return zza2;
        }
        Field zza3 = zza((Class<?>) Buffer.class, "address");
        if (zza3 == null || zza3.getType() != Long.TYPE) {
            return null;
        }
        return zza3;
    }

    public static /* synthetic */ boolean zzf(Object obj, long j) {
        return ((byte) (zzc(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)))) != 0;
    }

    public static /* synthetic */ boolean zzg(Object obj, long j) {
        return ((byte) (zzc(obj, (-4) & j) >>> ((int) ((j & 3) << 3)))) != 0;
    }

    public static boolean zzh(Object obj, long j) {
        return zzf.zzc(obj, j);
    }
}
