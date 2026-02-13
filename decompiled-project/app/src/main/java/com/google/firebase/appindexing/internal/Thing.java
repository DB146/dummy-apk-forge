package com.google.firebase.appindexing.internal;

import G5.a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.appindex.zzat;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import m7.C1636b;
import m7.g;
import m7.h;
import s5.e;

/* loaded from: classes.dex */
public final class Thing extends a implements e, ReflectedParcelable {
    public static final Parcelable.Creator<Thing> CREATOR = new C1636b(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f15823a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f15824b;

    /* renamed from: c, reason: collision with root package name */
    public final h f15825c;

    /* renamed from: d, reason: collision with root package name */
    public final String f15826d;

    /* renamed from: e, reason: collision with root package name */
    public final String f15827e;

    public Thing(int i7, Bundle bundle, h hVar, String str, String str2) {
        this.f15823a = i7;
        this.f15824b = bundle;
        this.f15825c = hVar;
        this.f15826d = str;
        this.f15827e = str2;
        ClassLoader classLoader = Thing.class.getClassLoader();
        zzat.zza(classLoader);
        bundle.setClassLoader(classLoader);
    }

    public Thing(Bundle bundle, h hVar, String str, String str2) {
        this.f15823a = 10;
        this.f15824b = bundle;
        this.f15825c = hVar;
        this.f15826d = str;
        this.f15827e = str2;
    }

    public static boolean C(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle) && !C((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
            if (obj == null) {
                if (obj2 != null || !bundle2.containsKey(str)) {
                    return false;
                }
                obj2 = null;
            }
            if (obj instanceof boolean[]) {
                if (!(obj2 instanceof boolean[]) || !Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                    return false;
                }
            } else if (obj instanceof long[]) {
                if (!(obj2 instanceof long[]) || !Arrays.equals((long[]) obj, (long[]) obj2)) {
                    return false;
                }
            } else if (obj instanceof double[]) {
                if (!(obj2 instanceof double[]) || !Arrays.equals((double[]) obj, (double[]) obj2)) {
                    return false;
                }
            } else if (obj instanceof byte[]) {
                if (!(obj2 instanceof byte[]) || !Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                    return false;
                }
            } else if ((obj instanceof Object[]) && (!(obj2 instanceof Object[]) || !Arrays.equals((Object[]) obj, (Object[]) obj2))) {
                return false;
            }
        }
        return true;
    }

    public static int t(Bundle bundle) {
        ArrayList arrayList = new ArrayList(bundle.keySet());
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            Object obj = bundle.get((String) arrayList.get(i7));
            if (obj instanceof boolean[]) {
                arrayList2.add(Integer.valueOf(Arrays.hashCode((boolean[]) obj)));
            } else if (obj instanceof long[]) {
                arrayList2.add(Integer.valueOf(Arrays.hashCode((long[]) obj)));
            } else if (obj instanceof double[]) {
                arrayList2.add(Integer.valueOf(Arrays.hashCode((double[]) obj)));
            } else if (obj instanceof byte[]) {
                arrayList2.add(Integer.valueOf(Arrays.hashCode((byte[]) obj)));
            } else if (obj instanceof Object[]) {
                arrayList2.add(Integer.valueOf(Arrays.hashCode((Object[]) obj)));
            } else {
                arrayList2.add(Integer.valueOf(Arrays.hashCode(new Object[]{obj})));
            }
        }
        return Arrays.hashCode(arrayList2.toArray());
    }

    public static void z(Bundle bundle, StringBuilder sb2) {
        try {
            Set<String> keySet = bundle.keySet();
            String[] strArr = (String[]) keySet.toArray(new String[keySet.size()]);
            Arrays.sort(strArr, g.f20764a);
            for (String str : strArr) {
                sb2.append("{ key: '");
                sb2.append(str);
                sb2.append("' value: ");
                Object obj = bundle.get(str);
                if (obj == null) {
                    sb2.append("<null>");
                } else if (obj.getClass().isArray()) {
                    sb2.append("[ ");
                    for (int i7 = 0; i7 < Array.getLength(obj); i7++) {
                        sb2.append("'");
                        sb2.append(Array.get(obj, i7));
                        sb2.append("' ");
                    }
                    sb2.append("]");
                } else {
                    sb2.append(obj);
                }
                sb2.append(" } ");
            }
        } catch (RuntimeException unused) {
            sb2.append("<error>");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Thing)) {
            return false;
        }
        Thing thing = (Thing) obj;
        return G.k(Integer.valueOf(this.f15823a), Integer.valueOf(thing.f15823a)) && G.k(this.f15826d, thing.f15826d) && G.k(this.f15827e, thing.f15827e) && G.k(this.f15825c, thing.f15825c) && C(this.f15824b, thing.f15824b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15823a), this.f15826d, this.f15827e, Integer.valueOf(this.f15825c.hashCode()), Integer.valueOf(t(this.f15824b))});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.f15827e;
        if (str.equals("Thing")) {
            str = "Indexable";
        }
        sb2.append(str);
        sb2.append(" { { id: ");
        String str2 = this.f15826d;
        if (str2 == null) {
            sb2.append("<null>");
        } else {
            sb2.append("'");
            sb2.append(str2);
            sb2.append("'");
        }
        sb2.append(" } Properties { ");
        z(this.f15824b, sb2);
        sb2.append("} Metadata { ");
        sb2.append(this.f15825c);
        sb2.append(" } }");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = d.M(20293, parcel);
        d.z(parcel, 1, this.f15824b, false);
        d.G(parcel, 2, this.f15825c, i7, false);
        d.H(parcel, 3, this.f15826d, false);
        d.H(parcel, 4, this.f15827e, false);
        d.O(parcel, 1000, 4);
        parcel.writeInt(this.f15823a);
        d.N(M3, parcel);
    }
}
