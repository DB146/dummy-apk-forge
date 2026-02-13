package y7;

import java.util.List;

/* renamed from: y7.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2411C {

    /* renamed from: a, reason: collision with root package name */
    public int f27100a;

    /* renamed from: b, reason: collision with root package name */
    public String f27101b;

    /* renamed from: c, reason: collision with root package name */
    public int f27102c;

    /* renamed from: d, reason: collision with root package name */
    public int f27103d;

    /* renamed from: e, reason: collision with root package name */
    public long f27104e;

    /* renamed from: f, reason: collision with root package name */
    public long f27105f;
    public long g;

    /* renamed from: h, reason: collision with root package name */
    public String f27106h;

    /* renamed from: i, reason: collision with root package name */
    public List f27107i;
    public byte j;

    public final C2412D a() {
        String str;
        if (this.j == 63 && (str = this.f27101b) != null) {
            return new C2412D(this.f27100a, str, this.f27102c, this.f27103d, this.f27104e, this.f27105f, this.g, this.f27106h, this.f27107i);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.j & 1) == 0) {
            sb2.append(" pid");
        }
        if (this.f27101b == null) {
            sb2.append(" processName");
        }
        if ((this.j & 2) == 0) {
            sb2.append(" reasonCode");
        }
        if ((this.j & 4) == 0) {
            sb2.append(" importance");
        }
        if ((this.j & 8) == 0) {
            sb2.append(" pss");
        }
        if ((this.j & 16) == 0) {
            sb2.append(" rss");
        }
        if ((this.j & 32) == 0) {
            sb2.append(" timestamp");
        }
        throw new IllegalStateException(h3.o.o("Missing required properties:", sb2));
    }
}
