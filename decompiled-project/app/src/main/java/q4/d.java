package q4;

import h3.o;
import java.util.Locale;
import n5.D;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int f23448a;

    /* renamed from: b, reason: collision with root package name */
    public int f23449b;

    /* renamed from: c, reason: collision with root package name */
    public int f23450c;

    /* renamed from: d, reason: collision with root package name */
    public int f23451d;

    /* renamed from: e, reason: collision with root package name */
    public int f23452e;

    /* renamed from: f, reason: collision with root package name */
    public int f23453f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public int f23454h;

    /* renamed from: i, reason: collision with root package name */
    public int f23455i;
    public int j;
    public long k;

    /* renamed from: l, reason: collision with root package name */
    public int f23456l;

    public final String toString() {
        int i7 = this.f23448a;
        int i10 = this.f23449b;
        int i11 = this.f23450c;
        int i12 = this.f23451d;
        int i13 = this.f23452e;
        int i14 = this.f23453f;
        int i15 = this.g;
        int i16 = this.f23454h;
        int i17 = this.f23455i;
        int i18 = this.j;
        long j = this.k;
        int i19 = this.f23456l;
        int i20 = D.f21141a;
        Locale locale = Locale.US;
        StringBuilder q10 = o.q(i7, i10, "DecoderCounters {\n decoderInits=", ",\n decoderReleases=", "\n queuedInputBuffers=");
        q10.append(i11);
        q10.append("\n skippedInputBuffers=");
        q10.append(i12);
        q10.append("\n renderedOutputBuffers=");
        q10.append(i13);
        q10.append("\n skippedOutputBuffers=");
        q10.append(i14);
        q10.append("\n droppedBuffers=");
        q10.append(i15);
        q10.append("\n droppedInputBuffers=");
        q10.append(i16);
        q10.append("\n maxConsecutiveDroppedBuffers=");
        q10.append(i17);
        q10.append("\n droppedToKeyframeEvents=");
        q10.append(i18);
        q10.append("\n totalVideoFrameProcessingOffsetUs=");
        q10.append(j);
        q10.append("\n videoFrameProcessingOffsetCount=");
        q10.append(i19);
        q10.append("\n}");
        return q10.toString();
    }
}
