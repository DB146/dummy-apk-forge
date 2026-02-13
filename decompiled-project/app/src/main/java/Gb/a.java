package Gb;

import java.util.Comparator;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class a implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final a f4452b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f4453c = new a(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4454a;

    public /* synthetic */ a(int i7) {
        this.f4454a = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f4454a) {
            case 0:
                Comparable a9 = (Comparable) obj;
                Comparable b2 = (Comparable) obj2;
                l.e(a9, "a");
                l.e(b2, "b");
                return a9.compareTo(b2);
            default:
                Comparable a10 = (Comparable) obj;
                Comparable b10 = (Comparable) obj2;
                l.e(a10, "a");
                l.e(b10, "b");
                return b10.compareTo(a10);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f4454a) {
            case 0:
                return f4453c;
            default:
                return f4452b;
        }
    }
}
