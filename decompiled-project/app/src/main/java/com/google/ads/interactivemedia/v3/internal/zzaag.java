package com.google.ads.interactivemedia.v3.internal;

import A3.c;
import h3.o;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import y.S;

/* loaded from: classes.dex */
public final class zzaag implements zzxj {
    private final zzyl zza;
    private final zzwf zzb;
    private final zzyn zzc;
    private final zzzt zzd;
    private final List zze;

    public zzaag(zzyl zzylVar, zzwf zzwfVar, zzyn zzynVar, zzzt zzztVar, List list) {
        this.zza = zzylVar;
        this.zzb = zzwfVar;
        this.zzc = zzynVar;
        this.zzd = zzztVar;
        this.zze = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ void zzb(Object obj, AccessibleObject accessibleObject) {
        if (true == Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!zzze.zza(accessibleObject, obj)) {
            throw new zzws(zzacg.zze(accessibleObject, true).concat(" is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00f0  */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Map zzc(zzwm zzwmVar, zzact zzactVar, Class cls, boolean z8, boolean z10) {
        boolean z11;
        boolean z12;
        Method method;
        zzxl zzxlVar;
        ?? singletonList;
        ArrayList arrayList;
        int size;
        ?? r22;
        zzaad zzaadVar;
        int i7;
        int i10;
        boolean z13;
        boolean z14;
        Field[] fieldArr;
        Class cls2;
        LinkedHashMap linkedHashMap;
        zzaag zzaagVar = this;
        zzwm zzwmVar2 = zzwmVar;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap2;
        }
        zzact zzactVar2 = zzactVar;
        Class cls3 = cls;
        boolean z15 = z8;
        while (cls3 != Object.class) {
            Field[] declaredFields = cls3.getDeclaredFields();
            boolean z16 = true;
            boolean z17 = false;
            if (cls3 == cls || declaredFields.length <= 0) {
                z11 = z15;
            } else {
                int zze = zzze.zze(zzaagVar.zze, cls3);
                if (zze == 4) {
                    throw new zzws(o.n("ReflectionAccessFilter does not permit using reflection for ", String.valueOf(cls3), " (supertype of ", String.valueOf(cls), "). Register a TypeAdapter for this type or adjust the access filter."));
                }
                z11 = zze == 3;
            }
            int length = declaredFields.length;
            int i11 = 0;
            while (i11 < length) {
                Field field = declaredFields[i11];
                boolean zzd = zzaagVar.zzd(field, z16);
                boolean zzd2 = zzaagVar.zzd(field, z17);
                if (!zzd) {
                    if (zzd2) {
                        zzd2 = z16;
                    } else {
                        i7 = i11;
                        i10 = length;
                        z13 = z17;
                        z14 = z16;
                        fieldArr = declaredFields;
                        cls2 = cls3;
                        linkedHashMap = linkedHashMap2;
                        i11 = i7 + 1;
                        zzaagVar = this;
                        cls3 = cls2;
                        linkedHashMap2 = linkedHashMap;
                        length = i10;
                        z17 = z13;
                        z16 = z14;
                        declaredFields = fieldArr;
                        zzwmVar2 = zzwmVar;
                    }
                }
                if (!z10) {
                    z12 = zzd2;
                } else if (Modifier.isStatic(field.getModifiers())) {
                    z12 = z17;
                } else {
                    Method zzg = zzacg.zzg(cls3, field);
                    if (!z11) {
                        zzacg.zzh(zzg);
                    }
                    if (zzg.getAnnotation(zzxl.class) != null && field.getAnnotation(zzxl.class) == null) {
                        throw new zzws(S.b("@SerializedName on ", zzacg.zze(zzg, z17), " is not supported"));
                    }
                    z12 = zzd2;
                    method = zzg;
                    if (!z11 && method == null) {
                        zzacg.zzh(field);
                    }
                    Type zze2 = zzxr.zze(zzactVar2.zzd(), cls3, field.getGenericType());
                    zzxlVar = (zzxl) field.getAnnotation(zzxl.class);
                    if (zzxlVar != null) {
                        switch (((Enum) zzaagVar.zzb).ordinal()) {
                            case 0:
                                singletonList = Collections.singletonList(field.getName());
                                break;
                            case 1:
                                throw null;
                            case 2:
                                throw null;
                            case 3:
                                throw null;
                            case 4:
                                throw null;
                            case 5:
                                throw null;
                            case 6:
                                throw null;
                            default:
                                throw null;
                        }
                    } else {
                        String zza = zzxlVar.zza();
                        String[] zzb = zzxlVar.zzb();
                        int length2 = zzb.length;
                        if (length2 == 0) {
                            singletonList = Collections.singletonList(zza);
                        } else {
                            ArrayList arrayList2 = new ArrayList(length2 + 1);
                            arrayList2.add(zza);
                            Collections.addAll(arrayList2, zzb);
                            arrayList = arrayList2;
                            size = arrayList.size();
                            r22 = z17;
                            zzaad zzaadVar2 = null;
                            ?? r42 = arrayList;
                            while (r22 < size) {
                                LinkedHashMap linkedHashMap3 = linkedHashMap2;
                                String str = (String) r42.get(r22);
                                boolean z18 = (r22 != 0 ? z17 : z16) & zzd;
                                zzact zzb2 = zzact.zzb(zze2);
                                Class zzc = zzb2.zzc();
                                boolean z19 = (zzc == null || !zzc.isPrimitive()) ? z17 : z16;
                                int modifiers = field.getModifiers();
                                boolean z20 = (Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers)) ? z16 : z17;
                                zzxk zzxkVar = (zzxk) field.getAnnotation(zzxk.class);
                                zzxi zzb3 = zzxkVar != null ? zzzt.zzb(zzaagVar.zza, zzwmVar2, zzb2, zzxkVar) : null;
                                boolean z21 = zzb3 != null;
                                if (zzb3 == null) {
                                    zzb3 = zzwmVar2.zza(zzb2);
                                }
                                zzaad zzaadVar3 = zzaadVar2;
                                int i12 = r22;
                                int i13 = size;
                                Object obj = r42;
                                Field field2 = field;
                                int i14 = i11;
                                int i15 = length;
                                Field[] fieldArr2 = declaredFields;
                                Class cls4 = cls3;
                                zzaadVar2 = (zzaad) linkedHashMap3.put(str, new zzaab(this, str, field, z18, z12, z11, method, z21, zzb3, zzwmVar, zzb2, z19, z20));
                                if (zzaadVar3 != null) {
                                    zzaadVar2 = zzaadVar3;
                                }
                                zzaagVar = this;
                                cls3 = cls4;
                                linkedHashMap2 = linkedHashMap3;
                                zzd = z18;
                                size = i13;
                                r42 = obj;
                                field = field2;
                                i11 = i14;
                                length = i15;
                                z17 = false;
                                z16 = true;
                                declaredFields = fieldArr2;
                                zzwmVar2 = zzwmVar;
                                r22 = i12 + 1;
                            }
                            zzaadVar = zzaadVar2;
                            Field field3 = field;
                            i7 = i11;
                            i10 = length;
                            z13 = z17;
                            z14 = z16;
                            fieldArr = declaredFields;
                            cls2 = cls3;
                            linkedHashMap = linkedHashMap2;
                            if (zzaadVar != null) {
                                throw new IllegalArgumentException(c.m(c.o("Class ", cls.getName(), " declares multiple JSON fields named '", zzaadVar.zzi, "'; conflict is caused by fields "), zzacg.zzd(zzaadVar.zzj), " and ", zzacg.zzd(field3)));
                            }
                            i11 = i7 + 1;
                            zzaagVar = this;
                            cls3 = cls2;
                            linkedHashMap2 = linkedHashMap;
                            length = i10;
                            z17 = z13;
                            z16 = z14;
                            declaredFields = fieldArr;
                            zzwmVar2 = zzwmVar;
                        }
                    }
                    arrayList = singletonList;
                    size = arrayList.size();
                    r22 = z17;
                    zzaad zzaadVar22 = null;
                    ?? r422 = arrayList;
                    while (r22 < size) {
                    }
                    zzaadVar = zzaadVar22;
                    Field field32 = field;
                    i7 = i11;
                    i10 = length;
                    z13 = z17;
                    z14 = z16;
                    fieldArr = declaredFields;
                    cls2 = cls3;
                    linkedHashMap = linkedHashMap2;
                    if (zzaadVar != null) {
                    }
                }
                method = null;
                if (!z11) {
                    zzacg.zzh(field);
                }
                Type zze22 = zzxr.zze(zzactVar2.zzd(), cls3, field.getGenericType());
                zzxlVar = (zzxl) field.getAnnotation(zzxl.class);
                if (zzxlVar != null) {
                }
                arrayList = singletonList;
                size = arrayList.size();
                r22 = z17;
                zzaad zzaadVar222 = null;
                ?? r4222 = arrayList;
                while (r22 < size) {
                }
                zzaadVar = zzaadVar222;
                Field field322 = field;
                i7 = i11;
                i10 = length;
                z13 = z17;
                z14 = z16;
                fieldArr = declaredFields;
                cls2 = cls3;
                linkedHashMap = linkedHashMap2;
                if (zzaadVar != null) {
                }
            }
            Class cls5 = cls3;
            zzactVar2 = zzact.zzb(zzxr.zze(zzactVar2.zzd(), cls5, cls5.getGenericSuperclass()));
            cls3 = zzactVar2.zzc();
            zzaagVar = this;
            z15 = z11;
            zzwmVar2 = zzwmVar;
        }
        return linkedHashMap2;
    }

    private final boolean zzd(Field field, boolean z8) {
        return (this.zzc.zzc(field.getType(), z8) || this.zzc.zzd(field, z8)) ? false : true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxj
    public final zzxi zza(zzwm zzwmVar, zzact zzactVar) {
        Class zzc = zzactVar.zzc();
        if (!Object.class.isAssignableFrom(zzc)) {
            return null;
        }
        int zze = zzze.zze(this.zze, zzc);
        if (zze == 4) {
            throw new zzws(S.b("ReflectionAccessFilter does not permit using reflection for ", String.valueOf(zzc), ". Register a TypeAdapter for this type or adjust the access filter."));
        }
        boolean z8 = zze == 3;
        return zzacg.zzi(zzc) ? new zzaaf(zzc, zzc(zzwmVar, zzactVar, zzc, z8, true), z8) : new zzaae(this.zza.zza(zzactVar), zzc(zzwmVar, zzactVar, zzc, z8, false));
    }
}
