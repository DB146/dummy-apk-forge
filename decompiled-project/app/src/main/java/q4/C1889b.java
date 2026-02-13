package q4;

import android.media.MediaCodec;
import n5.D;

/* renamed from: q4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1889b {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f23440a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f23441b;

    /* renamed from: c, reason: collision with root package name */
    public int f23442c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f23443d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f23444e;

    /* renamed from: f, reason: collision with root package name */
    public int f23445f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public int f23446h;

    /* renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f23447i;
    public final ha.g j;

    public C1889b() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f23447i = cryptoInfo;
        this.j = D.f21141a >= 24 ? new ha.g(cryptoInfo) : null;
    }
}
