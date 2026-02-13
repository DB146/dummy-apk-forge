package E4;

import m4.L;

/* loaded from: classes.dex */
public final class o extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final String f3588a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3589b;

    /* renamed from: c, reason: collision with root package name */
    public final m f3590c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3591d;

    public o(String str, Throwable th, String str2, boolean z8, m mVar, String str3) {
        super(str, th);
        this.f3588a = str2;
        this.f3589b = z8;
        this.f3590c = mVar;
        this.f3591d = str3;
    }

    public o(L l10, u uVar, boolean z8, int i7) {
        this("Decoder init failed: [" + i7 + "], " + l10, uVar, l10.f20096z, z8, null, "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + (i7 < 0 ? "neg_" : "") + Math.abs(i7));
    }
}
