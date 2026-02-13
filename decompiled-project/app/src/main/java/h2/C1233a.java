package h2;

import A3.c;
import java.util.ArrayList;

/* renamed from: h2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1233a {

    /* renamed from: a, reason: collision with root package name */
    public final String f17639a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17640b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17641c;

    /* renamed from: d, reason: collision with root package name */
    public int f17642d;

    /* renamed from: e, reason: collision with root package name */
    public int f17643e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f17644f;
    public ArrayList g;

    public C1233a(String str) {
        this(str, false, true);
    }

    public C1233a(String str, boolean z8, boolean z10) {
        this.f17642d = 0;
        this.f17643e = 0;
        this.f17639a = str;
        this.f17640b = z8;
        this.f17641c = z10;
    }

    public final void a(C1234b c1234b) {
        if (this.f17644f == null) {
            this.f17644f = new ArrayList();
        }
        this.f17644f.add(c1234b);
    }

    public final void b(C1234b c1234b) {
        if (this.g == null) {
            this.g = new ArrayList();
        }
        this.g.add(c1234b);
    }

    public void c() {
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(this.f17639a);
        sb2.append(" ");
        return c.k(sb2, this.f17642d, "]");
    }
}
