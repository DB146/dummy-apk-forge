package i2;

import A9.C0;
import android.util.Property;
import h6.ViewOnLayoutChangeListenerC1254a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: i2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1322j {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f18267a;

    /* renamed from: b, reason: collision with root package name */
    public final List f18268b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f18269c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f18270d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f18271e;

    /* renamed from: f, reason: collision with root package name */
    public final C1303K f18272f;
    public final C1303K g;

    public C1322j() {
        ArrayList arrayList = new ArrayList();
        this.f18267a = arrayList;
        this.f18268b = Collections.unmodifiableList(arrayList);
        this.f18269c = new int[4];
        this.f18270d = new float[4];
        this.f18271e = new ArrayList(4);
        new C0(this, 5);
        new ViewOnLayoutChangeListenerC1254a(this, 3);
        C1303K b2 = b("overviewRowTop");
        b2.getClass();
        this.f18272f = b2;
        C1303K b10 = b("overviewRowBottom");
        b10.getClass();
        this.g = b10;
    }

    public final AbstractC1297E a(C1294B... c1294bArr) {
        AbstractC1297E abstractC1297E = c1294bArr[0].f18206a != null ? new AbstractC1297E() : new AbstractC1297E();
        ArrayList arrayList = abstractC1297E.f18209a;
        arrayList.clear();
        for (C1294B c1294b : c1294bArr) {
            arrayList.add(c1294b);
        }
        this.f18271e.add(abstractC1297E);
        return abstractC1297E;
    }

    public final C1303K b(String str) {
        ArrayList arrayList = this.f18267a;
        int size = arrayList.size();
        C1303K c1303k = new C1303K(str, size);
        int length = this.f18269c.length;
        if (length == size) {
            int[] iArr = new int[length * 2];
            for (int i7 = 0; i7 < length; i7++) {
                iArr[i7] = this.f18269c[i7];
            }
            this.f18269c = iArr;
        }
        this.f18269c[size] = Integer.MAX_VALUE;
        arrayList.add(c1303k);
        return c1303k;
    }

    public final void c(int i7, int i10) {
        if (i7 >= this.f18267a.size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.f18269c[i7] = i10;
    }

    public final void d() {
        Iterator it = this.f18268b.iterator();
        while (it.hasNext()) {
            C1303K c1303k = (C1303K) ((Property) it.next());
            c1303k.getClass();
            c(c1303k.f18219a, com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f18271e;
            if (i7 >= arrayList.size()) {
                return;
            }
            AbstractC1297E abstractC1297E = (AbstractC1297E) arrayList.get(i7);
            if (abstractC1297E.f18209a.size() >= 2) {
                boolean z8 = abstractC1297E instanceof C1296D;
                ArrayList arrayList2 = this.f18267a;
                if (z8) {
                    if (arrayList2.size() >= 2) {
                        int i10 = this.f18269c[0];
                        int i11 = 1;
                        while (i11 < arrayList2.size()) {
                            int i12 = this.f18269c[i11];
                            if (i12 < i10) {
                                Integer valueOf = Integer.valueOf(i11);
                                String name = ((Property) arrayList2.get(i11)).getName();
                                int i13 = i11 - 1;
                                throw new IllegalStateException(String.format("Parallax Property[%d]\"%s\" is smaller than Property[%d]\"%s\"", valueOf, name, Integer.valueOf(i13), ((Property) arrayList2.get(i13)).getName()));
                            }
                            if (i10 == Integer.MIN_VALUE && i12 == Integer.MAX_VALUE) {
                                int i14 = i11 - 1;
                                throw new IllegalStateException(String.format("Parallax Property[%d]\"%s\" is UNKNOWN_BEFORE and Property[%d]\"%s\" is UNKNOWN_AFTER", Integer.valueOf(i14), ((Property) arrayList2.get(i14)).getName(), Integer.valueOf(i11), ((Property) arrayList2.get(i11)).getName()));
                            }
                            i11++;
                            i10 = i12;
                        }
                    }
                } else if (arrayList2.size() >= 2) {
                    float f4 = this.f18270d[0];
                    int i15 = 1;
                    while (i15 < arrayList2.size()) {
                        float f10 = this.f18270d[i15];
                        if (f10 < f4) {
                            Integer valueOf2 = Integer.valueOf(i15);
                            String name2 = ((Property) arrayList2.get(i15)).getName();
                            int i16 = i15 - 1;
                            throw new IllegalStateException(String.format("Parallax Property[%d]\"%s\" is smaller than Property[%d]\"%s\"", valueOf2, name2, Integer.valueOf(i16), ((Property) arrayList2.get(i16)).getName()));
                        }
                        if (f4 == -3.4028235E38f && f10 == Float.MAX_VALUE) {
                            int i17 = i15 - 1;
                            throw new IllegalStateException(String.format("Parallax Property[%d]\"%s\" is UNKNOWN_BEFORE and Property[%d]\"%s\" is UNKNOWN_AFTER", Integer.valueOf(i17), ((Property) arrayList2.get(i17)).getName(), Integer.valueOf(i15), ((Property) arrayList2.get(i15)).getName()));
                        }
                        i15++;
                        f4 = f10;
                    }
                }
                float f11 = 0.0f;
                Number number = null;
                int i18 = 0;
                boolean z10 = false;
                while (true) {
                    ArrayList arrayList3 = abstractC1297E.f18212d;
                    if (i18 < arrayList3.size()) {
                        AbstractC1299G abstractC1299G = (AbstractC1299G) arrayList3.get(i18);
                        abstractC1299G.getClass();
                        if (abstractC1299G instanceof C1298F) {
                            if (number == null) {
                                number = abstractC1297E.a(this);
                            }
                            abstractC1299G.a(number);
                        } else {
                            if (!z10) {
                                f11 = abstractC1297E.b(this);
                                z10 = true;
                            }
                            abstractC1299G.b(f11);
                        }
                        i18++;
                    }
                }
            }
            i7++;
        }
    }
}
