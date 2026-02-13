package com.google.android.gms.internal.pal;

import A3.c;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaeh {
    public static String zza(zzaef zzaefVar, String str) {
        StringBuilder n6 = c.n("# ", str);
        zzd(zzaefVar, n6, 0);
        return n6.toString();
    }

    public static final void zzb(StringBuilder sb2, int i7, String str, Object obj) {
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
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            sb2.append(' ');
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(zzafg.zza(zzaby.zzp((String) obj)));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzaby) {
            sb2.append(": \"");
            sb2.append(zzafg.zza((zzaby) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzacz) {
            sb2.append(" {");
            zzd((zzacz) obj, sb2, i7 + 2);
            sb2.append("\n");
            while (i10 < i7) {
                sb2.append(' ');
                i10++;
            }
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
        int i12 = i7 + 2;
        zzb(sb2, i12, "key", entry.getKey());
        zzb(sb2, i12, "value", entry.getValue());
        sb2.append("\n");
        while (i10 < i7) {
            sb2.append(' ');
            i10++;
        }
        sb2.append("}");
    }

    private static final String zzc(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i7 = 0; i7 < str.length(); i7++) {
            char charAt = str.charAt(i7);
            if (Character.isUpperCase(charAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(charAt));
        }
        return sb2.toString();
    }

    private static void zzd(zzaef zzaefVar, StringBuilder sb2, int i7) {
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : zzaefVar.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String substring = str.startsWith("get") ? str.substring(3) : str;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String concat = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1, substring.length() - 4)));
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    zzb(sb2, i7, zzc(concat), zzacz.zzaD(method2, zzaefVar, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String concat2 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1, substring.length() - 3)));
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    zzb(sb2, i7, zzc(concat2), zzacz.zzaD(method3, zzaefVar, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set".concat(substring))) != null && (!substring.endsWith("Bytes") || !hashMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                String concat3 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1)));
                Method method4 = (Method) hashMap.get("get".concat(substring));
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object zzaD = zzacz.zzaD(method4, zzaefVar, new Object[0]);
                    if (method5 == null) {
                        if (zzaD instanceof Boolean) {
                            if (((Boolean) zzaD).booleanValue()) {
                                zzb(sb2, i7, zzc(concat3), zzaD);
                            }
                        } else if (zzaD instanceof Integer) {
                            if (((Integer) zzaD).intValue() != 0) {
                                zzb(sb2, i7, zzc(concat3), zzaD);
                            }
                        } else if (zzaD instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zzaD).floatValue()) != 0) {
                                zzb(sb2, i7, zzc(concat3), zzaD);
                            }
                        } else if (!(zzaD instanceof Double)) {
                            if (zzaD instanceof String) {
                                equals = zzaD.equals("");
                            } else if (zzaD instanceof zzaby) {
                                equals = zzaD.equals(zzaby.zzb);
                            } else if (!(zzaD instanceof zzaef)) {
                                if ((zzaD instanceof Enum) && ((Enum) zzaD).ordinal() == 0) {
                                }
                                zzb(sb2, i7, zzc(concat3), zzaD);
                            } else if (zzaD != ((zzaef) zzaD).zzaq()) {
                                zzb(sb2, i7, zzc(concat3), zzaD);
                            }
                            if (!equals) {
                                zzb(sb2, i7, zzc(concat3), zzaD);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) zzaD).doubleValue()) != 0) {
                            zzb(sb2, i7, zzc(concat3), zzaD);
                        }
                    } else if (((Boolean) zzacz.zzaD(method5, zzaefVar, new Object[0])).booleanValue()) {
                        zzb(sb2, i7, zzc(concat3), zzaD);
                    }
                }
            }
        }
        if (zzaefVar instanceof zzacw) {
            throw null;
        }
        zzafj zzafjVar = ((zzacz) zzaefVar).zzc;
        if (zzafjVar != null) {
            zzafjVar.zzg(sb2, i7);
        }
    }
}
