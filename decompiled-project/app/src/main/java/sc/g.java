package sc;

import java.util.ArrayList;
import kotlin.jvm.internal.l;
import rc.z;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final z f24372a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f24373b;

    /* renamed from: c, reason: collision with root package name */
    public final String f24374c;

    /* renamed from: d, reason: collision with root package name */
    public final long f24375d;

    /* renamed from: e, reason: collision with root package name */
    public final long f24376e;

    /* renamed from: f, reason: collision with root package name */
    public final long f24377f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final long f24378h;

    /* renamed from: i, reason: collision with root package name */
    public final int f24379i;
    public final int j;
    public final Long k;

    /* renamed from: l, reason: collision with root package name */
    public final Long f24380l;

    /* renamed from: m, reason: collision with root package name */
    public final Long f24381m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f24382n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f24383o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f24384p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f24385q;

    public /* synthetic */ g(z zVar, boolean z8, String str, long j, long j10, long j11, int i7, long j12, int i10, int i11, Long l10, Long l11, Long l12, int i12) {
        this(zVar, z8, (i12 & 4) != 0 ? "" : str, (i12 & 8) != 0 ? -1L : j, (i12 & 16) != 0 ? -1L : j10, (i12 & 32) != 0 ? -1L : j11, (i12 & 64) != 0 ? -1 : i7, (i12 & 128) != 0 ? -1L : j12, (i12 & 256) != 0 ? -1 : i10, (i12 & 512) != 0 ? -1 : i11, (i12 & 1024) != 0 ? null : l10, (i12 & 2048) != 0 ? null : l11, (i12 & 4096) != 0 ? null : l12, null, null, null);
    }

    public g(z canonicalPath, boolean z8, String comment, long j, long j10, long j11, int i7, long j12, int i10, int i11, Long l10, Long l11, Long l12, Integer num, Integer num2, Integer num3) {
        l.e(canonicalPath, "canonicalPath");
        l.e(comment, "comment");
        this.f24372a = canonicalPath;
        this.f24373b = z8;
        this.f24374c = comment;
        this.f24375d = j;
        this.f24376e = j10;
        this.f24377f = j11;
        this.g = i7;
        this.f24378h = j12;
        this.f24379i = i10;
        this.j = i11;
        this.k = l10;
        this.f24380l = l11;
        this.f24381m = l12;
        this.f24382n = num;
        this.f24383o = num2;
        this.f24384p = num3;
        this.f24385q = new ArrayList();
    }
}
