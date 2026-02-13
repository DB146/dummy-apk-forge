package w4;

import C9.h;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import n5.v;

/* renamed from: w4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2216c extends h {

    /* renamed from: b, reason: collision with root package name */
    public long f25797b;

    /* renamed from: c, reason: collision with root package name */
    public long[] f25798c;

    /* renamed from: d, reason: collision with root package name */
    public long[] f25799d;

    public static Serializable K(int i7, v vVar) {
        if (i7 == 0) {
            return Double.valueOf(Double.longBitsToDouble(vVar.p()));
        }
        if (i7 == 1) {
            return Boolean.valueOf(vVar.v() == 1);
        }
        if (i7 == 2) {
            return M(vVar);
        }
        if (i7 != 3) {
            if (i7 == 8) {
                return L(vVar);
            }
            if (i7 != 10) {
                if (i7 != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(vVar.p()));
                vVar.H(2);
                return date;
            }
            int y10 = vVar.y();
            ArrayList arrayList = new ArrayList(y10);
            for (int i10 = 0; i10 < y10; i10++) {
                Serializable K10 = K(vVar.v(), vVar);
                if (K10 != null) {
                    arrayList.add(K10);
                }
            }
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String M3 = M(vVar);
            int v10 = vVar.v();
            if (v10 == 9) {
                return hashMap;
            }
            Serializable K11 = K(v10, vVar);
            if (K11 != null) {
                hashMap.put(M3, K11);
            }
        }
    }

    public static HashMap L(v vVar) {
        int y10 = vVar.y();
        HashMap hashMap = new HashMap(y10);
        for (int i7 = 0; i7 < y10; i7++) {
            String M3 = M(vVar);
            Serializable K10 = K(vVar.v(), vVar);
            if (K10 != null) {
                hashMap.put(M3, K10);
            }
        }
        return hashMap;
    }

    public static String M(v vVar) {
        int A10 = vVar.A();
        int i7 = vVar.f21230b;
        vVar.H(A10);
        return new String(vVar.f21229a, i7, A10);
    }
}
