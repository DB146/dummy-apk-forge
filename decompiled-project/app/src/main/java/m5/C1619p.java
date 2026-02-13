package m5;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import m4.AbstractC1556J;
import n5.AbstractC1705a;

/* renamed from: m5.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1619p {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f20627i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f20628a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20629b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f20630c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f20631d;

    /* renamed from: e, reason: collision with root package name */
    public final long f20632e;

    /* renamed from: f, reason: collision with root package name */
    public final long f20633f;
    public final String g;

    /* renamed from: h, reason: collision with root package name */
    public final int f20634h;

    static {
        AbstractC1556J.a("goog.exo.datasource");
    }

    public C1619p(Uri uri, int i7, byte[] bArr, Map map, long j, long j10, String str, int i10) {
        AbstractC1705a.h(j >= 0);
        AbstractC1705a.h(j >= 0);
        AbstractC1705a.h(j10 > 0 || j10 == -1);
        this.f20628a = uri;
        this.f20629b = i7;
        this.f20630c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f20631d = Collections.unmodifiableMap(new HashMap(map));
        this.f20632e = j;
        this.f20633f = j10;
        this.g = str;
        this.f20634h = i10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, D4.c] */
    public final D4.c a() {
        ?? obj = new Object();
        obj.f3215e = this.f20628a;
        obj.f3211a = this.f20629b;
        obj.f3216f = this.f20630c;
        obj.g = this.f20631d;
        obj.f3212b = this.f20632e;
        obj.f3213c = this.f20633f;
        obj.f3217h = this.g;
        obj.f3214d = this.f20634h;
        return obj;
    }

    public final C1619p b(long j) {
        long j10 = this.f20633f;
        long j11 = j10 != -1 ? j10 - j : -1L;
        if (j == 0 && j10 == j11) {
            return this;
        }
        return new C1619p(this.f20628a, this.f20629b, this.f20630c, this.f20631d, this.f20632e + j, j11, this.g, this.f20634h);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        int i7 = this.f20629b;
        if (i7 == 1) {
            str = "GET";
        } else if (i7 == 2) {
            str = "POST";
        } else {
            if (i7 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        sb2.append(str);
        sb2.append(" ");
        sb2.append(this.f20628a);
        sb2.append(", ");
        sb2.append(this.f20632e);
        sb2.append(", ");
        sb2.append(this.f20633f);
        sb2.append(", ");
        sb2.append(this.g);
        sb2.append(", ");
        return A3.c.k(sb2, this.f20634h, "]");
    }
}
