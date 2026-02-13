package A9;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import m5.C1621s;
import n5.AbstractC1705a;
import q4.C1889b;

/* renamed from: A9.v0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0146v0 implements E4.j {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1428a;

    /* renamed from: b, reason: collision with root package name */
    public int f1429b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1430c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1431d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1432e;

    public C0146v0(Context context) {
        String O10;
        TelephonyManager telephonyManager;
        this.f1430c = context == null ? null : context.getApplicationContext();
        int i7 = n5.D.f21141a;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                O10 = y7.u0.O(networkCountryIso);
                int[] a9 = C1621s.a(O10);
                HashMap hashMap = new HashMap(8);
                hashMap.put(0, 1000000L);
                N6.t0 t0Var = C1621s.f20642n;
                hashMap.put(2, (Long) t0Var.get(a9[0]));
                hashMap.put(3, (Long) C1621s.f20643o.get(a9[1]));
                hashMap.put(4, (Long) C1621s.f20644p.get(a9[2]));
                hashMap.put(5, (Long) C1621s.f20645q.get(a9[3]));
                hashMap.put(10, (Long) C1621s.f20646r.get(a9[4]));
                hashMap.put(9, (Long) C1621s.f20647s.get(a9[5]));
                hashMap.put(7, (Long) t0Var.get(a9[0]));
                this.f1431d = hashMap;
                this.f1429b = 2000;
                this.f1432e = n5.x.f21235a;
                this.f1428a = true;
            }
        }
        O10 = y7.u0.O(Locale.getDefault().getCountry());
        int[] a92 = C1621s.a(O10);
        HashMap hashMap2 = new HashMap(8);
        hashMap2.put(0, 1000000L);
        N6.t0 t0Var2 = C1621s.f20642n;
        hashMap2.put(2, (Long) t0Var2.get(a92[0]));
        hashMap2.put(3, (Long) C1621s.f20643o.get(a92[1]));
        hashMap2.put(4, (Long) C1621s.f20644p.get(a92[2]));
        hashMap2.put(5, (Long) C1621s.f20645q.get(a92[3]));
        hashMap2.put(10, (Long) C1621s.f20646r.get(a92[4]));
        hashMap2.put(9, (Long) C1621s.f20647s.get(a92[5]));
        hashMap2.put(7, (Long) t0Var2.get(a92[0]));
        this.f1431d = hashMap2;
        this.f1429b = 2000;
        this.f1432e = n5.x.f21235a;
        this.f1428a = true;
    }

    public static void b(C0146v0 c0146v0, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        E4.e eVar = (E4.e) c0146v0.f1431d;
        AbstractC1705a.m(eVar.f3561c == null);
        HandlerThread handlerThread = eVar.f3560b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = (MediaCodec) c0146v0.f1430c;
        mediaCodec.setCallback(eVar, handler);
        eVar.f3561c = handler;
        AbstractC1705a.c("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, 0);
        AbstractC1705a.v();
        E4.d dVar = (E4.d) c0146v0.f1432e;
        if (!dVar.f3558f) {
            HandlerThread handlerThread2 = dVar.f3554b;
            handlerThread2.start();
            dVar.f3555c = new A8.c0(dVar, handlerThread2.getLooper(), 2);
            dVar.f3558f = true;
        }
        AbstractC1705a.c("startCodec");
        mediaCodec.start();
        AbstractC1705a.v();
        c0146v0.f1429b = 1;
    }

    public static String c(int i7, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i7 == 1) {
            sb2.append("Audio");
        } else if (i7 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i7);
            sb2.append(")");
        }
        return sb2.toString();
    }

    @Override // E4.j
    public void C(int i7, int i10, long j, int i11) {
        E4.d dVar = (E4.d) this.f1432e;
        RuntimeException runtimeException = (RuntimeException) dVar.f3556d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        E4.c b2 = E4.d.b();
        b2.f3547a = i7;
        b2.f3548b = i10;
        b2.f3550d = j;
        b2.f3551e = i11;
        A8.c0 c0Var = dVar.f3555c;
        int i12 = n5.D.f21141a;
        c0Var.obtainMessage(0, b2).sendToTarget();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033 A[Catch: all -> 0x0035, DONT_GENERATE, TryCatch #0 {all -> 0x0035, blocks: (B:6:0x0016, B:8:0x001a, B:10:0x001e, B:12:0x0028, B:18:0x0033, B:22:0x0037, B:26:0x0041, B:28:0x0043, B:30:0x0049, B:31:0x0070, B:34:0x0066, B:37:0x0072, B:38:0x0074, B:39:0x0075, B:40:0x0077), top: B:5:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:6:0x0016, B:8:0x001a, B:10:0x001e, B:12:0x0028, B:18:0x0033, B:22:0x0037, B:26:0x0041, B:28:0x0043, B:30:0x0049, B:31:0x0070, B:34:0x0066, B:37:0x0072, B:38:0x0074, B:39:0x0075, B:40:0x0077), top: B:5:0x0016 }] */
    @Override // E4.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int a(MediaCodec.BufferInfo bufferInfo) {
        boolean z8;
        int i7;
        RuntimeException runtimeException = (RuntimeException) ((E4.d) this.f1432e).f3556d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        E4.e eVar = (E4.e) this.f1431d;
        synchronized (eVar.f3559a) {
            try {
                IllegalStateException illegalStateException = eVar.f3568m;
                if (illegalStateException != null) {
                    eVar.f3568m = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = eVar.j;
                if (codecException != null) {
                    eVar.j = null;
                    throw codecException;
                }
                boolean z10 = true;
                if (eVar.k <= 0 && !eVar.f3567l) {
                    z8 = false;
                    i7 = -1;
                    if (z8) {
                        A4.i iVar = eVar.f3563e;
                        if (iVar.f390c != 0) {
                            z10 = false;
                        }
                        if (!z10) {
                            i7 = iVar.d();
                            if (i7 >= 0) {
                                AbstractC1705a.n(eVar.f3565h);
                                MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) eVar.f3564f.remove();
                                bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                            } else if (i7 == -2) {
                                eVar.f3565h = (MediaFormat) eVar.g.remove();
                            }
                        }
                    }
                }
                z8 = true;
                i7 = -1;
                if (z8) {
                }
            } finally {
            }
        }
        return i7;
    }

    @Override // E4.j
    public void d(int i7, boolean z8) {
        ((MediaCodec) this.f1430c).releaseOutputBuffer(i7, z8);
    }

    @Override // E4.j
    public void flush() {
        ((E4.d) this.f1432e).a();
        ((MediaCodec) this.f1430c).flush();
        E4.e eVar = (E4.e) this.f1431d;
        synchronized (eVar.f3559a) {
            eVar.k++;
            Handler handler = eVar.f3561c;
            int i7 = n5.D.f21141a;
            handler.post(new S2(eVar, 10));
        }
        ((MediaCodec) this.f1430c).start();
    }

    @Override // E4.j
    public void h(int i7) {
        ((MediaCodec) this.f1430c).setVideoScalingMode(i7);
    }

    @Override // E4.j
    public void i(o5.h hVar, Handler handler) {
        ((MediaCodec) this.f1430c).setOnFrameRenderedListener(new E4.a(this, hVar, 0), handler);
    }

    @Override // E4.j
    public MediaFormat p() {
        MediaFormat mediaFormat;
        E4.e eVar = (E4.e) this.f1431d;
        synchronized (eVar.f3559a) {
            try {
                mediaFormat = eVar.f3565h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // E4.j
    public ByteBuffer q(int i7) {
        return ((MediaCodec) this.f1430c).getInputBuffer(i7);
    }

    @Override // E4.j
    public void release() {
        try {
            if (this.f1429b == 1) {
                E4.d dVar = (E4.d) this.f1432e;
                if (dVar.f3558f) {
                    dVar.a();
                    dVar.f3554b.quit();
                }
                dVar.f3558f = false;
                E4.e eVar = (E4.e) this.f1431d;
                synchronized (eVar.f3559a) {
                    eVar.f3567l = true;
                    eVar.f3560b.quit();
                    eVar.a();
                }
            }
            this.f1429b = 2;
        } finally {
            if (!this.f1428a) {
                ((MediaCodec) this.f1430c).release();
                this.f1428a = true;
            }
        }
    }

    @Override // E4.j
    public void s(Surface surface) {
        ((MediaCodec) this.f1430c).setOutputSurface(surface);
    }

    @Override // E4.j
    public void t(Bundle bundle) {
        ((MediaCodec) this.f1430c).setParameters(bundle);
    }

    @Override // E4.j
    public ByteBuffer v(int i7) {
        return ((MediaCodec) this.f1430c).getOutputBuffer(i7);
    }

    @Override // E4.j
    public void x(int i7, C1889b c1889b, long j) {
        E4.d dVar = (E4.d) this.f1432e;
        RuntimeException runtimeException = (RuntimeException) dVar.f3556d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        E4.c b2 = E4.d.b();
        b2.f3547a = i7;
        b2.f3548b = 0;
        b2.f3550d = j;
        b2.f3551e = 0;
        int i10 = c1889b.f23445f;
        MediaCodec.CryptoInfo cryptoInfo = b2.f3549c;
        cryptoInfo.numSubSamples = i10;
        int[] iArr = c1889b.f23443d;
        int[] iArr2 = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArr2 == null || iArr2.length < iArr.length) {
                iArr2 = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArr2;
        int[] iArr3 = c1889b.f23444e;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 == null || iArr4.length < iArr3.length) {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            } else {
                System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = c1889b.f23441b;
        byte[] bArr2 = cryptoInfo.key;
        if (bArr != null) {
            if (bArr2 == null || bArr2.length < bArr.length) {
                bArr2 = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            }
        }
        bArr2.getClass();
        cryptoInfo.key = bArr2;
        byte[] bArr3 = c1889b.f23440a;
        byte[] bArr4 = cryptoInfo.iv;
        if (bArr3 != null) {
            if (bArr4 == null || bArr4.length < bArr3.length) {
                bArr4 = Arrays.copyOf(bArr3, bArr3.length);
            } else {
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            }
        }
        bArr4.getClass();
        cryptoInfo.iv = bArr4;
        cryptoInfo.mode = c1889b.f23442c;
        if (n5.D.f21141a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(c1889b.g, c1889b.f23446h));
        }
        dVar.f3555c.obtainMessage(1, b2).sendToTarget();
    }

    @Override // E4.j
    public void y(int i7, long j) {
        ((MediaCodec) this.f1430c).releaseOutputBuffer(i7, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033 A[Catch: all -> 0x0035, DONT_GENERATE, TryCatch #0 {all -> 0x0035, blocks: (B:6:0x0016, B:8:0x001a, B:10:0x001e, B:12:0x0028, B:18:0x0033, B:22:0x0037, B:27:0x0046, B:28:0x0042, B:31:0x0048, B:32:0x004a, B:33:0x004b, B:34:0x004d), top: B:5:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:6:0x0016, B:8:0x001a, B:10:0x001e, B:12:0x0028, B:18:0x0033, B:22:0x0037, B:27:0x0046, B:28:0x0042, B:31:0x0048, B:32:0x004a, B:33:0x004b, B:34:0x004d), top: B:5:0x0016 }] */
    @Override // E4.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int z() {
        boolean z8;
        int i7;
        RuntimeException runtimeException = (RuntimeException) ((E4.d) this.f1432e).f3556d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        E4.e eVar = (E4.e) this.f1431d;
        synchronized (eVar.f3559a) {
            try {
                IllegalStateException illegalStateException = eVar.f3568m;
                if (illegalStateException != null) {
                    eVar.f3568m = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = eVar.j;
                if (codecException != null) {
                    eVar.j = null;
                    throw codecException;
                }
                boolean z10 = true;
                if (eVar.k <= 0 && !eVar.f3567l) {
                    z8 = false;
                    i7 = -1;
                    if (z8) {
                        A4.i iVar = eVar.f3562d;
                        if (iVar.f390c != 0) {
                            z10 = false;
                        }
                        if (!z10) {
                            i7 = iVar.d();
                        }
                    }
                }
                z8 = true;
                i7 = -1;
                if (z8) {
                }
            } finally {
            }
        }
        return i7;
    }
}
