package A4;

import F.C0257a;
import android.util.Pair;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import m4.C1586o0;
import m4.K;
import m4.L;
import n5.AbstractC1705a;
import n5.C1704A;
import n5.D;
import r4.C1935g;
import r4.C1936h;
import s4.C1978f;
import s4.C1979g;
import s4.C1986n;
import s4.C1988p;
import s4.InterfaceC1982j;
import s4.InterfaceC1983k;
import s4.InterfaceC1984l;

/* loaded from: classes.dex */
public final class n implements InterfaceC1982j {

    /* renamed from: I, reason: collision with root package name */
    public static final byte[] f410I = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: J, reason: collision with root package name */
    public static final L f411J;

    /* renamed from: A, reason: collision with root package name */
    public int f412A;

    /* renamed from: B, reason: collision with root package name */
    public int f413B;

    /* renamed from: C, reason: collision with root package name */
    public int f414C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f415D;

    /* renamed from: H, reason: collision with root package name */
    public boolean f419H;

    /* renamed from: a, reason: collision with root package name */
    public final int f420a;

    /* renamed from: b, reason: collision with root package name */
    public final v f421b;

    /* renamed from: c, reason: collision with root package name */
    public final List f422c;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f426h;

    /* renamed from: i, reason: collision with root package name */
    public final n5.v f427i;
    public final C1704A j;

    /* renamed from: o, reason: collision with root package name */
    public final S4.p f431o;

    /* renamed from: p, reason: collision with root package name */
    public int f432p;

    /* renamed from: q, reason: collision with root package name */
    public int f433q;

    /* renamed from: r, reason: collision with root package name */
    public long f434r;

    /* renamed from: s, reason: collision with root package name */
    public int f435s;

    /* renamed from: t, reason: collision with root package name */
    public n5.v f436t;

    /* renamed from: u, reason: collision with root package name */
    public long f437u;

    /* renamed from: v, reason: collision with root package name */
    public int f438v;

    /* renamed from: z, reason: collision with root package name */
    public m f442z;
    public final q3.s k = new q3.s(8);

    /* renamed from: l, reason: collision with root package name */
    public final n5.v f428l = new n5.v(16);

    /* renamed from: e, reason: collision with root package name */
    public final n5.v f424e = new n5.v(AbstractC1705a.f21155d);

    /* renamed from: f, reason: collision with root package name */
    public final n5.v f425f = new n5.v(5);
    public final n5.v g = new n5.v();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayDeque f429m = new ArrayDeque();

    /* renamed from: n, reason: collision with root package name */
    public final ArrayDeque f430n = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f423d = new SparseArray();

    /* renamed from: x, reason: collision with root package name */
    public long f440x = -9223372036854775807L;

    /* renamed from: w, reason: collision with root package name */
    public long f439w = -9223372036854775807L;

    /* renamed from: y, reason: collision with root package name */
    public long f441y = -9223372036854775807L;

    /* renamed from: E, reason: collision with root package name */
    public InterfaceC1984l f416E = InterfaceC1984l.f24064t;

    /* renamed from: F, reason: collision with root package name */
    public s4.v[] f417F = new s4.v[0];

    /* renamed from: G, reason: collision with root package name */
    public s4.v[] f418G = new s4.v[0];

    static {
        K k = new K();
        k.k = "application/x-emsg";
        f411J = new L(k);
    }

    public n(int i7, C1704A c1704a, v vVar, List list, S4.p pVar) {
        this.f420a = i7;
        this.j = c1704a;
        this.f421b = vVar;
        this.f422c = Collections.unmodifiableList(list);
        this.f431o = pVar;
        byte[] bArr = new byte[16];
        this.f426h = bArr;
        this.f427i = new n5.v(bArr);
    }

