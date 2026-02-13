package com.google.android.gms.internal.auth;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zzhj {
    static final boolean zza;
    private static final Unsafe zzb;
    private static final Class zzc;
    private static final boolean zzd;
    private static final zzhi zze;
    private static final boolean zzf;
    private static final boolean zzg;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    static {
        boolean z8;
        zzhi zzhiVar;
        boolean z10;
        Field zzy;
        zzhi zzhiVar2;
        Unsafe zzg2 = zzg();
        zzb = zzg2;
        int i7 = zzds.zza;
        zzc = Memory.class;
        Class cls = Long.TYPE;
        boolean zzs = zzs(cls);
        zzd = zzs;
        boolean zzs2 = zzs(Integer.TYPE);
        zzhi zzhiVar3 = null;
        if (zzg2 != null) {
            if (zzs) {
                zzhiVar3 = new zzhh(zzg2);
            } else if (zzs2) {
                zzhiVar3 = new zzhg(zzg2);
            }
        }
        zze = zzhiVar3;
        if (zzhiVar3 != null) {
            try {
                Class<?> cls2 = zzhiVar3.zza.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls);
            } catch (Throwable th) {
                zzh(th);
            }
            if (zzy() != null) {
                z8 = true;
                zzf = z8;
                zzhiVar = zze;
                if (zzhiVar != null) {
                    try {
                        Class<?> cls3 = zzhiVar.zza.getClass();
                        cls3.getMethod("objectFieldOffset", Field.class);
                        cls3.getMethod("arrayBaseOffset", Class.class);
                        cls3.getMethod("arrayIndexScale", Class.class);
                        Class cls4 = Long.TYPE;
                        cls3.getMethod("getInt", Object.class, cls4);
                        cls3.getMethod("putInt", Object.class, cls4, Integer.TYPE);
                        cls3.getMethod("getLong", Object.class, cls4);
                        cls3.getMethod("putLong", Object.class, cls4, cls4);
                        cls3.getMethod("getObject", Object.class, cls4);
                        cls3.getMethod("putObject", Object.class, cls4, Object.class);
                        z10 = true;
                    } catch (Throwable th2) {
                        zzh(th2);
                    }
                    zzg = z10;
                    zzw(byte[].class);
                    zzw(boolean[].class);
                    zzx(boolean[].class);
                    zzw(int[].class);
                    zzx(int[].class);
                    zzw(long[].class);
                    zzx(long[].class);
                    zzw(float[].class);
                    zzx(float[].class);
                    zzw(double[].class);
                    zzx(double[].class);
                    zzw(Object[].class);
                    zzx(Object[].class);
                    zzy = zzy();
                    if (zzy != null && (zzhiVar2 = zze) != null) {
                        zzhiVar2.zza.objectFieldOffset(zzy);
                    }
                    zza = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }
                z10 = false;
                zzg = z10;
                zzw(byte[].class);
                zzw(boolean[].class);
                zzx(boolean[].class);
                zzw(int[].class);
                zzx(int[].class);
                zzw(long[].class);
                zzx(long[].class);
                zzw(float[].class);
                zzx(float[].class);
                zzw(double[].class);
                zzx(double[].class);
                zzw(Object[].class);
                zzx(Object[].class);
                zzy = zzy();
                if (zzy != null) {
                    zzhiVar2.zza.objectFieldOffset(zzy);
                }
                zza = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
            }
        }
        z8 = false;
        zzf = z8;
        zzhiVar = zze;
        if (zzhiVar != null) {
        }
        z10 = false;
        zzg = z10;
        zzw(byte[].class);
        zzw(boolean[].class);
        zzx(boolean[].class);
        zzw(int[].class);
        zzx(int[].class);
        zzw(long[].class);
        zzx(long[].class);
        zzw(float[].class);
        zzx(float[].class);
        zzw(double[].class);
        zzx(double[].class);
        zzw(Object[].class);
        zzx(Object[].class);
        zzy = zzy();
        if (zzy != null) {
        }
        zza = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzhj() {
    }

    public static double zza(Object obj, long j) {
        return zze.zza(obj, j);
    }

    public static float zzb(Object obj, long j) {
        return zze.zzb(obj, j);
    }

    public static int zzc(Object obj, long j) {
        return zze.zza.getInt(obj, j);
    }

    public static long zzd(Object obj, long j) {
        return zze.zza.getLong(obj, j);
    }

    public static Object zze(Class cls) {
        try {
            return zzb.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Object zzf(Object obj, long j) {
        return zze.zza.getObject(obj, j);
    }

    public static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzhf());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void zzh(Throwable th) {
        Logger.getLogger(zzhj.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    public static /* synthetic */ void zzi(Object obj, long j, boolean z8) {
        zzhi zzhiVar = zze;
        long j10 = (-4) & j;
        int i7 = zzhiVar.zza.getInt(obj, j10);
        int i10 = ((~((int) j)) & 3) << 3;
        zzhiVar.zza.putInt(obj, j10, ((z8 ? 1 : 0) << i10) | ((~(255 << i10)) & i7));
    }

    public static /* synthetic */ void zzj(Object obj, long j, boolean z8) {
        zzhi zzhiVar = zze;
        long j10 = (-4) & j;
        int i7 = (((int) j) & 3) << 3;
        zzhiVar.zza.putInt(obj, j10, ((z8 ? 1 : 0) << i7) | ((~(255 << i7)) & zzhiVar.zza.getInt(obj, j10)));
    }

    public static void zzk(Object obj, long j, boolean z8) {
        zze.zzc(obj, j, z8);
    }

    public static void zzl(Object obj, long j, double d10) {
        zze.zzd(obj, j, d10);
    }

    public static void zzm(Object obj, long j, float f4) {
        zze.zze(obj, j, f4);
    }

    public static void zzn(Object obj, long j, int i7) {
        zze.zza.putInt(obj, j, i7);
    }

    public static void zzo(Object obj, long j, long j10) {
        zze.zza.putLong(obj, j, j10);
    }

    public static void zzp(Object obj, long j, Object obj2) {
        zze.zza.putObject(obj, j, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean zzq(Object obj, long j) {
        return ((byte) ((zze.zza.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean zzr(Object obj, long j) {
        return ((byte) ((zze.zza.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static boolean zzs(Class cls) {
        int i7 = zzds.zza;
        try {
            Class cls2 = zzc;
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

    public static boolean zzt(Object obj, long j) {
        return zze.zzf(obj, j);
    }

    public static boolean zzu() {
        return zzg;
    }

    public static boolean zzv() {
        return zzf;
    }

    private static int zzw(Class cls) {
        if (zzg) {
            return zze.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzx(Class cls) {
        if (zzg) {
            return zze.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzy() {
        int i7 = zzds.zza;
        Field zzz = zzz(Buffer.class, "effectiveDirectAddress");
        if (zzz != null) {
            return zzz;
        }
        Field zzz2 = zzz(Buffer.class, "address");
        if (zzz2 == null || zzz2.getType() != Long.TYPE) {
            return null;
        }
        return zzz2;
    }

    private static Field zzz(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
