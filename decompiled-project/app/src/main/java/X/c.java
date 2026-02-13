package X;

import Db.d;
import P1.g;
import com.google.ads.interactivemedia.v3.internal.zzaea;
import com.google.android.gms.internal.measurement.zzbk;
import com.google.android.gms.internal.measurement.zzh;
import com.google.android.gms.internal.measurement.zzll;
import com.google.android.gms.internal.pal.zzach;
import com.google.android.recaptcha.internal.zzln;
import com.google.crypto.tink.shaded.protobuf.C1016j;
import d8.C1056a;
import g9.j;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import x0.AbstractC2256a;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static /* synthetic */ String A(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? "null" : "DROP_LATEST" : "DROP_OLDEST" : "SUSPEND";
    }

    public static int a(int i7, int i10, int i11) {
        int i12 = i7 / i10;
        return i12 + i12 + i11;
    }

    public static int b(int i7, int i10, int i11, int i12) {
        return ((i7 * i10) / i11) + i12;
    }

    public static d c(String str) {
        AbstractC2256a.c(str);
        return new d(0);
    }

    public static Object d(zzbk zzbkVar, int i7, List list, int i10) {
        zzh.zza(zzbkVar.name(), i7, list);
        return list.get(i10);
    }

    public static String e(int i7, int i10, String str, String str2) {
        return str + i7 + str2 + i10;
    }

    public static String f(long j, String str, StringBuilder sb2) {
        sb2.append(j);
        sb2.append(str);
        return sb2.toString();
    }

    public static String g(Object obj, String str) {
        return str + obj;
    }

    public static String h(String str, String str2) {
        return str + str2;
    }

    public static String i(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String j(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String k(StringBuilder sb2, int i7, char c10) {
        sb2.append(i7);
        sb2.append(c10);
        return sb2.toString();
    }

    public static StringBuilder l(long j, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(j);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder m(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        return sb2;
    }

    public static StringBuilder n(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2;
    }

    public static HashMap o(Class cls, C1056a c1056a) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, c1056a);
        return hashMap;
    }

    public static Map p(HashMap hashMap) {
        return Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public static void q(int i7, HashMap hashMap, String str, int i10, String str2) {
        hashMap.put(str, j.b(i7));
        hashMap.put(str2, j.b(i10));
    }

    public static int r(int i7, int i10, int i11) {
        return zzaea.zzx(i7) + i10 + i11;
    }

    public static int s(int i7, int i10, int i11, int i12) {
        return zzaea.zzx(i7) + i10 + i11 + i12;
    }

    public static String t(String str, String str2) {
        return str + str2;
    }

    public static int u(int i7, int i10, int i11) {
        return zzll.zzz(i7) + i10 + i11;
    }

    public static int v(int i7, int i10, int i11, int i12) {
        return zzach.zzA(i7) + i10 + i11 + i12;
    }

    public static int w(int i7, int i10, int i11) {
        return zzach.zzA(i7) + i10 + i11;
    }

    public static int x(int i7, int i10, int i11, int i12) {
        return C1016j.r0(i7) + i10 + i11 + i12;
    }

    public static int y(int i7, int i10, int i11) {
        return zzln.zzA(i7) + i10 + i11;
    }

    public static /* synthetic */ String z(int i7) {
        switch (i7) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case g.BYTES_FIELD_NUMBER /* 8 */:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }
}
