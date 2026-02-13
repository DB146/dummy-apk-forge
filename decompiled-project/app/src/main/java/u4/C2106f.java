package u4;

import N6.B;
import N6.F;
import N6.H;
import N6.r;
import N6.t0;
import h3.o;
import java.util.Arrays;
import m4.K;
import m4.L;
import n5.AbstractC1705a;
import n5.D;
import n5.v;

/* renamed from: u4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2106f implements InterfaceC2101a {

    /* renamed from: a, reason: collision with root package name */
    public final t0 f24865a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24866b;

    public C2106f(int i7, t0 t0Var) {
        this.f24866b = i7;
        this.f24865a = t0Var;
    }

    public static C2106f b(int i7, v vVar) {
        String str;
        InterfaceC2101a c2103c;
        int i10;
        int i11 = 4;
        r.e(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i12 = vVar.f21231c;
        int i13 = 0;
        int i14 = -2;
        int i15 = 0;
        while (vVar.a() > 8) {
            int j = vVar.j();
            int j10 = vVar.f21230b + vVar.j();
            vVar.F(j10);
            if (j == 1414744396) {
                c2103c = b(vVar.j(), vVar);
            } else {
                C2107g c2107g = null;
                switch (j) {
                    case 1718776947:
                        if (i14 != 2) {
                            if (i14 != 1) {
                                AbstractC1705a.S("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + D.E(i14));
                                break;
                            } else {
                                int o10 = vVar.o();
                                String str2 = o10 != 1 ? o10 != 85 ? o10 != 255 ? o10 != 8192 ? o10 != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str2 != null) {
                                    int o11 = vVar.o();
                                    int j11 = vVar.j();
                                    vVar.H(6);
                                    int y10 = D.y(vVar.A());
                                    int o12 = vVar.o();
                                    byte[] bArr = new byte[o12];
                                    vVar.f(i13, bArr, o12);
                                    K k = new K();
                                    k.k = str2;
                                    k.f19996x = o11;
                                    k.f19997y = j11;
                                    if ("audio/raw".equals(str2) && y10 != 0) {
                                        k.f19998z = y10;
                                    }
                                    if ("audio/mp4a-latm".equals(str2) && o12 > 0) {
                                        k.f19985m = H.K(bArr);
                                    }
                                    c2107g = new C2107g(new L(k));
                                    break;
                                } else {
                                    o.u(o10, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                    break;
                                }
                            }
                        } else {
                            vVar.H(i11);
                            int j12 = vVar.j();
                            int j13 = vVar.j();
                            vVar.H(i11);
                            int j14 = vVar.j();
                            switch (j14) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str != null) {
                                K k7 = new K();
                                k7.f19988p = j12;
                                k7.f19989q = j13;
                                k7.k = str;
                                c2107g = new C2107g(new L(k7));
                                break;
                            } else {
                                o.u(j14, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                break;
                            }
                        }
                    case 1751742049:
                        int j15 = vVar.j();
                        vVar.H(8);
                        int j16 = vVar.j();
                        int j17 = vVar.j();
                        vVar.H(i11);
                        vVar.j();
                        vVar.H(12);
                        c2103c = new C2103c(j15, j16, j17);
                        break;
                    case 1752331379:
                        int j18 = vVar.j();
                        vVar.H(12);
                        vVar.j();
                        int j19 = vVar.j();
                        int j20 = vVar.j();
                        vVar.H(i11);
                        int j21 = vVar.j();
                        int j22 = vVar.j();
                        vVar.H(8);
                        c2103c = new C2104d(j18, j19, j20, j21, j22);
                        break;
                    case 1852994675:
                        c2103c = new C2108h(vVar.t(vVar.a(), M6.e.f6799c));
                        break;
                }
                c2103c = c2107g;
            }
            if (c2103c != null) {
                if (c2103c.getType() == 1752331379) {
                    int i16 = ((C2104d) c2103c).f24851a;
                    if (i16 == 1935960438) {
                        i14 = 2;
                    } else if (i16 != 1935963489) {
                        if (i16 != 1937012852) {
                            AbstractC1705a.S("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i16));
                            i10 = -1;
                        } else {
                            i10 = 3;
                        }
                        i14 = i10;
                    } else {
                        i14 = 1;
                    }
                }
                int i17 = i15 + 1;
                if (objArr.length < i17) {
                    objArr = Arrays.copyOf(objArr, B.f(objArr.length, i17));
                }
                objArr[i15] = c2103c;
                i15 = i17;
            }
            vVar.G(j10);
            vVar.F(i12);
            i11 = 4;
            i13 = 0;
        }
        return new C2106f(i7, H.D(i15, objArr));
    }

    public final InterfaceC2101a a(Class cls) {
        F listIterator = this.f24865a.listIterator(0);
        while (listIterator.hasNext()) {
            InterfaceC2101a interfaceC2101a = (InterfaceC2101a) listIterator.next();
            if (interfaceC2101a.getClass() == cls) {
                return interfaceC2101a;
            }
        }
        return null;
    }

    @Override // u4.InterfaceC2101a
    public final int getType() {
        return this.f24866b;
    }
}
