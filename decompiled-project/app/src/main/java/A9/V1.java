package A9;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class V1 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f986a = new ArrayList(2);

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f987b = new ArrayList(2);

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f988c = new ArrayList(2);

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f989d = new ArrayList(4);

    public abstract Number a(C0115n0 c0115n0);

    public abstract float b(C0115n0 c0115n0);

    public final float c(int i7, float f4) {
        ArrayList arrayList = this.f986a;
        if (arrayList.size() < 3) {
            return f4;
        }
        ArrayList arrayList2 = this.f987b;
        if (arrayList2.size() != arrayList.size() - 1) {
            float size = arrayList.size() - 1;
            float f10 = f4 / size;
            return i7 >= 2 ? f10 + ((i7 - 1) / size) : f10;
        }
        ArrayList arrayList3 = this.f988c;
        float floatValue = ((Float) h3.o.k(1, arrayList3)).floatValue();
        float floatValue2 = (((Float) arrayList2.get(i7 - 1)).floatValue() * f4) / floatValue;
        return i7 >= 2 ? (((Float) arrayList3.get(i7 - 2)).floatValue() / floatValue) + floatValue2 : floatValue2;
    }
}
