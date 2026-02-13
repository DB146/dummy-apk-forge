package o5;

import B0.M;
import E4.x;
import I2.C0330t;
import N6.B;
import N6.F;
import N6.H;
import N6.t0;
import P4.d0;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
import m4.AbstractC1565e;
import m4.D0;
import m4.K;
import m4.L;
import m4.SurfaceHolderCallbackC1596z;
import n5.AbstractC1705a;
import n5.D;
import r4.InterfaceC1938j;

/* loaded from: classes.dex */
public final class i extends E4.q {

    /* renamed from: A1, reason: collision with root package name */
    public static final int[] f21966A1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean B1;

    /* renamed from: C1, reason: collision with root package name */
    public static boolean f21967C1;

    /* renamed from: S0, reason: collision with root package name */
    public final Context f21968S0;

    /* renamed from: T0, reason: collision with root package name */
    public final t f21969T0;

    /* renamed from: U0, reason: collision with root package name */
    public final ha.g f21970U0;

    /* renamed from: V0, reason: collision with root package name */
    public final C0330t f21971V0;

    /* renamed from: W0, reason: collision with root package name */
    public final long f21972W0;

    /* renamed from: X0, reason: collision with root package name */
    public final int f21973X0;

    /* renamed from: Y0, reason: collision with root package name */
    public final boolean f21974Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public E3.h f21975Z0;

    /* renamed from: a1, reason: collision with root package name */
    public boolean f21976a1;

    /* renamed from: b1, reason: collision with root package name */
    public boolean f21977b1;

    /* renamed from: c1, reason: collision with root package name */
    public Surface f21978c1;

    /* renamed from: d1, reason: collision with root package name */
    public k f21979d1;

    /* renamed from: e1, reason: collision with root package name */
    public boolean f21980e1;

    /* renamed from: f1, reason: collision with root package name */
    public int f21981f1;

    /* renamed from: g1, reason: collision with root package name */
    public boolean f21982g1;

    /* renamed from: h1, reason: collision with root package name */
    public boolean f21983h1;

    /* renamed from: i1, reason: collision with root package name */
    public boolean f21984i1;

    /* renamed from: j1, reason: collision with root package name */
    public long f21985j1;

    /* renamed from: k1, reason: collision with root package name */
    public long f21986k1;

    /* renamed from: l1, reason: collision with root package name */
    public long f21987l1;

    /* renamed from: m1, reason: collision with root package name */
    public int f21988m1;

    /* renamed from: n1, reason: collision with root package name */
    public int f21989n1;

    /* renamed from: o1, reason: collision with root package name */
    public int f21990o1;
    public long p1;

    /* renamed from: q1, reason: collision with root package name */
    public long f21991q1;

    /* renamed from: r1, reason: collision with root package name */
    public long f21992r1;

    /* renamed from: s1, reason: collision with root package name */
    public int f21993s1;
    public long t1;

    /* renamed from: u1, reason: collision with root package name */
    public w f21994u1;

    /* renamed from: v1, reason: collision with root package name */
    public w f21995v1;

    /* renamed from: w1, reason: collision with root package name */
    public boolean f21996w1;

    /* renamed from: x1, reason: collision with root package name */
    public int f21997x1;

    /* renamed from: y1, reason: collision with root package name */
    public h f21998y1;

    /* renamed from: z1, reason: collision with root package name */
    public o f21999z1;

