package m4;

import android.net.Uri;
import ha.C1265a;
import java.util.List;

/* loaded from: classes.dex */
public final class V implements InterfaceC1569g {

    /* renamed from: A, reason: collision with root package name */
    public static final String f20169A;

    /* renamed from: B, reason: collision with root package name */
    public static final String f20170B;

    /* renamed from: C, reason: collision with root package name */
    public static final C1265a f20171C;

    /* renamed from: v, reason: collision with root package name */
    public static final String f20172v;

    /* renamed from: w, reason: collision with root package name */
    public static final String f20173w;

    /* renamed from: x, reason: collision with root package name */
    public static final String f20174x;

    /* renamed from: y, reason: collision with root package name */
    public static final String f20175y;

    /* renamed from: z, reason: collision with root package name */
    public static final String f20176z;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f20177a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20178b;

    /* renamed from: c, reason: collision with root package name */
    public final T f20179c;

    /* renamed from: d, reason: collision with root package name */
    public final O f20180d;

    /* renamed from: e, reason: collision with root package name */
    public final List f20181e;

    /* renamed from: f, reason: collision with root package name */
    public final String f20182f;

    /* renamed from: u, reason: collision with root package name */
    public final N6.H f20183u;

    static {
        int i7 = n5.D.f21141a;
        f20172v = Integer.toString(0, 36);
        f20173w = Integer.toString(1, 36);
        f20174x = Integer.toString(2, 36);
        f20175y = Integer.toString(3, 36);
        f20176z = Integer.toString(4, 36);
        f20169A = Integer.toString(5, 36);
        f20170B = Integer.toString(6, 36);
        f20171C = new C1265a(22);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [m4.Y, java.lang.Object] */
    public V(Uri uri, String str, T t5, O o10, List list, String str2, N6.H h10) {
        this.f20177a = uri;
        this.f20178b = str;
        this.f20179c = t5;
        this.f20180d = o10;
        this.f20181e = list;
        this.f20182f = str2;
        this.f20183u = h10;
        N6.E E10 = N6.H.E();
        for (int i7 = 0; i7 < h10.size(); i7++) {
            Z z8 = (Z) h10.get(i7);
            ?? obj = new Object();
            obj.f20194d = z8.f20205a;
            obj.f20191a = z8.f20206b;
            obj.f20195e = z8.f20207c;
            obj.f20192b = z8.f20208d;
            obj.f20193c = z8.f20209e;
            obj.f20196f = z8.f20210f;
            obj.g = z8.f20211u;
            E10.d(new Z(obj));
        }
        E10.h();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v10 = (V) obj;
        return this.f20177a.equals(v10.f20177a) && n5.D.a(this.f20178b, v10.f20178b) && n5.D.a(this.f20179c, v10.f20179c) && n5.D.a(this.f20180d, v10.f20180d) && this.f20181e.equals(v10.f20181e) && n5.D.a(this.f20182f, v10.f20182f) && this.f20183u.equals(v10.f20183u) && n5.D.a(null, null);
    }

    public final int hashCode() {
        int hashCode = this.f20177a.hashCode() * 31;
        String str = this.f20178b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        T t5 = this.f20179c;
        int hashCode3 = (hashCode2 + (t5 == null ? 0 : t5.hashCode())) * 31;
        O o10 = this.f20180d;
        int hashCode4 = (this.f20181e.hashCode() + ((hashCode3 + (o10 == null ? 0 : o10.hashCode())) * 31)) * 31;
        String str2 = this.f20182f;
        return (this.f20183u.hashCode() + ((hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31;
    }
}
