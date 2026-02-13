package A4;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: c, reason: collision with root package name */
    public final long f363c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f364d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f365e;

    public a(int i7, long j) {
        super(i7, 0);
        this.f363c = j;
        this.f364d = new ArrayList();
        this.f365e = new ArrayList();
    }

    public final a G(int i7) {
        ArrayList arrayList = this.f365e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) arrayList.get(i10);
            if (aVar.f368b == i7) {
                return aVar;
            }
        }
        return null;
    }

    public final b H(int i7) {
        ArrayList arrayList = this.f364d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) arrayList.get(i10);
            if (bVar.f368b == i7) {
                return bVar;
            }
        }
        return null;
    }

    @Override // A4.c
    public final String toString() {
        return c.g(this.f368b) + " leaves: " + Arrays.toString(this.f364d.toArray()) + " containers: " + Arrays.toString(this.f365e.toArray());
    }
}
