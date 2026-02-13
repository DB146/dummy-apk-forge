package I7;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class m implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final long f5253a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5254b;

    public m(int i7) {
        int i10 = i7 + 1;
        int floor = (int) Math.floor(Math.log(i10) / Math.log(2.0d));
        this.f5254b = floor;
        this.f5253a = (((long) Math.pow(2.0d, floor)) - 1) & i10;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new l(this);
    }
}
