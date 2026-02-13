package i2;

import java.util.ArrayList;

/* renamed from: i2.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1297E {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f18209a = new ArrayList(2);

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f18210b = new ArrayList(2);

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f18211c = new ArrayList(2);

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f18212d = new ArrayList(4);

    public abstract Number a(C1322j c1322j);

    public abstract float b(C1322j c1322j);

    public final float c(int i7, float f4) {
        ArrayList arrayList = this.f18209a;
        if (arrayList.size() < 3) {
            return f4;
        }
        ArrayList arrayList2 = this.f18210b;
        if (arrayList2.size() != arrayList.size() - 1) {
            float size = arrayList.size() - 1;
            float f10 = f4 / size;
            return i7 >= 2 ? f10 + ((i7 - 1) / size) : f10;
        }
        ArrayList arrayList3 = this.f18211c;
        float floatValue = ((Float) h3.o.k(1, arrayList3)).floatValue();
        float floatValue2 = (((Float) arrayList2.get(i7 - 1)).floatValue() * f4) / floatValue;
        return i7 >= 2 ? (((Float) arrayList3.get(i7 - 2)).floatValue() / floatValue) + floatValue2 : floatValue2;
    }
}
