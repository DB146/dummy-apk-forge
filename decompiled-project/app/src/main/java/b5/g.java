package b5;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import h3.o;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n5.AbstractC1705a;
import n5.v;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: A, reason: collision with root package name */
    public List f13957A;

    /* renamed from: B, reason: collision with root package name */
    public List f13958B;

    /* renamed from: C, reason: collision with root package name */
    public f f13959C;

    /* renamed from: D, reason: collision with root package name */
    public int f13960D;

    /* renamed from: u, reason: collision with root package name */
    public final v f13961u = new v();

    /* renamed from: v, reason: collision with root package name */
    public final f f13962v = new f();

    /* renamed from: w, reason: collision with root package name */
    public int f13963w = -1;

    /* renamed from: x, reason: collision with root package name */
    public final int f13964x;

    /* renamed from: y, reason: collision with root package name */
    public final e[] f13965y;

    /* renamed from: z, reason: collision with root package name */
    public e f13966z;

    public g(int i7, List list) {
        this.f13964x = i7 == -1 ? 1 : i7;
        if (list != null && list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
            byte b2 = ((byte[]) list.get(0))[0];
        }
        this.f13965y = new e[8];
        for (int i10 = 0; i10 < 8; i10++) {
            this.f13965y[i10] = new e();
        }
        this.f13966z = this.f13965y[0];
    }

    @Override // b5.i
    public final j b() {
        List list = this.f13957A;
        this.f13958B = list;
        list.getClass();
        return new j(list);
    }

    @Override // b5.i
    public final void c(h hVar) {
        ByteBuffer byteBuffer = hVar.f23458d;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        v vVar = this.f13961u;
        vVar.E(limit, array);
        while (vVar.a() >= 3) {
            int v10 = vVar.v();
            int i7 = v10 & 3;
            boolean z8 = (v10 & 4) == 4;
            byte v11 = (byte) vVar.v();
            byte v12 = (byte) vVar.v();
            if (i7 == 2 || i7 == 3) {
                if (z8) {
                    if (i7 == 3) {
                        i();
                        int i10 = (v11 & 192) >> 6;
                        int i11 = this.f13963w;
                        if (i11 != -1 && i10 != (i11 + 1) % 4) {
                            k();
                            AbstractC1705a.S("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f13963w + " current=" + i10);
                        }
                        this.f13963w = i10;
                        int i12 = v11 & 63;
                        if (i12 == 0) {
                            i12 = 64;
                        }
                        f fVar = new f(i10, i12);
                        this.f13959C = fVar;
                        fVar.f13956e = 1;
                        fVar.f13953b[0] = v12;
                    } else {
                        AbstractC1705a.h(i7 == 2);
                        f fVar2 = this.f13959C;
                        if (fVar2 == null) {
                            AbstractC1705a.t("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr = fVar2.f13953b;
                            int i13 = fVar2.f13956e;
                            int i14 = i13 + 1;
                            fVar2.f13956e = i14;
                            bArr[i13] = v11;
                            fVar2.f13956e = i13 + 2;
                            bArr[i14] = v12;
                        }
                    }
                    f fVar3 = this.f13959C;
                    if (fVar3.f13956e == (fVar3.f13955d * 2) - 1) {
                        i();
                    }
                }
            }
        }
    }

    @Override // b5.i, q4.c
    public final void flush() {
        super.flush();
        this.f13957A = null;
        this.f13958B = null;
        this.f13960D = 0;
        this.f13966z = this.f13965y[0];
        k();
        this.f13959C = null;
    }

    @Override // b5.i
    public final boolean g() {
        return this.f13957A != this.f13958B;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:56:0x014b. Please report as an issue. */
    public final void i() {
        int i7;
        int i10;
        String str;
        boolean z8;
        char c10;
        int i11;
        String str2;
        f fVar = this.f13959C;
        if (fVar == null) {
            return;
        }
        int i12 = 2;
        String str3 = "Cea708Decoder";
        if (fVar.f13956e != (fVar.f13955d * 2) - 1) {
            AbstractC1705a.s("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f13959C.f13955d * 2) - 1) + ", but current index is " + this.f13959C.f13956e + " (sequence number " + this.f13959C.f13954c + ");");
        }
        f fVar2 = this.f13959C;
        byte[] bArr = fVar2.f13953b;
        int i13 = fVar2.f13956e;
        f fVar3 = this.f13962v;
        fVar3.n(i13, bArr);
        boolean z10 = false;
        while (true) {
            if (fVar3.b() > 0) {
                int i14 = 3;
                int i15 = fVar3.i(3);
                int i16 = fVar3.i(5);
                if (i15 == 7) {
                    fVar3.s(i12);
                    i15 = fVar3.i(6);
                    if (i15 < 7) {
                        o.u(i15, "Invalid extended service number: ", str3);
                    }
                }
                if (i16 == 0) {
                    if (i15 != 0) {
                        AbstractC1705a.S(str3, "serviceNumber is non-zero (" + i15 + ") when blockSize is 0");
                    }
                } else if (i15 != this.f13964x) {
                    fVar3.t(i16);
                } else {
                    int g = (i16 * 8) + fVar3.g();
                    while (fVar3.g() < g) {
                        int i17 = fVar3.i(8);
                        if (i17 != 16) {
                            if (i17 <= 31) {
                                if (i17 != 0) {
                                    if (i17 == i14) {
                                        this.f13957A = j();
                                    } else if (i17 != 8) {
                                        switch (i17) {
                                            case 12:
                                                k();
                                                break;
                                            case 13:
                                                this.f13966z.a('\n');
                                                break;
                                            case 14:
                                                break;
                                            default:
                                                if (i17 < 17 || i17 > 23) {
                                                    if (i17 < 24 || i17 > 31) {
                                                        o.u(i17, "Invalid C0 command: ", str3);
                                                        break;
                                                    } else {
                                                        AbstractC1705a.S(str3, "Currently unsupported COMMAND_P16 Command: " + i17);
                                                        fVar3.s(16);
                                                        break;
                                                    }
                                                } else {
                                                    AbstractC1705a.S(str3, "Currently unsupported COMMAND_EXT1 Command: " + i17);
                                                    fVar3.s(8);
                                                    break;
                                                }
                                        }
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder = this.f13966z.f13934b;
                                        int length = spannableStringBuilder.length();
                                        if (length > 0) {
                                            spannableStringBuilder.delete(length - 1, length);
                                        }
                                    }
                                }
                                i11 = i12;
                                i7 = i14;
                                i10 = g;
                            } else if (i17 <= 127) {
                                if (i17 == 127) {
                                    this.f13966z.a((char) 9835);
                                } else {
                                    this.f13966z.a((char) (i17 & 255));
                                }
                                i11 = i12;
                                i7 = i14;
                                i10 = g;
                                z10 = true;
                            } else {
                                if (i17 <= 159) {
                                    e[] eVarArr = this.f13965y;
                                    switch (i17) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            str2 = str3;
                                            i7 = i14;
                                            i10 = g;
                                            z8 = true;
                                            int i18 = i17 - 128;
                                            if (this.f13960D != i18) {
                                                this.f13960D = i18;
                                                this.f13966z = eVarArr[i18];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            str2 = str3;
                                            i7 = i14;
                                            i10 = g;
                                            z8 = true;
                                            for (int i19 = 1; i19 <= 8; i19++) {
                                                if (fVar3.h()) {
                                                    e eVar = eVarArr[8 - i19];
                                                    eVar.f13933a.clear();
                                                    eVar.f13934b.clear();
                                                    eVar.f13945p = -1;
                                                    eVar.f13946q = -1;
                                                    eVar.f13947r = -1;
                                                    eVar.f13949t = -1;
                                                    eVar.f13951v = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            str2 = str3;
                                            i7 = i14;
                                            i10 = g;
                                            for (int i20 = 1; i20 <= 8; i20++) {
                                                if (fVar3.h()) {
                                                    eVarArr[8 - i20].f13936d = true;
                                                }
                                            }
                                            z8 = true;
                                            break;
                                        case 138:
                                            str2 = str3;
                                            i7 = i14;
                                            i10 = g;
                                            for (int i21 = 1; i21 <= 8; i21++) {
                                                if (fVar3.h()) {
                                                    eVarArr[8 - i21].f13936d = false;
                                                }
                                            }
                                            z8 = true;
                                            break;
                                        case 139:
                                            str2 = str3;
                                            i7 = i14;
                                            i10 = g;
                                            for (int i22 = 1; i22 <= 8; i22++) {
                                                if (fVar3.h()) {
                                                    eVarArr[8 - i22].f13936d = !r1.f13936d;
                                                }
                                            }
                                            z8 = true;
                                            break;
                                        case 140:
                                            str2 = str3;
                                            i7 = i14;
                                            i10 = g;
                                            for (int i23 = 1; i23 <= 8; i23++) {
                                                if (fVar3.h()) {
                                                    eVarArr[8 - i23].d();
                                                }
                                            }
                                            z8 = true;
                                            break;
                                        case 141:
                                            str2 = str3;
                                            i7 = i14;
                                            i10 = g;
                                            fVar3.s(8);
                                            z8 = true;
                                            break;
                                        case 142:
                                            str2 = str3;
                                            i7 = i14;
                                            i10 = g;
                                            z8 = true;
                                            break;
                                        case 143:
                                            str2 = str3;
                                            i7 = i14;
                                            i10 = g;
                                            k();
                                            z8 = true;
                                            break;
                                        case 144:
                                            str2 = str3;
                                            i10 = g;
                                            if (!this.f13966z.f13935c) {
                                                fVar3.s(16);
                                                i7 = 3;
                                                z8 = true;
                                                break;
                                            } else {
                                                fVar3.i(4);
                                                fVar3.i(2);
                                                fVar3.i(2);
                                                boolean h10 = fVar3.h();
                                                boolean h11 = fVar3.h();
                                                i7 = 3;
                                                fVar3.i(3);
                                                fVar3.i(3);
                                                this.f13966z.e(h10, h11);
                                                z8 = true;
                                            }
                                        case 145:
                                            str2 = str3;
                                            i10 = g;
                                            if (this.f13966z.f13935c) {
                                                int c11 = e.c(fVar3.i(2), fVar3.i(2), fVar3.i(2), fVar3.i(2));
                                                int c12 = e.c(fVar3.i(2), fVar3.i(2), fVar3.i(2), fVar3.i(2));
                                                fVar3.s(2);
                                                e.c(fVar3.i(2), fVar3.i(2), fVar3.i(2), 0);
                                                this.f13966z.f(c11, c12);
                                            } else {
                                                fVar3.s(24);
                                            }
                                            i7 = 3;
                                            z8 = true;
                                            break;
                                        case 146:
                                            str2 = str3;
                                            i10 = g;
                                            if (this.f13966z.f13935c) {
                                                fVar3.s(4);
                                                int i24 = fVar3.i(4);
                                                fVar3.s(2);
                                                fVar3.i(6);
                                                e eVar2 = this.f13966z;
                                                if (eVar2.f13951v != i24) {
                                                    eVar2.a('\n');
                                                }
                                                eVar2.f13951v = i24;
                                            } else {
                                                fVar3.s(16);
                                            }
                                            i7 = 3;
                                            z8 = true;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            o.u(i17, "Invalid C1 command: ", str3);
                                            str2 = str3;
                                            i7 = i14;
                                            i10 = g;
                                            z8 = true;
                                            break;
                                        case 151:
                                            str2 = str3;
                                            i10 = g;
                                            if (this.f13966z.f13935c) {
                                                int c13 = e.c(fVar3.i(2), fVar3.i(2), fVar3.i(2), fVar3.i(2));
                                                fVar3.i(2);
                                                e.c(fVar3.i(2), fVar3.i(2), fVar3.i(2), 0);
                                                fVar3.h();
                                                fVar3.h();
                                                fVar3.i(2);
                                                fVar3.i(2);
                                                int i25 = fVar3.i(2);
                                                fVar3.s(8);
                                                e eVar3 = this.f13966z;
                                                eVar3.f13944o = c13;
                                                eVar3.f13941l = i25;
                                            } else {
                                                fVar3.s(32);
                                            }
                                            i7 = 3;
                                            z8 = true;
                                            break;
                                        case ModuleDescriptor.MODULE_VERSION /* 152 */:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i26 = i17 - 152;
                                            e eVar4 = eVarArr[i26];
                                            fVar3.s(i12);
                                            boolean h12 = fVar3.h();
                                            boolean h13 = fVar3.h();
                                            fVar3.h();
                                            int i27 = fVar3.i(i14);
                                            boolean h14 = fVar3.h();
                                            int i28 = fVar3.i(7);
                                            int i29 = fVar3.i(8);
                                            int i30 = fVar3.i(4);
                                            int i31 = fVar3.i(4);
                                            fVar3.s(i12);
                                            i10 = g;
                                            fVar3.i(6);
                                            fVar3.s(i12);
                                            int i32 = fVar3.i(3);
                                            str2 = str3;
                                            int i33 = fVar3.i(3);
                                            eVar4.f13935c = true;
                                            eVar4.f13936d = h12;
                                            eVar4.k = h13;
                                            eVar4.f13937e = i27;
                                            eVar4.f13938f = h14;
                                            eVar4.g = i28;
                                            eVar4.f13939h = i29;
                                            eVar4.f13940i = i30;
                                            int i34 = i31 + 1;
                                            if (eVar4.j != i34) {
                                                eVar4.j = i34;
                                                while (true) {
                                                    ArrayList arrayList = eVar4.f13933a;
                                                    if ((h13 && arrayList.size() >= eVar4.j) || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (i32 != 0 && eVar4.f13942m != i32) {
                                                eVar4.f13942m = i32;
                                                int i35 = i32 - 1;
                                                int i36 = e.f13925C[i35];
                                                boolean z11 = e.f13924B[i35];
                                                int i37 = e.f13932z[i35];
                                                int i38 = e.f13923A[i35];
                                                int i39 = e.f13931y[i35];
                                                eVar4.f13944o = i36;
                                                eVar4.f13941l = i39;
                                            }
                                            if (i33 != 0 && eVar4.f13943n != i33) {
                                                eVar4.f13943n = i33;
                                                int i40 = i33 - 1;
                                                int i41 = e.f13927E[i40];
                                                int i42 = e.f13926D[i40];
                                                eVar4.e(false, false);
                                                eVar4.f(e.f13929w, e.f13928F[i40]);
                                            }
                                            if (this.f13960D != i26) {
                                                this.f13960D = i26;
                                                this.f13966z = eVarArr[i26];
                                            }
                                            i7 = 3;
                                            z8 = true;
                                            break;
                                    }
                                } else {
                                    str2 = str3;
                                    i7 = i14;
                                    i10 = g;
                                    z8 = true;
                                    if (i17 <= 255) {
                                        this.f13966z.a((char) (i17 & 255));
                                    } else {
                                        str = str2;
                                        o.u(i17, "Invalid base command: ", str);
                                        i11 = 2;
                                        c10 = 7;
                                    }
                                }
                                z10 = z8;
                                str = str2;
                                i11 = 2;
                                c10 = 7;
                            }
                            c10 = 7;
                            str = str3;
                            z8 = true;
                        } else {
                            i7 = i14;
                            i10 = g;
                            str = str3;
                            z8 = true;
                            int i43 = fVar3.i(8);
                            if (i43 <= 31) {
                                c10 = 7;
                                if (i43 > 7) {
                                    if (i43 <= 15) {
                                        fVar3.s(8);
                                    } else if (i43 <= 23) {
                                        fVar3.s(16);
                                    } else if (i43 <= 31) {
                                        fVar3.s(24);
                                    }
                                }
                            } else {
                                c10 = 7;
                                if (i43 <= 127) {
                                    if (i43 == 32) {
                                        this.f13966z.a(' ');
                                    } else if (i43 == 33) {
                                        this.f13966z.a((char) 160);
                                    } else if (i43 == 37) {
                                        this.f13966z.a((char) 8230);
                                    } else if (i43 == 42) {
                                        this.f13966z.a((char) 352);
                                    } else if (i43 == 44) {
                                        this.f13966z.a((char) 338);
                                    } else if (i43 == 63) {
                                        this.f13966z.a((char) 376);
                                    } else if (i43 == 57) {
                                        this.f13966z.a((char) 8482);
                                    } else if (i43 == 58) {
                                        this.f13966z.a((char) 353);
                                    } else if (i43 == 60) {
                                        this.f13966z.a((char) 339);
                                    } else if (i43 != 61) {
                                        switch (i43) {
                                            case 48:
                                                this.f13966z.a((char) 9608);
                                                break;
                                            case 49:
                                                this.f13966z.a((char) 8216);
                                                break;
                                            case 50:
                                                this.f13966z.a((char) 8217);
                                                break;
                                            case 51:
                                                this.f13966z.a((char) 8220);
                                                break;
                                            case 52:
                                                this.f13966z.a((char) 8221);
                                                break;
                                            case 53:
                                                this.f13966z.a((char) 8226);
                                                break;
                                            default:
                                                switch (i43) {
                                                    case 118:
                                                        this.f13966z.a((char) 8539);
                                                        break;
                                                    case 119:
                                                        this.f13966z.a((char) 8540);
                                                        break;
                                                    case 120:
                                                        this.f13966z.a((char) 8541);
                                                        break;
                                                    case 121:
                                                        this.f13966z.a((char) 8542);
                                                        break;
                                                    case 122:
                                                        this.f13966z.a((char) 9474);
                                                        break;
                                                    case 123:
                                                        this.f13966z.a((char) 9488);
                                                        break;
                                                    case 124:
                                                        this.f13966z.a((char) 9492);
                                                        break;
                                                    case 125:
                                                        this.f13966z.a((char) 9472);
                                                        break;
                                                    case 126:
                                                        this.f13966z.a((char) 9496);
                                                        break;
                                                    case 127:
                                                        this.f13966z.a((char) 9484);
                                                        break;
                                                    default:
                                                        o.u(i43, "Invalid G2 character: ", str);
                                                        break;
                                                }
                                        }
                                    } else {
                                        this.f13966z.a((char) 8480);
                                    }
                                    z10 = true;
                                } else if (i43 > 159) {
                                    i11 = 2;
                                    if (i43 <= 255) {
                                        if (i43 == 160) {
                                            this.f13966z.a((char) 13252);
                                        } else {
                                            o.u(i43, "Invalid G3 character: ", str);
                                            this.f13966z.a('_');
                                        }
                                        z10 = true;
                                    } else {
                                        o.u(i43, "Invalid extended command: ", str);
                                    }
                                } else if (i43 <= 135) {
                                    fVar3.s(32);
                                } else if (i43 <= 143) {
                                    fVar3.s(40);
                                } else if (i43 <= 159) {
                                    i11 = 2;
                                    fVar3.s(2);
                                    fVar3.s(fVar3.i(6) * 8);
                                }
                            }
                            i11 = 2;
                        }
                        i14 = i7;
                        str3 = str;
                        g = i10;
                        i12 = i11;
                    }
                }
            }
        }
        if (z10) {
            this.f13957A = j();
        }
        this.f13959C = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List j() {
        d dVar;
        Layout.Alignment alignment;
        float f4;
        float f10;
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < 8; i7++) {
            e[] eVarArr = this.f13965y;
            e eVar = eVarArr[i7];
            if (eVar.f13935c && (!eVar.f13933a.isEmpty() || eVar.f13934b.length() != 0)) {
                e eVar2 = eVarArr[i7];
                if (eVar2.f13936d) {
                    if (eVar2.f13935c) {
                        ArrayList arrayList2 = eVar2.f13933a;
                        if (!arrayList2.isEmpty() || eVar2.f13934b.length() != 0) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                                spannableStringBuilder.append((CharSequence) arrayList2.get(i10));
                                spannableStringBuilder.append('\n');
                            }
                            spannableStringBuilder.append((CharSequence) eVar2.b());
                            int i11 = eVar2.f13941l;
                            if (i11 != 0) {
                                if (i11 == 1) {
                                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                } else if (i11 == 2) {
                                    alignment = Layout.Alignment.ALIGN_CENTER;
                                } else if (i11 != 3) {
                                    throw new IllegalArgumentException("Unexpected justification value: " + eVar2.f13941l);
                                }
                                Layout.Alignment alignment2 = alignment;
                                if (eVar2.f13938f) {
                                    f4 = eVar2.f13939h / 209.0f;
                                    f10 = eVar2.g / 74.0f;
                                } else {
                                    f4 = eVar2.f13939h / 99.0f;
                                    f10 = eVar2.g / 99.0f;
                                }
                                float f11 = (f4 * 0.9f) + 0.05f;
                                float f12 = (f10 * 0.9f) + 0.05f;
                                int i12 = eVar2.f13940i;
                                int i13 = i12 / 3;
                                int i14 = i13 != 0 ? 0 : i13 == 1 ? 1 : 2;
                                int i15 = i12 % 3;
                                int i16 = i15 != 0 ? 0 : i15 == 1 ? 1 : 2;
                                int i17 = eVar2.f13944o;
                                dVar = new d(spannableStringBuilder, alignment2, f12, i14, f11, i16, i17 == e.f13930x, i17, eVar2.f13937e);
                                if (dVar != null) {
                                    arrayList.add(dVar);
                                }
                            }
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            Layout.Alignment alignment22 = alignment;
                            if (eVar2.f13938f) {
                            }
                            float f112 = (f4 * 0.9f) + 0.05f;
                            float f122 = (f10 * 0.9f) + 0.05f;
                            int i122 = eVar2.f13940i;
                            int i132 = i122 / 3;
                            if (i132 != 0) {
                            }
                            int i152 = i122 % 3;
                            if (i152 != 0) {
                            }
                            int i172 = eVar2.f13944o;
                            dVar = new d(spannableStringBuilder, alignment22, f122, i14, f112, i16, i172 == e.f13930x, i172, eVar2.f13937e);
                            if (dVar != null) {
                            }
                        }
                    }
                    dVar = null;
                    if (dVar != null) {
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, d.f13920c);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            arrayList3.add(((d) arrayList.get(i18)).f13921a);
        }
        return Collections.unmodifiableList(arrayList3);
    }

    public final void k() {
        for (int i7 = 0; i7 < 8; i7++) {
            this.f13965y[i7].d();
        }
    }
}
