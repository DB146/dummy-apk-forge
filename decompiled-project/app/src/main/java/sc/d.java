package sc;

import java.io.IOException;
import kotlin.jvm.internal.l;
import rc.C1964h;
import rc.H;
import rc.q;

/* loaded from: classes2.dex */
public final class d extends q {

    /* renamed from: b, reason: collision with root package name */
    public final long f24364b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f24365c;

    /* renamed from: d, reason: collision with root package name */
    public long f24366d;

    public d(H h10, long j, boolean z8) {
        super(h10);
        this.f24364b = j;
        this.f24365c = z8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, rc.h] */
    @Override // rc.q, rc.H
    public final long O(long j, C1964h sink) {
        l.e(sink, "sink");
        long j10 = this.f24366d;
        long j11 = this.f24364b;
        if (j10 > j11) {
            j = 0;
        } else if (this.f24365c) {
            long j12 = j11 - j10;
            if (j12 == 0) {
                return -1L;
            }
            j = Math.min(j, j12);
        }
        long O10 = super.O(j, sink);
        if (O10 != -1) {
            this.f24366d += O10;
        }
        long j13 = this.f24366d;
        if ((j13 >= j11 || O10 != -1) && j13 <= j11) {
            return O10;
        }
        if (O10 > 0 && j13 > j11) {
            long j14 = sink.f23966b - (j13 - j11);
            ?? obj = new Object();
            obj.k0(sink);
            sink.m(j14, obj);
            obj.l();
        }
        StringBuilder l10 = X.c.l(j11, "expected ", " bytes but got ");
        l10.append(this.f24366d);
        throw new IOException(l10.toString());
    }
}
