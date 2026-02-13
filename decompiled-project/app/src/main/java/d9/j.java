package d9;

import P8.m;
import P8.n;
import P8.o;
import P8.p;
import java.util.ArrayList;
import java.util.EnumMap;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f16598c = {1, 1, 2};

    /* renamed from: a, reason: collision with root package name */
    public final Object f16599a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f16600b;

    public j(int i7) {
        switch (i7) {
            case 1:
                this.f16599a = new ArrayList();
                this.f16600b = new ArrayList();
                return;
            default:
                this.f16599a = new i(1);
                this.f16600b = new i(0);
                return;
        }
    }

    public void a(int[] iArr, String str) {
        ((ArrayList) this.f16599a).add(iArr);
        ((ArrayList) this.f16600b).add(str);
    }

    public n b(int i7, int i10, V8.a aVar) {
        EnumMap enumMap;
        int[] l10 = k.l(aVar, i10, false, f16598c, new int[3]);
        try {
            return ((i) this.f16600b).a(i7, aVar, l10);
        } catch (m unused) {
            i iVar = (i) this.f16599a;
            StringBuilder sb2 = iVar.f16597b;
            sb2.setLength(0);
            int[] iArr = iVar.f16596a;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            int i11 = aVar.f10193b;
            int i12 = l10[1];
            int i13 = 0;
            for (int i14 = 0; i14 < 2 && i12 < i11; i14++) {
                int h10 = k.h(aVar, iArr, i12, k.g);
                sb2.append((char) ((h10 % 10) + 48));
                for (int i15 : iArr) {
                    i12 += i15;
                }
                if (h10 >= 10) {
                    i13 |= 1 << (1 - i14);
                }
                if (i14 != 1) {
                    i12 = aVar.f(aVar.e(i12));
                }
            }
            if (sb2.length() != 2) {
                throw P8.j.a();
            }
            if (Integer.parseInt(sb2.toString()) % 4 != i13) {
                throw P8.j.a();
            }
            String sb3 = sb2.toString();
            if (sb3.length() != 2) {
                enumMap = null;
            } else {
                enumMap = new EnumMap(o.class);
                enumMap.put((EnumMap) o.f8242f, (o) Integer.valueOf(sb3));
            }
            float f4 = i7;
            n nVar = new n(sb3, null, new p[]{new p((l10[0] + l10[1]) / 2.0f, f4), new p(i12, f4)}, P8.a.f8178E);
            if (enumMap != null) {
                nVar.a(enumMap);
            }
            return nVar;
        }
    }
}
