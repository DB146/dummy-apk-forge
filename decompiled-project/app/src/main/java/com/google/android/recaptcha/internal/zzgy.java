package com.google.android.recaptcha.internal;

import Eb.n;
import Eb.p;
import Eb.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.l;
import y7.u0;

/* loaded from: classes.dex */
public final class zzgy implements zzgx {
    public static final zzgy zza = new zzgy();

    private zzgy() {
    }

    private static final List zzc(Object obj) {
        boolean z8 = obj instanceof byte[];
        v vVar = v.f3891a;
        int i7 = 0;
        if (z8) {
            byte[] bArr = (byte[]) obj;
            l.e(bArr, "<this>");
            int length = bArr.length;
            if (length == 0) {
                return vVar;
            }
            if (length == 1) {
                return u0.x(Byte.valueOf(bArr[0]));
            }
            ArrayList arrayList = new ArrayList(bArr.length);
            int length2 = bArr.length;
            while (i7 < length2) {
                arrayList.add(Byte.valueOf(bArr[i7]));
                i7++;
            }
            return arrayList;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            l.e(sArr, "<this>");
            int length3 = sArr.length;
            if (length3 == 0) {
                return vVar;
            }
            if (length3 == 1) {
                return u0.x(Short.valueOf(sArr[0]));
            }
            ArrayList arrayList2 = new ArrayList(sArr.length);
            int length4 = sArr.length;
            while (i7 < length4) {
                arrayList2.add(Short.valueOf(sArr[i7]));
                i7++;
            }
            return arrayList2;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            l.e(iArr, "<this>");
            int length5 = iArr.length;
            if (length5 == 0) {
                return vVar;
            }
            if (length5 == 1) {
                return u0.x(Integer.valueOf(iArr[0]));
            }
            ArrayList arrayList3 = new ArrayList(iArr.length);
            int length6 = iArr.length;
            while (i7 < length6) {
                arrayList3.add(Integer.valueOf(iArr[i7]));
                i7++;
            }
            return arrayList3;
        }
        if (obj instanceof long[]) {
            return n.d0((long[]) obj);
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            l.e(fArr, "<this>");
            int length7 = fArr.length;
            if (length7 == 0) {
                return vVar;
            }
            if (length7 == 1) {
                return u0.x(Float.valueOf(fArr[0]));
            }
            ArrayList arrayList4 = new ArrayList(fArr.length);
            int length8 = fArr.length;
            while (i7 < length8) {
                arrayList4.add(Float.valueOf(fArr[i7]));
                i7++;
            }
            return arrayList4;
        }
        if (!(obj instanceof double[])) {
            return null;
        }
        double[] dArr = (double[]) obj;
        l.e(dArr, "<this>");
        int length9 = dArr.length;
        if (length9 == 0) {
            return vVar;
        }
        if (length9 == 1) {
            return u0.x(Double.valueOf(dArr[0]));
        }
        ArrayList arrayList5 = new ArrayList(dArr.length);
        int length10 = dArr.length;
        while (i7 < length10) {
            arrayList5.add(Double.valueOf(dArr[i7]));
            i7++;
        }
        return arrayList5;
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i7, zzgd zzgdVar, zzue... zzueVarArr) {
        if (zzueVarArr.length != 2) {
            throw new zzce(4, 3, null);
        }
        Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != Objects.nonNull(zza2)) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzce(4, 5, null);
        }
        Object zza3 = zzgdVar.zzc().zza(zzueVarArr[1]);
        if (true != Objects.nonNull(zza3)) {
            zza3 = null;
        }
        if (zza3 == null) {
            throw new zzce(4, 5, null);
        }
        zzgdVar.zzc().zze(i7, zzb(zza2, zza3));
    }

    public final Object zzb(Object obj, Object obj2) {
        List zzc = zzc(obj);
        List zzc2 = zzc(obj2);
        if (obj instanceof Number) {
            if (obj2 instanceof Number) {
                return Double.valueOf(Math.pow(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()));
            }
            if (zzc2 != null) {
                ArrayList arrayList = new ArrayList(p.S(zzc2, 10));
                Iterator it = zzc2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Double.valueOf(Math.pow(((Number) it.next()).doubleValue(), ((Number) obj).doubleValue())));
                }
                return arrayList.toArray(new Double[0]);
            }
        }
        if (zzc != null && (obj2 instanceof Number)) {
            ArrayList arrayList2 = new ArrayList(p.S(zzc, 10));
            Iterator it2 = zzc.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Double.valueOf(Math.pow(((Number) it2.next()).doubleValue(), ((Number) obj2).doubleValue())));
            }
            return arrayList2.toArray(new Double[0]);
        }
        if (zzc == null || zzc2 == null) {
            throw new zzce(4, 5, null);
        }
        zzgw.zza(this, zzc.size(), zzc2.size());
        int size = zzc.size();
        Double[] dArr = new Double[size];
        for (int i7 = 0; i7 < size; i7++) {
            dArr[i7] = Double.valueOf(Math.pow(((Number) zzc.get(i7)).doubleValue(), ((Number) zzc2.get(i7)).doubleValue()));
        }
        return dArr;
    }
}
