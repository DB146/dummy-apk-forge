package m5;

import N6.t0;
import N6.y0;
import P4.B;
import android.content.Context;
import android.os.Handler;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.kt.apps.core.utils.blurry.BlurFactor;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import n4.C1703a;

/* renamed from: m5.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1621s implements InterfaceC1609f, T {

    /* renamed from: n, reason: collision with root package name */
    public static final t0 f20642n = N6.H.J(4400000L, 3200000L, 2300000L, 1600000L, 810000L);

    /* renamed from: o, reason: collision with root package name */
    public static final t0 f20643o = N6.H.J(1400000L, 990000L, 730000L, 510000L, 230000L);

    /* renamed from: p, reason: collision with root package name */
    public static final t0 f20644p = N6.H.J(2100000L, 1400000L, 1000000L, 890000L, 640000L);

    /* renamed from: q, reason: collision with root package name */
    public static final t0 f20645q = N6.H.J(2600000L, 1700000L, 1300000L, 1000000L, 700000L);

    /* renamed from: r, reason: collision with root package name */
    public static final t0 f20646r = N6.H.J(5700000L, 3700000L, 2300000L, 1700000L, 990000L);

    /* renamed from: s, reason: collision with root package name */
    public static final t0 f20647s = N6.H.J(2800000L, 1800000L, 1400000L, 1100000L, 870000L);

    /* renamed from: t, reason: collision with root package name */
    public static C1621s f20648t;

    /* renamed from: a, reason: collision with root package name */
    public final y0 f20649a;

    /* renamed from: b, reason: collision with root package name */
    public final R7.b f20650b = new R7.b(24);

    /* renamed from: c, reason: collision with root package name */
    public final Q f20651c;

    /* renamed from: d, reason: collision with root package name */
    public final n5.x f20652d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f20653e;

    /* renamed from: f, reason: collision with root package name */
    public int f20654f;
    public long g;

    /* renamed from: h, reason: collision with root package name */
    public long f20655h;

    /* renamed from: i, reason: collision with root package name */
    public int f20656i;
    public long j;
    public long k;

    /* renamed from: l, reason: collision with root package name */
    public long f20657l;

    /* renamed from: m, reason: collision with root package name */
    public long f20658m;

    public C1621s(Context context, HashMap hashMap, int i7, n5.x xVar, boolean z8) {
        this.f20649a = y0.b(hashMap);
        this.f20651c = new Q(i7);
        this.f20652d = xVar;
        this.f20653e = z8;
        if (context == null) {
            this.f20656i = 0;
            this.f20657l = b(0);
            return;
        }
        n5.u f4 = n5.u.f(context);
        int g = f4.g();
        this.f20656i = g;
        this.f20657l = b(g);
        r rVar = new r(this);
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) f4.f21224d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        copyOnWriteArrayList.add(new WeakReference(rVar));
        ((Handler) f4.f21223c).post(new Aa.j(23, f4, rVar));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:1052:0x0cf9, code lost:
    
        if (r8.equals("AD") == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int[] a(String str) {
        char c10 = 0;
        str.getClass();
        switch (str.hashCode()) {
            case 2083:
                break;
            case 2084:
                if (str.equals("AE")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 2085:
                if (str.equals("AF")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 2086:
                if (str.equals("AG")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 2088:
                if (str.equals("AI")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 2091:
                if (str.equals("AL")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 2092:
                if (str.equals("AM")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 2094:
                if (str.equals("AO")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 2096:
                if (str.equals("AQ")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case 2098:
                if (str.equals("AS")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case 2099:
                if (str.equals("AT")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case 2100:
                if (str.equals("AU")) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            case 2102:
                if (str.equals("AW")) {
                    c10 = '\f';
                    break;
                }
                c10 = 65535;
                break;
            case 2103:
                if (str.equals("AX")) {
                    c10 = '\r';
                    break;
                }
                c10 = 65535;
                break;
            case 2105:
                if (str.equals("AZ")) {
                    c10 = 14;
                    break;
                }
                c10 = 65535;
                break;
            case 2111:
                if (str.equals("BA")) {
                    c10 = 15;
                    break;
                }
                c10 = 65535;
                break;
            case 2112:
                if (str.equals("BB")) {
                    c10 = 16;
                    break;
                }
                c10 = 65535;
                break;
            case 2114:
                if (str.equals("BD")) {
                    c10 = 17;
                    break;
                }
                c10 = 65535;
                break;
            case 2115:
                if (str.equals("BE")) {
                    c10 = 18;
                    break;
                }
                c10 = 65535;
                break;
            case 2116:
                if (str.equals("BF")) {
                    c10 = 19;
                    break;
                }
                c10 = 65535;
                break;
            case 2117:
                if (str.equals("BG")) {
                    c10 = 20;
                    break;
                }
                c10 = 65535;
                break;
            case 2118:
                if (str.equals("BH")) {
                    c10 = 21;
                    break;
                }
                c10 = 65535;
                break;
            case 2119:
                if (str.equals("BI")) {
                    c10 = 22;
                    break;
                }
                c10 = 65535;
                break;
            case 2120:
                if (str.equals("BJ")) {
                    c10 = 23;
                    break;
                }
                c10 = 65535;
                break;
            case 2122:
                if (str.equals("BL")) {
                    c10 = 24;
                    break;
                }
                c10 = 65535;
                break;
            case 2123:
                if (str.equals("BM")) {
                    c10 = 25;
                    break;
                }
                c10 = 65535;
                break;
            case 2124:
                if (str.equals("BN")) {
                    c10 = 26;
                    break;
                }
                c10 = 65535;
                break;
            case 2125:
                if (str.equals("BO")) {
                    c10 = 27;
                    break;
                }
                c10 = 65535;
                break;
            case 2127:
                if (str.equals("BQ")) {
                    c10 = 28;
                    break;
                }
                c10 = 65535;
                break;
            case 2128:
                if (str.equals("BR")) {
                    c10 = 29;
                    break;
                }
                c10 = 65535;
                break;
            case 2129:
                if (str.equals("BS")) {
                    c10 = 30;
                    break;
                }
                c10 = 65535;
                break;
            case 2130:
                if (str.equals("BT")) {
                    c10 = 31;
                    break;
                }
                c10 = 65535;
                break;
            case 2133:
                if (str.equals("BW")) {
                    c10 = ' ';
                    break;
                }
                c10 = 65535;
                break;
            case 2135:
                if (str.equals("BY")) {
                    c10 = '!';
                    break;
                }
                c10 = 65535;
                break;
            case 2136:
                if (str.equals("BZ")) {
                    c10 = '\"';
                    break;
                }
                c10 = 65535;
                break;
            case 2142:
                if (str.equals("CA")) {
                    c10 = '#';
                    break;
                }
                c10 = 65535;
                break;
            case 2145:
                if (str.equals("CD")) {
                    c10 = '$';
                    break;
                }
                c10 = 65535;
                break;
            case 2147:
                if (str.equals("CF")) {
                    c10 = '%';
                    break;
                }
                c10 = 65535;
                break;
            case 2148:
                if (str.equals("CG")) {
                    c10 = '&';
                    break;
                }
                c10 = 65535;
                break;
            case 2149:
                if (str.equals("CH")) {
                    c10 = '\'';
                    break;
                }
                c10 = 65535;
                break;
            case 2150:
                if (str.equals("CI")) {
                    c10 = '(';
                    break;
                }
                c10 = 65535;
                break;
            case 2152:
                if (str.equals("CK")) {
                    c10 = ')';
                    break;
                }
                c10 = 65535;
                break;
            case 2153:
                if (str.equals("CL")) {
                    c10 = '*';
                    break;
                }
                c10 = 65535;
                break;
            case 2154:
                if (str.equals("CM")) {
                    c10 = '+';
                    break;
                }
                c10 = 65535;
                break;
            case 2155:
                if (str.equals("CN")) {
                    c10 = ',';
                    break;
                }
                c10 = 65535;
                break;
            case 2156:
                if (str.equals("CO")) {
                    c10 = '-';
                    break;
                }
                c10 = 65535;
                break;
            case 2159:
                if (str.equals("CR")) {
                    c10 = '.';
                    break;
                }
                c10 = 65535;
                break;
            case 2162:
                if (str.equals("CU")) {
                    c10 = '/';
                    break;
                }
                c10 = 65535;
                break;
            case 2163:
                if (str.equals("CV")) {
                    c10 = '0';
                    break;
                }
                c10 = 65535;
                break;
            case 2164:
                if (str.equals("CW")) {
                    c10 = '1';
                    break;
                }
                c10 = 65535;
                break;
            case 2165:
                if (str.equals("CX")) {
                    c10 = '2';
                    break;
                }
                c10 = 65535;
                break;
            case 2166:
                if (str.equals("CY")) {
                    c10 = '3';
                    break;
                }
                c10 = 65535;
                break;
            case 2167:
                if (str.equals("CZ")) {
                    c10 = '4';
                    break;
                }
                c10 = 65535;
                break;
            case 2177:
                if (str.equals("DE")) {
                    c10 = '5';
                    break;
                }
                c10 = 65535;
                break;
            case 2182:
                if (str.equals("DJ")) {
                    c10 = '6';
                    break;
                }
                c10 = 65535;
                break;
            case 2183:
                if (str.equals("DK")) {
                    c10 = '7';
                    break;
                }
                c10 = 65535;
                break;
            case 2185:
                if (str.equals("DM")) {
                    c10 = '8';
                    break;
                }
                c10 = 65535;
                break;
            case 2187:
                if (str.equals("DO")) {
                    c10 = '9';
                    break;
                }
                c10 = 65535;
                break;
            case 2198:
                if (str.equals("DZ")) {
                    c10 = ':';
                    break;
                }
                c10 = 65535;
                break;
            case 2206:
                if (str.equals("EC")) {
                    c10 = ';';
                    break;
                }
                c10 = 65535;
                break;
            case 2208:
                if (str.equals("EE")) {
                    c10 = '<';
                    break;
                }
                c10 = 65535;
                break;
            case 2210:
                if (str.equals("EG")) {
                    c10 = '=';
                    break;
                }
                c10 = 65535;
                break;
            case 2221:
                if (str.equals("ER")) {
                    c10 = '>';
                    break;
                }
                c10 = 65535;
                break;
            case 2222:
                if (str.equals("ES")) {
                    c10 = '?';
                    break;
                }
                c10 = 65535;
                break;
            case 2223:
                if (str.equals("ET")) {
                    c10 = '@';
                    break;
                }
                c10 = 65535;
                break;
            case 2243:
                if (str.equals("FI")) {
                    c10 = 'A';
                    break;
                }
                c10 = 65535;
                break;
            case 2244:
                if (str.equals("FJ")) {
                    c10 = 'B';
                    break;
                }
                c10 = 65535;
                break;
            case 2247:
                if (str.equals("FM")) {
                    c10 = 'C';
                    break;
                }
                c10 = 65535;
                break;
            case 2249:
                if (str.equals("FO")) {
                    c10 = 'D';
                    break;
                }
                c10 = 65535;
                break;
            case 2252:
                if (str.equals("FR")) {
                    c10 = 'E';
                    break;
                }
                c10 = 65535;
                break;
            case 2266:
                if (str.equals("GA")) {
                    c10 = 'F';
                    break;
                }
                c10 = 65535;
                break;
            case 2267:
                if (str.equals("GB")) {
                    c10 = 'G';
                    break;
                }
                c10 = 65535;
                break;
            case 2269:
                if (str.equals("GD")) {
                    c10 = 'H';
                    break;
                }
                c10 = 65535;
                break;
            case 2270:
                if (str.equals("GE")) {
                    c10 = 'I';
                    break;
                }
                c10 = 65535;
                break;
            case 2271:
                if (str.equals("GF")) {
                    c10 = 'J';
                    break;
                }
                c10 = 65535;
                break;
            case 2272:
                if (str.equals("GG")) {
                    c10 = 'K';
                    break;
                }
                c10 = 65535;
                break;
            case 2273:
                if (str.equals("GH")) {
                    c10 = 'L';
                    break;
                }
                c10 = 65535;
                break;
            case 2274:
                if (str.equals("GI")) {
                    c10 = 'M';
                    break;
                }
                c10 = 65535;
                break;
            case 2277:
                if (str.equals("GL")) {
                    c10 = 'N';
                    break;
                }
                c10 = 65535;
                break;
            case 2278:
                if (str.equals("GM")) {
                    c10 = 'O';
                    break;
                }
                c10 = 65535;
                break;
            case 2279:
                if (str.equals("GN")) {
                    c10 = 'P';
                    break;
                }
                c10 = 65535;
                break;
            case 2281:
                if (str.equals("GP")) {
                    c10 = 'Q';
                    break;
                }
                c10 = 65535;
                break;
            case 2282:
                if (str.equals("GQ")) {
                    c10 = 'R';
                    break;
                }
                c10 = 65535;
                break;
            case 2283:
                if (str.equals("GR")) {
                    c10 = 'S';
                    break;
                }
                c10 = 65535;
                break;
            case 2285:
                if (str.equals("GT")) {
                    c10 = 'T';
                    break;
                }
                c10 = 65535;
                break;
            case 2286:
                if (str.equals("GU")) {
                    c10 = 'U';
                    break;
                }
                c10 = 65535;
                break;
            case 2288:
                if (str.equals("GW")) {
                    c10 = 'V';
                    break;
                }
                c10 = 65535;
                break;
            case 2290:
                if (str.equals("GY")) {
                    c10 = 'W';
                    break;
                }
                c10 = 65535;
                break;
            case 2307:
                if (str.equals("HK")) {
                    c10 = 'X';
                    break;
                }
                c10 = 65535;
                break;
            case 2310:
                if (str.equals("HN")) {
                    c10 = 'Y';
                    break;
                }
                c10 = 65535;
                break;
            case 2314:
                if (str.equals("HR")) {
                    c10 = 'Z';
                    break;
                }
                c10 = 65535;
                break;
            case 2316:
                if (str.equals("HT")) {
                    c10 = '[';
                    break;
                }
                c10 = 65535;
                break;
            case 2317:
                if (str.equals("HU")) {
                    c10 = '\\';
                    break;
                }
                c10 = 65535;
                break;
            case 2331:
                if (str.equals("ID")) {
                    c10 = ']';
                    break;
                }
                c10 = 65535;
                break;
            case 2332:
                if (str.equals("IE")) {
                    c10 = '^';
                    break;
                }
                c10 = 65535;
                break;
            case 2339:
                if (str.equals("IL")) {
                    c10 = '_';
                    break;
                }
                c10 = 65535;
                break;
            case 2340:
                if (str.equals("IM")) {
                    c10 = '`';
                    break;
                }
                c10 = 65535;
                break;
            case 2341:
                if (str.equals("IN")) {
                    c10 = 'a';
                    break;
                }
                c10 = 65535;
                break;
            case 2342:
                if (str.equals("IO")) {
                    c10 = 'b';
                    break;
                }
                c10 = 65535;
                break;
            case 2344:
                if (str.equals("IQ")) {
                    c10 = 'c';
                    break;
                }
                c10 = 65535;
                break;
            case 2345:
                if (str.equals("IR")) {
                    c10 = 'd';
                    break;
                }
                c10 = 65535;
                break;
            case 2346:
                if (str.equals("IS")) {
                    c10 = 'e';
                    break;
                }
                c10 = 65535;
                break;
            case 2347:
                if (str.equals("IT")) {
                    c10 = 'f';
                    break;
                }
                c10 = 65535;
                break;
            case 2363:
                if (str.equals("JE")) {
                    c10 = 'g';
                    break;
                }
                c10 = 65535;
                break;
            case 2371:
                if (str.equals("JM")) {
                    c10 = 'h';
                    break;
                }
                c10 = 65535;
                break;
            case 2373:
                if (str.equals("JO")) {
                    c10 = 'i';
                    break;
                }
                c10 = 65535;
                break;
            case 2374:
                if (str.equals("JP")) {
                    c10 = 'j';
                    break;
                }
                c10 = 65535;
                break;
            case 2394:
                if (str.equals("KE")) {
                    c10 = 'k';
                    break;
                }
                c10 = 65535;
                break;
            case 2396:
                if (str.equals("KG")) {
                    c10 = 'l';
                    break;
                }
                c10 = 65535;
                break;
            case 2397:
                if (str.equals("KH")) {
                    c10 = 'm';
                    break;
                }
                c10 = 65535;
                break;
            case 2398:
                if (str.equals("KI")) {
                    c10 = 'n';
                    break;
                }
                c10 = 65535;
                break;
            case 2402:
                if (str.equals("KM")) {
                    c10 = 'o';
                    break;
                }
                c10 = 65535;
                break;
            case 2403:
                if (str.equals("KN")) {
                    c10 = 'p';
                    break;
                }
                c10 = 65535;
                break;
            case 2407:
                if (str.equals("KR")) {
                    c10 = 'q';
                    break;
                }
                c10 = 65535;
                break;
            case 2412:
                if (str.equals("KW")) {
                    c10 = 'r';
                    break;
                }
                c10 = 65535;
                break;
            case 2414:
                if (str.equals("KY")) {
                    c10 = 's';
                    break;
                }
                c10 = 65535;
                break;
            case 2415:
                if (str.equals("KZ")) {
                    c10 = 't';
                    break;
                }
                c10 = 65535;
                break;
            case 2421:
                if (str.equals("LA")) {
                    c10 = 'u';
                    break;
                }
                c10 = 65535;
                break;
            case 2422:
                if (str.equals("LB")) {
                    c10 = 'v';
                    break;
                }
                c10 = 65535;
                break;
            case 2423:
                if (str.equals("LC")) {
                    c10 = 'w';
                    break;
                }
                c10 = 65535;
                break;
            case 2429:
                if (str.equals("LI")) {
                    c10 = 'x';
                    break;
                }
                c10 = 65535;
                break;
            case 2431:
                if (str.equals("LK")) {
                    c10 = 'y';
                    break;
                }
                c10 = 65535;
                break;
            case 2438:
                if (str.equals("LR")) {
                    c10 = 'z';
                    break;
                }
                c10 = 65535;
                break;
            case 2439:
                if (str.equals("LS")) {
                    c10 = '{';
                    break;
                }
                c10 = 65535;
                break;
            case 2440:
                if (str.equals("LT")) {
                    c10 = '|';
                    break;
                }
                c10 = 65535;
                break;
            case 2441:
                if (str.equals("LU")) {
                    c10 = '}';
                    break;
                }
                c10 = 65535;
                break;
            case 2442:
                if (str.equals("LV")) {
                    c10 = '~';
                    break;
                }
                c10 = 65535;
                break;
            case 2445:
                if (str.equals("LY")) {
                    c10 = 127;
                    break;
                }
                c10 = 65535;
                break;
            case 2452:
                if (str.equals("MA")) {
                    c10 = 128;
                    break;
                }
                c10 = 65535;
                break;
            case 2454:
                if (str.equals("MC")) {
                    c10 = 129;
                    break;
                }
                c10 = 65535;
                break;
            case 2455:
                if (str.equals("MD")) {
                    c10 = 130;
                    break;
                }
                c10 = 65535;
                break;
            case 2456:
                if (str.equals("ME")) {
                    c10 = 131;
                    break;
                }
                c10 = 65535;
                break;
            case 2457:
                if (str.equals("MF")) {
                    c10 = 132;
                    break;
                }
                c10 = 65535;
                break;
            case 2458:
                if (str.equals("MG")) {
                    c10 = 133;
                    break;
                }
                c10 = 65535;
                break;
            case 2459:
                if (str.equals("MH")) {
                    c10 = 134;
                    break;
                }
                c10 = 65535;
                break;
            case 2462:
                if (str.equals("MK")) {
                    c10 = 135;
                    break;
                }
                c10 = 65535;
                break;
            case 2463:
                if (str.equals("ML")) {
                    c10 = 136;
                    break;
                }
                c10 = 65535;
                break;
            case 2464:
                if (str.equals("MM")) {
                    c10 = 137;
                    break;
                }
                c10 = 65535;
                break;
            case 2465:
                if (str.equals("MN")) {
                    c10 = 138;
                    break;
                }
                c10 = 65535;
                break;
            case 2466:
                if (str.equals("MO")) {
                    c10 = 139;
                    break;
                }
                c10 = 65535;
                break;
            case 2467:
                if (str.equals("MP")) {
                    c10 = 140;
                    break;
                }
                c10 = 65535;
                break;
            case 2468:
                if (str.equals("MQ")) {
                    c10 = 141;
                    break;
                }
                c10 = 65535;
                break;
            case 2469:
                if (str.equals("MR")) {
                    c10 = 142;
                    break;
                }
                c10 = 65535;
                break;
            case 2470:
                if (str.equals("MS")) {
                    c10 = 143;
                    break;
                }
                c10 = 65535;
                break;
            case 2471:
                if (str.equals("MT")) {
                    c10 = 144;
                    break;
                }
                c10 = 65535;
                break;
            case 2472:
                if (str.equals("MU")) {
                    c10 = 145;
                    break;
                }
                c10 = 65535;
                break;
            case 2473:
                if (str.equals("MV")) {
                    c10 = 146;
                    break;
                }
                c10 = 65535;
                break;
            case 2474:
                if (str.equals("MW")) {
                    c10 = 147;
                    break;
                }
                c10 = 65535;
                break;
            case 2475:
                if (str.equals("MX")) {
                    c10 = 148;
                    break;
                }
                c10 = 65535;
                break;
            case 2476:
                if (str.equals("MY")) {
                    c10 = 149;
                    break;
                }
                c10 = 65535;
                break;
            case 2477:
                if (str.equals("MZ")) {
                    c10 = 150;
                    break;
                }
                c10 = 65535;
                break;
            case 2483:
                if (str.equals("NA")) {
                    c10 = 151;
                    break;
                }
                c10 = 65535;
                break;
            case 2485:
                if (str.equals("NC")) {
                    c10 = 152;
                    break;
                }
                c10 = 65535;
                break;
            case 2487:
                if (str.equals("NE")) {
                    c10 = 153;
                    break;
                }
                c10 = 65535;
                break;
            case 2489:
                if (str.equals("NG")) {
                    c10 = 154;
                    break;
                }
                c10 = 65535;
                break;
            case 2491:
                if (str.equals("NI")) {
                    c10 = 155;
                    break;
                }
                c10 = 65535;
                break;
            case 2494:
                if (str.equals("NL")) {
                    c10 = 156;
                    break;
                }
                c10 = 65535;
                break;
            case 2497:
                if (str.equals("NO")) {
                    c10 = 157;
                    break;
                }
                c10 = 65535;
                break;
            case 2498:
                if (str.equals("NP")) {
                    c10 = 158;
                    break;
                }
                c10 = 65535;
                break;
            case 2500:
                if (str.equals("NR")) {
                    c10 = 159;
                    break;
                }
                c10 = 65535;
                break;
            case 2503:
                if (str.equals("NU")) {
                    c10 = 160;
                    break;
                }
                c10 = 65535;
                break;
            case 2508:
                if (str.equals("NZ")) {
                    c10 = 161;
                    break;
                }
                c10 = 65535;
                break;
            case 2526:
                if (str.equals("OM")) {
                    c10 = 162;
                    break;
                }
                c10 = 65535;
                break;
            case 2545:
                if (str.equals("PA")) {
                    c10 = 163;
                    break;
                }
                c10 = 65535;
                break;
            case 2549:
                if (str.equals("PE")) {
                    c10 = 164;
                    break;
                }
                c10 = 65535;
                break;
            case 2550:
                if (str.equals("PF")) {
                    c10 = 165;
                    break;
                }
                c10 = 65535;
                break;
            case 2551:
                if (str.equals("PG")) {
                    c10 = 166;
                    break;
                }
                c10 = 65535;
                break;
            case 2552:
                if (str.equals("PH")) {
                    c10 = 167;
                    break;
                }
                c10 = 65535;
                break;
            case 2555:
                if (str.equals("PK")) {
                    c10 = 168;
                    break;
                }
                c10 = 65535;
                break;
            case 2556:
                if (str.equals("PL")) {
                    c10 = 169;
                    break;
                }
                c10 = 65535;
                break;
            case 2557:
                if (str.equals("PM")) {
                    c10 = 170;
                    break;
                }
                c10 = 65535;
                break;
            case 2562:
                if (str.equals("PR")) {
                    c10 = 171;
                    break;
                }
                c10 = 65535;
                break;
            case 2563:
                if (str.equals("PS")) {
                    c10 = 172;
                    break;
                }
                c10 = 65535;
                break;
            case 2564:
                if (str.equals("PT")) {
                    c10 = 173;
                    break;
                }
                c10 = 65535;
                break;
            case 2567:
                if (str.equals("PW")) {
                    c10 = 174;
                    break;
                }
                c10 = 65535;
                break;
            case 2569:
                if (str.equals("PY")) {
                    c10 = 175;
                    break;
                }
                c10 = 65535;
                break;
            case 2576:
                if (str.equals("QA")) {
                    c10 = 176;
                    break;
                }
                c10 = 65535;
                break;
            case 2611:
                if (str.equals("RE")) {
                    c10 = 177;
                    break;
                }
                c10 = 65535;
                break;
            case 2621:
                if (str.equals("RO")) {
                    c10 = 178;
                    break;
                }
                c10 = 65535;
                break;
            case 2625:
                if (str.equals("RS")) {
                    c10 = 179;
                    break;
                }
                c10 = 65535;
                break;
            case 2627:
                if (str.equals("RU")) {
                    c10 = 180;
                    break;
                }
                c10 = 65535;
                break;
            case 2629:
                if (str.equals("RW")) {
                    c10 = 181;
                    break;
                }
                c10 = 65535;
                break;
            case 2638:
                if (str.equals("SA")) {
                    c10 = 182;
                    break;
                }
                c10 = 65535;
                break;
            case 2639:
                if (str.equals("SB")) {
                    c10 = 183;
                    break;
                }
                c10 = 65535;
                break;
            case 2640:
                if (str.equals("SC")) {
                    c10 = 184;
                    break;
                }
                c10 = 65535;
                break;
            case 2641:
                if (str.equals("SD")) {
                    c10 = 185;
                    break;
                }
                c10 = 65535;
                break;
            case 2642:
                if (str.equals("SE")) {
                    c10 = 186;
                    break;
                }
                c10 = 65535;
                break;
            case 2644:
                if (str.equals("SG")) {
                    c10 = 187;
                    break;
                }
                c10 = 65535;
                break;
            case 2645:
                if (str.equals("SH")) {
                    c10 = 188;
                    break;
                }
                c10 = 65535;
                break;
            case 2646:
                if (str.equals("SI")) {
                    c10 = 189;
                    break;
                }
                c10 = 65535;
                break;
            case 2647:
                if (str.equals("SJ")) {
                    c10 = 190;
                    break;
                }
                c10 = 65535;
                break;
            case 2648:
                if (str.equals("SK")) {
                    c10 = 191;
                    break;
                }
                c10 = 65535;
                break;
            case 2649:
                if (str.equals("SL")) {
                    c10 = 192;
                    break;
                }
                c10 = 65535;
                break;
            case 2650:
                if (str.equals("SM")) {
                    c10 = 193;
                    break;
                }
                c10 = 65535;
                break;
            case 2651:
                if (str.equals("SN")) {
                    c10 = 194;
                    break;
                }
                c10 = 65535;
                break;
            case 2652:
                if (str.equals("SO")) {
                    c10 = 195;
                    break;
                }
                c10 = 65535;
                break;
            case 2655:
                if (str.equals("SR")) {
                    c10 = 196;
                    break;
                }
                c10 = 65535;
                break;
            case 2656:
                if (str.equals("SS")) {
                    c10 = 197;
                    break;
                }
                c10 = 65535;
                break;
            case 2657:
                if (str.equals("ST")) {
                    c10 = 198;
                    break;
                }
                c10 = 65535;
                break;
            case 2659:
                if (str.equals("SV")) {
                    c10 = 199;
                    break;
                }
                c10 = 65535;
                break;
            case 2661:
                if (str.equals("SX")) {
                    c10 = 200;
                    break;
                }
                c10 = 65535;
                break;
            case 2662:
                if (str.equals("SY")) {
                    c10 = 201;
                    break;
                }
                c10 = 65535;
                break;
            case 2663:
                if (str.equals("SZ")) {
                    c10 = 202;
                    break;
                }
                c10 = 65535;
                break;
            case 2671:
                if (str.equals("TC")) {
                    c10 = 203;
                    break;
                }
                c10 = 65535;
                break;
            case 2672:
                if (str.equals("TD")) {
                    c10 = 204;
                    break;
                }
                c10 = 65535;
                break;
            case 2675:
                if (str.equals("TG")) {
                    c10 = 205;
                    break;
                }
                c10 = 65535;
                break;
            case 2676:
                if (str.equals("TH")) {
                    c10 = 206;
                    break;
                }
                c10 = 65535;
                break;
            case 2678:
                if (str.equals("TJ")) {
                    c10 = 207;
                    break;
                }
                c10 = 65535;
                break;
            case 2679:
                if (str.equals("TK")) {
                    c10 = 208;
                    break;
                }
                c10 = 65535;
                break;
            case 2680:
                if (str.equals("TL")) {
                    c10 = 209;
                    break;
                }
                c10 = 65535;
                break;
            case 2681:
                if (str.equals("TM")) {
                    c10 = 210;
                    break;
                }
                c10 = 65535;
                break;
            case 2682:
                if (str.equals("TN")) {
                    c10 = 211;
                    break;
                }
                c10 = 65535;
                break;
            case 2683:
                if (str.equals("TO")) {
                    c10 = 212;
                    break;
                }
                c10 = 65535;
                break;
            case 2686:
                if (str.equals("TR")) {
                    c10 = 213;
                    break;
                }
                c10 = 65535;
                break;
            case 2688:
                if (str.equals("TT")) {
                    c10 = 214;
                    break;
                }
                c10 = 65535;
                break;
            case 2690:
                if (str.equals("TV")) {
                    c10 = 215;
                    break;
                }
                c10 = 65535;
                break;
            case 2691:
                if (str.equals("TW")) {
                    c10 = 216;
                    break;
                }
                c10 = 65535;
                break;
            case 2694:
                if (str.equals("TZ")) {
                    c10 = 217;
                    break;
                }
                c10 = 65535;
                break;
            case 2700:
                if (str.equals("UA")) {
                    c10 = 218;
                    break;
                }
                c10 = 65535;
                break;
            case 2706:
                if (str.equals("UG")) {
                    c10 = 219;
                    break;
                }
                c10 = 65535;
                break;
            case 2718:
                if (str.equals("US")) {
                    c10 = 220;
                    break;
                }
                c10 = 65535;
                break;
            case 2724:
                if (str.equals("UY")) {
                    c10 = 221;
                    break;
                }
                c10 = 65535;
                break;
            case 2725:
                if (str.equals("UZ")) {
                    c10 = 222;
                    break;
                }
                c10 = 65535;
                break;
            case 2731:
                if (str.equals("VA")) {
                    c10 = 223;
                    break;
                }
                c10 = 65535;
                break;
            case 2733:
                if (str.equals("VC")) {
                    c10 = 224;
                    break;
                }
                c10 = 65535;
                break;
            case 2735:
                if (str.equals("VE")) {
                    c10 = 225;
                    break;
                }
                c10 = 65535;
                break;
            case 2737:
                if (str.equals("VG")) {
                    c10 = 226;
                    break;
                }
                c10 = 65535;
                break;
            case 2739:
                if (str.equals("VI")) {
                    c10 = 227;
                    break;
                }
                c10 = 65535;
                break;
            case 2744:
                if (str.equals("VN")) {
                    c10 = 228;
                    break;
                }
                c10 = 65535;
                break;
            case 2751:
                if (str.equals("VU")) {
                    c10 = 229;
                    break;
                }
                c10 = 65535;
                break;
            case 2767:
                if (str.equals("WF")) {
                    c10 = 230;
                    break;
                }
                c10 = 65535;
                break;
            case 2780:
                if (str.equals("WS")) {
                    c10 = 231;
                    break;
                }
                c10 = 65535;
                break;
            case 2803:
                if (str.equals("XK")) {
                    c10 = 232;
                    break;
                }
                c10 = 65535;
                break;
            case 2828:
                if (str.equals("YE")) {
                    c10 = 233;
                    break;
                }
                c10 = 65535;
                break;
            case 2843:
                if (str.equals("YT")) {
                    c10 = 234;
                    break;
                }
                c10 = 65535;
                break;
            case 2855:
                if (str.equals("ZA")) {
                    c10 = 235;
                    break;
                }
                c10 = 65535;
                break;
            case 2867:
                if (str.equals("ZM")) {
                    c10 = 236;
                    break;
                }
                c10 = 65535;
                break;
            case 2877:
                if (str.equals("ZW")) {
                    c10 = 237;
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
            case '1':
                return new int[]{2, 2, 0, 0, 2, 2};
            case 1:
                return new int[]{1, 4, 3, 4, 4, 2};
            case 2:
            case 166:
                return new int[]{4, 3, 3, 3, 2, 2};
            case 3:
                return new int[]{2, 4, 3, 4, 2, 2};
            case 4:
            case 16:
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
            case 28:
            case '8':
            case 'D':
                return new int[]{0, 2, 0, 0, 2, 2};
            case 5:
                return new int[]{1, 1, 1, 3, 2, 2};
            case 6:
                return new int[]{2, 3, 2, 3, 2, 2};
            case 7:
                return new int[]{4, 4, 4, 3, 2, 2};
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
            case '>':
            case 188:
                return new int[]{4, 2, 2, 2, 2, 2};
            case '\t':
                return new int[]{2, 2, 3, 3, 2, 2};
            case '\n':
                return new int[]{1, 2, 1, 4, 1, 4};
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return new int[]{0, 2, 1, 1, 3, 0};
            case '\f':
            case 'U':
                return new int[]{1, 2, 4, 4, 2, 2};
            case '\r':
            case '2':
            case 'x':
            case 140:
            case 143:
            case 170:
            case 193:
            case 223:
                return new int[]{0, 2, 2, 2, 2, 2};
            case 14:
            case 19:
            case ':':
                return new int[]{3, 3, 4, 4, 2, 2};
            case 15:
            case '^':
                return new int[]{1, 1, 1, 1, 2, 2};
            case 17:
            case 't':
                return new int[]{2, 1, 2, 2, 2, 2};
            case 18:
                return new int[]{0, 1, 4, 4, 3, 2};
            case 20:
            case '?':
            case 'S':
            case 189:
                return new int[]{0, 0, 0, 0, 1, 2};
            case 21:
                return new int[]{1, 3, 1, 4, 4, 2};
            case 22:
            case '[':
            case 133:
            case 153:
            case 204:
            case 225:
            case 233:
                return new int[]{4, 4, 4, 4, 2, 2};
            case 23:
                return new int[]{4, 4, 2, 3, 2, 2};
            case 24:
            case 132:
            case 175:
                return new int[]{1, 2, 2, 2, 2, 2};
            case 26:
                return new int[]{3, 2, 0, 1, 2, 2};
            case 27:
                return new int[]{1, 2, 3, 2, 2, 2};
            case 29:
                return new int[]{1, 1, 2, 1, 1, 0};
            case 30:
            case 'v':
                return new int[]{3, 2, 1, 2, 2, 2};
            case 31:
            case 150:
            case 231:
                return new int[]{3, 1, 2, 1, 2, 2};
            case ' ':
                return new int[]{3, 2, 1, 0, 2, 2};
            case '!':
                return new int[]{1, 1, 2, 3, 2, 2};
            case '\"':
            case ')':
                return new int[]{2, 2, 2, 1, 2, 2};
            case '#':
                return new int[]{0, 2, 3, 3, 3, 3};
            case '$':
            case 'o':
                return new int[]{4, 3, 3, 2, 2, 2};
            case '%':
            case 183:
                return new int[]{4, 2, 4, 2, 2, 2};
            case '&':
            case 'L':
                return new int[]{3, 3, 3, 3, 2, 2};
            case '\'':
                return new int[]{0, 0, 0, 0, 0, 3};
            case '(':
            case '=':
                return new int[]{3, 4, 3, 3, 2, 2};
            case '*':
                return new int[]{1, 1, 2, 1, 3, 2};
            case '+':
                return new int[]{4, 3, 3, 4, 2, 2};
            case ',':
                return new int[]{2, 0, 4, 3, 3, 1};
            case '-':
                return new int[]{2, 3, 4, 2, 2, 2};
            case '.':
                return new int[]{2, 4, 4, 4, 2, 2};
            case '/':
            case 'n':
                return new int[]{4, 2, 4, 3, 2, 2};
            case '0':
                return new int[]{2, 3, 0, 1, 2, 2};
            case '3':
            case 'Z':
            case '~':
                return new int[]{1, 0, 0, 0, 0, 2};
            case '4':
                return new int[]{0, 0, 2, 0, 1, 2};
            case '5':
                return new int[]{0, 1, 3, 2, 2, 2};
            case '6':
            case 201:
            case 207:
                return new int[]{4, 3, 4, 4, 2, 2};
            case '7':
            case '<':
            case '\\':
            case '|':
            case 144:
                return new int[]{0, 0, 0, 0, 0, 2};
            case '9':
                return new int[]{3, 4, 4, 4, 4, 2};
            case ';':
                return new int[]{1, 3, 2, 1, 2, 2};
            case '@':
            case 194:
                return new int[]{4, 4, 3, 2, 2, 2};
            case 'A':
                return new int[]{0, 0, 0, 2, 0, 2};
            case 'B':
                return new int[]{3, 1, 2, 3, 2, 2};
            case 'C':
                return new int[]{4, 2, 3, 0, 2, 2};
            case 'E':
                return new int[]{1, 1, 2, 1, 1, 2};
            case 'F':
            case 205:
                return new int[]{3, 4, 1, 0, 2, 2};
            case 'G':
                return new int[]{0, 1, 1, 2, 1, 2};
            case 'H':
            case 'p':
            case 's':
            case 'w':
            case 200:
            case 224:
                return new int[]{1, 2, 0, 0, 2, 2};
            case 'I':
                return new int[]{1, 0, 0, 2, 2, 2};
            case 'J':
            case 168:
            case 192:
                return new int[]{3, 2, 3, 3, 2, 2};
            case 'K':
                return new int[]{0, 2, 1, 0, 2, 2};
            case 'M':
            case 'g':
                return new int[]{1, 2, 0, 1, 2, 2};
            case 'N':
            case 208:
                return new int[]{2, 2, 2, 4, 2, 2};
            case 'O':
                return new int[]{4, 3, 2, 4, 2, 2};
            case 'P':
                return new int[]{4, 4, 4, 2, 2, 2};
            case 'Q':
                return new int[]{3, 1, 1, 3, 2, 2};
            case 'R':
                return new int[]{4, 4, 3, 3, 2, 2};
            case 'T':
                return new int[]{2, 2, 2, 1, 1, 2};
            case 'V':
                return new int[]{4, 4, 2, 2, 2, 2};
            case 'W':
                return new int[]{3, 0, 1, 1, 2, 2};
            case 'X':
                return new int[]{0, 1, 1, 3, 2, 0};
            case 'Y':
                return new int[]{3, 3, 2, 2, 2, 2};
            case ']':
                return new int[]{3, 1, 1, 2, 3, 2};
            case '_':
                return new int[]{1, 2, 2, 3, 4, 2};
            case '`':
                return new int[]{0, 2, 0, 1, 2, 2};
            case 'a':
                return new int[]{1, 1, 2, 1, 2, 1};
            case 'b':
            case 215:
            case 230:
                return new int[]{4, 2, 2, 4, 2, 2};
            case 'c':
            case 190:
                return new int[]{3, 2, 2, 2, 2, 2};
            case 'd':
                return new int[]{4, 2, 3, 3, 4, 2};
            case 'e':
                return new int[]{0, 0, 1, 0, 0, 2};
            case 'f':
                return new int[]{0, 0, 1, 1, 1, 2};
            case 'h':
                return new int[]{2, 4, 2, 1, 2, 2};
            case 'i':
                return new int[]{2, 0, 1, 1, 2, 2};
            case 'j':
                return new int[]{0, 3, 3, 3, 4, 4};
            case 'k':
                return new int[]{3, 2, 2, 1, 2, 2};
            case 'l':
            case 141:
                return new int[]{2, 1, 1, 2, 2, 2};
            case 'm':
                return new int[]{1, 0, 4, 2, 2, 2};
            case 'q':
                return new int[]{0, 2, 2, 4, 4, 4};
            case 'r':
                return new int[]{1, 0, 1, 0, 0, 2};
            case 'u':
                return new int[]{1, 2, 1, 3, 2, 2};
            case 'y':
                return new int[]{3, 2, 3, 4, 4, 2};
            case 'z':
                return new int[]{3, 4, 3, 4, 2, 2};
            case '{':
            case 219:
                return new int[]{3, 3, 3, 2, 2, 2};
            case '}':
                return new int[]{1, 1, 4, 2, 0, 2};
            case 127:
            case 212:
            case 237:
                return new int[]{3, 2, 4, 3, 2, 2};
            case 128:
                return new int[]{3, 3, 2, 1, 2, 2};
            case 129:
                return new int[]{0, 2, 2, 0, 2, 2};
            case 130:
                return new int[]{1, 0, 0, 0, 2, 2};
            case 131:
                return new int[]{2, 0, 0, 1, 1, 2};
            case 134:
                return new int[]{4, 2, 1, 3, 2, 2};
            case 135:
                return new int[]{2, 0, 0, 1, 3, 2};
            case 136:
            case 217:
                return new int[]{3, 4, 2, 2, 2, 2};
            case 137:
                return new int[]{2, 2, 2, 3, 4, 2};
            case 138:
                return new int[]{2, 0, 1, 2, 2, 2};
            case 139:
                return new int[]{0, 2, 4, 4, 4, 2};
            case 142:
                return new int[]{4, 2, 3, 4, 2, 2};
            case 145:
            case 182:
                return new int[]{3, 1, 1, 2, 2, 2};
            case 146:
                return new int[]{3, 4, 1, 3, 3, 2};
            case 147:
                return new int[]{4, 2, 3, 3, 2, 2};
            case 148:
                return new int[]{3, 4, 4, 4, 2, 2};
            case 149:
                return new int[]{1, 0, 4, 1, 2, 2};
            case 151:
                return new int[]{3, 4, 3, 2, 2, 2};
            case com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION /* 152 */:
                return new int[]{3, 2, 3, 4, 2, 2};
            case 154:
                return new int[]{3, 4, 2, 1, 2, 2};
            case 155:
                return new int[]{2, 3, 4, 3, 2, 2};
            case 156:
                return new int[]{0, 2, 3, 3, 0, 4};
            case 157:
                return new int[]{0, 1, 2, 1, 1, 2};
            case 158:
                return new int[]{2, 1, 4, 3, 2, 2};
            case 159:
                return new int[]{4, 0, 3, 2, 2, 2};
            case 160:
                return new int[]{4, 2, 2, 1, 2, 2};
            case 161:
                return new int[]{1, 0, 2, 2, 4, 2};
            case 162:
                return new int[]{2, 3, 1, 3, 4, 2};
            case 163:
                return new int[]{2, 3, 3, 3, 2, 2};
            case 164:
                return new int[]{1, 2, 4, 4, 3, 2};
            case 165:
            case 199:
                return new int[]{2, 3, 3, 1, 2, 2};
            case 167:
                return new int[]{2, 1, 3, 2, 2, 0};
            case 169:
                return new int[]{2, 1, 2, 2, 4, 2};
            case 171:
                return new int[]{2, 0, 2, 0, 2, 1};
            case 172:
                return new int[]{3, 4, 1, 4, 2, 2};
            case 173:
                return new int[]{1, 0, 0, 0, 1, 2};
            case 174:
                return new int[]{2, 2, 4, 2, 2, 2};
            case 176:
                return new int[]{1, 4, 4, 4, 4, 2};
            case 177:
                return new int[]{1, 2, 2, 3, 1, 2};
            case 178:
                return new int[]{0, 0, 1, 2, 1, 2};
            case 179:
                return new int[]{2, 0, 0, 0, 2, 2};
            case 180:
                return new int[]{1, 0, 0, 0, 3, 3};
            case 181:
                return new int[]{3, 3, 1, 0, 2, 2};
            case 184:
                return new int[]{4, 3, 1, 1, 2, 2};
            case 185:
                return new int[]{4, 3, 4, 2, 2, 2};
            case 186:
                return new int[]{0, 1, 1, 1, 0, 2};
            case 187:
                return new int[]{2, 3, 3, 3, 3, 3};
            case 191:
                return new int[]{1, 1, 1, 1, 3, 2};
            case 195:
                return new int[]{3, 2, 2, 4, 4, 2};
            case 196:
                return new int[]{2, 4, 3, 0, 2, 2};
            case 197:
            case 210:
                return new int[]{4, 2, 2, 3, 2, 2};
            case 198:
                return new int[]{2, 2, 1, 2, 2, 2};
            case 202:
                return new int[]{4, 4, 3, 4, 2, 2};
            case 203:
                return new int[]{2, 2, 1, 3, 2, 2};
            case 206:
                return new int[]{0, 1, 2, 1, 2, 2};
            case 209:
                return new int[]{4, 2, 4, 4, 2, 2};
            case 211:
            case 221:
                return new int[]{2, 1, 1, 1, 2, 2};
            case 213:
                return new int[]{1, 0, 0, 1, 3, 2};
            case 214:
                return new int[]{1, 4, 0, 0, 2, 2};
            case 216:
                return new int[]{0, 2, 0, 0, 0, 0};
            case 218:
                return new int[]{0, 1, 1, 2, 4, 2};
            case 220:
                return new int[]{1, 1, 4, 1, 3, 1};
            case 222:
                return new int[]{2, 2, 3, 4, 3, 2};
            case 226:
                return new int[]{2, 2, 0, 1, 2, 2};
            case 227:
                return new int[]{0, 2, 1, 2, 2, 2};
            case 228:
                return new int[]{0, 0, 1, 2, 2, 1};
            case 229:
                return new int[]{4, 3, 3, 1, 2, 2};
            case 232:
                return new int[]{1, 2, 1, 1, 2, 2};
            case 234:
                return new int[]{2, 3, 3, 4, 2, 2};
            case 235:
                return new int[]{2, 3, 2, 1, 2, 2};
            case 236:
                return new int[]{4, 4, 4, 3, 3, 2};
            default:
                return new int[]{2, 2, 2, 2, 2, 2};
        }
    }

    public final long b(int i7) {
        Integer valueOf = Integer.valueOf(i7);
        y0 y0Var = this.f20649a;
        Long l10 = (Long) y0Var.get(valueOf);
        if (l10 == null) {
            l10 = (Long) y0Var.get(0);
        }
        if (l10 == null) {
            l10 = 1000000L;
        }
        return l10.longValue();
    }

    public final void c(final int i7, final long j, final long j10) {
        if (i7 == 0 && j == 0 && j10 == this.f20658m) {
            return;
        }
        this.f20658m = j10;
        Iterator it = ((CopyOnWriteArrayList) this.f20650b.f8929b).iterator();
        while (it.hasNext()) {
            final C1608e c1608e = (C1608e) it.next();
            if (!c1608e.f20605c) {
                c1608e.f20603a.post(new Runnable() { // from class: m5.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        n4.f fVar = C1608e.this.f20604b;
                        T6.a aVar = fVar.f21089d;
                        final C1703a M3 = fVar.M(((N6.H) aVar.f9321b).isEmpty() ? null : (P4.B) N6.r.l((N6.H) aVar.f9321b));
                        final long j11 = j;
                        final long j12 = j10;
                        final int i10 = i7;
                        fVar.Q(M3, 1006, new n5.i(i10, j11, j12) { // from class: n4.e

                            /* renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ int f21084b;

                            /* renamed from: c, reason: collision with root package name */
                            public final /* synthetic */ long f21085c;

                            @Override // n5.i
                            public final void invoke(Object obj) {
                                j jVar = (j) obj;
                                jVar.getClass();
                                C1703a c1703a = C1703a.this;
                                B b2 = c1703a.f21073d;
                                if (b2 != null) {
                                    String c10 = jVar.f21111b.c(c1703a.f21071b, b2);
                                    HashMap hashMap = jVar.f21116h;
                                    Long l10 = (Long) hashMap.get(c10);
                                    HashMap hashMap2 = jVar.g;
                                    Long l11 = (Long) hashMap2.get(c10);
                                    hashMap.put(c10, Long.valueOf((l10 == null ? 0L : l10.longValue()) + this.f21085c));
                                    hashMap2.put(c10, Long.valueOf((l11 != null ? l11.longValue() : 0L) + this.f21084b));
                                }
                            }
                        });
                    }
                });
            }
        }
    }
}
