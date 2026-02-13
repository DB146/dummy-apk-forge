package com.google.android.gms.internal.measurement;

import A3.c;
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
public final class zznn {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zznl zznlVar, String str) {
        StringBuilder n6 = c.n("# ", str);
        zzc(zznlVar, n6, 0);
        return n6.toString();
    }

    public static void zzb(StringBuilder sb2, int i7, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb2, i7, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb2, i7, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        zzd(i7, sb2);
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
            zzlg zzlgVar = zzlg.zzb;
            sb2.append(zzof.zza(new zzlf(((String) obj).getBytes(zzmo.zza))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzlg) {
            sb2.append(": \"");
            sb2.append(zzof.zza((zzlg) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzme) {
            sb2.append(" {");
            zzc((zzme) obj, sb2, i7 + 2);
            sb2.append("\n");
            zzd(i7, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        int i11 = i7 + 2;
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        zzb(sb2, i11, "key", entry.getKey());
        zzb(sb2, i11, "value", entry.getValue());
        sb2.append("\n");
        zzd(i7, sb2);
        sb2.append("}");
    }

    private static void zzc(zznl zznlVar, StringBuilder sb2, int i7) {
        int i10;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zznlVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i11 = 0;
        while (true) {
            i10 = 3;
            if (i11 >= length) {
                break;
            }
            Method method3 = declaredMethods[i11];
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
            i11++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i10);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zzb(sb2, i7, substring.substring(0, substring.length() - 4), zzme.zzcr(method2, zznlVar, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb2, i7, substring.substring(0, substring.length() - 3), zzme.zzcr(method, zznlVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object zzcr = zzme.zzcr(method4, zznlVar, new Object[0]);
                    if (method5 != null) {
                        if (!((Boolean) zzme.zzcr(method5, zznlVar, new Object[0])).booleanValue()) {
                        }
                        zzb(sb2, i7, substring, zzcr);
                    } else if (zzcr instanceof Boolean) {
                        if (!((Boolean) zzcr).booleanValue()) {
                        }
                        zzb(sb2, i7, substring, zzcr);
                    } else if (zzcr instanceof Integer) {
                        if (((Integer) zzcr).intValue() == 0) {
                        }
                        zzb(sb2, i7, substring, zzcr);
                    } else if (zzcr instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) zzcr).floatValue()) == 0) {
                        }
                        zzb(sb2, i7, substring, zzcr);
                    } else if (zzcr instanceof Double) {
                        if (Double.doubleToRawLongBits(((Double) zzcr).doubleValue()) == 0) {
                        }
                        zzb(sb2, i7, substring, zzcr);
                    } else {
                        if (zzcr instanceof String) {
                            equals = zzcr.equals("");
                        } else if (zzcr instanceof zzlg) {
                            equals = zzcr.equals(zzlg.zzb);
                        } else if (zzcr instanceof zznl) {
                            if (zzcr == ((zznl) zzcr).zzcE()) {
                            }
                            zzb(sb2, i7, substring, zzcr);
                        } else {
                            if ((zzcr instanceof Enum) && ((Enum) zzcr).ordinal() == 0) {
                            }
                            zzb(sb2, i7, substring, zzcr);
                        }
                        if (equals) {
                        }
                        zzb(sb2, i7, substring, zzcr);
                    }
                }
            }
            i10 = 3;
        }
        if (zznlVar instanceof zzmb) {
            Iterator zzc = ((zzmb) zznlVar).zzb.zzc();
            if (zzc.hasNext()) {
                throw null;
            }
        }
        zzoi zzoiVar = ((zzme) zznlVar).zzc;
        if (zzoiVar != null) {
            zzoiVar.zzj(sb2, i7);
        }
    }

    private static void zzd(int i7, StringBuilder sb2) {
        while (i7 > 0) {
            int i10 = 80;
            if (i7 <= 80) {
                i10 = i7;
            }
            sb2.append(zza, 0, i10);
            i7 -= i10;
        }
    }
}
