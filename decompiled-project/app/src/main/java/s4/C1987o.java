package s4;

import ea.C1112g;
import java.util.Collections;
import m4.K;
import m4.L;
import n5.D;

/* renamed from: s4.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1987o {

    /* renamed from: a, reason: collision with root package name */
    public final int f24068a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24069b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24070c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24071d;

    /* renamed from: e, reason: collision with root package name */
    public final int f24072e;

    /* renamed from: f, reason: collision with root package name */
    public final int f24073f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final int f24074h;

    /* renamed from: i, reason: collision with root package name */
    public final int f24075i;
    public final long j;
    public final C1112g k;

    /* renamed from: l, reason: collision with root package name */
    public final F4.c f24076l;

    public C1987o(int i7, int i10, int i11, int i12, int i13, int i14, int i15, long j, C1112g c1112g, F4.c cVar) {
        this.f24068a = i7;
        this.f24069b = i10;
        this.f24070c = i11;
        this.f24071d = i12;
        this.f24072e = i13;
        this.f24073f = d(i13);
        this.g = i14;
        this.f24074h = i15;
        this.f24075i = a(i15);
        this.j = j;
        this.k = c1112g;
        this.f24076l = cVar;
    }

    public C1987o(byte[] bArr, int i7) {
        b5.f fVar = new b5.f(bArr, bArr.length);
        fVar.p(i7 * 8);
        this.f24068a = fVar.i(16);
        this.f24069b = fVar.i(16);
        this.f24070c = fVar.i(24);
        this.f24071d = fVar.i(24);
        int i10 = fVar.i(20);
        this.f24072e = i10;
        this.f24073f = d(i10);
        this.g = fVar.i(3) + 1;
        int i11 = fVar.i(5) + 1;
        this.f24074h = i11;
        this.f24075i = a(i11);
        int i12 = fVar.i(4);
        int i13 = fVar.i(32);
        int i14 = D.f21141a;
        this.j = ((i12 & 4294967295L) << 32) | (i13 & 4294967295L);
        this.k = null;
        this.f24076l = null;
    }

    public static int a(int i7) {
        if (i7 == 8) {
            return 1;
        }
        if (i7 == 12) {
            return 2;
        }
        if (i7 == 16) {
            return 4;
        }
        if (i7 != 20) {
            return i7 != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int d(int i7) {
        switch (i7) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.f24072e;
    }

    public final L c(byte[] bArr, F4.c cVar) {
        bArr[4] = Byte.MIN_VALUE;
        int i7 = this.f24071d;
        if (i7 <= 0) {
            i7 = -1;
        }
        F4.c cVar2 = this.f24076l;
        if (cVar2 != null) {
            cVar = cVar == null ? cVar2 : cVar2.a(cVar.f4071a);
        }
        K k = new K();
        k.k = "audio/flac";
        k.f19984l = i7;
        k.f19996x = this.g;
        k.f19997y = this.f24072e;
        k.f19985m = Collections.singletonList(bArr);
        k.f19983i = cVar;
        return new L(k);
    }
}
