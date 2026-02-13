package h3;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: h3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1247i {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f17696a;

    public C1247i(int i7) {
        switch (i7) {
            case 1:
                this.f17696a = new LinkedHashMap();
                return;
            default:
                this.f17696a = new LinkedHashMap();
                return;
        }
    }

    public void a(kotlin.jvm.internal.e eVar, Rb.c initializer) {
        kotlin.jvm.internal.l.e(initializer, "initializer");
        LinkedHashMap linkedHashMap = this.f17696a;
        if (!linkedHashMap.containsKey(eVar)) {
            linkedHashMap.put(eVar, new o2.e(eVar, initializer));
            return;
        }
        throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + eVar.b() + '.').toString());
    }

    public Za.d b() {
        Collection initializers = this.f17696a.values();
        kotlin.jvm.internal.l.e(initializers, "initializers");
        o2.e[] eVarArr = (o2.e[]) initializers.toArray(new o2.e[0]);
        return new Za.d((o2.e[]) Arrays.copyOf(eVarArr, eVarArr.length));
    }

    public void c(HashMap values) {
        Object[] objArr;
        kotlin.jvm.internal.l.e(values, "values");
        for (Map.Entry entry : values.entrySet()) {
            String key = (String) entry.getKey();
            Object value = entry.getValue();
            kotlin.jvm.internal.l.e(key, "key");
            LinkedHashMap linkedHashMap = this.f17696a;
            if (value == null) {
                value = null;
            } else {
                kotlin.jvm.internal.e a9 = kotlin.jvm.internal.w.a(value.getClass());
                if (a9.equals(kotlin.jvm.internal.w.a(Boolean.TYPE)) ? true : a9.equals(kotlin.jvm.internal.w.a(Byte.TYPE)) ? true : a9.equals(kotlin.jvm.internal.w.a(Integer.TYPE)) ? true : a9.equals(kotlin.jvm.internal.w.a(Long.TYPE)) ? true : a9.equals(kotlin.jvm.internal.w.a(Float.TYPE)) ? true : a9.equals(kotlin.jvm.internal.w.a(Double.TYPE)) ? true : a9.equals(kotlin.jvm.internal.w.a(String.class)) ? true : a9.equals(kotlin.jvm.internal.w.a(Boolean[].class)) ? true : a9.equals(kotlin.jvm.internal.w.a(Byte[].class)) ? true : a9.equals(kotlin.jvm.internal.w.a(Integer[].class)) ? true : a9.equals(kotlin.jvm.internal.w.a(Long[].class)) ? true : a9.equals(kotlin.jvm.internal.w.a(Float[].class)) ? true : a9.equals(kotlin.jvm.internal.w.a(Double[].class)) ? true : a9.equals(kotlin.jvm.internal.w.a(String[].class))) {
                    continue;
                } else {
                    int i7 = 0;
                    if (a9.equals(kotlin.jvm.internal.w.a(boolean[].class))) {
                        boolean[] zArr = (boolean[]) value;
                        String str = l.f17700a;
                        int length = zArr.length;
                        objArr = new Boolean[length];
                        while (i7 < length) {
                            objArr[i7] = Boolean.valueOf(zArr[i7]);
                            i7++;
                        }
                    } else if (a9.equals(kotlin.jvm.internal.w.a(byte[].class))) {
                        byte[] bArr = (byte[]) value;
                        String str2 = l.f17700a;
                        int length2 = bArr.length;
                        objArr = new Byte[length2];
                        while (i7 < length2) {
                            objArr[i7] = Byte.valueOf(bArr[i7]);
                            i7++;
                        }
                    } else if (a9.equals(kotlin.jvm.internal.w.a(int[].class))) {
                        int[] iArr = (int[]) value;
                        String str3 = l.f17700a;
                        int length3 = iArr.length;
                        objArr = new Integer[length3];
                        while (i7 < length3) {
                            objArr[i7] = Integer.valueOf(iArr[i7]);
                            i7++;
                        }
                    } else if (a9.equals(kotlin.jvm.internal.w.a(long[].class))) {
                        long[] jArr = (long[]) value;
                        String str4 = l.f17700a;
                        int length4 = jArr.length;
                        objArr = new Long[length4];
                        while (i7 < length4) {
                            objArr[i7] = Long.valueOf(jArr[i7]);
                            i7++;
                        }
                    } else if (a9.equals(kotlin.jvm.internal.w.a(float[].class))) {
                        float[] fArr = (float[]) value;
                        String str5 = l.f17700a;
                        int length5 = fArr.length;
                        objArr = new Float[length5];
                        while (i7 < length5) {
                            objArr[i7] = Float.valueOf(fArr[i7]);
                            i7++;
                        }
                    } else {
                        if (!a9.equals(kotlin.jvm.internal.w.a(double[].class))) {
                            throw new IllegalArgumentException("Key " + key + " has invalid type " + a9);
                        }
                        double[] dArr = (double[]) value;
                        String str6 = l.f17700a;
                        int length6 = dArr.length;
                        objArr = new Double[length6];
                        while (i7 < length6) {
                            objArr[i7] = Double.valueOf(dArr[i7]);
                            i7++;
                        }
                    }
                    value = objArr;
                }
            }
            linkedHashMap.put(key, value);
        }
    }
}
