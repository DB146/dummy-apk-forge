package o7;

import A9.C0098j;
import W1.C;
import android.content.ClipData;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.accessibility.AccessibilityNodeInfo;
import c7.C0914c;
import c7.InterfaceC0913b;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.kt.apps.core.utils.ActivityUtilsKt;
import hb.InterfaceC1269b;
import ia.C1358d;
import java.io.EOFException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeoutException;
import jb.InterfaceC1393d;
import m4.C1586o0;
import n5.AbstractC1705a;
import o5.C1807b;
import r7.C1947c;
import s4.C1979g;
import s4.C1986n;
import t7.InterfaceC2030a;
import va.C2157a;
import va.C2159c;
import w7.ExecutorC2223b;
import x.AbstractC2243m;
import x.C2251v;
import x.InterfaceC2244n;
import x.InterfaceC2250u;
import x.r0;
import x.s0;
import y1.InterfaceC2358f;
import y4.C2387c;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Continuation, gb.b, InterfaceC2030a, InterfaceC1393d, InterfaceC2244n, s0, InterfaceC2358f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22100a;

    /* renamed from: b, reason: collision with root package name */
    public Object f22101b;

    public o(float f4, AbstractC2243m abstractC2243m) {
        this.f22100a = 14;
        int i7 = r0.f26150a;
        this.f22101b = new q3.i(abstractC2243m != null ? new o(abstractC2243m, f4) : new C1358d(f4));
    }

    public o(int i7) {
        this.f22100a = i7;
        switch (i7) {
            case 6:
                this.f22101b = new n5.v(10);
                return;
            default:
                return;
        }
    }

    public o(ContentInfo contentInfo) {
        this.f22100a = 16;
        contentInfo.getClass();
        this.f22101b = n5.s.h(contentInfo);
    }

    public /* synthetic */ o(Object obj, int i7) {
        this.f22100a = i7;
        this.f22101b = obj;
    }

    public o(AbstractC2243m abstractC2243m, float f4) {
        this.f22100a = 13;
        int b2 = abstractC2243m.b();
        C2251v[] c2251vArr = new C2251v[b2];
        for (int i7 = 0; i7 < b2; i7++) {
            c2251vArr[i7] = new C2251v(f4, abstractC2243m.a(i7));
        }
        this.f22101b = c2251vArr;
    }

    public static o m(boolean z8, int i7, int i10, int i11, int i12) {
        return new o(AccessibilityNodeInfo.CollectionItemInfo.obtain(i7, i10, i11, i12, false, z8), 18);
    }

    @Override // gb.b
    public void a() {
        ((gb.b) this.f22101b).a();
    }

    @Override // jb.InterfaceC1393d
    public void accept(Object obj) {
        switch (this.f22100a) {
            case 10:
                Throwable it = (Throwable) obj;
                kotlin.jvm.internal.l.e(it, "it");
                C2159c c2159c = (C2159c) this.f22101b;
                if (!c2159c.K() || c2159c.f10272P || c2159c.A() == null) {
                    return;
                }
                c2159c.C0.a();
                C2159c c2159c2 = (C2159c) this.f22101b;
                ActivityUtilsKt.showSuccessDialog$default((C) c2159c2, (Rb.a) new C2157a(c2159c2, 2), "Cập nhật nguồn kênh thất bại", (Integer) null, false, 12, (Object) null);
                return;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
            default:
                List bannerAds = (List) obj;
                xa.i iVar = (xa.i) this.f22101b;
                kotlin.jvm.internal.l.e(bannerAds, "bannerAds");
                if (bannerAds.isEmpty()) {
                    return;
                }
                try {
                    int i7 = xa.i.f26297r2;
                    C0098j c0098j = iVar.f27464h1;
                    if (c0098j == null) {
                        c0098j = null;
                    }
                    if (c0098j != null) {
                        c0098j.h(0, bannerAds);
                    }
                    iVar.i1();
                    return;
                } catch (Exception e2) {
                    Log.e("FootballPlaybackFragment", "Failed to add banner ads", e2);
                    return;
                }
            case 12:
                Throwable it2 = (Throwable) obj;
                kotlin.jvm.internal.l.e(it2, "it");
                wa.h t5 = (wa.h) this.f22101b;
                kotlin.jvm.internal.l.e(t5, "t");
                return;
        }
    }

    @Override // x.s0, x.q0
    public boolean b() {
        ((q3.i) this.f22101b).getClass();
        return false;
    }

    @Override // gb.b, gb.q
    public void c(InterfaceC1269b interfaceC1269b) {
        ((gb.b) this.f22101b).c(interfaceC1269b);
    }

    @Override // x.q0
    public AbstractC2243m d(long j, AbstractC2243m abstractC2243m, AbstractC2243m abstractC2243m2, AbstractC2243m abstractC2243m3) {
        return ((q3.i) this.f22101b).d(j, abstractC2243m, abstractC2243m2, abstractC2243m3);
    }

    @Override // y1.InterfaceC2358f
    public ClipData e() {
        ClipData clip;
        clip = ((ContentInfo) this.f22101b).getClip();
        return clip;
    }

    @Override // y1.InterfaceC2358f
    public int f() {
        int flags;
        flags = ((ContentInfo) this.f22101b).getFlags();
        return flags;
    }

    @Override // y1.InterfaceC2358f
    public ContentInfo g() {
        return (ContentInfo) this.f22101b;
    }

    @Override // x.InterfaceC2244n
    public InterfaceC2250u get(int i7) {
        return ((C2251v[]) this.f22101b)[i7];
    }

    @Override // x.q0
    public long h(AbstractC2243m abstractC2243m, AbstractC2243m abstractC2243m2, AbstractC2243m abstractC2243m3) {
        return ((q3.i) this.f22101b).h(abstractC2243m, abstractC2243m2, abstractC2243m3);
    }

    @Override // y1.InterfaceC2358f
    public int i() {
        int source;
        source = ((ContentInfo) this.f22101b).getSource();
        return source;
    }

    @Override // t7.InterfaceC2030a
    public void j(Bundle bundle) {
        ((C0914c) ((InterfaceC0913b) this.f22101b)).a("clx", "_ae", bundle);
    }

    public void k(int i7, int i10, C1979g c1979g) {
        C2387c c2387c;
        C2387c c2387c2;
        C2387c c2387c3;
        long j;
        int i11;
        int i12;
        int i13;
        y4.d dVar = (y4.d) this.f22101b;
        SparseArray sparseArray = dVar.f26936c;
        int i14 = 4;
        int i15 = 0;
        int i16 = 1;
        if (i7 != 161 && i7 != 163) {
            if (i7 == 165) {
                if (dVar.f26913G != 2) {
                    return;
                }
                C2387c c2387c4 = (C2387c) sparseArray.get(dVar.f26918M);
                if (dVar.f26921P != 4 || !"V_VP9".equals(c2387c4.f26879b)) {
                    c1979g.r(i10);
                    return;
                }
                n5.v vVar = dVar.f26944n;
                vVar.D(i10);
                c1979g.h(vVar.f21229a, 0, i10, false);
                return;
            }
            if (i7 == 16877) {
                dVar.d(i7);
                C2387c c2387c5 = dVar.f26951u;
                int i17 = c2387c5.g;
                if (i17 != 1685485123 && i17 != 1685480259) {
                    c1979g.r(i10);
                    return;
                }
                byte[] bArr = new byte[i10];
                c2387c5.f26866N = bArr;
                c1979g.h(bArr, 0, i10, false);
                return;
            }
            if (i7 == 16981) {
                dVar.d(i7);
                C2387c c2387c6 = dVar.f26951u;
                byte[] bArr2 = new byte[i10];
                c2387c6.f26885i = bArr2;
                c1979g.h(bArr2, 0, i10, false);
                return;
            }
            if (i7 == 18402) {
                byte[] bArr3 = new byte[i10];
                c1979g.h(bArr3, 0, i10, false);
                dVar.d(i7);
                dVar.f26951u.j = new s4.u(1, bArr3, 0, 0);
                return;
            }
            if (i7 == 21419) {
                n5.v vVar2 = dVar.f26941i;
                Arrays.fill(vVar2.f21229a, (byte) 0);
                c1979g.h(vVar2.f21229a, 4 - i10, i10, false);
                vVar2.G(0);
                dVar.f26953w = (int) vVar2.w();
                return;
            }
            if (i7 == 25506) {
                dVar.d(i7);
                C2387c c2387c7 = dVar.f26951u;
                byte[] bArr4 = new byte[i10];
                c2387c7.k = bArr4;
                c1979g.h(bArr4, 0, i10, false);
                return;
            }
            if (i7 != 30322) {
                throw C1586o0.a("Unexpected id: " + i7, null);
            }
            dVar.d(i7);
            C2387c c2387c8 = dVar.f26951u;
            byte[] bArr5 = new byte[i10];
            c2387c8.f26896v = bArr5;
            c1979g.h(bArr5, 0, i10, false);
            return;
        }
        int i18 = dVar.f26913G;
        n5.v vVar3 = dVar.g;
        if (i18 == 0) {
            y4.e eVar = dVar.f26934b;
            dVar.f26918M = (int) eVar.c(c1979g, false, true, 8);
            dVar.f26919N = eVar.f26960c;
            dVar.f26915I = -9223372036854775807L;
            dVar.f26913G = 1;
            vVar3.D(0);
        }
        C2387c c2387c9 = (C2387c) sparseArray.get(dVar.f26918M);
        if (c2387c9 == null) {
            c1979g.r(i10 - dVar.f26919N);
            dVar.f26913G = 0;
            return;
        }
        c2387c9.f26876X.getClass();
        if (dVar.f26913G == 1) {
            dVar.i(c1979g, 3);
            int i19 = (vVar3.f21229a[2] & 6) >> 1;
            byte b2 = 255;
            if (i19 == 0) {
                dVar.f26917K = 1;
                int[] iArr = dVar.L;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                dVar.L = iArr;
                iArr[0] = (i10 - dVar.f26919N) - 3;
            } else {
                dVar.i(c1979g, 4);
                int i20 = (vVar3.f21229a[3] & 255) + 1;
                dVar.f26917K = i20;
                int[] iArr2 = dVar.L;
                if (iArr2 == null) {
                    iArr2 = new int[i20];
                } else if (iArr2.length < i20) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i20)];
                }
                dVar.L = iArr2;
                if (i19 == 2) {
                    int i21 = (i10 - dVar.f26919N) - 4;
                    int i22 = dVar.f26917K;
                    Arrays.fill(iArr2, 0, i22, i21 / i22);
                } else {
                    if (i19 != 1) {
                        if (i19 != 3) {
                            throw C1586o0.a("Unexpected lacing value: " + i19, null);
                        }
                        int i23 = 0;
                        int i24 = 0;
                        while (true) {
                            int i25 = dVar.f26917K - i16;
                            if (i23 >= i25) {
                                c2387c2 = c2387c9;
                                dVar.L[i25] = ((i10 - dVar.f26919N) - i14) - i24;
                                break;
                            }
                            dVar.L[i23] = i15;
                            int i26 = i14 + 1;
                            dVar.i(c1979g, i26);
                            if (vVar3.f21229a[i14] == 0) {
                                throw C1586o0.a("No valid varint length mask found", null);
                            }
                            int i27 = i15;
                            while (true) {
                                if (i27 >= 8) {
                                    c2387c3 = c2387c9;
                                    j = 0;
                                    i14 = i26;
                                    break;
                                }
                                int i28 = i16 << (7 - i27);
                                if ((vVar3.f21229a[i14] & i28) != 0) {
                                    int i29 = i26 + i27;
                                    dVar.i(c1979g, i29);
                                    C2387c c2387c10 = c2387c9;
                                    j = vVar3.f21229a[i14] & b2 & (~i28);
                                    while (i26 < i29) {
                                        j = (j << 8) | (vVar3.f21229a[i26] & 255);
                                        i26++;
                                        c2387c10 = c2387c10;
                                    }
                                    c2387c3 = c2387c10;
                                    if (i23 > 0) {
                                        j -= (1 << ((i27 * 7) + 6)) - 1;
                                    }
                                    i14 = i29;
                                } else {
                                    i27++;
                                    b2 = 255;
                                    i16 = 1;
                                }
                            }
                            if (j < -2147483648L || j > 2147483647L) {
                                break;
                            }
                            int i30 = (int) j;
                            int[] iArr3 = dVar.L;
                            if (i23 != 0) {
                                i30 += iArr3[i23 - 1];
                            }
                            iArr3[i23] = i30;
                            i24 += i30;
                            i23++;
                            c2387c9 = c2387c3;
                            b2 = 255;
                            i15 = 0;
                            i16 = 1;
                        }
                        throw C1586o0.a("EBML lacing sample size out of range.", null);
                    }
                    int i31 = 0;
                    int i32 = 0;
                    while (true) {
                        i11 = dVar.f26917K - 1;
                        if (i31 >= i11) {
                            break;
                        }
                        dVar.L[i31] = 0;
                        while (true) {
                            i12 = i14 + 1;
                            dVar.i(c1979g, i12);
                            int i33 = vVar3.f21229a[i14] & 255;
                            int[] iArr4 = dVar.L;
                            i13 = iArr4[i31] + i33;
                            iArr4[i31] = i13;
                            if (i33 != 255) {
                                break;
                            } else {
                                i14 = i12;
                            }
                        }
                        i32 += i13;
                        i31++;
                        i14 = i12;
                    }
                    dVar.L[i11] = ((i10 - dVar.f26919N) - i14) - i32;
                }
            }
            c2387c2 = c2387c9;
            byte[] bArr6 = vVar3.f21229a;
            dVar.f26914H = dVar.k((bArr6[1] & 255) | (bArr6[0] << 8)) + dVar.f26908B;
            c2387c = c2387c2;
            dVar.f26920O = (c2387c.f26881d == 2 || (i7 == 163 && (vVar3.f21229a[2] & 128) == 128)) ? 1 : 0;
            dVar.f26913G = 2;
            dVar.f26916J = 0;
        } else {
            c2387c = c2387c9;
        }
        if (i7 == 163) {
            while (true) {
                int i34 = dVar.f26916J;
                if (i34 >= dVar.f26917K) {
                    dVar.f26913G = 0;
                    return;
                }
                dVar.g(c2387c, ((dVar.f26916J * c2387c.f26882e) / 1000) + dVar.f26914H, dVar.f26920O, dVar.l(c1979g, c2387c, dVar.L[i34], false), 0);
                dVar.f26916J++;
                c2387c = c2387c;
            }
        } else {
            C2387c c2387c11 = c2387c;
            while (true) {
                int i35 = dVar.f26916J;
                if (i35 >= dVar.f26917K) {
                    return;
                }
                int[] iArr5 = dVar.L;
                iArr5[i35] = dVar.l(c1979g, c2387c11, iArr5[i35], true);
                dVar.f26916J++;
            }
        }
    }

    public void l(int i7, long j) {
        y4.d dVar = (y4.d) this.f22101b;
        dVar.getClass();
        if (i7 == 20529) {
            if (j == 0) {
                return;
            }
            throw C1586o0.a("ContentEncodingOrder " + j + " not supported", null);
        }
        if (i7 == 20530) {
            if (j == 1) {
                return;
            }
            throw C1586o0.a("ContentEncodingScope " + j + " not supported", null);
        }
        switch (i7) {
            case 131:
                dVar.d(i7);
                dVar.f26951u.f26881d = (int) j;
                return;
            case 136:
                dVar.d(i7);
                dVar.f26951u.f26874V = j == 1;
                return;
            case 155:
                dVar.f26915I = dVar.k(j);
                return;
            case 159:
                dVar.d(i7);
                dVar.f26951u.f26867O = (int) j;
                return;
            case 176:
                dVar.d(i7);
                dVar.f26951u.f26887m = (int) j;
                return;
            case 179:
                dVar.b(i7);
                dVar.f26909C.a(dVar.k(j));
                return;
            case 186:
                dVar.d(i7);
                dVar.f26951u.f26888n = (int) j;
                return;
            case 215:
                dVar.d(i7);
                dVar.f26951u.f26880c = (int) j;
                return;
            case 231:
                dVar.f26908B = dVar.k(j);
                return;
            case 238:
                dVar.f26921P = (int) j;
                return;
            case 241:
                if (dVar.f26911E) {
                    return;
                }
                dVar.b(i7);
                dVar.f26910D.a(j);
                dVar.f26911E = true;
                return;
            case 251:
                dVar.f26922Q = true;
                return;
            case 16871:
                dVar.d(i7);
                dVar.f26951u.g = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw C1586o0.a("ContentCompAlgo " + j + " not supported", null);
            case 17029:
                if (j < 1 || j > 2) {
                    throw C1586o0.a("DocTypeReadVersion " + j + " not supported", null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw C1586o0.a("EBMLReadVersion " + j + " not supported", null);
            case 18401:
                if (j == 5) {
                    return;
                }
                throw C1586o0.a("ContentEncAlgo " + j + " not supported", null);
            case 18408:
                if (j == 1) {
                    return;
                }
                throw C1586o0.a("AESSettingsCipherMode " + j + " not supported", null);
            case 21420:
                dVar.f26954x = j + dVar.f26947q;
                return;
            case 21432:
                int i10 = (int) j;
                dVar.d(i7);
                if (i10 == 0) {
                    dVar.f26951u.f26897w = 0;
                    return;
                }
                if (i10 == 1) {
                    dVar.f26951u.f26897w = 2;
                    return;
                } else if (i10 == 3) {
                    dVar.f26951u.f26897w = 1;
                    return;
                } else {
                    if (i10 != 15) {
                        return;
                    }
                    dVar.f26951u.f26897w = 3;
                    return;
                }
            case 21680:
                dVar.d(i7);
                dVar.f26951u.f26889o = (int) j;
                return;
            case 21682:
                dVar.d(i7);
                dVar.f26951u.f26891q = (int) j;
                return;
            case 21690:
                dVar.d(i7);
                dVar.f26951u.f26890p = (int) j;
                return;
            case 21930:
                dVar.d(i7);
                dVar.f26951u.f26873U = j == 1;
                return;
            case 21998:
                dVar.d(i7);
                dVar.f26951u.f26883f = (int) j;
                return;
            case 22186:
                dVar.d(i7);
                dVar.f26951u.f26870R = j;
                return;
            case 22203:
                dVar.d(i7);
                dVar.f26951u.f26871S = j;
                return;
            case 25188:
                dVar.d(i7);
                dVar.f26951u.f26868P = (int) j;
                return;
            case 30114:
                dVar.f26923R = j;
                return;
            case 30321:
                dVar.d(i7);
                int i11 = (int) j;
                if (i11 == 0) {
                    dVar.f26951u.f26892r = 0;
                    return;
                }
                if (i11 == 1) {
                    dVar.f26951u.f26892r = 1;
                    return;
                } else if (i11 == 2) {
                    dVar.f26951u.f26892r = 2;
                    return;
                } else {
                    if (i11 != 3) {
                        return;
                    }
                    dVar.f26951u.f26892r = 3;
                    return;
                }
            case 2352003:
                dVar.d(i7);
                dVar.f26951u.f26882e = (int) j;
                return;
            case 2807729:
                dVar.f26948r = j;
                return;
            default:
                switch (i7) {
                    case 21945:
                        dVar.d(i7);
                        int i12 = (int) j;
                        if (i12 == 1) {
                            dVar.f26951u.f26854A = 2;
                            return;
                        } else {
                            if (i12 != 2) {
                                return;
                            }
                            dVar.f26951u.f26854A = 1;
                            return;
                        }
                    case 21946:
                        dVar.d(i7);
                        int c10 = C1807b.c((int) j);
                        if (c10 != -1) {
                            dVar.f26951u.f26900z = c10;
                            return;
                        }
                        return;
                    case 21947:
                        dVar.d(i7);
                        dVar.f26951u.f26898x = true;
                        int b2 = C1807b.b((int) j);
                        if (b2 != -1) {
                            dVar.f26951u.f26899y = b2;
                            return;
                        }
                        return;
                    case 21948:
                        dVar.d(i7);
                        dVar.f26951u.f26855B = (int) j;
                        return;
                    case 21949:
                        dVar.d(i7);
                        dVar.f26951u.f26856C = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // x.q0
    public AbstractC2243m n(long j, AbstractC2243m abstractC2243m, AbstractC2243m abstractC2243m2, AbstractC2243m abstractC2243m3) {
        return ((q3.i) this.f22101b).n(j, abstractC2243m, abstractC2243m2, abstractC2243m3);
    }

    @Override // x.q0
    public AbstractC2243m o(AbstractC2243m abstractC2243m, AbstractC2243m abstractC2243m2, AbstractC2243m abstractC2243m3) {
        return ((q3.i) this.f22101b).o(abstractC2243m, abstractC2243m2, abstractC2243m3);
    }

    @Override // gb.b, gb.q
    public void onError(Throwable th) {
        ((gb.b) this.f22101b).a();
    }

    public void p(D7.d dVar, Thread thread, Throwable th) {
        Task continueWithTask;
        v7.l lVar = (v7.l) this.f22101b;
        synchronized (lVar) {
            String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            long currentTimeMillis = System.currentTimeMillis();
            ExecutorC2223b executorC2223b = lVar.f25132e.f25819a;
            v7.j jVar = new v7.j(lVar, currentTimeMillis, th, thread, dVar);
            synchronized (executorC2223b.f25816b) {
                continueWithTask = executorC2223b.f25817c.continueWithTask(executorC2223b.f25815a, new C1947c(jVar, 14));
                executorC2223b.f25817c = continueWithTask;
            }
            try {
                v7.y.a(continueWithTask);
            } catch (TimeoutException unused) {
                Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
            } catch (Exception e2) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e2);
            }
        }
    }

    public F4.c q(C1979g c1979g, K4.g gVar) {
        n5.v vVar = (n5.v) this.f22101b;
        F4.c cVar = null;
        int i7 = 0;
        while (true) {
            try {
                c1979g.x(vVar.f21229a, 0, 10, false);
                vVar.G(0);
                if (vVar.x() != 4801587) {
                    break;
                }
                vVar.H(3);
                int u3 = vVar.u();
                int i10 = u3 + 10;
                if (cVar == null) {
                    byte[] bArr = new byte[i10];
                    System.arraycopy(vVar.f21229a, 0, bArr, 0, 10);
                    c1979g.x(bArr, 10, u3, false);
                    cVar = new K4.i(gVar).W(i10, bArr);
                } else {
                    c1979g.b(u3, false);
                }
                i7 += i10;
            } catch (EOFException unused) {
            }
        }
        c1979g.f24057f = 0;
        c1979g.b(i7, false);
        return cVar;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [y4.c, java.lang.Object] */
    public void r(int i7, long j, long j10) {
        y4.d dVar = (y4.d) this.f22101b;
        AbstractC1705a.n(dVar.f26935b0);
        if (i7 == 160) {
            dVar.f26922Q = false;
            dVar.f26923R = 0L;
            return;
        }
        if (i7 != 174) {
            if (i7 == 187) {
                dVar.f26911E = false;
                return;
            }
            if (i7 == 19899) {
                dVar.f26953w = -1;
                dVar.f26954x = -1L;
                return;
            }
            if (i7 == 20533) {
                dVar.d(i7);
                dVar.f26951u.f26884h = true;
                return;
            }
            if (i7 == 21968) {
                dVar.d(i7);
                dVar.f26951u.f26898x = true;
                return;
            }
            if (i7 == 408125543) {
                long j11 = dVar.f26947q;
                if (j11 != -1 && j11 != j) {
                    throw C1586o0.a("Multiple Segment elements not supported", null);
                }
                dVar.f26947q = j;
                dVar.f26946p = j10;
                return;
            }
            if (i7 == 475249515) {
                dVar.f26909C = new n5.m(0);
                dVar.f26910D = new n5.m(0);
                return;
            } else {
                if (i7 == 524531317 && !dVar.f26952v) {
                    if (dVar.f26937d && dVar.f26956z != -1) {
                        dVar.f26955y = true;
                        return;
                    } else {
                        dVar.f26935b0.i(new C1986n(dVar.f26950t));
                        dVar.f26952v = true;
                        return;
                    }
                }
                return;
            }
        }
        ?? obj = new Object();
        obj.f26887m = -1;
        obj.f26888n = -1;
        obj.f26889o = -1;
        obj.f26890p = -1;
        obj.f26891q = 0;
        obj.f26892r = -1;
        obj.f26893s = 0.0f;
        obj.f26894t = 0.0f;
        obj.f26895u = 0.0f;
        obj.f26896v = null;
        obj.f26897w = -1;
        obj.f26898x = false;
        obj.f26899y = -1;
        obj.f26900z = -1;
        obj.f26854A = -1;
        obj.f26855B = 1000;
        obj.f26856C = 200;
        obj.f26857D = -1.0f;
        obj.f26858E = -1.0f;
        obj.f26859F = -1.0f;
        obj.f26860G = -1.0f;
        obj.f26861H = -1.0f;
        obj.f26862I = -1.0f;
        obj.f26863J = -1.0f;
        obj.f26864K = -1.0f;
        obj.L = -1.0f;
        obj.f26865M = -1.0f;
        obj.f26867O = 1;
        obj.f26868P = -1;
        obj.f26869Q = 8000;
        obj.f26870R = 0L;
        obj.f26871S = 0L;
        obj.f26874V = true;
        obj.f26875W = "eng";
        dVar.f26951u = obj;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean isSuccessful = task.isSuccessful();
        Tb.a aVar = (Tb.a) this.f22101b;
        if (isSuccessful) {
            return aVar.Q((String) task.getResult());
        }
        Exception exception = task.getException();
        G.g(exception);
        Log.e("RecaptchaCallWrapper", "Failed to get Recaptcha token, error - " + exception.getMessage() + "\n\n Failing open with a fake token.");
        return aVar.Q("NO_RECAPTCHA");
    }

    public String toString() {
        switch (this.f22100a) {
            case 16:
                return "ContentInfoCompat{" + ((ContentInfo) this.f22101b) + "}";
            default:
                return super.toString();
        }
    }
}
