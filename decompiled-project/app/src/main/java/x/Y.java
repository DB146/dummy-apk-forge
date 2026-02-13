package x;

import a0.C0694u;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import i0.C1289b;

/* loaded from: classes.dex */
public final class Y extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26024a;

    /* renamed from: b, reason: collision with root package name */
    public static final Y f26013b = new Y(1, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final Y f26014c = new Y(1, 1);

    /* renamed from: d, reason: collision with root package name */
    public static final Y f26015d = new Y(1, 2);

    /* renamed from: e, reason: collision with root package name */
    public static final Y f26016e = new Y(1, 3);

    /* renamed from: f, reason: collision with root package name */
    public static final Y f26017f = new Y(1, 4);

    /* renamed from: u, reason: collision with root package name */
    public static final Y f26018u = new Y(1, 5);

    /* renamed from: v, reason: collision with root package name */
    public static final Y f26019v = new Y(1, 6);

    /* renamed from: w, reason: collision with root package name */
    public static final Y f26020w = new Y(1, 7);

    /* renamed from: x, reason: collision with root package name */
    public static final Y f26021x = new Y(1, 8);

    /* renamed from: y, reason: collision with root package name */
    public static final Y f26022y = new Y(1, 9);

    /* renamed from: z, reason: collision with root package name */
    public static final Y f26023z = new Y(1, 10);

    /* renamed from: A, reason: collision with root package name */
    public static final Y f26003A = new Y(1, 11);

    /* renamed from: B, reason: collision with root package name */
    public static final Y f26004B = new Y(1, 12);

    /* renamed from: C, reason: collision with root package name */
    public static final Y f26005C = new Y(1, 13);

    /* renamed from: D, reason: collision with root package name */
    public static final Y f26006D = new Y(1, 14);

    /* renamed from: E, reason: collision with root package name */
    public static final Y f26007E = new Y(1, 15);

    /* renamed from: F, reason: collision with root package name */
    public static final Y f26008F = new Y(1, 16);

    /* renamed from: G, reason: collision with root package name */
    public static final Y f26009G = new Y(1, 17);

    /* renamed from: H, reason: collision with root package name */
    public static final Y f26010H = new Y(1, 18);

    /* renamed from: I, reason: collision with root package name */
    public static final Y f26011I = new Y(1, 19);

    /* renamed from: J, reason: collision with root package name */
    public static final Y f26012J = new Y(1, 20);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y(int i7, int i10) {
        super(i7);
        this.f26024a = i10;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Db.g, java.lang.Object] */
    @Override // Rb.c
    public final Object invoke(Object obj) {
        switch (this.f26024a) {
            case 0:
                return Db.q.f3365a;
            case 1:
                ((Rb.a) obj).invoke();
                return Db.q.f3365a;
            case 2:
                O o10 = (O) obj;
                long j = o10.f25968f;
                ((C0694u) n0.f26126a.getValue()).c(o10, f26015d, o10.f25969u);
                long j10 = o10.f25968f;
                if (j != j10) {
                    D d10 = o10.f25960B;
                    if (d10 != null) {
                        if (d10.f25905a > j10) {
                            o10.Q();
                        } else {
                            d10.g = j10;
                            if (d10.f25906b == null) {
                                d10.f25911h = Tb.a.G((1.0d - d10.f25909e.a(0)) * o10.f25968f);
                            }
                        }
                    } else if (j10 != 0) {
                        o10.S();
                    }
                }
                return Db.q.f3365a;
            case 3:
                long j11 = ((V0.g) obj).f9974a;
                return new C2240j(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)));
            case 4:
                C2240j c2240j = (C2240j) obj;
                return new V0.g((Float.floatToRawIntBits(c2240j.f26108a) << 32) | (Float.floatToRawIntBits(c2240j.f26109b) & 4294967295L));
            case 5:
                return new C2239i(((V0.f) obj).f9973a);
            case 6:
                return new V0.f(((C2239i) obj).f26098a);
            case 7:
                return new C2239i(((Number) obj).floatValue());
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                return Float.valueOf(((C2239i) obj).f26098a);
            case 9:
                long j12 = ((V0.i) obj).f9975a;
                return new C2240j((int) (j12 >> 32), (int) (j12 & 4294967295L));
            case 10:
                C2240j c2240j2 = (C2240j) obj;
                return new V0.i((Math.round(c2240j2.f26108a) << 32) | (Math.round(c2240j2.f26109b) & 4294967295L));
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                long j13 = ((V0.k) obj).f9981a;
                return new C2240j((int) (j13 >> 32), (int) (j13 & 4294967295L));
            case 12:
                C2240j c2240j3 = (C2240j) obj;
                int round = Math.round(c2240j3.f26108a);
                if (round < 0) {
                    round = 0;
                }
                return new V0.k(((Math.round(c2240j3.f26109b) >= 0 ? r7 : 0) & 4294967295L) | (round << 32));
            case 13:
                return new C2239i(((Number) obj).intValue());
            case 14:
                return Integer.valueOf((int) ((C2239i) obj).f26098a);
            case 15:
                long j14 = ((C1289b) obj).f18172a;
                return new C2240j(Float.intBitsToFloat((int) (j14 >> 32)), Float.intBitsToFloat((int) (j14 & 4294967295L)));
            case 16:
                C2240j c2240j4 = (C2240j) obj;
                return new C1289b((Float.floatToRawIntBits(c2240j4.f26108a) << 32) | (Float.floatToRawIntBits(c2240j4.f26109b) & 4294967295L));
            case 17:
                i0.c cVar = (i0.c) obj;
                return new C2242l(cVar.f18174a, cVar.f18175b, cVar.f18176c, cVar.f18177d);
            case 18:
                C2242l c2242l = (C2242l) obj;
                return new i0.c(c2242l.f26118a, c2242l.f26119b, c2242l.f26120c, c2242l.f26121d);
            case 19:
                long j15 = ((i0.e) obj).f18185a;
                return new C2240j(Float.intBitsToFloat((int) (j15 >> 32)), Float.intBitsToFloat((int) (j15 & 4294967295L)));
            default:
                C2240j c2240j5 = (C2240j) obj;
                return new i0.e((Float.floatToRawIntBits(c2240j5.f26108a) << 32) | (Float.floatToRawIntBits(c2240j5.f26109b) & 4294967295L));
        }
    }
}