    public i(Context context, E4.i iVar, Handler handler, SurfaceHolderCallbackC1596z surfaceHolderCallbackC1596z) {
        super(2, iVar, 30.0f);
        this.f21972W0 = 5000L;
        this.f21973X0 = 50;
        Context applicationContext = context.getApplicationContext();
        this.f21968S0 = applicationContext;
        t tVar = new t(applicationContext);
        this.f21969T0 = tVar;
        this.f21970U0 = new ha.g(5, handler, surfaceHolderCallbackC1596z);
        this.f21971V0 = new C0330t(tVar, this);
        this.f21974Y0 = "NVIDIA".equals(D.f21143c);
        this.f21986k1 = -9223372036854775807L;
        this.f21981f1 = 1;
        this.f21994u1 = w.f22047e;
        this.f21997x1 = 0;
        this.f21995v1 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x074f, code lost:
    
        if (r14.equals("A10-70L") == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x08b7, code lost:
    
        if (r1.equals("JSN-L21") == false) goto L662;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008f A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean u0(String str) {
        char c10;
        boolean z8;
        char c11 = 26;
        boolean z10 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (i.class) {
            try {
                if (!B1) {
                    int i7 = D.f21141a;
                    if (i7 <= 28) {
                        String str2 = D.f21142b;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -1339091551:
                                if (str2.equals("dangal")) {
                                    z8 = false;
                                    break;
                                }
                                z8 = -1;
                                break;
                            case -1220081023:
                                if (str2.equals("dangalFHD")) {
                                    z8 = true;
                                    break;
                                }
                                z8 = -1;
                                break;
                            case -1220066608:
                                if (str2.equals("dangalUHD")) {
                                    z8 = 2;
                                    break;
                                }
                                z8 = -1;
                                break;
                            case -1012436106:
                                if (str2.equals("oneday")) {
                                    z8 = 3;
                                    break;
                                }
                                z8 = -1;
                                break;
                            case -760312546:
                                if (str2.equals("aquaman")) {
                                    z8 = 4;
                                    break;
                                }
                                z8 = -1;
                                break;
                            case -64886864:
                                if (str2.equals("magnolia")) {
                                    z8 = 5;
                                    break;
                                }
                                z8 = -1;
                                break;
                            case 3415681:
                                if (str2.equals("once")) {
                                    z8 = 6;
                                    break;
                                }
                                z8 = -1;
                                break;
                            case 825323514:
                                if (str2.equals("machuca")) {
                                    z8 = 7;
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
                            case true:
                            case true:
                            case true:
                            case true:
                            case true:
                            case true:
                            case true:
                                z10 = true;
                                break;
                        }
                        f21967C1 = z10;
                        B1 = true;
                    }
                    if (i7 > 27 || !"HWEML".equals(D.f21142b)) {
                        String str3 = D.f21144d;
                        str3.getClass();
                        switch (str3.hashCode()) {
                            case -349662828:
                                if (str3.equals("AFTJMST12")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -321033677:
                                if (str3.equals("AFTKMST12")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 2006354:
                                if (str3.equals("AFTA")) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 2006367:
                                if (str3.equals("AFTN")) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 2006371:
                                if (str3.equals("AFTR")) {
                                    c10 = 4;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1785421873:
                                if (str3.equals("AFTEU011")) {
                                    c10 = 5;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1785421876:
                                if (str3.equals("AFTEU014")) {
                                    c10 = 6;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1798172390:
                                if (str3.equals("AFTSO001")) {
                                    c10 = 7;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 2119412532:
                                if (str3.equals("AFTEUFF014")) {
                                    c10 = '\b';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            default:
                                c10 = 65535;
                                break;
                        }
                        switch (c10) {
                            default:
                                if (i7 <= 26) {
                                    String str4 = D.f21142b;
                                    str4.getClass();
                                    switch (str4.hashCode()) {
                                        case -2144781245:
                                            if (str4.equals("GIONEE_SWW1609")) {
                                                c11 = 0;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -2144781185:
                                            if (str4.equals("GIONEE_SWW1627")) {
                                                c11 = 1;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -2144781160:
                                            if (str4.equals("GIONEE_SWW1631")) {
                                                c11 = 2;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -2097309513:
                                            if (str4.equals("K50a40")) {
                                                c11 = 3;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -2022874474:
                                            if (str4.equals("CP8676_I02")) {
                                                c11 = 4;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1978993182:
                                            if (str4.equals("NX541J")) {
                                                c11 = 5;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1978990237:
                                            if (str4.equals("NX573J")) {
                                                c11 = 6;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1936688988:
                                            if (str4.equals("PGN528")) {
                                                c11 = 7;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1936688066:
                                            if (str4.equals("PGN610")) {
                                                c11 = '\b';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1936688065:
                                            if (str4.equals("PGN611")) {
                                                c11 = '\t';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1931988508:
                                            if (str4.equals("AquaPowerM")) {
                                                c11 = '\n';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1885099851:
                                            if (str4.equals("RAIJIN")) {
                                                c11 = 11;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1696512866:
                                            if (str4.equals("XT1663")) {
                                                c11 = '\f';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1680025915:
                                            if (str4.equals("ComioS1")) {
                                                c11 = '\r';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1615810839:
                                            if (str4.equals("Phantom6")) {
                                                c11 = 14;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1600724499:
                                            if (str4.equals("pacificrim")) {
                                                c11 = 15;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1554255044:
                                            if (str4.equals("vernee_M5")) {
                                                c11 = 16;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1481772737:
                                            if (str4.equals("panell_dl")) {
                                                c11 = 17;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1481772730:
                                            if (str4.equals("panell_ds")) {
                                                c11 = 18;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1481772729:
                                            if (str4.equals("panell_dt")) {
                                                c11 = 19;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1320080169:
                                            if (str4.equals("GiONEE_GBL7319")) {
                                                c11 = 20;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1217592143:
                                            if (str4.equals("BRAVIA_ATV2")) {
                                                c11 = 21;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1180384755:
                                            if (str4.equals("iris60")) {
                                                c11 = 22;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1139198265:
                                            if (str4.equals("Slate_Pro")) {
                                                c11 = 23;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1052835013:
                                            if (str4.equals("namath")) {
                                                c11 = 24;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -993250464:
                                            if (str4.equals("A10-70F")) {
                                                c11 = 25;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -993250458:
                                            break;
                                        case -965403638:
                                            if (str4.equals("s905x018")) {
                                                c11 = 27;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -958336948:
                                            if (str4.equals("ELUGA_Ray_X")) {
                                                c11 = 28;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -879245230:
                                            if (str4.equals("tcl_eu")) {
                                                c11 = 29;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -842500323:
                                            if (str4.equals("nicklaus_f")) {
                                                c11 = 30;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -821392978:
                                            if (str4.equals("A7000-a")) {
                                                c11 = 31;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -797483286:
                                            if (str4.equals("SVP-DTV15")) {
                                                c11 = ' ';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -794946968:
                                            if (str4.equals("watson")) {
                                                c11 = '!';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -788334647:
                                            if (str4.equals("whyred")) {
                                                c11 = '\"';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -782144577:
                                            if (str4.equals("OnePlus5T")) {
                                                c11 = '#';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -575125681:
                                            if (str4.equals("GiONEE_CBL7513")) {
                                                c11 = '$';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -521118391:
                                            if (str4.equals("GIONEE_GBL7360")) {
                                                c11 = '%';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -430914369:
                                            if (str4.equals("Pixi4-7_3G")) {
                                                c11 = '&';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -290434366:
                                            if (str4.equals("taido_row")) {
                                                c11 = '\'';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -282781963:
                                            if (str4.equals("BLACK-1X")) {
                                                c11 = '(';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -277133239:
                                            if (str4.equals("Z12_PRO")) {
                                                c11 = ')';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -173639913:
                                            if (str4.equals("ELUGA_A3_Pro")) {
                                                c11 = '*';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -56598463:
                                            if (str4.equals("woods_fn")) {
                                                c11 = '+';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2126:
                                            if (str4.equals("C1")) {
                                                c11 = ',';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2564:
                                            if (str4.equals("Q5")) {
                                                c11 = '-';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2715:
                                            if (str4.equals("V1")) {
                                                c11 = '.';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2719:
                                            if (str4.equals("V5")) {
                                                c11 = '/';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 3091:
                                            if (str4.equals("b5")) {
                                                c11 = '0';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 3483:
                                            if (str4.equals("mh")) {
                                                c11 = '1';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 73405:
                                            if (str4.equals("JGZ")) {
                                                c11 = '2';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 75537:
                                            if (str4.equals("M04")) {
                                                c11 = '3';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 75739:
                                            if (str4.equals("M5c")) {
                                                c11 = '4';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 76779:
                                            if (str4.equals("MX6")) {
                                                c11 = '5';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 78669:
                                            if (str4.equals("P85")) {
                                                c11 = '6';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 79305:
                                            if (str4.equals("PLE")) {
                                                c11 = '7';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 80618:
                                            if (str4.equals("QX1")) {
                                                c11 = '8';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 88274:
                                            if (str4.equals("Z80")) {
                                                c11 = '9';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 98846:
                                            if (str4.equals("cv1")) {
                                                c11 = ':';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 98848:
                                            if (str4.equals("cv3")) {
                                                c11 = ';';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 99329:
                                            if (str4.equals("deb")) {
                                                c11 = '<';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 101481:
                                            if (str4.equals("flo")) {
                                                c11 = '=';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 1513190:
                                            if (str4.equals("1601")) {
                                                c11 = '>';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 1514184:
                                            if (str4.equals("1713")) {
                                                c11 = '?';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 1514185:
                                            if (str4.equals("1714")) {
                                                c11 = '@';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2133089:
                                            if (str4.equals("F01H")) {
                                                c11 = 'A';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2133091:
                                            if (str4.equals("F01J")) {
                                                c11 = 'B';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2133120:
                                            if (str4.equals("F02H")) {
                                                c11 = 'C';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2133151:
                                            if (str4.equals("F03H")) {
                                                c11 = 'D';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2133182:
                                            if (str4.equals("F04H")) {
                                                c11 = 'E';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2133184:
                                            if (str4.equals("F04J")) {
                                                c11 = 'F';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2436959:
                                            if (str4.equals("P681")) {
                                                c11 = 'G';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2463773:
                                            if (str4.equals("Q350")) {
                                                c11 = 'H';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2464648:
                                            if (str4.equals("Q427")) {
                                                c11 = 'I';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2689555:
                                            if (str4.equals("XE2X")) {
                                                c11 = 'J';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 3154429:
                                            if (str4.equals("fugu")) {
                                                c11 = 'K';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 3284551:
                                            if (str4.equals("kate")) {
                                                c11 = 'L';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 3351335:
                                            if (str4.equals("mido")) {
                                                c11 = 'M';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 3386211:
                                            if (str4.equals("p212")) {
                                                c11 = 'N';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 41325051:
                                            if (str4.equals("MEIZU_M5")) {
                                                c11 = 'O';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 51349633:
                                            if (str4.equals("601LV")) {
                                                c11 = 'P';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 51350594:
                                            if (str4.equals("602LV")) {
                                                c11 = 'Q';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 55178625:
                                            if (str4.equals("Aura_Note_2")) {
                                                c11 = 'R';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 61542055:
                                            if (str4.equals("A1601")) {
                                                c11 = 'S';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 65355429:
                                            if (str4.equals("E5643")) {
                                                c11 = 'T';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 66214468:
                                            if (str4.equals("F3111")) {
                                                c11 = 'U';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 66214470:
                                            if (str4.equals("F3113")) {
                                                c11 = 'V';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 66214473:
                                            if (str4.equals("F3116")) {
                                                c11 = 'W';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 66215429:
                                            if (str4.equals("F3211")) {
                                                c11 = 'X';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 66215431:
                                            if (str4.equals("F3213")) {
                                                c11 = 'Y';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 66215433:
                                            if (str4.equals("F3215")) {
                                                c11 = 'Z';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 66216390:
                                            if (str4.equals("F3311")) {
                                                c11 = '[';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 76402249:
                                            if (str4.equals("PRO7S")) {
                                                c11 = '\\';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 76404105:
                                            if (str4.equals("Q4260")) {
                                                c11 = ']';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 76404911:
                                            if (str4.equals("Q4310")) {
                                                c11 = '^';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 80963634:
                                            if (str4.equals("V23GB")) {
                                                c11 = '_';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 82882791:
                                            if (str4.equals("X3_HK")) {
                                                c11 = '`';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 98715550:
                                            if (str4.equals("i9031")) {
                                                c11 = 'a';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 101370885:
                                            if (str4.equals("l5460")) {
                                                c11 = 'b';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 102844228:
                                            if (str4.equals("le_x6")) {
                                                c11 = 'c';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 165221241:
                                            if (str4.equals("A2016a40")) {
                                                c11 = 'd';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 182191441:
                                            if (str4.equals("CPY83_I00")) {
                                                c11 = 'e';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 245388979:
                                            if (str4.equals("marino_f")) {
                                                c11 = 'f';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 287431619:
                                            if (str4.equals("griffin")) {
                                                c11 = 'g';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 307593612:
                                            if (str4.equals("A7010a48")) {
                                                c11 = 'h';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 308517133:
                                            if (str4.equals("A7020a48")) {
                                                c11 = 'i';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 316215098:
                                            if (str4.equals("TB3-730F")) {
                                                c11 = 'j';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 316215116:
                                            if (str4.equals("TB3-730X")) {
                                                c11 = 'k';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 316246811:
                                            if (str4.equals("TB3-850F")) {
                                                c11 = 'l';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 316246818:
                                            if (str4.equals("TB3-850M")) {
                                                c11 = 'm';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 407160593:
                                            if (str4.equals("Pixi5-10_4G")) {
                                                c11 = 'n';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 507412548:
                                            if (str4.equals("QM16XE_U")) {
                                                c11 = 'o';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 793982701:
                                            if (str4.equals("GIONEE_WBL5708")) {
                                                c11 = 'p';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 794038622:
                                            if (str4.equals("GIONEE_WBL7365")) {
                                                c11 = 'q';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 794040393:
                                            if (str4.equals("GIONEE_WBL7519")) {
                                                c11 = 'r';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 835649806:
                                            if (str4.equals("manning")) {
                                                c11 = 's';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 917340916:
                                            if (str4.equals("A7000plus")) {
                                                c11 = 't';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 958008161:
                                            if (str4.equals("j2xlteins")) {
                                                c11 = 'u';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 1060579533:
                                            if (str4.equals("panell_d")) {
                                                c11 = 'v';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 1150207623:
                                            if (str4.equals("LS-5017")) {
                                                c11 = 'w';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 1176899427:
                                            if (str4.equals("itel_S41")) {
                                                c11 = 'x';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 1280332038:
                                            if (str4.equals("hwALE-H")) {
                                                c11 = 'y';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 1306947716:
                                            if (str4.equals("EverStar_S")) {
                                                c11 = 'z';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 1349174697:
                                            if (str4.equals("htc_e56ml_dtul")) {
                                                c11 = '{';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 1522194893:
                                            if (str4.equals("woods_f")) {
                                                c11 = '|';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 1691543273:
                                            if (str4.equals("CPH1609")) {
                                                c11 = '}';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 1691544261:
                                            if (str4.equals("CPH1715")) {
                                                c11 = '~';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 1709443163:
                                            if (str4.equals("iball8735_9806")) {
                                                c11 = 127;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 1865889110:
                                            if (str4.equals("santoni")) {
                                                c11 = 128;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 1906253259:
                                            if (str4.equals("PB2-670M")) {
                                                c11 = 129;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 1977196784:
                                            if (str4.equals("Infinix-X572")) {
                                                c11 = 130;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2006372676:
                                            if (str4.equals("BRAVIA_ATV3_4K")) {
                                                c11 = 131;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2019281702:
                                            if (str4.equals("DM-01K")) {
                                                c11 = 132;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2029784656:
                                            if (str4.equals("HWBLN-H")) {
                                                c11 = 133;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2030379515:
                                            if (str4.equals("HWCAM-H")) {
                                                c11 = 134;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2033393791:
                                            if (str4.equals("ASUS_X00AD_2")) {
                                                c11 = 135;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2047190025:
                                            if (str4.equals("ELUGA_Note")) {
                                                c11 = 136;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2047252157:
                                            if (str4.equals("ELUGA_Prim")) {
                                                c11 = 137;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2048319463:
                                            if (str4.equals("HWVNS-H")) {
                                                c11 = 138;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2048855701:
                                            if (str4.equals("HWWAS-H")) {
                                                c11 = 139;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        default:
                                            c11 = 65535;
                                            break;
                                    }
                                    switch (c11) {
                                    }
                                }
                                break;
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                                break;
                        }
                        f21967C1 = z10;
                        B1 = true;
                    }
                    z10 = true;
                    f21967C1 = z10;
                    B1 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f21967C1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0070, code lost:
    
        if (r10.equals("video/hevc") == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int v0(E4.m mVar, L l10) {
        int i7;
        int intValue;
        char c10 = 2;
        int i10 = l10.f20068E;
        if (i10 == -1 || (i7 = l10.f20069F) == -1) {
            return -1;
        }
        String str = l10.f20096z;
        if ("video/dolby-vision".equals(str)) {
            Pair d10 = x.d(l10);
            str = (d10 == null || !((intValue = ((Integer) d10.first).intValue()) == 512 || intValue == 1 || intValue == 2)) ? "video/hevc" : "video/avc";
        }
        str.getClass();
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -1662735862:
                if (str.equals("video/av01")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -1662541442:
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c10 = 6;
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
            case 1:
            case 3:
            case 5:
                return ((i10 * i7) * 3) / 4;
            case 2:
                return Math.max(2097152, ((i10 * i7) * 3) / 4);
            case 4:
                String str2 = D.f21144d;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(D.f21143c) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && mVar.f3586f)))) {
                    return -1;
                }
                return ((D.f(i7, 16) * D.f(i10, 16)) * 768) / 4;
            case 6:
                return ((i10 * i7) * 3) / 8;
            default:
                return -1;
        }
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [N6.B, N6.E] */
    public static List w0(Context context, E4.r rVar, L l10, boolean z8, boolean z10) {
        List e2;
        List e10;
        String str = l10.f20096z;
        if (str == null) {
            F f4 = H.f7232b;
            return t0.f7341e;
        }
        if (D.f21141a >= 26 && "video/dolby-vision".equals(str) && !g.a(context)) {
            String b2 = x.b(l10);
            if (b2 == null) {
                F f10 = H.f7232b;
                e10 = t0.f7341e;
            } else {
                rVar.getClass();
                e10 = x.e(b2, z8, z10);
            }
            if (!e10.isEmpty()) {
                return e10;
            }
        }
        Pattern pattern = x.f3667a;
        rVar.getClass();
        List e11 = x.e(l10.f20096z, z8, z10);
        String b10 = x.b(l10);
        if (b10 == null) {
            F f11 = H.f7232b;
            e2 = t0.f7341e;
        } else {
            e2 = x.e(b10, z8, z10);
        }
        F f12 = H.f7232b;
        ?? b11 = new B();
        b11.e(e11);
        b11.e(e2);
        return b11.h();
    }

    public static int x0(E4.m mVar, L l10) {
        if (l10.f20064A == -1) {
            return v0(mVar, l10);
        }
        List list = l10.f20065B;
        int size = list.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i7 += ((byte[]) list.get(i10)).length;
        }
        return l10.f20064A + i7;
    }

    public final void A0(w wVar) {
        if (wVar.equals(w.f22047e) || wVar.equals(this.f21995v1)) {
            return;
        }
        this.f21995v1 = wVar;
        this.f21970U0.t(wVar);
    }

    public final void B0(E4.j jVar, int i7) {
        AbstractC1705a.c("releaseOutputBuffer");
        jVar.d(i7, true);
        AbstractC1705a.v();
        this.f3620N0.f23452e++;
        this.f21989n1 = 0;
        this.f21971V0.getClass();
        this.f21991q1 = SystemClock.elapsedRealtime() * 1000;
        A0(this.f21994u1);
        z0();
    }

    public final void C0(E4.j jVar, int i7, long j) {
        AbstractC1705a.c("releaseOutputBuffer");
        jVar.y(i7, j);
        AbstractC1705a.v();
        this.f3620N0.f23452e++;
        this.f21989n1 = 0;
        this.f21971V0.getClass();
        this.f21991q1 = SystemClock.elapsedRealtime() * 1000;
        A0(this.f21994u1);
        z0();
    }

    @Override // E4.q
    public final q4.i D(E4.m mVar, L l10, L l11) {
        q4.i b2 = mVar.b(l10, l11);
        E3.h hVar = this.f21975Z0;
        int i7 = hVar.f3537a;
        int i10 = b2.f23468e;
        if (l11.f20068E > i7 || l11.f20069F > hVar.f3538b) {
            i10 |= 256;
        }
        if (x0(mVar, l11) > this.f21975Z0.f3539c) {
            i10 |= 64;
        }
        int i11 = i10;
        return new q4.i(mVar.f3581a, l10, l11, i11 != 0 ? 0 : b2.f23467d, i11);
    }

    public final boolean D0(E4.m mVar) {
        return D.f21141a >= 23 && !this.f21996w1 && !u0(mVar.f3581a) && (!mVar.f3586f || k.b(this.f21968S0));
    }

    @Override // E4.q
    public final E4.k E(IllegalStateException illegalStateException, E4.m mVar) {
        Surface surface = this.f21978c1;
        E4.k kVar = new E4.k(illegalStateException, mVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return kVar;
    }

    public final void E0(E4.j jVar, int i7) {
        AbstractC1705a.c("skipVideoBuffer");
        jVar.d(i7, false);
        AbstractC1705a.v();
        this.f3620N0.f23453f++;
    }

    public final void F0(int i7, int i10) {
        q4.d dVar = this.f3620N0;
        dVar.f23454h += i7;
        int i11 = i7 + i10;
        dVar.g += i11;
        this.f21988m1 += i11;
        int i12 = this.f21989n1 + i11;
        this.f21989n1 = i12;
        dVar.f23455i = Math.max(i12, dVar.f23455i);
        int i13 = this.f21973X0;
        if (i13 <= 0 || this.f21988m1 < i13) {
            return;
        }
        y0();
    }

    public final void G0(long j) {
        q4.d dVar = this.f3620N0;
        dVar.k += j;
        dVar.f23456l++;
        this.f21992r1 += j;
        this.f21993s1++;
    }

    @Override // E4.q
    public final boolean M() {
        return this.f21996w1 && D.f21141a < 23;
    }

    @Override // E4.q
    public final float N(float f4, L[] lArr) {
        float f10 = -1.0f;
        for (L l10 : lArr) {
            float f11 = l10.f20070G;
            if (f11 != -1.0f) {
                f10 = Math.max(f10, f11);
            }
        }
        if (f10 == -1.0f) {
            return -1.0f;
        }
        return f10 * f4;
    }

    @Override // E4.q
    public final ArrayList O(E4.r rVar, L l10, boolean z8) {
        List w02 = w0(this.f21968S0, rVar, l10, z8, this.f21996w1);
        Pattern pattern = x.f3667a;
        ArrayList arrayList = new ArrayList(w02);
        Collections.sort(arrayList, new M(new A1.d(l10, 15), 1));
        return arrayList;
    }

    @Override // E4.q
    public final E4.h P(E4.m mVar, L l10, MediaCrypto mediaCrypto, float f4) {
        int i7;
        C1807b c1807b;
        int i10;
        E3.h hVar;
        int i11;
        Point point;
        float f10;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Point point2;
        int i12;
        char c10;
        boolean z8;
        Pair d10;
        int v02;
        k kVar = this.f21979d1;
        if (kVar != null && kVar.f22007a != mVar.f3586f) {
            if (this.f21978c1 == kVar) {
                this.f21978c1 = null;
            }
            kVar.release();
            this.f21979d1 = null;
        }
        String str = mVar.f3583c;
        L[] lArr = this.f20360w;
        lArr.getClass();
        int i13 = l10.f20068E;
        int x02 = x0(mVar, l10);
        int length = lArr.length;
        float f11 = l10.f20070G;
        int i14 = l10.f20068E;
        C1807b c1807b2 = l10.L;
        int i15 = l10.f20069F;
        if (length == 1) {
            if (x02 != -1 && (v02 = v0(mVar, l10)) != -1) {
                x02 = Math.min((int) (x02 * 1.5f), v02);
            }
            hVar = new E3.h(i13, i15, x02);
            i7 = i14;
            c1807b = c1807b2;
            i10 = i15;
        } else {
            int length2 = lArr.length;
            int i16 = i15;
            int i17 = 0;
            boolean z10 = false;
            while (i17 < length2) {
                L l11 = lArr[i17];
                L[] lArr2 = lArr;
                if (c1807b2 != null && l11.L == null) {
                    K a9 = l11.a();
                    a9.f19995w = c1807b2;
                    l11 = new L(a9);
                }
                if (mVar.b(l10, l11).f23467d != 0) {
                    int i18 = l11.f20069F;
                    i12 = length2;
                    int i19 = l11.f20068E;
                    c10 = 65535;
                    z10 |= i19 == -1 || i18 == -1;
                    i13 = Math.max(i13, i19);
                    i16 = Math.max(i16, i18);
                    x02 = Math.max(x02, x0(mVar, l11));
                } else {
                    i12 = length2;
                    c10 = 65535;
                }
                i17++;
                lArr = lArr2;
                length2 = i12;
            }
            if (z10) {
                AbstractC1705a.S("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i13 + "x" + i16);
                boolean z11 = i15 > i14;
                int i20 = z11 ? i15 : i14;
                if (z11) {
                    i11 = i14;
                    c1807b = c1807b2;
                } else {
                    c1807b = c1807b2;
                    i11 = i15;
                }
                float f12 = i11 / i20;
                int[] iArr = f21966A1;
                i7 = i14;
                i10 = i15;
                int i21 = 0;
                while (i21 < 9) {
                    int i22 = iArr[i21];
                    int[] iArr2 = iArr;
                    int i23 = (int) (i22 * f12);
                    if (i22 <= i20 || i23 <= i11) {
                        break;
                    }
                    int i24 = i20;
                    int i25 = i11;
                    if (D.f21141a >= 21) {
                        int i26 = z11 ? i23 : i22;
                        if (!z11) {
                            i22 = i23;
                        }
                        MediaCodecInfo.CodecCapabilities codecCapabilities = mVar.f3584d;
                        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                            f10 = f12;
                            point2 = null;
                        } else {
                            int widthAlignment = videoCapabilities.getWidthAlignment();
                            int heightAlignment = videoCapabilities.getHeightAlignment();
                            f10 = f12;
                            point2 = new Point(D.f(i26, widthAlignment) * widthAlignment, D.f(i22, heightAlignment) * heightAlignment);
                        }
                        Point point3 = point2;
                        if (mVar.f(point2.x, point2.y, f11)) {
                            point = point3;
                            break;
                        }
                        i21++;
                        iArr = iArr2;
                        i20 = i24;
                        i11 = i25;
                        f12 = f10;
                    } else {
                        f10 = f12;
                        try {
                            int f13 = D.f(i22, 16) * 16;
                            int f14 = D.f(i23, 16) * 16;
                            if (f13 * f14 <= x.i()) {
                                int i27 = z11 ? f14 : f13;
                                if (!z11) {
                                    f13 = f14;
                                }
                                point = new Point(i27, f13);
                            } else {
                                i21++;
                                iArr = iArr2;
                                i20 = i24;
                                i11 = i25;
                                f12 = f10;
                            }
                        } catch (E4.u unused) {
                        }
                    }
                }
                point = null;
                if (point != null) {
                    i13 = Math.max(i13, point.x);
                    i16 = Math.max(i16, point.y);
                    K a10 = l10.a();
                    a10.f19988p = i13;
                    a10.f19989q = i16;
                    x02 = Math.max(x02, v0(mVar, new L(a10)));
                    AbstractC1705a.S("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i13 + "x" + i16);
                }
            } else {
                i7 = i14;
                c1807b = c1807b2;
                i10 = i15;
            }
            hVar = new E3.h(i13, i16, x02);
        }
        this.f21975Z0 = hVar;
        int i28 = this.f21996w1 ? this.f21997x1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i7);
        mediaFormat.setInteger("height", i10);
        AbstractC1705a.P(mediaFormat, l10.f20065B);
        if (f11 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f11);
        }
        AbstractC1705a.H(mediaFormat, "rotation-degrees", l10.f20071H);
        if (c1807b != null) {
            C1807b c1807b3 = c1807b;
            AbstractC1705a.H(mediaFormat, "color-transfer", c1807b3.f21943c);
            AbstractC1705a.H(mediaFormat, "color-standard", c1807b3.f21941a);
            AbstractC1705a.H(mediaFormat, "color-range", c1807b3.f21942b);
            byte[] bArr = c1807b3.f21944d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(l10.f20096z) && (d10 = x.d(l10)) != null) {
            AbstractC1705a.H(mediaFormat, "profile", ((Integer) d10.first).intValue());
        }
        mediaFormat.setInteger("max-width", hVar.f3537a);
        mediaFormat.setInteger("max-height", hVar.f3538b);
        AbstractC1705a.H(mediaFormat, "max-input-size", hVar.f3539c);
        if (D.f21141a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f4 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f4);
            }
        }
        if (this.f21974Y0) {
            z8 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z8 = true;
        }
        if (i28 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z8);
            mediaFormat.setInteger("audio-session-id", i28);
        }
        if (this.f21978c1 == null) {
            if (!D0(mVar)) {
                throw new IllegalStateException();
            }
            if (this.f21979d1 == null) {
                this.f21979d1 = k.c(this.f21968S0, mVar.f3586f);
            }
            this.f21978c1 = this.f21979d1;
        }
        this.f21971V0.getClass();
        return new E4.h(mVar, mediaFormat, l10, this.f21978c1, mediaCrypto);
    }

    @Override // E4.q
    public final void Q(q4.g gVar) {
        if (this.f21977b1) {
            ByteBuffer byteBuffer = gVar.f23461u;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b2 = byteBuffer.get();
                short s3 = byteBuffer.getShort();
                short s10 = byteBuffer.getShort();
                byte b10 = byteBuffer.get();
                byte b11 = byteBuffer.get();
                byteBuffer.position(0);
                if (b2 == -75 && s3 == 60 && s10 == 1 && b10 == 4) {
                    if (b11 == 0 || b11 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        E4.j jVar = this.f3632W;
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        jVar.t(bundle);
                    }
                }
            }
        }
    }

    @Override // E4.q
    public final void U(Exception exc) {
        AbstractC1705a.u("MediaCodecVideoRenderer", "Video codec error", exc);
        ha.g gVar = this.f21970U0;
        Handler handler = (Handler) gVar.f17915b;
        if (handler != null) {
            handler.post(new u(gVar, exc, 2));
        }
    }

    @Override // E4.q
    public final void V(long j, long j10, String str) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        ha.g gVar = this.f21970U0;
        Handler handler = (Handler) gVar.f17915b;
        if (handler != null) {
            handler.post(new u(gVar, str, j, j10));
        }
        this.f21976a1 = u0(str);
        E4.m mVar = this.f3639d0;
        mVar.getClass();
        boolean z8 = false;
        if (D.f21141a >= 29 && "video/x-vnd.on2.vp9".equals(mVar.f3582b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = mVar.f3584d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                }
                if (codecProfileLevelArr[i7].profile == 16384) {
                    z8 = true;
                    break;
                }
                i7++;
            }
        }
        this.f21977b1 = z8;
        int i10 = D.f21141a;
        if (i10 >= 23 && this.f21996w1) {
            E4.j jVar = this.f3632W;
            jVar.getClass();
            this.f21998y1 = new h(this, jVar);
        }
        Context context = ((i) this.f21971V0.f5200b).f21968S0;
        if (i10 >= 29) {
            int i11 = context.getApplicationContext().getApplicationInfo().targetSdkVersion;
        }
    }

    @Override // E4.q
    public final void W(String str) {
        ha.g gVar = this.f21970U0;
        Handler handler = (Handler) gVar.f17915b;
        if (handler != null) {
            handler.post(new u(gVar, str, 1));
        }
    }

    @Override // E4.q
    public final q4.i X(ha.g gVar) {
        q4.i X10 = super.X(gVar);
        L l10 = (L) gVar.f17916c;
        ha.g gVar2 = this.f21970U0;
        Handler handler = (Handler) gVar2.f17915b;
        if (handler != null) {
            handler.post(new Aa.j(gVar2, l10, X10, 29));
        }
        return X10;
    }

    @Override // E4.q
    public final void Y(L l10, MediaFormat mediaFormat) {
        int integer;
        int i7;
        E4.j jVar = this.f3632W;
        if (jVar != null) {
            jVar.h(this.f21981f1);
        }
        if (this.f21996w1) {
            i7 = l10.f20068E;
            integer = l10.f20069F;
        } else {
            mediaFormat.getClass();
            boolean z8 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z8 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z8 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i7 = integer2;
        }
        float f4 = l10.f20072I;
        boolean z10 = D.f21141a >= 21;
        C0330t c0330t = this.f21971V0;
        int i10 = l10.f20071H;
        if (!z10) {
            c0330t.getClass();
        } else if (i10 == 90 || i10 == 270) {
            f4 = 1.0f / f4;
            i10 = 0;
            int i11 = integer;
            integer = i7;
            i7 = i11;
        } else {
            i10 = 0;
        }
        this.f21994u1 = new w(f4, i7, integer, i10);
        float f10 = l10.f20070G;
        t tVar = this.f21969T0;
        tVar.f22033f = f10;
        d dVar = tVar.f22028a;
        dVar.f21953a.c();
        dVar.f21954b.c();
        dVar.f21955c = false;
        dVar.f21956d = -9223372036854775807L;
        dVar.f21957e = 0;
        tVar.b();
        c0330t.getClass();
    }

    @Override // E4.q
    public final void a0(long j) {
        super.a0(j);
        if (this.f21996w1) {
            return;
        }
        this.f21990o1--;
    }

    @Override // E4.q
    public final void b0() {
        t0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11, types: [android.view.Surface] */
    @Override // m4.AbstractC1565e, m4.y0
    public final void c(int i7, Object obj) {
        Surface surface;
        t tVar = this.f21969T0;
        C0330t c0330t = this.f21971V0;
        if (i7 != 1) {
            if (i7 == 7) {
                this.f21999z1 = (o) obj;
                return;
            }
            if (i7 == 10) {
                int intValue = ((Integer) obj).intValue();
                if (this.f21997x1 != intValue) {
                    this.f21997x1 = intValue;
                    if (this.f21996w1) {
                        h0();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i7 == 4) {
                int intValue2 = ((Integer) obj).intValue();
                this.f21981f1 = intValue2;
                E4.j jVar = this.f3632W;
                if (jVar != null) {
                    jVar.h(intValue2);
                    return;
                }
                return;
            }
            if (i7 == 5) {
                int intValue3 = ((Integer) obj).intValue();
                if (tVar.j == intValue3) {
                    return;
                }
                tVar.j = intValue3;
                tVar.c(true);
                return;
            }
            if (i7 == 13) {
                obj.getClass();
                List list = (List) obj;
                CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) c0330t.f5201c;
                if (copyOnWriteArrayList == null) {
                    c0330t.f5201c = new CopyOnWriteArrayList(list);
                    return;
                } else {
                    copyOnWriteArrayList.clear();
                    ((CopyOnWriteArrayList) c0330t.f5201c).addAll(list);
                    return;
                }
            }
            if (i7 != 14) {
                return;
            }
            obj.getClass();
            n5.w wVar = (n5.w) obj;
            if (wVar.f21233a == 0 || wVar.f21234b == 0 || (surface = this.f21978c1) == null) {
                return;
            }
            Pair pair = (Pair) c0330t.f5202d;
            if (pair != null && ((Surface) pair.first).equals(surface) && ((n5.w) ((Pair) c0330t.f5202d).second).equals(wVar)) {
                return;
            }
            c0330t.f5202d = Pair.create(surface, wVar);
            return;
        }
        k kVar = obj instanceof Surface ? (Surface) obj : null;
        if (kVar == null) {
            k kVar2 = this.f21979d1;
            if (kVar2 != null) {
                kVar = kVar2;
            } else {
                E4.m mVar = this.f3639d0;
                if (mVar != null && D0(mVar)) {
                    kVar = k.c(this.f21968S0, mVar.f3586f);
                    this.f21979d1 = kVar;
                }
            }
        }
        Surface surface2 = this.f21978c1;
        ha.g gVar = this.f21970U0;
        if (surface2 == kVar) {
            if (kVar == null || kVar == this.f21979d1) {
                return;
            }
            w wVar2 = this.f21995v1;
            if (wVar2 != null) {
                gVar.t(wVar2);
            }
            if (this.f21980e1) {
                Surface surface3 = this.f21978c1;
                Handler handler = (Handler) gVar.f17915b;
                if (handler != null) {
                    handler.post(new v7.o(gVar, surface3, SystemClock.elapsedRealtime()));
                    return;
                }
                return;
            }
            return;
        }
        this.f21978c1 = kVar;
        tVar.getClass();
        k kVar3 = kVar instanceof k ? null : kVar;
        if (tVar.f22032e != kVar3) {
            tVar.a();
            tVar.f22032e = kVar3;
            tVar.c(true);
        }
        this.f21980e1 = false;
        int i10 = this.f20358u;
        E4.j jVar2 = this.f3632W;
        if (jVar2 != null) {
            c0330t.getClass();
            if (D.f21141a < 23 || kVar == null || this.f21976a1) {
                h0();
                S();
            } else {
                jVar2.s(kVar);
            }
        }
        if (kVar == null || kVar == this.f21979d1) {
            this.f21995v1 = null;
            t0();
            c0330t.getClass();
            return;
        }
        w wVar3 = this.f21995v1;
        if (wVar3 != null) {
            gVar.t(wVar3);
        }
        t0();
        if (i10 == 2) {
            long j = this.f21972W0;
            this.f21986k1 = j > 0 ? SystemClock.elapsedRealtime() + j : -9223372036854775807L;
        }
        c0330t.getClass();
    }

    @Override // E4.q
    public final void c0(q4.g gVar) {
        boolean z8 = this.f21996w1;
        if (!z8) {
            this.f21990o1++;
        }
        if (D.f21141a >= 23 || !z8) {
            return;
        }
        long j = gVar.f23460f;
        s0(j);
        A0(this.f21994u1);
        this.f3620N0.f23452e++;
        z0();
        a0(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    @Override // E4.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d0(L l10) {
        int i7;
        C0330t c0330t = this.f21971V0;
        c0330t.getClass();
        long j = this.f3622O0.f3594b;
        if (!c0330t.f5199a) {
            return;
        }
        if (((CopyOnWriteArrayList) c0330t.f5201c) == null) {
            c0330t.f5199a = false;
            return;
        }
        D.m(null);
        C1807b c1807b = l10.L;
        i iVar = (i) c0330t.f5200b;
        iVar.getClass();
        try {
            if (c1807b != null) {
                int i10 = c1807b.f21943c;
                if (i10 == 7 || i10 == 6) {
                    if (i10 == 7) {
                        Pair.create(c1807b, new C1807b(c1807b.f21941a, c1807b.f21944d, c1807b.f21942b, 6));
                    } else {
                        Pair.create(c1807b, c1807b);
                    }
                    if (!(D.f21141a < 21) || (i7 = l10.f20071H) == 0) {
                        E6.b.y();
                        E6.b.f3724f.invoke(E6.b.f3723e.newInstance(null), null).getClass();
                        throw new ClassCastException();
                    }
                    E6.b.y();
                    Object newInstance = E6.b.f3720b.newInstance(null);
                    E6.b.f3721c.invoke(newInstance, Float.valueOf(i7));
                    E6.b.f3722d.invoke(newInstance, null).getClass();
                    throw new ClassCastException();
                }
            } else {
                C1807b c1807b2 = C1807b.f21935f;
            }
            if (D.f21141a < 21) {
            }
            E6.b.y();
            E6.b.f3724f.invoke(E6.b.f3723e.newInstance(null), null).getClass();
            throw new ClassCastException();
        } catch (Exception e2) {
            throw iVar.f(e2, l10, false, 7000);
        }
        C1807b c1807b3 = C1807b.f21935f;
        Pair.create(c1807b3, c1807b3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
    
        if ((r12 == 0 ? false : r14.g[(int) ((r12 - 1) % 15)]) != false) goto L24;
     */
    @Override // E4.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f0(long j, long j10, E4.j jVar, ByteBuffer byteBuffer, int i7, int i10, int i11, long j11, boolean z8, boolean z10, L l10) {
        boolean z11;
        long j12;
        long j13;
        jVar.getClass();
        if (this.f21985j1 == -9223372036854775807L) {
            this.f21985j1 = j;
        }
        long j14 = this.p1;
        t tVar = this.f21969T0;
        C0330t c0330t = this.f21971V0;
        if (j11 != j14) {
            c0330t.getClass();
            long j15 = tVar.f22038n;
            if (j15 != -1) {
                tVar.f22040p = j15;
                tVar.f22041q = tVar.f22039o;
            }
            tVar.f22037m++;
            long j16 = j11 * 1000;
            d dVar = tVar.f22028a;
            dVar.f21953a.b(j16);
            if (dVar.f21953a.a()) {
                dVar.f21955c = false;
            } else if (dVar.f21956d != -9223372036854775807L) {
                if (dVar.f21955c) {
                    C1808c c1808c = dVar.f21954b;
                    long j17 = c1808c.f21949d;
                }
                dVar.f21954b.c();
                dVar.f21954b.b(dVar.f21956d);
                dVar.f21955c = true;
                dVar.f21954b.b(j16);
            }
            if (dVar.f21955c && dVar.f21954b.a()) {
                C1808c c1808c2 = dVar.f21953a;
                dVar.f21953a = dVar.f21954b;
                dVar.f21954b = c1808c2;
                dVar.f21955c = false;
            }
            dVar.f21956d = j16;
            dVar.f21957e = dVar.f21953a.a() ? 0 : dVar.f21957e + 1;
            tVar.b();
            this.p1 = j11;
        }
        long j18 = j11 - this.f3622O0.f3594b;
        if (z8 && !z10) {
            E0(jVar, i7);
            return true;
        }
        boolean z12 = this.f20358u == 2;
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j19 = (long) ((j11 - j) / this.f3630U);
        if (z12) {
            j19 -= elapsedRealtime - j10;
        }
        if (this.f21978c1 == this.f21979d1) {
            if (!(j19 < -30000)) {
                return false;
            }
            E0(jVar, i7);
            G0(j19);
            return true;
        }
        boolean z13 = this.f20358u == 2;
        if (this.f21986k1 == -9223372036854775807L && j >= this.f3622O0.f3594b && ((this.f21984i1 ? !this.f21982g1 : !(!z13 && !this.f21983h1)) || (z13 && j19 < -30000 && (SystemClock.elapsedRealtime() * 1000) - this.f21991q1 > 100000))) {
            c0330t.getClass();
            this.f21971V0.getClass();
            long nanoTime = System.nanoTime();
            o oVar = this.f21999z1;
            if (oVar != null) {
                oVar.b(j18, nanoTime, l10, this.f3634Y);
            }
            if (D.f21141a >= 21) {
                C0(jVar, i7, nanoTime);
            } else {
                B0(jVar, i7);
            }
            G0(j19);
            return true;
        }
        if (!z12 || j == this.f21985j1) {
            return false;
        }
        long nanoTime2 = System.nanoTime();
        long j20 = (j19 * 1000) + nanoTime2;
        if (tVar.f22040p != -1 && tVar.f22028a.f21953a.a()) {
            d dVar2 = tVar.f22028a;
            if (dVar2.f21953a.a()) {
                C1808c c1808c3 = dVar2.f21953a;
                long j21 = c1808c3.f21950e;
                j13 = j21 == 0 ? 0L : c1808c3.f21951f / j21;
            } else {
                j13 = -9223372036854775807L;
            }
            long j22 = tVar.f22041q + (((float) ((tVar.f22037m - tVar.f22040p) * j13)) / tVar.f22035i);
            if (Math.abs(j20 - j22) <= 20000000) {
                j20 = j22;
            } else {
                tVar.f22037m = 0L;
                tVar.f22040p = -1L;
                tVar.f22038n = -1L;
            }
        }
        tVar.f22038n = tVar.f22037m;
        tVar.f22039o = j20;
        s sVar = tVar.f22030c;
        if (sVar != null && tVar.k != -9223372036854775807L) {
            long j23 = sVar.f22024a;
            if (j23 != -9223372036854775807L) {
                long j24 = tVar.k;
                long j25 = (((j20 - j23) / j24) * j24) + j23;
                if (j20 <= j25) {
                    j12 = j25 - j24;
                } else {
                    j12 = j25;
                    j25 = j24 + j25;
                }
                if (j25 - j20 >= j20 - j12) {
                    j25 = j12;
                }
                j20 = j25 - tVar.f22036l;
            }
        }
        c0330t.getClass();
        long j26 = (j20 - nanoTime2) / 1000;
        boolean z14 = this.f21986k1 != -9223372036854775807L;
        if (j26 < -500000 && !z10) {
            d0 d0Var = this.f20359v;
            d0Var.getClass();
            int h10 = d0Var.h(j - this.f20361x);
            if (h10 != 0) {
                if (z14) {
                    q4.d dVar3 = this.f3620N0;
                    dVar3.f23451d += h10;
                    dVar3.f23453f += this.f21990o1;
                } else {
                    this.f3620N0.j++;
                    F0(h10, this.f21990o1);
                }
                if (!K()) {
                    return false;
                }
                S();
                return false;
            }
        }
        if (j26 < -30000 && !z10) {
            if (z14) {
                E0(jVar, i7);
                z11 = true;
            } else {
                AbstractC1705a.c("dropVideoBuffer");
                jVar.d(i7, false);
                AbstractC1705a.v();
                z11 = true;
                F0(0, 1);
            }
            G0(j26);
            return z11;
        }
        if (D.f21141a >= 21) {
            if (j26 < 50000) {
                if (j20 == this.t1) {
                    E0(jVar, i7);
                } else {
                    o oVar2 = this.f21999z1;
                    if (oVar2 != null) {
                        oVar2.b(j18, j20, l10, this.f3634Y);
                    }
                    C0(jVar, i7, j20);
                }
                G0(j26);
                this.t1 = j20;
                return true;
            }
        } else if (j26 < 30000) {
            if (j26 > 11000) {
                try {
                    Thread.sleep((j26 - 10000) / 1000);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return false;
                }
            }
            o oVar3 = this.f21999z1;
            if (oVar3 != null) {
                oVar3.b(j18, j20, l10, this.f3634Y);
            }
            B0(jVar, i7);
            G0(j26);
            return true;
        }
        return false;
    }

    @Override // m4.AbstractC1565e
    public final String j() {
        return "MediaCodecVideoRenderer";
    }

    @Override // E4.q
    public final void j0() {
        super.j0();
        this.f21990o1 = 0;
    }

    @Override // m4.AbstractC1565e
    public final boolean l() {
        boolean z8 = this.f3613J0;
        this.f21971V0.getClass();
        return z8;
    }

    @Override // E4.q, m4.AbstractC1565e
    public final boolean m() {
        k kVar;
        if (super.m()) {
            this.f21971V0.getClass();
            if (this.f21982g1 || (((kVar = this.f21979d1) != null && this.f21978c1 == kVar) || this.f3632W == null || this.f21996w1)) {
                this.f21986k1 = -9223372036854775807L;
                return true;
            }
        }
        if (this.f21986k1 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f21986k1) {
            return true;
        }
        this.f21986k1 = -9223372036854775807L;
        return false;
    }

    @Override // E4.q, m4.AbstractC1565e
    public final void n() {
        ha.g gVar = this.f21970U0;
        this.f21995v1 = null;
        t0();
        this.f21980e1 = false;
        this.f21998y1 = null;
        try {
            super.n();
            q4.d dVar = this.f3620N0;
            gVar.getClass();
            synchronized (dVar) {
            }
            Handler handler = (Handler) gVar.f17915b;
            if (handler != null) {
                handler.post(new v(gVar, dVar, 0));
            }
            gVar.t(w.f22047e);
        } catch (Throwable th) {
            q4.d dVar2 = this.f3620N0;
            gVar.getClass();
            synchronized (dVar2) {
                Handler handler2 = (Handler) gVar.f17915b;
                if (handler2 != null) {
                    handler2.post(new v(gVar, dVar2, 0));
                }
                gVar.t(w.f22047e);
                throw th;
            }
        }
    }

    @Override // E4.q
    public final boolean n0(E4.m mVar) {
        return this.f21978c1 != null || D0(mVar);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, q4.d] */
    @Override // m4.AbstractC1565e
    public final void o(boolean z8, boolean z10) {
        this.f3620N0 = new Object();
        D0 d02 = this.f20355d;
        d02.getClass();
        boolean z11 = d02.f19882a;
        AbstractC1705a.m((z11 && this.f21997x1 == 0) ? false : true);
        if (this.f21996w1 != z11) {
            this.f21996w1 = z11;
            h0();
        }
        q4.d dVar = this.f3620N0;
        ha.g gVar = this.f21970U0;
        Handler handler = (Handler) gVar.f17915b;
        if (handler != null) {
            handler.post(new v(gVar, dVar, 1));
        }
        this.f21983h1 = z10;
        this.f21984i1 = false;
    }

    @Override // E4.q, m4.AbstractC1565e
    public final void p(long j, boolean z8) {
        super.p(j, z8);
        this.f21971V0.getClass();
        t0();
        t tVar = this.f21969T0;
        tVar.f22037m = 0L;
        tVar.f22040p = -1L;
        tVar.f22038n = -1L;
        this.p1 = -9223372036854775807L;
        this.f21985j1 = -9223372036854775807L;
        this.f21989n1 = 0;
        if (!z8) {
            this.f21986k1 = -9223372036854775807L;
        } else {
            long j10 = this.f21972W0;
            this.f21986k1 = j10 > 0 ? SystemClock.elapsedRealtime() + j10 : -9223372036854775807L;
        }
    }

    @Override // E4.q
    public final int p0(E4.r rVar, L l10) {
        boolean z8;
        int i7 = 1;
        int i10 = 0;
        if (!n5.o.l(l10.f20096z)) {
            return AbstractC1565e.e(0, 0, 0);
        }
        boolean z10 = l10.f20066C != null;
        Context context = this.f21968S0;
        List w02 = w0(context, rVar, l10, z10, false);
        if (z10 && w02.isEmpty()) {
            w02 = w0(context, rVar, l10, false, false);
        }
        if (w02.isEmpty()) {
            return AbstractC1565e.e(1, 0, 0);
        }
        int i11 = l10.f20083U;
        if (i11 != 0 && i11 != 2) {
            return AbstractC1565e.e(2, 0, 0);
        }
        E4.m mVar = (E4.m) w02.get(0);
        boolean d10 = mVar.d(l10);
        if (!d10) {
            for (int i12 = 1; i12 < w02.size(); i12++) {
                E4.m mVar2 = (E4.m) w02.get(i12);
                if (mVar2.d(l10)) {
                    d10 = true;
                    z8 = false;
                    mVar = mVar2;
                    break;
                }
            }
        }
        z8 = true;
        int i13 = d10 ? 4 : 3;
        int i14 = mVar.e(l10) ? 16 : 8;
        int i15 = mVar.g ? 64 : 0;
        int i16 = z8 ? 128 : 0;
        if (D.f21141a >= 26 && "video/dolby-vision".equals(l10.f20096z) && !g.a(context)) {
            i16 = 256;
        }
        if (d10) {
            List w03 = w0(context, rVar, l10, z10, true);
            if (!w03.isEmpty()) {
                Pattern pattern = x.f3667a;
                ArrayList arrayList = new ArrayList(w03);
                Collections.sort(arrayList, new M(new A1.d(l10, 15), i7));
                E4.m mVar3 = (E4.m) arrayList.get(0);
                if (mVar3.d(l10) && mVar3.e(l10)) {
                    i10 = 32;
                }
            }
        }
        return i13 | i14 | i10 | i15 | i16;
    }

    @Override // m4.AbstractC1565e
    public final void r() {
        C0330t c0330t = this.f21971V0;
        try {
            try {
                F();
                h0();
                InterfaceC1938j interfaceC1938j = this.f3625Q;
                if (interfaceC1938j != null) {
                    interfaceC1938j.a(null);
                }
                this.f3625Q = null;
            } catch (Throwable th) {
                InterfaceC1938j interfaceC1938j2 = this.f3625Q;
                if (interfaceC1938j2 != null) {
                    interfaceC1938j2.a(null);
                }
                this.f3625Q = null;
                throw th;
            }
        } finally {
            c0330t.getClass();
            k kVar = this.f21979d1;
            if (kVar != null) {
                if (this.f21978c1 == kVar) {
                    this.f21978c1 = null;
                }
                kVar.release();
                this.f21979d1 = null;
            }
        }
    }

    @Override // m4.AbstractC1565e
    public final void s() {
        this.f21988m1 = 0;
        this.f21987l1 = SystemClock.elapsedRealtime();
        this.f21991q1 = SystemClock.elapsedRealtime() * 1000;
        this.f21992r1 = 0L;
        this.f21993s1 = 0;
        t tVar = this.f21969T0;
        tVar.f22031d = true;
        tVar.f22037m = 0L;
        tVar.f22040p = -1L;
        tVar.f22038n = -1L;
        q qVar = tVar.f22029b;
        if (qVar != null) {
            s sVar = tVar.f22030c;
            sVar.getClass();
            sVar.f22025b.sendEmptyMessage(1);
            qVar.b(new Q9.a(tVar, 28));
        }
        tVar.c(false);
    }

    @Override // m4.AbstractC1565e
    public final void t() {
        this.f21986k1 = -9223372036854775807L;
        y0();
        int i7 = this.f21993s1;
        if (i7 != 0) {
            long j = this.f21992r1;
            ha.g gVar = this.f21970U0;
            Handler handler = (Handler) gVar.f17915b;
            if (handler != null) {
                handler.post(new u(gVar, j, i7));
            }
            this.f21992r1 = 0L;
            this.f21993s1 = 0;
        }
        t tVar = this.f21969T0;
        tVar.f22031d = false;
        q qVar = tVar.f22029b;
        if (qVar != null) {
            qVar.c();
            s sVar = tVar.f22030c;
            sVar.getClass();
            sVar.f22025b.sendEmptyMessage(2);
        }
        tVar.a();
    }

    public final void t0() {
        E4.j jVar;
        this.f21982g1 = false;
        if (D.f21141a < 23 || !this.f21996w1 || (jVar = this.f3632W) == null) {
            return;
        }
        this.f21998y1 = new h(this, jVar);
    }

    @Override // E4.q, m4.AbstractC1565e
    public final void w(long j, long j10) {
        super.w(j, j10);
        this.f21971V0.getClass();
    }

    public final void y0() {
        if (this.f21988m1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.f21987l1;
            int i7 = this.f21988m1;
            ha.g gVar = this.f21970U0;
            Handler handler = (Handler) gVar.f17915b;
            if (handler != null) {
                handler.post(new u(gVar, i7, j));
            }
            this.f21988m1 = 0;
            this.f21987l1 = elapsedRealtime;
        }
    }

    @Override // E4.q, m4.AbstractC1565e
    public final void z(float f4, float f10) {
        super.z(f4, f10);
        t tVar = this.f21969T0;
        tVar.f22035i = f4;
        tVar.f22037m = 0L;
        tVar.f22040p = -1L;
        tVar.f22038n = -1L;
        tVar.c(false);
    }

    public final void z0() {
        this.f21984i1 = true;
        if (this.f21982g1) {
            return;
        }
        this.f21982g1 = true;
        Surface surface = this.f21978c1;
        ha.g gVar = this.f21970U0;
        Handler handler = (Handler) gVar.f17915b;
        if (handler != null) {
            handler.post(new v7.o(gVar, surface, SystemClock.elapsedRealtime()));
        }
        this.f21980e1 = true;
    }
}
