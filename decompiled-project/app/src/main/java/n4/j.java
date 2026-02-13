package n4;

import A4.s;
import P4.B;
import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import java.util.HashMap;
import m4.J0;
import m4.K0;
import m4.L;
import m4.L0;
import m4.V;
import m4.q0;
import n5.D;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: A, reason: collision with root package name */
    public boolean f21109A;

    /* renamed from: a, reason: collision with root package name */
    public final Context f21110a;

    /* renamed from: b, reason: collision with root package name */
    public final h f21111b;

    /* renamed from: c, reason: collision with root package name */
    public final PlaybackSession f21112c;

    /* renamed from: i, reason: collision with root package name */
    public String f21117i;
    public PlaybackMetrics.Builder j;
    public int k;

    /* renamed from: n, reason: collision with root package name */
    public q0 f21120n;

    /* renamed from: o, reason: collision with root package name */
    public s f21121o;

    /* renamed from: p, reason: collision with root package name */
    public s f21122p;

    /* renamed from: q, reason: collision with root package name */
    public s f21123q;

    /* renamed from: r, reason: collision with root package name */
    public L f21124r;

    /* renamed from: s, reason: collision with root package name */
    public L f21125s;

    /* renamed from: t, reason: collision with root package name */
    public L f21126t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f21127u;

    /* renamed from: v, reason: collision with root package name */
    public int f21128v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f21129w;

    /* renamed from: x, reason: collision with root package name */
    public int f21130x;

    /* renamed from: y, reason: collision with root package name */
    public int f21131y;

    /* renamed from: z, reason: collision with root package name */
    public int f21132z;

    /* renamed from: e, reason: collision with root package name */
    public final K0 f21114e = new K0();

    /* renamed from: f, reason: collision with root package name */
    public final J0 f21115f = new J0();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f21116h = new HashMap();
    public final HashMap g = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final long f21113d = SystemClock.elapsedRealtime();

    /* renamed from: l, reason: collision with root package name */
    public int f21118l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f21119m = 0;

    public j(Context context, PlaybackSession playbackSession) {
        this.f21110a = context.getApplicationContext();
        this.f21112c = playbackSession;
        h hVar = new h();
        this.f21111b = hVar;
        hVar.f21106d = this;
    }

    public final boolean a(s sVar) {
        String str;
        if (sVar != null) {
            String str2 = (String) sVar.f472c;
            h hVar = this.f21111b;
            synchronized (hVar) {
                str = hVar.f21108f;
            }
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.j;
        if (builder != null && this.f21109A) {
            builder.setAudioUnderrunCount(this.f21132z);
            this.j.setVideoFramesDropped(this.f21130x);
            this.j.setVideoFramesPlayed(this.f21131y);
            Long l10 = (Long) this.g.get(this.f21117i);
            this.j.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = (Long) this.f21116h.get(this.f21117i);
            this.j.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.j.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            PlaybackSession playbackSession = this.f21112c;
            build = this.j.build();
            playbackSession.reportPlaybackMetrics(build);
        }
        this.j = null;
        this.f21117i = null;
        this.f21132z = 0;
        this.f21130x = 0;
        this.f21131y = 0;
        this.f21124r = null;
        this.f21125s = null;
        this.f21126t = null;
        this.f21109A = false;
    }

    public final void c(L0 l02, B b2) {
        int b10;
        PlaybackMetrics.Builder builder = this.j;
        if (b2 == null || (b10 = l02.b(b2.f8157a)) == -1) {
            return;
        }
        J0 j02 = this.f21115f;
        int i7 = 0;
        l02.f(b10, j02, false);
        int i10 = j02.f19965c;
        K0 k02 = this.f21114e;
        l02.n(i10, k02);
        V v10 = k02.f20021c.f20224b;
        if (v10 != null) {
            int H10 = D.H(v10.f20177a, v10.f20178b);
            i7 = H10 != 0 ? H10 != 1 ? H10 != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i7);
        if (k02.f20015B != -9223372036854775807L && !k02.f20030z && !k02.f20027w && !k02.a()) {
            builder.setMediaDurationMillis(D.Z(k02.f20015B));
        }
        builder.setPlaybackType(k02.a() ? 2 : 1);
        this.f21109A = true;
    }

    public final void d(C1703a c1703a, String str) {
        B b2 = c1703a.f21073d;
        if ((b2 == null || !b2.a()) && str.equals(this.f21117i)) {
            b();
        }
        this.g.remove(str);
        this.f21116h.remove(str);
    }

    public final void e(int i7, long j, L l10, int i10) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        TrackChangeEvent build;
        int i11;
        timeSinceCreatedMillis = i.m(i7).setTimeSinceCreatedMillis(j - this.f21113d);
        if (l10 != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i10 != 1) {
                i11 = 3;
                if (i10 != 2) {
                    i11 = i10 != 3 ? 1 : 4;
                }
            } else {
                i11 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i11);
            String str = l10.f20095y;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = l10.f20096z;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = l10.f20093w;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i12 = l10.f20092v;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = l10.f20068E;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = l10.f20069F;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = l10.f20075M;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = l10.f20076N;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str4 = l10.f20087c;
            if (str4 != null) {
                int i17 = D.f21141a;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f4 = l10.f20070G;
            if (f4 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f4);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f21109A = true;
        PlaybackSession playbackSession = this.f21112c;
        build = timeSinceCreatedMillis.build();
        playbackSession.reportTrackChangeEvent(build);
    }
}
