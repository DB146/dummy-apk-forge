package o4;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.SystemClock;
import ea.C1108c;
import i1.C1290a;
import ia.C1358d;
import java.lang.reflect.Method;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: A, reason: collision with root package name */
    public long f21891A;

    /* renamed from: B, reason: collision with root package name */
    public long f21892B;

    /* renamed from: C, reason: collision with root package name */
    public long f21893C;

    /* renamed from: D, reason: collision with root package name */
    public long f21894D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f21895E;

    /* renamed from: F, reason: collision with root package name */
    public long f21896F;

    /* renamed from: G, reason: collision with root package name */
    public long f21897G;

    /* renamed from: a, reason: collision with root package name */
    public final C1358d f21898a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f21899b;

    /* renamed from: c, reason: collision with root package name */
    public AudioTrack f21900c;

    /* renamed from: d, reason: collision with root package name */
    public int f21901d;

    /* renamed from: e, reason: collision with root package name */
    public int f21902e;

    /* renamed from: f, reason: collision with root package name */
    public w f21903f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f21904h;

    /* renamed from: i, reason: collision with root package name */
    public long f21905i;
    public float j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public long f21906l;

    /* renamed from: m, reason: collision with root package name */
    public long f21907m;

    /* renamed from: n, reason: collision with root package name */
    public Method f21908n;

    /* renamed from: o, reason: collision with root package name */
    public long f21909o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f21910p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f21911q;

    /* renamed from: r, reason: collision with root package name */
    public long f21912r;

    /* renamed from: s, reason: collision with root package name */
    public long f21913s;

    /* renamed from: t, reason: collision with root package name */
    public long f21914t;

    /* renamed from: u, reason: collision with root package name */
    public long f21915u;

    /* renamed from: v, reason: collision with root package name */
    public long f21916v;

    /* renamed from: w, reason: collision with root package name */
    public int f21917w;

    /* renamed from: x, reason: collision with root package name */
    public int f21918x;

    /* renamed from: y, reason: collision with root package name */
    public long f21919y;

    /* renamed from: z, reason: collision with root package name */
    public long f21920z;

    public x(C1358d c1358d) {
        this.f21898a = c1358d;
        if (n5.D.f21141a >= 18) {
            try {
                this.f21908n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f21899b = new long[10];
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0208 A[Catch: Exception -> 0x021e, TRY_LEAVE, TryCatch #0 {Exception -> 0x021e, blocks: (B:63:0x01e2, B:65:0x0208), top: B:62:0x01e2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(boolean z8) {
        long S7;
        boolean z10;
        Method method;
        long max;
        w wVar;
        long j;
        boolean z11;
        AudioTrack audioTrack = this.f21900c;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        I i7 = (I) this.f21898a.f18487b;
        if (playState == 3) {
            long nanoTime = System.nanoTime() / 1000;
            if (nanoTime - this.f21907m >= 30000) {
                long S10 = n5.D.S(this.g, b());
                if (S10 != 0) {
                    int i10 = this.f21917w;
                    long A10 = n5.D.A(S10, this.j) - nanoTime;
                    long[] jArr = this.f21899b;
                    jArr[i10] = A10;
                    this.f21917w = (this.f21917w + 1) % 10;
                    int i11 = this.f21918x;
                    if (i11 < 10) {
                        this.f21918x = i11 + 1;
                    }
                    this.f21907m = nanoTime;
                    this.f21906l = 0L;
                    int i12 = 0;
                    while (true) {
                        int i13 = this.f21918x;
                        if (i12 >= i13) {
                            break;
                        }
                        this.f21906l = (jArr[i12] / i13) + this.f21906l;
                        i12++;
                    }
                }
            }
            if (!this.f21904h) {
                w wVar2 = this.f21903f;
                wVar2.getClass();
                v vVar = wVar2.f21885a;
                if (vVar != null && nanoTime - wVar2.f21889e >= wVar2.f21888d) {
                    wVar2.f21889e = nanoTime;
                    AudioTrack audioTrack2 = vVar.f21880a;
                    AudioTimestamp audioTimestamp = vVar.f21881b;
                    boolean timestamp = audioTrack2.getTimestamp(audioTimestamp);
                    if (timestamp) {
                        long j10 = audioTimestamp.framePosition;
                        z11 = timestamp;
                        if (vVar.f21883d > j10) {
                            vVar.f21882c++;
                        }
                        vVar.f21883d = j10;
                        vVar.f21884e = j10 + (vVar.f21882c << 32);
                    } else {
                        z11 = timestamp;
                    }
                    int i14 = wVar2.f21886b;
                    if (i14 != 0) {
                        if (i14 != 1) {
                            if (i14 != 2) {
                                if (i14 != 3) {
                                    if (i14 != 4) {
                                        throw new IllegalStateException();
                                    }
                                } else if (z11) {
                                    wVar2.a();
                                }
                            } else if (!z11) {
                                wVar2.a();
                            }
                        } else if (!z11) {
                            wVar2.a();
                        } else if (vVar.f21884e > wVar2.f21890f) {
                            wVar2.b(2);
                        }
                    } else if (z11) {
                        if (audioTimestamp.nanoTime / 1000 >= wVar2.f21887c) {
                            wVar2.f21890f = vVar.f21884e;
                            wVar2.b(1);
                        }
                    } else if (nanoTime - wVar2.f21887c > 500000) {
                        wVar2.b(3);
                    }
                    z10 = z11;
                    if (z10) {
                        long j11 = vVar != null ? vVar.f21881b.nanoTime / 1000 : -9223372036854775807L;
                        if (vVar != null) {
                            j = vVar.f21884e;
                            wVar = wVar2;
                        } else {
                            wVar = wVar2;
                            j = -1;
                        }
                        long S11 = n5.D.S(this.g, b());
                        if (Math.abs(j11 - nanoTime) > 5000000) {
                            StringBuilder l10 = X.c.l(j, "Spurious audio timestamp (system clock mismatch): ", ", ");
                            l10.append(j11);
                            l10.append(", ");
                            l10.append(nanoTime);
                            l10.append(", ");
                            l10.append(S11);
                            l10.append(", ");
                            l10.append(i7.h());
                            l10.append(", ");
                            l10.append(i7.i());
                            AbstractC1705a.S("DefaultAudioSink", l10.toString());
                            wVar.b(4);
                        } else {
                            w wVar3 = wVar;
                            if (Math.abs(n5.D.S(this.g, j) - S11) > 5000000) {
                                StringBuilder l11 = X.c.l(j, "Spurious audio timestamp (frame position mismatch): ", ", ");
                                l11.append(j11);
                                l11.append(", ");
                                l11.append(nanoTime);
                                l11.append(", ");
                                l11.append(S11);
                                l11.append(", ");
                                l11.append(i7.h());
                                l11.append(", ");
                                l11.append(i7.i());
                                AbstractC1705a.S("DefaultAudioSink", l11.toString());
                                wVar3.b(4);
                            } else if (wVar3.f21886b == 4) {
                                wVar3.a();
                            }
                        }
                    }
                    if (this.f21911q && (method = this.f21908n) != null && nanoTime - this.f21912r >= 500000) {
                        try {
                            AudioTrack audioTrack3 = this.f21900c;
                            audioTrack3.getClass();
                            Integer num = (Integer) method.invoke(audioTrack3, null);
                            int i15 = n5.D.f21141a;
                            long intValue = (num.intValue() * 1000) - this.f21905i;
                            this.f21909o = intValue;
                            max = Math.max(intValue, 0L);
                            this.f21909o = max;
                            if (max > 5000000) {
                                AbstractC1705a.S("DefaultAudioSink", "Ignoring impossibly large audio latency: " + max);
                                this.f21909o = 0L;
                            }
                        } catch (Exception unused) {
                            this.f21908n = null;
                        }
                        this.f21912r = nanoTime;
                    }
                }
                z10 = false;
                if (z10) {
                }
                if (this.f21911q) {
                    AudioTrack audioTrack32 = this.f21900c;
                    audioTrack32.getClass();
                    Integer num2 = (Integer) method.invoke(audioTrack32, null);
                    int i152 = n5.D.f21141a;
                    long intValue2 = (num2.intValue() * 1000) - this.f21905i;
                    this.f21909o = intValue2;
                    max = Math.max(intValue2, 0L);
                    this.f21909o = max;
                    if (max > 5000000) {
                    }
                    this.f21912r = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        w wVar4 = this.f21903f;
        wVar4.getClass();
        boolean z12 = wVar4.f21886b == 2;
        if (z12) {
            v vVar2 = wVar4.f21885a;
            S7 = n5.D.w(nanoTime2 - (vVar2 != null ? vVar2.f21881b.nanoTime / 1000 : -9223372036854775807L), this.j) + n5.D.S(this.g, vVar2 != null ? vVar2.f21884e : -1L);
        } else {
            S7 = this.f21918x == 0 ? n5.D.S(this.g, b()) : n5.D.w(this.f21906l + nanoTime2, this.j);
            if (!z8) {
                S7 = Math.max(0L, S7 - this.f21909o);
            }
        }
        if (this.f21895E != z12) {
            this.f21897G = this.f21894D;
            this.f21896F = this.f21893C;
        }
        long j12 = nanoTime2 - this.f21897G;
        if (j12 < 1000000) {
            long w10 = n5.D.w(j12, this.j) + this.f21896F;
            long j13 = (j12 * 1000) / 1000000;
            S7 = (((1000 - j13) * w10) + (S7 * j13)) / 1000;
        }
        if (!this.k) {
            long j14 = this.f21893C;
            if (S7 > j14) {
                this.k = true;
                long currentTimeMillis = System.currentTimeMillis() - n5.D.Z(n5.D.A(n5.D.Z(S7 - j14), this.j));
                C1290a c1290a = i7.f21742r;
                if (c1290a != null) {
                    C1108c c1108c = ((L) c1290a.f18187b).f21753T0;
                    Handler handler = (Handler) c1108c.f16831c;
                    if (handler != null) {
                        handler.post(new RunnableC1803q(c1108c, currentTimeMillis));
                    }
                }
            }
        }
        this.f21894D = nanoTime2;
        this.f21893C = S7;
        this.f21895E = z12;
        return S7;
    }

    public final long b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f21919y;
        if (j != -9223372036854775807L) {
            return Math.min(this.f21892B, this.f21891A + (((n5.D.w((elapsedRealtime * 1000) - j, this.j) * this.g) + 999999) / 1000000));
        }
        if (elapsedRealtime - this.f21913s >= 5) {
            AudioTrack audioTrack = this.f21900c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (this.f21904h) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.f21916v = this.f21914t;
                    }
                    playbackHeadPosition += this.f21916v;
                }
                if (n5.D.f21141a <= 29) {
                    if (playbackHeadPosition != 0 || this.f21914t <= 0 || playState != 3) {
                        this.f21920z = -9223372036854775807L;
                    } else if (this.f21920z == -9223372036854775807L) {
                        this.f21920z = elapsedRealtime;
                    }
                }
                if (this.f21914t > playbackHeadPosition) {
                    this.f21915u++;
                }
                this.f21914t = playbackHeadPosition;
            }
            this.f21913s = elapsedRealtime;
        }
        return this.f21914t + (this.f21915u << 32);
    }

    public final boolean c(long j) {
        long a9 = a(false);
        int i7 = this.g;
        int i10 = n5.D.f21141a;
        if (j <= ((a9 * i7) + 999999) / 1000000) {
            if (!this.f21904h) {
                return false;
            }
            AudioTrack audioTrack = this.f21900c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() != 2 || b() != 0) {
                return false;
            }
        }
        return true;
    }

    public final void d() {
        this.f21906l = 0L;
        this.f21918x = 0;
        this.f21917w = 0;
        this.f21907m = 0L;
        this.f21894D = 0L;
        this.f21897G = 0L;
        this.k = false;
    }
}
