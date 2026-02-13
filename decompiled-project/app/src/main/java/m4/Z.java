package m4;

import android.net.Uri;
import ha.C1265a;

/* loaded from: classes.dex */
public class Z implements InterfaceC1569g {

    /* renamed from: A, reason: collision with root package name */
    public static final String f20197A;

    /* renamed from: B, reason: collision with root package name */
    public static final String f20198B;

    /* renamed from: C, reason: collision with root package name */
    public static final C1265a f20199C;

    /* renamed from: v, reason: collision with root package name */
    public static final String f20200v;

    /* renamed from: w, reason: collision with root package name */
    public static final String f20201w;

    /* renamed from: x, reason: collision with root package name */
    public static final String f20202x;

    /* renamed from: y, reason: collision with root package name */
    public static final String f20203y;

    /* renamed from: z, reason: collision with root package name */
    public static final String f20204z;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f20205a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20206b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20207c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20208d;

    /* renamed from: e, reason: collision with root package name */
    public final int f20209e;

    /* renamed from: f, reason: collision with root package name */
    public final String f20210f;

    /* renamed from: u, reason: collision with root package name */
    public final String f20211u;

    static {
        int i7 = n5.D.f21141a;
        f20200v = Integer.toString(0, 36);
        f20201w = Integer.toString(1, 36);
        f20202x = Integer.toString(2, 36);
        f20203y = Integer.toString(3, 36);
        f20204z = Integer.toString(4, 36);
        f20197A = Integer.toString(5, 36);
        f20198B = Integer.toString(6, 36);
        f20199C = new C1265a(25);
    }

    public Z(Y y10) {
        this.f20205a = (Uri) y10.f20194d;
        this.f20206b = y10.f20191a;
        this.f20207c = (String) y10.f20195e;
        this.f20208d = y10.f20192b;
        this.f20209e = y10.f20193c;
        this.f20210f = (String) y10.f20196f;
        this.f20211u = (String) y10.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z8 = (Z) obj;
        return this.f20205a.equals(z8.f20205a) && n5.D.a(this.f20206b, z8.f20206b) && n5.D.a(this.f20207c, z8.f20207c) && this.f20208d == z8.f20208d && this.f20209e == z8.f20209e && n5.D.a(this.f20210f, z8.f20210f) && n5.D.a(this.f20211u, z8.f20211u);
    }

    public final int hashCode() {
        int hashCode = this.f20205a.hashCode() * 31;
        String str = this.f20206b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20207c;
        int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f20208d) * 31) + this.f20209e) * 31;
        String str3 = this.f20210f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f20211u;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }
}
