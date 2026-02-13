package z2;

import H2.C0297k;
import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;
import q1.AbstractC1875a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: f, reason: collision with root package name */
    public static final C0297k f28185f = new C0297k(17);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f28186a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f28187b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f28188c;

    /* renamed from: d, reason: collision with root package name */
    public final c[] f28189d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f28190e = new float[3];

    public b(int[] iArr, int i7, c[] cVarArr) {
        C2585a c2585a;
        this.f28189d = cVarArr;
        int[] iArr2 = new int[32768];
        this.f28187b = iArr2;
        int i10 = 0;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            int i12 = iArr[i11];
            int b2 = b(Color.blue(i12), 8, 5) | (b(Color.red(i12), 8, 5) << 10) | (b(Color.green(i12), 8, 5) << 5);
            iArr[i11] = b2;
            iArr2[b2] = iArr2[b2] + 1;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < 32768; i14++) {
            if (iArr2[i14] > 0) {
                int rgb = Color.rgb(b((i14 >> 10) & 31, 5, 8), b((i14 >> 5) & 31, 5, 8), b(i14 & 31, 5, 8));
                ThreadLocal threadLocal = AbstractC1875a.f23339a;
                int red = Color.red(rgb);
                int green = Color.green(rgb);
                int blue = Color.blue(rgb);
                float[] fArr = this.f28190e;
                AbstractC1875a.a(red, green, blue, fArr);
                if (c(fArr)) {
                    iArr2[i14] = 0;
                }
            }
            if (iArr2[i14] > 0) {
                i13++;
            }
        }
        int[] iArr3 = new int[i13];
        this.f28186a = iArr3;
        int i15 = 0;
        for (int i16 = 0; i16 < 32768; i16++) {
            if (iArr2[i16] > 0) {
                iArr3[i15] = i16;
                i15++;
            }
        }
        if (i13 <= i7) {
            this.f28188c = new ArrayList();
            while (i10 < i13) {
                int i17 = iArr3[i10];
                this.f28188c.add(new e(Color.rgb(b((i17 >> 10) & 31, 5, 8), b((i17 >> 5) & 31, 5, 8), b(i17 & 31, 5, 8)), iArr2[i17]));
                i10++;
            }
            return;
        }
        PriorityQueue priorityQueue = new PriorityQueue(i7, f28185f);
        priorityQueue.offer(new C2585a(this, 0, this.f28186a.length - 1));
        while (priorityQueue.size() < i7 && (c2585a = (C2585a) priorityQueue.poll()) != null) {
            int i18 = c2585a.f28178b;
            int i19 = c2585a.f28177a;
            if ((i18 + 1) - i19 <= 1) {
                break;
            }
            if ((i18 + 1) - i19 <= 1) {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
            int i20 = c2585a.f28181e - c2585a.f28180d;
            int i21 = c2585a.g - c2585a.f28182f;
            int i22 = c2585a.f28184i - c2585a.f28183h;
            int i23 = (i20 < i21 || i20 < i22) ? (i21 < i20 || i21 < i22) ? -1 : -2 : -3;
            b bVar = c2585a.j;
            int[] iArr4 = bVar.f28186a;
            a(iArr4, i23, i19, i18);
            Arrays.sort(iArr4, i19, c2585a.f28178b + 1);
            a(iArr4, i23, i19, c2585a.f28178b);
            int i24 = c2585a.f28179c / 2;
            int i25 = i10;
            int i26 = i19;
            while (true) {
                int i27 = c2585a.f28178b;
                if (i26 <= i27) {
                    i25 += bVar.f28187b[iArr4[i26]];
                    if (i25 >= i24) {
                        i19 = Math.min(i27 - 1, i26);
                        break;
                    }
                    i26++;
                }
            }
            C2585a c2585a2 = new C2585a(bVar, i19 + 1, c2585a.f28178b);
            c2585a.f28178b = i19;
            c2585a.a();
            priorityQueue.offer(c2585a2);
            priorityQueue.offer(c2585a);
            i10 = 0;
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            C2585a c2585a3 = (C2585a) it.next();
            b bVar2 = c2585a3.j;
            int[] iArr5 = bVar2.f28186a;
            int i28 = 0;
            int i29 = 0;
            int i30 = 0;
            int i31 = 0;
            for (int i32 = c2585a3.f28177a; i32 <= c2585a3.f28178b; i32++) {
                int i33 = iArr5[i32];
                int i34 = bVar2.f28187b[i33];
                i29 += i34;
                i28 = (((i33 >> 10) & 31) * i34) + i28;
                i30 = (((i33 >> 5) & 31) * i34) + i30;
                i31 += i34 * (i33 & 31);
            }
            float f4 = i29;
            e eVar = new e(Color.rgb(b(Math.round(i28 / f4), 5, 8), b(Math.round(i30 / f4), 5, 8), b(Math.round(i31 / f4), 5, 8)), i29);
            if (!c(eVar.b())) {
                arrayList.add(eVar);
            }
        }
        this.f28188c = arrayList;
    }

    public static void a(int[] iArr, int i7, int i10, int i11) {
        if (i7 == -2) {
            while (i10 <= i11) {
                int i12 = iArr[i10];
                iArr[i10] = (i12 & 31) | (((i12 >> 5) & 31) << 10) | (((i12 >> 10) & 31) << 5);
                i10++;
            }
            return;
        }
        if (i7 != -1) {
            return;
        }
        while (i10 <= i11) {
            int i13 = iArr[i10];
            iArr[i10] = ((i13 >> 10) & 31) | ((i13 & 31) << 10) | (((i13 >> 5) & 31) << 5);
            i10++;
        }
    }

    public static int b(int i7, int i10, int i11) {
        return (i11 > i10 ? i7 << (i11 - i10) : i7 >> (i10 - i11)) & ((1 << i11) - 1);
    }

    public final boolean c(float[] fArr) {
        c[] cVarArr = this.f28189d;
        if (cVarArr != null && cVarArr.length > 0) {
            for (c cVar : cVarArr) {
                cVar.getClass();
                float f4 = fArr[2];
                if (f4 < 0.95f && f4 > 0.05f) {
                    float f10 = fArr[0];
                    if (f10 < 10.0f || f10 > 37.0f || fArr[1] > 0.82f) {
                    }
                }
                return true;
            }
        }
        return false;
    }
}
