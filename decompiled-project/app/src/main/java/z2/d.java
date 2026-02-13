package z2;

import android.graphics.Bitmap;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import u.C2052e;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f28191a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f28192b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28193c;

    /* renamed from: d, reason: collision with root package name */
    public final int f28194d;

    /* renamed from: e, reason: collision with root package name */
    public final int f28195e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f28196f;

    public d(Bitmap bitmap) {
        ArrayList arrayList = new ArrayList();
        this.f28192b = arrayList;
        this.f28193c = 16;
        this.f28194d = 12544;
        this.f28195e = -1;
        ArrayList arrayList2 = new ArrayList();
        this.f28196f = arrayList2;
        if (bitmap == null || bitmap.isRecycled()) {
            throw new IllegalArgumentException("Bitmap is not valid");
        }
        arrayList2.add(f.f28205e);
        this.f28191a = bitmap;
        arrayList.add(g.f28210d);
        arrayList.add(g.f28211e);
        arrayList.add(g.f28212f);
        arrayList.add(g.g);
        arrayList.add(g.f28213h);
        arrayList.add(g.f28214i);
    }

    public final f a() {
        int max;
        int i7;
        ArrayList arrayList;
        int i10;
        boolean z8;
        int i11;
        Bitmap bitmap = this.f28191a;
        if (bitmap == null) {
            throw new AssertionError();
        }
        int i12 = this.f28194d;
        double d10 = -1.0d;
        if (i12 > 0) {
            int height = bitmap.getHeight() * bitmap.getWidth();
            if (height > i12) {
                d10 = Math.sqrt(i12 / height);
            }
        } else {
            int i13 = this.f28195e;
            if (i13 > 0 && (max = Math.max(bitmap.getWidth(), bitmap.getHeight())) > i13) {
                d10 = i13 / max;
            }
        }
        int i14 = 0;
        Bitmap createScaledBitmap = d10 <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * d10), (int) Math.ceil(bitmap.getHeight() * d10), false);
        int width = createScaledBitmap.getWidth();
        int height2 = createScaledBitmap.getHeight();
        int[] iArr = new int[width * height2];
        createScaledBitmap.getPixels(iArr, 0, width, 0, 0, width, height2);
        ArrayList arrayList2 = this.f28196f;
        b bVar = new b(iArr, this.f28193c, arrayList2.isEmpty() ? null : (c[]) arrayList2.toArray(new c[arrayList2.size()]));
        if (createScaledBitmap != bitmap) {
            createScaledBitmap.recycle();
        }
        ArrayList arrayList3 = bVar.f28188c;
        ArrayList arrayList4 = this.f28192b;
        f fVar = new f(arrayList3, arrayList4);
        int size = arrayList4.size();
        int i15 = 0;
        while (true) {
            SparseBooleanArray sparseBooleanArray = fVar.f28208c;
            if (i15 >= size) {
                sparseBooleanArray.clear();
                return fVar;
            }
            g gVar = (g) arrayList4.get(i15);
            float[] fArr = gVar.f28217c;
            int length = fArr.length;
            float f4 = 0.0f;
            for (int i16 = i14; i16 < length; i16++) {
                float f10 = fArr[i16];
                if (f10 > 0.0f) {
                    f4 += f10;
                }
            }
            if (f4 != 0.0f) {
                int length2 = fArr.length;
                for (int i17 = i14; i17 < length2; i17++) {
                    float f11 = fArr[i17];
                    if (f11 > 0.0f) {
                        fArr[i17] = f11 / f4;
                    }
                }
            }
            C2052e c2052e = fVar.f28207b;
            ArrayList arrayList5 = fVar.f28206a;
            int size2 = arrayList5.size();
            int i18 = i14;
            float f12 = 0.0f;
            e eVar = null;
            while (i18 < size2) {
                e eVar2 = (e) arrayList5.get(i18);
                float[] b2 = eVar2.b();
                float f13 = b2[1];
                float[] fArr2 = gVar.f28215a;
                if (f13 >= fArr2[i14] && f13 <= fArr2[2]) {
                    float f14 = b2[2];
                    float[] fArr3 = gVar.f28216b;
                    if (f14 >= fArr3[i14] && f14 <= fArr3[2]) {
                        if (sparseBooleanArray.get(eVar2.f28200d)) {
                            i7 = size;
                            arrayList = arrayList4;
                            i10 = 0;
                            z8 = false;
                            i18++;
                            i14 = i10;
                            size = i7;
                            arrayList4 = arrayList;
                        } else {
                            float[] b10 = eVar2.b();
                            i7 = size;
                            e eVar3 = fVar.f28209d;
                            if (eVar3 != null) {
                                i11 = eVar3.f28201e;
                                arrayList = arrayList4;
                            } else {
                                arrayList = arrayList4;
                                i11 = 1;
                            }
                            float[] fArr4 = gVar.f28217c;
                            i10 = 0;
                            float f15 = fArr4[0];
                            float abs = f15 > 0.0f ? (1.0f - Math.abs(b10[1] - fArr2[1])) * f15 : 0.0f;
                            float f16 = fArr4[1];
                            float abs2 = f16 > 0.0f ? (1.0f - Math.abs(b10[2] - fArr3[1])) * f16 : 0.0f;
                            float f17 = fArr4[2];
                            z8 = false;
                            float f18 = abs + abs2 + (f17 > 0.0f ? (eVar2.f28201e / i11) * f17 : 0.0f);
                            if (eVar == null || f18 > f12) {
                                f12 = f18;
                                eVar = eVar2;
                            }
                            i18++;
                            i14 = i10;
                            size = i7;
                            arrayList4 = arrayList;
                        }
                    }
                }
                i7 = size;
                arrayList = arrayList4;
                i10 = i14;
                z8 = false;
                i18++;
                i14 = i10;
                size = i7;
                arrayList4 = arrayList;
            }
            int i19 = size;
            ArrayList arrayList6 = arrayList4;
            int i20 = i14;
            if (eVar != null) {
                sparseBooleanArray.append(eVar.f28200d, true);
            }
            c2052e.put(gVar, eVar);
            i15++;
            i14 = i20;
            size = i19;
            arrayList4 = arrayList6;
        }
    }
}