    public static C1936h b(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i7 = 0; i7 < size; i7++) {
            b bVar = (b) arrayList.get(i7);
            if (bVar.f368b == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = bVar.f366c.f21229a;
                s e2 = o.e(bArr);
                UUID uuid = e2 == null ? null : (UUID) e2.f471b;
                if (uuid == null) {
                    AbstractC1705a.S("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new C1935g(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new C1936h(null, false, (C1935g[]) arrayList2.toArray(new C1935g[0]));
    }

    public static void d(n5.v vVar, int i7, x xVar) {
        vVar.G(i7 + 8);
        int h10 = vVar.h();
        if ((h10 & 1) != 0) {
            throw C1586o0.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z8 = (h10 & 2) != 0;
        int y10 = vVar.y();
        if (y10 == 0) {
            Arrays.fill(xVar.f501l, 0, xVar.f497e, false);
            return;
        }
        if (y10 != xVar.f497e) {
            StringBuilder r10 = h3.o.r(y10, "Senc sample count ", " is different from fragment sample count");
            r10.append(xVar.f497e);
            throw C1586o0.a(r10.toString(), null);
        }
        Arrays.fill(xVar.f501l, 0, y10, z8);
        int a9 = vVar.a();
        n5.v vVar2 = xVar.f503n;
        vVar2.D(a9);
        xVar.k = true;
        xVar.f504o = true;
        vVar.f(0, vVar2.f21229a, vVar2.f21231c);
        vVar2.G(0);
        xVar.f504o = false;
    }

    @Override // s4.InterfaceC1982j
    public final void a(long j, long j10) {
        SparseArray sparseArray = this.f423d;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((m) sparseArray.valueAt(i7)).d();
        }
        this.f430n.clear();
        this.f438v = 0;
        this.f439w = j10;
        this.f429m.clear();
        this.f432p = 0;
        this.f435s = 0;
    }

    @Override // s4.InterfaceC1982j
    public final boolean c(InterfaceC1983k interfaceC1983k) {
        return o.j(interfaceC1983k, true, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:319:0x00bc, code lost:
    
        r3 = r29.f432p;
        r6 = r2.f402b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x00c2, code lost:
    
        if (r3 != 3) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x00c6, code lost:
    
        if (r2.f409l != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x00c8, code lost:
    
        r3 = r2.f404d.f510d[r2.f406f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x00d7, code lost:
    
        r29.f412A = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x00dd, code lost:
    
        if (r2.f406f >= r2.f408i) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x00df, code lost:
    
        ((s4.C1979g) r30).r(r3);
        r1 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x00e8, code lost:
    
        if (r1 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x00eb, code lost:
    
        r3 = r6.f503n;
        r1 = r1.f491d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x00ef, code lost:
    
        if (r1 == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x00f1, code lost:
    
        r3.H(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x00f4, code lost:
    
        r1 = r2.f406f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x00f8, code lost:
    
        if (r6.k == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x00fe, code lost:
    
        if (r6.f501l[r1] == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0100, code lost:
    
        r3.H(r3.A() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x010c, code lost:
    
        if (r2.b() != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x010e, code lost:
    
        r29.f442z = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0110, code lost:
    
        r29.f432p = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x011d, code lost:
    
        if (r2.f404d.f507a.g != 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x011f, code lost:
    
        r29.f412A = r3 - 8;
        ((s4.C1979g) r30).r(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0138, code lost:
    
        if ("audio/ac4".equals(r2.f404d.f507a.f485f.f20096z) == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x013a, code lost:
    
        r29.f413B = r2.c(r29.f412A, 7);
        r3 = r29.f412A;
        r8 = r29.f427i;
        o4.AbstractC1787a.e(r3, r8);
        r2.f401a.c(7, r8);
        r29.f413B += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x015d, code lost:
    
        r29.f412A += r29.f413B;
        r29.f432p = 4;
        r29.f414C = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0155, code lost:
    
        r29.f413B = r2.c(r29.f412A, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x00d1, code lost:
    
        r3 = r6.f499h[r2.f406f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0169, code lost:
    
        r3 = r2.f404d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x016d, code lost:
    
        if (r2.f409l != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x016f, code lost:
    
        r8 = r3.f512f[r2.f406f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x017d, code lost:
    
        if (r13 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x017f, code lost:
    
        r8 = r13.a(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0183, code lost:
    
        r3 = r3.f507a;
        r7 = r3.j;
        r11 = r2.f401a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0189, code lost:
    
        if (r7 == 0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x018b, code lost:
    
        r14 = r29.f425f;
        r15 = r14.f21229a;
        r15[0] = 0;
        r15[1] = 0;
        r15[2] = 0;
        r10 = r7 + 1;
        r7 = 4 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x01a3, code lost:
    
        if (r29.f413B >= r29.f412A) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x01a5, code lost:
    
        r4 = r29.f414C;
        r28 = r13;
        r13 = r3.f485f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x01ad, code lost:
    
        if (r4 != 0) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x01af, code lost:
    
        r19 = r3;
        ((s4.C1979g) r30).h(r15, r7, r10, false);
        r14.G(0);
        r4 = r14.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x01c0, code lost:
    
        if (r4 < 1) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x01c2, code lost:
    
        r29.f414C = r4 - 1;
        r4 = r29.f424e;
        r4.G(0);
        r11.c(4, r4);
        r11.c(1, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x01d7, code lost:
    
        if (r29.f418G.length <= 0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x01d9, code lost:
    
        r4 = r13.f20096z;
        r13 = r15[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x01e3, code lost:
    
        if ("video/avc".equals(r4) == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x01e5, code lost:
    
        r21 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x01ea, code lost:
    
        if ((r13 & 31) == 6) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x01fe, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x0204, code lost:
    
        r29.f415D = r3;
        r29.f413B += 5;
        r29.f412A += r7;
        r3 = r19;
        r10 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x0215, code lost:
    
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x01f4, code lost:
    
        if ("video/hevc".equals(r4) == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x01fc, code lost:
    
        if (((r13 & 126) >> 1) != 39) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x0203, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x01ed, code lost:
    
        r21 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x0200, code lost:
    
        r21 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x0220, code lost:
    
        throw m4.C1586o0.a("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x0221, code lost:
    
        r19 = r3;
        r21 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0228, code lost:
    
        if (r29.f415D == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x022a, code lost:
    
        r3 = r29.g;
        r3.D(r4);
        r22 = r7;
        r23 = r14;
        ((s4.C1979g) r30).h(r3.f21229a, 0, r29.f414C, false);
        r11.c(r29.f414C, r3);
        r4 = r29.f414C;
        r7 = n5.AbstractC1705a.Q(r3.f21231c, r3.f21229a);
        r3.G("video/hevc".equals(r13.f20096z) ? 1 : 0);
        r3.F(r7);
        c2.i.i(r8, r3, r29.f418G);
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0268, code lost:
    
        r29.f413B += r4;
        r29.f414C -= r4;
        r3 = r19;
        r10 = r21;
        r7 = r22;
        r14 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x025f, code lost:
    
        r22 = r7;
        r23 = r14;
        r4 = r11.d(r30, r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x027b, code lost:
    
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x0294, code lost:
    
        if (r2.f409l != false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0296, code lost:
    
        r6 = r2.f404d.g[r2.f406f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x02ae, code lost:
    
        if (r2.a() == null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x02b0, code lost:
    
        r24 = 1073741824 | r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x02b8, code lost:
    
        r1 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x02bc, code lost:
    
        if (r1 == null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x02be, code lost:
    
        r27 = r1.f490c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x02c5, code lost:
    
        r11.e(r8, r24, r29.f412A, 0, r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x02d6, code lost:
    
        if (r12.isEmpty() != false) goto L438;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x02d8, code lost:
    
        r1 = (A4.l) r12.removeFirst();
        r29.f438v -= r1.f400c;
        r3 = r1.f399b;
        r4 = r1.f398a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x02e9, code lost:
    
        if (r3 == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x02eb, code lost:
    
        r4 = r4 + r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x02ec, code lost:
    
        r6 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x02ee, code lost:
    
        if (r28 == null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x02f0, code lost:
    
        r4 = r6.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x02f4, code lost:
    
        r3 = r29.f417F;
        r7 = r3.length;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x02f8, code lost:
    
        if (r10 >= r7) goto L439;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x02fa, code lost:
    
        r3[r10].e(r4, 1, r1.f400c, r29.f438v, null);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0310, code lost:
    
        r28 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0317, code lost:
    
        if (r2.b() != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x0319, code lost:
    
        r29.f442z = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x031c, code lost:
    
        r29.f432p = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0320, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x02c3, code lost:
    
        r27 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x02b6, code lost:
    
        r24 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x02a5, code lost:
    
        if (r6.j[r2.f406f] == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x02a7, code lost:
    
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x02a9, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x027e, code lost:
    
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x0280, code lost:
    
        r3 = r29.f413B;
        r4 = r29.f412A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x0284, code lost:
    
        if (r3 >= r4) goto L440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x0286, code lost:
    
        r29.f413B += r11.d(r30, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x0176, code lost:
    
        r8 = r6.f500i[r2.f406f];
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.InterfaceC1982j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(InterfaceC1983k interfaceC1983k, C0257a c0257a) {
        long T10;
        String str;
        long j;
        String str2;
        long j10;
        long w10;
        long z8;
        long z10;
        while (true) {
            int i7 = this.f432p;
            ArrayDeque arrayDeque = this.f429m;
            SparseArray sparseArray = this.f423d;
            if (i7 != 0) {
                ArrayDeque arrayDeque2 = this.f430n;
                C1704A c1704a = this.j;
                if (i7 != 1) {
                    long j11 = Long.MAX_VALUE;
                    if (i7 != 2) {
                        m mVar = this.f442z;
                        if (mVar != null) {
                            break;
                        }
                        int size = sparseArray.size();
                        long j12 = Long.MAX_VALUE;
                        m mVar2 = null;
                        for (int i10 = 0; i10 < size; i10++) {
                            m mVar3 = (m) sparseArray.valueAt(i10);
                            boolean z11 = mVar3.f409l;
                            if (z11 || mVar3.f406f != mVar3.f404d.f508b) {
                                x xVar = mVar3.f402b;
                                if (!z11 || mVar3.f407h != xVar.f496d) {
                                    long j13 = !z11 ? mVar3.f404d.f509c[mVar3.f406f] : xVar.f498f[mVar3.f407h];
                                    if (j13 < j12) {
                                        mVar2 = mVar3;
                                        j12 = j13;
                                    }
                                }
                            }
                        }
                        if (mVar2 == null) {
                            int i11 = (int) (this.f437u - ((C1979g) interfaceC1983k).f24055d);
                            if (i11 < 0) {
                                throw C1586o0.a("Offset to end of mdat was negative.", null);
                            }
                            ((C1979g) interfaceC1983k).r(i11);
                            this.f432p = 0;
                            this.f435s = 0;
                        } else {
                            int i12 = (int) ((!mVar2.f409l ? mVar2.f404d.f509c[mVar2.f406f] : mVar2.f402b.f498f[mVar2.f407h]) - ((C1979g) interfaceC1983k).f24055d);
                            if (i12 < 0) {
                                AbstractC1705a.S("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                i12 = 0;
                            }
                            ((C1979g) interfaceC1983k).r(i12);
                            this.f442z = mVar2;
                            mVar = mVar2;
                        }
                    } else {
                        int size2 = sparseArray.size();
                        m mVar4 = null;
                        for (int i13 = 0; i13 < size2; i13++) {
                            x xVar2 = ((m) sparseArray.valueAt(i13)).f402b;
                            if (xVar2.f504o) {
                                long j14 = xVar2.f495c;
                                if (j14 < j11) {
                                    mVar4 = (m) sparseArray.valueAt(i13);
                                    j11 = j14;
                                }
                            }
                        }
                        if (mVar4 == null) {
                            this.f432p = 3;
                        } else {
                            int i14 = (int) (j11 - ((C1979g) interfaceC1983k).f24055d);
                            if (i14 < 0) {
                                throw C1586o0.a("Offset to encryption data was negative.", null);
                            }
                            C1979g c1979g = (C1979g) interfaceC1983k;
                            c1979g.r(i14);
                            x xVar3 = mVar4.f402b;
                            n5.v vVar = xVar3.f503n;
                            c1979g.h(vVar.f21229a, 0, vVar.f21231c, false);
                            vVar.G(0);
                            xVar3.f504o = false;
                        }
                    }
                } else {
                    int i15 = ((int) this.f434r) - this.f435s;
                    n5.v vVar2 = this.f436t;
                    if (vVar2 != null) {
                        ((C1979g) interfaceC1983k).h(vVar2.f21229a, 8, i15, false);
                        int i16 = this.f433q;
                        b bVar = new b(i16, vVar2);
                        long j15 = ((C1979g) interfaceC1983k).f24055d;
                        if (!arrayDeque.isEmpty()) {
                            ((a) arrayDeque.peek()).f364d.add(bVar);
                        } else if (i16 == 1936286840) {
                            vVar2.G(8);
                            int F10 = c.F(vVar2.h());
                            vVar2.H(4);
                            long w11 = vVar2.w();
                            if (F10 == 0) {
                                z8 = vVar2.w();
                                z10 = vVar2.w();
                            } else {
                                z8 = vVar2.z();
                                z10 = vVar2.z();
                            }
                            long j16 = z10 + j15;
                            long T11 = D.T(z8, 1000000L, w11);
                            vVar2.H(2);
                            int A10 = vVar2.A();
                            int[] iArr = new int[A10];
                            long[] jArr = new long[A10];
                            long[] jArr2 = new long[A10];
                            long[] jArr3 = new long[A10];
                            long j17 = j16;
                            long j18 = T11;
                            int i17 = 0;
                            while (i17 < A10) {
                                int h10 = vVar2.h();
                                if ((h10 & Integer.MIN_VALUE) != 0) {
                                    throw C1586o0.a("Unhandled indirect reference", null);
                                }
                                long w12 = vVar2.w();
                                iArr[i17] = h10 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                                jArr[i17] = j17;
                                jArr3[i17] = j18;
                                long j19 = z8 + w12;
                                j18 = D.T(j19, 1000000L, w11);
                                jArr2[i17] = j18 - jArr3[i17];
                                vVar2.H(4);
                                j17 += iArr[i17];
                                i17++;
                                z8 = j19;
                            }
                            Pair create = Pair.create(Long.valueOf(T11), new C1978f(iArr, jArr, jArr2, jArr3));
                            this.f441y = ((Long) create.first).longValue();
                            this.f416E.i((s4.s) create.second);
                            this.f419H = true;
                        } else if (i16 == 1701671783 && this.f417F.length != 0) {
                            vVar2.G(8);
                            int F11 = c.F(vVar2.h());
                            long j20 = -9223372036854775807L;
                            if (F11 == 0) {
                                String q10 = vVar2.q();
                                q10.getClass();
                                String q11 = vVar2.q();
                                q11.getClass();
                                long w13 = vVar2.w();
                                long T12 = D.T(vVar2.w(), 1000000L, w13);
                                long j21 = this.f441y;
                                long j22 = j21 != -9223372036854775807L ? j21 + T12 : -9223372036854775807L;
                                T10 = D.T(vVar2.w(), 1000L, w13);
                                str = q10;
                                j = T12;
                                str2 = q11;
                                j10 = j22;
                                w10 = vVar2.w();
                            } else if (F11 != 1) {
                                h3.o.u(F11, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor");
                            } else {
                                long w14 = vVar2.w();
                                j10 = D.T(vVar2.z(), 1000000L, w14);
                                long T13 = D.T(vVar2.w(), 1000L, w14);
                                long w15 = vVar2.w();
                                String q12 = vVar2.q();
                                q12.getClass();
                                String q13 = vVar2.q();
                                q13.getClass();
                                T10 = T13;
                                str = q12;
                                j = -9223372036854775807L;
                                str2 = q13;
                                w10 = w15;
                            }
                            byte[] bArr = new byte[vVar2.a()];
                            vVar2.f(0, bArr, vVar2.a());
                            n5.v vVar3 = new n5.v(this.k.q(new H4.a(str, str2, T10, w10, bArr)));
                            int a9 = vVar3.a();
                            s4.v[] vVarArr = this.f417F;
                            int length = vVarArr.length;
                            int i18 = 0;
                            while (i18 < length) {
                                s4.v vVar4 = vVarArr[i18];
                                vVar3.G(0);
                                vVar4.c(a9, vVar3);
                                i18++;
                                j20 = -9223372036854775807L;
                            }
                            if (j10 == j20) {
                                arrayDeque2.addLast(new l(a9, j, true));
                                this.f438v += a9;
                            } else if (!arrayDeque2.isEmpty()) {
                                arrayDeque2.addLast(new l(a9, j10, false));
                                this.f438v += a9;
                            } else if (c1704a == null || c1704a.d()) {
                                if (c1704a != null) {
                                    j10 = c1704a.a(j10);
                                }
                                for (s4.v vVar5 : this.f417F) {
                                    vVar5.e(j10, 1, a9, 0, null);
                                }
                            } else {
                                arrayDeque2.addLast(new l(a9, j10, false));
                                this.f438v += a9;
                            }
                        }
                    } else {
                        ((C1979g) interfaceC1983k).r(i15);
                    }
                    g(((C1979g) interfaceC1983k).f24055d);
                }
            } else {
                int i19 = this.f435s;
                n5.v vVar6 = this.f428l;
                if (i19 == 0) {
                    if (!((C1979g) interfaceC1983k).h(vVar6.f21229a, 0, 8, true)) {
                        return -1;
                    }
                    this.f435s = 8;
                    vVar6.G(0);
                    this.f434r = vVar6.w();
                    this.f433q = vVar6.h();
                }
                long j23 = this.f434r;
                if (j23 == 1) {
                    ((C1979g) interfaceC1983k).h(vVar6.f21229a, 8, 8, false);
                    this.f435s += 8;
                    this.f434r = vVar6.z();
                } else if (j23 == 0) {
                    long j24 = ((C1979g) interfaceC1983k).f24054c;
                    if (j24 == -1 && !arrayDeque.isEmpty()) {
                        j24 = ((a) arrayDeque.peek()).f363c;
                    }
                    if (j24 != -1) {
                        this.f434r = (j24 - ((C1979g) interfaceC1983k).f24055d) + this.f435s;
                    }
                }
                long j25 = this.f434r;
                int i20 = this.f435s;
                if (j25 < i20) {
                    throw C1586o0.c("Atom size less than header length (unsupported).");
                }
                long j26 = ((C1979g) interfaceC1983k).f24055d - i20;
                int i21 = this.f433q;
                if ((i21 == 1836019558 || i21 == 1835295092) && !this.f419H) {
                    this.f416E.i(new C1986n(this.f440x, j26));
                    this.f419H = true;
                }
                if (this.f433q == 1836019558) {
                    int size3 = sparseArray.size();
                    for (int i22 = 0; i22 < size3; i22++) {
                        x xVar4 = ((m) sparseArray.valueAt(i22)).f402b;
                        xVar4.getClass();
                        xVar4.f495c = j26;
                        xVar4.f494b = j26;
                    }
                }
                int i23 = this.f433q;
                if (i23 == 1835295092) {
                    this.f442z = null;
                    this.f437u = j26 + this.f434r;
                    this.f432p = 2;
                } else if (i23 == 1836019574 || i23 == 1953653099 || i23 == 1835297121 || i23 == 1835626086 || i23 == 1937007212 || i23 == 1836019558 || i23 == 1953653094 || i23 == 1836475768 || i23 == 1701082227) {
                    long j27 = (((C1979g) interfaceC1983k).f24055d + this.f434r) - 8;
                    arrayDeque.push(new a(i23, j27));
                    if (this.f434r == this.f435s) {
                        g(j27);
                    } else {
                        this.f432p = 0;
                        this.f435s = 0;
                    }
                } else if (i23 == 1751411826 || i23 == 1835296868 || i23 == 1836476516 || i23 == 1936286840 || i23 == 1937011556 || i23 == 1937011827 || i23 == 1668576371 || i23 == 1937011555 || i23 == 1937011578 || i23 == 1937013298 || i23 == 1937007471 || i23 == 1668232756 || i23 == 1937011571 || i23 == 1952867444 || i23 == 1952868452 || i23 == 1953196132 || i23 == 1953654136 || i23 == 1953658222 || i23 == 1886614376 || i23 == 1935763834 || i23 == 1935763823 || i23 == 1936027235 || i23 == 1970628964 || i23 == 1935828848 || i23 == 1936158820 || i23 == 1701606260 || i23 == 1835362404 || i23 == 1701671783) {
                    if (this.f435s != 8) {
                        throw C1586o0.c("Leaf atom defines extended atom size (unsupported).");
                    }
                    if (this.f434r > 2147483647L) {
                        throw C1586o0.c("Leaf atom with length > 2147483647 (unsupported).");
                    }
                    n5.v vVar7 = new n5.v((int) this.f434r);
                    System.arraycopy(vVar6.f21229a, 0, vVar7.f21229a, 0, 8);
                    this.f436t = vVar7;
                    this.f432p = 1;
                } else {
                    if (this.f434r > 2147483647L) {
                        throw C1586o0.c("Skipping atom with length > 2147483647 (unsupported).");
                    }
                    this.f436t = null;
                    this.f432p = 1;
                }
            }
        }
    }

    @Override // s4.InterfaceC1982j
    public final void f(InterfaceC1984l interfaceC1984l) {
        int i7;
        this.f416E = interfaceC1984l;
        this.f432p = 0;
        this.f435s = 0;
        s4.v[] vVarArr = new s4.v[2];
        this.f417F = vVarArr;
        S4.p pVar = this.f431o;
        if (pVar != null) {
            vVarArr[0] = pVar;
            i7 = 1;
        } else {
            i7 = 0;
        }
        int i10 = 100;
        if ((this.f420a & 4) != 0) {
            vVarArr[i7] = interfaceC1984l.u(100, 5);
            i10 = 101;
            i7++;
        }
        s4.v[] vVarArr2 = (s4.v[]) D.O(i7, this.f417F);
        this.f417F = vVarArr2;
        for (s4.v vVar : vVarArr2) {
            vVar.a(f411J);
        }
        List list = this.f422c;
        this.f418G = new s4.v[list.size()];
        int i11 = 0;
        while (i11 < this.f418G.length) {
            s4.v u3 = this.f416E.u(i10, 3);
            u3.a((L) list.get(i11));
            this.f418G[i11] = u3;
            i11++;
            i10++;
        }
        v vVar2 = this.f421b;
        if (vVar2 != null) {
            this.f423d.put(0, new m(interfaceC1984l.u(0, vVar2.f481b), new y(this.f421b, new long[0], new int[0], 0, new long[0], new int[0], 0L), new k(0, 0, 0, 0)));
            this.f416E.f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:407:0x07f2, code lost:
    
        r4 = r0;
        r4.f432p = 0;
        r4.f435s = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x07f8, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(long j) {
        n nVar;
        int i7;
        n nVar2;
        boolean z8;
        int i10;
        int i11;
        ArrayList arrayList;
        SparseArray sparseArray;
        ArrayList arrayList2;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        SparseArray sparseArray2;
        ArrayList arrayList3;
        int i16;
        int i17;
        int i18;
        a aVar;
        ArrayList arrayList4;
        int i19;
        m mVar;
        int i20;
        boolean z11;
        boolean z12;
        m mVar2;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z13;
        boolean z14;
        int i25;
        k kVar;
        boolean z15;
        n5.v vVar;
        int i26;
        int i27;
        m mVar3;
        boolean z16;
        long[] jArr;
        char c10;
        int i28;
        k kVar2;
        k kVar3;
        ArrayList arrayList5;
        n nVar3 = this;
        int i29 = 1;
        while (true) {
            ArrayDeque arrayDeque = nVar3.f429m;
            if (arrayDeque.isEmpty() || ((a) arrayDeque.peek()).f363c != j) {
                break;
            }
            a aVar2 = (a) arrayDeque.pop();
            int i30 = aVar2.f368b;
            SparseArray sparseArray3 = nVar3.f423d;
            ArrayList arrayList6 = aVar2.f364d;
            int i31 = nVar3.f420a;
            int i32 = 12;
            v vVar2 = nVar3.f421b;
            if (i30 == 1836019574) {
                if ((vVar2 == null ? i29 : 0) == 0) {
                    throw new IllegalStateException("Unexpected moov box.");
                }
                C1936h b2 = b(arrayList6);
                a G9 = aVar2.G(1836475768);
                G9.getClass();
                SparseArray sparseArray4 = new SparseArray();
                ArrayList arrayList7 = G9.f364d;
                int size = arrayList7.size();
                long j10 = -9223372036854775807L;
                int i33 = 0;
                while (i33 < size) {
                    b bVar = (b) arrayList7.get(i33);
                    int i34 = bVar.f368b;
                    n5.v vVar3 = bVar.f366c;
                    if (i34 == 1953654136) {
                        vVar3.G(i32);
                        arrayList5 = arrayList7;
                        Pair create = Pair.create(Integer.valueOf(vVar3.h()), new k(vVar3.h() - i29, vVar3.h(), vVar3.h(), vVar3.h()));
                        sparseArray4.put(((Integer) create.first).intValue(), (k) create.second);
                    } else {
                        arrayList5 = arrayList7;
                        if (i34 == 1835362404) {
                            vVar3.G(8);
                            j10 = c.F(vVar3.h()) == 0 ? vVar3.w() : vVar3.z();
                        }
                    }
                    i33++;
                    i29 = 1;
                    arrayList7 = arrayList5;
                    i32 = 12;
                }
                int i35 = i29;
                ArrayList f4 = j.f(aVar2, new C1988p(), j10, b2, (i31 & 16) != 0 ? i35 : 0, false, new A1.d(nVar3, i35));
                int size2 = f4.size();
                if (sparseArray3.size() == 0) {
                    for (int i36 = 0; i36 < size2; i36++) {
                        y yVar = (y) f4.get(i36);
                        v vVar4 = yVar.f507a;
                        s4.v u3 = nVar3.f416E.u(i36, vVar4.f481b);
                        int size3 = sparseArray4.size();
                        int i37 = vVar4.f480a;
                        if (size3 == 1) {
                            kVar3 = (k) sparseArray4.valueAt(0);
                        } else {
                            kVar3 = (k) sparseArray4.get(i37);
                            kVar3.getClass();
                        }
                        sparseArray3.put(i37, new m(u3, yVar, kVar3));
                        nVar3.f440x = Math.max(nVar3.f440x, vVar4.f484e);
                    }
                    nVar3.f416E.f();
                } else {
                    AbstractC1705a.m(sparseArray3.size() == size2);
                    for (int i38 = 0; i38 < size2; i38++) {
                        y yVar2 = (y) f4.get(i38);
                        v vVar5 = yVar2.f507a;
                        m mVar4 = (m) sparseArray3.get(vVar5.f480a);
                        if (sparseArray4.size() == 1) {
                            kVar2 = (k) sparseArray4.valueAt(0);
                        } else {
                            kVar2 = (k) sparseArray4.get(vVar5.f480a);
                            kVar2.getClass();
                        }
                        mVar4.f404d = yVar2;
                        mVar4.f405e = kVar2;
                        mVar4.f401a.a(yVar2.f507a.f485f);
                        mVar4.d();
                    }
                }
                nVar = nVar3;
                i7 = 1;
            } else {
                SparseArray sparseArray5 = sparseArray3;
                if (i30 == 1836019558) {
                    boolean z17 = vVar2 != null;
                    ArrayList arrayList8 = aVar2.f365e;
                    int size4 = arrayList8.size();
                    int i39 = 0;
                    while (i39 < size4) {
                        a aVar3 = (a) arrayList8.get(i39);
                        if (aVar3.f368b == 1953653094) {
                            b H10 = aVar3.H(1952868452);
                            H10.getClass();
                            n5.v vVar6 = H10.f366c;
                            vVar6.G(8);
                            int h10 = vVar6.h();
                            m mVar5 = (m) (z17 ? sparseArray5.valueAt(0) : sparseArray5.get(vVar6.h()));
                            if (mVar5 == null) {
                                z8 = z17;
                                mVar5 = null;
                            } else {
                                int i40 = h10 & 1;
                                x xVar = mVar5.f402b;
                                if (i40 != 0) {
                                    long z18 = vVar6.z();
                                    xVar.f494b = z18;
                                    xVar.f495c = z18;
                                }
                                k kVar4 = mVar5.f405e;
                                int h11 = (h10 & 2) != 0 ? vVar6.h() - 1 : kVar4.f394a;
                                int h12 = (h10 & 8) != 0 ? vVar6.h() : kVar4.f395b;
                                if ((h10 & 16) != 0) {
                                    z8 = z17;
                                    i13 = vVar6.h();
                                } else {
                                    z8 = z17;
                                    i13 = kVar4.f396c;
                                }
                                xVar.f493a = new k(h11, h12, i13, (h10 & 32) != 0 ? vVar6.h() : kVar4.f397d);
                            }
                            if (mVar5 == null) {
                                nVar2 = nVar3;
                            } else {
                                x xVar2 = mVar5.f402b;
                                long j11 = xVar2.f505p;
                                boolean z19 = xVar2.f506q;
                                mVar5.d();
                                mVar5.f409l = true;
                                b H11 = aVar3.H(1952867444);
                                if (H11 == null || (i31 & 2) != 0) {
                                    xVar2.f505p = j11;
                                    xVar2.f506q = z19;
                                } else {
                                    n5.v vVar7 = H11.f366c;
                                    vVar7.G(8);
                                    xVar2.f505p = c.F(vVar7.h()) == 1 ? vVar7.z() : vVar7.w();
                                    xVar2.f506q = true;
                                }
                                ArrayList arrayList9 = aVar3.f364d;
                                int size5 = arrayList9.size();
                                int i41 = 0;
                                int i42 = 0;
                                int i43 = 0;
                                while (true) {
                                    i14 = 1953658222;
                                    if (i41 >= size5) {
                                        break;
                                    }
                                    ArrayList arrayList10 = arrayList8;
                                    b bVar2 = (b) arrayList9.get(i41);
                                    int i44 = size4;
                                    if (bVar2.f368b == 1953658222) {
                                        n5.v vVar8 = bVar2.f366c;
                                        vVar8.G(12);
                                        int y10 = vVar8.y();
                                        if (y10 > 0) {
                                            i43 += y10;
                                            i28 = 1;
                                            i42++;
                                            i41 += i28;
                                            size4 = i44;
                                            arrayList8 = arrayList10;
                                        }
                                    }
                                    i28 = 1;
                                    i41 += i28;
                                    size4 = i44;
                                    arrayList8 = arrayList10;
                                }
                                arrayList2 = arrayList8;
                                i12 = size4;
                                mVar5.f407h = 0;
                                mVar5.g = 0;
                                mVar5.f406f = 0;
                                xVar2.f496d = i42;
                                xVar2.f497e = i43;
                                if (xVar2.g.length < i42) {
                                    xVar2.f498f = new long[i42];
                                    xVar2.g = new int[i42];
                                }
                                if (xVar2.f499h.length < i43) {
                                    int i45 = (i43 * 125) / 100;
                                    xVar2.f499h = new int[i45];
                                    xVar2.f500i = new long[i45];
                                    xVar2.j = new boolean[i45];
                                    xVar2.f501l = new boolean[i45];
                                }
                                int i46 = 0;
                                int i47 = 0;
                                int i48 = 0;
                                while (true) {
                                    long j12 = 0;
                                    if (i46 < size5) {
                                        b bVar3 = (b) arrayList9.get(i46);
                                        if (bVar3.f368b == i14) {
                                            int i49 = i47 + 1;
                                            n5.v vVar9 = bVar3.f366c;
                                            vVar9.G(8);
                                            int h13 = vVar9.h();
                                            y yVar3 = mVar5.f404d;
                                            i16 = size5;
                                            k kVar5 = xVar2.f493a;
                                            int i50 = D.f21141a;
                                            sparseArray2 = sparseArray5;
                                            xVar2.g[i47] = vVar9.y();
                                            long[] jArr2 = xVar2.f498f;
                                            aVar = aVar3;
                                            arrayList4 = arrayList6;
                                            long j13 = xVar2.f494b;
                                            jArr2[i47] = j13;
                                            if ((h13 & 1) != 0) {
                                                i18 = i39;
                                                i20 = i48;
                                                jArr2[i47] = j13 + vVar9.h();
                                            } else {
                                                i18 = i39;
                                                i20 = i48;
                                            }
                                            boolean z20 = (h13 & 4) != 0;
                                            int i51 = kVar5.f397d;
                                            if (z20) {
                                                i51 = vVar9.h();
                                            }
                                            boolean z21 = (h13 & 256) != 0;
                                            boolean z22 = (h13 & 512) != 0;
                                            boolean z23 = (h13 & 1024) != 0;
                                            boolean z24 = (h13 & 2048) != 0;
                                            v vVar10 = yVar3.f507a;
                                            int i52 = i51;
                                            long[] jArr3 = vVar10.f486h;
                                            if (jArr3 != null) {
                                                arrayList3 = arrayList9;
                                                if (jArr3.length != 1 || (jArr = vVar10.f487i) == null) {
                                                    z11 = z20;
                                                } else {
                                                    long j14 = jArr3[0];
                                                    if (j14 == 0) {
                                                        z11 = z20;
                                                        z12 = z24;
                                                        mVar2 = mVar5;
                                                    } else {
                                                        z12 = z24;
                                                        long T10 = D.T(j14 + jArr[0], 1000000L, vVar10.f483d);
                                                        z11 = z20;
                                                        mVar2 = mVar5;
                                                        c10 = T10 >= vVar10.f484e ? (char) 0 : (char) 0;
                                                        int[] iArr = xVar2.f499h;
                                                        long[] jArr4 = xVar2.f500i;
                                                        boolean[] zArr = xVar2.j;
                                                        boolean z25 = (vVar10.f481b == 2 || (i31 & 1) == 0) ? false : true;
                                                        i21 = i20 + xVar2.g[i47];
                                                        boolean z26 = z25;
                                                        i19 = i31;
                                                        long j15 = xVar2.f505p;
                                                        i22 = i20;
                                                        while (i22 < i21) {
                                                            if (z21) {
                                                                i23 = i21;
                                                                z13 = z21;
                                                                i24 = vVar9.h();
                                                            } else {
                                                                i23 = i21;
                                                                i24 = kVar5.f395b;
                                                                z13 = z21;
                                                            }
                                                            if (i24 < 0) {
                                                                throw C1586o0.a("Unexpected negative value: " + i24, null);
                                                            }
                                                            if (z22) {
                                                                z14 = z22;
                                                                i25 = vVar9.h();
                                                            } else {
                                                                z14 = z22;
                                                                i25 = kVar5.f396c;
                                                            }
                                                            if (i25 < 0) {
                                                                throw C1586o0.a("Unexpected negative value: " + i25, null);
                                                            }
                                                            int h14 = z23 ? vVar9.h() : (i22 == 0 && z11) ? i52 : kVar5.f397d;
                                                            if (z12) {
                                                                kVar = kVar5;
                                                                z15 = z23;
                                                                vVar = vVar9;
                                                                i26 = vVar9.h();
                                                            } else {
                                                                kVar = kVar5;
                                                                z15 = z23;
                                                                vVar = vVar9;
                                                                i26 = 0;
                                                            }
                                                            long T11 = D.T((i26 + j15) - j12, 1000000L, vVar10.f482c);
                                                            jArr4[i22] = T11;
                                                            if (xVar2.f506q) {
                                                                i27 = i46;
                                                                mVar3 = mVar2;
                                                                z16 = z12;
                                                            } else {
                                                                m mVar6 = mVar2;
                                                                z16 = z12;
                                                                mVar3 = mVar6;
                                                                i27 = i46;
                                                                jArr4[i22] = T11 + mVar6.f404d.f513h;
                                                            }
                                                            iArr[i22] = i25;
                                                            zArr[i22] = ((h14 >> 16) & 1) == 0 && (!z26 || i22 == 0);
                                                            j15 += i24;
                                                            i22++;
                                                            z12 = z16;
                                                            i21 = i23;
                                                            z21 = z13;
                                                            z22 = z14;
                                                            kVar5 = kVar;
                                                            vVar9 = vVar;
                                                            z23 = z15;
                                                            i46 = i27;
                                                            mVar2 = mVar3;
                                                        }
                                                        i17 = i46;
                                                        int i53 = i21;
                                                        mVar = mVar2;
                                                        xVar2.f505p = j15;
                                                        i47 = i49;
                                                        i48 = i53;
                                                    }
                                                    j12 = jArr[c10];
                                                    int[] iArr2 = xVar2.f499h;
                                                    long[] jArr42 = xVar2.f500i;
                                                    boolean[] zArr2 = xVar2.j;
                                                    if (vVar10.f481b == 2) {
                                                    }
                                                    i21 = i20 + xVar2.g[i47];
                                                    boolean z262 = z25;
                                                    i19 = i31;
                                                    long j152 = xVar2.f505p;
                                                    i22 = i20;
                                                    while (i22 < i21) {
                                                    }
                                                    i17 = i46;
                                                    int i532 = i21;
                                                    mVar = mVar2;
                                                    xVar2.f505p = j152;
                                                    i47 = i49;
                                                    i48 = i532;
                                                }
                                            } else {
                                                z11 = z20;
                                                arrayList3 = arrayList9;
                                            }
                                            z12 = z24;
                                            mVar2 = mVar5;
                                            int[] iArr22 = xVar2.f499h;
                                            long[] jArr422 = xVar2.f500i;
                                            boolean[] zArr22 = xVar2.j;
                                            if (vVar10.f481b == 2) {
                                            }
                                            i21 = i20 + xVar2.g[i47];
                                            boolean z2622 = z25;
                                            i19 = i31;
                                            long j1522 = xVar2.f505p;
                                            i22 = i20;
                                            while (i22 < i21) {
                                            }
                                            i17 = i46;
                                            int i5322 = i21;
                                            mVar = mVar2;
                                            xVar2.f505p = j1522;
                                            i47 = i49;
                                            i48 = i5322;
                                        } else {
                                            sparseArray2 = sparseArray5;
                                            arrayList3 = arrayList9;
                                            i16 = size5;
                                            i17 = i46;
                                            i18 = i39;
                                            aVar = aVar3;
                                            arrayList4 = arrayList6;
                                            i19 = i31;
                                            mVar = mVar5;
                                        }
                                        i46 = i17 + 1;
                                        size5 = i16;
                                        sparseArray5 = sparseArray2;
                                        arrayList6 = arrayList4;
                                        aVar3 = aVar;
                                        i39 = i18;
                                        arrayList9 = arrayList3;
                                        i31 = i19;
                                        mVar5 = mVar;
                                        i14 = 1953658222;
                                    } else {
                                        sparseArray = sparseArray5;
                                        ArrayList arrayList11 = arrayList9;
                                        i11 = i39;
                                        a aVar4 = aVar3;
                                        arrayList = arrayList6;
                                        i10 = i31;
                                        y yVar4 = mVar5.f404d;
                                        k kVar6 = xVar2.f493a;
                                        kVar6.getClass();
                                        w[] wVarArr = yVar4.f507a.k;
                                        w wVar = wVarArr == null ? null : wVarArr[kVar6.f394a];
                                        b H12 = aVar4.H(1935763834);
                                        if (H12 != null) {
                                            wVar.getClass();
                                            n5.v vVar11 = H12.f366c;
                                            vVar11.G(8);
                                            if ((vVar11.h() & 1) == 1) {
                                                vVar11.H(8);
                                            }
                                            int v10 = vVar11.v();
                                            int y11 = vVar11.y();
                                            if (y11 > xVar2.f497e) {
                                                StringBuilder r10 = h3.o.r(y11, "Saiz sample count ", " is greater than fragment sample count");
                                                r10.append(xVar2.f497e);
                                                throw C1586o0.a(r10.toString(), null);
                                            }
                                            int i54 = wVar.f491d;
                                            if (v10 == 0) {
                                                boolean[] zArr3 = xVar2.f501l;
                                                i15 = 0;
                                                for (int i55 = 0; i55 < y11; i55++) {
                                                    int v11 = vVar11.v();
                                                    i15 += v11;
                                                    zArr3[i55] = v11 > i54;
                                                }
                                                z10 = false;
                                            } else {
                                                boolean z27 = v10 > i54;
                                                i15 = v10 * y11;
                                                z10 = false;
                                                Arrays.fill(xVar2.f501l, 0, y11, z27);
                                            }
                                            Arrays.fill(xVar2.f501l, y11, xVar2.f497e, z10);
                                            if (i15 > 0) {
                                                xVar2.f503n.D(i15);
                                                xVar2.k = true;
                                                xVar2.f504o = true;
                                            }
                                        }
                                        b H13 = aVar4.H(1935763823);
                                        if (H13 != null) {
                                            n5.v vVar12 = H13.f366c;
                                            vVar12.G(8);
                                            int h15 = vVar12.h();
                                            if ((h15 & 1) == 1) {
                                                vVar12.H(8);
                                            }
                                            int y12 = vVar12.y();
                                            if (y12 != 1) {
                                                throw C1586o0.a("Unexpected saio entry count: " + y12, null);
                                            }
                                            xVar2.f495c += c.F(h15) == 0 ? vVar12.w() : vVar12.z();
                                        }
                                        byte[] bArr = null;
                                        b H14 = aVar4.H(1936027235);
                                        if (H14 != null) {
                                            d(H14.f366c, 0, xVar2);
                                        }
                                        String str = wVar != null ? wVar.f489b : null;
                                        n5.v vVar13 = null;
                                        n5.v vVar14 = null;
                                        int i56 = 0;
                                        while (i56 < arrayList11.size()) {
                                            ArrayList arrayList12 = arrayList11;
                                            b bVar4 = (b) arrayList12.get(i56);
                                            n5.v vVar15 = bVar4.f366c;
                                            int i57 = bVar4.f368b;
                                            if (i57 == 1935828848) {
                                                vVar15.G(12);
                                                if (vVar15.h() == 1936025959) {
                                                    vVar13 = vVar15;
                                                }
                                            } else if (i57 == 1936158820) {
                                                vVar15.G(12);
                                                if (vVar15.h() == 1936025959) {
                                                    vVar14 = vVar15;
                                                }
                                            }
                                            i56++;
                                            arrayList11 = arrayList12;
                                        }
                                        ArrayList arrayList13 = arrayList11;
                                        if (vVar13 != null && vVar14 != null) {
                                            vVar13.G(8);
                                            int F10 = c.F(vVar13.h());
                                            vVar13.H(4);
                                            if (F10 == 1) {
                                                vVar13.H(4);
                                            }
                                            if (vVar13.h() != 1) {
                                                throw C1586o0.c("Entry count in sbgp != 1 (unsupported).");
                                            }
                                            vVar14.G(8);
                                            int F11 = c.F(vVar14.h());
                                            vVar14.H(4);
                                            if (F11 == 1) {
                                                if (vVar14.w() == 0) {
                                                    throw C1586o0.c("Variable length description in sgpd found (unsupported)");
                                                }
                                            } else if (F11 >= 2) {
                                                vVar14.H(4);
                                            }
                                            if (vVar14.w() != 1) {
                                                throw C1586o0.c("Entry count in sgpd != 1 (unsupported).");
                                            }
                                            vVar14.H(1);
                                            int v12 = vVar14.v();
                                            int i58 = (v12 & 240) >> 4;
                                            int i59 = v12 & 15;
                                            boolean z28 = vVar14.v() == 1;
                                            if (z28) {
                                                int v13 = vVar14.v();
                                                byte[] bArr2 = new byte[16];
                                                vVar14.f(0, bArr2, 16);
                                                if (v13 == 0) {
                                                    int v14 = vVar14.v();
                                                    bArr = new byte[v14];
                                                    vVar14.f(0, bArr, v14);
                                                }
                                                xVar2.k = true;
                                                xVar2.f502m = new w(z28, str, v13, bArr2, i58, i59, bArr);
                                            }
                                        }
                                        int size6 = arrayList13.size();
                                        for (int i60 = 0; i60 < size6; i60++) {
                                            b bVar5 = (b) arrayList13.get(i60);
                                            if (bVar5.f368b == 1970628964) {
                                                n5.v vVar16 = bVar5.f366c;
                                                vVar16.G(8);
                                                byte[] bArr3 = this.f426h;
                                                vVar16.f(0, bArr3, 16);
                                                if (Arrays.equals(bArr3, f410I)) {
                                                    d(vVar16, 16, xVar2);
                                                }
                                            }
                                        }
                                        nVar2 = this;
                                    }
                                }
                                i39 = i11 + 1;
                                nVar3 = nVar2;
                                z17 = z8;
                                size4 = i12;
                                arrayList8 = arrayList2;
                                sparseArray5 = sparseArray;
                                arrayList6 = arrayList;
                                i31 = i10;
                            }
                        } else {
                            nVar2 = nVar3;
                            z8 = z17;
                        }
                        sparseArray = sparseArray5;
                        arrayList2 = arrayList8;
                        i12 = size4;
                        i11 = i39;
                        arrayList = arrayList6;
                        i10 = i31;
                        i39 = i11 + 1;
                        nVar3 = nVar2;
                        z17 = z8;
                        size4 = i12;
                        arrayList8 = arrayList2;
                        sparseArray5 = sparseArray;
                        arrayList6 = arrayList;
                        i31 = i10;
                    }
                    nVar = nVar3;
                    SparseArray sparseArray6 = sparseArray5;
                    C1936h b10 = b(arrayList6);
                    if (b10 != null) {
                        int size7 = sparseArray6.size();
                        int i61 = 0;
                        while (i61 < size7) {
                            SparseArray sparseArray7 = sparseArray6;
                            m mVar7 = (m) sparseArray7.valueAt(i61);
                            y yVar5 = mVar7.f404d;
                            k kVar7 = mVar7.f402b.f493a;
                            int i62 = D.f21141a;
                            int i63 = kVar7.f394a;
                            w[] wVarArr2 = yVar5.f507a.k;
                            w wVar2 = wVarArr2 == null ? null : wVarArr2[i63];
                            C1936h a9 = b10.a(wVar2 != null ? wVar2.f489b : null);
                            K a10 = mVar7.f404d.f507a.f485f.a();
                            a10.f19986n = a9;
                            mVar7.f401a.a(new L(a10));
                            i61++;
                            sparseArray6 = sparseArray7;
                        }
                    }
                    SparseArray sparseArray8 = sparseArray6;
                    if (nVar.f439w != -9223372036854775807L) {
                        int size8 = sparseArray8.size();
                        for (int i64 = 0; i64 < size8; i64++) {
                            m mVar8 = (m) sparseArray8.valueAt(i64);
                            long j16 = nVar.f439w;
                            int i65 = mVar8.f406f;
                            while (true) {
                                x xVar3 = mVar8.f402b;
                                if (i65 < xVar3.f497e && xVar3.f500i[i65] <= j16) {
                                    if (xVar3.j[i65]) {
                                        mVar8.f408i = i65;
                                    }
                                    i65++;
                                }
                            }
                        }
                        i7 = 1;
                        nVar.f439w = -9223372036854775807L;
                    } else {
                        i7 = 1;
                    }
                } else {
                    nVar = nVar3;
                    i7 = 1;
                    if (!arrayDeque.isEmpty()) {
                        ((a) arrayDeque.peek()).f365e.add(aVar2);
                    }
                }
            }
            nVar3 = nVar;
            i29 = i7;
        }
    }

    @Override // s4.InterfaceC1982j
    public final void release() {
    }
}
