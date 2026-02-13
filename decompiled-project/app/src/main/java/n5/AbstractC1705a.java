package n5;

import N6.F;
import N6.H;
import N6.t0;
import android.media.MediaFormat;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.kt.apps.core.utils.blurry.BlurFactor;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import m4.InterfaceC1567f;
import m4.InterfaceC1569g;
import o5.C1807b;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: n5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1705a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f21152a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f21153b = {"", "A", "B", "C"};

    /* renamed from: c, reason: collision with root package name */
    public static final Object f21154c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f21155d = {0, 0, 0, 1};

    /* renamed from: e, reason: collision with root package name */
    public static final float[] f21156e = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: f, reason: collision with root package name */
    public static final Object f21157f = new Object();
    public static int[] g = new int[10];

    /* renamed from: h, reason: collision with root package name */
    public static final Object f21158h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public static final Object f21159i = new Object();
    public static boolean j;
    public static long k;

    public static int[] A(String str) {
        int i7;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i10 = indexOf4 + 2;
        if (i10 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i10) == '/') {
            i7 = str.indexOf(47, indexOf4 + 3);
            if (i7 == -1 || i7 > indexOf2) {
                i7 = indexOf2;
            }
        } else {
            i7 = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i7;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    public static void B(String str, String str2) {
        synchronized (f21154c) {
            Log.i(str, str2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x019b, code lost:
    
        if (r0.equals("video/mp2t") == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int C(String str) {
        boolean z8;
        String str2 = str;
        char c10 = 2;
        if (str2 == null) {
            return -1;
        }
        ArrayList arrayList = o.f21193a;
        switch (str.hashCode()) {
            case -1007807498:
                if (str2.equals("audio/x-flac")) {
                    z8 = false;
                    break;
                }
                z8 = -1;
                break;
            case -586683234:
                if (str2.equals("audio/x-wav")) {
                    z8 = true;
                    break;
                }
                z8 = -1;
                break;
            case 187090231:
                if (str2.equals("audio/mp3")) {
                    z8 = 2;
                    break;
                }
                z8 = -1;
                break;
            default:
                z8 = -1;
                break;
        }
        switch (z8) {
            case false:
                str2 = "audio/flac";
                break;
            case true:
                str2 = "audio/wav";
                break;
            case true:
                str2 = "audio/mpeg";
                break;
        }
        switch (str2.hashCode()) {
            case -2123537834:
                if (str2.equals("audio/eac3-joc")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -1662384011:
                if (str2.equals("video/mp2p")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -1662384007:
                break;
            case -1662095187:
                if (str2.equals("video/webm")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -1606874997:
                if (str2.equals("audio/amr-wb")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case -1487394660:
                if (str2.equals("image/jpeg")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case -1248337486:
                if (str2.equals("application/mp4")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case -1079884372:
                if (str2.equals("video/x-msvideo")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case -1004728940:
                if (str2.equals("text/vtt")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case -387023398:
                if (str2.equals("audio/x-matroska")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case -43467528:
                if (str2.equals("application/webm")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case 13915911:
                if (str2.equals("video/x-flv")) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            case 187078296:
                if (str2.equals("audio/ac3")) {
                    c10 = '\f';
                    break;
                }
                c10 = 65535;
                break;
            case 187078297:
                if (str2.equals("audio/ac4")) {
                    c10 = '\r';
                    break;
                }
                c10 = 65535;
                break;
            case 187078669:
                if (str2.equals("audio/amr")) {
                    c10 = 14;
                    break;
                }
                c10 = 65535;
                break;
            case 187090232:
                if (str2.equals("audio/mp4")) {
                    c10 = 15;
                    break;
                }
                c10 = 65535;
                break;
            case 187091926:
                if (str2.equals("audio/ogg")) {
                    c10 = 16;
                    break;
                }
                c10 = 65535;
                break;
            case 187099443:
                if (str2.equals("audio/wav")) {
                    c10 = 17;
                    break;
                }
                c10 = 65535;
                break;
            case 1331848029:
                if (str2.equals("video/mp4")) {
                    c10 = 18;
                    break;
                }
                c10 = 65535;
                break;
            case 1503095341:
                if (str2.equals("audio/3gpp")) {
                    c10 = 19;
                    break;
                }
                c10 = 65535;
                break;
            case 1504578661:
                if (str2.equals("audio/eac3")) {
                    c10 = 20;
                    break;
                }
                c10 = 65535;
                break;
            case 1504619009:
                if (str2.equals("audio/flac")) {
                    c10 = 21;
                    break;
                }
                c10 = 65535;
                break;
            case 1504824762:
                if (str2.equals("audio/midi")) {
                    c10 = 22;
                    break;
                }
                c10 = 65535;
                break;
            case 1504831518:
                if (str2.equals("audio/mpeg")) {
                    c10 = 23;
                    break;
                }
                c10 = 65535;
                break;
            case 1505118770:
                if (str2.equals("audio/webm")) {
                    c10 = 24;
                    break;
                }
                c10 = 65535;
                break;
            case 2039520277:
                if (str2.equals("video/x-matroska")) {
                    c10 = 25;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
            case '\f':
            case 20:
                return 0;
            case 1:
                return 10;
            case 2:
                return 11;
            case 3:
            case '\t':
            case '\n':
            case 24:
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                return 6;
            case 4:
            case 14:
            case 19:
                return 3;
            case 5:
                return 14;
            case 6:
            case 15:
            case 18:
                return 8;
            case 7:
                return 16;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                return 13;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return 5;
            case '\r':
                return 1;
            case 16:
                return 9;
            case 17:
                return 12;
            case 21:
                return 4;
            case 22:
                return 15;
            case 23:
                return 7;
            default:
                return -1;
        }
    }

    public static int D(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        return lastPathSegment.endsWith(".avi") ? 16 : -1;
    }

    public static boolean E(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean F(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    public static boolean G(XmlPullParser xmlPullParser, String str) {
        return F(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static void H(MediaFormat mediaFormat, String str, int i7) {
        if (i7 != -1) {
            mediaFormat.setInteger(str, i7);
        }
    }

    public static p I(int i7, byte[] bArr, int i10) {
        int i11;
        float f4;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int[] iArr;
        int i19;
        b5.f fVar = new b5.f(bArr, i7 + 2, i10);
        int i20 = 4;
        fVar.s(4);
        int i21 = fVar.i(3);
        fVar.r();
        int i22 = fVar.i(2);
        boolean h10 = fVar.h();
        int i23 = fVar.i(5);
        int i24 = 0;
        int i25 = 0;
        while (true) {
            i11 = 1;
            if (i25 >= 32) {
                break;
            }
            if (fVar.h()) {
                i24 |= 1 << i25;
            }
            i25++;
        }
        int i26 = 6;
        int[] iArr2 = new int[6];
        for (int i27 = 0; i27 < 6; i27++) {
            iArr2[i27] = fVar.i(8);
        }
        int i28 = fVar.i(8);
        int i29 = 0;
        for (int i30 = 0; i30 < i21; i30++) {
            if (fVar.h()) {
                i29 += 89;
            }
            if (fVar.h()) {
                i29 += 8;
            }
        }
        fVar.s(i29);
        if (i21 > 0) {
            fVar.s((8 - i21) * 2);
        }
        fVar.l();
        int l10 = fVar.l();
        if (l10 == 3) {
            fVar.r();
        }
        int l11 = fVar.l();
        int l12 = fVar.l();
        if (fVar.h()) {
            int l13 = fVar.l();
            int l14 = fVar.l();
            int l15 = fVar.l();
            int l16 = fVar.l();
            l11 -= (l13 + l14) * ((l10 == 1 || l10 == 2) ? 2 : 1);
            l12 -= (l15 + l16) * (l10 == 1 ? 2 : 1);
        }
        int i31 = l12;
        int i32 = l11;
        fVar.l();
        fVar.l();
        int l17 = fVar.l();
        for (int i33 = fVar.h() ? 0 : i21; i33 <= i21; i33++) {
            fVar.l();
            fVar.l();
            fVar.l();
        }
        fVar.l();
        fVar.l();
        fVar.l();
        fVar.l();
        fVar.l();
        fVar.l();
        if (fVar.h() && fVar.h()) {
            int i34 = 0;
            while (i34 < i20) {
                int i35 = 0;
                while (i35 < i26) {
                    if (fVar.h()) {
                        int min = Math.min(64, 1 << ((i34 << 1) + 4));
                        if (i34 > 1) {
                            fVar.m();
                        }
                        for (int i36 = 0; i36 < min; i36++) {
                            fVar.m();
                        }
                    } else {
                        fVar.l();
                    }
                    i35 += i34 == 3 ? 3 : 1;
                    i26 = 6;
                }
                i34++;
                i20 = 4;
                i26 = 6;
            }
        }
        fVar.s(2);
        if (fVar.h()) {
            fVar.s(8);
            fVar.l();
            fVar.l();
            fVar.r();
        }
        int l18 = fVar.l();
        int i37 = 0;
        int[] iArr3 = new int[0];
        int[] iArr4 = new int[0];
        int i38 = -1;
        int i39 = -1;
        int i40 = -1;
        while (i37 < l18) {
            if (i37 == 0 || !fVar.h()) {
                i16 = l18;
                i17 = i23;
                i18 = i24;
                iArr = iArr2;
                i19 = i28;
                int l19 = fVar.l();
                int l20 = fVar.l();
                int[] iArr5 = new int[l19];
                int i41 = 0;
                while (i41 < l19) {
                    iArr5[i41] = (i41 > 0 ? iArr5[i41 - 1] : 0) - (fVar.l() + 1);
                    fVar.r();
                    i41++;
                }
                int[] iArr6 = new int[l20];
                int i42 = 0;
                while (i42 < l20) {
                    iArr6[i42] = fVar.l() + 1 + (i42 > 0 ? iArr6[i42 - 1] : 0);
                    fVar.r();
                    i42++;
                }
                i11 = 1;
                iArr3 = iArr5;
                iArr4 = iArr6;
                i40 = l19;
                i39 = l20;
            } else {
                int i43 = i40 + i39;
                int l21 = (1 - ((fVar.h() ? 1 : 0) * 2)) * (fVar.l() + 1);
                i16 = l18;
                int i44 = i43 + 1;
                i19 = i28;
                boolean[] zArr = new boolean[i44];
                iArr = iArr2;
                for (int i45 = 0; i45 <= i43; i45++) {
                    if (fVar.h()) {
                        zArr[i45] = true;
                    } else {
                        zArr[i45] = fVar.h();
                    }
                }
                int[] iArr7 = new int[i44];
                int[] iArr8 = new int[i44];
                int i46 = 0;
                for (int i47 = i39 - 1; i47 >= 0; i47--) {
                    int i48 = iArr4[i47] + l21;
                    if (i48 < 0 && zArr[i40 + i47]) {
                        iArr7[i46] = i48;
                        i46++;
                    }
                }
                if (l21 < 0 && zArr[i43]) {
                    iArr7[i46] = l21;
                    i46++;
                }
                i18 = i24;
                int i49 = i46;
                i17 = i23;
                for (int i50 = 0; i50 < i40; i50++) {
                    int i51 = iArr3[i50] + l21;
                    if (i51 < 0 && zArr[i50]) {
                        iArr7[i49] = i51;
                        i49++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr7, i49);
                int i52 = 0;
                for (int i53 = i40 - 1; i53 >= 0; i53--) {
                    int i54 = iArr3[i53] + l21;
                    if (i54 > 0 && zArr[i53]) {
                        iArr8[i52] = i54;
                        i52++;
                    }
                }
                if (l21 > 0 && zArr[i43]) {
                    iArr8[i52] = l21;
                    i52++;
                }
                int i55 = i52;
                for (int i56 = 0; i56 < i39; i56++) {
                    int i57 = iArr4[i56] + l21;
                    if (i57 > 0 && zArr[i40 + i56]) {
                        iArr8[i55] = i57;
                        i55++;
                    }
                }
                iArr4 = Arrays.copyOf(iArr8, i55);
                i40 = i49;
                i39 = i55;
                i11 = 1;
                iArr3 = copyOf;
            }
            i37++;
            l18 = i16;
            i28 = i19;
            iArr2 = iArr;
            i24 = i18;
            i23 = i17;
        }
        int i58 = i23;
        int i59 = i24;
        int[] iArr9 = iArr2;
        int i60 = i28;
        if (fVar.h()) {
            int l22 = fVar.l();
            for (int i61 = 0; i61 < l22; i61++) {
                fVar.s(l17 + 5);
            }
        }
        fVar.s(2);
        float f10 = 1.0f;
        if (fVar.h()) {
            if (fVar.h()) {
                int i62 = fVar.i(8);
                if (i62 == 255) {
                    int i63 = fVar.i(16);
                    int i64 = fVar.i(16);
                    if (i63 != 0 && i64 != 0) {
                        f10 = i63 / i64;
                    }
                } else if (i62 < 17) {
                    f10 = f21156e[i62];
                } else {
                    h3.o.u(i62, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (fVar.h()) {
                fVar.r();
            }
            if (fVar.h()) {
                fVar.s(3);
                i13 = fVar.h() ? i11 : 2;
                if (fVar.h()) {
                    int i65 = fVar.i(8);
                    int i66 = fVar.i(8);
                    fVar.s(8);
                    i38 = C1807b.b(i65);
                    i15 = C1807b.c(i66);
                } else {
                    i15 = -1;
                }
            } else {
                i13 = -1;
                i15 = -1;
            }
            if (fVar.h()) {
                fVar.l();
                fVar.l();
            }
            fVar.r();
            if (fVar.h()) {
                i31 *= 2;
            }
            f4 = f10;
            i12 = i31;
            i14 = i38;
            i38 = i15;
        } else {
            f4 = 1.0f;
            i12 = i31;
            i13 = -1;
            i14 = -1;
        }
        return new p(i22, h10, i58, i59, iArr9, i60, i32, i12, f4, i14, i13, i38);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static r J(int i7, byte[] bArr, int i10) {
        int l10;
        boolean h10;
        int i11;
        boolean z8;
        boolean h11;
        float f4;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        b5.f fVar = new b5.f(bArr, i7 + 1, i10);
        int i19 = fVar.i(8);
        int i20 = fVar.i(8);
        int i21 = fVar.i(8);
        int l11 = fVar.l();
        if (i19 == 100 || i19 == 110 || i19 == 122 || i19 == 244 || i19 == 44 || i19 == 83 || i19 == 86 || i19 == 118 || i19 == 128 || i19 == 138) {
            l10 = fVar.l();
            h10 = l10 == 3 ? fVar.h() : false;
            fVar.l();
            fVar.l();
            fVar.r();
            if (fVar.h()) {
                int i22 = l10 != 3 ? 8 : 12;
                int i23 = 0;
                while (i23 < i22) {
                    if (fVar.h()) {
                        int i24 = i23 < 6 ? 16 : 64;
                        int i25 = 8;
                        int i26 = 8;
                        for (int i27 = 0; i27 < i24; i27++) {
                            if (i25 != 0) {
                                i25 = ((fVar.m() + i26) + 256) % 256;
                            }
                            if (i25 != 0) {
                                i26 = i25;
                            }
                        }
                    }
                    i23++;
                }
            }
        } else {
            l10 = 1;
            h10 = false;
        }
        int l12 = fVar.l() + 4;
        int l13 = fVar.l();
        if (l13 == 0) {
            i11 = fVar.l() + 4;
        } else {
            if (l13 == 1) {
                boolean h12 = fVar.h();
                fVar.m();
                fVar.m();
                long l14 = fVar.l();
                for (int i28 = 0; i28 < l14; i28++) {
                    fVar.l();
                }
                z8 = h12;
                i11 = 0;
                fVar.l();
                fVar.r();
                int l15 = fVar.l() + 1;
                int l16 = fVar.l() + 1;
                h11 = fVar.h();
                int i29 = 2 - (h11 ? 1 : 0);
                int i30 = l16 * i29;
                if (!h11) {
                    fVar.r();
                }
                fVar.r();
                int i31 = l15 * 16;
                int i32 = i30 * 16;
                if (!fVar.h()) {
                    int l17 = fVar.l();
                    int l18 = fVar.l();
                    int l19 = fVar.l();
                    int l20 = fVar.l();
                    if (l10 == 0) {
                        i17 = i29;
                        i18 = 1;
                    } else {
                        if (l10 == 3) {
                            i16 = 1;
                            i15 = 1;
                        } else {
                            i15 = 2;
                            i16 = 1;
                        }
                        i17 = i29 * (l10 == i16 ? 2 : i16);
                        i18 = i15;
                    }
                    i31 -= (l17 + l18) * i18;
                    i32 -= (l19 + l20) * i17;
                }
                int i33 = i32;
                float f10 = 1.0f;
                if (fVar.h()) {
                    if (fVar.h()) {
                        int i34 = fVar.i(8);
                        if (i34 == 255) {
                            int i35 = fVar.i(16);
                            int i36 = fVar.i(16);
                            if (i35 != 0 && i36 != 0) {
                                f10 = i35 / i36;
                            }
                        } else if (i34 < 17) {
                            f10 = f21156e[i34];
                        } else {
                            h3.o.u(i34, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                        }
                    }
                    if (fVar.h()) {
                        fVar.r();
                    }
                    if (fVar.h()) {
                        fVar.s(3);
                        i13 = fVar.h() ? 1 : 2;
                        if (!fVar.h()) {
                            f4 = f10;
                            i12 = -1;
                            i14 = -1;
                            return new r(i19, i20, i21, l11, i31, i33, f4, h10, h11, l12, l13, i11, z8, i12, i13, i14);
                        }
                        int i37 = fVar.i(8);
                        int i38 = fVar.i(8);
                        fVar.s(8);
                        int b2 = C1807b.b(i37);
                        i14 = C1807b.c(i38);
                        f4 = f10;
                        i12 = b2;
                        return new r(i19, i20, i21, l11, i31, i33, f4, h10, h11, l12, l13, i11, z8, i12, i13, i14);
                    }
                }
                f4 = f10;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                return new r(i19, i20, i21, l11, i31, i33, f4, h10, h11, l12, l13, i11, z8, i12, i13, i14);
            }
            i11 = 0;
        }
        z8 = false;
        fVar.l();
        fVar.r();
        int l152 = fVar.l() + 1;
        int l162 = fVar.l() + 1;
        h11 = fVar.h();
        int i292 = 2 - (h11 ? 1 : 0);
        int i302 = l162 * i292;
        if (!h11) {
        }
        fVar.r();
        int i312 = l152 * 16;
        int i322 = i302 * 16;
        if (!fVar.h()) {
        }
        int i332 = i322;
        float f102 = 1.0f;
        if (fVar.h()) {
        }
        f4 = f102;
        i12 = -1;
        i13 = -1;
        i14 = -1;
        return new r(i19, i20, i21, l11, i312, i332, f4, h10, h11, l12, l13, i11, z8, i12, i13, i14);
    }

    public static long K(int i7, byte[] bArr) {
        int i10 = bArr[i7];
        int i11 = bArr[i7 + 1];
        int i12 = bArr[i7 + 2];
        int i13 = bArr[i7 + 3];
        if ((i10 & 128) == 128) {
            i10 = (i10 & 127) + 128;
        }
        if ((i11 & 128) == 128) {
            i11 = (i11 & 127) + 128;
        }
        if ((i12 & 128) == 128) {
            i12 = (i12 & 127) + 128;
        }
        if ((i13 & 128) == 128) {
            i13 = (i13 & 127) + 128;
        }
        return (i10 << 24) + (i11 << 16) + (i12 << 8) + i13;
    }

    public static long L(int i7, byte[] bArr) {
        long K10 = K(i7, bArr);
        long K11 = K(i7 + 4, bArr);
        if (K10 == 0 && K11 == 0) {
            return 0L;
        }
        return ((K11 * 1000) / 4294967296L) + ((K10 - 2208988800L) * 1000);
    }

    public static String M(StringBuilder sb2, int i7, int i10) {
        int i11;
        int i12;
        if (i7 >= i10) {
            return sb2.toString();
        }
        if (sb2.charAt(i7) == '/') {
            i7++;
        }
        int i13 = i7;
        int i14 = i13;
        while (i13 <= i10) {
            if (i13 == i10) {
                i11 = i13;
            } else if (sb2.charAt(i13) == '/') {
                i11 = i13 + 1;
            } else {
                i13++;
            }
            int i15 = i14 + 1;
            if (i13 == i15 && sb2.charAt(i14) == '.') {
                sb2.delete(i14, i11);
                i10 -= i11 - i14;
            } else {
                if (i13 == i14 + 2 && sb2.charAt(i14) == '.' && sb2.charAt(i15) == '.') {
                    i12 = sb2.lastIndexOf("/", i14 - 2) + 1;
                    int i16 = i12 > i7 ? i12 : i7;
                    sb2.delete(i16, i11);
                    i10 -= i11 - i16;
                } else {
                    i12 = i13 + 1;
                }
                i14 = i12;
            }
            i13 = i14;
        }
        return sb2.toString();
    }

    public static String N(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] A10 = A(str2);
        if (A10[0] != -1) {
            sb2.append(str2);
            M(sb2, A10[1], A10[2]);
            return sb2.toString();
        }
        int[] A11 = A(str);
        if (A10[3] == 0) {
            sb2.append((CharSequence) str, 0, A11[3]);
            sb2.append(str2);
            return sb2.toString();
        }
        if (A10[2] == 0) {
            sb2.append((CharSequence) str, 0, A11[2]);
            sb2.append(str2);
            return sb2.toString();
        }
        int i7 = A10[1];
        if (i7 != 0) {
            int i10 = A11[0] + 1;
            sb2.append((CharSequence) str, 0, i10);
            sb2.append(str2);
            return M(sb2, A10[1] + i10, i10 + A10[2]);
        }
        if (str2.charAt(i7) == '/') {
            sb2.append((CharSequence) str, 0, A11[1]);
            sb2.append(str2);
            int i11 = A11[1];
            return M(sb2, i11, A10[2] + i11);
        }
        int i12 = A11[0] + 2;
        int i13 = A11[1];
        if (i12 >= i13 || i13 != A11[2]) {
            int lastIndexOf = str.lastIndexOf(47, A11[2] - 1);
            int i14 = lastIndexOf == -1 ? A11[1] : lastIndexOf + 1;
            sb2.append((CharSequence) str, 0, i14);
            sb2.append(str2);
            return M(sb2, A11[1], i14 + A10[2]);
        }
        sb2.append((CharSequence) str, 0, i13);
        sb2.append('/');
        sb2.append(str2);
        int i15 = A11[1];
        return M(sb2, i15, A10[2] + i15 + 1);
    }

    public static Uri O(String str, String str2) {
        return Uri.parse(N(str, str2));
    }

    public static void P(MediaFormat mediaFormat, List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            mediaFormat.setByteBuffer(h3.o.l(i7, "csd-"), ByteBuffer.wrap((byte[]) list.get(i7)));
        }
    }

    public static int Q(int i7, byte[] bArr) {
        int i10;
        synchronized (f21157f) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i7) {
                while (true) {
                    if (i11 >= i7 - 2) {
                        i11 = i7;
                        break;
                    }
                    try {
                        if (bArr[i11] == 0 && bArr[i11 + 1] == 0 && bArr[i11 + 2] == 3) {
                            break;
                        }
                        i11++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i11 < i7) {
                    int[] iArr = g;
                    if (iArr.length <= i12) {
                        g = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    g[i12] = i11;
                    i11 += 3;
                    i12++;
                }
            }
            i10 = i7 - i12;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < i12; i15++) {
                int i16 = g[i15] - i14;
                System.arraycopy(bArr, i14, bArr, i13, i16);
                int i17 = i13 + i16;
                int i18 = i17 + 1;
                bArr[i17] = 0;
                i13 = i17 + 2;
                bArr[i18] = 0;
                i14 += i16 + 3;
            }
            System.arraycopy(bArr, i14, bArr, i13, i10 - i13);
        }
        return i10;
    }

    public static void R(Exception exc, String str, String str2) {
        S(str, b(str2, exc));
    }

    public static void S(String str, String str2) {
        synchronized (f21154c) {
            Log.w(str, str2);
        }
    }

    public static long a() {
        DatagramSocket datagramSocket;
        long j10;
        synchronized (f21159i) {
        }
        InetAddress byName = InetAddress.getByName("time.android.com");
        DatagramSocket datagramSocket2 = new DatagramSocket();
        try {
            datagramSocket2.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (currentTimeMillis == 0) {
                Arrays.fill(bArr, 40, 48, (byte) 0);
                j10 = currentTimeMillis;
                datagramSocket = datagramSocket2;
            } else {
                long j11 = currentTimeMillis / 1000;
                long j12 = currentTimeMillis - (j11 * 1000);
                long j13 = j11 + 2208988800L;
                j10 = currentTimeMillis;
                bArr[40] = (byte) (j13 >> 24);
                bArr[41] = (byte) (j13 >> 16);
                datagramSocket = datagramSocket2;
                try {
                    bArr[42] = (byte) (j13 >> 8);
                    bArr[43] = (byte) j13;
                    long j14 = (j12 * 4294967296L) / 1000;
                    bArr[44] = (byte) (j14 >> 24);
                    bArr[45] = (byte) (j14 >> 16);
                    bArr[46] = (byte) (j14 >> 8);
                    bArr[47] = (byte) (Math.random() * 255.0d);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    try {
                        datagramSocket.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long j15 = (elapsedRealtime2 - elapsedRealtime) + j10;
            byte b2 = bArr[0];
            int i7 = bArr[1] & 255;
            long L = L(24, bArr);
            long L10 = L(32, bArr);
            long L11 = L(40, bArr);
            p((byte) ((b2 >> 6) & 3), (byte) (b2 & 7), i7, L11);
            long j16 = (j15 + (((L11 - j15) + (L10 - L)) / 2)) - elapsedRealtime2;
            datagramSocket.close();
            return j16;
        } catch (Throwable th4) {
            th = th4;
            datagramSocket = datagramSocket2;
        }
    }

    public static String b(String str, Throwable th) {
        String replace;
        synchronized (f21154c) {
            try {
                if (th != null) {
                    Throwable th2 = th;
                    while (true) {
                        if (th2 == null) {
                            replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                            break;
                        }
                        if (th2 instanceof UnknownHostException) {
                            replace = "UnknownHostException (no network)";
                        } else {
                            th2 = th2.getCause();
                        }
                    }
                } else {
                    replace = null;
                }
            } finally {
            }
        }
        if (TextUtils.isEmpty(replace)) {
            return str;
        }
        StringBuilder n6 = A3.c.n(str, "\n  ");
        n6.append(replace.replace("\n", "\n  "));
        n6.append('\n');
        return n6.toString();
    }

    public static void c(String str) {
        if (D.f21141a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void d(int i7, int i10) {
        GLES20.glBindTexture(i7, i10);
        i();
        GLES20.glTexParameteri(i7, 10240, 9729);
        i();
        GLES20.glTexParameteri(i7, 10241, 9729);
        i();
        GLES20.glTexParameteri(i7, 10242, 33071);
        i();
        GLES20.glTexParameteri(i7, 10243, 33071);
        i();
    }

    public static String e(int i7, int i10, int i11) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i7), Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public static String f(int i7, boolean z8, int i10, int i11, int[] iArr, int i12) {
        Object[] objArr = {f21153b[i7], Integer.valueOf(i10), Integer.valueOf(i11), Character.valueOf(z8 ? 'H' : 'L'), Integer.valueOf(i12)};
        int i13 = D.f21141a;
        StringBuilder sb2 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i14 = 0; i14 < length; i14++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i14])));
        }
        return sb2.toString();
    }

    public static void g(String str, boolean z8) {
        if (!z8) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void h(boolean z8) {
        if (!z8) {
            throw new IllegalArgumentException();
        }
    }

    public static void i() {
        StringBuilder sb2 = new StringBuilder();
        boolean z8 = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z8) {
                sb2.append('\n');
            }
            sb2.append("glError: ");
            sb2.append(GLU.gluErrorString(glGetError));
            z8 = true;
        }
        if (z8) {
            throw new Exception(sb2.toString());
        }
    }

    public static void j(String str, boolean z8) {
        if (!z8) {
            throw new Exception(str);
        }
    }

    public static void k(int i7, int i10) {
        if (i7 < 0 || i7 >= i10) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void l(Object obj) {
        obj.getClass();
    }

    public static void m(boolean z8) {
        if (!z8) {
            throw new IllegalStateException();
        }
    }

    public static void n(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    public static void o(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void p(byte b2, byte b10, int i7, long j10) {
        if (b2 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b10 != 4 && b10 != 5) {
            throw new IOException(h3.o.l(b10, "SNTP: Untrusted mode: "));
        }
        if (i7 == 0 || i7 > 15) {
            throw new IOException(h3.o.l(i7, "SNTP: Untrusted stratum: "));
        }
        if (j10 == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    public static void q(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static FloatBuffer r(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    public static void s(String str, String str2) {
        synchronized (f21154c) {
            Log.d(str, str2);
        }
    }

    public static void t(String str, String str2) {
        synchronized (f21154c) {
            Log.e(str, str2);
        }
    }

    public static void u(String str, String str2, Throwable th) {
        t(str, b(str2, th));
    }

    public static void v() {
        if (D.f21141a >= 18) {
            Trace.endSection();
        }
    }

    public static int w(byte[] bArr, int i7, int i10, boolean[] zArr) {
        int i11 = i10 - i7;
        m(i11 >= 0);
        if (i11 == 0) {
            return i10;
        }
        if (zArr[0]) {
            q(zArr);
            return i7 - 3;
        }
        if (i11 > 1 && zArr[1] && bArr[i7] == 1) {
            q(zArr);
            return i7 - 2;
        }
        if (i11 > 2 && zArr[2] && bArr[i7] == 0 && bArr[i7 + 1] == 1) {
            q(zArr);
            return i7 - 1;
        }
        int i12 = i10 - 1;
        int i13 = i7 + 2;
        while (i13 < i12) {
            byte b2 = bArr[i13];
            if ((b2 & 254) == 0) {
                int i14 = i13 - 2;
                if (bArr[i14] == 0 && bArr[i13 - 1] == 0 && b2 == 1) {
                    q(zArr);
                    return i14;
                }
                i13 -= 2;
            }
            i13 += 3;
        }
        zArr[0] = i11 <= 2 ? !(i11 != 2 ? !(zArr[1] && bArr[i12] == 1) : !(zArr[2] && bArr[i10 + (-2)] == 0 && bArr[i12] == 1)) : bArr[i10 + (-3)] == 0 && bArr[i10 + (-2)] == 0 && bArr[i12] == 1;
        zArr[1] = i11 <= 1 ? zArr[2] && bArr[i12] == 0 : bArr[i10 + (-2)] == 0 && bArr[i12] == 0;
        zArr[2] = bArr[i12] == 0;
        return i10;
    }

    public static t0 x(InterfaceC1567f interfaceC1567f, ArrayList arrayList) {
        F f4 = H.f7232b;
        N6.r.e(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i7 = 0;
        int i10 = 0;
        boolean z8 = false;
        while (i7 < arrayList.size()) {
            Bundle bundle = (Bundle) arrayList.get(i7);
            bundle.getClass();
            InterfaceC1569g c10 = interfaceC1567f.c(bundle);
            c10.getClass();
            int i11 = i10 + 1;
            if (objArr.length < i11) {
                objArr = Arrays.copyOf(objArr, N6.B.f(objArr.length, i11));
            } else if (z8) {
                objArr = (Object[]) objArr.clone();
            } else {
                objArr[i10] = c10;
                i7++;
                i10++;
            }
            z8 = false;
            objArr[i10] = c10;
            i7++;
            i10++;
        }
        return H.D(i10, objArr);
    }

    public static String y(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i7 = 0; i7 < attributeCount; i7++) {
            if (xmlPullParser.getAttributeName(i7).equals(str)) {
                return xmlPullParser.getAttributeValue(i7);
            }
        }
        return null;
    }

    public static int z(int i7, int i10) {
        for (int i11 = 1; i11 <= 2; i11++) {
            int i12 = (i7 + i11) % 3;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2 && (i10 & 2) != 0) {
                    }
                } else if ((i10 & 1) == 0) {
                }
            }
            return i12;
        }
        return i7;
    }
}
