package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzaie {
    private static final ThreadLocal zza = new ThreadLocal();
    private final List zzc;
    private boolean zzb = true;
    private String[] zzd = null;

    public zzaie() {
        ArrayList arrayList = new ArrayList();
        this.zzc = arrayList;
        arrayList.add(String.class);
    }

    public static Set zza() {
        return (Set) zza.get();
    }

    public static zzail zze(Object obj, Object obj2) {
        return new zzaij(new zzaii(obj), new zzaii(obj2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r6.isInstance(r2) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        r7 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0036, code lost:
    
        r7 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0032, code lost:
    
        if (r5.isInstance(r3) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zzf(Object obj, Object obj2, boolean z8, Class cls, boolean z10, String... strArr) {
        Class<?> cls2;
        if (obj == obj2) {
            return true;
        }
        zzaie zzaieVar = new zzaie();
        zzaieVar.zzd = strArr;
        if (zzaieVar.zzb && obj != obj2) {
            Class<?> cls3 = obj.getClass();
            Class<?> cls4 = obj2.getClass();
            if (!cls3.isInstance(obj2)) {
                if (cls4.isInstance(obj)) {
                }
                zzaieVar.zzb = false;
            }
            try {
                if (cls2.isArray()) {
                    zzaieVar.zzd(obj, obj2);
                } else {
                    if (!zzaieVar.zzc.contains(cls3) && !zzaieVar.zzc.contains(cls4)) {
                        zzaieVar.zzg(obj, obj2, cls2);
                        while (cls2.getSuperclass() != null) {
                            cls2 = cls2.getSuperclass();
                            zzaieVar.zzg(obj, obj2, cls2);
                        }
                    }
                    zzaieVar.zzb = obj.equals(obj2);
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        return zzaieVar.zzb;
    }

    private final void zzg(Object obj, Object obj2, Class cls) {
        Set zza2 = zza();
        zzail zze = zze(obj, obj2);
        zzaij zzaijVar = (zzaij) zze;
        zzaij zzaijVar2 = new zzaij(zzaijVar.zzb, zzaijVar.zza);
        if (zza2 == null || !(zza2.contains(zze) || zza2.contains(zzaijVar2))) {
            try {
                Set zza3 = zza();
                if (zza3 == null) {
                    zza3 = new HashSet();
                    zza.set(zza3);
                }
                zza3.add(zze(obj, obj2));
                Field[] declaredFields = cls.getDeclaredFields();
                AccessibleObject.setAccessible(declaredFields, true);
                for (int i7 = 0; i7 < declaredFields.length && this.zzb; i7++) {
                    Field field = declaredFields[i7];
                    if (!zzaic.zza(this.zzd, field.getName()) && !field.getName().contains("$") && !Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(zzaif.class)) {
                        try {
                            zzd(field.get(obj), field.get(obj2));
                        } catch (IllegalAccessException unused) {
                            throw new InternalError("Unexpected IllegalAccessException");
                        }
                    }
                }
                zzh(obj, obj2);
            } catch (Throwable th) {
                zzh(obj, obj2);
                throw th;
            }
        }
    }

    private static void zzh(Object obj, Object obj2) {
        Set zza2 = zza();
        if (zza2 != null) {
            zza2.remove(zze(obj, obj2));
            if (zza2.isEmpty()) {
                zza.remove();
            }
        }
    }

    public final zzaie zzb(int i7, int i10) {
        if (!this.zzb) {
            return this;
        }
        this.zzb = i7 == i10;
        return this;
    }

    public final zzaie zzc(long j, long j10) {
        if (!this.zzb) {
            return this;
        }
        this.zzb = j == j10;
        return this;
    }

    public final zzaie zzd(Object obj, Object obj2) {
        if (!this.zzb || obj == obj2) {
            return this;
        }
        int i7 = 0;
        if (obj == null || obj2 == null) {
            this.zzb = false;
            return this;
        }
        if (!obj.getClass().isArray()) {
            this.zzb = obj.equals(obj2);
        } else if (obj.getClass() != obj2.getClass()) {
            this.zzb = false;
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            long[] jArr2 = (long[]) obj2;
            if (this.zzb && jArr != jArr2) {
                if (jArr.length != jArr2.length) {
                    this.zzb = false;
                } else {
                    while (i7 < jArr.length && this.zzb) {
                        zzc(jArr[i7], jArr2[i7]);
                        i7++;
                    }
                }
            }
        } else if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int[] iArr2 = (int[]) obj2;
            if (this.zzb && iArr != iArr2) {
                if (iArr.length != iArr2.length) {
                    this.zzb = false;
                } else {
                    while (i7 < iArr.length && this.zzb) {
                        zzb(iArr[i7], iArr2[i7]);
                        i7++;
                    }
                }
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            short[] sArr2 = (short[]) obj2;
            if (this.zzb && sArr != sArr2) {
                if (sArr.length != sArr2.length) {
                    this.zzb = false;
                } else {
                    for (int i10 = 0; i10 < sArr.length && this.zzb; i10++) {
                        this.zzb = sArr[i10] == sArr2[i10];
                    }
                }
            }
        } else if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            char[] cArr2 = (char[]) obj2;
            if (this.zzb && cArr != cArr2) {
                if (cArr.length != cArr2.length) {
                    this.zzb = false;
                } else {
                    for (int i11 = 0; i11 < cArr.length && this.zzb; i11++) {
                        this.zzb = cArr[i11] == cArr2[i11];
                    }
                }
            }
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = (byte[]) obj2;
            if (this.zzb && bArr != bArr2) {
                if (bArr.length != bArr2.length) {
                    this.zzb = false;
                } else {
                    for (int i12 = 0; i12 < bArr.length && this.zzb; i12++) {
                        this.zzb = bArr[i12] == bArr2[i12];
                    }
                }
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            double[] dArr2 = (double[]) obj2;
            if (this.zzb && dArr != dArr2) {
                if (dArr.length != dArr2.length) {
                    this.zzb = false;
                } else {
                    while (i7 < dArr.length && this.zzb) {
                        zzc(Double.doubleToLongBits(dArr[i7]), Double.doubleToLongBits(dArr2[i7]));
                        i7++;
                    }
                }
            }
        } else if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            float[] fArr2 = (float[]) obj2;
            if (this.zzb && fArr != fArr2) {
                if (fArr.length != fArr2.length) {
                    this.zzb = false;
                } else {
                    while (i7 < fArr.length && this.zzb) {
                        zzb(Float.floatToIntBits(fArr[i7]), Float.floatToIntBits(fArr2[i7]));
                        i7++;
                    }
                }
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            boolean[] zArr2 = (boolean[]) obj2;
            if (this.zzb && zArr != zArr2) {
                if (zArr.length != zArr2.length) {
                    this.zzb = false;
                } else {
                    for (int i13 = 0; i13 < zArr.length && this.zzb; i13++) {
                        this.zzb = zArr[i13] == zArr2[i13];
                    }
                }
            }
        } else {
            Object[] objArr = (Object[]) obj;
            Object[] objArr2 = (Object[]) obj2;
            if (this.zzb && objArr != objArr2) {
                if (objArr.length != objArr2.length) {
                    this.zzb = false;
                } else {
                    while (i7 < objArr.length && this.zzb) {
                        zzd(objArr[i7], objArr2[i7]);
                        i7++;
                    }
                }
            }
        }
        return this;
    }
}
