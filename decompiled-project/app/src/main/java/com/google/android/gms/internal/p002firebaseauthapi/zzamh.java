package com.google.android.gms.internal.p002firebaseauthapi;

import A3.c;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzamh {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzamc zzamcVar, String str) {
        StringBuilder n6 = c.n("# ", str);
        zza(zzamcVar, n6, 0);
        return n6.toString();
    }

    private static void zza(int i7, StringBuilder sb2) {
        while (i7 > 0) {
            char[] cArr = zza;
            int length = i7 > cArr.length ? cArr.length : i7;
            sb2.append(cArr, 0, length);
            i7 -= length;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x015c, code lost:
    
        if (r5.containsKey("get" + r9.substring(0, r9.length() - 5)) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0184, code lost:
    
        if (((java.lang.Boolean) r7).booleanValue() == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0186, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0197, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a9, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01bf, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zza(zzamc zzamcVar, StringBuilder sb2, int i7) {
        int i10;
        int i11;
        boolean booleanValue;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzamcVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            i10 = 3;
            if (i12 >= length) {
                break;
            }
            Method method3 = declaredMethods[i12];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i12++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i10);
            if (!substring.endsWith("List") || substring.endsWith("OrBuilderList") || substring.equals("List") || (method2 = (Method) entry.getValue()) == null || !method2.getReturnType().equals(List.class)) {
                if (!substring.endsWith("Map") || substring.equals("Map") || (method = (Method) entry.getValue()) == null || !method.getReturnType().equals(Map.class) || method.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic(method.getModifiers())) {
                    i11 = 3;
                    if (hashSet.contains("set".concat(substring))) {
                        if (substring.endsWith("Bytes")) {
                        }
                        Method method4 = (Method) entry.getValue();
                        Method method5 = (Method) hashMap.get("has".concat(substring));
                        if (method4 != null) {
                            Object zza2 = zzaky.zza(method4, zzamcVar, new Object[0]);
                            if (method5 == null) {
                                booleanValue = true;
                                if (!(zza2 instanceof Boolean)) {
                                    if (!(zza2 instanceof Integer)) {
                                        if (!(zza2 instanceof Float)) {
                                            if (!(zza2 instanceof Double)) {
                                                equals = zza2 instanceof String ? zza2.equals("") : zza2 instanceof zzajp ? zza2.equals(zzajp.zza) : !(zza2 instanceof zzamc) ? false : false;
                                            }
                                        }
                                    }
                                }
                                if (equals) {
                                    booleanValue = false;
                                }
                            } else {
                                booleanValue = ((Boolean) zzaky.zza(method5, zzamcVar, new Object[0])).booleanValue();
                            }
                            if (booleanValue) {
                                zza(sb2, i7, substring, zza2);
                            }
                        }
                    }
                } else {
                    i11 = 3;
                    zza(sb2, i7, substring.substring(0, substring.length() - 3), zzaky.zza(method, zzamcVar, new Object[0]));
                }
                i10 = i11;
            } else {
                zza(sb2, i7, substring.substring(0, substring.length() - 4), zzaky.zza(method2, zzamcVar, new Object[0]));
                i10 = 3;
            }
        }
        if (zzamcVar instanceof zzaky.zzb) {
            Iterator<Map.Entry<zzaky.zze, Object>> zzd = ((zzaky.zzb) zzamcVar).zzc.zzd();
            if (zzd.hasNext()) {
                zzd.next().getKey();
                throw new NoSuchMethodError();
            }
        }
        zzann zzannVar = ((zzaky) zzamcVar).zzb;
        if (zzannVar != null) {
            zzannVar.zza(sb2, i7);
        }
    }

    public static void zza(StringBuilder sb2, int i7, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zza(sb2, i7, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zza(sb2, i7, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        zza(i7, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i10 = 1; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (Character.isUpperCase(charAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(charAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(zzanh.zza(zzajp.zza((String) obj)));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzajp) {
            sb2.append(": \"");
            sb2.append(zzanh.zza((zzajp) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzaky) {
            sb2.append(" {");
            zza((zzaky) obj, sb2, i7 + 2);
            sb2.append("\n");
            zza(i7, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i11 = i7 + 2;
        zza(sb2, i11, "key", entry.getKey());
        zza(sb2, i11, "value", entry.getValue());
        sb2.append("\n");
        zza(i7, sb2);
        sb2.append("}");
    }
}
