package m5;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import n5.AbstractC1705a;

/* renamed from: m5.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1622t implements InterfaceC1616m {

    /* renamed from: a, reason: collision with root package name */
    public final Context f20659a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f20660b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1616m f20661c;

    /* renamed from: d, reason: collision with root package name */
    public y f20662d;

    /* renamed from: e, reason: collision with root package name */
    public C1606c f20663e;

    /* renamed from: f, reason: collision with root package name */
    public C1612i f20664f;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC1616m f20665u;

    /* renamed from: v, reason: collision with root package name */
    public V f20666v;

    /* renamed from: w, reason: collision with root package name */
    public C1614k f20667w;

    /* renamed from: x, reason: collision with root package name */
    public O f20668x;

    /* renamed from: y, reason: collision with root package name */
    public InterfaceC1616m f20669y;

    public C1622t(Context context, InterfaceC1616m interfaceC1616m) {
        this.f20659a = context.getApplicationContext();
        interfaceC1616m.getClass();
        this.f20661c = interfaceC1616m;
        this.f20660b = new ArrayList();
    }

    public static void c(InterfaceC1616m interfaceC1616m, T t5) {
        if (interfaceC1616m != null) {
            interfaceC1616m.a(t5);
        }
    }

    @Override // m5.InterfaceC1613j
    public final int D(byte[] bArr, int i7, int i10) {
        InterfaceC1616m interfaceC1616m = this.f20669y;
        interfaceC1616m.getClass();
        return interfaceC1616m.D(bArr, i7, i10);
    }

    @Override // m5.InterfaceC1616m
    public final void a(T t5) {
        t5.getClass();
        this.f20661c.a(t5);
        this.f20660b.add(t5);
        c(this.f20662d, t5);
        c(this.f20663e, t5);
        c(this.f20664f, t5);
        c(this.f20665u, t5);
        c(this.f20666v, t5);
        c(this.f20667w, t5);
        c(this.f20668x, t5);
    }

    public final void b(InterfaceC1616m interfaceC1616m) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f20660b;
            if (i7 >= arrayList.size()) {
                return;
            }
            interfaceC1616m.a((T) arrayList.get(i7));
            i7++;
        }
    }

    @Override // m5.InterfaceC1616m
    public final void close() {
        InterfaceC1616m interfaceC1616m = this.f20669y;
        if (interfaceC1616m != null) {
            try {
                interfaceC1616m.close();
            } finally {
                this.f20669y = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [m5.g, m5.m, m5.k] */
    /* JADX WARN: Type inference failed for: r0v8, types: [m5.y, m5.g, m5.m] */
    @Override // m5.InterfaceC1616m
    public final long d(C1619p c1619p) {
        AbstractC1705a.m(this.f20669y == null);
        String scheme = c1619p.f20628a.getScheme();
        int i7 = n5.D.f21141a;
        Uri uri = c1619p.f20628a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f20659a;
        if (isEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f20662d == null) {
                    ?? abstractC1610g = new AbstractC1610g(false);
                    this.f20662d = abstractC1610g;
                    b(abstractC1610g);
                }
                this.f20669y = this.f20662d;
            } else {
                if (this.f20663e == null) {
                    C1606c c1606c = new C1606c(context);
                    this.f20663e = c1606c;
                    b(c1606c);
                }
                this.f20669y = this.f20663e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f20663e == null) {
                C1606c c1606c2 = new C1606c(context);
                this.f20663e = c1606c2;
                b(c1606c2);
            }
            this.f20669y = this.f20663e;
        } else if ("content".equals(scheme)) {
            if (this.f20664f == null) {
                C1612i c1612i = new C1612i(context);
                this.f20664f = c1612i;
                b(c1612i);
            }
            this.f20669y = this.f20664f;
        } else {
            boolean equals = "rtmp".equals(scheme);
            InterfaceC1616m interfaceC1616m = this.f20661c;
            if (equals) {
                if (this.f20665u == null) {
                    try {
                        InterfaceC1616m interfaceC1616m2 = (InterfaceC1616m) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.f20665u = interfaceC1616m2;
                        b(interfaceC1616m2);
                    } catch (ClassNotFoundException unused) {
                        AbstractC1705a.S("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e2) {
                        throw new RuntimeException("Error instantiating RTMP extension", e2);
                    }
                    if (this.f20665u == null) {
                        this.f20665u = interfaceC1616m;
                    }
                }
                this.f20669y = this.f20665u;
            } else if ("udp".equals(scheme)) {
                if (this.f20666v == null) {
                    V v10 = new V(2000, 8000);
                    this.f20666v = v10;
                    b(v10);
                }
                this.f20669y = this.f20666v;
            } else if ("data".equals(scheme)) {
                if (this.f20667w == null) {
                    ?? abstractC1610g2 = new AbstractC1610g(false);
                    this.f20667w = abstractC1610g2;
                    b(abstractC1610g2);
                }
                this.f20669y = this.f20667w;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f20668x == null) {
                    O o10 = new O(context);
                    this.f20668x = o10;
                    b(o10);
                }
                this.f20669y = this.f20668x;
            } else {
                this.f20669y = interfaceC1616m;
            }
        }
        return this.f20669y.d(c1619p);
    }

    @Override // m5.InterfaceC1616m
    public final Map n() {
        InterfaceC1616m interfaceC1616m = this.f20669y;
        return interfaceC1616m == null ? Collections.emptyMap() : interfaceC1616m.n();
    }

    @Override // m5.InterfaceC1616m
    public final Uri w() {
        InterfaceC1616m interfaceC1616m = this.f20669y;
        if (interfaceC1616m == null) {
            return null;
        }
        return interfaceC1616m.w();
    }
}
