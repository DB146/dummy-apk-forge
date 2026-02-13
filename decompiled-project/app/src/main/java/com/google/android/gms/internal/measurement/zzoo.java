package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zzoo {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zzon zzf;
    private static final boolean zzg;
    private static final boolean zzh;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    static {
        boolean z8;
        zzon zzonVar;
        boolean z10;
        Field zzB;
        zzon zzonVar2;
        Unsafe zzq = zzq();
        zzc = zzq;
        int i7 = zzku.zza;
        zzd = Memory.class;
        Class cls = Long.TYPE;
        boolean zzr = zzr(cls);
        zze = zzr;
        boolean zzr2 = zzr(Integer.TYPE);
        zzon zzonVar3 = null;
        if (zzq != null) {
            if (zzr) {
                zzonVar3 = new zzom(zzq);
            } else if (zzr2) {
                zzonVar3 = new zzol(zzq);
            }
        }
        zzf = zzonVar3;
        if (zzonVar3 != null) {
            try {
                Class<?> cls2 = zzonVar3.zza.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls);
            } catch (Throwable th) {
                zzy(th);
            }
            if (zzB() != null) {
                z8 = true;
                zzg = z8;
                zzonVar = zzf;
                if (zzonVar != null) {
                    try {
                        Class<?> cls3 = zzonVar.zza.getClass();
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
                        zzy(th2);
                    }
                    zzh = z10;
                    zza = zzz(byte[].class);
                    zzz(boolean[].class);
                    zzA(boolean[].class);
                    zzz(int[].class);
                    zzA(int[].class);
                    zzz(long[].class);
                    zzA(long[].class);
                    zzz(float[].class);
                    zzA(float[].class);
                    zzz(double[].class);
                    zzA(double[].class);
                    zzz(Object[].class);
                    zzA(Object[].class);
                    zzB = zzB();
                    if (zzB != null && (zzonVar2 = zzf) != null) {
                        zzonVar2.zza.objectFieldOffset(zzB);
                    }
                    zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }
                z10 = false;
                zzh = z10;
                zza = zzz(byte[].class);
                zzz(boolean[].class);
                zzA(boolean[].class);
                zzz(int[].class);
                zzA(int[].class);
                zzz(long[].class);
                zzA(long[].class);
                zzz(float[].class);
                zzA(float[].class);
                zzz(double[].class);
                zzA(double[].class);
                zzz(Object[].class);
                zzA(Object[].class);
                zzB = zzB();
                if (zzB != null) {
                    zzonVar2.zza.objectFieldOffset(zzB);
                }
                zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
            }
        }
        z8 = false;
        zzg = z8;
        zzonVar = zzf;
        if (zzonVar != null) {
        }
        z10 = false;
        zzh = z10;
        zza = zzz(byte[].class);
        zzz(boolean[].class);
        zzA(boolean[].class);
        zzz(int[].class);
        zzA(int[].class);
        zzz(long[].class);
        zzA(long[].class);
        zzz(float[].class);
        zzA(float[].class);
        zzz(double[].class);
        zzA(double[].class);
        zzz(Object[].class);
        zzA(Object[].class);
        zzB = zzB();
        if (zzB != null) {
        }
        zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzoo() {
    }

    private static int zzA(Class cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzB() {
        int i7 = zzku.zza;
        Field zzC = zzC(Buffer.class, "effectiveDirectAddress");
        if (zzC != null) {
            return zzC;
        }
        Field zzC2 = zzC(Buffer.class, "address");
        if (zzC2 == null || zzC2.getType() != Long.TYPE) {
            return null;
        }
        return zzC2;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzD(Object obj, long j, byte b2) {
        Unsafe unsafe = zzf.zza;
        long j10 = (-4) & j;
        int i7 = unsafe.getInt(obj, j10);
        int i10 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j10, ((255 & b2) << i10) | (i7 & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzE(Object obj, long j, byte b2) {
        Unsafe unsafe = zzf.zza;
        long j10 = (-4) & j;
        int i7 = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j10, ((255 & b2) << i7) | (unsafe.getInt(obj, j10) & (~(255 << i7))));
    }

    public static boolean zza() {
        return zzh;
    }

    public static boolean zzb() {
        return zzg;
    }

    public static Object zzc(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int zzd(Object obj, long j) {
        return zzf.zza.getInt(obj, j);
    }

    public static void zze(Object obj, long j, int i7) {
        zzf.zza.putInt(obj, j, i7);
    }

    public static long zzf(Object obj, long j) {
        return zzf.zza.getLong(obj, j);
    }

    public static void zzg(Object obj, long j, long j10) {
        zzf.zza.putLong(obj, j, j10);
    }

    public static boolean zzh(Object obj, long j) {
        return zzf.zzb(obj, j);
    }

    public static void zzi(Object obj, long j, boolean z8) {
        zzf.zzc(obj, j, z8);
    }

    public static float zzj(Object obj, long j) {
        return zzf.zzd(obj, j);
    }

    public static void zzk(Object obj, long j, float f4) {
        zzf.zze(obj, j, f4);
    }

    public static double zzl(Object obj, long j) {
        return zzf.zzf(obj, j);
    }

    public static void zzm(Object obj, long j, double d10) {
        zzf.zzg(obj, j, d10);
    }

    public static Object zzn(Object obj, long j) {
        return zzf.zza.getObject(obj, j);
    }

    public static void zzo(Object obj, long j, Object obj2) {
        zzf.zza.putObject(obj, j, obj2);
    }

    public static void zzp(byte[] bArr, long j, byte b2) {
        zzf.zza(bArr, zza + j, b2);
    }

    public static Unsafe zzq() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzok());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean zzr(Class cls) {
        int i7 = zzku.zza;
        try {
            Class cls2 = zzd;
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

    public static /* synthetic */ boolean zzu(Object obj, long j) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ boolean zzv(Object obj, long j) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ void zzy(Throwable th) {
        Logger.getLogger(zzoo.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    private static int zzz(Class cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }
}
