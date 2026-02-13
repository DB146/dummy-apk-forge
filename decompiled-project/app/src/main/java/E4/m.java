package E4;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import m4.L;
import n5.AbstractC1705a;
import n5.D;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f3581a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3582b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3583c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f3584d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3585e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3586f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f3587h;

    public m(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z8, boolean z10, boolean z11) {
        str.getClass();
        this.f3581a = str;
        this.f3582b = str2;
        this.f3583c = str3;
        this.f3584d = codecCapabilities;
        this.g = z8;
        this.f3585e = z10;
        this.f3586f = z11;
        this.f3587h = n5.o.l(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i7, int i10, double d10) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(D.f(i7, widthAlignment) * widthAlignment, D.f(i10, heightAlignment) * heightAlignment);
        int i11 = point.x;
        int i12 = point.y;
        return (d10 == -1.0d || d10 < 1.0d) ? videoCapabilities.isSizeSupported(i11, i12) : videoCapabilities.areSizeAndRateSupported(i11, i12, Math.floor(d10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if ("Nexus 10".equals(r2) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r9) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static m h(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z8, boolean z10) {
        boolean z11;
        int i7;
        if (codecCapabilities != null && (i7 = D.f21141a) >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback")) {
            if (i7 <= 22) {
                String str4 = D.f21144d;
                if (!"ODROID-XU3".equals(str4)) {
                }
                if (!"OMX.Exynos.AVC.Decoder".equals(str)) {
                }
            }
            z11 = true;
            if (codecCapabilities != null && D.f21141a >= 21) {
                codecCapabilities.isFeatureSupported("tunneled-playback");
            }
            return new m(str, str2, str3, codecCapabilities, z8, z11, !z10 || (codecCapabilities != null && D.f21141a >= 21 && codecCapabilities.isFeatureSupported("secure-playback")));
        }
        z11 = false;
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        return new m(str, str2, str3, codecCapabilities, z8, z11, !z10 || (codecCapabilities != null && D.f21141a >= 21 && codecCapabilities.isFeatureSupported("secure-playback")));
    }

    public final q4.i b(L l10, L l11) {
        int i7 = !D.a(l10.f20096z, l11.f20096z) ? 8 : 0;
        if (this.f3587h) {
            if (l10.f20071H != l11.f20071H) {
                i7 |= 1024;
            }
            if (!this.f3585e && (l10.f20068E != l11.f20068E || l10.f20069F != l11.f20069F)) {
                i7 |= 512;
            }
            if (!D.a(l10.L, l11.L)) {
                i7 |= 2048;
            }
            if (D.f21144d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f3581a) && !l10.c(l11)) {
                i7 |= 2;
            }
            if (i7 == 0) {
                return new q4.i(this.f3581a, l10, l11, l10.c(l11) ? 3 : 2, 0);
            }
        } else {
            if (l10.f20075M != l11.f20075M) {
                i7 |= 4096;
            }
            if (l10.f20076N != l11.f20076N) {
                i7 |= 8192;
            }
            if (l10.f20077O != l11.f20077O) {
                i7 |= 16384;
            }
            String str = this.f3582b;
            if (i7 == 0 && "audio/mp4a-latm".equals(str)) {
                Pair d10 = x.d(l10);
                Pair d11 = x.d(l11);
                if (d10 != null && d11 != null) {
                    int intValue = ((Integer) d10.first).intValue();
                    int intValue2 = ((Integer) d11.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new q4.i(this.f3581a, l10, l11, 3, 0);
                    }
                }
            }
            if (!l10.c(l11)) {
                i7 |= 32;
            }
            if ("audio/opus".equals(str)) {
                i7 |= 2;
            }
            if (i7 == 0) {
                return new q4.i(this.f3581a, l10, l11, 1, 0);
            }
        }
        return new q4.i(this.f3581a, l10, l11, 0, i7);
    }

    public final boolean c(L l10, boolean z8) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair d10 = x.d(l10);
        if (d10 == null) {
            return true;
        }
        int intValue = ((Integer) d10.first).intValue();
        int intValue2 = ((Integer) d10.second).intValue();
        boolean equals = "video/dolby-vision".equals(l10.f20096z);
        int i7 = 8;
        String str = this.f3582b;
        if (equals) {
            if ("video/avc".equals(str)) {
                intValue2 = 0;
                intValue = 8;
            } else if ("video/hevc".equals(str)) {
                intValue2 = 0;
                intValue = 2;
            }
        }
        if (!this.f3587h && intValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f3584d;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        if (D.f21141a <= 23 && "video/x-vnd.on2.vp9".equals(str) && codecProfileLevelArr.length == 0) {
            int intValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
            if (intValue3 >= 180000000) {
                i7 = 1024;
            } else if (intValue3 >= 120000000) {
                i7 = 512;
            } else if (intValue3 >= 60000000) {
                i7 = 256;
            } else if (intValue3 >= 30000000) {
                i7 = 128;
            } else if (intValue3 >= 18000000) {
                i7 = 64;
            } else if (intValue3 >= 12000000) {
                i7 = 32;
            } else if (intValue3 >= 7200000) {
                i7 = 16;
            } else if (intValue3 < 3600000) {
                i7 = intValue3 >= 1800000 ? 4 : intValue3 >= 800000 ? 2 : 1;
            }
            MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel.profile = 1;
            codecProfileLevel.level = i7;
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
            if (codecProfileLevel2.profile == intValue && (codecProfileLevel2.level >= intValue2 || !z8)) {
                if ("video/hevc".equals(str) && 2 == intValue) {
                    String str2 = D.f21142b;
                    if (!"sailfish".equals(str2) && !"marlin".equals(str2)) {
                    }
                }
                return true;
            }
        }
        g("codec.profileLevel, " + l10.f20093w + ", " + this.f3583c);
        return false;
    }

    public final boolean d(L l10) {
        int i7;
        String str = l10.f20096z;
        String str2 = this.f3582b;
        if (!(str2.equals(str) || str2.equals(x.b(l10))) || !c(l10, true)) {
            return false;
        }
        if (this.f3587h) {
            int i10 = l10.f20068E;
            if (i10 > 0 && (i7 = l10.f20069F) > 0) {
                if (D.f21141a >= 21) {
                    return f(i10, i7, l10.f20070G);
                }
                r2 = i10 * i7 <= x.i();
                if (!r2) {
                    g("legacyFrameSize, " + i10 + "x" + i7);
                }
            }
            return r2;
        }
        int i11 = D.f21141a;
        if (i11 < 21) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f3584d;
        int i12 = l10.f20076N;
        if (i12 != -1) {
            if (codecCapabilities == null) {
                g("sampleRate.caps");
            } else {
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    g("sampleRate.aCaps");
                } else if (!audioCapabilities.isSampleRateSupported(i12)) {
                    g("sampleRate.support, " + i12);
                }
            }
            return false;
        }
        int i13 = l10.f20075M;
        if (i13 == -1) {
            return true;
        }
        if (codecCapabilities == null) {
            g("channelCount.caps");
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities2 == null) {
                g("channelCount.aCaps");
            } else {
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((i11 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    int i14 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                    AbstractC1705a.S("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.f3581a + ", [" + maxInputChannelCount + " to " + i14 + "]");
                    maxInputChannelCount = i14;
                }
                if (maxInputChannelCount >= i13) {
                    return true;
                }
                g("channelCount.support, " + i13);
            }
        }
        return false;
    }

    public final boolean e(L l10) {
        if (this.f3587h) {
            return this.f3585e;
        }
        Pair d10 = x.d(l10);
        return d10 != null && ((Integer) d10.first).intValue() == 42;
    }

    public final boolean f(int i7, int i10, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f3584d;
        if (codecCapabilities == null) {
            g("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            g("sizeAndRate.vCaps");
            return false;
        }
        if (D.f21141a >= 29) {
            int a9 = l.a(videoCapabilities, i7, i10, d10);
            if (a9 == 2) {
                return true;
            }
            if (a9 == 1) {
                StringBuilder q10 = h3.o.q(i7, i10, "sizeAndRate.cover, ", "x", "@");
                q10.append(d10);
                g(q10.toString());
                return false;
            }
        }
        if (!a(videoCapabilities, i7, i10, d10)) {
            if (i7 < i10) {
                String str = this.f3581a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(D.f21142b)) && a(videoCapabilities, i10, i7, d10)) {
                    StringBuilder q11 = h3.o.q(i7, i10, "sizeAndRate.rotated, ", "x", "@");
                    q11.append(d10);
                    StringBuilder o10 = A3.c.o("AssumedSupport [", q11.toString(), "] [", str, ", ");
                    o10.append(this.f3582b);
                    o10.append("] [");
                    o10.append(D.f21145e);
                    o10.append("]");
                    AbstractC1705a.s("MediaCodecInfo", o10.toString());
                }
            }
            StringBuilder q12 = h3.o.q(i7, i10, "sizeAndRate.support, ", "x", "@");
            q12.append(d10);
            g(q12.toString());
            return false;
        }
        return true;
    }

    public final void g(String str) {
        StringBuilder n6 = X.c.n("NoSupport [", str, "] [");
        n6.append(this.f3581a);
        n6.append(", ");
        n6.append(this.f3582b);
        n6.append("] [");
        n6.append(D.f21145e);
        n6.append("]");
        AbstractC1705a.s("MediaCodecInfo", n6.toString());
    }

    public final String toString() {
        return this.f3581a;
    }
}
