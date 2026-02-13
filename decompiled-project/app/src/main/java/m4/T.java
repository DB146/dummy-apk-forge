package m4;

import android.net.Uri;
import ha.C1265a;
import java.util.Arrays;
import java.util.UUID;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class T implements InterfaceC1569g {

    /* renamed from: A, reason: collision with root package name */
    public static final String f20140A;

    /* renamed from: B, reason: collision with root package name */
    public static final String f20141B;

    /* renamed from: C, reason: collision with root package name */
    public static final String f20142C;

    /* renamed from: D, reason: collision with root package name */
    public static final String f20143D;

    /* renamed from: E, reason: collision with root package name */
    public static final C1265a f20144E;

    /* renamed from: w, reason: collision with root package name */
    public static final String f20145w;

    /* renamed from: x, reason: collision with root package name */
    public static final String f20146x;

    /* renamed from: y, reason: collision with root package name */
    public static final String f20147y;

    /* renamed from: z, reason: collision with root package name */
    public static final String f20148z;

    /* renamed from: a, reason: collision with root package name */
    public final UUID f20149a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f20150b;

    /* renamed from: c, reason: collision with root package name */
    public final N6.y0 f20151c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f20152d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f20153e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f20154f;

    /* renamed from: u, reason: collision with root package name */
    public final N6.H f20155u;

    /* renamed from: v, reason: collision with root package name */
    public final byte[] f20156v;

    static {
        int i7 = n5.D.f21141a;
        f20145w = Integer.toString(0, 36);
        f20146x = Integer.toString(1, 36);
        f20147y = Integer.toString(2, 36);
        f20148z = Integer.toString(3, 36);
        f20140A = Integer.toString(4, 36);
        f20141B = Integer.toString(5, 36);
        f20142C = Integer.toString(6, 36);
        f20143D = Integer.toString(7, 36);
        f20144E = new C1265a(20);
    }

    public T(S2.b bVar) {
        AbstractC1705a.m((bVar.f8985c && ((Uri) bVar.f8987e) == null) ? false : true);
        UUID uuid = (UUID) bVar.f8986d;
        uuid.getClass();
        this.f20149a = uuid;
        this.f20150b = (Uri) bVar.f8987e;
        this.f20151c = (N6.y0) bVar.f8988f;
        this.f20152d = bVar.f8983a;
        this.f20154f = bVar.f8985c;
        this.f20153e = bVar.f8984b;
        this.f20155u = (N6.H) bVar.g;
        byte[] bArr = (byte[]) bVar.f8989h;
        this.f20156v = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [S2.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Cloneable, byte[]] */
    public final S2.b a() {
        ?? obj = new Object();
        obj.f8986d = this.f20149a;
        obj.f8987e = this.f20150b;
        obj.f8988f = this.f20151c;
        obj.f8983a = this.f20152d;
        obj.f8984b = this.f20153e;
        obj.f8985c = this.f20154f;
        obj.g = this.f20155u;
        obj.f8989h = this.f20156v;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t5 = (T) obj;
        return this.f20149a.equals(t5.f20149a) && n5.D.a(this.f20150b, t5.f20150b) && n5.D.a(this.f20151c, t5.f20151c) && this.f20152d == t5.f20152d && this.f20154f == t5.f20154f && this.f20153e == t5.f20153e && this.f20155u.equals(t5.f20155u) && Arrays.equals(this.f20156v, t5.f20156v);
    }

    public final int hashCode() {
        int hashCode = this.f20149a.hashCode() * 31;
        Uri uri = this.f20150b;
        return Arrays.hashCode(this.f20156v) + ((this.f20155u.hashCode() + ((((((((this.f20151c.hashCode() + ((hashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.f20152d ? 1 : 0)) * 31) + (this.f20154f ? 1 : 0)) * 31) + (this.f20153e ? 1 : 0)) * 31)) * 31);
    }
}
